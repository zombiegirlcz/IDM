package com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.PlanGiftingReceiverPickerScreenContract$InputData;
import dli.c;
import efm.r;
import j6k.g;
import jcj.n;
import jck.e;
import jck.f;
import jck.i;
import jck.j;
import jck.k;
import jck.p;
import jck.u;
import jck.v;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/screens/receiver/picker/PlanGiftingReceiverPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljck/u;", "Ldli/a;", "Ljck/w;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanGiftingReceiverPickerScreen extends ViewController<u> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PlanGiftingReceiverPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PlanGiftingReceiverPickerScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public PlanGiftingReceiverPickerScreen(PlanGiftingReceiverPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = w.y0(new ja3.b(8));
        this.N = w.y0(new ja3.b(9));
        this.O = w.y0(new ja3.b(10));
        this.P = w.y0(new ja3.b(11));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: jck.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverPickerScreen f172845b;

            {
                this.f172845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen = this.f172845b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverPickerScreen.U;
                        PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen2 = this.f172845b;
                        return dli.f.a(planGiftingReceiverPickerScreen2, planGiftingReceiverPickerScreen2.d(), zhm.v.k((ActionWidgetDelegate) planGiftingReceiverPickerScreen2.M.getValue(), (ListSubheaderDelegate) planGiftingReceiverPickerScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) planGiftingReceiverPickerScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) planGiftingReceiverPickerScreen2.O.getValue()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverPickerScreen.U;
                        qji.b bVarU2 = planGiftingReceiverPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.di.PlanGiftingReceiverPickerScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        PlanGiftingReceiverPickerScreenContract$InputData planGiftingReceiverPickerScreenContract$InputData = planGiftingReceiverPickerScreen.K;
                        planGiftingReceiverPickerScreenContract$InputData.getClass();
                        return new pbk.e(bVar, gVar2, planGiftingReceiverPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverPickerScreen.U;
                        return (v) ((pbk.e) planGiftingReceiverPickerScreen.S.getValue()).e.get();
                }
            }
        });
        this.R = s.t(this, e.f);
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: jck.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverPickerScreen f172845b;

            {
                this.f172845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen = this.f172845b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverPickerScreen.U;
                        PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen2 = this.f172845b;
                        return dli.f.a(planGiftingReceiverPickerScreen2, planGiftingReceiverPickerScreen2.d(), zhm.v.k((ActionWidgetDelegate) planGiftingReceiverPickerScreen2.M.getValue(), (ListSubheaderDelegate) planGiftingReceiverPickerScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) planGiftingReceiverPickerScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) planGiftingReceiverPickerScreen2.O.getValue()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverPickerScreen.U;
                        qji.b bVarU2 = planGiftingReceiverPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.di.PlanGiftingReceiverPickerScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        PlanGiftingReceiverPickerScreenContract$InputData planGiftingReceiverPickerScreenContract$InputData = planGiftingReceiverPickerScreen.K;
                        planGiftingReceiverPickerScreenContract$InputData.getClass();
                        return new pbk.e(bVar, gVar2, planGiftingReceiverPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverPickerScreen.U;
                        return (v) ((pbk.e) planGiftingReceiverPickerScreen.S.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: jck.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingReceiverPickerScreen f172845b;

            {
                this.f172845b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen = this.f172845b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingReceiverPickerScreen.U;
                        PlanGiftingReceiverPickerScreen planGiftingReceiverPickerScreen2 = this.f172845b;
                        return dli.f.a(planGiftingReceiverPickerScreen2, planGiftingReceiverPickerScreen2.d(), zhm.v.k((ActionWidgetDelegate) planGiftingReceiverPickerScreen2.M.getValue(), (ListSubheaderDelegate) planGiftingReceiverPickerScreen2.P.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) planGiftingReceiverPickerScreen2.N.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) planGiftingReceiverPickerScreen2.O.getValue()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingReceiverPickerScreen.U;
                        qji.b bVarU2 = planGiftingReceiverPickerScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.di.PlanGiftingReceiverPickerScreenInjector");
                        pbk.g gVar = (pbk.g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        pbk.g gVar2 = gVar.f234742c;
                        PlanGiftingReceiverPickerScreenContract$InputData planGiftingReceiverPickerScreenContract$InputData = planGiftingReceiverPickerScreen.K;
                        planGiftingReceiverPickerScreenContract$InputData.getClass();
                        return new pbk.e(bVar, gVar2, planGiftingReceiverPickerScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingReceiverPickerScreen.U;
                        return (v) ((pbk.e) planGiftingReceiverPickerScreen.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        jck.w uiState = (jck.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        p pVar = uiState.f172869a;
        TextLocalisedClause textLocalisedClause = pVar.f172863a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = pVar.f172864b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setSearchInputSilently(uiState.f172870b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (pbk.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.plan_gifting_search_hint, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new f(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new j82.q(this, continuation, 9), 3);
        ?? r87 = this.N;
        com.revolut.kompot.navigable.a.g2(this, y.x(((RowDelegate) r87.getValue()).f53218h, ((RowDelegate) r87.getValue()).f53220l, "mergeWith(...)"), null, new i(this, null), 3);
        ?? r810 = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r810.getValue()).f52371h.f121375b), null, new j(this, null), 3);
        r rVarFilter = ((FullScreenStateDelegate) r810.getValue()).f52371h.f121375b.filter(new g(new n(4), 20));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new k(this, null), 3);
        ?? r811 = this.M;
        r rVarFilter2 = ((ActionWidgetDelegate) r811.getValue()).f51589c.f121375b.filter(new g(new n(5), 16));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new f(this, continuation, 2), 3);
        r rVarFilter3 = ((ActionWidgetDelegate) r811.getValue()).f51589c.f121375b.filter(new g(new n(1), 17));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter3), null, new f(this, continuation, 0), 3);
        ?? r812 = this.P;
        r rVarFilter4 = ((ListSubheaderDelegate) r812.getValue()).d.filter(new g(new n(2), 18));
        Intrinsics.checkNotNullExpressionValue(rVarFilter4, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter4), new jck.g(this, null), 3);
        r rVarFilter5 = ((ListSubheaderDelegate) r812.getValue()).f52707c.filter(new g(new n(3), 19));
        Intrinsics.checkNotNullExpressionValue(rVarFilter5, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter5), new jck.h(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v d() {
        return (v) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
