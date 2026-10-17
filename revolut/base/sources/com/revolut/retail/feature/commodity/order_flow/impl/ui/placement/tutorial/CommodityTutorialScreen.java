package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreen;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.tutorial.CommodityTutorialScreenContract$InputData;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import r7j.b;
import r7j.c;
import r7j.d;
import r7j.i;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/tutorial/CommodityTutorialScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "Lno/m;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityTutorialScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CommodityTutorialScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final CommodityTutorialScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Lazy R;

    public CommodityTutorialScreen(CommodityTutorialScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, c.f);
        this.N = w.y0(new r4k.a(16));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: r7j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTutorialScreen f252262b;

            {
                this.f252262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommodityTutorialScreen commodityTutorialScreen = this.f252262b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTutorialScreen.S;
                        CommodityTutorialScreen commodityTutorialScreen2 = this.f252262b;
                        return dli.f.a(commodityTutorialScreen2, (j) commodityTutorialScreen2.Q.getValue(), u.c((TrendViewDelegate) commodityTutorialScreen2.N.getValue()), commodityTutorialScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityTutorialScreen.m2()).a().get(k6j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k6j.a.class, " is not found"));
                        }
                        r6j.c cVar = ((r6j.c) aVar2.b()).F;
                        CommodityTutorialScreenContract$InputData commodityTutorialScreenContract$InputData = commodityTutorialScreen.K;
                        commodityTutorialScreenContract$InputData.getClass();
                        return new r6j.h(cVar, commodityTutorialScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommodityTutorialScreen.S;
                        return (j) ((r6j.h) commodityTutorialScreen.P.getValue()).f251914c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: r7j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTutorialScreen f252262b;

            {
                this.f252262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommodityTutorialScreen commodityTutorialScreen = this.f252262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTutorialScreen.S;
                        CommodityTutorialScreen commodityTutorialScreen2 = this.f252262b;
                        return dli.f.a(commodityTutorialScreen2, (j) commodityTutorialScreen2.Q.getValue(), u.c((TrendViewDelegate) commodityTutorialScreen2.N.getValue()), commodityTutorialScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityTutorialScreen.m2()).a().get(k6j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k6j.a.class, " is not found"));
                        }
                        r6j.c cVar = ((r6j.c) aVar2.b()).F;
                        CommodityTutorialScreenContract$InputData commodityTutorialScreenContract$InputData = commodityTutorialScreen.K;
                        commodityTutorialScreenContract$InputData.getClass();
                        return new r6j.h(cVar, commodityTutorialScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommodityTutorialScreen.S;
                        return (j) ((r6j.h) commodityTutorialScreen.P.getValue()).f251914c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: r7j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityTutorialScreen f252262b;

            {
                this.f252262b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommodityTutorialScreen commodityTutorialScreen = this.f252262b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityTutorialScreen.S;
                        CommodityTutorialScreen commodityTutorialScreen2 = this.f252262b;
                        return dli.f.a(commodityTutorialScreen2, (j) commodityTutorialScreen2.Q.getValue(), u.c((TrendViewDelegate) commodityTutorialScreen2.N.getValue()), commodityTutorialScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityTutorialScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(commodityTutorialScreen.m2()).a().get(k6j.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k6j.a.class, " is not found"));
                        }
                        r6j.c cVar = ((r6j.c) aVar2.b()).F;
                        CommodityTutorialScreenContract$InputData commodityTutorialScreenContract$InputData = commodityTutorialScreen.K;
                        commodityTutorialScreenContract$InputData.getClass();
                        return new r6j.h(cVar, commodityTutorialScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommodityTutorialScreen.S;
                        return (j) ((r6j.h) commodityTutorialScreen.P.getValue()).f251914c.get();
                }
            }
        });
        this.R = j.b(b.f252263a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        r7j.h hVar = uiState.f252270a;
        ?? r110 = hVar.f252268a;
        screenRecyclerNavbarFooterNextbuttonToolbar.setTitle(r110, null);
        screenRecyclerNavbarFooterNextbuttonToolbar.setToolbarTitle(r110);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionText(hVar.f252269b);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setText(uiState.f252272c.f252267a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return (AnalyticsProduct) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r6j.h) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (r7j.j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        screenRecyclerNavbarFooterNextbuttonToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        screenRecyclerNavbarFooterNextbuttonToolbar.setDescriptionVisible(false);
        screenRecyclerNavbarFooterNextbuttonToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar screenRecyclerNavbarFooterNextbuttonToolbar = d3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonToolbar, "screenRecyclerNavbarFooterNextbuttonToolbar");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonToolbar.f59410q), new d(this, null, 0), 3);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        ViewController.P2(this, rd0.e.b(screenRecyclerNavbarFooterNextbuttonButton.o), new d(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
