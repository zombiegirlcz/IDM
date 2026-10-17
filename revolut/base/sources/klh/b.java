package klh;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.tracking.v3.SwipeToTradeContext;
import grl.hd;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements p5d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f185626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f185627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5d.b f185628c;
    public final w0 d;

    public b(ArrayList allCommodities, xi0.b commodity) {
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        Intrinsics.checkNotNullParameter(allCommodities, "allCommodities");
        this.f185626a = commodity;
        this.f185627b = allCommodities;
        this.f185628c = new p5d.b(commodity.f306286a, "commodity", null);
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        SwipeToTradeContext.a aVarNewBuilder = SwipeToTradeContext.newBuilder();
        aVarNewBuilder.h(commodity.f306286a);
        aVarNewBuilder.i(hd.COMMODITY);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        this.d = AnalyticsContext.Companion.a(w0VarA);
    }

    @Override // p5d.a
    public final AnalyticsContext R() {
        return new AnalyticsContext(this.d);
    }

    @Override // p5d.a
    public final AnimationRequest b() {
        return null;
    }

    @Override // p5d.a
    public final p5d.b c() {
        return this.f185628c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f185626a, bVar.f185626a) && this.f185627b.equals(bVar.f185627b);
    }

    public final int hashCode() {
        return this.f185627b.hashCode() + (this.f185626a.hashCode() * 31);
    }
}
