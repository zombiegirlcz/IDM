package com.revolut.feature.credit.card.impl.ui.overdue_explainer;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.overdue_explainer.CreditCardOverdueExplainerController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jii.u;
import jm4.a3;
import jm4.n1;
import jm4.s1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import w01.k;
import wt4.c;
import wt4.f;
import wt4.g;
import wt4.i;
import wt4.j;
import wt4.l;
import wt4.n;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/overdue_explainer/CreditCardOverdueExplainerController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwt4/j;", "Lno/m;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardOverdueExplainerController extends ViewController<q> implements dli.a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CreditCardOverdueExplainerController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object N;
    public final Object O;
    public final Object Q;
    public final /* synthetic */ b K = b.f128075a;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new wq1.a(9));
    public final int P = R$layout.screen_recycler_navbar_nextbutton;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public CreditCardOverdueExplainerController() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: wt4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOverdueExplainerController f299781b;

            {
                this.f299781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardOverdueExplainerController creditCardOverdueExplainerController = this.f299781b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOverdueExplainerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardOverdueExplainerController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        s1 s1Var = new s1();
                        s1Var.f176349a = e4m.b.b(new n1(a3Var, 1));
                        return s1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOverdueExplainerController.R;
                        return (n) ((s1) creditCardOverdueExplainerController.N.getValue()).f176349a.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOverdueExplainerController.R;
                        CreditCardOverdueExplainerController creditCardOverdueExplainerController2 = this.f299781b;
                        return dli.f.a(creditCardOverdueExplainerController2, (n) creditCardOverdueExplainerController2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new PlainTextLoadingDelegate(), (FullScreenStateDelegate) creditCardOverdueExplainerController2.M.getValue(), new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: wt4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOverdueExplainerController f299781b;

            {
                this.f299781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardOverdueExplainerController creditCardOverdueExplainerController = this.f299781b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOverdueExplainerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardOverdueExplainerController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        s1 s1Var = new s1();
                        s1Var.f176349a = e4m.b.b(new n1(a3Var, 1));
                        return s1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOverdueExplainerController.R;
                        return (n) ((s1) creditCardOverdueExplainerController.N.getValue()).f176349a.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOverdueExplainerController.R;
                        CreditCardOverdueExplainerController creditCardOverdueExplainerController2 = this.f299781b;
                        return dli.f.a(creditCardOverdueExplainerController2, (n) creditCardOverdueExplainerController2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new PlainTextLoadingDelegate(), (FullScreenStateDelegate) creditCardOverdueExplainerController2.M.getValue(), new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: wt4.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardOverdueExplainerController f299781b;

            {
                this.f299781b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardOverdueExplainerController creditCardOverdueExplainerController = this.f299781b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardOverdueExplainerController.R;
                        phm.a aVar = (phm.a) ue0.e.j(creditCardOverdueExplainerController.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        s1 s1Var = new s1();
                        s1Var.f176349a = e4m.b.b(new n1(a3Var, 1));
                        return s1Var;
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardOverdueExplainerController.R;
                        return (n) ((s1) creditCardOverdueExplainerController.N.getValue()).f176349a.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardOverdueExplainerController.R;
                        CreditCardOverdueExplainerController creditCardOverdueExplainerController2 = this.f299781b;
                        return dli.f.a(creditCardOverdueExplainerController2, (n) creditCardOverdueExplainerController2.O.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new PlainTextDelegate(), new PlainTextLoadingDelegate(), (FullScreenStateDelegate) creditCardOverdueExplainerController2.M.getValue(), new CellDetailsStandaloneNoteDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        i iVar = uiState.f299778b;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        if (iVar.equals(wt4.h.f299776a)) {
            navBarWithToolbar.setVisible(true);
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else if (iVar instanceof f) {
            navBarWithToolbar.setVisible(true);
            navBarWithToolbar.l0();
            f fVar = (f) iVar;
            TextLocalisedClause textLocalisedClause = fVar.f299773a;
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setSecondDescriptionText(fVar.f299774b);
            navBarWithToolbar.setSecondDescriptionVisible(true);
        } else {
            if (!iVar.equals(g.f299775a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithToolbar.setVisible(false);
        }
        c cVar = uiState.f299779c;
        if (cVar instanceof wt4.b) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            k.a(goToButton);
        } else {
            if (!(cVar instanceof wt4.a)) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton largeActionButton = d3().f174564b;
            largeActionButton.setText(((wt4.a) cVar).f299768a);
            largeActionButton.setVisibility(0);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s1) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new l(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new l(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b), new wt4.m(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
