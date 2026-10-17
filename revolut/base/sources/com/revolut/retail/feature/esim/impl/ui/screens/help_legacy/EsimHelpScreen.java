package com.revolut.retail.feature.esim.impl.ui.screens.help_legacy;

import afj.g1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bi2.n;
import bij.c;
import bij.e;
import bij.f;
import bij.g;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.EsimHelpScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/help_legacy/EsimHelpScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbij/e;", "Ldli/a;", "Lbij/g;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimHelpScreen extends ViewController<e> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimHelpScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final FooterTextDelegate N = new FooterTextDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final CellDetailsChevronDelegate P = new CellDetailsChevronDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public EsimHelpScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f15508b;

            {
                this.f15508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimHelpScreen esimHelpScreen = this.f15508b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.T;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.di.EsimHelpScreenInjector");
                        return ((cij.b) bVarU2).M().a(esimHelpScreen).build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.T;
                        g1 g1Var = (g1) esimHelpScreen.Q.getValue();
                        switch (g1Var.f4254a) {
                            case 0:
                                return (f) g1Var.d.get();
                            case 1:
                                return (f) g1Var.d.get();
                            case 2:
                                return (f) g1Var.d.get();
                            case 3:
                                return (f) g1Var.d.get();
                            case 4:
                                return (f) g1Var.d.get();
                            case 5:
                                return (f) g1Var.d.get();
                            default:
                                return (f) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.T;
                        EsimHelpScreen esimHelpScreen2 = this.f15508b;
                        return dli.f.a(esimHelpScreen2, (f) esimHelpScreen2.R.getValue(), v.k(esimHelpScreen2.N, esimHelpScreen2.O, esimHelpScreen2.P, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: bij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f15508b;

            {
                this.f15508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimHelpScreen esimHelpScreen = this.f15508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.T;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.di.EsimHelpScreenInjector");
                        return ((cij.b) bVarU2).M().a(esimHelpScreen).build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.T;
                        g1 g1Var = (g1) esimHelpScreen.Q.getValue();
                        switch (g1Var.f4254a) {
                            case 0:
                                return (f) g1Var.d.get();
                            case 1:
                                return (f) g1Var.d.get();
                            case 2:
                                return (f) g1Var.d.get();
                            case 3:
                                return (f) g1Var.d.get();
                            case 4:
                                return (f) g1Var.d.get();
                            case 5:
                                return (f) g1Var.d.get();
                            default:
                                return (f) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.T;
                        EsimHelpScreen esimHelpScreen2 = this.f15508b;
                        return dli.f.a(esimHelpScreen2, (f) esimHelpScreen2.R.getValue(), v.k(esimHelpScreen2.N, esimHelpScreen2.O, esimHelpScreen2.P, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: bij.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimHelpScreen f15508b;

            {
                this.f15508b = this;
            }

            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimHelpScreen esimHelpScreen = this.f15508b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimHelpScreen.T;
                        qji.b bVarU2 = esimHelpScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.help_legacy.di.EsimHelpScreenInjector");
                        return ((cij.b) bVarU2).M().a(esimHelpScreen).build();
                    case 1:
                        KProperty[] kPropertyArr2 = EsimHelpScreen.T;
                        g1 g1Var = (g1) esimHelpScreen.Q.getValue();
                        switch (g1Var.f4254a) {
                            case 0:
                                return (f) g1Var.d.get();
                            case 1:
                                return (f) g1Var.d.get();
                            case 2:
                                return (f) g1Var.d.get();
                            case 3:
                                return (f) g1Var.d.get();
                            case 4:
                                return (f) g1Var.d.get();
                            case 5:
                                return (f) g1Var.d.get();
                            default:
                                return (f) g1Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = EsimHelpScreen.T;
                        EsimHelpScreen esimHelpScreen2 = this.f15508b;
                        return dli.f.a(esimHelpScreen2, (f) esimHelpScreen2.R.getValue(), v.k(esimHelpScreen2.N, esimHelpScreen2.O, esimHelpScreen2.P, new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_help_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_help_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new bf5.a(this, continuation, 7), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new n(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f51821c), new bij.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
