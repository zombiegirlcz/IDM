package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.database.models.openbanking.d;
import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b\b\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "", "Landroidx/compose/ui/unit/Dp;", "start", "top", "end", "bottom", "", "isLayoutDirectionAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "roundToTouchBoundsExpansion-TW6G1oQ", "(Landroidx/compose/ui/unit/Density;)J", "roundToTouchBoundsExpansion", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getStart-D9Ej5fM", "()F", "getTop-D9Ej5fM", "getEnd-D9Ej5fM", "getBottom-D9Ej5fM", "Z", "()Z", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DpTouchBoundsExpansion {
    private final float bottom;
    private final float end;
    private final boolean isLayoutDirectionAware;
    private final float start;
    private final float top;

    public /* synthetic */ DpTouchBoundsExpansion(float f, float f4, float f5, float f6, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f4, f5, f6, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DpTouchBoundsExpansion)) {
            return false;
        }
        DpTouchBoundsExpansion dpTouchBoundsExpansion = (DpTouchBoundsExpansion) other;
        return Dp.m3299equalsimpl0(this.start, dpTouchBoundsExpansion.start) && Dp.m3299equalsimpl0(this.top, dpTouchBoundsExpansion.top) && Dp.m3299equalsimpl0(this.end, dpTouchBoundsExpansion.end) && Dp.m3299equalsimpl0(this.bottom, dpTouchBoundsExpansion.bottom) && this.isLayoutDirectionAware == dpTouchBoundsExpansion.isLayoutDirectionAware;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isLayoutDirectionAware) + d.a(this.bottom, d.a(this.end, d.a(this.top, Dp.m3300hashCodeimpl(this.start) * 31, 31), 31), 31);
    }

    /* JADX INFO: renamed from: roundToTouchBoundsExpansion-TW6G1oQ, reason: not valid java name */
    public final long m2618roundToTouchBoundsExpansionTW6G1oQ(@NotNull Density density) {
        return TouchBoundsExpansion.m2741constructorimpl(TouchBoundsExpansion.INSTANCE.pack$ui(density.mo762roundToPx0680j_4(this.start), density.mo762roundToPx0680j_4(this.top), density.mo762roundToPx0680j_4(this.end), density.mo762roundToPx0680j_4(this.bottom), this.isLayoutDirectionAware));
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("DpTouchBoundsExpansion(start=");
        d.z(this.start, ", top=", sb6);
        d.z(this.top, ", end=", sb6);
        d.z(this.end, ", bottom=", sb6);
        d.z(this.bottom, ", isLayoutDirectionAware=", sb6);
        return a.x(sb6, this.isLayoutDirectionAware, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    private DpTouchBoundsExpansion(float f, float f4, float f5, float f6, boolean z) {
        this.start = f;
        this.top = f4;
        this.end = f5;
        this.bottom = f6;
        this.isLayoutDirectionAware = z;
        if (!(f >= BitmapDescriptorFactory.HUE_RED)) {
            InlineClassHelperKt.throwIllegalArgumentException("Left must be non-negative");
        }
        if (!(f4 >= BitmapDescriptorFactory.HUE_RED)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be non-negative");
        }
        if (!(f5 >= BitmapDescriptorFactory.HUE_RED)) {
            InlineClassHelperKt.throwIllegalArgumentException("Right must be non-negative");
        }
        if (f6 >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Bottom must be non-negative");
    }
}
