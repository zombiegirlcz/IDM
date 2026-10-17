package com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import up5.d0;
import us4.b;
import uwf.c;
import uwf.d;
import uwf.f;
import uwf.g;
import uwf.i;
import uwf.j;
import uwf.k;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/transit_checkout/passenger_details/PassengerDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luwf/i;", "Ldli/a;", "Luwf/k;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PassengerDetailsScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PassengerDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public PassengerDetailsScreen(PassengerDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = w.y0(new b(23));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PassengerDetailsScreen f283654b;

            {
                this.f283654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PassengerDetailsScreen passengerDetailsScreen = this.f283654b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PassengerDetailsScreen.U;
                        return new SelectableDelegate((RowDelegate) passengerDetailsScreen.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PassengerDetailsScreen.U;
                        PassengerDetailsScreen passengerDetailsScreen2 = this.f283654b;
                        return dli.f.a(passengerDetailsScreen2, passengerDetailsScreen2.d(), v.k((RowDelegate) passengerDetailsScreen2.L.getValue(), (InputTextDelegate) passengerDetailsScreen2.N.getValue(), (CellDetailsNoteDelegate) passengerDetailsScreen2.O.getValue(), (DatePickerDelegate) passengerDetailsScreen2.P.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsPriceDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PassengerDetailsScreen.U;
                        return (j) ((hvf.h) passengerDetailsScreen.S.getValue()).i.get();
                }
            }
        });
        this.N = w.y0(new b(24));
        this.O = w.y0(new b(25));
        this.P = w.y0(new b(26));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: uwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PassengerDetailsScreen f283654b;

            {
                this.f283654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PassengerDetailsScreen passengerDetailsScreen = this.f283654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PassengerDetailsScreen.U;
                        return new SelectableDelegate((RowDelegate) passengerDetailsScreen.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PassengerDetailsScreen.U;
                        PassengerDetailsScreen passengerDetailsScreen2 = this.f283654b;
                        return dli.f.a(passengerDetailsScreen2, passengerDetailsScreen2.d(), v.k((RowDelegate) passengerDetailsScreen2.L.getValue(), (InputTextDelegate) passengerDetailsScreen2.N.getValue(), (CellDetailsNoteDelegate) passengerDetailsScreen2.O.getValue(), (DatePickerDelegate) passengerDetailsScreen2.P.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsPriceDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PassengerDetailsScreen.U;
                        return (j) ((hvf.h) passengerDetailsScreen.S.getValue()).i.get();
                }
            }
        });
        this.R = s.t(this, c.f);
        this.S = w.y0(new uj7.a(this, inputData, 21));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: uwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PassengerDetailsScreen f283654b;

            {
                this.f283654b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PassengerDetailsScreen passengerDetailsScreen = this.f283654b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PassengerDetailsScreen.U;
                        return new SelectableDelegate((RowDelegate) passengerDetailsScreen.L.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = PassengerDetailsScreen.U;
                        PassengerDetailsScreen passengerDetailsScreen2 = this.f283654b;
                        return dli.f.a(passengerDetailsScreen2, passengerDetailsScreen2.d(), v.k((RowDelegate) passengerDetailsScreen2.L.getValue(), (InputTextDelegate) passengerDetailsScreen2.N.getValue(), (CellDetailsNoteDelegate) passengerDetailsScreen2.O.getValue(), (DatePickerDelegate) passengerDetailsScreen2.P.getValue(), new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsPriceDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PassengerDetailsScreen.U;
                        return (j) ((hvf.h) passengerDetailsScreen.S.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174533b.setModel(new e(true, new HtmlLocalisedClause(R$string.transport_ticket_checkout_passenger_details_disclaimer, u.c("https://www.revolut.com/legal/privacy"), Integer.valueOf(R$attr.uikit_colorAccent), (Object) null, 24), null, new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, uiState.f283663b, null, null, 988), null, null, 52));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hvf.h) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) ((hvf.h) this.S.getValue()).e.get()).d(v.k((SelectableDelegate) this.M.getValue(), (DatePickerDelegate) this.P.getValue(), (RowDelegate) this.L.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_ticket_checkout_passenger_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new d(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new d(this, null, 2), 3);
        ?? r72 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r72.getValue()).e.f121375b), null, new uwf.e(this, null), 3);
        r rVarMerge = r.merge(((InputTextDelegate) r72.getValue()).f52575g.f121375b.map(new uwf.b(0, new uv1.c(25))), ((CellDetailsNoteDelegate) this.O.getValue()).f.map(new d0(28, new uv1.c(23))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new f(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.M.getValue()).r()), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((DatePickerDelegate) this.P.getValue()).f52176c.f121375b), null, new f(this, null, 1), 3);
        r rVarFilter = d3().f174533b.e.filter(new d0(29, new uv1.c(24)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new d(this, null, 0), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
