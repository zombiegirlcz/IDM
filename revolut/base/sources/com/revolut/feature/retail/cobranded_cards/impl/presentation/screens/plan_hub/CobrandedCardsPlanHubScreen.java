package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import b6b.e0;
import b6b.f0;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HighlightTileDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.CobrandedCardsPlanHubScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g7b.j;
import g7b.k;
import g7b.l;
import g7b.p;
import i7d.i;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/plan_hub/CobrandedCardsPlanHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg7b/p;", "Li7d/i;", "<init>", "()V", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsPlanHubScreen extends ViewController<q> implements dli.a, i {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CobrandedCardsPlanHubScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new g53.e(7));
    public final Object N = w.y0(new g53.e(8));
    public final Object O = w.y0(new g53.e(9));
    public final Object P = w.y0(new g53.e(10));
    public final Object Q = w.y0(new g53.e(11));
    public final Object R = w.y0(new g53.e(12));
    public final Object S;
    public final Object T;
    public final Object U;

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

    public CobrandedCardsPlanHubScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: g7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubScreen f141144b;

            {
                this.f141144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen = this.f141144b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubScreen.V;
                        CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen2 = this.f141144b;
                        return dli.f.a(cobrandedCardsPlanHubScreen2, cobrandedCardsPlanHubScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ActionWidgetDelegate) cobrandedCardsPlanHubScreen2.M.getValue(), (RowDelegate) cobrandedCardsPlanHubScreen2.N.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubScreen2.P.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubScreen2.Q.getValue(), (HighlightTileDelegate) cobrandedCardsPlanHubScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.di.CobrandedCardsPlanHubScreenInjector");
                        }
                        e0 e0Var = (e0) ((h7b.a) bVarU2).b().mo3808a(cobrandedCardsPlanHubScreen);
                        switch (e0Var.f12583a) {
                            case 0:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                            default:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                        }
                        return (f0) e0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubScreen.V;
                        f0 f0Var = (f0) cobrandedCardsPlanHubScreen.T.getValue();
                        switch (f0Var.f12588a) {
                            case 0:
                                return (o) f0Var.f12591g.get();
                            default:
                                return (o) f0Var.f12591g.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: g7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubScreen f141144b;

            {
                this.f141144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen = this.f141144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubScreen.V;
                        CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen2 = this.f141144b;
                        return dli.f.a(cobrandedCardsPlanHubScreen2, cobrandedCardsPlanHubScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ActionWidgetDelegate) cobrandedCardsPlanHubScreen2.M.getValue(), (RowDelegate) cobrandedCardsPlanHubScreen2.N.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubScreen2.P.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubScreen2.Q.getValue(), (HighlightTileDelegate) cobrandedCardsPlanHubScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.di.CobrandedCardsPlanHubScreenInjector");
                        }
                        e0 e0Var = (e0) ((h7b.a) bVarU2).b().mo3808a(cobrandedCardsPlanHubScreen);
                        switch (e0Var.f12583a) {
                            case 0:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                            default:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                        }
                        return (f0) e0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubScreen.V;
                        f0 f0Var = (f0) cobrandedCardsPlanHubScreen.T.getValue();
                        switch (f0Var.f12588a) {
                            case 0:
                                return (o) f0Var.f12591g.get();
                            default:
                                return (o) f0Var.f12591g.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: g7b.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsPlanHubScreen f141144b;

            {
                this.f141144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen = this.f141144b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsPlanHubScreen.V;
                        CobrandedCardsPlanHubScreen cobrandedCardsPlanHubScreen2 = this.f141144b;
                        return dli.f.a(cobrandedCardsPlanHubScreen2, cobrandedCardsPlanHubScreen2.d(), zhm.v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), (ActionWidgetDelegate) cobrandedCardsPlanHubScreen2.M.getValue(), (RowDelegate) cobrandedCardsPlanHubScreen2.N.getValue(), new RowLoadingDelegate(), (InputDisclosureDelegate) cobrandedCardsPlanHubScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsPlanHubScreen2.P.getValue(), (LargeActionButtonDelegate) cobrandedCardsPlanHubScreen2.Q.getValue(), (HighlightTileDelegate) cobrandedCardsPlanHubScreen2.R.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsPlanHubScreen.V;
                        qji.b bVarU2 = cobrandedCardsPlanHubScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.di.CobrandedCardsPlanHubScreenInjector");
                        }
                        e0 e0Var = (e0) ((h7b.a) bVarU2).b().mo3808a(cobrandedCardsPlanHubScreen);
                        switch (e0Var.f12583a) {
                            case 0:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                            default:
                                e0Var.d = cobrandedCardsPlanHubScreen;
                                break;
                        }
                        return (f0) e0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsPlanHubScreen.V;
                        f0 f0Var = (f0) cobrandedCardsPlanHubScreen.T.getValue();
                        switch (f0Var.f12588a) {
                            case 0:
                                return (o) f0Var.f12591g.get();
                            default:
                                return (o) f0Var.f12591g.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((p) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f0) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // i7d.i
    public final koi.a b1() {
        return ((dli.c) this.S.getValue()).w();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new k(this, null), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((HighlightTileDelegate) this.R.getValue()).f52437c), 21), new j(this, null, 2), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), 22), new j(this, null, 3), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((InputDisclosureDelegate) this.O.getValue()).f52538c), 23), new l(this, null), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((ActionWidgetDelegate) this.M.getValue()).f51589c.f121375b), 20), new g7b.m(this, null), 3);
        ?? r62 = this.N;
        ViewController.P2(this, rd0.e.b(((RowDelegate) r62.getValue()).k), new g7b.i(this, null), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 24), new j(this, null, 0), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(((RowDelegate) r62.getValue()).f53218h), 25), new j(this, null, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g7b.o d() {
        return (g7b.o) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
