package com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.EsimExpiredSubscriptionsScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import r0e.c;
import rhj.b;
import rhj.d;
import rhj.i;
import rhj.j;
import rhj.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/expired_subscriptions/EsimExpiredSubscriptionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrhj/i;", "Ldli/a;", "Lrhj/k;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimExpiredSubscriptionsScreen extends ViewController<i> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimExpiredSubscriptionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final EsimDelegate M = new EsimDelegate();
    public final EsimDetailsDelegate N = new EsimDetailsDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final Object P;
    public final Object Q;
    public final Object R;

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

    public EsimExpiredSubscriptionsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: rhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimExpiredSubscriptionsScreen f254494b;

            {
                this.f254494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen = this.f254494b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimExpiredSubscriptionsScreen.S;
                        EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen2 = this.f254494b;
                        return dli.f.a(esimExpiredSubscriptionsScreen2, esimExpiredSubscriptionsScreen2.R2(), v.k(esimExpiredSubscriptionsScreen2.M, esimExpiredSubscriptionsScreen2.N, new EsimLoadingDelegate(), esimExpiredSubscriptionsScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimExpiredSubscriptionsScreen.S;
                        qji.b bVarU2 = esimExpiredSubscriptionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.di.EsimExpiredSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new afj.i(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimExpiredSubscriptionsScreen.S;
                        return (j) ((afj.i) esimExpiredSubscriptionsScreen.Q.getValue()).f4280c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimExpiredSubscriptionsScreen f254494b;

            {
                this.f254494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen = this.f254494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimExpiredSubscriptionsScreen.S;
                        EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen2 = this.f254494b;
                        return dli.f.a(esimExpiredSubscriptionsScreen2, esimExpiredSubscriptionsScreen2.R2(), v.k(esimExpiredSubscriptionsScreen2.M, esimExpiredSubscriptionsScreen2.N, new EsimLoadingDelegate(), esimExpiredSubscriptionsScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimExpiredSubscriptionsScreen.S;
                        qji.b bVarU2 = esimExpiredSubscriptionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.di.EsimExpiredSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new afj.i(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimExpiredSubscriptionsScreen.S;
                        return (j) ((afj.i) esimExpiredSubscriptionsScreen.Q.getValue()).f4280c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rhj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimExpiredSubscriptionsScreen f254494b;

            {
                this.f254494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen = this.f254494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimExpiredSubscriptionsScreen.S;
                        EsimExpiredSubscriptionsScreen esimExpiredSubscriptionsScreen2 = this.f254494b;
                        return dli.f.a(esimExpiredSubscriptionsScreen2, esimExpiredSubscriptionsScreen2.R2(), v.k(esimExpiredSubscriptionsScreen2.M, esimExpiredSubscriptionsScreen2.N, new EsimLoadingDelegate(), esimExpiredSubscriptionsScreen2.O, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimExpiredSubscriptionsScreen.S;
                        qji.b bVarU2 = esimExpiredSubscriptionsScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.expired_subscriptions.di.EsimExpiredSubscriptionsScreenInjector");
                        }
                        afj.m mVar = (afj.m) bVarU2;
                        return new afj.i(mVar.f4337b, mVar.f4338c);
                    default:
                        KProperty[] kPropertyArr3 = EsimExpiredSubscriptionsScreen.S;
                        return (j) ((afj.i) esimExpiredSubscriptionsScreen.Q.getValue()).f4280c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((k) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (afj.i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_home_expired_subscriptions_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_home_expired_subscriptions_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new c(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.d), new rhj.c(this, null), 3);
        EsimDetailsDelegate esimDetailsDelegate = this.N;
        ViewController.P2(this, rd0.e.b(esimDetailsDelegate.e), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(esimDetailsDelegate.d), new rhj.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
