package com.revolut.feature.pay_with_smile.impl.ui.settings;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cm9.c;
import cm9.d;
import cm9.i;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
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
import te0.w;
import tl9.f;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/settings/PayWithSmileSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lcm9/i;", "<init>", "()V", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithSmileSettingsScreen extends ViewController<Object> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PayWithSmileSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final int N = R$layout.screen_recycler_navbar;
    public final boolean O = true;
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

    public PayWithSmileSettingsScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: cm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileSettingsScreen f25168b;

            {
                this.f25168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PayWithSmileSettingsScreen payWithSmileSettingsScreen = this.f25168b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithSmileSettingsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileSettingsScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new tl9.f(((tl9.c) ((tl9.g) aVar2.b())).k, payWithSmileSettingsScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithSmileSettingsScreen.S;
                        return (h) ((tl9.f) payWithSmileSettingsScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithSmileSettingsScreen.S;
                        PayWithSmileSettingsScreen payWithSmileSettingsScreen2 = this.f25168b;
                        return dli.f.a(payWithSmileSettingsScreen2, payWithSmileSettingsScreen2.R2(), v.k(payWithSmileSettingsScreen2.L, new RowLoadingDelegate(), payWithSmileSettingsScreen2.M), payWithSmileSettingsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: cm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileSettingsScreen f25168b;

            {
                this.f25168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PayWithSmileSettingsScreen payWithSmileSettingsScreen = this.f25168b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithSmileSettingsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileSettingsScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new tl9.f(((tl9.c) ((tl9.g) aVar2.b())).k, payWithSmileSettingsScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithSmileSettingsScreen.S;
                        return (h) ((tl9.f) payWithSmileSettingsScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithSmileSettingsScreen.S;
                        PayWithSmileSettingsScreen payWithSmileSettingsScreen2 = this.f25168b;
                        return dli.f.a(payWithSmileSettingsScreen2, payWithSmileSettingsScreen2.R2(), v.k(payWithSmileSettingsScreen2.L, new RowLoadingDelegate(), payWithSmileSettingsScreen2.M), payWithSmileSettingsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: cm9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileSettingsScreen f25168b;

            {
                this.f25168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PayWithSmileSettingsScreen payWithSmileSettingsScreen = this.f25168b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PayWithSmileSettingsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileSettingsScreen.m2()).a().get(tl9.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new tl9.f(((tl9.c) ((tl9.g) aVar2.b())).k, payWithSmileSettingsScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", tl9.g.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = PayWithSmileSettingsScreen.S;
                        return (h) ((tl9.f) payWithSmileSettingsScreen.P.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = PayWithSmileSettingsScreen.S;
                        PayWithSmileSettingsScreen payWithSmileSettingsScreen2 = this.f25168b;
                        return dli.f.a(payWithSmileSettingsScreen2, payWithSmileSettingsScreen2.R2(), v.k(payWithSmileSettingsScreen2.L, new RowLoadingDelegate(), payWithSmileSettingsScreen2.M), payWithSmileSettingsScreen2.d3().f174540c.getId(), null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = uiState.f25171b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(uiState.f25172c);
        navBarWithToolbar.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new c(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.L;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53225r), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new cm9.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new cm9.f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cm9.h R2() {
        return (cm9.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
