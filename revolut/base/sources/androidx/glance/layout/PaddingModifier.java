package androidx.glance.layout;

import android.content.res.Resources;
import androidx.compose.ui.unit.Dp;
import androidx.glance.GlanceModifier;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b$\u0010\u001f¨\u0006%"}, d2 = {"Landroidx/glance/layout/PaddingModifier;", "Landroidx/glance/GlanceModifier$Element;", "Landroidx/glance/layout/PaddingDimension;", "left", "start", "top", "right", "end", "bottom", "<init>", "(Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;Landroidx/glance/layout/PaddingDimension;)V", "other", "plus", "(Landroidx/glance/layout/PaddingModifier;)Landroidx/glance/layout/PaddingModifier;", "Landroid/content/res/Resources;", "resources", "Landroidx/glance/layout/PaddingInDp;", "toDp", "(Landroid/content/res/Resources;)Landroidx/glance/layout/PaddingInDp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/glance/layout/PaddingDimension;", "getLeft", "()Landroidx/glance/layout/PaddingDimension;", "getStart", "getTop", "getRight", "getEnd", "getBottom", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingModifier implements GlanceModifier.Element {

    @NotNull
    private final PaddingDimension bottom;

    @NotNull
    private final PaddingDimension end;

    @NotNull
    private final PaddingDimension left;

    @NotNull
    private final PaddingDimension right;

    @NotNull
    private final PaddingDimension start;

    @NotNull
    private final PaddingDimension top;

    public PaddingModifier(@NotNull PaddingDimension paddingDimension, @NotNull PaddingDimension paddingDimension2, @NotNull PaddingDimension paddingDimension3, @NotNull PaddingDimension paddingDimension4, @NotNull PaddingDimension paddingDimension5, @NotNull PaddingDimension paddingDimension6) {
        this.left = paddingDimension;
        this.start = paddingDimension2;
        this.top = paddingDimension3;
        this.right = paddingDimension4;
        this.end = paddingDimension5;
        this.bottom = paddingDimension6;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingModifier)) {
            return false;
        }
        PaddingModifier paddingModifier = (PaddingModifier) other;
        return Intrinsics.f(this.left, paddingModifier.left) && Intrinsics.f(this.start, paddingModifier.start) && Intrinsics.f(this.top, paddingModifier.top) && Intrinsics.f(this.right, paddingModifier.right) && Intrinsics.f(this.end, paddingModifier.end) && Intrinsics.f(this.bottom, paddingModifier.bottom);
    }

    public int hashCode() {
        return this.bottom.hashCode() + ((this.end.hashCode() + ((this.right.hashCode() + ((this.top.hashCode() + ((this.start.hashCode() + (this.left.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final PaddingModifier plus(@NotNull PaddingModifier other) {
        return new PaddingModifier(this.left.plus(other.left), this.start.plus(other.start), this.top.plus(other.top), this.right.plus(other.right), this.end.plus(other.end), this.bottom.plus(other.bottom));
    }

    @NotNull
    public final PaddingInDp toDp(@NotNull Resources resources) {
        return new PaddingInDp(Dp.m3297constructorimpl(PaddingKt.toDp(this.left.getResourceIds(), resources) + this.left.getDp()), Dp.m3297constructorimpl(PaddingKt.toDp(this.start.getResourceIds(), resources) + this.start.getDp()), Dp.m3297constructorimpl(PaddingKt.toDp(this.top.getResourceIds(), resources) + this.top.getDp()), Dp.m3297constructorimpl(PaddingKt.toDp(this.right.getResourceIds(), resources) + this.right.getDp()), Dp.m3297constructorimpl(PaddingKt.toDp(this.end.getResourceIds(), resources) + this.end.getDp()), Dp.m3297constructorimpl(PaddingKt.toDp(this.bottom.getResourceIds(), resources) + this.bottom.getDp()), null);
    }

    @NotNull
    public String toString() {
        return "PaddingModifier(left=" + this.left + ", start=" + this.start + ", top=" + this.top + ", right=" + this.right + ", end=" + this.end + ", bottom=" + this.bottom + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ PaddingModifier(PaddingDimension paddingDimension, PaddingDimension paddingDimension2, PaddingDimension paddingDimension3, PaddingDimension paddingDimension4, PaddingDimension paddingDimension5, PaddingDimension paddingDimension6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension, (i & 2) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension2, (i & 4) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension3, (i & 8) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension4, (i & 16) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension5, (i & 32) != 0 ? new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null) : paddingDimension6);
    }
}
