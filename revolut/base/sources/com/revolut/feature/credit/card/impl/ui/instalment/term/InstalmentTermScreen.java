package com.revolut.feature.credit.card.impl.ui.instalment.term;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dob.c;
import dt4.g;
import dt4.i;
import dt4.j;
import dt4.k;
import dt4.l;
import jm4.l3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import rr0.f;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/term/InstalmentTermScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ldt4/g;", "Ldli/a;", "Ldt4/m;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InstalmentTermScreen extends ViewController<g> implements dli.a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(InstalmentTermScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final /* synthetic */ ep4.b K;
    public final int L;
    public final h M;
    public f N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public InstalmentTermScreen(InstalmentTermScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = ep4.b.f128075a;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, dt4.b.f);
        this.O = w.y0(new dgg.b(this, inputData, 17));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: dt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTermScreen f117361b;

            {
                this.f117361b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTermScreen.W;
                        return (h) ((l3) this.f117361b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstalmentTermScreen.W;
                        InstalmentTermScreen instalmentTermScreen = this.f117361b;
                        h hVar = (h) instalmentTermScreen.P.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentTermScreen.Q.getValue();
                        ?? r3 = instalmentTermScreen.R;
                        return dli.f.a(instalmentTermScreen, hVar, v.k(cellDetailsDelegate, (RowDelegate) r3.getValue(), new SwipeToActionDelegate((RowDelegate) r3.getValue(), false), (FullScreenStateDelegate) instalmentTermScreen.S.getValue(), (SuggestionsBarDelegate) instalmentTermScreen.T.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = w.y0(new ds7.a(4));
        this.R = w.y0(new ds7.a(5));
        this.S = w.y0(new ds7.a(6));
        this.T = w.y0(new ds7.a(7));
        this.U = w.y0(new ds7.a(8));
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: dt4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InstalmentTermScreen f117361b;

            {
                this.f117361b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InstalmentTermScreen.W;
                        return (h) ((l3) this.f117361b.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr2 = InstalmentTermScreen.W;
                        InstalmentTermScreen instalmentTermScreen = this.f117361b;
                        h hVar = (h) instalmentTermScreen.P.getValue();
                        CellDetailsDelegate cellDetailsDelegate = (CellDetailsDelegate) instalmentTermScreen.Q.getValue();
                        ?? r3 = instalmentTermScreen.R;
                        return dli.f.a(instalmentTermScreen, hVar, v.k(cellDetailsDelegate, (RowDelegate) r3.getValue(), new SwipeToActionDelegate((RowDelegate) r3.getValue(), false), (FullScreenStateDelegate) instalmentTermScreen.S.getValue(), (SuggestionsBarDelegate) instalmentTermScreen.T.getValue(), new TextDelegate(), new InputSliderLoadingDelegate(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        dt4.m uiState = (dt4.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        l lVar = uiState.f117374a;
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitle(lVar.f117372a, null);
        navBarWithToolbar.setToolbarTitle(lVar.f117372a);
        navBarWithToolbar.setNavigationButtonImage(lVar.f117373b);
        k kVar = uiState.f117376c;
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
        if (kVar instanceof i) {
            screenRecyclerNavbarFooterNextbuttonButton.setVisibility(0);
            i iVar = (i) kVar;
            screenRecyclerNavbarFooterNextbuttonButton.setText(iVar.f117369a);
            f fVar = this.N;
            if (fVar == null) {
                Intrinsics.r("nextButtonLoadingController");
                throw null;
            }
            fVar.b(false);
            screenRecyclerNavbarFooterNextbuttonFooterView.setTextClause(iVar.f117370b);
            return;
        }
        if (!kVar.equals(j.f117371a)) {
            throw new NoWhenBranchMatchedException();
        }
        screenRecyclerNavbarFooterNextbuttonButton.setVisibility(8);
        f fVar2 = this.N;
        if (fVar2 == null) {
            Intrinsics.r("nextButtonLoadingController");
            throw null;
        }
        fVar2.b(false);
        screenRecyclerNavbarFooterNextbuttonFooterView.setTextClause(null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return ep4.b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l3) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (dt4.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.N = d3().f174557b.A.V();
        d3().e.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(((RowDelegate) this.R.getValue()).f53218h), rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), rd0.e.b(((LargeActionButtonDelegate) this.U.getValue()).d.f121375b), rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).d), rd0.e.b(((SuggestionsBarDelegate) this.T.getValue()).p().d), new dmj.k(rd0.e.b(d3().e.f59410q), 5), new dmj.k(rd0.e.b(d3().f174557b.o), 6)), null, new c(this, null, 14), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
