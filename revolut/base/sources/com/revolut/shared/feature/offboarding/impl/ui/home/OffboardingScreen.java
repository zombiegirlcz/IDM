package com.revolut.shared.feature.offboarding.impl.ui.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import t8l.c;
import te0.w;
import v8l.b;
import vc.s;
import w5b.b6;
import w8l.d;
import w8l.f;
import w8l.g;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/offboarding/impl/ui/home/OffboardingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lw8l/g;", "<init>", "()V", "feature_shared_offboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OffboardingScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(OffboardingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final Object L = w.y0(new b6(26));
    public final Object M = w.y0(new b6(27));
    public final Object N = w.y0(new b6(28));
    public final h R = s.t(this, a.f);

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

    public OffboardingScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: w8l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OffboardingScreen f295652b;

            {
                this.f295652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OffboardingScreen offboardingScreen = this.f295652b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OffboardingScreen.S;
                        OffboardingScreen offboardingScreen2 = this.f295652b;
                        return dli.f.a(offboardingScreen2, offboardingScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate(), new NotificationCentreItemDelegate(), (PlainTextDelegate) offboardingScreen2.M.getValue(), (RowDelegate) offboardingScreen2.N.getValue(), (FullScreenStateDelegate) offboardingScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OffboardingScreen.S;
                        qji.b bVarU2 = offboardingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.shared.feature.offboarding.impl.ui.home.di.OffboardingHomeScreenInjector");
                        t8l.a aVar = ((t8l.b) bVarU2).f268905a;
                        t8l.c cVar = new t8l.c();
                        cVar.f268907a = e4m.b.b(new t1f.i(aVar, 6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = OffboardingScreen.S;
                        return (f) ((t8l.c) offboardingScreen.P.getValue()).f268907a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: w8l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OffboardingScreen f295652b;

            {
                this.f295652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OffboardingScreen offboardingScreen = this.f295652b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OffboardingScreen.S;
                        OffboardingScreen offboardingScreen2 = this.f295652b;
                        return dli.f.a(offboardingScreen2, offboardingScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate(), new NotificationCentreItemDelegate(), (PlainTextDelegate) offboardingScreen2.M.getValue(), (RowDelegate) offboardingScreen2.N.getValue(), (FullScreenStateDelegate) offboardingScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OffboardingScreen.S;
                        qji.b bVarU2 = offboardingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.shared.feature.offboarding.impl.ui.home.di.OffboardingHomeScreenInjector");
                        t8l.a aVar = ((t8l.b) bVarU2).f268905a;
                        t8l.c cVar = new t8l.c();
                        cVar.f268907a = e4m.b.b(new t1f.i(aVar, 6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = OffboardingScreen.S;
                        return (f) ((t8l.c) offboardingScreen.P.getValue()).f268907a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: w8l.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OffboardingScreen f295652b;

            {
                this.f295652b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OffboardingScreen offboardingScreen = this.f295652b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OffboardingScreen.S;
                        OffboardingScreen offboardingScreen2 = this.f295652b;
                        return dli.f.a(offboardingScreen2, offboardingScreen2.R2(), v.k(new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlainTextLoadingDelegate(), new ListSubheaderDelegate(), new NotificationCentreItemDelegate(), (PlainTextDelegate) offboardingScreen2.M.getValue(), (RowDelegate) offboardingScreen2.N.getValue(), (FullScreenStateDelegate) offboardingScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = OffboardingScreen.S;
                        qji.b bVarU2 = offboardingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.shared.feature.offboarding.impl.ui.home.di.OffboardingHomeScreenInjector");
                        t8l.a aVar = ((t8l.b) bVarU2).f268905a;
                        t8l.c cVar = new t8l.c();
                        cVar.f268907a = e4m.b.b(new t1f.i(aVar, 6));
                        return cVar;
                    default:
                        KProperty[] kPropertyArr3 = OffboardingScreen.S;
                        return (f) ((t8l.c) offboardingScreen.P.getValue()).f268907a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        b bVar = uiState.f295656b;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(bVar.f286903a, null);
        TextClause textClause = bVar.f286904b;
        navBarWithToolbar.setNavBarDescriptionModel(new com.revolut.core.ui_kit.views.navbar.q(62, textClause, null));
        NavBarWithToolbar.setToolbar$default(navBarWithToolbar, bVar.f286903a, textClause, null, 4, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), new w8l.b(this, null), 3);
        ?? r56 = this.M;
        ViewController.P2(this, rd0.e.b(((PlainTextDelegate) r56.getValue()).f.f121375b), new w8l.c(this, null), 3);
        int i = 9;
        ViewController.P2(this, rd0.e.b(((PlainTextDelegate) r56.getValue()).d.f121375b), new w50.g(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new w65.c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.L.getValue()).f52371h.f121375b), new d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
