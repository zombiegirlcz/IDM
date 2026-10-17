package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.commodity.order_flow.impl.R$layout;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import czc.d0;
import d7j.f0;
import d7j.i0;
import d7j.j0;
import d7j.l;
import d7j.l0;
import d7j.p;
import d7j.r;
import d7j.t;
import d7j.u;
import d7j.v;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.MutableStateFlow;
import no.k;
import no.m;
import te0.w;
import vc.s;
import vkm.t0;
import yhm.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/edit/CommodityOrderEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld7j/f0;", "Ldli/a;", "Ld7j/l0;", "Lno/k;", "Lno/m;", "Lin0/g;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityOrderEditScreen extends ViewController<f0> implements dli.a, k, m, in0.g {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CommodityOrderEditScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/commodity/order_flow/impl/databinding/ScreenCommodityOrderEditBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public AnalyticsContext S;
    public final Lazy T;
    public final Object U;
    public final Object V;

    public CommodityOrderEditScreen(CommodityOrderEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_commodity_order_edit;
        this.L = s.t(this, l.f);
        this.M = w.y0(new d0(22));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: d7j.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderEditScreen f112003b;

            {
                this.f112003b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommodityOrderEditScreen commodityOrderEditScreen = this.f112003b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderEditScreen.W;
                        return new CenteredAmountDelegate(new cwj.h(commodityOrderEditScreen, 12));
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityOrderEditScreen.W;
                        CommodityOrderEditScreen commodityOrderEditScreen2 = this.f112003b;
                        return dli.f.a(commodityOrderEditScreen2, commodityOrderEditScreen2.R2(), zhm.v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) commodityOrderEditScreen2.O.getValue(), (CenteredAmountDelegate) commodityOrderEditScreen2.N.getValue(), (FullScreenStateDelegate) commodityOrderEditScreen2.P.getValue()), commodityOrderEditScreen2.e3().f233340c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityOrderEditScreen.W;
                        return (h0) ((r6j.b) commodityOrderEditScreen.R.getValue()).f251876n.get();
                    default:
                        KProperty[] kPropertyArr4 = CommodityOrderEditScreen.W;
                        return (KeyboardSuggestionsControllerExtension) ((r6j.b) commodityOrderEditScreen.R.getValue()).d.get();
                }
            }
        });
        this.O = w.y0(new d0(23));
        this.P = w.y0(new d0(24));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: d7j.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderEditScreen f112003b;

            {
                this.f112003b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommodityOrderEditScreen commodityOrderEditScreen = this.f112003b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderEditScreen.W;
                        return new CenteredAmountDelegate(new cwj.h(commodityOrderEditScreen, 12));
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityOrderEditScreen.W;
                        CommodityOrderEditScreen commodityOrderEditScreen2 = this.f112003b;
                        return dli.f.a(commodityOrderEditScreen2, commodityOrderEditScreen2.R2(), zhm.v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) commodityOrderEditScreen2.O.getValue(), (CenteredAmountDelegate) commodityOrderEditScreen2.N.getValue(), (FullScreenStateDelegate) commodityOrderEditScreen2.P.getValue()), commodityOrderEditScreen2.e3().f233340c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityOrderEditScreen.W;
                        return (h0) ((r6j.b) commodityOrderEditScreen.R.getValue()).f251876n.get();
                    default:
                        KProperty[] kPropertyArr4 = CommodityOrderEditScreen.W;
                        return (KeyboardSuggestionsControllerExtension) ((r6j.b) commodityOrderEditScreen.R.getValue()).d.get();
                }
            }
        });
        this.R = w.y0(new cvi.b(this, inputData, 18));
        this.T = j.b(d7j.k.f112014a);
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: d7j.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderEditScreen f112003b;

            {
                this.f112003b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommodityOrderEditScreen commodityOrderEditScreen = this.f112003b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderEditScreen.W;
                        return new CenteredAmountDelegate(new cwj.h(commodityOrderEditScreen, 12));
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityOrderEditScreen.W;
                        CommodityOrderEditScreen commodityOrderEditScreen2 = this.f112003b;
                        return dli.f.a(commodityOrderEditScreen2, commodityOrderEditScreen2.R2(), zhm.v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) commodityOrderEditScreen2.O.getValue(), (CenteredAmountDelegate) commodityOrderEditScreen2.N.getValue(), (FullScreenStateDelegate) commodityOrderEditScreen2.P.getValue()), commodityOrderEditScreen2.e3().f233340c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityOrderEditScreen.W;
                        return (h0) ((r6j.b) commodityOrderEditScreen.R.getValue()).f251876n.get();
                    default:
                        KProperty[] kPropertyArr4 = CommodityOrderEditScreen.W;
                        return (KeyboardSuggestionsControllerExtension) ((r6j.b) commodityOrderEditScreen.R.getValue()).d.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: d7j.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityOrderEditScreen f112003b;

            {
                this.f112003b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CommodityOrderEditScreen commodityOrderEditScreen = this.f112003b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityOrderEditScreen.W;
                        return new CenteredAmountDelegate(new cwj.h(commodityOrderEditScreen, 12));
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityOrderEditScreen.W;
                        CommodityOrderEditScreen commodityOrderEditScreen2 = this.f112003b;
                        return dli.f.a(commodityOrderEditScreen2, commodityOrderEditScreen2.R2(), zhm.v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) commodityOrderEditScreen2.O.getValue(), (CenteredAmountDelegate) commodityOrderEditScreen2.N.getValue(), (FullScreenStateDelegate) commodityOrderEditScreen2.P.getValue()), commodityOrderEditScreen2.e3().f233340c.getId(), null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = CommodityOrderEditScreen.W;
                        return (h0) ((r6j.b) commodityOrderEditScreen.R.getValue()).f251876n.get();
                    default:
                        KProperty[] kPropertyArr4 = CommodityOrderEditScreen.W;
                        return (KeyboardSuggestionsControllerExtension) ((r6j.b) commodityOrderEditScreen.R.getValue()).d.get();
                }
            }
        });
    }

    public static i d3(TextLocalisedClause textLocalisedClause, boolean z, boolean z3) {
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        n6 n6Var = new n6(textLocalisedClause, defaultFilledButton, null, "NEXT_BUTTON_LOADING_TAG", z, null, d7j.i.f112005a, 460);
        if (!z3) {
            return new aw0.e(true, null, null, n6Var, null, null, 54);
        }
        return new aw0.g(m6.b(n6.Companion, new yy0.h(new TextLocalisedClause(R$string.wealth_orders_order_type_button_accessibility_label, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_controls, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)), defaultFilledButton, null, false, d7j.j.f112010a, Constants.TAG_FC_SPEED_MODE), n6Var, (Clause) null, aw0.f.SMALL_PRIMARY_BUTTON, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void B(o oVar, q qVar) {
        l0 uiState = (l0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        AnalyticsContext analyticsContext = uiState.f112019a;
        this.S = analyticsContext;
        i0 i0Var = uiState.f112020b;
        NavBarWithToolbar navBarWithToolbar = e3().f233339b;
        navBarWithToolbar.setToolbar(i0Var.f112006a, i0Var.f112007b, null);
        navBarWithToolbar.setToolbarSubtitleClickable(i0Var.f112008c);
        navBarWithToolbar.setMenuItems(i0Var.d);
        ActionFooterView actionFooterView = e3().d;
        j0 j0Var = uiState.d;
        actionFooterView.setModel(d3(j0Var.f112011a, j0Var.f112012b, uiState.f112021c.f112015a));
        KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) this.V.getValue();
        keyboardSuggestionsControllerExtension.getClass();
        Intrinsics.checkNotNullParameter("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS", "sourceId");
        keyboardSuggestionsControllerExtension.d.put("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS", analyticsContext);
        List list = uiState.e;
        if (list.isEmpty()) {
            keyboardSuggestionsControllerExtension.Q("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS");
        } else {
            keyboardSuggestionsControllerExtension.S("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS", list);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.S = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        return (AnalyticsProduct) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r6j.b) this.R.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getS() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        p6j.a aVarE3 = e3();
        NavBarWithToolbar navBarWithToolbar = aVarE3.f233339b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.j0(false);
        ActionFooterView actionFooterView = aVarE3.d;
        actionFooterView.setModel(d3(null, false, false));
        Context context = actionFooterView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        actionFooterView.setDescriptionColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        ScreenContentRecyclerView commodityOrderFlowEditRecyclerView = aVarE3.f233340c;
        Intrinsics.checkNotNullExpressionValue(commodityOrderFlowEditRecyclerView, "commodityOrderFlowEditRecyclerView");
        ce9.m.f(actionFooterView, commodityOrderFlowEditRecyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        ((KeyboardSuggestionsControllerExtension) this.V.getValue()).Q("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS");
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        p6j.a aVarE3 = e3();
        Continuation continuation = null;
        int i = 0;
        ViewController.P2(this, rd0.e.b(aVarE3.f233339b.f59410q), new d7j.o(this, continuation, i), 3);
        int i2 = 1;
        ViewController.P2(this, kii.e.t(aVarE3.f233339b.S0, "hide(...)"), new d7j.o(this, continuation, i2), 3);
        ActionFooterView actionFooterView = aVarE3.d;
        ViewController.P2(this, vkm.q.J(rd0.e.b(actionFooterView.f), rd0.e.b(actionFooterView.f58955g)), new p(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.O.getValue()).d), new d7j.q(this, null), 3);
        ViewController.P2(this, new t0((MutableStateFlow) this.M.getValue(), 1), new r(this, null), 3);
        ?? r87 = this.N;
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r87.getValue()).f51965h.f121375b), new d7j.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r87.getValue()).i.f121375b), new t(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r87.getValue()).e.f121375b), new u(this, null), 3);
        ViewController.P2(this, rd0.e.b(((CenteredAmountDelegate) r87.getValue()).f.f121375b), new v(this, null), 3);
        ViewController.P2(this, ((KeyboardSuggestionsControllerExtension) this.V.getValue()).R("COMMODITY_ORDER_FLOW_KEYBOARD_SUGGESTIONS"), new p(this, continuation, 2), 3);
        ViewController.P2(this, new cbf.c(rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), 29), new p(this, continuation, i2), 3);
    }

    public final p6j.a e3() {
        ViewBinding value = this.L.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p6j.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final d7j.h0 R2() {
        return (d7j.h0) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
