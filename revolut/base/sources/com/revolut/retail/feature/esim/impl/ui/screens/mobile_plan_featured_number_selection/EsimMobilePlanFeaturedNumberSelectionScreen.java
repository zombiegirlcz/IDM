package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection;

import afj.a0;
import afj.x;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$id;
import com.revolut.retail.feature.esim.impl.R$layout;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData;
import dkj.b;
import dkj.c;
import dkj.d;
import dkj.f;
import dkj.j;
import dkj.k;
import dkj.l;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_featured_number_selection/EsimMobilePlanFeaturedNumberSelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldkj/j;", "Ldli/a;", "Ldkj/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanFeaturedNumberSelectionScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimMobilePlanFeaturedNumberSelectionScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/esim/impl/databinding/ScreenEsimMobilePlanFeaturedNumberSelectionBinding;", 0))};
    public final EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public EsimMobilePlanFeaturedNumberSelectionScreen(EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_esim_mobile_plan_featured_number_selection;
        this.M = w.y0(new dkd.a(5));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen f115568b;

            {
                this.f115568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = this.f115568b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen.M.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen2 = this.f115568b;
                        return dli.f.a(esimMobilePlanFeaturedNumberSelectionScreen2, esimMobilePlanFeaturedNumberSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), (RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.M.getValue(), (SelectableDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.O.getValue(), (LargeActionButtonDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.P.getValue()), R$id.esimMobilePlanFeaturedNumberSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        qji.b bVarU2 = esimMobilePlanFeaturedNumberSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.di.EsimMobilePlanFeaturedNumberSelectionScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = esimMobilePlanFeaturedNumberSelectionScreen.K;
                        esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.getClass();
                        return new x(bVar, a0Var2, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return (l) ((x) esimMobilePlanFeaturedNumberSelectionScreen.S.getValue()).f4515c.get();
                }
            }
        });
        this.O = w.y0(new dkd.a(6));
        this.P = w.y0(new dkd.a(7));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: dkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen f115568b;

            {
                this.f115568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = this.f115568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen.M.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen2 = this.f115568b;
                        return dli.f.a(esimMobilePlanFeaturedNumberSelectionScreen2, esimMobilePlanFeaturedNumberSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), (RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.M.getValue(), (SelectableDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.O.getValue(), (LargeActionButtonDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.P.getValue()), R$id.esimMobilePlanFeaturedNumberSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        qji.b bVarU2 = esimMobilePlanFeaturedNumberSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.di.EsimMobilePlanFeaturedNumberSelectionScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = esimMobilePlanFeaturedNumberSelectionScreen.K;
                        esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.getClass();
                        return new x(bVar, a0Var2, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return (l) ((x) esimMobilePlanFeaturedNumberSelectionScreen.S.getValue()).f4515c.get();
                }
            }
        });
        this.R = s.t(this, b.f);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: dkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen f115568b;

            {
                this.f115568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = this.f115568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen.M.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen2 = this.f115568b;
                        return dli.f.a(esimMobilePlanFeaturedNumberSelectionScreen2, esimMobilePlanFeaturedNumberSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), (RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.M.getValue(), (SelectableDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.O.getValue(), (LargeActionButtonDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.P.getValue()), R$id.esimMobilePlanFeaturedNumberSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        qji.b bVarU2 = esimMobilePlanFeaturedNumberSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.di.EsimMobilePlanFeaturedNumberSelectionScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = esimMobilePlanFeaturedNumberSelectionScreen.K;
                        esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.getClass();
                        return new x(bVar, a0Var2, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return (l) ((x) esimMobilePlanFeaturedNumberSelectionScreen.S.getValue()).f4515c.get();
                }
            }
        });
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: dkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanFeaturedNumberSelectionScreen f115568b;

            {
                this.f115568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen = this.f115568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return new SelectableDelegate((RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen.M.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        EsimMobilePlanFeaturedNumberSelectionScreen esimMobilePlanFeaturedNumberSelectionScreen2 = this.f115568b;
                        return dli.f.a(esimMobilePlanFeaturedNumberSelectionScreen2, esimMobilePlanFeaturedNumberSelectionScreen2.R2(), v.k(new RowLoadingDelegate(), new LargeActionButtonLoadingDelegate(), (RowDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.M.getValue(), (SelectableDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.O.getValue(), (LargeActionButtonDelegate) esimMobilePlanFeaturedNumberSelectionScreen2.P.getValue()), R$id.esimMobilePlanFeaturedNumberSelectionScreen_recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr3 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        qji.b bVarU2 = esimMobilePlanFeaturedNumberSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.di.EsimMobilePlanFeaturedNumberSelectionScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = esimMobilePlanFeaturedNumberSelectionScreen.K;
                        esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.getClass();
                        return new x(bVar, a0Var2, esimMobilePlanFeaturedNumberSelectionScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr4 = EsimMobilePlanFeaturedNumberSelectionScreen.U;
                        return (l) ((x) esimMobilePlanFeaturedNumberSelectionScreen.S.getValue()).f4515c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithBigTile navBarWithBigTile = d3().d;
        dkj.h hVar = uiState.f115576b;
        TextLocalisedClause textLocalisedClause = hVar.f115572a;
        navBarWithBigTile.setToolbarTitle(textLocalisedClause);
        navBarWithBigTile.setTitle(textLocalisedClause);
        navBarWithBigTile.setDescription(hVar.f115573b);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f296807c.setText(new TextLocalisedClause(R$string.esim_mobile_plans_vip_number_selection_cta, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f296806b.setBackgroundType(AnimatedBackgroundType.PLAN_METAL.f51479a);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59357t), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f296807c.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.N.getValue()).r()), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), null, new dkj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), null, new f(this, null), 3);
    }

    public final wej.d d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (wej.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l R2() {
        return (l) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
