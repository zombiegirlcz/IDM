package com.revolut.feature.credit.card.impl.ui.instalment.hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellBulletDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dkk.a0;
import ds4.c;
import ds4.p;
import efm.r;
import ep4.b;
import java.util.List;
import jm4.e1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.d;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/hub/CreditCardInstalmentHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lds4/p;", "Ldli/a;", "Lds4/s;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardInstalmentHubScreen extends ViewController<p> implements dli.a, m {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f69386a0 = {o0.f186429a.j(new h0(CreditCardInstalmentHubScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    public CreditCardInstalmentHubScreen(CreditCardInstalmentHubScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, c.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ds4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentHubScreen f117196b;

            {
                this.f117196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = this.f117196b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                        return (q) ((e1) creditCardInstalmentHubScreen.O.getValue()).f176053h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentHubScreen.f69386a0;
                        return new ScrollerDelegate(zhm.u.c((VoucherSmallTileDelegate) creditCardInstalmentHubScreen.X.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentHubScreen.f69386a0;
                        CreditCardInstalmentHubScreen creditCardInstalmentHubScreen2 = this.f117196b;
                        return dli.f.a(creditCardInstalmentHubScreen2, (q) creditCardInstalmentHubScreen2.N.getValue(), zhm.v.k((ListSubheaderDelegate) creditCardInstalmentHubScreen2.Q.getValue(), (RowDelegate) creditCardInstalmentHubScreen2.T.getValue(), (LargeActionButtonDelegate) creditCardInstalmentHubScreen2.S.getValue(), (FullScreenStateDelegate) creditCardInstalmentHubScreen2.V.getValue(), (PlainTextWarningDelegate) creditCardInstalmentHubScreen2.W.getValue(), (ScrollerDelegate) creditCardInstalmentHubScreen2.Y.getValue(), (CellDetailsDelegate) creditCardInstalmentHubScreen2.U.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentHubScreen.f69386a0;
                        return (j60.a) ((e1) creditCardInstalmentHubScreen.O.getValue()).e.get();
                }
            }
        });
        this.O = w.y0(new dgg.b(this, inputData, 15));
        final int i2 = 3;
        this.P = w.y0(new Function0(this) { // from class: ds4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentHubScreen f117196b;

            {
                this.f117196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = this.f117196b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                        return (q) ((e1) creditCardInstalmentHubScreen.O.getValue()).f176053h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentHubScreen.f69386a0;
                        return new ScrollerDelegate(zhm.u.c((VoucherSmallTileDelegate) creditCardInstalmentHubScreen.X.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentHubScreen.f69386a0;
                        CreditCardInstalmentHubScreen creditCardInstalmentHubScreen2 = this.f117196b;
                        return dli.f.a(creditCardInstalmentHubScreen2, (q) creditCardInstalmentHubScreen2.N.getValue(), zhm.v.k((ListSubheaderDelegate) creditCardInstalmentHubScreen2.Q.getValue(), (RowDelegate) creditCardInstalmentHubScreen2.T.getValue(), (LargeActionButtonDelegate) creditCardInstalmentHubScreen2.S.getValue(), (FullScreenStateDelegate) creditCardInstalmentHubScreen2.V.getValue(), (PlainTextWarningDelegate) creditCardInstalmentHubScreen2.W.getValue(), (ScrollerDelegate) creditCardInstalmentHubScreen2.Y.getValue(), (CellDetailsDelegate) creditCardInstalmentHubScreen2.U.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentHubScreen.f69386a0;
                        return (j60.a) ((e1) creditCardInstalmentHubScreen.O.getValue()).e.get();
                }
            }
        });
        this.Q = w.y0(new dmj.b(26));
        this.R = w.y0(new dmj.b(27));
        this.S = w.y0(new dmj.b(28));
        this.T = w.y0(new dmj.b(29));
        this.U = w.y0(new dmj.b(22));
        this.V = w.y0(new dmj.b(23));
        this.W = w.y0(new dmj.b(24));
        this.X = w.y0(new dmj.b(25));
        final int i3 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ds4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentHubScreen f117196b;

            {
                this.f117196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = this.f117196b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                        return (q) ((e1) creditCardInstalmentHubScreen.O.getValue()).f176053h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentHubScreen.f69386a0;
                        return new ScrollerDelegate(zhm.u.c((VoucherSmallTileDelegate) creditCardInstalmentHubScreen.X.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentHubScreen.f69386a0;
                        CreditCardInstalmentHubScreen creditCardInstalmentHubScreen2 = this.f117196b;
                        return dli.f.a(creditCardInstalmentHubScreen2, (q) creditCardInstalmentHubScreen2.N.getValue(), zhm.v.k((ListSubheaderDelegate) creditCardInstalmentHubScreen2.Q.getValue(), (RowDelegate) creditCardInstalmentHubScreen2.T.getValue(), (LargeActionButtonDelegate) creditCardInstalmentHubScreen2.S.getValue(), (FullScreenStateDelegate) creditCardInstalmentHubScreen2.V.getValue(), (PlainTextWarningDelegate) creditCardInstalmentHubScreen2.W.getValue(), (ScrollerDelegate) creditCardInstalmentHubScreen2.Y.getValue(), (CellDetailsDelegate) creditCardInstalmentHubScreen2.U.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentHubScreen.f69386a0;
                        return (j60.a) ((e1) creditCardInstalmentHubScreen.O.getValue()).e.get();
                }
            }
        });
        final int i5 = 2;
        this.Z = w.y0(new Function0(this) { // from class: ds4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardInstalmentHubScreen f117196b;

            {
                this.f117196b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardInstalmentHubScreen creditCardInstalmentHubScreen = this.f117196b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardInstalmentHubScreen.f69386a0;
                        return (q) ((e1) creditCardInstalmentHubScreen.O.getValue()).f176053h.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardInstalmentHubScreen.f69386a0;
                        return new ScrollerDelegate(zhm.u.c((VoucherSmallTileDelegate) creditCardInstalmentHubScreen.X.getValue()), false);
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardInstalmentHubScreen.f69386a0;
                        CreditCardInstalmentHubScreen creditCardInstalmentHubScreen2 = this.f117196b;
                        return dli.f.a(creditCardInstalmentHubScreen2, (q) creditCardInstalmentHubScreen2.N.getValue(), zhm.v.k((ListSubheaderDelegate) creditCardInstalmentHubScreen2.Q.getValue(), (RowDelegate) creditCardInstalmentHubScreen2.T.getValue(), (LargeActionButtonDelegate) creditCardInstalmentHubScreen2.S.getValue(), (FullScreenStateDelegate) creditCardInstalmentHubScreen2.V.getValue(), (PlainTextWarningDelegate) creditCardInstalmentHubScreen2.W.getValue(), (ScrollerDelegate) creditCardInstalmentHubScreen2.Y.getValue(), (CellDetailsDelegate) creditCardInstalmentHubScreen2.U.getValue(), new CellDetailsLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr4 = CreditCardInstalmentHubScreen.f69386a0;
                        return (j60.a) ((e1) creditCardInstalmentHubScreen.O.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ds4.s uiState = (ds4.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174539b.setMenuItems(uiState.f117219a.f117218a);
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
        return (e1) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (ds4.q) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_instalment_hub_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_instalment_hub_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ((j60.a) this.P.getValue()).d(v.k((ListCellDelegate) this.R.getValue(), (LargeActionButtonDelegate) this.S.getValue(), new ListCellDelegate(), new ListCellBulletDelegate()));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new v0(this, null, 16), 3);
        d dVarB = rd0.e.b(d3().f174539b.o.f57403b);
        d dVarB2 = rd0.e.b(d3().f174539b.s0());
        d dVarB3 = rd0.e.b(d3().f174539b.x0());
        d dVarB4 = rd0.e.b(((LargeActionButtonDelegate) this.S.getValue()).d.f121375b);
        d dVarB5 = rd0.e.b(((ListCellDelegate) this.R.getValue()).f52692c);
        d dVarB6 = rd0.e.b(((ListSubheaderDelegate) this.Q.getValue()).f52707c);
        d dVarB7 = rd0.e.b(((RowDelegate) this.T.getValue()).f53218h);
        ?? r102 = this.V;
        d dVarB8 = rd0.e.b(((FullScreenStateDelegate) r102.getValue()).f52371h.f121375b);
        d dVarB9 = rd0.e.b(((FullScreenStateDelegate) r102.getValue()).f.f121375b);
        d dVarB10 = rd0.e.b(((CellDetailsDelegate) this.U.getValue()).d);
        r map = ((PlainTextWarningDelegate) this.W.getValue()).d.f121375b.map(new a0(new dmj.a(29), 12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(dVarB, dVarB2, dVarB3, dVarB4, dVarB5, dVarB6, dVarB7, dVarB8, dVarB9, dVarB10, rd0.e.b(map), rd0.e.b(w.a0(((VoucherSmallTileDelegate) this.X.getValue()).f53608c, new ds4.b(0)))), null, new dob.c(this, null, 12), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, f69386a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Z.getValue();
    }
}
