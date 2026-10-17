package he1;

import com.revolut.data.model.Data;
import efm.r;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import skm.a2;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sfc.f f151521p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nd1.c f151522q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a2 f151523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f151524s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sfc.f featureToggleInteractor, nd1.c catalogueInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f151521p = featureToggleInteractor;
        this.f151522q = catalogueInteractor;
        this.f151524s = new f(new Data(null, null, true, 3, null), h0.f322473a);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f151524s;
    }

    public final void y2() {
        this.f151521p.getClass();
        a2 a2Var = this.f151523r;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        nd1.c cVar = this.f151522q;
        r map = u1.e(cVar.a(), cVar.b(), cVar.c(true)).map(new hae.k(new hb4.k(27), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f151523r = yji.l.a1(this, rd0.e.b(ue0.e.p(map, h0.f322473a)), null, null, new hba.k(this, continuation, 7), 3);
    }
}
