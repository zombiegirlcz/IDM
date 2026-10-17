package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value;

import a32.g;
import a7b.d;
import a7b.j;
import a7b.o;
import a7b.p;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import b6b.l;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.k;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/card_additional_value/CobrandedCardsAdditionalValueScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La7b/o;", "Ldli/a;", "La7b/q;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsAdditionalValueScreen extends ViewController<o> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CobrandedCardsAdditionalValueScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final CobrandedCardsAdditionalValueScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CobrandedCardsAdditionalValueScreen(CobrandedCardsAdditionalValueScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, d.f);
        this.N = w.y0(new g(6));
        this.O = w.y0(new g(7));
        this.P = w.y0(new g(8));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: a7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAdditionalValueScreen f1816b;

            {
                this.f1816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen = this.f1816b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAdditionalValueScreen.T;
                        CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen2 = this.f1816b;
                        return dli.f.a(cobrandedCardsAdditionalValueScreen2, cobrandedCardsAdditionalValueScreen2.d(), zhm.v.k(new SimpleMediaDelegate(), (ListSubheaderDelegate) cobrandedCardsAdditionalValueScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (SplitColumnCellDelegate) cobrandedCardsAdditionalValueScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsAdditionalValueScreen2.P.getValue()), cobrandedCardsAdditionalValueScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAdditionalValueScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsAdditionalValueScreen.m2()).a().get(b6b.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b6b.o.class, " is not found"));
                        }
                        b6b.o oVar = ((b6b.o) aVar2.b()).f12655j;
                        CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = cobrandedCardsAdditionalValueScreen.K;
                        cobrandedCardsAdditionalValueScreenContract$InputData.getClass();
                        return new b6b.l(oVar, cobrandedCardsAdditionalValueScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAdditionalValueScreen.T;
                        return (p) ((b6b.l) cobrandedCardsAdditionalValueScreen.R.getValue()).f12635c.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: a7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAdditionalValueScreen f1816b;

            {
                this.f1816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen = this.f1816b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAdditionalValueScreen.T;
                        CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen2 = this.f1816b;
                        return dli.f.a(cobrandedCardsAdditionalValueScreen2, cobrandedCardsAdditionalValueScreen2.d(), zhm.v.k(new SimpleMediaDelegate(), (ListSubheaderDelegate) cobrandedCardsAdditionalValueScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (SplitColumnCellDelegate) cobrandedCardsAdditionalValueScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsAdditionalValueScreen2.P.getValue()), cobrandedCardsAdditionalValueScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAdditionalValueScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsAdditionalValueScreen.m2()).a().get(b6b.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b6b.o.class, " is not found"));
                        }
                        b6b.o oVar = ((b6b.o) aVar2.b()).f12655j;
                        CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = cobrandedCardsAdditionalValueScreen.K;
                        cobrandedCardsAdditionalValueScreenContract$InputData.getClass();
                        return new b6b.l(oVar, cobrandedCardsAdditionalValueScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAdditionalValueScreen.T;
                        return (p) ((b6b.l) cobrandedCardsAdditionalValueScreen.R.getValue()).f12635c.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: a7b.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsAdditionalValueScreen f1816b;

            {
                this.f1816b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen = this.f1816b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsAdditionalValueScreen.T;
                        CobrandedCardsAdditionalValueScreen cobrandedCardsAdditionalValueScreen2 = this.f1816b;
                        return dli.f.a(cobrandedCardsAdditionalValueScreen2, cobrandedCardsAdditionalValueScreen2.d(), zhm.v.k(new SimpleMediaDelegate(), (ListSubheaderDelegate) cobrandedCardsAdditionalValueScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (SplitColumnCellDelegate) cobrandedCardsAdditionalValueScreen2.O.getValue(), (FullScreenStateDelegate) cobrandedCardsAdditionalValueScreen2.P.getValue()), cobrandedCardsAdditionalValueScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsAdditionalValueScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(cobrandedCardsAdditionalValueScreen.m2()).a().get(b6b.o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", b6b.o.class, " is not found"));
                        }
                        b6b.o oVar = ((b6b.o) aVar2.b()).f12655j;
                        CobrandedCardsAdditionalValueScreenContract$InputData cobrandedCardsAdditionalValueScreenContract$InputData = cobrandedCardsAdditionalValueScreen.K;
                        cobrandedCardsAdditionalValueScreenContract$InputData.getClass();
                        return new b6b.l(oVar, cobrandedCardsAdditionalValueScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsAdditionalValueScreen.T;
                        return (p) ((b6b.l) cobrandedCardsAdditionalValueScreen.R.getValue()).f12635c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        a7b.q uiState = (a7b.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        Clause clause = uiState.f1828a;
        i iVar = uiState.f1830c;
        navBarWithToolbar.setTitle(clause, null);
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new a7b.g(this, continuation, 0), 3);
        ViewController.P2(this, new a15.d(rd0.e.b(((ListSubheaderDelegate) this.N.getValue()).d), 6), new a7b.h(this, continuation, 0), 3);
        ViewController.P2(this, new a15.d(rd0.e.b(((SplitColumnCellDelegate) this.O.getValue()).e), 7), new a7b.i(this, null), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new a7b.g(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new a7b.h(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new j(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final p d() {
        return (p) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
