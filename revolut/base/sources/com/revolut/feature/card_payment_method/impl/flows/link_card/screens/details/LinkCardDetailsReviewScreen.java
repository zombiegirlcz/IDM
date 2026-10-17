package com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c43.o;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ip0.md;
import iug.j;
import j43.b;
import j43.c;
import j43.f;
import jii.u;
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
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_payment_method/impl/flows/link_card/screens/details/LinkCardDetailsReviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lj43/f;", "feature_card_payment_method_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinkCardDetailsReviewScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(LinkCardDetailsReviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final int L;
    public final Object M;
    public final Object N;
    public final RowDelegate O;
    public final ListSubheaderDelegate P;
    public final SelectableDelegate Q;
    public final FullScreenStateDelegate R;
    public final NotificationCentreItemDelegate S;
    public final Object T;

    public LinkCardDetailsReviewScreen(LinkCardDetailsReviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: j43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkCardDetailsReviewScreen f171280b;

            {
                this.f171280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = LinkCardDetailsReviewScreen.U;
                        o oVar = (o) this.f171280b.N.getValue();
                        switch (oVar.f21065a) {
                            case 0:
                                return (e) oVar.f21069h.get();
                            default:
                                return (e) oVar.f21069h.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = LinkCardDetailsReviewScreen.U;
                        LinkCardDetailsReviewScreen linkCardDetailsReviewScreen = this.f171280b;
                        return dli.f.a(linkCardDetailsReviewScreen, (e) linkCardDetailsReviewScreen.M.getValue(), v.k(linkCardDetailsReviewScreen.O, linkCardDetailsReviewScreen.Q, new RowLoadingDelegate(), new ErrorWidgetDelegate(), linkCardDetailsReviewScreen.P, linkCardDetailsReviewScreen.R, new CellDetailsLoadingDelegate(), linkCardDetailsReviewScreen.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new md(this, inputData, 27));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new ListSubheaderDelegate();
        this.Q = new SelectableDelegate(rowDelegate);
        this.R = new FullScreenStateDelegate();
        this.S = new NotificationCentreItemDelegate();
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: j43.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinkCardDetailsReviewScreen f171280b;

            {
                this.f171280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LinkCardDetailsReviewScreen.U;
                        o oVar = (o) this.f171280b.N.getValue();
                        switch (oVar.f21065a) {
                            case 0:
                                return (e) oVar.f21069h.get();
                            default:
                                return (e) oVar.f21069h.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = LinkCardDetailsReviewScreen.U;
                        LinkCardDetailsReviewScreen linkCardDetailsReviewScreen = this.f171280b;
                        return dli.f.a(linkCardDetailsReviewScreen, (e) linkCardDetailsReviewScreen.M.getValue(), v.k(linkCardDetailsReviewScreen.O, linkCardDetailsReviewScreen.Q, new RowLoadingDelegate(), new ErrorWidgetDelegate(), linkCardDetailsReviewScreen.P, linkCardDetailsReviewScreen.R, new CellDetailsLoadingDelegate(), linkCardDetailsReviewScreen.S), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j43.e) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.card_link_card_to_pocket_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_link_card_cards_list_action, null, null, 14));
        largeActionButton.setLoadingButtonTag("GO_TO_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53226s), new j(this, (Continuation) null, 18), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
