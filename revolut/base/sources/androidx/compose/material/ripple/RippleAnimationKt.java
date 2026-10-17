package androidx.compose.material.ripple;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "bounded", "Landroidx/compose/ui/geometry/Size;", "size", "", "getRippleEndRadius-cSwnlzA", "(Landroidx/compose/ui/unit/Density;ZJ)F", "getRippleEndRadius", "Landroidx/compose/ui/unit/Dp;", "BoundedRippleExtraRadius", "F", "material-ripple"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class RippleAnimationKt {
    private static final float BoundedRippleExtraRadius = Dp.m3297constructorimpl(10);

    /* JADX INFO: renamed from: getRippleEndRadius-cSwnlzA, reason: not valid java name */
    public static final float m1284getRippleEndRadiuscSwnlzA(@NotNull Density density, boolean z, long j2) {
        float fM1833getDistanceimpl = Offset.m1833getDistanceimpl(OffsetKt.Offset(Size.m1869getWidthimpl(j2), Size.m1867getHeightimpl(j2))) / 2.0f;
        return z ? density.mo768toPx0680j_4(BoundedRippleExtraRadius) + fM1833getDistanceimpl : fM1833getDistanceimpl;
    }
}
