package zc0;

import com.revolut.core.backend_flow.R$string;
import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import ip0.u00;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class y2 extends pri.b implements h {

    @NotNull
    public static final c0 Companion = new c0();
    public final ihm.b A;
    public final zd7.a B;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f321162h;
    public final qc0.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ypi.i f321163j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final npi.a f321164l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xpi.g f321165m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k3l.b f321166n;
    public final rpi.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zd7.b f321167p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tpi.j f321168q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final opi.d f321169r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cqi.h f321170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final qc0.i1 f321171t;
    public final oc0.f u;
    public final fc0.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final oc0.m f321172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t9l.g f321173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final oc0.k f321174y;
    public final f01.c z;

    public y2(cqi.h promptView, f01.c uiKitResources, fc0.f backendFlowEntitiesInteractor, k3l.b statusDialogView, npi.a dialogView, oc0.f cardsRepository, oc0.k entitiesSummaryRepository, oc0.m backendFlowTicketsRepository, opi.d expandableDialogView, qc0.j router, qc0.i1 backendFlowTransactionsProvider, rpi.c keyboardView, t9l.g sharedTransactionInteractor, tpi.j progressView, xpi.g navBarWithToolbarView, ypi.i nextButtonView, c backendFlowItemsMapper, g presentationModel, zd7.b imagePickerBottomDialog) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(backendFlowItemsMapper, "backendFlowItemsMapper");
        Intrinsics.checkNotNullParameter(dialogView, "dialogView");
        Intrinsics.checkNotNullParameter(navBarWithToolbarView, "navBarWithToolbarView");
        Intrinsics.checkNotNullParameter(statusDialogView, "statusDialogView");
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(imagePickerBottomDialog, "imagePickerBottomDialog");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(backendFlowTransactionsProvider, "backendFlowTransactionsProvider");
        Intrinsics.checkNotNullParameter(cardsRepository, "cardsRepository");
        Intrinsics.checkNotNullParameter(backendFlowEntitiesInteractor, "backendFlowEntitiesInteractor");
        Intrinsics.checkNotNullParameter(backendFlowTicketsRepository, "backendFlowTicketsRepository");
        Intrinsics.checkNotNullParameter(sharedTransactionInteractor, "sharedTransactionInteractor");
        Intrinsics.checkNotNullParameter(entitiesSummaryRepository, "entitiesSummaryRepository");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f321162h = presentationModel;
        this.i = router;
        this.f321163j = nextButtonView;
        this.k = backendFlowItemsMapper;
        this.f321164l = dialogView;
        this.f321165m = navBarWithToolbarView;
        this.f321166n = statusDialogView;
        this.o = keyboardView;
        this.f321167p = imagePickerBottomDialog;
        this.f321168q = progressView;
        this.f321169r = expandableDialogView;
        this.f321170s = promptView;
        this.f321171t = backendFlowTransactionsProvider;
        this.u = cardsRepository;
        this.v = backendFlowEntitiesInteractor;
        this.f321172w = backendFlowTicketsRepository;
        this.f321173x = sharedTransactionInteractor;
        this.f321174y = entitiesSummaryRepository;
        this.z = uiKitResources;
        m70.a.c(kotlin.jvm.internal.t0.f186434a);
        ihm.b bVarE = ihm.b.e("");
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.A = bVarE;
        this.B = new zd7.a(false, u00.BACK, 4);
    }

    public static final pfm.a N(y2 y2Var, rp0.y yVar) {
        y2Var.getClass();
        pfm.a aVarE = new pfm.h(new r(y2Var, 5), 2).e(((opi.b) y2Var.f321169r).a0(yVar));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public static efm.r V(g gVar) {
        efm.r rVarFlatMapMaybe = gVar.w0().flatMapMaybe(new b0(new v(new z(6), 1), 15));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapMaybe, "flatMapMaybe(...)");
        return rVarFlatMapMaybe;
    }

    public static efm.r d0(g gVar) {
        return gVar.w0().flatMapMaybe(new x(21, new z(5)));
    }

    public static efm.r e0(g gVar) {
        return gVar.w0().flatMapMaybe(new x(29, new z(7))).distinctUntilChanged();
    }

    @Override // pri.b
    public final void M(rri.a aVar) {
        i view = (i) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.M(view);
        NavBarWithToolbar navBarWithToolbar = ((xpi.c) this.f321165m).f307974j;
        if (navBarWithToolbar != null) {
            navBarWithToolbar.setExpanded(true, false);
        } else {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
    }

    @Override // pri.b, pri.e
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void h(i view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        Y();
        tx0.j0 j0Var = tx0.j0.MULTILINE_LARGE;
        xpi.c cVar = (xpi.c) this.f321165m;
        cVar.c0(j0Var);
        TextLocalisedClause hint = new TextLocalisedClause(R$string.form_builder_search, null, null, 14);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(hint, "hint");
        NavBarWithToolbar navBarWithToolbar = cVar.f307974j;
        if (navBarWithToolbar == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        navBarWithToolbar.setHint(hint);
        efm.r rVarB = cVar.b();
        int i = 13;
        zab.s sVar = new zab.s(this, 13);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarB.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new twl.o(13, sVar), new twl.o(13, function1K), new yzc.p(7, function0J));
        te0.w.j0(G(), cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        g gVar = this.f321162h;
        efm.r rVarF = o70.a.f(S(gVar));
        t tVar = new t(this, 2);
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new twl.o(13, tVar), new twl.o(13, function1K2), new yzc.p(7, function0J2));
        te0.w.j0(G(), cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        efm.b bVarSwitchMapCompletable = gVar.R().switchMapCompletable(new n(new t(this, 11), 19));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K3 = K();
        pfm.a aVarU = bVarSwitchMapCompletable.u(new nii.o0(28, new o0(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(aVarU, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K3, aVarU, new yzc.p(7, i0.f321062a), "subscribe(...)"));
        sfm.b bVarW0 = gVar.w0();
        t tVar2 = new t(this, 22);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = bVarW0.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), i)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new twl.o(13, tVar2), new twl.o(13, function1K4), new yzc.p(7, function0J3));
        te0.w.j0(G(), cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.b bVarSwitchMapCompletable2 = T(gVar).switchMapCompletable(new n(new zab.s(this, 20), 28));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "switchMapCompletable(...)");
        Function1 function1K5 = K();
        pfm.a aVarU2 = bVarSwitchMapCompletable2.u(new nii.o0(28, new x1(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(aVarU2, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K5, aVarU2, new yzc.p(7, d2.f321034a), "subscribe(...)"));
        qfm.r0 r0VarD = te0.w.D(U(gVar), new y(this, 4));
        Function1 function1K6 = K();
        int i2 = 17;
        pfm.a aVarU3 = r0VarD.u(new nii.o0(28, new x1(new BreadcrumbException(), i2)));
        Intrinsics.checkNotNullExpressionValue(aVarU3, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K6, aVarU3, new yzc.p(7, e2.f321042a), "subscribe(...)"));
        qfm.r0 r0VarD2 = te0.w.D(a0(gVar), new zab.s(this, 21));
        Function1 function1K7 = K();
        pfm.a aVarU4 = r0VarD2.u(new nii.o0(28, new x1(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(aVarU4, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K7, aVarU4, new yzc.p(7, f2.f321049a), "subscribe(...)"));
        qfm.r0 r0VarD3 = te0.w.D(b0(gVar), new y(this, i));
        Function1 function1K8 = K();
        pfm.a aVarU5 = r0VarD3.u(new nii.o0(28, new x1(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(aVarU5, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K8, aVarU5, new yzc.p(7, g2.f321055a), "subscribe(...)"));
        efm.r rVarF2 = o70.a.f(c0(gVar));
        y yVar = new y(this, i2);
        Function1 function1K9 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = rVarF2.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new twl.o(13, yVar), new twl.o(13, function1K9), new yzc.p(7, function0J4));
        te0.w.j0(G(), cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        efm.r rVarF3 = o70.a.f(gVar.f1());
        y yVar2 = new y(this, 24);
        Function1 function1K10 = K();
        Function0 function0J5 = J();
        efm.r rVarOnErrorResumeNext5 = rVarF3.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new twl.o(13, yVar2), new twl.o(13, function1K10), new yzc.p(7, function0J5));
        te0.w.j0(G(), cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
        efm.r rVarF4 = o70.a.f(gVar.X2());
        a0 a0Var = new a0(this, 1);
        Function1 function1K11 = K();
        Function0 function0J6 = J();
        efm.r rVarOnErrorResumeNext6 = rVarF4.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new twl.o(13, a0Var), new twl.o(13, function1K11), new yzc.p(7, function0J6));
        te0.w.j0(G(), cVarSubscribe6);
        Intrinsics.h(cVarSubscribe6);
        efm.r rVarFlatMapSingle = gVar.w0().flatMapSingle(new n(new t(this, 4), 12));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapSingle, "flatMapSingle(...)");
        efm.r rVarF5 = o70.a.f(rVarFlatMapSingle);
        zab.s sVar2 = new zab.s(this.f321163j, 22);
        Function1 function1K12 = K();
        Function0 function0J7 = J();
        efm.r rVarOnErrorResumeNext7 = rVarF5.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new twl.o(13, sVar2), new twl.o(13, function1K12), new yzc.p(7, function0J7));
        te0.w.j0(G(), cVarSubscribe7);
        Intrinsics.h(cVarSubscribe7);
        int i3 = 5;
        efm.b bVarSwitchMapCompletable3 = gVar.w0().switchMapCompletable(new n(new t(this, i3), 13));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable3, "switchMapCompletable(...)");
        Function1 function1K13 = K();
        pfm.a aVarU6 = bVarSwitchMapCompletable3.u(new nii.o0(28, new x1(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(aVarU6, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K13, aVarU6, new yzc.p(7, h2.f321059a), "subscribe(...)"));
        efm.r rVarF6 = o70.a.f(uc0.d.a(gVar));
        t tVar3 = new t(this, 6);
        Function1 function1K14 = K();
        Function0 function0J8 = J();
        efm.r rVarOnErrorResumeNext8 = rVarF6.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), i3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new twl.o(13, tVar3), new twl.o(13, function1K14), new yzc.p(7, function0J8));
        te0.w.j0(G(), cVarSubscribe8);
        Intrinsics.h(cVarSubscribe8);
        efm.b bVarSwitchMapCompletable4 = d0(gVar).switchMapCompletable(new n(new t(this, 7), 14));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable4, "switchMapCompletable(...)");
        Function1 function1K15 = K();
        pfm.a aVarU7 = bVarSwitchMapCompletable4.u(new nii.o0(28, new x1(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(aVarU7, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K15, aVarU7, new yzc.p(7, y1.f321161a), "subscribe(...)"));
        efm.b bVarSwitchMapCompletable5 = gVar.w0().switchMapCompletable(new n(new t(this, 9), 15));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable5, "switchMapCompletable(...)");
        Function1 function1K16 = K();
        pfm.a aVarU8 = bVarSwitchMapCompletable5.u(new nii.o0(28, new x1(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(aVarU8, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K16, aVarU8, new yzc.p(7, z1.f321179a), "subscribe(...)"));
        efm.b bVarSwitchMapCompletable6 = V(gVar).switchMapCompletable(new n(new t(this, 10), 16));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable6, "switchMapCompletable(...)");
        Function1 function1K17 = K();
        pfm.a aVarU9 = bVarSwitchMapCompletable6.u(new nii.o0(28, new x1(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(aVarU9, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K17, aVarU9, new yzc.p(7, a2.f321002a), "subscribe(...)"));
        efm.b bVarSwitchMapCompletable7 = gVar.w0().switchMapCompletable(new n(new t(this, 12), 17));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable7, "switchMapCompletable(...)");
        Function1 function1K18 = K();
        pfm.a aVarU10 = bVarSwitchMapCompletable7.u(new nii.o0(28, new x1(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(aVarU10, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K18, aVarU10, new yzc.p(7, b2.f321012a), "subscribe(...)"));
        efm.r rVarE0 = e0(gVar);
        Intrinsics.checkNotNullExpressionValue(rVarE0, "observeToolbarVisibility(...)");
        efm.r rVarF7 = o70.a.f(rVarE0);
        t tVar4 = new t(this, 13);
        Function1 function1K19 = K();
        Function0 function0J9 = J();
        efm.r rVarOnErrorResumeNext9 = rVarF7.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new twl.o(13, tVar4), new twl.o(13, function1K19), new yzc.p(7, function0J9));
        te0.w.j0(G(), cVarSubscribe9);
        Intrinsics.h(cVarSubscribe9);
        efm.r rVarD = uc0.d.d(gVar);
        Intrinsics.checkNotNullExpressionValue(rVarD, "observeTitle(...)");
        efm.r rVarF8 = o70.a.f(te0.w.l(rVarD, gVar.n()));
        t tVar5 = new t(this, 14);
        Function1 function1K20 = K();
        Function0 function0J10 = J();
        efm.r rVarOnErrorResumeNext10 = rVarF8.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext10, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe10 = rVarOnErrorResumeNext10.subscribe(new twl.o(13, tVar5), new twl.o(13, function1K20), new yzc.p(7, function0J10));
        te0.w.j0(G(), cVarSubscribe10);
        Intrinsics.h(cVarSubscribe10);
        efm.r rVarB2 = uc0.d.b(gVar);
        Intrinsics.checkNotNullExpressionValue(rVarB2, "observeDescription(...)");
        efm.r rVarL = te0.w.l(o70.a.f(rVarB2), o70.a.f(uc0.d.c(gVar)));
        t tVar6 = new t(this, 15);
        Function1 function1K21 = K();
        Function0 function0J11 = J();
        efm.r rVarOnErrorResumeNext11 = rVarL.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext11, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe11 = rVarOnErrorResumeNext11.subscribe(new twl.o(13, tVar6), new twl.o(13, function1K21), new yzc.p(7, function0J11));
        te0.w.j0(G(), cVarSubscribe11);
        Intrinsics.h(cVarSubscribe11);
        NavBarWithToolbar navBarWithToolbar2 = cVar.f307974j;
        if (navBarWithToolbar2 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        qfm.r0 r0VarD4 = te0.w.D(navBarWithToolbar2.x0(), new t(this, 16));
        Function1 function1K22 = K();
        pfm.a aVarU11 = r0VarD4.u(new nii.o0(28, new x1(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(aVarU11, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K22, aVarU11, new yzc.p(7, c2.f321030a), "subscribe(...)"));
        efm.r rVarF9 = o70.a.f(X(gVar));
        t tVar7 = new t(this, 17);
        Function1 function1K23 = K();
        Function0 function0J12 = J();
        efm.r rVarOnErrorResumeNext12 = rVarF9.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext12, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe12 = rVarOnErrorResumeNext12.subscribe(new twl.o(13, tVar7), new twl.o(13, function1K23), new yzc.p(7, function0J12));
        te0.w.j0(G(), cVarSubscribe12);
        Intrinsics.h(cVarSubscribe12);
        efm.r rVarW = W(gVar);
        Intrinsics.checkNotNullExpressionValue(rVarW, "observeHeaderVisibility(...)");
        efm.r rVarF10 = o70.a.f(rVarW);
        t tVar8 = new t(this, 18);
        Function1 function1K24 = K();
        Function0 function0J13 = J();
        efm.r rVarOnErrorResumeNext13 = rVarF10.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext13, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe13 = rVarOnErrorResumeNext13.subscribe(new twl.o(13, tVar8), new twl.o(13, function1K24), new yzc.p(7, function0J13));
        te0.w.j0(G(), cVarSubscribe13);
        Intrinsics.h(cVarSubscribe13);
        int i5 = 20;
        efm.r rVarFlatMap = gVar.w0().distinctUntilChanged(new n(new zbj.j0(24), i5)).flatMap(new n(new t(this, 19), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        efm.b bVarFlatMapCompletable = m70.a.g(rVarFlatMap, null, null, 3).flatMapCompletable(new n(new t(this, i5), 22));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        pfm.r rVarG = o70.a.g(bVarFlatMapCompletable);
        m mVar = new m(2);
        t tVar9 = new t(this, 21);
        pfm.a aVarU12 = rVarG.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(aVarU12, "onErrorResumeNext(...)");
        ofm.h hVarW = aVarU12.w(new twl.o(13, tVar9), new yzc.p(7, mVar));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(G(), hVarW);
        sfm.b bVarW02 = gVar.w0();
        efm.r rVarQ2 = gVar.q2();
        ihm.b bVar = this.A;
        efm.b bVarSwitchMapCompletable8 = te0.w.m(bVarW02, rVarQ2, bVar).switchMapCompletable(new n(new z8g.q(this, view, 26), 23));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable8, "switchMapCompletable(...)");
        Function1 function1K25 = K();
        pfm.a aVarU13 = bVarSwitchMapCompletable8.u(new nii.o0(28, new o0(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(aVarU13, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K25, aVarU13, new yzc.p(7, u0.f321134a), "subscribe(...)"));
        efm.r rVarFlatMapIterable = Z().flatMapIterable(new n(new zbj.j0(25), 24));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapIterable, "flatMapIterable(...)");
        qfm.r0 r0VarD5 = te0.w.D(rVarFlatMapIterable, new zab.s(gVar, 12));
        Function1 function1K26 = K();
        pfm.a aVarU14 = r0VarD5.u(new nii.o0(28, new o0(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(aVarU14, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K26, aVarU14, new yzc.p(7, f1.f321048a), "subscribe(...)"));
        efm.r rVarF11 = o70.a.f(f0());
        w wVar = new w(view, 0);
        Function1 function1K27 = K();
        Function0 function0J14 = J();
        efm.r rVarOnErrorResumeNext14 = rVarF11.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext14, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe14 = rVarOnErrorResumeNext14.subscribe(new twl.o(13, wVar), new twl.o(13, function1K27), new yzc.p(7, function0J14));
        te0.w.j0(G(), cVarSubscribe14);
        Intrinsics.h(cVarSubscribe14);
        BackendScreenFragment backendScreenFragment = (BackendScreenFragment) view;
        efm.b bVarIgnoreElements = backendScreenFragment.z0().flatMap(new n(new t(this, 23), 25)).ignoreElements();
        Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
        Function1 function1K28 = K();
        pfm.a aVarU15 = bVarIgnoreElements.u(new nii.o0(28, new o0(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(aVarU15, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K28, aVarU15, new yzc.p(7, q1.f321109a), "subscribe(...)"));
        sfm.b bVarW03 = gVar.w0();
        s1 s1Var = s1.f;
        int i6 = 24;
        efm.r rVarFlatMap2 = bVarW03.filter(new x2l.a(i6)).flatMap(new n(new o(backendScreenFragment, 1), 26));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        qfm.r0 r0VarD6 = te0.w.D(rVarFlatMap2, new t(this, i6));
        Function1 function1K29 = K();
        pfm.a aVarU16 = r0VarD6.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(aVarU16, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K29, aVarU16, new yzc.p(7, r1.f321115a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable2 = backendScreenFragment.V().distinctUntilChanged().flatMapCompletable(new n(new t(this, 25), 27));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        Function1 function1K30 = K();
        pfm.a aVarU17 = bVarFlatMapCompletable2.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(aVarU17, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K30, aVarU17, new yzc.p(7, d0.f321032a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable3 = backendScreenFragment.H().distinctUntilChanged().flatMapCompletable(new n(new t(this, 26), 29));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable3, "flatMapCompletable(...)");
        Function1 function1K31 = K();
        pfm.a aVarU18 = bVarFlatMapCompletable3.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(aVarU18, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K31, aVarU18, new yzc.p(7, e0.f321040a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable4 = backendScreenFragment.M().flatMapCompletable(new x(1, new t(this, 27)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable4, "flatMapCompletable(...)");
        Function1 function1K32 = K();
        pfm.a aVarU19 = bVarFlatMapCompletable4.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(aVarU19, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K32, aVarU19, new yzc.p(7, f0.f321047a), "subscribe(...)"));
        efm.r rVarDistinctUntilChanged = backendScreenFragment.W().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        qfm.r0 r0VarD7 = te0.w.D(rVarDistinctUntilChanged, new t(this, 28));
        Function1 function1K33 = K();
        pfm.a aVarU20 = r0VarD7.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(aVarU20, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K33, aVarU20, new yzc.p(7, g0.f321053a), "subscribe(...)"));
        efm.r rVarDistinctUntilChanged2 = backendScreenFragment.getJ0().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        qfm.r0 r0VarD8 = te0.w.D(rVarDistinctUntilChanged2, new t(this, 29));
        Function1 function1K34 = K();
        pfm.a aVarU21 = r0VarD8.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(aVarU21, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K34, aVarU21, new yzc.p(7, h0.f321057a), "subscribe(...)"));
        efm.r rVarDistinctUntilChanged3 = backendScreenFragment.O().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged3, "distinctUntilChanged(...)");
        qfm.r0 r0VarD9 = te0.w.D(rVarDistinctUntilChanged3, new y(this, 0));
        Function1 function1K35 = K();
        pfm.a aVarU22 = r0VarD9.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(aVarU22, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K35, aVarU22, new yzc.p(7, j0.f321066a), "subscribe(...)"));
        efm.r rVarDistinctUntilChanged4 = backendScreenFragment.getK0().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged4, "distinctUntilChanged(...)");
        qfm.r0 r0VarD10 = te0.w.D(rVarDistinctUntilChanged4, new y(this, 1));
        Function1 function1K36 = K();
        pfm.a aVarU23 = r0VarD10.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(aVarU23, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K36, aVarU23, new yzc.p(7, k0.f321073a), "subscribe(...)"));
        qfm.r0 r0VarD11 = te0.w.D(backendScreenFragment.Q(), new y(this, 2));
        Function1 function1K37 = K();
        pfm.a aVarU24 = r0VarD11.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(aVarU24, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K37, aVarU24, new yzc.p(7, l0.f321078a), "subscribe(...)"));
        qfm.r0 r0VarD12 = te0.w.D(backendScreenFragment.I(), new y(this, 3));
        Function1 function1K38 = K();
        pfm.a aVarU25 = r0VarD12.u(new nii.o0(28, new zae.j(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(aVarU25, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K38, aVarU25, new yzc.p(7, m0.f321084a), "subscribe(...)"));
        ihm.f fVarC0 = backendScreenFragment.c0();
        qc0.j jVar = this.i;
        efm.b bVarFlatMapCompletable5 = fVarC0.flatMapCompletable(new x(2, new zab.s(jVar, 14)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable5, "flatMapCompletable(...)");
        Function1 function1K39 = K();
        pfm.a aVarU26 = bVarFlatMapCompletable5.u(new nii.o0(28, new o0(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(aVarU26, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K39, aVarU26, new yzc.p(7, n0.f321090a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable6 = backendScreenFragment.d0().flatMapCompletable(new x(3, new y(this, 5)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable6, "flatMapCompletable(...)");
        Function1 function1K40 = K();
        pfm.a aVarU27 = bVarFlatMapCompletable6.u(new nii.o0(28, new o0(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(aVarU27, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K40, aVarU27, new yzc.p(7, p0.f321102a), "subscribe(...)"));
        qfm.r0 r0VarD13 = te0.w.D(backendScreenFragment.e0(), new y(this, 6));
        Function1 function1K41 = K();
        pfm.a aVarU28 = r0VarD13.u(new nii.o0(28, new o0(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(aVarU28, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K41, aVarU28, new yzc.p(7, q0.f321108a), "subscribe(...)"));
        qfm.r0 r0VarD14 = te0.w.D(backendScreenFragment.F0(), new y(this, 7));
        Function1 function1K42 = K();
        pfm.a aVarU29 = r0VarD14.u(new nii.o0(28, new o0(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(aVarU29, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K42, aVarU29, new yzc.p(7, r0.f321114a), "subscribe(...)"));
        qfm.r0 r0VarD15 = te0.w.D(backendScreenFragment.H0(), new y(this, 8));
        Function1 function1K43 = K();
        pfm.a aVarU30 = r0VarD15.u(new nii.o0(28, new o0(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(aVarU30, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K43, aVarU30, new yzc.p(7, s0.f321120a), "subscribe(...)"));
        qfm.r0 r0VarD16 = te0.w.D(backendScreenFragment.J(), new y(this, 9));
        Function1 function1K44 = K();
        pfm.a aVarU31 = r0VarD16.u(new nii.o0(28, new o0(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(aVarU31, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K44, aVarU31, new yzc.p(7, t0.f321127a), "subscribe(...)"));
        qfm.r0 r0VarD17 = te0.w.D(backendScreenFragment.G0(), new y(this, 10));
        Function1 function1K45 = K();
        pfm.a aVarU32 = r0VarD17.u(new nii.o0(28, new o0(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(aVarU32, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K45, aVarU32, new yzc.p(7, v0.f321140a), "subscribe(...)"));
        qfm.r0 r0VarD18 = te0.w.D(backendScreenFragment.q0(), new y(this, 11));
        Function1 function1K46 = K();
        pfm.a aVarU33 = r0VarD18.u(new nii.o0(28, new o0(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(aVarU33, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K46, aVarU33, new yzc.p(7, w0.f321146a), "subscribe(...)"));
        qfm.r0 r0VarD19 = te0.w.D(backendScreenFragment.X(), new y(this, 12));
        Function1 function1K47 = K();
        pfm.a aVarU34 = r0VarD19.u(new nii.o0(28, new o0(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(aVarU34, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K47, aVarU34, new yzc.p(7, x0.f321151a), "subscribe(...)"));
        qfm.r0 r0VarD20 = te0.w.D(backendScreenFragment.Y(), new y(this, 14));
        Function1 function1K48 = K();
        pfm.a aVarU35 = r0VarD20.u(new nii.o0(28, new o0(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(aVarU35, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K48, aVarU35, new yzc.p(7, y0.f321160a), "subscribe(...)"));
        efm.r map = cVar.R().filter(new x(5, new zbj.j0(28))).map(new x(6, new zbj.j0(29)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        zab.s sVar3 = new zab.s(bVar, 15);
        Function1 function1K49 = K();
        Function0 function0J15 = J();
        efm.r rVarOnErrorResumeNext15 = map.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext15, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe15 = rVarOnErrorResumeNext15.subscribe(new twl.o(13, sVar3), new twl.o(13, function1K49), new yzc.p(7, function0J15));
        te0.w.j0(G(), cVarSubscribe15);
        Intrinsics.h(cVarSubscribe15);
        NavBarWithToolbar navBarWithToolbar3 = cVar.f307974j;
        if (navBarWithToolbar3 == null) {
            Intrinsics.r("navBarWithToolbarView");
            throw null;
        }
        ihm.f fVar = navBarWithToolbar3.f59409p.f57337m;
        zab.s sVar4 = new zab.s(bVar, 16);
        Function1 function1K50 = K();
        Function0 function0J16 = J();
        efm.r rVarOnErrorResumeNext16 = fVar.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext16, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe16 = rVarOnErrorResumeNext16.subscribe(new twl.o(13, sVar4), new twl.o(13, function1K50), new yzc.p(7, function0J16));
        te0.w.j0(G(), cVarSubscribe16);
        Intrinsics.h(cVarSubscribe16);
        efm.r map2 = ((ae7.i) this.f321167p).b().map(new x(7, new z(0)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        qfm.r0 r0VarD21 = te0.w.D(map2, new zab.s(gVar, 17));
        Function1 function1K51 = K();
        pfm.a aVarU36 = r0VarD21.u(new nii.o0(28, new o0(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(aVarU36, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K51, aVarU36, new yzc.p(7, z0.f321178a), "subscribe(...)"));
        efm.b bVarSwitchMapCompletable9 = backendScreenFragment.b0().switchMapCompletable(new x(8, new y(this, 15)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable9, "switchMapCompletable(...)");
        Function1 function1K52 = K();
        pfm.a aVarU37 = bVarSwitchMapCompletable9.u(new nii.o0(28, new o0(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(aVarU37, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K52, aVarU37, new yzc.p(7, a1.f321001a), "subscribe(...)"));
        efm.b bVarSwitchMapCompletable10 = backendScreenFragment.T().switchMapCompletable(new x(9, new y(this, 16)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable10, "switchMapCompletable(...)");
        Function1 function1K53 = K();
        pfm.a aVarU38 = bVarSwitchMapCompletable10.u(new nii.o0(28, new o0(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(aVarU38, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K53, aVarU38, new yzc.p(7, b1.f321011a), "subscribe(...)"));
        ihm.f fVarC02 = backendScreenFragment.C0();
        y yVar3 = new y(this, 19);
        Function1 function1K54 = K();
        Function0 function0J17 = J();
        efm.r rVarOnErrorResumeNext17 = fVarC02.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext17, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe17 = rVarOnErrorResumeNext17.subscribe(new twl.o(13, yVar3), new twl.o(13, function1K54), new yzc.p(7, function0J17));
        te0.w.j0(G(), cVarSubscribe17);
        Intrinsics.h(cVarSubscribe17);
        efm.b bVarSwitchMapCompletable11 = backendScreenFragment.B0().switchMapCompletable(new x(10, new y(this, 20)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable11, "switchMapCompletable(...)");
        Function1 function1K55 = K();
        pfm.a aVarU39 = bVarSwitchMapCompletable11.u(new nii.o0(28, new o0(new BreadcrumbException(), 15)));
        Intrinsics.checkNotNullExpressionValue(aVarU39, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K55, aVarU39, new yzc.p(7, c1.f321029a), "subscribe(...)"));
        qfm.r0 r0VarD22 = te0.w.D(((opi.b) this.f321169r).W0(), new y(this, 21));
        Function1 function1K56 = K();
        pfm.a aVarU40 = r0VarD22.u(new nii.o0(28, new o0(new BreadcrumbException(), 16)));
        Intrinsics.checkNotNullExpressionValue(aVarU40, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K56, aVarU40, new yzc.p(7, d1.f321033a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable7 = backendScreenFragment.S().flatMapCompletable(new x(11, new t1(this)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable7, "flatMapCompletable(...)");
        Function1 function1K57 = K();
        pfm.a aVarU41 = bVarFlatMapCompletable7.u(new nii.o0(28, new o0(new BreadcrumbException(), 17)));
        Intrinsics.checkNotNullExpressionValue(aVarU41, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K57, aVarU41, new yzc.p(7, e1.f321041a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable8 = backendScreenFragment.L().flatMapCompletable(new x(12, new y(this, 22)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable8, "flatMapCompletable(...)");
        Function1 function1K58 = K();
        pfm.a aVarU42 = bVarFlatMapCompletable8.u(new nii.o0(28, new o0(new BreadcrumbException(), 18)));
        Intrinsics.checkNotNullExpressionValue(aVarU42, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K58, aVarU42, new yzc.p(7, g1.f321054a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable9 = backendScreenFragment.a0().flatMapCompletable(new x(13, new y(this, 23)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable9, "flatMapCompletable(...)");
        Function1 function1K59 = K();
        pfm.a aVarU43 = bVarFlatMapCompletable9.u(new nii.o0(28, new o0(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(aVarU43, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K59, aVarU43, new yzc.p(7, h1.f321058a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable10 = backendScreenFragment.I0().flatMapCompletable(new x(15, new y(this, 25)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable10, "flatMapCompletable(...)");
        Function1 function1K60 = K();
        pfm.a aVarU44 = bVarFlatMapCompletable10.u(new nii.o0(28, new o0(new BreadcrumbException(), 20)));
        Intrinsics.checkNotNullExpressionValue(aVarU44, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K60, aVarU44, new yzc.p(7, i1.f321063a), "subscribe(...)"));
        qfm.r0 r0VarD23 = te0.w.D(backendScreenFragment.E0(), new y(this, 26));
        Function1 function1K61 = K();
        pfm.a aVarU45 = r0VarD23.u(new nii.o0(28, new o0(new BreadcrumbException(), 21)));
        Intrinsics.checkNotNullExpressionValue(aVarU45, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K61, aVarU45, new yzc.p(7, j1.f321067a), "subscribe(...)"));
        qfm.r0 r0VarD24 = te0.w.D(te0.w.a0(backendScreenFragment.G(), new z(1)), new y(this, 27));
        Function1 function1K62 = K();
        pfm.a aVarU46 = r0VarD24.u(new nii.o0(28, new o0(new BreadcrumbException(), 23)));
        Intrinsics.checkNotNullExpressionValue(aVarU46, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K62, aVarU46, new yzc.p(7, k1.f321074a), "subscribe(...)"));
        efm.b bVarFlatMapCompletable11 = te0.w.a0(backendScreenFragment.N(), new z(2)).flatMapCompletable(new x(16, new y(this, 28)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable11, "flatMapCompletable(...)");
        Function1 function1K63 = K();
        pfm.a aVarU47 = bVarFlatMapCompletable11.u(new nii.o0(28, new o0(new BreadcrumbException(), 24)));
        Intrinsics.checkNotNullExpressionValue(aVarU47, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K63, aVarU47, new yzc.p(7, l1.f321079a), "subscribe(...)"));
        efm.r rVarMerge = efm.r.merge(te0.w.a0(backendScreenFragment.p0(), new kotlin.jvm.internal.h0() { // from class: zc0.u1
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((ty0.a) obj2).d;
            }
        }), te0.w.a0(backendScreenFragment.n0(), new kotlin.jvm.internal.h0() { // from class: zc0.v1
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((ProgressStepVerticalV2Delegate.Model) obj2).f53016n;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        qfm.r0 r0VarD25 = te0.w.D(te0.w.a0(rVarMerge, new z(3)), new zab.s(jVar, 23));
        Function1 function1K64 = K();
        pfm.a aVarU48 = r0VarD25.u(new nii.o0(28, new o0(new BreadcrumbException(), 25)));
        Intrinsics.checkNotNullExpressionValue(aVarU48, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K64, aVarU48, new yzc.p(7, m1.f321085a), "subscribe(...)"));
        qfm.r0 r0VarD26 = te0.w.D(gVar.G2(), new zab.s(this, 24));
        Function1 function1K65 = K();
        pfm.a aVarU49 = r0VarD26.u(new nii.o0(28, new o0(new BreadcrumbException(), 26)));
        Intrinsics.checkNotNullExpressionValue(aVarU49, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K65, aVarU49, new yzc.p(7, n1.f321091a), "subscribe(...)"));
        cqi.j jVar2 = (cqi.j) this.f321170s;
        qfm.r0 r0VarD27 = te0.w.D(jVar2.N(), new a0(this, 0));
        Function1 function1K66 = K();
        pfm.a aVarU50 = r0VarD27.u(new nii.o0(28, new o0(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(aVarU50, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K66, aVarU50, new yzc.p(7, o1.f321097a), "subscribe(...)"));
        efm.r rVarMerge2 = efm.r.merge(te0.w.a0(jVar2.O(), new zbj.j0(22)), te0.w.a0(jVar2.Q(), new zbj.j0(23)));
        Intrinsics.checkNotNullExpressionValue(rVarMerge2, "merge(...)");
        qfm.r0 r0VarD28 = te0.w.D(rVarMerge2, new t(this, 3));
        Function1 function1K67 = K();
        pfm.a aVarU51 = r0VarD28.u(new nii.o0(28, new o0(new BreadcrumbException(), 28)));
        Intrinsics.checkNotNullExpressionValue(aVarU51, "onErrorResumeNext(...)");
        te0.w.j0(G(), z9h.n.k(function1K67, aVarU51, new yzc.p(7, p1.f321103a), "subscribe(...)"));
        ihm.f fVarB2 = gVar.B2();
        w1 w1Var = w1.f;
        efm.r map3 = fVarB2.map(new x2l.a(22));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        efm.r rVarF12 = o70.a.f(map3);
        npi.a aVar = this.f321164l;
        zab.s sVar5 = new zab.s(aVar, 25);
        Function1 function1K68 = K();
        Function0 function0J18 = J();
        efm.r rVarOnErrorResumeNext18 = rVarF12.onErrorResumeNext(new nii.o0(28, new zae.j(new BreadcrumbException(), 19)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext18, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe18 = rVarOnErrorResumeNext18.subscribe(new twl.o(13, sVar5), new twl.o(13, function1K68), new yzc.p(7, function0J18));
        te0.w.j0(G(), cVarSubscribe18);
        Intrinsics.h(cVarSubscribe18);
        R(aVar);
        Q(this.f321166n);
        g0(gVar);
        gVar.z0();
    }

    public final efm.d0 P() {
        efm.r rVarTake = this.f321162h.n().take(1L);
        i2 i2Var = i2.f;
        efm.d0 d0VarFirstOrError = rVarTake.map(new x2l.a(21, false)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final void Q(k3l.b bVar) {
        efm.b bVarSwitchMapCompletable = ((k3l.d) bVar).f180813j.switchMapCompletable(new x(22, new a0(this, 4)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        Function1 function1K = K();
        nii.o0 o0Var = new nii.o0(28, new x1(new BreadcrumbException(), 20));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        te0.w.j0(this.f239031a, z9h.n.k(function1K, aVar, new yzc.p(7, j2.f321068a), "subscribe(...)"));
    }

    public final void R(npi.a aVar) {
        efm.b bVarFlatMapCompletable = ((npi.c) aVar).f218223l.f256060c.flatMapCompletable(new b0(new a0(this, 13), 10));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K = K();
        nii.o0 o0Var = new nii.o0(28, new x1(new BreadcrumbException(), 21));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar2 = new pfm.a(bVarFlatMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        te0.w.j0(this.f239031a, z9h.n.k(function1K, aVar2, new yzc.p(7, k2.f321075a), "subscribe(...)"));
    }

    public final efm.r S(g gVar) {
        efm.r rVarDistinctUntilChanged = gVar.w0().map(new b0(new z(this, 8), 5)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r T(g gVar) {
        efm.r rVarDistinctUntilChanged = gVar.w0().switchMapMaybe(new b0(new a0(this, 12), 6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r U(g gVar) {
        efm.r rVarSwitchMapMaybe = gVar.w0().switchMapMaybe(new x(25, new a0(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapMaybe, "switchMapMaybe(...)");
        return rVarSwitchMapMaybe;
    }

    public final efm.r W(g gVar) {
        return gVar.w0().switchMap(new n(new t(this, 8), 18));
    }

    public final efm.r X(g gVar) {
        efm.r rVarSwitchMapMaybe = gVar.w0().switchMapMaybe(new n(new a0(this, 15), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapMaybe, "switchMapMaybe(...)");
        return rVarSwitchMapMaybe;
    }

    public void Y() {
        efm.r rVarF = o70.a.f(this.f321162h.n1());
        a0 a0Var = new a0(this, 7);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarF.onErrorResumeNext(new nii.o0(28, new x1(new BreadcrumbException(), 22)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new twl.o(13, a0Var), new twl.o(13, function1K), new yzc.p(7, function0J));
        te0.w.j0(this.f239031a, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }

    public final efm.r Z() {
        sfm.b bVarW0 = this.f321162h.w0();
        n2 n2Var = n2.f;
        efm.r rVarSwitchMapMaybe = bVarW0.filter(new x2l.a(25, false)).map(new x(19, new z(4))).distinctUntilChanged().switchMapMaybe(new x(20, new a0(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapMaybe, "switchMapMaybe(...)");
        return rVarSwitchMapMaybe;
    }

    public final efm.r a0(g gVar) {
        efm.r rVarDistinctUntilChanged = gVar.w0().switchMapMaybe(new x(28, new a0(this, 8))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r b0(g gVar) {
        efm.r rVarSwitchMapMaybe = gVar.w0().switchMapMaybe(new b0(new a0(this, 10), 0));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMapMaybe, "switchMapMaybe(...)");
        return rVarSwitchMapMaybe;
    }

    public final efm.r c0(g gVar) {
        efm.r rVarDistinctUntilChanged = gVar.w0().switchMapMaybe(new x(17, new y(this, 29))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final efm.r f0() {
        sfm.b bVarW0 = this.f321162h.w0();
        o2 o2Var = o2.f;
        efm.r rVarDistinctUntilChanged = bVarW0.filter(new x2l.a(23, false)).map(new x(0 == true ? 1 : 0, new zbj.j0(26))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarDistinctUntilChanged2 = this.A.map(new x(4, new zbj.j0(27))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        efm.r rVarSwitchMap = te0.w.l(rVarDistinctUntilChanged, rVarDistinctUntilChanged2).switchMap(new x(14, new y(this, 18)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final void g0(g gVar) {
        efm.k kVarFirstElement = gVar.w0().firstElement();
        b0 b0Var = new b0(new a0(this, 11), 2);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, b0Var, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        Function1 function1K = K();
        pfm.a aVar2 = new pfm.a(aVar, new nii.o0(28, new x1(new BreadcrumbException(), 29)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        te0.w.j0(this.f239031a, z9h.n.k(function1K, aVar2, new yzc.p(7, v2.f321141a), "subscribe(...)"));
    }

    @Override // pri.b, pri.e
    public final void l() {
        this.f321162h.Q();
        super.l();
    }
}
