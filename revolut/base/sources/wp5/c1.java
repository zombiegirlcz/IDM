package wp5;

import android.content.Intent;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.flow.CryptoWithdrawToAddressContract$FundingSourceInput;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.CryptoWithdrawToAddressReviewActivity;
import com.revolut.feature.revolut_x_common.api.RevolutXCommonApi$Toggles;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends pri.a implements i {
    public final go5.e A;
    public final skd.i B;
    public final be5.d C;
    public final eq5.x0 D;
    public final zrc.d E;
    public final ihm.b F;
    public final ifm.b G;
    public ofm.h H;
    public final up5.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f299100j;
    public final h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f299101l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final smd.s f299102m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final opi.d f299103n;
    public final rpi.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vpi.e f299104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tri.c f299105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ypi.i f299106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f9b.f f299107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tpi.j f299108t;
    public final msb.a u;
    public final s3l.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w80.b f299109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c90.c f299110x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final kpi.c f299111y;
    public final gte.a z;

    public c1(up5.b presentationModel, g itemsMapper, h limitErrorsDialogFactory, j router, smd.s amountValidator, opi.d expandableDialogView, rpi.c keyboardView, vpi.e navBarWithAvatarView, tri.c backButtonView, ypi.i nextButtonView, f9b.f errorView, tpi.j progressView, msb.a twoFaView, s3l.f shotDialogActionDispatcher, w80.b amountFormatter, c90.c uiResources, kpi.c activityResultDelegate, gte.a featureToggleInteractor, go5.e cryptoWithdrawDependenciesConfig, skd.i slotManagerInteractor, pri.f authorizedPresenterDelegate, be5.d cryptoConvertDialogDisclaimerPresenterDelegate, eq5.x0 cryptoSendAmountInputScreenInteractor, zrc.d cryptoScaInteractor) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(limitErrorsDialogFactory, "limitErrorsDialogFactory");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(amountValidator, "amountValidator");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(navBarWithAvatarView, "navBarWithAvatarView");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(twoFaView, "twoFaView");
        Intrinsics.checkNotNullParameter(shotDialogActionDispatcher, "shotDialogActionDispatcher");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoWithdrawDependenciesConfig, "cryptoWithdrawDependenciesConfig");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        Intrinsics.checkNotNullParameter(authorizedPresenterDelegate, "authorizedPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerPresenterDelegate, "cryptoConvertDialogDisclaimerPresenterDelegate");
        Intrinsics.checkNotNullParameter(cryptoSendAmountInputScreenInteractor, "cryptoSendAmountInputScreenInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        this.i = presentationModel;
        this.f299100j = itemsMapper;
        this.k = limitErrorsDialogFactory;
        this.f299101l = router;
        this.f299102m = amountValidator;
        this.f299103n = expandableDialogView;
        this.o = keyboardView;
        this.f299104p = navBarWithAvatarView;
        this.f299105q = backButtonView;
        this.f299106r = nextButtonView;
        this.f299107s = errorView;
        this.f299108t = progressView;
        this.u = twoFaView;
        this.v = shotDialogActionDispatcher;
        this.f299109w = amountFormatter;
        this.f299110x = uiResources;
        this.f299111y = activityResultDelegate;
        this.z = featureToggleInteractor;
        this.A = cryptoWithdrawDependenciesConfig;
        this.B = slotManagerInteractor;
        this.C = cryptoConvertDialogDisclaimerPresenterDelegate;
        this.D = cryptoSendAmountInputScreenInteractor;
        this.E = cryptoScaInteractor;
        P(zhm.v.k(authorizedPresenterDelegate, cryptoConvertDialogDisclaimerPresenterDelegate));
        ihm.b bVarE = ihm.b.e(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.F = bVarE;
        this.G = new ifm.b();
    }

    public static String Q(kpi.a aVar, String str) {
        Intent intent = aVar.f188248c;
        String stringExtra = intent != null ? intent.getStringExtra(str) : null;
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new IllegalArgumentException(p.a.p("result.data?.getStringExtra(", str, ") was null even though BalanceActivity result was success").toString());
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        o view = (o) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        this.F.onNext(Boolean.FALSE);
        Object obj2 = this.i;
        ((nri.a) obj2).init();
        up5.a0 a0Var = (up5.a0) obj2;
        efm.r rVarB3 = a0Var.B3();
        up5.c cVar = a0Var.f281852b;
        efm.d0 d0VarFirstOrError = rVarB3.firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarFirstOrError2 = a0Var.C3().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        pfm.a aVar2 = new pfm.a(te0.w.H0(d0VarFirstOrError, d0VarFirstOrError2), new s(1, new u(this, 19)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        pfm.a aVarE = ue0.e.v(aVar2).e(new pfm.h(new q(this, 1), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        Function1 function1K = K();
        pfm.a aVar3 = new pfm.a(aVarE, new nw8.d(19, new vx5.r(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new ly7.g(25, function1K), new t1i.n(14, c0.f299099a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, hVarW);
        kpi.c cVar2 = this.f299111y;
        qfm.r0 r0VarD = te0.w.D(i26.l.g(cVar2.N(104)), new r(this, 8));
        Function1 function1K2 = K();
        pfm.a aVar4 = new pfm.a(r0VarD, new nw8.d(19, new e0(new BreadcrumbException(), 19)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        y.C(function1K2, aVar4, new t1i.n(14, t0.f299149a), "subscribe(...)", bVar);
        qfm.r0 r0VarD2 = te0.w.D(i26.l.g(cVar2.N(106)), new r(this, 9));
        Function1 function1K3 = K();
        pfm.a aVar5 = new pfm.a(r0VarD2, new nw8.d(19, new e0(new BreadcrumbException(), 20)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        y.C(function1K3, aVar5, new t1i.n(14, u0.f299152a), "subscribe(...)", bVar);
        qfm.r0 r0VarD3 = te0.w.D(cVar2.N(7787), new r(this, 10));
        Function1 function1K4 = K();
        pfm.a aVar6 = new pfm.a(r0VarD3, new nw8.d(19, new e0(new BreadcrumbException(), 21)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        y.C(function1K4, aVar6, new t1i.n(14, v0.f299156a), "subscribe(...)", bVar);
        qfm.r0 r0VarD4 = te0.w.D(i26.l.g(cVar2.N(35)), new r(this, 11));
        Function1 function1K5 = K();
        pfm.a aVar7 = new pfm.a(r0VarD4, new nw8.d(19, new e0(new BreadcrumbException(), 22)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        y.C(function1K5, aVar7, new t1i.n(14, w0.f299158a), "subscribe(...)", bVar);
        qfm.r0 r0VarD5 = te0.w.D(i26.l.g(cVar2.N(105)), new r(this, 13));
        Function1 function1K6 = K();
        pfm.a aVar8 = new pfm.a(r0VarD5, new nw8.d(19, new e0(new BreadcrumbException(), 17)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        y.C(function1K6, aVar8, new t1i.n(14, x0.f299161a), "subscribe(...)", bVar);
        efm.b bVarFlatMapCompletable = i26.l.g(cVar2.N(328)).flatMapCompletable(new s(2, new r(this, 14)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K7 = K();
        nw8.d dVar = new nw8.d(19, new e0(new BreadcrumbException(), 18));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar9 = new pfm.a(bVarFlatMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        y.C(function1K7, aVar9, new t1i.n(14, s0.f299146a), "subscribe(...)", bVar);
        vpi.b bVar2 = (vpi.b) this.f299104p;
        NavBarWithAvatar navBarWithAvatar = bVar2.f291220j;
        if (navBarWithAvatar == null) {
            Intrinsics.r("navBarWithAvatarView");
            throw null;
        }
        pfm.h hVarB = te0.w.b(navBarWithAvatar.f59339b, new r(this, 4));
        Function1 function1K8 = K();
        pfm.a aVar10 = new pfm.a(hVarB, new nw8.d(19, new e0(new BreadcrumbException(), 12)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar10, "onErrorResumeNext(...)");
        y.C(function1K8, aVar10, new t1i.n(14, p0.f299137a), "subscribe(...)", bVar);
        NavBarWithAvatar navBarWithAvatar2 = bVar2.f291220j;
        if (navBarWithAvatar2 == null) {
            Intrinsics.r("navBarWithAvatarView");
            throw null;
        }
        efm.r rVarMergeWith = navBarWithAvatar2.f59338a.mergeWith(this.f299105q.f273801b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        pfm.h hVarB2 = te0.w.b(rVarMergeWith, new r(this, 5));
        Function1 function1K9 = K();
        pfm.a aVar11 = new pfm.a(hVarB2, new nw8.d(19, new e0(new BreadcrumbException(), 13)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar11, "onErrorResumeNext(...)");
        y.C(function1K9, aVar11, new t1i.n(14, q0.f299140a), "subscribe(...)", bVar);
        ypi.i iVar = this.f299106r;
        efm.b bVarFlatMapCompletable2 = iVar.s().flatMapCompletable(new s(11, new r(this, 28)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K10 = K();
        nw8.d dVar2 = new nw8.d(19, new e0(new BreadcrumbException(), 16));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar12 = new pfm.a(bVarFlatMapCompletable2, dVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar12, "onErrorResumeNext(...)");
        y.C(function1K10, aVar12, new t1i.n(14, r0.f299143a), "subscribe(...)", bVar);
        smd.s sVar = this.f299102m;
        efm.r rVarF = o70.a.f(sVar.M());
        f9b.f fVar = this.f299107s;
        efm.r rVarN = hx7.a.N(rVarF, fVar, false, false);
        u uVar = new u(this, 6);
        Function1 function1K11 = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(25, uVar), new ly7.g(25, function1K11), new t1i.n(14, function0J));
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        up5.e eVar = (up5.e) cVar;
        te0.j jVar = eVar.f281885s;
        KProperty[] kPropertyArr = up5.e.v;
        te0.e value = jVar.getValue(eVar, kPropertyArr[17]);
        te0.s sVar2 = te0.s.f270018a;
        efm.r rVarDistinctUntilChanged = value.c(sVar2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarF2 = o70.a.f(rVarDistinctUntilChanged);
        wk2.x xVar = new wk2.x(iVar, 24);
        Function1 function1K12 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF2.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new ly7.g(25, xVar), new ly7.g(25, function1K12), new t1i.n(14, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.r map = a0Var.t3().map(new s(21, new wnc.x(28)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarN3 = a0Var.n3();
        efm.r rVarDistinctUntilChanged2 = a0Var.x3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged3 = a0Var.y3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged4 = a0Var.v3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged4, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged5 = sVar.M().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged5, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged6 = a0Var.p3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged6, "distinctUntilChanged(...)");
        up5.e eVar2 = (up5.e) cVar;
        efm.r rVarDistinctUntilChanged7 = eVar2.f.getValue(eVar2, kPropertyArr[4]).c(sVar2).map(new s(22, new wnc.x(29))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged7, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged8 = a0Var.s3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged8, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged9 = a0Var.u3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged9, "distinctUntilChanged(...)");
        up5.e eVar3 = (up5.e) cVar;
        efm.r rVarC = eVar3.f281882p.getValue(eVar3, kPropertyArr[14]).c(sVar2);
        efm.r map2 = a0Var.A3().map(new s(23, new w(0)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarDistinctUntilChanged10 = a0Var.f281865w.switchMap(new up5.j(new up5.f(a0Var, 29), 18)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged10, "distinctUntilChanged(...)");
        efm.r map3 = te0.w.u(map, rVarN3, rVarDistinctUntilChanged2, rVarDistinctUntilChanged3, rVarDistinctUntilChanged4, rVarDistinctUntilChanged5, rVarDistinctUntilChanged6, rVarDistinctUntilChanged7, rVarDistinctUntilChanged8, rVarDistinctUntilChanged9, this.F, rVarC, map2, rVarDistinctUntilChanged10).map(new s(24, new u(this, 13)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarDistinctUntilChanged11 = map3.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged11, "distinctUntilChanged(...)");
        efm.r rVarN2 = hx7.a.N(o70.a.f(rVarDistinctUntilChanged11), fVar, false, false);
        wg2.g gVar = new wg2.g(this, view, 28);
        Function1 function1K13 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = rVarN2.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new ly7.g(25, gVar), new ly7.g(25, function1K13), new t1i.n(14, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        CryptoWithdrawToAddressReviewActivity cryptoWithdrawToAddressReviewActivity = (CryptoWithdrawToAddressReviewActivity) view;
        eq5.b0 b0VarC1 = cryptoWithdrawToAddressReviewActivity.c1();
        ?? r62 = cryptoWithdrawToAddressReviewActivity.z0;
        efm.b bVarFlatMapCompletable3 = ((eq5.e0) b0VarC1).f128266c.doOnNext(new s(4, new r(this, 18))).flatMapCompletable(new s(5, new r(this, 19)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K14 = K();
        nw8.d dVar3 = new nw8.d(19, new e0(new BreadcrumbException(), 23));
        bVarFlatMapCompletable3.getClass();
        pfm.a aVar13 = new pfm.a(bVarFlatMapCompletable3, dVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar13, "onErrorResumeNext(...)");
        y.C(function1K14, aVar13, new t1i.n(14, y0.f299162a), "subscribe(...)", bVar);
        efm.r rVarMerge = efm.r.merge(((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().f51966j.f121375b, ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().k.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        r rVar = new r(this, 6);
        Function1 function1K15 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarMerge.onErrorResumeNext(new nw8.d(19, new vx5.r(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new ly7.g(25, rVar), new ly7.g(25, function1K15), new t1i.n(14, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        ihm.f fVar2 = ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().o.f121375b;
        r rVar2 = new r(this, 23);
        Function1 function1K16 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = fVar2.onErrorResumeNext(new nw8.d(19, new vx5.r(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new ly7.g(25, rVar2), new ly7.g(25, function1K16), new t1i.n(14, function0J5));
        te0.w.j0(bVar, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarMerge2 = efm.r.merge(((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().f51965h.f121375b, ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().i.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        qfm.r0 r0VarD6 = te0.w.D(rVarMerge2, new r(this, 22));
        Function1 function1K17 = K();
        pfm.a aVar14 = new pfm.a(r0VarD6, new nw8.d(19, new vx5.r(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar14, "onErrorResumeNext(...)");
        y.C(function1K17, aVar14, new t1i.n(14, d0.f299112a), "subscribe(...)", bVar);
        qfm.r0 r0VarD7 = te0.w.D(((FullScreenStateDelegate) ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).f.getValue()).f52371h.f121375b, new r(this, 29));
        Function1 function1K18 = K();
        pfm.a aVar15 = new pfm.a(r0VarD7, new nw8.d(19, new e0(new BreadcrumbException(), 10)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar15, "onErrorResumeNext(...)");
        y.C(function1K18, aVar15, new t1i.n(14, m0.f299132a), "subscribe(...)", bVar);
        efm.r map4 = ((CellDetailsDelegate) ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).d.getValue()).d.map(new wl3.b(new wnc.x(26), 25));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        qfm.r0 r0VarD8 = te0.w.D(map4, new r(this, 12));
        Function1 function1K19 = K();
        pfm.a aVar16 = new pfm.a(r0VarD8, new nw8.d(19, new e0(new BreadcrumbException(), 2)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar16, "onErrorResumeNext(...)");
        y.C(function1K19, aVar16, new t1i.n(14, f0.f299119a), "subscribe(...)", bVar);
        efm.r map5 = ((CellDetailsDelegate) ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).d.getValue()).f.map(new wl3.b(new wnc.x(27), 26));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        r rVar3 = new r(this, 20);
        Function1 function1K20 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = map5.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new ly7.g(25, rVar3), new ly7.g(25, function1K20), new t1i.n(14, function0J6));
        te0.w.j0(bVar, cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        qfm.r0 r0VarD9 = te0.w.D(((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().f.f121375b, new r(this, 21));
        Function1 function1K21 = K();
        pfm.a aVar17 = new pfm.a(r0VarD9, new nw8.d(19, new e0(new BreadcrumbException(), 11)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar17, "onErrorResumeNext(...)");
        y.C(function1K21, aVar17, new t1i.n(14, n0.f299133a), "subscribe(...)", bVar);
        ihm.f fVar3 = ((eq5.e0) cryptoWithdrawToAddressReviewActivity.c1()).b().e.f121375b;
        r rVar4 = new r(this, 26);
        Function1 function1K22 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = fVar3.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new ly7.g(25, rVar4), new ly7.g(25, function1K22), new t1i.n(14, function0J7));
        te0.w.j0(bVar, cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        qfm.r0 r0VarD10 = te0.w.D(((RowDelegate) cryptoWithdrawToAddressReviewActivity.y0.getValue()).f53218h, new r(this, 27));
        Function1 function1K23 = K();
        pfm.a aVar18 = new pfm.a(r0VarD10, new nw8.d(19, new e0(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar18, "onErrorResumeNext(...)");
        y.C(function1K23, aVar18, new t1i.n(14, g0.f299120a), "subscribe(...)", bVar);
        qfm.r0 r0VarD11 = te0.w.D(((LargeActionButtonDelegate) cryptoWithdrawToAddressReviewActivity.f71179x0.getValue()).d.f121375b, new r(this, 7));
        Function1 function1K24 = K();
        pfm.a aVar19 = new pfm.a(r0VarD11, new nw8.d(19, new e0(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar19, "onErrorResumeNext(...)");
        y.C(function1K24, aVar19, new t1i.n(14, i0.f299122a), "subscribe(...)", bVar);
        qfm.r0 r0VarD12 = te0.w.D(((TwinHorizontalButtonDelegate) r62.getValue()).f53572c.f121375b, new r(this, 16));
        Function1 function1K25 = K();
        pfm.a aVar20 = new pfm.a(r0VarD12, new nw8.d(19, new e0(new BreadcrumbException(), 8)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar20, "onErrorResumeNext(...)");
        y.C(function1K25, aVar20, new t1i.n(14, k0.f299127a), "subscribe(...)", bVar);
        qfm.r0 r0VarD13 = te0.w.D(((TwinHorizontalButtonDelegate) r62.getValue()).d.f121375b, new r(this, 17));
        Function1 function1K26 = K();
        pfm.a aVar21 = new pfm.a(r0VarD13, new nw8.d(19, new e0(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar21, "onErrorResumeNext(...)");
        y.C(function1K26, aVar21, new t1i.n(14, l0.f299130a), "subscribe(...)", bVar);
        opi.b bVar3 = (opi.b) this.f299103n;
        efm.b bVarFlatMapCompletable4 = bVar3.W0().flatMapCompletable(new s(28, new u(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable4, "flatMapCompletable(...)");
        Function1 function1K27 = K();
        nw8.d dVar4 = new nw8.d(19, new e0(new BreadcrumbException(), 7));
        bVarFlatMapCompletable4.getClass();
        pfm.a aVar22 = new pfm.a(bVarFlatMapCompletable4, dVar4, 2);
        Intrinsics.checkNotNullExpressionValue(aVar22, "onErrorResumeNext(...)");
        y.C(function1K27, aVar22, new t1i.n(14, j0.f299123a), "subscribe(...)", bVar);
        efm.r rVarDoOnNext = bVar3.R().doOnNext(new s(6, new r(this, 24)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        qfm.r0 r0VarD14 = te0.w.D(rVarDoOnNext, new r(this, 25));
        Function1 function1K28 = K();
        pfm.a aVar23 = new pfm.a(r0VarD14, new nw8.d(19, new e0(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar23, "onErrorResumeNext(...)");
        y.C(function1K28, aVar23, new t1i.n(14, h0.f299121a), "subscribe(...)", bVar);
        efm.r map6 = iVar.a().map(new s(3, new r(this, 15)));
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        efm.r rVarF3 = o70.a.f(map6);
        wma.e eVar4 = new wma.e(1, view, o.class, "setBottomPadding", "setBottomPadding(I)V", 0, 1);
        Function1 function1K29 = K();
        Function0 function0J8 = J();
        efm.r rVarOnErrorResumeNext8 = rVarF3.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new ly7.g(25, eVar4), new ly7.g(25, function1K29), new t1i.n(14, function0J8));
        te0.w.j0(bVar, cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        efm.r rVarA = msb.a.a(this.u);
        Function1 function1K30 = K();
        Function0 function0J9 = J();
        efm.r rVarOnErrorResumeNext9 = rVarA.onErrorResumeNext(new nw8.d(19, new e0(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new ly7.g(25, z0.f299164a), new ly7.g(25, function1K30), new t1i.n(14, function0J9));
        te0.w.j0(bVar, cVarSubscribe9);
        Intrinsics.h(cVarSubscribe9);
        if (((jte.d) this.z).c(RevolutXCommonApi$Toggles.RevolutXPromo.f84262c)) {
            pfm.h hVarN = pd.b.n(skm.p0.f264003c, new w76.a(this, null, 28));
            Function1 function1K31 = K();
            pfm.a aVar24 = new pfm.a(hVarN, new nw8.d(19, new e0(new BreadcrumbException(), 28)), 2);
            Intrinsics.checkNotNullExpressionValue(aVar24, "onErrorResumeNext(...)");
            y.C(function1K31, aVar24, new t1i.n(14, b1.f299098a), "subscribe(...)", bVar);
        }
    }

    public final efm.d0 R() {
        efm.d0 d0VarFirstOrError = m70.a.g(((up5.a0) this.i).n3(), null, new wm9.k(12), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final ufm.i S() {
        efm.r rVarFilter = ((up5.a0) this.i).f281865w.filter(new up5.j(new up5.h(15), 7));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        efm.d0 d0VarFirstOrError = te0.w.a0(rVarFilter, new up5.h(16)).firstOrError();
        up5.j jVar = new up5.j(new up5.h(17), 8);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final pfm.a T() {
        pfm.n nVar = new pfm.n(new t(this, 1), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        pfm.r rVarD = o70.a.d(nVar);
        efm.d0 d0VarFirstOrError = ((up5.a0) this.i).B3().firstOrError();
        s sVar = new s(18, new u(this, 9));
        d0VarFirstOrError.getClass();
        pfm.a aVarE = rVarD.e(new pfm.a(d0VarFirstOrError, sVar, 4));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.a U() {
        ufm.i iVar = new ufm.i(o70.a.e(R()), new wl3.b(new r(this, 1), 29), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        pfm.a aVar = new pfm.a(iVar, new x(new u(this, 17), 1), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final pfm.a V() {
        up5.a0 a0Var = (up5.a0) this.i;
        efm.d0 d0VarFirstOrError = te0.w.m(a0Var.w3(), m70.a.g(nim.a.w(a0Var.n3(), new up5.h(26)), null, null, 3), a0Var.A3()).firstOrError();
        up5.j jVar = new up5.j(new up5.l(a0Var, 2), 24);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarFirstOrError, jVar, 0), new up5.j(new up5.l(a0Var, 3), 25), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        efm.d0 d0VarD = efm.d0.D(iVar, m70.a.g(a0Var.n3(), null, null, 3).firstOrError(), new wl3.b(new wm9.k(13), 27));
        Intrinsics.checkNotNullExpressionValue(d0VarD, "zipWith(...)");
        pfm.a aVar = new pfm.a(hx7.a.O(d0VarD, this.f299107s, false, null, 24), new wl3.b(new r(this, 0), 28), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final void W() {
        pfm.a aVar;
        ofm.h hVar = this.H;
        if (hVar != null) {
            lfm.d.a(hVar);
        }
        if (this.A.f145090h) {
            aVar = new pfm.a(te0.w.o0(skm.p0.f264003c, new wgb.v(this, null)), new s(7, new u(this, 0)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        } else {
            efm.d0 d0VarFirstOrError = m70.a.g(zi0.c.J(((up5.a0) this.i).n3()), null, new wm9.k(14), 1).firstOrError();
            s sVar = new s(12, new u(this, 4));
            d0VarFirstOrError.getClass();
            pfm.a aVar2 = new pfm.a(new ufm.i(d0VarFirstOrError, sVar, 0), new s(13, new u(this, 5)), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            aVar = aVar2;
        }
        Function1 function1K = K();
        pfm.a aVar3 = new pfm.a(aVar, new nw8.d(19, new e0(new BreadcrumbException(), 26)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new ly7.g(25, function1K), new t1i.n(14, a1.f299096a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.f239031a, hVarW);
        this.H = hVarW;
    }

    public final efm.b X() {
        up5.a0 a0Var = (up5.a0) this.i;
        efm.b bVarFlatMapCompletable = te0.w.l(a0Var.z3(), a0Var.A3()).flatMapCompletable(new s(17, new u(this, 8)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }

    public final void Y(efm.b bVar) {
        nw8.d dVar = new nw8.d(19, new e0(new BreadcrumbException(), 27));
        bVar.getClass();
        pfm.a aVar = new pfm.a(bVar, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new w38.w(4, K()), new lm.b(1));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(this.G, hVarW);
    }

    public final pfm.a Z(xi0.b currency, xi0.b bVar, String str, k1j.a aVar, AccountId accountId) {
        up5.a0 a0Var = (up5.a0) this.i;
        efm.d0 d0VarFirstOrError = a0Var.x3().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        efm.d0 d0VarFirstOrError2 = a0Var.C3().firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
        pfm.a aVar2 = new pfm.a(new ufm.i(te0.w.H0(d0VarFirstOrError, d0VarFirstOrError2), new s(26, new vx9.v(this, 25, currency, bVar)), 0), new s(27, new u(this, 15)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        CryptoWithdrawToAddressContract$FundingSourceInput input = new CryptoWithdrawToAddressContract$FundingSourceInput(aVar, accountId, str);
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        pfm.a aVarE = aVar2.e(te0.w.A0(((up5.e) a0Var.f281852b).E0(), currency));
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        up5.e eVar = (up5.e) a0Var.f281852b;
        pfm.a aVarE2 = aVarE.e(te0.w.A0(eVar.f281886t.getValue(eVar, up5.e.v[18]), input)).e(new pfm.h(ue0.e.F(te0.w.o0(skm.p0.f264003c, new o0(this, bVar, currency, null, 1)), ae5.b.CONTINUE_FLOW), 4));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return aVarE2;
    }
}
