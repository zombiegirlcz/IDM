package l4g;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$InputData;
import com.revolut.feature.travel.flights.impl.ui.flow.home.TravelFlightsHomeFlowContract$PagerItem;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends oki.h implements d {
    public final TravelFlightsHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mub.b f192121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f192122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f192123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f192124s;

    public l(n stateMapper, TravelFlightsHomeFlowContract$InputData inputData, mub.b revPointsPillControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        this.o = inputData;
        this.f192121p = revPointsPillControllerModelExtension;
        List listK = v.k(TravelFlightsHomeFlowContract$PagerItem.DISCOVER, TravelFlightsHomeFlowContract$PagerItem.BOOKINGS);
        this.f192122q = listK;
        this.f192123r = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f93210a.getF94249a(), listK), stateMapper, null, false, 12);
        this.f192124s = new ali.b(new l0c.v(this, 7));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f192124s;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(((lzb.a) this.f192121p).Z2()), null, null, new l1g.e(this, (Continuation) null, 5), 3);
        String str = this.o.f93211b;
        if (str != null) {
            C2(new f(str));
        }
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f192123r;
    }
}
