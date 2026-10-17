package androidx.compose.ui.spatial;

import com.google.common.primitives.Longs;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jg\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012JU\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J=\u0010#\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J;\u0010)\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042$\u0010(\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0010¢\u0006\u0004\b.\u0010\u0003J\r\u0010/\u001a\u00020\u0010¢\u0006\u0004\b/\u0010\u0003J'\u00104\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J'\u00109\u001a\u00020\u00102\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010:R\u0016\u0010;\u001a\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b=\u0010<R\u0016\u0010>\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "", "value", "l", "t", "r", "b", "parentId", "", "focusable", "gesturable", "hasCallbacks", "parentIndexInRectList", "", "insert", "(IIIIIIZZZI)V", "offsetFromParentX", "offsetFromParentY", "width", "height", "insertBasedOnParentOffset", "(IIIIIIZZZ)V", "remove", "(I)Z", "update", "(IIIII)Z", "updateFlagsFor", "(IZZ)Z", "updateHasCallbacks", "(IZ)Z", "move", "(IIIII)V", "moveBasedOnParentOffset", "(IIIIII)V", "markUpdated", "(I)V", "Lkotlin/Function4;", "block", "withRect", "(ILoim/n;)Z", "", "getTopLeft", "(I)J", "defragment", "clearUpdated", "actualSize", "currentSize", "", "currentItems", "resizeStorage", "(II[J)V", "stackMeta", "deltaX", "deltaY", "updateSubhierarchy", "(JII)V", "items", "[J", "stack", "itemsSize", "I", "getSize", "()I", "size", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RectList {
    public int itemsSize;

    @NotNull
    public long[] items = new long[192];

    @NotNull
    public long[] stack = new long[192];

    public static /* synthetic */ void insert$default(RectList rectList, int i, int i2, int i3, int i5, int i6, int i21, boolean z, boolean z3, boolean z4, int i22, int i32, Object obj2) {
        if ((i32 & 32) != 0) {
            i21 = -1;
        }
        if ((i32 & 64) != 0) {
            z = false;
        }
        if ((i32 & 128) != 0) {
            z3 = false;
        }
        if ((i32 & 256) != 0) {
            z4 = false;
        }
        if ((i32 & 512) != 0) {
            i22 = -1;
        }
        rectList.insert(i, i2, i3, i5, i6, i21, z, z3, z4, i22);
    }

    private final void resizeStorage(int actualSize, int currentSize, long[] currentItems) {
        int iMax = Math.max(actualSize * 2, currentSize + 3);
        long[] jArrCopyOf = Arrays.copyOf(currentItems, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        this.items = jArrCopyOf;
        long[] jArrCopyOf2 = Arrays.copyOf(this.stack, iMax);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf2, "copyOf(...)");
        this.stack = jArrCopyOf2;
    }

    private final void updateSubhierarchy(long stackMeta, int deltaX, int deltaY) {
        int i;
        char c2;
        char c3;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        getSize();
        jArr2[0] = stackMeta;
        int i2 = 1;
        while (i2 > 0) {
            i2--;
            long j2 = jArr2[i2];
            int i3 = 33554431;
            int i5 = ((int) j2) & 33554431;
            char c5 = 25;
            int i6 = ((int) (j2 >> 25)) & 33554431;
            char c6 = '2';
            int i21 = ((int) (j2 >> 50)) & 1023;
            int i22 = i21 == 1023 ? this.itemsSize : (i21 * 3) + i6;
            if (i6 < 0) {
                return;
            }
            while (i6 < jArr.length - 2 && i6 < i22) {
                int i32 = i6 + 2;
                long j3 = jArr[i32];
                if ((((int) (j3 >> c5)) & i3) == i5) {
                    long j5 = jArr[i6];
                    int i33 = i6 + 1;
                    i = i3;
                    c2 = c5;
                    long j16 = jArr[i33];
                    c3 = c6;
                    jArr[i6] = (((long) (((int) j5) + deltaY)) & BodyPartID.bodyIdMax) | (((long) (((int) (j5 >> 32)) + deltaX)) << 32);
                    jArr[i33] = (((long) (((int) j16) + deltaY)) & BodyPartID.bodyIdMax) | (((long) (((int) (j16 >> 32)) + deltaX)) << 32);
                    jArr[i32] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c3)) & 1023) > 0) {
                        jArr2[i2] = (RectListKt.getEverythingButParentId() & j3) | (((long) ((i6 + 3) & i)) << c2);
                        i2++;
                    }
                } else {
                    i = i3;
                    c2 = c5;
                    c3 = c6;
                }
                i6 += 3;
                i3 = i;
                c5 = c2;
                c6 = c3;
            }
        }
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-1152921504606846977L);
        }
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i5 = i3 + 2;
            if (jArr[i5] != RectListKt.getTombStone()) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i5];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final int getSize() {
        return this.itemsSize / 3;
    }

    public final long getTopLeft(int value) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                return jArr[i3];
            }
        }
        return Long.MAX_VALUE;
    }

    public final void insert(int value, int l2, int t2, int r2, int b4, int parentId, boolean focusable, boolean gesturable, boolean hasCallbacks, int parentIndexInRectList) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            resizeStorage(length, i, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i] = (((long) l2) << 32) | (((long) t2) & BodyPartID.bodyIdMax);
        jArr2[i + 1] = (((long) r2) << 32) | (((long) b4) & BodyPartID.bodyIdMax);
        int i3 = parentId & 33554431;
        jArr2[i + 2] = ((hasCallbacks ? 1L : 0L) << 63) | ((gesturable ? 1L : 0L) << 62) | ((focusable ? 1L : 0L) << 61) | (((long) 1) << 60) | (((long) Math.min(0, 1023)) << 50) | (((long) i3) << 25) | ((long) (value & 33554431));
        if (parentId < 0) {
            return;
        }
        for (int i5 = parentIndexInRectList != -1 ? parentIndexInRectList : i - 3; i5 >= 0; i5 -= 3) {
            int i6 = i5 + 2;
            long j2 = jArr2[i6];
            if ((((int) j2) & 33554431) == i3) {
                jArr2[i6] = (j2 & RectListKt.getEverythingButLastChildOffset()) | (((long) Math.min((i - i5) / 3, 1023)) << 50);
                return;
            }
        }
    }

    public final void insertBasedOnParentOffset(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height, boolean focusable, boolean gesturable, boolean hasCallbacks) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == parentId) {
                long j2 = jArr[i3];
                int i5 = ((int) (j2 >> 32)) + offsetFromParentX;
                int i6 = ((int) j2) + offsetFromParentY;
                insert(i, i5, i6, i5 + width, i6 + height, parentId, focusable, gesturable, hasCallbacks, i3);
                return;
            }
        }
    }

    public final void markUpdated(int value) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            long j2 = jArr[i5];
            if ((((int) j2) & 33554431) == i) {
                jArr[i5] = (((j2 >> 63) & 1) << 60) | j2;
                return;
            }
        }
    }

    public final void move(int value, int l2, int t2, int r2, int b4) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            long j2 = jArr[i5];
            if ((((int) j2) & 33554431) == i) {
                long j3 = jArr[i3];
                jArr[i3] = (((long) t2) & BodyPartID.bodyIdMax) | (((long) l2) << 32);
                int i6 = i3;
                jArr[i3 + 1] = (((long) b4) & BodyPartID.bodyIdMax) | (((long) r2) << 32);
                jArr[i5] = (((j2 >> 63) & 1) << 60) | j2;
                int i21 = l2 - ((int) (j3 >> 32));
                int i22 = t2 - ((int) j3);
                if ((i21 != 0) || (i22 != 0)) {
                    updateSubhierarchy((RectListKt.getEverythingButParentId() & j2) | (((long) ((i6 + 3) & 33554431)) << 25), i21, i22);
                    return;
                }
                return;
            }
        }
    }

    public final void moveBasedOnParentOffset(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height) {
        int i;
        long j2;
        int i2 = 33554431;
        int i3 = value & 33554431;
        int i5 = this.itemsSize;
        int i6 = 0;
        for (long[] jArr = this.items; i6 < jArr.length - 2 && i6 < i5; jArr = jArr) {
            if ((((int) jArr[i6 + 2]) & i2) == parentId) {
                long j3 = jArr[i6];
                int i21 = ((int) (j3 >> 32)) + offsetFromParentX;
                int i22 = ((int) j3) + offsetFromParentY;
                int i32 = i21 + width;
                int i33 = i22 + height;
                do {
                    i6 += 3;
                    if (i6 >= jArr.length - 2 || i6 >= i5) {
                        break;
                    }
                    i = i6 + 2;
                    j2 = jArr[i];
                } while ((((int) j2) & i2) != i3);
                int i43 = i2;
                long j5 = jArr[i6];
                int i59 = i21 - ((int) (j5 >> 32));
                int i66 = i22 - ((int) j5);
                long[] jArr2 = jArr;
                jArr2[i6] = (((long) i22) & BodyPartID.bodyIdMax) | (((long) i21) << 32);
                jArr2[i6 + 1] = (((long) i32) << 32) | (((long) i33) & BodyPartID.bodyIdMax);
                jArr2[i] = (((j2 >> 63) & 1) << 60) | j2;
                if (i59 == 0 && i66 == 0) {
                    return;
                }
                updateSubhierarchy((RectListKt.getEverythingButParentId() & j2) | (((long) ((i6 + 3) & i43)) << 25), i59, i66);
                return;
            }
            i6 += 3;
            i2 = i2;
        }
    }

    public final boolean remove(int value) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            if ((((int) jArr[i5]) & 33554431) == i) {
                jArr[i3] = -1;
                jArr[i3 + 1] = -1;
                jArr[i5] = RectListKt.getTombStone();
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l2, int t2, int r2, int b4) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            long j2 = jArr[i5];
            if ((((int) j2) & 33554431) == i) {
                jArr[i3] = (((long) l2) << 32) | (((long) t2) & BodyPartID.bodyIdMax);
                jArr[i3 + 1] = (((long) r2) << 32) | (((long) b4) & BodyPartID.bodyIdMax);
                jArr[i5] = (((j2 >> 63) & 1) << 60) | j2;
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int value, boolean focusable, boolean gesturable) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            long j2 = jArr[i5];
            if ((((int) j2) & 33554431) == i) {
                jArr[i5] = ((focusable ? 1L : 0L) * 2305843009213693952L) | ((-6917529027641081857L) & j2) | ((gesturable ? 1L : 0L) * Longs.MAX_POWER_OF_TWO);
                return true;
            }
        }
        return false;
    }

    public final boolean updateHasCallbacks(int value, boolean hasCallbacks) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            int i5 = i3 + 2;
            long j2 = jArr[i5];
            if ((((int) j2) & 33554431) == i) {
                jArr[i5] = ((hasCallbacks ? 1L : 0L) * Long.MIN_VALUE) | (8070450532247928831L & j2) | ((hasCallbacks ? 1L : 0L) * 1152921504606846976L);
                return true;
            }
        }
        return false;
    }

    public final boolean withRect(int value, @NotNull n block) {
        int i = value & 33554431;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                long j2 = jArr[i3];
                long j3 = jArr[i3 + 1];
                block.invoke(Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2), Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3));
                return true;
            }
        }
        return false;
    }
}
