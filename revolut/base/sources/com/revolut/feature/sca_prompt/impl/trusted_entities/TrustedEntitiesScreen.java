package com.revolut.feature.sca_prompt.impl.trusted_entities;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.sca_prompt.impl.R$string;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfj.j2;
import nsc.c;
import nsc.d;
import nsc.g;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/sca_prompt/impl/trusted_entities/TrustedEntitiesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lnsc/h;", "<init>", "()V", "feature_sca_prompt_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrustedEntitiesScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(TrustedEntitiesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate P = new FullScreenStateDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public TrustedEntitiesScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nsc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedEntitiesScreen f218777b;

            {
                this.f218777b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TrustedEntitiesScreen trustedEntitiesScreen = this.f218777b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedEntitiesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(trustedEntitiesScreen.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new gsc.e(((gsc.c) aVar2.b()).f, trustedEntitiesScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedEntitiesScreen.R;
                        return (g) ((gsc.e) trustedEntitiesScreen.M.getValue()).f146388c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrustedEntitiesScreen.R;
                        TrustedEntitiesScreen trustedEntitiesScreen2 = this.f218777b;
                        return dli.f.a(trustedEntitiesScreen2, trustedEntitiesScreen2.R2(), v.k(trustedEntitiesScreen2.O, trustedEntitiesScreen2.P, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: nsc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedEntitiesScreen f218777b;

            {
                this.f218777b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TrustedEntitiesScreen trustedEntitiesScreen = this.f218777b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedEntitiesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(trustedEntitiesScreen.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new gsc.e(((gsc.c) aVar2.b()).f, trustedEntitiesScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedEntitiesScreen.R;
                        return (g) ((gsc.e) trustedEntitiesScreen.M.getValue()).f146388c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrustedEntitiesScreen.R;
                        TrustedEntitiesScreen trustedEntitiesScreen2 = this.f218777b;
                        return dli.f.a(trustedEntitiesScreen2, trustedEntitiesScreen2.R2(), v.k(trustedEntitiesScreen2.O, trustedEntitiesScreen2.P, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nsc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrustedEntitiesScreen f218777b;

            {
                this.f218777b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TrustedEntitiesScreen trustedEntitiesScreen = this.f218777b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TrustedEntitiesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(trustedEntitiesScreen.m2()).a().get(gsc.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new gsc.e(((gsc.c) aVar2.b()).f, trustedEntitiesScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", gsc.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = TrustedEntitiesScreen.R;
                        return (g) ((gsc.e) trustedEntitiesScreen.M.getValue()).f146388c.get();
                    default:
                        KProperty[] kPropertyArr3 = TrustedEntitiesScreen.R;
                        TrustedEntitiesScreen trustedEntitiesScreen2 = this.f218777b;
                        return dli.f.a(trustedEntitiesScreen2, trustedEntitiesScreen2.R2(), v.k(trustedEntitiesScreen2.O, trustedEntitiesScreen2.P, new ListSubheaderDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        nsc.h uiState = (nsc.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = uiState.f218781b;
        navBarWithToolbar.setSecondDescriptionText(clause);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gsc.e) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_sca_trusted_entities_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.crypto_sca_trusted_entities_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new j2(this, null, 26), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new c(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new nsc.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
