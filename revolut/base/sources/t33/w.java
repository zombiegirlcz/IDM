package t33;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.virtual.IssueVirtualCardActivity;
import com.revolut.feature.card_payment_method.api.declaration.SelectedPaymentMethodResultContract$SelectedCardBindingStrategy;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import grl.b4;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.o0;
import org.jetbrains.annotations.NotNull;
import qfm.r0;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends pri.a implements e {

    @NotNull
    public static final o Companion = new o();
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f267631j;
    public final xpi.g k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ypi.i f267632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tpi.j f267633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f9b.f f267634n;
    public final sri.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g3l.a f267635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f267636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kpi.c f267637r;

    public w(d presentationModel, c itemProvider, xpi.g navBarWithToolbar, ypi.i nextButtonView, tpi.j progressView, f9b.f errorView, sri.m navigator, g3l.a statusDialogViewConfigurationDispatcher, f router, kpi.c activityResultDelegate) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(itemProvider, "itemProvider");
        Intrinsics.checkNotNullParameter(navBarWithToolbar, "navBarWithToolbar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        Intrinsics.checkNotNullParameter(errorView, "errorView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(activityResultDelegate, "activityResultDelegate");
        this.i = presentationModel;
        this.f267631j = itemProvider;
        this.k = navBarWithToolbar;
        this.f267632l = nextButtonView;
        this.f267633m = progressView;
        this.f267634n = errorView;
        this.o = navigator;
        this.f267635p = statusDialogViewConfigurationDispatcher;
        this.f267636q = router;
        this.f267637r = activityResultDelegate;
        P(f0.f322471a);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        h view = (h) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_label_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.k;
        cVar.n0(textLocalisedClause);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        cVar.d0(zhm.u.c(new TextNavBarMenuItem("SKIP_ACTION_LIST_ID", new TextLocalisedClause(R$string.card_label_skip, null, null, 14), null, null, 12)));
        efm.r rVarQ = cVar.Q();
        n nVar = new n(this, 0);
        Function1 function1K = K();
        Function0 function0J = J();
        efm.r rVarOnErrorResumeNext = rVarQ.onErrorResumeNext(new o0(17, new r(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(29, nVar), new lhi.b(29, function1K), new t1i.n(2, function0J));
        ifm.b bVar = this.f239031a;
        te0.w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        efm.r rVarFilter = cVar.b().filter(new sx4.c(new szb.g(28), 21));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        r0 r0VarD = te0.w.D(rVarFilter, new n(this, 9));
        Function1 function1K2 = K();
        pfm.a aVar2 = new pfm.a(r0VarD, new o0(17, new r(new BreadcrumbException(), 6)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar2.w(new lhi.b(29, function1K2), new t1i.n(2, v.f267630a));
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        m mVar = (m) this.i;
        y yVar = (y) mVar.f267618a;
        te0.j jVar = yVar.f267642g;
        KProperty[] kPropertyArr = y.f267639l;
        te0.e value = jVar.getValue(yVar, kPropertyArr[5]);
        te0.s sVar = te0.s.f270018a;
        efm.r rVarF = o70.a.f(value.c(sVar));
        n nVar2 = new n(this, 10);
        Function1 function1K3 = K();
        Function0 function0J2 = J();
        efm.r rVarOnErrorResumeNext2 = rVarF.onErrorResumeNext(new o0(17, new ry7.j(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new lhi.b(29, nVar2), new lhi.b(29, function1K3), new t1i.n(2, function0J2));
        te0.w.j0(bVar, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        g gVar = mVar.f267618a;
        y yVar2 = (y) gVar;
        y yVar3 = (y) gVar;
        efm.r map = o70.a.f(te0.w.l(yVar2.f.getValue(yVar2, kPropertyArr[4]).c(sVar), yVar3.f267641c.getValue(yVar3, kPropertyArr[1]).c(sVar))).map(new sx4.c(new n(this, 1), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        sx8.a aVar3 = new sx8.a(view, 17);
        Function1 function1K4 = K();
        Function0 function0J3 = J();
        efm.r rVarOnErrorResumeNext3 = map.onErrorResumeNext(new o0(17, new r(new BreadcrumbException(), 0)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new lhi.b(29, aVar3), new lhi.b(29, function1K4), new t1i.n(2, function0J3));
        te0.w.j0(bVar, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        efm.r rVarS = mo3.a.s(hx7.a.N(o70.a.f(((r93.c) mVar.f267619b).f.f), this.f267634n, false, true), this.f267633m);
        Intrinsics.checkNotNullExpressionValue(rVarS, "withDataProgress(...)");
        efm.b bVarFlatMapCompletable = m70.a.g(rVarS, null, null, 3).flatMapCompletable(new sx4.c(new n(this, 2), 16));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        Function1 function1K5 = K();
        o0 o0Var = new o0(17, new r(new BreadcrumbException(), 2));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarFlatMapCompletable, o0Var, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new lhi.b(29, function1K5), new t1i.n(2, s.f267627a));
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        IssueVirtualCardActivity issueVirtualCardActivity = (IssueVirtualCardActivity) view;
        efm.r map2 = ((InputTextDelegate) issueVirtualCardActivity.u0.getValue()).e.f121375b.map(new sx4.c(new szb.g(27), 20));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        n nVar3 = new n(this, 6);
        Function1 function1K6 = K();
        Function0 function0J4 = J();
        efm.r rVarOnErrorResumeNext4 = map2.onErrorResumeNext(new o0(17, new r(new BreadcrumbException(), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new lhi.b(29, nVar3), new lhi.b(29, function1K6), new t1i.n(2, function0J4));
        te0.w.j0(bVar, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        r0 r0VarD2 = te0.w.D(((SuggestionsBarDelegate) issueVirtualCardActivity.f65230v0.getValue()).p().d, new n(this, 7));
        Function1 function1K7 = K();
        pfm.a aVar5 = new pfm.a(r0VarD2, new o0(17, new r(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new lhi.b(29, function1K7), new t1i.n(2, t.f267628a));
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
        r0 r0VarD3 = te0.w.D(this.f267632l.s(), new n(this, 8));
        Function1 function1K8 = K();
        pfm.a aVar6 = new pfm.a(r0VarD3, new o0(17, new r(new BreadcrumbException(), 4)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new lhi.b(29, function1K8), new t1i.n(2, u.f267629a));
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.b bVarFlatMapCompletable2 = te0.w.a0(i26.l.g(this.f267637r.N(b4.EXPIRED_OR_INVALID_KEY_VALUE)), new szb.g(26)).doOnNext(new sx4.c(new n(this, 3), 17)).flatMapCompletable(new sx4.c(new n(this, 4), 18));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable2, "flatMapCompletable(...)");
        o0 o0Var2 = new o0(17, new ry7.j(new BreadcrumbException(), 28));
        bVarFlatMapCompletable2.getClass();
        pfm.a aVar7 = new pfm.a(bVarFlatMapCompletable2, o0Var2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(aVar7.w(new lhi.b(29, q.f267624a), p.f267623a), "subscribe(...)");
    }

    public final efm.b Q() {
        m mVar = (m) this.i;
        if (!((od0.i) ((y) mVar.f267618a).x0().get()).d()) {
            y yVar = (y) mVar.f267618a;
            d0 d0VarFirst = yVar.f267642g.getValue(yVar, y.f267639l[5]).c(te0.s.f270018a).first(Boolean.FALSE);
            sx4.c cVar = new sx4.c(new n(this, 5), 19);
            d0VarFirst.getClass();
            return new pfm.a(d0VarFirst, cVar, 4);
        }
        mm.d dVar = mVar.f267620c;
        String str = mVar.e;
        y yVar2 = (y) mVar.f267618a;
        e93.e virtualCardDesign = (e93.e) yVar2.B0().get();
        String str2 = (String) te0.w.O(yVar2.z0());
        te0.j jVar = yVar2.f;
        KProperty[] kPropertyArr = y.f267639l;
        Object obj2 = jVar.getValue(yVar2, kPropertyArr[4]).get();
        String str3 = (String) obj2;
        if (mVar.d || kotlin.text.d0.F0(str3).toString().length() <= 0) {
            obj2 = null;
        }
        String str4 = (String) obj2;
        AccountId accountId = (AccountId) yVar2.w0().get();
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) te0.w.O(yVar2.A0());
        i93.d dVar2 = selectedPaymentMethodResultContract$SelectedCardBindingStrategy != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy.f65251a : null;
        SelectedPaymentMethodResultContract$SelectedCardBindingStrategy selectedPaymentMethodResultContract$SelectedCardBindingStrategy2 = (SelectedPaymentMethodResultContract$SelectedCardBindingStrategy) te0.w.O(yVar2.A0());
        Set set = selectedPaymentMethodResultContract$SelectedCardBindingStrategy2 != null ? selectedPaymentMethodResultContract$SelectedCardBindingStrategy2.f65252b : null;
        e93.b bVar = (e93.b) te0.w.L(yVar2.f267644j.getValue(yVar2, kPropertyArr[8]));
        pi3.h hVar = (pi3.h) te0.w.L(yVar2.x0());
        Intrinsics.checkNotNullParameter(virtualCardDesign, "virtualCardDesign");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Set set2 = set;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return dVar.c0(new rh3.c(new CheckoutParams.CardOrder(new b93.h(virtualCardDesign, str2, str4, joint != null ? joint.f51413b : null, dVar2, set2, bVar, str, null, null, false), hVar, accountId), (NaviCommand) te0.w.O(yVar2.y0()), null, 4));
    }
}
