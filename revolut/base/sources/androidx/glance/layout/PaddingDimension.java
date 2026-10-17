package androidx.glance.layout;

import androidx.compose.ui.unit.Dp;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.data.database.models.openbanking.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB$\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/glance/layout/PaddingDimension;", "", "Landroidx/compose/ui/unit/Dp;", "dp", "", "", "resourceIds", "<init>", "(FLjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "plus", "(Landroidx/glance/layout/PaddingDimension;)Landroidx/glance/layout/PaddingDimension;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "F", "getDp-D9Ej5fM", "()F", "Ljava/util/List;", "getResourceIds", "()Ljava/util/List;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PaddingDimension {
    private final float dp;

    @NotNull
    private final List<Integer> resourceIds;
    public static final int $stable = 8;

    @NotNull
    private static final PaddingDimension Zero = new PaddingDimension(BitmapDescriptorFactory.HUE_RED, null, 3, null);

    public /* synthetic */ PaddingDimension(float f, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingDimension)) {
            return false;
        }
        PaddingDimension paddingDimension = (PaddingDimension) other;
        return Dp.m3299equalsimpl0(this.dp, paddingDimension.dp) && Intrinsics.f(this.resourceIds, paddingDimension.resourceIds);
    }

    /* JADX INFO: renamed from: getDp-D9Ej5fM, reason: not valid java name and from getter */
    public final float getDp() {
        return this.dp;
    }

    @NotNull
    public final List<Integer> getResourceIds() {
        return this.resourceIds;
    }

    public int hashCode() {
        return this.resourceIds.hashCode() + (Dp.m3300hashCodeimpl(this.dp) * 31);
    }

    @NotNull
    public final PaddingDimension plus(@NotNull PaddingDimension other) {
        return new PaddingDimension(Dp.m3297constructorimpl(this.dp + other.dp), d0.E0(other.resourceIds, this.resourceIds), null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("PaddingDimension(dp=");
        d.z(this.dp, ", resourceIds=", sb6);
        return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.resourceIds, sb6);
    }

    private PaddingDimension(float f, List<Integer> list) {
        this.dp = f;
        this.resourceIds = list;
    }

    public PaddingDimension(float f, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dp.m3297constructorimpl(0) : f, (i & 2) != 0 ? f0.f322471a : list, null);
    }
}
