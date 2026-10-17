package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import cli.o;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import jd1.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ld1.m;
import te0.w;
import vc.s;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/b;", "Lski/a;", "Lxd1/h;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$Step;", "Lxc1/a;", "<init>", "()V", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LitePosFlow extends ViewController<b> implements ski.a, xc1.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(LitePosFlow.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenLitePosBinding;", 0))};
    public final ao.h K = s.t(this, a.f);
    public final int L = R$layout.screen_lite_pos;
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, i.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenLitePosBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.litePosScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.litePosScreen_primaryActionButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.litePosScreen_secondaryActionButton;
                    LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                    if (largeActionButton2 != null) {
                        i = R$id.litePosScreen_tabs;
                        FixedTabs fixedTabs = (FixedTabs) ViewBindings.findChildViewById(p0, i);
                        if (fixedTabs != null) {
                            i = R$id.litePosScreen_viewPager;
                            if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                                return new i((ControllerContainerConstraintLayout) p0, navBarWithToolbar, largeActionButton, largeActionButton2, fixedTabs);
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public LitePosFlow() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: xd1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosFlow f304209b;

            {
                this.f304209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LitePosFlow litePosFlow = this.f304209b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(litePosFlow.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ld1.m(((ld1.l) aVar2.b()).f, litePosFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosFlow.P;
                        return (d) ((ld1.m) litePosFlow.M.getValue()).f193974j.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosFlow.P;
                        return czi.c.c(litePosFlow, R$id.litePosScreen_viewPager, litePosFlow.R2());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: xd1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosFlow f304209b;

            {
                this.f304209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LitePosFlow litePosFlow = this.f304209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(litePosFlow.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ld1.m(((ld1.l) aVar2.b()).f, litePosFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosFlow.P;
                        return (d) ((ld1.m) litePosFlow.M.getValue()).f193974j.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosFlow.P;
                        return czi.c.c(litePosFlow, R$id.litePosScreen_viewPager, litePosFlow.R2());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: xd1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LitePosFlow f304209b;

            {
                this.f304209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                LitePosFlow litePosFlow = this.f304209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LitePosFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(litePosFlow.m2()).a().get(ld1.l.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ld1.m(((ld1.l) aVar2.b()).f, litePosFlow);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ld1.l.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = LitePosFlow.P;
                        return (d) ((ld1.m) litePosFlow.M.getValue()).f193974j.get();
                    default:
                        KProperty[] kPropertyArr3 = LitePosFlow.P;
                        return czi.c.c(litePosFlow, R$id.litePosScreen_viewPager, litePosFlow.R2());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        xd1.h uiState = (xd1.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f172931c;
        xd1.f fVar = uiState.d;
        xd1.g gVar = uiState.e;
        NumberClause numberClause = fVar.f304213b;
        largeActionButton.setBadge(numberClause != null ? new NewBadgeContent.WithNumber(numberClause) : null);
        largeActionButton.setIcon(fVar.f304212a);
        largeActionButton.setEnabled(true);
        LargeActionButton largeActionButton2 = d3().d;
        largeActionButton2.setEnabled(gVar.f304214a);
        largeActionButton2.setText(gVar.f304215b);
        FixedTabs litePosScreenTabs = d3().e;
        Intrinsics.checkNotNullExpressionValue(litePosScreenTabs, "litePosScreenTabs");
        litePosScreenTabs.setVisibility(uiState.f304218c ? 0 : 8);
        d3().e.setItems(uiState.f304216a, uiState.f304217b);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        LitePosFlowContract$Step step = (LitePosFlowContract$Step) pagerItem;
        Intrinsics.checkNotNullParameter(step, "step");
        ((g) R2()).getClass();
        Intrinsics.checkNotNullParameter(step, "step");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (m) this.M.getValue();
    }

    @Override // xc1.a
    public final tji.f X() {
        Object objR2 = R2();
        Intrinsics.i(objR2, "null cannot be cast to non-null type com.revolut.kompot.navigable.ControllerModel");
        return ((l) objR2).X();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f172930b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setVisibility(0);
        LargeActionButton largeActionButton = d3().f172931c;
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        largeActionButton.o(defaultFilledButton);
        d3().d.o(defaultFilledButton);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f172930b.f59410q), null, new xd1.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f), null, new xd1.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(zi0.c.K(d3().f172931c.o)), null, new xd1.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(zi0.c.K(d3().d.o)), null, new xd1.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, ((g) R2()).z, null, new xd1.c(this, null, 1), 3);
    }

    public final i d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (i) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final xd1.d d() {
        return (xd1.d) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.O.getValue();
    }
}
