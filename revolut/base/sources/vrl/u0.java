package vrl;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.r f291681a;

    public u0(prl.r tradingOrdersRepository) {
        Intrinsics.checkNotNullParameter(tradingOrdersRepository, "tradingOrdersRepository");
        this.f291681a = tradingOrdersRepository;
    }

    public final efm.r a(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        prl.r rVar = this.f291681a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return rVar.e.f(id10, true);
    }

    public final ufm.n b(String portfolioId, k4l.z orderRequest) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        prl.r rVar = this.f291681a;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderRequest, "orderRequest");
        ufm.c cVar = new ufm.c(new a9j.k(rVar, 26, portfolioId, orderRequest), 0);
        Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
        return te0.w.i0(cVar);
    }

    public final Object c(bfl.g gVar, nel.z zVar, dfl.r rVar, hul.m0 m0Var) throws Throwable {
        prl.r rVar2 = this.f291681a;
        rVar2.getClass();
        a9h.a aVar = new a9h.a(rVar2, gVar, zVar, rVar, null, 23);
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, aVar, m0Var);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
