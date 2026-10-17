package sce;

import efm.d0;
import ibd.h;
import kotlin.jvm.internal.Intrinsics;
import qce.k;
import qce.p;
import qua.u;
import rfm.j;
import rfm.m;
import sa6.y;
import te0.s;
import te0.w;
import ufm.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f261739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3j.b f261740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl3.a f261741c;
    public final ppg.b d;
    public final k e;
    public final ur2.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final co9.b f261742g;

    public f(e delegatesProvider, d3j.b beneficiaryInteractor, cl3.a contactsInteractor, ppg.b vaultsInteractor, k state, ur2.c blockedMerchantsInteractor, co9.b paymentCounterpartyInteractor) {
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
        Intrinsics.checkNotNullParameter(beneficiaryInteractor, "beneficiaryInteractor");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockedMerchantsInteractor, "blockedMerchantsInteractor");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        this.f261739a = delegatesProvider;
        this.f261740b = beneficiaryInteractor;
        this.f261741c = contactsInteractor;
        this.d = vaultsInteractor;
        this.e = state;
        this.f = blockedMerchantsInteractor;
        this.f261742g = paymentCounterpartyInteractor;
    }

    public final pfm.a a() {
        qua.p pVar = (qua.p) ((g) this.e).w0().get();
        boolean zV = u.v(pVar);
        e eVar = this.f261739a;
        return d(zV ? (tm.g) eVar.u.getValue() : (pVar.f249314a.f160152c == h.UPI_MANDATE || u.x(pVar)) ? (tm.g) eVar.f261737t.getValue() : (tm.g) eVar.f261728h.getValue());
    }

    public final pfm.a b() {
        qua.p pVar = (qua.p) ((g) this.e).w0().get();
        boolean zV = u.v(pVar);
        e eVar = this.f261739a;
        return d(zV ? (tm.g) eVar.v.getValue() : (pVar.f249314a.f160152c == h.UPI_MANDATE || u.x(pVar)) ? (tm.g) eVar.f261736s.getValue() : (tm.g) eVar.i.getValue());
    }

    public final d0 c() {
        qua.p pVar = (qua.p) ((g) this.e).w0().get();
        h hVar = pVar.f249314a.f160152c;
        h hVar2 = h.BIZUM_MANDATE;
        e eVar = this.f261739a;
        tm.g gVar = (hVar == hVar2 || hVar == h.CARD_MANDATE) ? (tm.g) eVar.f261730l.getValue() : hVar == h.MANUAL_CARD_MANDATE ? (tm.g) eVar.f261731m.getValue() : hVar == h.PIX_MANDATE ? (tm.g) eVar.f261734q.getValue() : (hVar == h.UPI_MANDATE || hVar == h.GIRO_HU_DIRECT_DEBIT || hVar == h.MASAV_IL_DIRECT_DEBIT || u.x(pVar)) ? (tm.g) eVar.f261735r.getValue() : (tm.g) eVar.f261732n.getValue();
        sfm.b bVarG = d(gVar).g(gVar.f);
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        d0 d0VarFirstOrError = m70.a.g(bVarG, null, new sa5.a(11), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final pfm.a d(tm.g gVar) {
        d0 d0VarFirstOrError = ((g) this.e).w0().c(s.f270018a).firstOrError();
        sc7.g gVar2 = new sc7.g(new y(18), 10);
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(new i(d0VarFirstOrError, gVar2, 1), new sc7.g(new rnb.u(1, gVar, tm.g.class, "doAction", "doAction(Lcom/revolut/action_framework_core/actions/Action;)Lio/reactivex/Completable;", 0, 23), 11), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.k e(String str) {
        if (str == null) {
            return rfm.h.f253943a;
        }
        d0 d0VarFirstOrError = this.f261740b.j(str, w4l.h.f294642c).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return zi0.c.t(d0VarFirstOrError).w();
    }

    public final qua.p f() {
        return (qua.p) ((g) this.e).w0().get();
    }

    public final j g() {
        d0 d0VarC = w.C(((g) this.e).w0());
        sc7.g gVar = new sc7.g(new s78.d(this, 26), 13);
        d0VarC.getClass();
        j jVar = new j(d0VarC, gVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return jVar;
    }

    public final m h(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        m mVar = new m(((wl3.h) this.f261741c).b(code), new sc7.g(new y(21), 12), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        return mVar;
    }

    public final efm.k i() {
        String str;
        sua.b bVar = f().J;
        if (bVar == null || (str = bVar.f265696a) == null) {
            rfm.h hVar = rfm.h.f253943a;
            Intrinsics.checkNotNullExpressionValue(hVar, "empty(...)");
            return hVar;
        }
        efm.k kVarW = m70.a.g(((ypg.p) this.d).i(str), null, new sa5.a(10), 1).firstOrError().w();
        Intrinsics.checkNotNullExpressionValue(kVarW, "toMaybe(...)");
        return kVarW;
    }
}
