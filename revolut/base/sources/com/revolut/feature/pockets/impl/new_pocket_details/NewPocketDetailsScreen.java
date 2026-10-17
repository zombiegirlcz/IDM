package com.revolut.feature.pockets.impl.new_pocket_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pockets.impl.R$string;
import com.revolut.feature.pockets.impl.new_pocket_details.NewPocketDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.f;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tea.c;
import tea.d;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pockets/impl/new_pocket_details/NewPocketDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "<init>", "()V", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewPocketDetailsScreen extends ViewController<Object> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(NewPocketDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object M;
    public final Object S;
    public final Object T;
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_recycler_navbar_nextbutton;
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final CellDetailsAccountDelegate P = new CellDetailsAccountDelegate();
    public final TwinHorizontalSmallButtonDelegate Q = new TwinHorizontalSmallButtonDelegate();
    public final SmallActionButtonDelegate R = new SmallActionButtonDelegate();

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public NewPocketDetailsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: tea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPocketDetailsScreen f270092b;

            {
                this.f270092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewPocketDetailsScreen newPocketDetailsScreen = this.f270092b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewPocketDetailsScreen.U;
                        NewPocketDetailsScreen newPocketDetailsScreen2 = this.f270092b;
                        newPocketDetailsScreen2.e3();
                        return f.a(newPocketDetailsScreen2, null, v.k(new CellDetailsLoadingDelegate(), newPocketDetailsScreen2.N, newPocketDetailsScreen2.O, newPocketDetailsScreen2.P, newPocketDetailsScreen2.Q, newPocketDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NewPocketDetailsScreen.U;
                        Intrinsics.i(newPocketDetailsScreen.U2(), "null cannot be cast to non-null type com.revolut.feature.pockets.impl.new_pocket_details.di.NewPocketDetailsScreenInjector");
                        throw new ClassCastException();
                    default:
                        KProperty[] kPropertyArr3 = NewPocketDetailsScreen.U;
                        newPocketDetailsScreen.S.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: tea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPocketDetailsScreen f270092b;

            {
                this.f270092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewPocketDetailsScreen newPocketDetailsScreen = this.f270092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewPocketDetailsScreen.U;
                        NewPocketDetailsScreen newPocketDetailsScreen2 = this.f270092b;
                        newPocketDetailsScreen2.e3();
                        return f.a(newPocketDetailsScreen2, null, v.k(new CellDetailsLoadingDelegate(), newPocketDetailsScreen2.N, newPocketDetailsScreen2.O, newPocketDetailsScreen2.P, newPocketDetailsScreen2.Q, newPocketDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NewPocketDetailsScreen.U;
                        Intrinsics.i(newPocketDetailsScreen.U2(), "null cannot be cast to non-null type com.revolut.feature.pockets.impl.new_pocket_details.di.NewPocketDetailsScreenInjector");
                        throw new ClassCastException();
                    default:
                        KProperty[] kPropertyArr3 = NewPocketDetailsScreen.U;
                        newPocketDetailsScreen.S.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: tea.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewPocketDetailsScreen f270092b;

            {
                this.f270092b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NewPocketDetailsScreen newPocketDetailsScreen = this.f270092b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewPocketDetailsScreen.U;
                        NewPocketDetailsScreen newPocketDetailsScreen2 = this.f270092b;
                        newPocketDetailsScreen2.e3();
                        return f.a(newPocketDetailsScreen2, null, v.k(new CellDetailsLoadingDelegate(), newPocketDetailsScreen2.N, newPocketDetailsScreen2.O, newPocketDetailsScreen2.P, newPocketDetailsScreen2.Q, newPocketDetailsScreen2.R), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = NewPocketDetailsScreen.U;
                        Intrinsics.i(newPocketDetailsScreen.U2(), "null cannot be cast to non-null type com.revolut.feature.pockets.impl.new_pocket_details.di.NewPocketDetailsScreenInjector");
                        throw new ClassCastException();
                    default:
                        KProperty[] kPropertyArr3 = NewPocketDetailsScreen.U;
                        newPocketDetailsScreen.S.getValue().getClass();
                        throw new ClassCastException();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        if (oVar != null) {
            throw new ClassCastException();
        }
        Intrinsics.checkNotNullParameter(null, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        if (this.S.getValue() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final /* bridge */ /* synthetic */ b R2() {
        e3();
        return null;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.new_account_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.new_account_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.new_account_details_action_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new tea.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new tea.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.d), new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53336c.f121375b), null, new d(this, null), 3);
        TwinHorizontalSmallButtonDelegate twinHorizontalSmallButtonDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.f53573c.f121375b), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(twinHorizontalSmallButtonDelegate.d.f121375b), null, new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new tea.e(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void e3() {
        if (this.T.getValue() != null) {
            throw new ClassCastException();
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.M.getValue();
    }
}
