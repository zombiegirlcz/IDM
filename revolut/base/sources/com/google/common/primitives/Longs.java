package com.google.common.primitives;

import a0.d;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Converter;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class Longs {
    public static final int BYTES = 8;
    public static final long MAX_POWER_OF_TWO = 4611686018427387904L;

    public static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < 10; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 < 26; i2++) {
                byte b4 = (byte) (i2 + 10);
                bArr[i2 + 65] = b4;
                bArr[i2 + 97] = b4;
            }
            asciiDigits = bArr;
        }

        private AsciiDigits() {
        }

        public static int digit(char c2) {
            if (c2 < 128) {
                return asciiDigits[c2];
            }
            return -1;
        }
    }

    public enum LexicographicalComparator implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Longs.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int iMin = Math.min(jArr.length, jArr2.length);
            for (int i = 0; i < iMin; i++) {
                int iCompare = Long.compare(jArr[i], jArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    @GwtCompatible
    public static class LongArrayAsList extends AbstractList<Long> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final long[] array;

        /* JADX INFO: renamed from: end, reason: collision with root package name */
        final int f49303end;
        final int start;

        public LongArrayAsList(long[] jArr) {
            this(jArr, 0, jArr.length);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj2) {
            return (obj2 instanceof Long) && Longs.indexOf(this.array, ((Long) obj2).longValue(), this.start, this.f49303end) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj2) {
            if (obj2 == this) {
                return true;
            }
            if (!(obj2 instanceof LongArrayAsList)) {
                return super.equals(obj2);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj2;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode = 1;
            for (int i = this.start; i < this.f49303end; i++) {
                iHashCode = (iHashCode * 31) + Longs.hashCode(this.array[i]);
            }
            return iHashCode;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj2) {
            int iIndexOf;
            if (!(obj2 instanceof Long) || (iIndexOf = Longs.indexOf(this.array, ((Long) obj2).longValue(), this.start, this.f49303end)) < 0) {
                return -1;
            }
            return iIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj2) {
            int iLastIndexOf;
            if (!(obj2 instanceof Long) || (iLastIndexOf = Longs.lastIndexOf(this.array, ((Long) obj2).longValue(), this.start, this.f49303end)) < 0) {
                return -1;
            }
            return iLastIndexOf - this.start;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f49303end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Long> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.EMPTY_LIST;
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.f49303end);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb6 = new StringBuilder(size() * 10);
            sb6.append('[');
            sb6.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i >= this.f49303end) {
                    sb6.append(']');
                    return sb6.toString();
                }
                sb6.append(", ");
                sb6.append(this.array[i]);
            }
        }

        public LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.f49303end = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Long get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractList, java.util.List
        public Long set(int i, Long l2) {
            Preconditions.checkElementIndex(i, size());
            long[] jArr = this.array;
            int i2 = this.start;
            long j2 = jArr[i2 + i];
            jArr[i2 + i] = ((Long) Preconditions.checkNotNull(l2)).longValue();
            return Long.valueOf(j2);
        }
    }

    public static final class LongConverter extends Converter<String, Long> implements Serializable {
        static final Converter<String, Long> INSTANCE = new LongConverter();
        private static final long serialVersionUID = 1;

        private LongConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        public String toString() {
            return "Longs.stringConverter()";
        }

        @Override // com.google.common.base.Converter
        public String doBackward(Long l2) {
            return l2.toString();
        }

        @Override // com.google.common.base.Converter
        public Long doForward(String str) {
            return Long.decode(str);
        }
    }

    private Longs() {
    }

    public static List<Long> asList(long... jArr) {
        return jArr.length == 0 ? Collections.EMPTY_LIST : new LongArrayAsList(jArr);
    }

    private static int checkNoOverflow(long j2) {
        int i = (int) j2;
        Preconditions.checkArgument(j2 == ((long) i), "the total number of elements (%s) in the arrays must fit in an int", j2);
        return i;
    }

    public static int compare(long j2, long j3) {
        return Long.compare(j2, j3);
    }

    public static long[] concat(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        long[] jArr3 = new long[checkNoOverflow(length)];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static long constrainToRange(long j2, long j3, long j5) {
        Preconditions.checkArgument(j3 <= j5, "min (%s) must be less than or equal to max (%s)", j3, j5);
        return Math.min(Math.max(j2, j3), j5);
    }

    public static boolean contains(long[] jArr, long j2) {
        for (long j3 : jArr) {
            if (j3 == j2) {
                return true;
            }
        }
        return false;
    }

    public static long[] ensureCapacity(long[] jArr, int i, int i2) {
        Preconditions.checkArgument(i >= 0, "Invalid minLength: %s", i);
        Preconditions.checkArgument(i2 >= 0, "Invalid padding: %s", i2);
        return jArr.length < i ? Arrays.copyOf(jArr, i + i2) : jArr;
    }

    public static long fromByteArray(byte[] bArr) {
        Preconditions.checkArgument(bArr.length >= 8, "array too small: %s < %s", bArr.length, 8);
        return fromBytes(bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]);
    }

    public static long fromBytes(byte b4, byte b5, byte b7, byte b13, byte b15, byte b17, byte b40, byte b61) {
        return ((((long) b5) & 255) << 48) | ((((long) b4) & 255) << 56) | ((((long) b7) & 255) << 40) | ((((long) b13) & 255) << 32) | ((((long) b15) & 255) << 24) | ((((long) b17) & 255) << 16) | ((((long) b40) & 255) << 8) | (((long) b61) & 255);
    }

    public static int hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int indexOf(long[] jArr, long j2) {
        return indexOf(jArr, j2, 0, jArr.length);
    }

    public static String join(String str, long... jArr) {
        Preconditions.checkNotNull(str);
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb6 = new StringBuilder(jArr.length * 10);
        sb6.append(jArr[0]);
        for (int i = 1; i < jArr.length; i++) {
            sb6.append(str);
            sb6.append(jArr[i]);
        }
        return sb6.toString();
    }

    public static int lastIndexOf(long[] jArr, long j2) {
        return lastIndexOf(jArr, j2, 0, jArr.length);
    }

    public static Comparator<long[]> lexicographicalComparator() {
        return LexicographicalComparator.INSTANCE;
    }

    public static long max(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j2 = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j3 = jArr[i];
            if (j3 > j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static long min(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0);
        long j2 = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j3 = jArr[i];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public static void reverse(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        reverse(jArr, 0, jArr.length);
    }

    public static void rotate(long[] jArr, int i) {
        rotate(jArr, i, 0, jArr.length);
    }

    public static void sortDescending(long[] jArr) {
        Preconditions.checkNotNull(jArr);
        sortDescending(jArr, 0, jArr.length);
    }

    public static Converter<String, Long> stringConverter() {
        return LongConverter.INSTANCE;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) Preconditions.checkNotNull(array[i])).longValue();
        }
        return jArr;
    }

    public static byte[] toByteArray(long j2) {
        byte[] bArr = new byte[8];
        for (int i = 7; i >= 0; i--) {
            bArr[i] = (byte) (255 & j2);
            j2 >>= 8;
        }
        return bArr;
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int indexOf(long[] jArr, long j2, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lastIndexOf(long[] jArr, long j2, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (jArr[i3] == j2) {
                return i3;
            }
        }
        return -1;
    }

    public static void rotate(long[] jArr, int i, int i2, int i3) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i2, i3, jArr.length);
        if (jArr.length <= 1) {
            return;
        }
        int i5 = i3 - i2;
        int i6 = (-i) % i5;
        if (i6 < 0) {
            i6 += i5;
        }
        int i21 = i6 + i2;
        if (i21 == i2) {
            return;
        }
        reverse(jArr, i2, i21);
        reverse(jArr, i21, i3);
        reverse(jArr, i2, i3);
    }

    public static Long tryParse(String str, int i) {
        if (((String) Preconditions.checkNotNull(str)).isEmpty()) {
            return null;
        }
        if (i < 2 || i > 36) {
            throw new IllegalArgumentException(d.n("radix must be between MIN_RADIX and MAX_RADIX but was ", i));
        }
        int i2 = str.charAt(0) == '-' ? 1 : 0;
        if (i2 == str.length()) {
            return null;
        }
        int i3 = i2 + 1;
        int iDigit = AsciiDigits.digit(str.charAt(i2));
        if (iDigit < 0 || iDigit >= i) {
            return null;
        }
        long j2 = -iDigit;
        long j3 = i;
        long j5 = Long.MIN_VALUE / j3;
        while (i3 < str.length()) {
            int i5 = i3 + 1;
            int iDigit2 = AsciiDigits.digit(str.charAt(i3));
            if (iDigit2 < 0 || iDigit2 >= i || j2 < j5) {
                return null;
            }
            long j16 = j2 * j3;
            long j22 = iDigit2;
            if (j16 < j22 - Long.MIN_VALUE) {
                return null;
            }
            j2 = j16 - j22;
            i3 = i5;
        }
        if (i2 != 0) {
            return Long.valueOf(j2);
        }
        if (j2 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int indexOf(long[] r7, long[] r8) {
        /*
            java.lang.String r0 = "array"
            com.google.common.base.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "target"
            com.google.common.base.Preconditions.checkNotNull(r8, r0)
            int r0 = r8.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = r1
        L10:
            int r2 = r7.length
            int r3 = r8.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2c
            r2 = r1
        L18:
            int r3 = r8.length
            if (r2 >= r3) goto L2b
            int r3 = r0 + r2
            r3 = r7[r3]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L28
            int r0 = r0 + 1
            goto L10
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            return r0
        L2c:
            r7 = -1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Longs.indexOf(long[], long[]):int");
    }

    public static void reverse(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        for (int i3 = i2 - 1; i < i3; i3--) {
            long j2 = jArr[i];
            jArr[i] = jArr[i3];
            jArr[i3] = j2;
            i++;
        }
    }

    public static void sortDescending(long[] jArr, int i, int i2) {
        Preconditions.checkNotNull(jArr);
        Preconditions.checkPositionIndexes(i, i2, jArr.length);
        Arrays.sort(jArr, i, i2);
        reverse(jArr, i, i2);
    }
}
