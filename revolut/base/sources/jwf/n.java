package jwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreenContract$InputData;
import jsl.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.y;
import vkm.z1;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransportHubTransitScreenContract$InputData f178990p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ouf.a f178991q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lvf.a f178992r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cwf.a f178993s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z1 f178994t;
    public final e u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TransportHubTransitScreenContract$InputData inputData, ouf.a transportInteractor, lvf.a transportLocationExtension, cwf.a locationObservable, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(transportLocationExtension, "transportLocationExtension");
        Intrinsics.checkNotNullParameter(locationObservable, "locationObservable");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f178990p = inputData;
        this.f178991q = transportInteractor;
        this.f178992r = transportLocationExtension;
        this.f178993s = locationObservable;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f178994t = z1VarB;
        this.u = new e(inputData.f92547a, ((lvf.c) transportLocationExtension).f200375n.c("android.permission.ACCESS_COARSE_LOCATION"), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, new ie7.h(q.Q(new y(new t0(this, continuation, 8), rd0.e.b(this.f178993s.f255130a)), new iw6.l(continuation, this, 28)), this, 19), null, null, new jv.o(this, continuation, 5), 3);
        lvf.c cVar = (lvf.c) this.f178992r;
        yji.l.a1(this, new y(new ll6.i(cVar, continuation, 25), cVar.f200376p), null, null, new jkh.g(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
