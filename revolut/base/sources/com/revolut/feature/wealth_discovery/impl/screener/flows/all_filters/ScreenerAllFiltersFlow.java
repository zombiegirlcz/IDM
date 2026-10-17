package com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth_discovery.impl.R$id;
import com.revolut.feature.wealth_discovery.impl.R$layout;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow;
import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import e0m.e;
import java.util.ArrayList;
import joh.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import ski.c;
import te0.w;
import tsk.t;
import vc.s;
import vkm.j2;
import vkm.q;
import xng.l;
import xo8.a0;
import xo8.i0;
import xoh.b;
import xoh.f;
import xoh.g;
import xoh.n;
import xoh.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/all_filters/ScreenerAllFiltersFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxoh/n;", "Lski/a;", "Lxoh/p;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/all_filters/ScreenerAllFiltersFlowContract$Page;", "Companion", "a", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerAllFiltersFlow extends ViewController<n> implements ski.a {
    public final ScreenerAllFiltersFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final h O;
    public final j2 P;
    public final Object Q;
    public final t R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ScreenerAllFiltersFlow.class, "binding", "getBinding()Lcom/revolut/feature/wealth_discovery/impl/databinding/FlowScreenerAllFiltersBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlow$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public ScreenerAllFiltersFlow(ScreenerAllFiltersFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: xoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllFiltersFlow f307832b;

            {
                this.f307832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerAllFiltersFlow screenerAllFiltersFlow = this.f307832b;
                switch (i2) {
                    case 0:
                        ScreenerAllFiltersFlow.Companion companion = ScreenerAllFiltersFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = screenerAllFiltersFlow.K;
                        tsk.t tVar = screenerAllFiltersFlow.R;
                        screenerAllFiltersFlowContract$InputData.getClass();
                        tVar.getClass();
                        return new joh.j(wVar, screenerAllFiltersFlowContract$InputData, tVar);
                    case 1:
                        ScreenerAllFiltersFlow.Companion companion2 = ScreenerAllFiltersFlow.INSTANCE;
                        return (h) ((joh.j) screenerAllFiltersFlow.L.getValue()).e.get();
                    default:
                        ScreenerAllFiltersFlow.Companion companion3 = ScreenerAllFiltersFlow.INSTANCE;
                        return czi.c.c(screenerAllFiltersFlow, R$id.flowScreenerAllFilters_viewPager, screenerAllFiltersFlow.R2());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: xoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllFiltersFlow f307832b;

            {
                this.f307832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerAllFiltersFlow screenerAllFiltersFlow = this.f307832b;
                switch (i22) {
                    case 0:
                        ScreenerAllFiltersFlow.Companion companion = ScreenerAllFiltersFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = screenerAllFiltersFlow.K;
                        tsk.t tVar = screenerAllFiltersFlow.R;
                        screenerAllFiltersFlowContract$InputData.getClass();
                        tVar.getClass();
                        return new joh.j(wVar, screenerAllFiltersFlowContract$InputData, tVar);
                    case 1:
                        ScreenerAllFiltersFlow.Companion companion2 = ScreenerAllFiltersFlow.INSTANCE;
                        return (h) ((joh.j) screenerAllFiltersFlow.L.getValue()).e.get();
                    default:
                        ScreenerAllFiltersFlow.Companion companion3 = ScreenerAllFiltersFlow.INSTANCE;
                        return czi.c.c(screenerAllFiltersFlow, R$id.flowScreenerAllFilters_viewPager, screenerAllFiltersFlow.R2());
                }
            }
        });
        this.N = R$layout.flow_screener_all_filters;
        this.O = s.t(this, b.f);
        this.P = q.c(null);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xoh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllFiltersFlow f307832b;

            {
                this.f307832b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerAllFiltersFlow screenerAllFiltersFlow = this.f307832b;
                switch (i22) {
                    case 0:
                        ScreenerAllFiltersFlow.Companion companion = ScreenerAllFiltersFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllFiltersFlow.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        ScreenerAllFiltersFlowContract$InputData screenerAllFiltersFlowContract$InputData = screenerAllFiltersFlow.K;
                        tsk.t tVar = screenerAllFiltersFlow.R;
                        screenerAllFiltersFlowContract$InputData.getClass();
                        tVar.getClass();
                        return new joh.j(wVar, screenerAllFiltersFlowContract$InputData, tVar);
                    case 1:
                        ScreenerAllFiltersFlow.Companion companion2 = ScreenerAllFiltersFlow.INSTANCE;
                        return (h) ((joh.j) screenerAllFiltersFlow.L.getValue()).e.get();
                    default:
                        ScreenerAllFiltersFlow.Companion companion3 = ScreenerAllFiltersFlow.INSTANCE;
                        return czi.c.c(screenerAllFiltersFlow, R$id.flowScreenerAllFilters_viewPager, screenerAllFiltersFlow.R2());
                }
            }
        });
        this.R = new t(this, 19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f154293c;
        TextLocalisedClause textLocalisedClause = uiState.f307845a;
        xoh.o oVar2 = uiState.e;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(uiState.f307845a);
        navBarWithToolbar.setMenuItems(uiState.f307846b);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.screener_filters_header_search_placeholder, null, null, 14));
        ArrayList arrayList = uiState.f307847c;
        String str = uiState.d;
        boolean z = arrayList.size() == 1;
        if (z) {
            Tabs flowScreenerAllFiltersTabs = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowScreenerAllFiltersTabs, "flowScreenerAllFiltersTabs");
            flowScreenerAllFiltersTabs.setVisibility(8);
        } else {
            Tabs flowScreenerAllFiltersTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowScreenerAllFiltersTabs2, "flowScreenerAllFiltersTabs");
            flowScreenerAllFiltersTabs2.setVisibility(0);
            Tabs flowScreenerAllFiltersTabs3 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowScreenerAllFiltersTabs3, "flowScreenerAllFiltersTabs");
            Tabs.setItems$default(flowScreenerAllFiltersTabs3, arrayList, null, 2, null);
            Tabs flowScreenerAllFiltersTabs4 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowScreenerAllFiltersTabs4, "flowScreenerAllFiltersTabs");
            Tabs.u(flowScreenerAllFiltersTabs4, str, false, false, false, 14);
        }
        d3().e.setUserInputEnabled(!z);
        LargeActionButton largeActionButton = d3().f154292b;
        largeActionButton.setText((Clause) oVar2.f307843a);
        largeActionButton.L(oVar2.f307844b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!d3().f154293c.f59421x0) {
            ((a) R2()).I2();
            return true;
        }
        e.a(D2());
        d3().f154293c.m0(j4.FROM_CLICKED_BUTTON);
        return true;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        ScreenerAllFiltersFlowContract$Page page = (ScreenerAllFiltersFlowContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        Intrinsics.checkNotNullParameter(page, "pagerItem");
        a aVar = (a) R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(page, "page");
        aVar.H2(aVar.f96172t, new l(page, 7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f154293c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f154292b.setCustomE2ETestId("VIEW_BUTTON_E2E_ID");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f154293c.f59410q), new f(this, continuation, 0), 3);
        ViewController.P2(this, new a0(rd0.e.b(d3().d.f58882b), 3), new g(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f154292b.o), new f(this, continuation, 1), 3);
        ViewController.P2(this, q.q(t1.e(rd0.e.b(d3().f154293c.f59409p.f57337m), new i0(8))), new g(this, continuation, 1), 3);
    }

    public final hoh.a d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (hoh.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final xoh.h d() {
        return (xoh.h) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
