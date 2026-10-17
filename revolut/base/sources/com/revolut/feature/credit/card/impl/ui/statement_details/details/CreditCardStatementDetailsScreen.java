package com.revolut.feature.credit.card.impl.ui.statement_details.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_details.details.CreditCardStatementDetailsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import java.util.List;
import jm4.m4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.t3;
import vc.s;
import woc.p;
import xki.e;
import xo8.a0;
import xsf.c;
import xv4.k;
import xv4.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_details/details/CreditCardStatementDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxv4/k;", "Ldli/a;", "Lxv4/m;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementDetailsScreen extends ViewController<k> implements a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditCardStatementDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final LargeActionButtonDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final Object T;
    public final Object U;

    public CreditCardStatementDetailsScreen(CreditCardStatementDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new LargeActionButtonDelegate();
        this.N = w.y0(new c(4));
        this.O = w.y0(new c(5));
        this.P = w.y0(new c(6));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: xv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementDetailsScreen f309183b;

            {
                this.f309183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f309183b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementDetailsScreen.V;
                        return (j60.a) ((m4) creditCardStatementDetailsScreen.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.V;
                        CreditCardStatementDetailsScreen creditCardStatementDetailsScreen2 = this.f309183b;
                        return dli.f.a(creditCardStatementDetailsScreen2, (l) creditCardStatementDetailsScreen2.U.getValue(), v.k((CellDetailsDelegate) creditCardStatementDetailsScreen2.P.getValue(), (CellDetailsActionDelegate) creditCardStatementDetailsScreen2.N.getValue(), (ExpandableCellDelegate) creditCardStatementDetailsScreen2.O.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementDetailsScreen.V;
                        return (l) ((m4) creditCardStatementDetailsScreen.T.getValue()).f176208g.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: xv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementDetailsScreen f309183b;

            {
                this.f309183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f309183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementDetailsScreen.V;
                        return (j60.a) ((m4) creditCardStatementDetailsScreen.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.V;
                        CreditCardStatementDetailsScreen creditCardStatementDetailsScreen2 = this.f309183b;
                        return dli.f.a(creditCardStatementDetailsScreen2, (l) creditCardStatementDetailsScreen2.U.getValue(), v.k((CellDetailsDelegate) creditCardStatementDetailsScreen2.P.getValue(), (CellDetailsActionDelegate) creditCardStatementDetailsScreen2.N.getValue(), (ExpandableCellDelegate) creditCardStatementDetailsScreen2.O.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementDetailsScreen.V;
                        return (l) ((m4) creditCardStatementDetailsScreen.T.getValue()).f176208g.get();
                }
            }
        });
        this.S = s.t(this, xv4.b.f);
        this.T = w.y0(new xfj.a(this, inputData, 23));
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: xv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementDetailsScreen f309183b;

            {
                this.f309183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f309183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementDetailsScreen.V;
                        return (j60.a) ((m4) creditCardStatementDetailsScreen.T.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.V;
                        CreditCardStatementDetailsScreen creditCardStatementDetailsScreen2 = this.f309183b;
                        return dli.f.a(creditCardStatementDetailsScreen2, (l) creditCardStatementDetailsScreen2.U.getValue(), v.k((CellDetailsDelegate) creditCardStatementDetailsScreen2.P.getValue(), (CellDetailsActionDelegate) creditCardStatementDetailsScreen2.N.getValue(), (ExpandableCellDelegate) creditCardStatementDetailsScreen2.O.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementDetailsScreen.V;
                        return (l) ((m4) creditCardStatementDetailsScreen.T.getValue()).f176208g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        xv4.m uiState = (xv4.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setTitle(uiState.f309193a, null);
        if (uiState.f309194b) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            navBarWithToolbar.l0();
        }
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_card_statement_details_button, null, null, 14));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m4) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.Q.getValue()).d(u.c(this.M));
        d3().f174565c.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new ss4.h(vkm.q.J(new a0(rd0.e.b(d3().f174565c.f59410q), 11), new a0(rd0.e.b(d3().f174564b.o), 12), rd0.e.b(((ExpandableCellDelegate) this.O.getValue()).f52255c), rd0.e.b(((CellDetailsDelegate) this.P.getValue()).d), rd0.e.b(((CellDetailsActionDelegate) this.N.getValue()).d)), yx4.b.Companion, 7), new p(2, (l) this.U.getValue(), l.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 14), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.S.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
