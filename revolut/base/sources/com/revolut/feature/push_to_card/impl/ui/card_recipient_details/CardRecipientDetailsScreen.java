package com.revolut.feature.push_to_card.impl.ui.card_recipient_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.feature.push_to_card.impl.ui.card_recipient_details.CardRecipientDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import esa.b;
import esa.e;
import esa.f;
import esa.g;
import jii.y;
import jqa.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.q1;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push_to_card/impl/ui/card_recipient_details/CardRecipientDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lesa/g;", "feature_push_to_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardRecipientDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CardRecipientDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarlargecentredBinding;", 0))};
    public final RowDelegate K;
    public final SwipeToActionDelegate L;
    public final LargeActionButtonDelegate M;
    public final CellDetailsChevronDelegate N;
    public final CellDetailsActionDelegate O;
    public final Object P;
    public final h Q;
    public final int R;
    public final Object S;
    public final Object T;

    public CardRecipientDetailsScreen(CardRecipientDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        this.L = new SwipeToActionDelegate(rowDelegate, false);
        this.M = new LargeActionButtonDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.O = new CellDetailsActionDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: esa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardRecipientDetailsScreen f128914b;

            {
                this.f128914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CardRecipientDetailsScreen.U;
                        CardRecipientDetailsScreen cardRecipientDetailsScreen = this.f128914b;
                        return dli.f.a(cardRecipientDetailsScreen, (f) cardRecipientDetailsScreen.T.getValue(), v.k(cardRecipientDetailsScreen.K, cardRecipientDetailsScreen.L, cardRecipientDetailsScreen.N, cardRecipientDetailsScreen.O, cardRecipientDetailsScreen.M, new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = CardRecipientDetailsScreen.U;
                        return (f) ((jqa.c) this.f128914b.S.getValue()).e.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
        this.R = R$layout.screen_recycler_navbarlargecentred;
        this.S = w.y0(new eq8.b(this, inputData, 5));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: esa.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CardRecipientDetailsScreen f128914b;

            {
                this.f128914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CardRecipientDetailsScreen.U;
                        CardRecipientDetailsScreen cardRecipientDetailsScreen = this.f128914b;
                        return dli.f.a(cardRecipientDetailsScreen, (f) cardRecipientDetailsScreen.T.getValue(), v.k(cardRecipientDetailsScreen.K, cardRecipientDetailsScreen.L, cardRecipientDetailsScreen.N, cardRecipientDetailsScreen.O, cardRecipientDetailsScreen.M, new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavBarLargeCentred_recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                    default:
                        KProperty[] kPropertyArr2 = CardRecipientDetailsScreen.U;
                        return (f) ((jqa.c) this.f128914b.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarLargeCentred navBarLargeCentred = d3().f174576b;
        e eVar = uiState.f128922b;
        TextClause textClause = eVar.f128918a;
        navBarLargeCentred.setToolbarTitle(textClause);
        navBarLargeCentred.setTitle(textClause);
        navBarLargeCentred.setDescriptionText(eVar.f128919b);
        NavBarLargeCentred.setLargeImage$default(navBarLargeCentred, eVar.f128920c, (q1) null, 2, (Object) null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174576b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174576b.f59292m), new esa.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174576b.C()), new esa.c(this, null, 1), 3);
        ihm.f fVar = this.N.f51821c;
        RowDelegate rowDelegate = this.K;
        r rVarMerge = r.merge(v.k(fVar, rowDelegate.f53225r, rowDelegate.f53218h, this.M.d.f121375b, this.O.d));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        ViewController.P2(this, rd0.e.b(rVarMerge), new enb.f(this, null, 18), 3);
    }

    public final y d3() {
        ViewBinding value = this.Q.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (y) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
