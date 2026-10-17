package androidx.glance.layout;

import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.database.models.openbanking.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BF\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/glance/layout/PaddingInDp;", "", "Landroidx/compose/ui/unit/Dp;", "left", "start", "top", "right", "end", "bottom", "<init>", "(FFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "isRtl", "toAbsolute", "(Z)Landroidx/glance/layout/PaddingInDp;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "F", "getLeft-D9Ej5fM", "()F", "getStart-D9Ej5fM", "getTop-D9Ej5fM", "getRight-D9Ej5fM", "getEnd-D9Ej5fM", "getBottom-D9Ej5fM", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingInDp {
    private final float bottom;
    private final float end;
    private final float left;
    private final float right;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingInDp(float f, float f4, float f5, float f6, float f32, float f35, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f4, f5, f6, f32, f35);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingInDp)) {
            return false;
        }
        PaddingInDp paddingInDp = (PaddingInDp) other;
        return Dp.m3299equalsimpl0(this.left, paddingInDp.left) && Dp.m3299equalsimpl0(this.start, paddingInDp.start) && Dp.m3299equalsimpl0(this.top, paddingInDp.top) && Dp.m3299equalsimpl0(this.right, paddingInDp.right) && Dp.m3299equalsimpl0(this.end, paddingInDp.end) && Dp.m3299equalsimpl0(this.bottom, paddingInDp.bottom);
    }

    /* JADX INFO: renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: getLeft-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: getRight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Dp.m3300hashCodeimpl(this.bottom) + d.a(this.end, d.a(this.right, d.a(this.top, d.a(this.start, Dp.m3300hashCodeimpl(this.left) * 31, 31), 31), 31), 31);
    }

    @NotNull
    public final PaddingInDp toAbsolute(boolean isRtl) {
        return new PaddingInDp(Dp.m3297constructorimpl(this.left + (isRtl ? this.end : this.start)), BitmapDescriptorFactory.HUE_RED, this.top, Dp.m3297constructorimpl(this.right + (isRtl ? this.start : this.end)), BitmapDescriptorFactory.HUE_RED, this.bottom, 18, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("PaddingInDp(left=");
        d.z(this.left, ", start=", sb6);
        d.z(this.start, ", top=", sb6);
        d.z(this.top, ", right=", sb6);
        d.z(this.right, ", end=", sb6);
        d.z(this.end, ", bottom=", sb6);
        sb6.append((Object) Dp.m3301toStringimpl(this.bottom));
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb6.toString();
    }

    private PaddingInDp(float f, float f4, float f5, float f6, float f32, float f35) {
        this.left = f;
        this.start = f4;
        this.top = f5;
        this.right = f6;
        this.end = f32;
        this.bottom = f35;
    }

    public /* synthetic */ PaddingInDp(float f, float f4, float f5, float f6, float f32, float f35, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m3297constructorimpl(0) : f, (i & 2) != 0 ? Dp.m3297constructorimpl(0) : f4, (i & 4) != 0 ? Dp.m3297constructorimpl(0) : f5, (i & 8) != 0 ? Dp.m3297constructorimpl(0) : f6, (i & 16) != 0 ? Dp.m3297constructorimpl(0) : f32, (i & 32) != 0 ? Dp.m3297constructorimpl(0) : f35, null);
    }
}
