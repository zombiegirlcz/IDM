package com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import az.i;
import bb9.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.ChangePlayStoreCountryController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.f;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import no.m;
import ta9.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/onboarding/impl/onboarding/india_app_redirection/prompts/ChangePlayStoreCountryContract$OutputData;", "Ldli/a;", "Lbb9/b;", "Lno/m;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChangePlayStoreCountryController extends ViewController<ChangePlayStoreCountryContract$OutputData> implements dli.a, m {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ChangePlayStoreCountryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final k9 M;
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, jii.m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.m.a(p0);
        }
    }

    public ChangePlayStoreCountryController() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.k;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        this.M = k9Var;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bb9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePlayStoreCountryController f14197b;

            {
                this.f14197b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ChangePlayStoreCountryController changePlayStoreCountryController = this.f14197b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ChangePlayStoreCountryController.Q;
                        qji.b bVarU2 = changePlayStoreCountryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.di.ChangePlayStoreCountryScreenInjector");
                        return new ta9.c();
                    case 1:
                        KProperty[] kPropertyArr2 = ChangePlayStoreCountryController.Q;
                        ((ta9.c) changePlayStoreCountryController.N.getValue()).getClass();
                        return new com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.a(new d());
                    default:
                        KProperty[] kPropertyArr3 = ChangePlayStoreCountryController.Q;
                        ChangePlayStoreCountryController changePlayStoreCountryController2 = this.f14197b;
                        return f.a(changePlayStoreCountryController2, (a) changePlayStoreCountryController2.O.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: bb9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePlayStoreCountryController f14197b;

            {
                this.f14197b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ChangePlayStoreCountryController changePlayStoreCountryController = this.f14197b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChangePlayStoreCountryController.Q;
                        qji.b bVarU2 = changePlayStoreCountryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.di.ChangePlayStoreCountryScreenInjector");
                        return new ta9.c();
                    case 1:
                        KProperty[] kPropertyArr2 = ChangePlayStoreCountryController.Q;
                        ((ta9.c) changePlayStoreCountryController.N.getValue()).getClass();
                        return new com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.a(new d());
                    default:
                        KProperty[] kPropertyArr3 = ChangePlayStoreCountryController.Q;
                        ChangePlayStoreCountryController changePlayStoreCountryController2 = this.f14197b;
                        return f.a(changePlayStoreCountryController2, (a) changePlayStoreCountryController2.O.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: bb9.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChangePlayStoreCountryController f14197b;

            {
                this.f14197b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ChangePlayStoreCountryController changePlayStoreCountryController = this.f14197b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ChangePlayStoreCountryController.Q;
                        qji.b bVarU2 = changePlayStoreCountryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.di.ChangePlayStoreCountryScreenInjector");
                        return new ta9.c();
                    case 1:
                        KProperty[] kPropertyArr2 = ChangePlayStoreCountryController.Q;
                        ((ta9.c) changePlayStoreCountryController.N.getValue()).getClass();
                        return new com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.prompts.a(new d());
                    default:
                        KProperty[] kPropertyArr3 = ChangePlayStoreCountryController.Q;
                        ChangePlayStoreCountryController changePlayStoreCountryController2 = this.f14197b;
                        return f.a(changePlayStoreCountryController2, (a) changePlayStoreCountryController2.O.getValue(), v.k(new ListSubheaderDelegate(), new ListCellDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(uiState.f14193a, null);
        navBarWithToolbar.setDescriptionText(uiState.f14194b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getP() {
        return new AnalyticsProduct.Retail(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bb9.a) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), new i(this, null, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
