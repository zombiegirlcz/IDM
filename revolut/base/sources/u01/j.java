package u01;

import com.revolut.feature.retail.advanced_charts.models.LockPolicy;
import com.revolut.feature.retail.advanced_charts.models.OverlayPolicy;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f276013c;
    public final OverlayPolicy d;
    public final LockPolicy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Set indicators, OverlayPolicy overlayPolicy, LockPolicy lockPolicy) {
        super("updateIndicatorsList", 8);
        Intrinsics.checkNotNullParameter(indicators, "indicators");
        Intrinsics.checkNotNullParameter(overlayPolicy, "overlayPolicy");
        Intrinsics.checkNotNullParameter(lockPolicy, "lockPolicy");
        this.f276013c = indicators;
        this.d = overlayPolicy;
        this.e = lockPolicy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f276013c, jVar.f276013c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.f(this.f276013c.hashCode() * 31, 31, this.d.f82091a);
    }
}
