package androidx.compose.ui.node;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aO\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aW\u0010\u0015\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001e\u001a?\u0010&\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0016H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010*\u001a\u00020\n*\u00020\u00162\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0000H\u0002¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "cb", "Landroidx/compose/ui/node/IntStack;", "calculateDiff", "(IILandroidx/compose/ui/node/DiffCallback;)Landroidx/compose/ui/node/IntStack;", "diagonals", "callback", "", "applyDiff", "(Landroidx/compose/ui/node/IntStack;Landroidx/compose/ui/node/DiffCallback;)V", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Landroidx/compose/ui/node/CenteredArray;", "forward", "backward", "", "snake", "", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "midPoint", "d", "forward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "backward-4l5_RBY", "startX", "startY", "endX", "endY", "reverse", "data", "fillSnake", "(IIIIZ[I)V", "i", "j", "swap", "([III)V", "ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < intStack.getLastIndex()) {
            int i5 = i + 2;
            int i6 = intStack.get(i) - intStack.get(i5);
            int i21 = intStack.get(i + 1) - intStack.get(i5);
            int i22 = intStack.get(i5);
            i += 3;
            while (i2 < i6) {
                diffCallback.remove(i3, i2);
                i2++;
            }
            while (i3 < i21) {
                diffCallback.insert(i3);
                i3++;
            }
            while (true) {
                int i32 = i22 - 1;
                if (i22 > 0) {
                    diffCallback.same(i2, i3);
                    i2++;
                    i3++;
                    i22 = i32;
                }
            }
        }
    }

    /* JADX INFO: renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m2682backward4l5_RBY(int i, int i2, int i3, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM2607getimpl;
        int i21;
        int i22;
        int i32 = (i2 - i) - (i5 - i3);
        boolean z = (i32 & 1) == 0;
        int i33 = -i6;
        for (int i43 = i33; i43 <= i6; i43 += 2) {
            if (i43 == i33 || (i43 != i6 && CenteredArray.m2607getimpl(iArr2, i43 + 1) < CenteredArray.m2607getimpl(iArr2, i43 - 1))) {
                iM2607getimpl = CenteredArray.m2607getimpl(iArr2, i43 + 1);
                i21 = iM2607getimpl;
            } else {
                iM2607getimpl = CenteredArray.m2607getimpl(iArr2, i43 - 1);
                i21 = iM2607getimpl - 1;
            }
            int i59 = i5 - ((i2 - i21) - i43);
            int i66 = ((i6 != 0 ? 1 : 0) & (i21 == iM2607getimpl ? 1 : 0)) + i59;
            while (i21 > i && i59 > i3) {
                if (!diffCallback.areItemsTheSame(i21 - 1, i59 - 1)) {
                    break;
                }
                i21--;
                i59--;
            }
            CenteredArray.m2609setimpl(iArr2, i43, i21);
            if (z && (i22 = i32 - i43) >= i33 && i22 <= i6) {
                if (CenteredArray.m2607getimpl(iArr, i22) >= i21) {
                    fillSnake(i21, i59, iM2607getimpl, i66, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i, int i2, DiffCallback diffCallback) {
        char c2 = 1;
        int i3 = ((i + i2) + 1) / 2;
        IntStack intStack = new IntStack(i3 * 3);
        IntStack intStack2 = new IntStack(i3 * 4);
        intStack2.pushRange(0, i, 0, i2);
        int i5 = (i3 * 2) + 1;
        int[] iArrM2606constructorimpl = CenteredArray.m2606constructorimpl(new int[i5]);
        int[] iArrM2606constructorimpl2 = CenteredArray.m2606constructorimpl(new int[i5]);
        int[] iArrM2736constructorimpl = Snake.m2736constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            int[] iArr = iArrM2736constructorimpl;
            if (m2684midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback, iArrM2606constructorimpl, iArrM2606constructorimpl2, iArrM2736constructorimpl)) {
                char c3 = c2;
                if (Math.min(iArr[2] - iArr[0], iArr[3] - iArr[c2]) > 0) {
                    Snake.m2735addDiagonalToStackimpl(iArr, intStack);
                }
                intStack2.pushRange(iPop4, iArr[0], iPop2, iArr[c3]);
                intStack2.pushRange(iArr[2], iPop3, iArr[3], iPop);
                iArrM2736constructorimpl = iArr;
                c2 = c3;
            } else {
                iArrM2736constructorimpl = iArr;
            }
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i, i2, 0);
        return intStack;
    }

    public static final void executeDiff(int i, int i2, @NotNull DiffCallback diffCallback) {
        applyDiff(calculateDiff(i, i2, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i, int i2, int i3, int i5, boolean z, @NotNull int[] iArr) {
        if (iArr.length < 5) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i5;
        iArr[4] = z ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m2683forward4l5_RBY(int i, int i2, int i3, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM2607getimpl;
        int i21;
        boolean z;
        int i22 = (i2 - i) - (i5 - i3);
        boolean z3 = true;
        boolean z4 = (Math.abs(i22) & 1) == 1;
        int i32 = -i6;
        int i33 = i32;
        while (i33 <= i6) {
            if (i33 == i32 || (i33 != i6 && CenteredArray.m2607getimpl(iArr, i33 + 1) > CenteredArray.m2607getimpl(iArr, i33 - 1))) {
                iM2607getimpl = CenteredArray.m2607getimpl(iArr, i33 + 1);
                i21 = iM2607getimpl;
            } else {
                iM2607getimpl = CenteredArray.m2607getimpl(iArr, i33 - 1);
                i21 = iM2607getimpl + 1;
            }
            int i43 = ((i21 - i) + i3) - i33;
            int i59 = i43 - ((i6 != 0 ? z3 : 0) & (i21 == iM2607getimpl ? z3 : 0));
            while (i21 < i2 && i43 < i5) {
                if (!diffCallback.areItemsTheSame(i21, i43)) {
                    break;
                }
                i21++;
                i43++;
            }
            CenteredArray.m2609setimpl(iArr, i33, i21);
            if (z4) {
                int i66 = i22 - i33;
                z = z3;
                if (i66 >= i32 + 1 && i66 <= i6 - 1) {
                    if (CenteredArray.m2607getimpl(iArr2, i66) <= i21) {
                        fillSnake(iM2607getimpl, i59, i21, i43, false, iArr3);
                        return z;
                    }
                }
                i33 += 2;
                z3 = z;
            } else {
                z = z3;
            }
            i33 += 2;
            z3 = z;
        }
        return false;
    }

    /* JADX INFO: renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m2684midPointq5eDKzI(int i, int i2, int i3, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6 = i2 - i;
        int i21 = i5 - i3;
        if (i6 >= 1 && i21 >= 1) {
            int i22 = ((i6 + i21) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m2609setimpl(iArr4, 1, i);
            int[] iArr5 = iArr2;
            CenteredArray.m2609setimpl(iArr5, 1, i2);
            int i32 = 0;
            while (i32 < i22) {
                if (m2683forward4l5_RBY(i, i2, i3, i5, diffCallback, iArr4, iArr5, i32, iArr3) || m2682backward4l5_RBY(i, i2, i3, i5, diffCallback, iArr, iArr2, i32, iArr3)) {
                    return true;
                }
                i32++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i, int i2) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }
}
