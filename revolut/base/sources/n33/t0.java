package n33;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import om4.m4;
import om4.s3;
import om4.y3;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 implements r {
    public final jla.h A;
    public final m4 B;
    public final al4.b C;
    public final v60.g D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.p f211818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.j f211819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bm4.a f211820c;
    public final al4.q d;
    public final q89.e e;
    public final xh9.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f211821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ang.f f211822h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sh3.a f211823j;
    public final wsg.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l93.f f211824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ha3.c f211825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gr6.e f211826n;
    public final gr6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.h f211827p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g48.r0 f211828q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hy2.f f211829r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ffk.t f211830s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xh5.a f211831t;
    public final k18.c u;
    public final sh5.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final te8.c0 f211832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ld5.b f211833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jid.z f211834y;
    public final b23.h z;

    public t0(al4.p creditCardProductFeatureTogglesInteractor, al4.j creditCardEntryPointDetailsInteractor, bm4.a creditCardEntryPointUiInteractor, al4.q creditCardProductInteractor, q89.e onboardingInteractor, xh9.a payLaterInteractor, fk3.a configurationInteractor, ang.f userInteractor, w state, sh3.a checkoutInteractor, wsg.n walletInteractor, l93.f revolutCardsInteractor, ha3.c cardPromotionsInteractor, gr6.e freelancerAvailabilityInteractor, gr6.a freelancerAccountDetailsInteractor, gr6.h freelancerCashbackInteractor, g48.r0 jointAccountsInteractor, hy2.f cardDesignInteractor, ffk.t pricingPlanInteractor, xh5.a cryptoFeatureEnabledInteractor, k18.c cryptoCardFooterDataProvider, sh5.d cryptoFcaDisclaimerWidget, te8.c0 juniorVirtualCardOrderInteractor, ld5.b cryptoCardsAvailabilityInteractor, jid.z juniorOrderNewCardFreeDeliveryProvider, b23.h juniorCardOrderCardCreationActionProvider, jla.h productCatalogueInteractor, m4 familyCreditCardWalletInteractor, al4.b comboCardInteractor, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(cardPromotionsInteractor, "cardPromotionsInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardFooterDataProvider, "cryptoCardFooterDataProvider");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(juniorVirtualCardOrderInteractor, "juniorVirtualCardOrderInteractor");
        Intrinsics.checkNotNullParameter(cryptoCardsAvailabilityInteractor, "cryptoCardsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(juniorOrderNewCardFreeDeliveryProvider, "juniorOrderNewCardFreeDeliveryProvider");
        Intrinsics.checkNotNullParameter(juniorCardOrderCardCreationActionProvider, "juniorCardOrderCardCreationActionProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(familyCreditCardWalletInteractor, "familyCreditCardWalletInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f211818a = creditCardProductFeatureTogglesInteractor;
        this.f211819b = creditCardEntryPointDetailsInteractor;
        this.f211820c = creditCardEntryPointUiInteractor;
        this.d = creditCardProductInteractor;
        this.e = onboardingInteractor;
        this.f = payLaterInteractor;
        this.f211821g = configurationInteractor;
        this.f211822h = userInteractor;
        this.i = state;
        this.f211823j = checkoutInteractor;
        this.k = walletInteractor;
        this.f211824l = revolutCardsInteractor;
        this.f211825m = cardPromotionsInteractor;
        this.f211826n = freelancerAvailabilityInteractor;
        this.o = freelancerAccountDetailsInteractor;
        this.f211827p = freelancerCashbackInteractor;
        this.f211828q = jointAccountsInteractor;
        this.f211829r = cardDesignInteractor;
        this.f211830s = pricingPlanInteractor;
        this.f211831t = cryptoFeatureEnabledInteractor;
        this.u = cryptoCardFooterDataProvider;
        this.v = cryptoFcaDisclaimerWidget;
        this.f211832w = juniorVirtualCardOrderInteractor;
        this.f211833x = cryptoCardsAvailabilityInteractor;
        this.f211834y = juniorOrderNewCardFreeDeliveryProvider;
        this.z = juniorCardOrderCardCreationActionProvider;
        this.A = productCatalogueInteractor;
        this.B = familyCreditCardWalletInteractor;
        this.C = comboCardInteractor;
        this.D = new v60.g(compositeDisposable, new i0(this, 8));
    }

    public final ufm.i a(boolean z) {
        efm.d0 d0VarFirstOrError = rd0.e.c(rd0.e.e(mo3.a.g(((om4.b) this.f211818a).c(w4l.j.f294644c), null, new l0(2), 1), zhm.h0.f322473a, new n28.b(3, 4, null)), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarP = ((ik3.c) this.f211821g).p();
        j0 j0Var = new j0(4, new c(28));
        d0VarP.getClass();
        ufm.i iVar = new ufm.i(d0VarP, j0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.K0(d0VarFirstOrError, iVar, j(), k(), i()), new n30.d(new lph.c(this, z), 29), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final ufm.i b() {
        efm.d0 d0VarFirstOrError = rd0.e.c(((s3) this.f211818a).s(), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        ufm.i iVar = new ufm.i(ue0.e.F(d0VarFirstOrError, Boolean.FALSE), new n30.d(new i0(this, 1), 13), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final NaviCommand c() {
        return (NaviCommand) te0.w.O(((s2) this.i).C0());
    }

    public final zn3.a d() {
        s2 s2Var = (s2) this.i;
        return (zn3.a) te0.w.O(s2Var.f211808b.getValue(s2Var, s2.f211807p[0]));
    }

    public final efm.d0 e() {
        if (f()) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (d() == zn3.a.ONBOARDING) {
            ufm.b bVarM2 = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        efm.d0 d0VarFirstOrError = rd0.e.c(((s3) this.f211818a).s(), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, Boolean.FALSE);
    }

    public final boolean f() {
        return com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) ((s2) this.i).w0().get()) instanceof AccountId.Joint;
    }

    public final boolean g() {
        return ((db9.d) this.e).c();
    }

    public final efm.r h() {
        s2 s2Var = (s2) this.i;
        efm.r rVarSwitchMap = s2Var.f211809c.getValue(s2Var, s2.f211807p[1]).c(te0.s.f270018a).distinctUntilChanged().switchMap(new j0(0, new i0(this, 6)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final pfm.z i() {
        it4.b bVar = (it4.b) this.f211820c;
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(boh.f.e(((om4.b) bVar.f168341b).e(grl.r2.CARD_ORDERING), new it4.a(bVar, 3)), null, new l0(1), 1), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, zhm.f0.f322471a);
    }

    public final efm.d0 j() {
        efm.d0 d0VarFirstOrError = rd0.e.c(mo3.a.g(((s3) this.f211819b).r(), null, new l0(0), 1), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final efm.d0 k() {
        efm.r rVarG = m70.a.g(n14.k.q(nim.a.w(mif.a.d(rd0.e.c(n14.k.p(((y3) this.d).e(w4l.h.f294642c, true), new c(19)), kotlin.coroutines.g.f186406a), nim.a.w(this.f211822h.k(false), new c(20))), new c(21)), new c(22)), null, new n0c.v(27), 1);
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = rVarG.first(od0.i.f224256b);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final efm.r l() {
        return m70.a.g(this.f211822h.k(false), null, new n0c.v(24), 1);
    }

    public final ufm.i m() {
        efm.d0 d0VarFirst = this.f211833x.a().map(new n30.d(new c(12), 21)).first(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        efm.d0 d0VarC = ((ji5.e) this.f211831t).c();
        n30.d dVar = new n30.d(new c(13), 22);
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(d0VarC, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.H0(d0VarFirst, iVar), new n30.d(new c(14), 24), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public final efm.d0 n() {
        AccountId.Joint joint;
        s2 s2Var = (s2) this.i;
        AccountId accountIdA = com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) s2Var.w0().get());
        if (accountIdA instanceof AccountId.Joint) {
            joint = (AccountId.Joint) accountIdA;
        } else {
            if (!Intrinsics.f(accountIdA, AccountId.Personal.f51414a)) {
                throw new NoWhenBranchMatchedException();
            }
            joint = null;
        }
        if (f()) {
            te0.e value = s2Var.k.getValue(s2Var, s2.f211807p[9]);
            od0.i.Companion.getClass();
            value.set(od0.h.a(joint));
            ufm.b bVarM = efm.d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        efm.d0 d0VarFirstOrError = rd0.e.c(this.f211828q.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), kotlin.coroutines.g.f186406a).filter(new n30.d(new c(10), 18)).doOnNext(new n30.d(new i0(this, 3), 19)).map(new n30.d(new c(11), 20)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return ue0.e.F(d0VarFirstOrError, Boolean.FALSE);
    }

    public final ufm.i o() {
        efm.d0 d0VarFirstOrError = rd0.e.c(bla.b.b(this.A, "YOUTH"), kotlin.coroutines.g.f186406a).firstOrError();
        n30.d dVar = new n30.d(new c(15), 25);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.d0 p() {
        if (!f()) {
            return ((ti9.g) this.f).d();
        }
        ufm.b bVarM = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final pfm.z q() {
        efm.d0 d0VarFirstOrError = rd0.e.c(vkm.q.Q(((et6.l0) this.f211826n).m(), new o0(null, this, 1)), kotlin.coroutines.g.f186406a).firstOrError();
        n30.d dVar = new n30.d(new i0(this, 4), 26);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, dVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.I(iVar, zhm.h0.f322473a, new c(16));
    }
}
