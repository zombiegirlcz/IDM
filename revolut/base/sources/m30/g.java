package m30;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n30.n;
import n30.x;
import v20.f0;
import v20.o;
import w30.m;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f202266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jpc.e f202267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final be7.k f202268c;
    public final x d;

    public g(n chatInteractor, jpc.e callRequestTicketsInteractor, be7.k inAppCallsInteractor, l80.e dateProvider, x chatPricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        Intrinsics.checkNotNullParameter(callRequestTicketsInteractor, "callRequestTicketsInteractor");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        this.f202266a = chatInteractor;
        this.f202267b = callRequestTicketsInteractor;
        this.f202268c = inAppCallsInteractor;
        this.d = chatPricingPlanInteractor;
    }

    public final r a(m mVar) {
        int i = 0;
        r map = this.f202266a.h(mVar.f294092a, true).map(new b(i, new a(mVar, i)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.H(map, h0.f322473a, new c(0));
    }

    public final Flow b() {
        jpc.e eVar = this.f202267b;
        o oVar = (o) eVar.f177256b;
        rf3.d dVar = (rf3.d) ((j30.c) eVar.d);
        j30.b bVarB = dVar.b();
        j30.b bVar = j30.b.PARTIALLY_ENABLED;
        w4l.i iVar = w4l.i.f294643c;
        return boh.f.e(nim.a.v(rd0.e.b((bVarB == bVar || dVar.b() == j30.b.FULLY_ENABLED) ? rd0.e.c(nim.a.v(((f0) oVar).m(iVar), new c(eVar, 3)), kotlin.coroutines.g.f186406a) : nim.a.w(((f0) oVar).n(null, iVar), new c(eVar, 4))), new m2g.c(29)), new m11.h(this, 8));
    }
}
