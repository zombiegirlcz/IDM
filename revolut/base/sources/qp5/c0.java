package qp5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationContract$Configuration;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import gld.p0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mga.h0;
import nii.o0;
import qce.m0;
import qfm.r0;
import rp0.g1;
import rp0.k1;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends pri.a implements g {
    public final msb.a A;
    public final se5.a B;
    public final g1 C;
    public final hsc.c D;
    public final xq5.b E;
    public final CryptoWithdrawToAddressConfirmationContract$Configuration i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final up5.b f248259j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f248260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final smd.s f248261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f248262n;
    public final xpi.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tri.c f248263p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f9b.f f248264q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpi.c f248265r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mkd.e f248266s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f248267t;
    public final irh.a u;
    public final sh5.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ang.f f248268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l61.a f248269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final hc5.a f248270y;
    public final be5.e z;

    public c0(CryptoWithdrawToAddressConfirmationContract$Configuration inputData, up5.b presentationModel, e feesDialogDisplayerDelegate, h router, f itemsMapper, smd.s amountValidator, opi.d expandableDialogView, xpi.g navBarWithToolbarView, tri.c backButtonView, f9b.f errorView, pri.f authorizedPresenterDelegate, kpi.c activityResultDelegate, mkd.e slotManagerFeedDelegate, gte.a featureToggleInteractor, irh.a wealthProtectionSsoRetryRepository, sh5.d cryptoFcaDisclaimerWidget, ang.f userInteractor, l61.a userCompanyInteractor, hc5.a cryptoAccountInteractor, be5.e cryptoConvertFooterDisclaimerDelegate, msb.a twoFaView, se5.a cryptoFaqKeysProvider, h0 upgradeEntryPointPresenterDelegate, g1 shotDialogDisplayer, hsc.c cryptoScaPromptShotDialogProvider, xq5.b cryptoSendConfirmationLoadingObservable) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(feesDialogDisplayerDelegate, "feesDialogDisplayerDelegate");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(amountValidator, "amountValidator");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(slotManagerFeedDelegate, "slotManagerFeedDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(wealthProtectionSsoRetryRepository, "wealthProtectionSsoRetryRepository");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerDelegate, "cryptoConvertFooterDisclaimerDelegate");
        Intrinsics.checkNotNullParameter(twoFaView, "twoFaView");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointPresenterDelegate, "upgradeEntryPointPresenterDelegate");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(cryptoScaPromptShotDialogProvider, "cryptoScaPromptShotDialogProvider");
        Intrinsics.checkNotNullParameter(cryptoSendConfirmationLoadingObservable, "cryptoSendConfirmationLoadingObservable");
        this.i = inputData;
        this.f248259j = presentationModel;
        this.k = router;
        this.f248260l = itemsMapper;
        this.f248261m = amountValidator;
        this.f248262n = expandableDialogView;
        this.o = navBarWithToolbarView;
        this.f248263p = backButtonView;
        this.f248264q = errorView;
        this.f248265r = activityResultDelegate;
        this.f248266s = slotManagerFeedDelegate;
        this.f248267t = featureToggleInteractor;
        this.u = wealthProtectionSsoRetryRepository;
        this.v = cryptoFcaDisclaimerWidget;
        this.f248268w = userInteractor;
        this.f248269x = userCompanyInteractor;
        this.f248270y = cryptoAccountInteractor;
        this.z = cryptoConvertFooterDisclaimerDelegate;
        this.A = twoFaView;
        this.B = cryptoFaqKeysProvider;
        this.C = shotDialogDisplayer;
        this.D = cryptoScaPromptShotDialogProvider;
        this.E = cryptoSendConfirmationLoadingObservable;
        P(zhm.v.k(authorizedPresenterDelegate, slotManagerFeedDelegate, feesDialogDisplayerDelegate, upgradeEntryPointPresenterDelegate));
    }

    /* JADX WARN: Type inference failed for: r10v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        r0 r0VarD = te0.w.D(this.f248265r.N(7787), new k(this, 3));
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new n1i.b(11, new m0(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new o0(12, function1K), new ozc.z(21, n.f248282a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        ((tp5.b) this.f248260l).getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_screen_review_withdrawal_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.o;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar.j0(false);
        efm.r rVarMergeWith = cVar.Q().mergeWith(this.f248263p.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.h hVarB = te0.w.b(rVarMergeWith, new k(this, 15));
        Function1 function1K2 = K();
        pfm.a aVar3 = new pfm.a(hVarB, new n1i.b(11, new x(new BreadcrumbException(), 1)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar3.w(new o0(12, function1K2), new ozc.z(21, y.f248294a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        up5.a0 a0Var = (up5.a0) this.f248259j;
        efm.r rVarN3 = a0Var.n3();
        up5.c cVar2 = a0Var.f281852b;
        efm.r rVarP3 = a0Var.p3();
        Object value = a0Var.A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.r rVar = (efm.r) value;
        efm.r rVarQ = Q();
        efm.r rVarO3 = a0Var.o3();
        efm.r rVarR = pd.b.r(a0Var.p3(), new up5.f(a0Var, 22));
        te0.e eVarG0 = ((up5.e) cVar2).G0();
        te0.s sVar = te0.s.f270018a;
        efm.r map = eVarG0.c(sVar).map(new qmd.c(10, new qnd.c(20)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarFilter = a0Var.n3().filter(new qmd.c(4, new qnd.c(25)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.r rVarA0 = te0.w.a0(rVarFilter, new qnd.c(15));
        efm.r rVarFilter2 = this.f248268w.k(false).filter(new qmd.c(5, new qnd.c(16)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        efm.r rVarA02 = te0.w.a0(rVarFilter2, new qnd.c(17));
        efm.r rVarC = ((up5.e) cVar2).x0().c(sVar);
        efm.r rVarB3 = a0Var.B3();
        efm.r rVarB = hng.g.b(((ang.b) this.f248269x).f7765a);
        vkm.d dVarA = this.f248270y.a(w4l.h.f294642c);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarFlatMapSingle = te0.w.p(rVarA0, rVarA02, rVarC, rVarB3, rVarB, rd0.e.c(dVarA, gVar)).flatMapSingle(new qmd.c(6, new k(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r map2 = ue0.e.H(rVarFlatMapSingle, zhm.h0.f322473a, new qnd.c(18)).map(new qmd.c(13, new qnd.c(23)));
        od0.i.Companion.getClass();
        efm.r rVarStartWith = map2.startWith(zi0.c.P(od0.i.f224256b, false, null, 3));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        efm.r map3 = mif.a.j(rVarN3, rVarP3, rVar, rVarQ, rVarO3, rVarR, map, rVarStartWith).map(new qmd.c(14, new k(this, 19)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarF = o70.a.f(map3);
        qgf.o oVar = new qgf.o(view, 19);
        Function1 function1K3 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new n1i.b(11, new x(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(12, oVar), new o0(12, function1K3), new ozc.z(21, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        CryptoWithdrawToAddressConfirmationActivity cryptoWithdrawToAddressConfirmationActivity = (CryptoWithdrawToAddressConfirmationActivity) view;
        ?? r102 = cryptoWithdrawToAddressConfirmationActivity.f71167w0;
        ?? r112 = cryptoWithdrawToAddressConfirmationActivity.G0;
        r0 r0VarD2 = te0.w.D(((CellDetailsActionDelegate) r102.getValue()).d, new k(this, 9));
        Function1 function1K4 = K();
        pfm.a aVar4 = new pfm.a(r0VarD2, new n1i.b(11, new m0(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar4.w(new o0(12, function1K4), new ozc.z(21, o.f248283a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        r0 r0VarD3 = te0.w.D(((CellDetailsDelegate) cryptoWithdrawToAddressConfirmationActivity.f71168x0.getValue()).d, new k(this, 6));
        Function1 function1K5 = K();
        pfm.a aVar5 = new pfm.a(r0VarD3, new n1i.b(11, new m0(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar5.w(new o0(12, function1K5), new ozc.z(21, p.f248284a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        r0 r0VarD4 = te0.w.D(((RowDelegate) cryptoWithdrawToAddressConfirmationActivity.z0.getValue()).f53218h, new k(this, 10));
        Function1 function1K6 = K();
        pfm.a aVar6 = new pfm.a(r0VarD4, new n1i.b(11, new x(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar6.w(new o0(12, function1K6), new ozc.z(21, z.f248295a));
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        r0 r0VarD5 = te0.w.D(((LargeActionButtonDelegate) cryptoWithdrawToAddressConfirmationActivity.F0.getValue()).d.f121375b, new k(this, 16));
        Function1 function1K7 = K();
        pfm.a aVar7 = new pfm.a(r0VarD5, new n1i.b(11, new m0(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar7.w(new o0(12, function1K7), new ozc.z(21, t.f248288a));
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        r0 r0VarD6 = te0.w.D(((TwinHorizontalButtonDelegate) r112.getValue()).f53572c.f121375b, new k(this, 17));
        Function1 function1K8 = K();
        pfm.a aVar8 = new pfm.a(r0VarD6, new n1i.b(11, new m0(new BreadcrumbException(), 27)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar8.w(new o0(12, function1K8), new ozc.z(21, u.f248289a));
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        r0 r0VarD7 = te0.w.D(((TwinHorizontalButtonDelegate) r112.getValue()).d.f121375b, new k(this, 18));
        Function1 function1K9 = K();
        pfm.a aVar9 = new pfm.a(r0VarD7, new n1i.b(11, new m0(new BreadcrumbException(), 28)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW8 = aVar9.w(new o0(12, function1K9), new ozc.z(21, v.f248290a));
        Intrinsics.checkNotNullExpressionValue(hVarW8, "subscribe(...)");
        te0.w.j0(bVar, hVarW8);
        efm.r map4 = hx7.a.N(o70.a.f(te0.w.l(this.f248261m.M(), ((up5.e) cVar2).G0().c(sVar))), this.f248264q, false, false).map(new qmd.c(8, new k(this, 1)));
        efm.r rVarC2 = rd0.e.c(new qij.s(this.E.f308116b, 1), gVar);
        Intrinsics.h(map4);
        efm.r rVarF2 = o70.a.f(te0.w.l(map4, rVarC2));
        qce.a aVar10 = new qce.a(this, view, 29);
        Function1 function1K10 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new n1i.b(11, new m0(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new o0(12, aVar10), new o0(12, function1K10), new ozc.z(21, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        r0 r0VarD8 = te0.w.D(((ActionFooterView) cryptoWithdrawToAddressConfirmationActivity.u0.getValue(cryptoWithdrawToAddressConfirmationActivity, CryptoWithdrawToAddressConfirmationActivity.I0[0])).f, new k(this, 2));
        Function1 function1K11 = K();
        pfm.a aVar11 = new pfm.a(r0VarD8, new n1i.b(11, new m0(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        ofm.h hVarW9 = aVar11.w(new o0(12, function1K11), new ozc.z(21, m.f248281a));
        Intrinsics.checkNotNullExpressionValue(hVarW9, "subscribe(...)");
        te0.w.j0(bVar, hVarW9);
        r0 r0VarD9 = te0.w.D(cryptoWithdrawToAddressConfirmationActivity.y0.e.f121375b, new k(this, 8));
        Function1 function1K12 = K();
        pfm.a aVar12 = new pfm.a(r0VarD9, new n1i.b(11, new m0(new BreadcrumbException(), 25)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        ofm.h hVarW10 = aVar12.w(new o0(12, function1K12), new ozc.z(21, s.f248287a));
        Intrinsics.checkNotNullExpressionValue(hVarW10, "subscribe(...)");
        te0.w.j0(bVar, hVarW10);
        opi.b bVar2 = (opi.b) this.f248262n;
        efm.r rVarFilter3 = bVar2.W0().filter(new qmd.c(9, new qnd.c(21)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        r0 r0VarD10 = te0.w.D(rVarFilter3, new k(this, 4));
        Function1 function1K13 = K();
        pfm.a aVar13 = new pfm.a(r0VarD10, new n1i.b(11, new m0(new BreadcrumbException(), 23)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar13, "onErrorResumeNext(...)");
        ofm.h hVarW11 = aVar13.w(new o0(12, function1K13), new ozc.z(21, q.f248285a));
        Intrinsics.checkNotNullExpressionValue(hVarW11, "subscribe(...)");
        te0.w.j0(bVar, hVarW11);
        efm.r rVarFilter4 = bVar2.W0().filter(new qmd.c(11, new qnd.c(22)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        r0 r0VarD11 = te0.w.D(rVarFilter4, new k(this, 5));
        Function1 function1K14 = K();
        pfm.a aVar14 = new pfm.a(r0VarD11, new n1i.b(11, new m0(new BreadcrumbException(), 24)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar14, "onErrorResumeNext(...)");
        ofm.h hVarW12 = aVar14.w(new o0(12, function1K14), new ozc.z(21, r.f248286a));
        Intrinsics.checkNotNullExpressionValue(hVarW12, "subscribe(...)");
        te0.w.j0(bVar, hVarW12);
        efm.b bVarFlatMapCompletable = rd0.e.c(this.u.f168048a, gVar).flatMapCompletable(new qmd.c(12, new k(this, 7)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K15 = K();
        n1i.b bVar3 = new n1i.b(11, new x(new BreadcrumbException(), 5));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar15 = new pfm.a(bVarFlatMapCompletable, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar15, "onErrorResumeNext(...)");
        ofm.h hVarW13 = aVar15.w(new o0(12, function1K15), new ozc.z(21, b0.f248256a));
        Intrinsics.checkNotNullExpressionValue(hVarW13, "subscribe(...)");
        te0.w.j0(bVar, hVarW13);
        RevolutXCommonApi$Toggles.RevolutXPromo revolutXPromo = RevolutXCommonApi$Toggles.RevolutXPromo.f84262c;
        jte.d dVar = (jte.d) this.f248267t;
        if (dVar.c(revolutXPromo)) {
            mkd.a screen = new mkd.a(new SlotContext(akd.s.CRYPTO_TRANSFERS));
            p0 p0Var = (p0) this.f248266s;
            p0Var.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            gld.a0 a0Var2 = p0Var.f144670h;
            a0Var2.getClass();
            Intrinsics.checkNotNullParameter(screen, "screen");
            a0Var2.o.setValue(screen);
        }
        if (dVar.c(revolutXPromo)) {
            efm.r rVarL = te0.w.l(Q(), pd.b.s(a0Var.n3(), new k(this, 11)));
            k kVar = new k(this, 12);
            Function1 function1K16 = K();
            Function0 function0J3 = J();
            efm.r rVarOnErrorResumeNext3 = rVarL.onErrorResumeNext(new n1i.b(11, new m0(new BreadcrumbException(), 29)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new o0(12, kVar), new o0(12, function1K16), new ozc.z(21, function0J3));
            te0.w.j0(bVar, cVarSubscribe3);
            Intrinsics.h(cVarSubscribe3);
            NavBarWithToolbar navBarWithToolbar2 = cVar.f307974j;
            if (navBarWithToolbar2 == null) {
                Intrinsics.r("navBarWithToolbarView");
                throw null;
            }
            r0 r0VarD12 = te0.w.D(te0.w.a0((ihm.f) navBarWithToolbar2.f59406n.f258290b, new k(this, 13)), new k(this, 14));
            Function1 function1K17 = K();
            pfm.a aVar16 = new pfm.a(r0VarD12, new n1i.b(11, new x(new BreadcrumbException(), 0)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar16, "onErrorResumeNext(...)");
            ofm.h hVarW14 = aVar16.w(new o0(12, function1K17), new ozc.z(21, w.f248291a));
            Intrinsics.checkNotNullExpressionValue(hVarW14, "subscribe(...)");
            te0.w.j0(bVar, hVarW14);
        }
        efm.r rVarA = msb.a.a(this.A);
        Function1 function1K18 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarA.onErrorResumeNext(new n1i.b(11, new x(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new o0(12, a0.f248253a), new o0(12, function1K18), new ozc.z(21, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        if (((jte.d) a0Var.k).c(CryptoWithdrawApi$Toggles.CryptoWithdrawFeesUsingToken.f71058c)) {
            a0Var.E.dispose();
            efm.r rVarDoOnNext = te0.w.n(te0.w.a0(a0Var.p3(), new up5.h(3)), te0.w.a0(a0Var.f281865w, new up5.h(22)), te0.w.a0(a0Var.n3(), new up5.h(4)), a0Var.A3()).distinctUntilChanged().switchMap(new uoe.a(15, new up5.f(a0Var, 10))).doOnNext(new uoe.a(16, new up5.f(a0Var, 11)));
            Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
            efm.r rVarOnErrorResumeNext5 = rVarDoOnNext.onErrorResumeNext(new n1i.b(21, new up5.s(new BreadcrumbException(), 2)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new o0(19, up5.x.f281915a), new o0(19, up5.y.f281916a));
            Intrinsics.checkNotNullExpressionValue(cVarSubscribe5, "subscribe(...)");
            a0Var.E = cVarSubscribe5;
            a0Var.f.a(cVarSubscribe5);
        }
        if (this.i.f71169a) {
            ((k1) this.C).d(this.D.a());
        }
    }

    @Override // pri.a
    public final void O() {
        up5.a0 a0Var = (up5.a0) this.f248259j;
        if (((jte.d) a0Var.k).c(CryptoWithdrawApi$Toggles.CryptoWithdrawFeesUsingToken.f71058c)) {
            a0Var.E.dispose();
            te0.e eVarG0 = ((up5.e) a0Var.f281852b).G0();
            od0.i.Companion.getClass();
            eVarG0.set(od0.i.f224256b);
        }
    }

    public final efm.r Q() {
        if (!((jte.d) this.f248267t).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c)) {
            return zi0.c.j(f0.f322471a);
        }
        efm.r map = rd0.e.c(((p0) this.f248266s).f144670h.h(), kotlin.coroutines.g.f186406a).map(new qmd.c(15, new qnd.c(24)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return ue0.e.p(map, zhm.h0.f322473a);
    }
}
