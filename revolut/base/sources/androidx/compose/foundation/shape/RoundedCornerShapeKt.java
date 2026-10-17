package androidx.compose.foundation.shape;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0003\u0010\u000b\u001a5\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/shape/CornerSize;", "corner", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", "size", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "(I)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RoundedCornerShapeKt {

    @NotNull
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(@NotNull CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    @NotNull
    /* JADX INFO: renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m968RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m967CornerSize0680j_4(f));
    }

    @NotNull
    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m969RoundedCornerShapea9UjIt4(float f, float f4, float f5, float f6) {
        return new RoundedCornerShape(CornerSizeKt.m967CornerSize0680j_4(f), CornerSizeKt.m967CornerSize0680j_4(f4), CornerSizeKt.m967CornerSize0680j_4(f5), CornerSizeKt.m967CornerSize0680j_4(f6));
    }

    /* JADX INFO: renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m970RoundedCornerShapea9UjIt4$default(float f, float f4, float f5, float f6, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        if ((i & 4) != 0) {
            f5 = Dp.m3297constructorimpl(0);
        }
        if ((i & 8) != 0) {
            f6 = Dp.m3297constructorimpl(0);
        }
        return m969RoundedCornerShapea9UjIt4(f, f4, f5, f6);
    }

    @NotNull
    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    @NotNull
    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }
}
