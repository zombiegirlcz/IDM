package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes17.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class CompactHashing {
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 256;
    static final int DEFAULT_SIZE = 3;
    static final int HASH_TABLE_BITS_MASK = 31;
    private static final int HASH_TABLE_BITS_MAX_BITS = 5;
    static final int MAX_SIZE = 1073741823;
    private static final int MIN_HASH_TABLE_SIZE = 4;
    static final int MODIFICATION_COUNT_INCREMENT = 32;
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 65536;
    static final byte UNSET = 0;

    private CompactHashing() {
    }

    public static Object createTable(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(a0.d.n("must be power of 2 between 2^1 and 2^30: ", i));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static int getHashPrefix(int i, int i2) {
        return i & (~i2);
    }

    public static int getNext(int i, int i2) {
        return i & i2;
    }

    public static int maskCombine(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int newCapacity(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int remove(Object obj2, Object obj3, int i, Object obj4, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iSmearedHash = Hashing.smearedHash(obj2);
        int i5 = iSmearedHash & i;
        int iTableGet = tableGet(obj4, i5);
        if (iTableGet == 0) {
            return -1;
        }
        int hashPrefix = getHashPrefix(iSmearedHash, i);
        int i6 = -1;
        while (true) {
            i2 = iTableGet - 1;
            i3 = iArr[i2];
            if (getHashPrefix(i3, i) == hashPrefix && Objects.equal(obj2, objArr[i2]) && (objArr2 == null || Objects.equal(obj3, objArr2[i2]))) {
                break;
            }
            int next = getNext(i3, i);
            if (next == 0) {
                return -1;
            }
            i6 = i2;
            iTableGet = next;
        }
        int next2 = getNext(i3, i);
        if (i6 == -1) {
            tableSet(obj4, i5, next2);
            return i2;
        }
        iArr[i6] = maskCombine(iArr[i6], next2, i);
        return i2;
    }

    public static void tableClear(Object obj2) {
        if (obj2 instanceof byte[]) {
            Arrays.fill((byte[]) obj2, (byte) 0);
        } else if (obj2 instanceof short[]) {
            Arrays.fill((short[]) obj2, (short) 0);
        } else {
            Arrays.fill((int[]) obj2, 0);
        }
    }

    public static int tableGet(Object obj2, int i) {
        return obj2 instanceof byte[] ? ((byte[]) obj2)[i] & UnsignedBytes.MAX_VALUE : obj2 instanceof short[] ? ((short[]) obj2)[i] & HPKE.aead_EXPORT_ONLY : ((int[]) obj2)[i];
    }

    public static void tableSet(Object obj2, int i, int i2) {
        if (obj2 instanceof byte[]) {
            ((byte[]) obj2)[i] = (byte) i2;
        } else if (obj2 instanceof short[]) {
            ((short[]) obj2)[i] = (short) i2;
        } else {
            ((int[]) obj2)[i] = i2;
        }
    }

    public static int tableSize(int i) {
        return Math.max(4, Hashing.closedTableSize(i + 1, 1.0d));
    }
}
