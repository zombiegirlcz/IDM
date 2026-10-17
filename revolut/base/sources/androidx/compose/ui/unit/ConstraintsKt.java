package androidx.compose.ui.unit;

import com.google.android.gms.internal.mlkit_vision_face.a;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0019\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0018*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u0016\u001a\u001b\u0010\u001d\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010 \u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u001f\u0010\u001c\u001a'\u0010%\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u0000H\u0007¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"", "widthVal", "heightVal", "", "throwInvalidConstraintException", "(II)V", "size", "", "throwInvalidConstraintsSizeException", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "bitsNeedForSizeUnchecked", "(I)I", "Constraints", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "offset", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ConstraintsKt {
    public static final long Constraints(int i, int i2, int i3, int i5) {
        if (!((i3 >= 0) & (i2 >= i) & (i5 >= i3) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i2, i3, i5);
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i5, int i6, Object obj2) {
        if ((i6 & 1) != 0) {
            i = 0;
        }
        if ((i6 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i6 & 4) != 0) {
            i3 = 0;
        }
        if ((i6 & 8) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i5);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < 262143 ? 18 : 255;
    }

    /* JADX INFO: renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m3289constrain4WqzIAM(long j2, long j3) {
        int i = (int) (j3 >> 32);
        int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        if (i < iM3281getMinWidthimpl) {
            i = iM3281getMinWidthimpl;
        }
        if (i <= iM3279getMaxWidthimpl) {
            iM3279getMaxWidthimpl = i;
        }
        int i2 = (int) (j3 & BodyPartID.bodyIdMax);
        int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        if (i2 < iM3280getMinHeightimpl) {
            i2 = iM3280getMinHeightimpl;
        }
        if (i2 <= iM3278getMaxHeightimpl) {
            iM3278getMaxHeightimpl = i2;
        }
        return IntSize.m3351constructorimpl((((long) iM3279getMaxWidthimpl) << 32) | (((long) iM3278getMaxHeightimpl) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m3290constrainN9IONVI(long j2, long j3) {
        int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        int iM3281getMinWidthimpl2 = Constraints.m3281getMinWidthimpl(j3);
        if (iM3281getMinWidthimpl2 < iM3281getMinWidthimpl) {
            iM3281getMinWidthimpl2 = iM3281getMinWidthimpl;
        }
        if (iM3281getMinWidthimpl2 > iM3279getMaxWidthimpl) {
            iM3281getMinWidthimpl2 = iM3279getMaxWidthimpl;
        }
        int iM3279getMaxWidthimpl2 = Constraints.m3279getMaxWidthimpl(j3);
        if (iM3279getMaxWidthimpl2 >= iM3281getMinWidthimpl) {
            iM3281getMinWidthimpl = iM3279getMaxWidthimpl2;
        }
        if (iM3281getMinWidthimpl <= iM3279getMaxWidthimpl) {
            iM3279getMaxWidthimpl = iM3281getMinWidthimpl;
        }
        int iM3280getMinHeightimpl2 = Constraints.m3280getMinHeightimpl(j3);
        if (iM3280getMinHeightimpl2 < iM3280getMinHeightimpl) {
            iM3280getMinHeightimpl2 = iM3280getMinHeightimpl;
        }
        if (iM3280getMinHeightimpl2 > iM3278getMaxHeightimpl) {
            iM3280getMinHeightimpl2 = iM3278getMaxHeightimpl;
        }
        int iM3278getMaxHeightimpl2 = Constraints.m3278getMaxHeightimpl(j3);
        if (iM3278getMaxHeightimpl2 >= iM3280getMinHeightimpl) {
            iM3280getMinHeightimpl = iM3278getMaxHeightimpl2;
        }
        if (iM3280getMinHeightimpl <= iM3278getMaxHeightimpl) {
            iM3278getMaxHeightimpl = iM3280getMinHeightimpl;
        }
        return Constraints(iM3281getMinWidthimpl2, iM3279getMaxWidthimpl, iM3280getMinHeightimpl2, iM3278getMaxHeightimpl);
    }

    /* JADX INFO: renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m3291constrainHeightK40F9xA(long j2, int i) {
        int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2);
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        if (i < iM3280getMinHeightimpl) {
            i = iM3280getMinHeightimpl;
        }
        return i > iM3278getMaxHeightimpl ? iM3278getMaxHeightimpl : i;
    }

    /* JADX INFO: renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m3292constrainWidthK40F9xA(long j2, int i) {
        int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2);
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        if (i < iM3281getMinWidthimpl) {
            i = iM3281getMinWidthimpl;
        }
        return i > iM3279getMaxWidthimpl ? iM3279getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i2, int i3, int i5) {
        int i6 = i5 == Integer.MAX_VALUE ? i3 : i5;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i6);
        int i21 = i2 == Integer.MAX_VALUE ? i : i2;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i21);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i21, i6);
        }
        int i22 = i2 + 1;
        int i32 = i5 + 1;
        int i33 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m3269constructorimpl((((long) (i22 & (~(i22 >> 31)))) << 33) | ((long) ((i33 >> 1) + (i33 & 1))) | (((long) i) << 2) | (((long) i3) << (iBitsNeedForSizeUnchecked2 + 2)) | (((long) (i32 & (~(i32 >> 31)))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m3293offsetNN6EwU(long j2, int i, int i2) {
        int iM3281getMinWidthimpl = Constraints.m3281getMinWidthimpl(j2) + i;
        if (iM3281getMinWidthimpl < 0) {
            iM3281getMinWidthimpl = 0;
        }
        int iM3279getMaxWidthimpl = Constraints.m3279getMaxWidthimpl(j2);
        if (iM3279getMaxWidthimpl != Integer.MAX_VALUE && (iM3279getMaxWidthimpl = iM3279getMaxWidthimpl + i) < 0) {
            iM3279getMaxWidthimpl = 0;
        }
        int iM3280getMinHeightimpl = Constraints.m3280getMinHeightimpl(j2) + i2;
        if (iM3280getMinHeightimpl < 0) {
            iM3280getMinHeightimpl = 0;
        }
        int iM3278getMaxHeightimpl = Constraints.m3278getMaxHeightimpl(j2);
        return Constraints(iM3281getMinWidthimpl, iM3279getMaxWidthimpl, iM3280getMinHeightimpl, (iM3278getMaxHeightimpl == Integer.MAX_VALUE || (iM3278getMaxHeightimpl = iM3278getMaxHeightimpl + i2) >= 0) ? iM3278getMaxHeightimpl : 0);
    }

    /* JADX INFO: renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m3294offsetNN6EwU$default(long j2, int i, int i2, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m3293offsetNN6EwU(j2, i, i2);
    }

    public static final void throwInvalidConstraintException(int i, int i2) {
        throw new IllegalArgumentException(a.m("Can't represent a width of ", i, i2, " and height of ", " in Constraints"));
    }

    @NotNull
    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(j6.a.l(i, "Can't represent a size of ", " in Constraints"));
    }
}
