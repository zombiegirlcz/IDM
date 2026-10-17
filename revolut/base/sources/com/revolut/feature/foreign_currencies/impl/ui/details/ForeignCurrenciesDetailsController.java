package com.revolut.feature.foreign_currencies.impl.ui.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.foreign_currencies.impl.R$string;
import com.revolut.feature.foreign_currencies.impl.ui.details.ForeignCurrenciesDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import nq6.b;
import qq6.c;
import qq6.f;
import qq6.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/foreign_currencies/impl/ui/details/ForeignCurrenciesDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqq6/f;", "Ldli/a;", "Lqq6/g;", "<init>", "()V", "feature_foreign_currencies_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ForeignCurrenciesDetailsController extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ForeignCurrenciesDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_footer_nextbutton;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.s.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.s.a(p0);
        }
    }

    public ForeignCurrenciesDetailsController() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesDetailsController f248493b;

            {
                this.f248493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ForeignCurrenciesDetailsController foreignCurrenciesDetailsController = this.f248493b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ForeignCurrenciesDetailsController.P;
                        qji.b bVarU2 = foreignCurrenciesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.foreign_currencies.impl.ui.flow.di.ForeignCurrenciesFlowComponent");
                        return new nq6.b(((nq6.c) bVarU2).f218369a);
                    case 1:
                        KProperty[] kPropertyArr2 = ForeignCurrenciesDetailsController.P;
                        return new c(new d(), new oq6.a(((nq6.b) foreignCurrenciesDetailsController.M.getValue()).f218368a.f218366b.b()));
                    default:
                        KProperty[] kPropertyArr3 = ForeignCurrenciesDetailsController.P;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        ForeignCurrenciesDetailsController foreignCurrenciesDetailsController2 = this.f248493b;
                        return dli.f.a(foreignCurrenciesDetailsController2, (c) foreignCurrenciesDetailsController2.N.getValue(), v.k(new FullScreenStateDelegate(), new SegmentedGaugeChartLoadingDelegate(), new SegmentedGaugeChartDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesDetailsController f248493b;

            {
                this.f248493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ForeignCurrenciesDetailsController foreignCurrenciesDetailsController = this.f248493b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ForeignCurrenciesDetailsController.P;
                        qji.b bVarU2 = foreignCurrenciesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.foreign_currencies.impl.ui.flow.di.ForeignCurrenciesFlowComponent");
                        return new nq6.b(((nq6.c) bVarU2).f218369a);
                    case 1:
                        KProperty[] kPropertyArr2 = ForeignCurrenciesDetailsController.P;
                        return new c(new d(), new oq6.a(((nq6.b) foreignCurrenciesDetailsController.M.getValue()).f218368a.f218366b.b()));
                    default:
                        KProperty[] kPropertyArr3 = ForeignCurrenciesDetailsController.P;
                        int i3 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        ForeignCurrenciesDetailsController foreignCurrenciesDetailsController2 = this.f248493b;
                        return dli.f.a(foreignCurrenciesDetailsController2, (c) foreignCurrenciesDetailsController2.N.getValue(), v.k(new FullScreenStateDelegate(), new SegmentedGaugeChartLoadingDelegate(), new SegmentedGaugeChartDelegate()), i3, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: qq6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ForeignCurrenciesDetailsController f248493b;

            {
                this.f248493b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ForeignCurrenciesDetailsController foreignCurrenciesDetailsController = this.f248493b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ForeignCurrenciesDetailsController.P;
                        qji.b bVarU2 = foreignCurrenciesDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.foreign_currencies.impl.ui.flow.di.ForeignCurrenciesFlowComponent");
                        return new nq6.b(((nq6.c) bVarU2).f218369a);
                    case 1:
                        KProperty[] kPropertyArr2 = ForeignCurrenciesDetailsController.P;
                        return new c(new d(), new oq6.a(((nq6.b) foreignCurrenciesDetailsController.M.getValue()).f218368a.f218366b.b()));
                    default:
                        KProperty[] kPropertyArr3 = ForeignCurrenciesDetailsController.P;
                        int i32 = R$id.screenRecyclerNavbarFooterNextbutton_recyclerView;
                        ForeignCurrenciesDetailsController foreignCurrenciesDetailsController2 = this.f248493b;
                        return dli.f.a(foreignCurrenciesDetailsController2, (c) foreignCurrenciesDetailsController2.N.getValue(), v.k(new FullScreenStateDelegate(), new SegmentedGaugeChartLoadingDelegate(), new SegmentedGaugeChartDelegate()), i32, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(uiState.f248498b ? 0 : 8);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        screenRecyclerNavbarFooterNextbuttonFooterView.setVisibility(uiState.f248499c ? 0 : 8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.foreign_currencies_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.foreign_currencies_title, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.foreign_currencies_description, null, null, 14));
        d3().f174558c.setTextClause(new TextLocalisedClause(R$string.foreign_currencies_footer, null, null, 14));
        d3().f174557b.setText(new TextLocalisedClause(R$string.foreign_currencies_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new qq6.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new qq6.b(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
