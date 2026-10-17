package com.revolut.feature.transport.impl.ui.hub.ticket_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTextProgressDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreen;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dcf.v0;
import dv5.n;
import dv9.r;
import dwf.c;
import dwf.d;
import dwf.g;
import dwf.i;
import hvf.x;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/ticket_details/TicketDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldwf/i;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TicketDetailsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(TicketDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TicketDetailsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final int Q;
    public final h R;
    public final Object S;
    public final Object T;

    public TicketDetailsScreen(TicketDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new r(3));
        this.M = w.y0(new r(4));
        this.N = w.y0(new r(5));
        this.O = w.y0(new r(6));
        final int i = 1;
        this.P = w.y0(new Function0(this) { // from class: dwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TicketDetailsScreen f120374b;

            {
                this.f120374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TicketDetailsScreen ticketDetailsScreen = this.f120374b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TicketDetailsScreen.U;
                        x xVar = (x) ticketDetailsScreen.S.getValue();
                        switch (xVar.f155974a) {
                            case 0:
                                return (h) xVar.f155983p.get();
                            default:
                                return (h) xVar.f155983p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TicketDetailsScreen.U;
                        TicketDetailsScreen ticketDetailsScreen2 = this.f120374b;
                        return dli.f.a(ticketDetailsScreen2, ticketDetailsScreen2.R2(), v.k((ActionsDelegate) ticketDetailsScreen2.N.getValue(), (CellDetailsActionDelegate) ticketDetailsScreen2.L.getValue(), (CellDetailsChevronDelegate) ticketDetailsScreen2.M.getValue(), (RowDelegate) ticketDetailsScreen2.O.getValue(), new RowLoadingDelegate(), new QRCodeDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsTextProgressDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TicketDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(ticketDetailsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((ewf.a) ((ewf.b) aVar2.b()).b().mo3808a(ticketDetailsScreen)).P(ticketDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
        this.R = s.t(this, dwf.b.f);
        final int i2 = 2;
        this.S = w.y0(new Function0(this) { // from class: dwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TicketDetailsScreen f120374b;

            {
                this.f120374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TicketDetailsScreen ticketDetailsScreen = this.f120374b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TicketDetailsScreen.U;
                        x xVar = (x) ticketDetailsScreen.S.getValue();
                        switch (xVar.f155974a) {
                            case 0:
                                return (h) xVar.f155983p.get();
                            default:
                                return (h) xVar.f155983p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TicketDetailsScreen.U;
                        TicketDetailsScreen ticketDetailsScreen2 = this.f120374b;
                        return dli.f.a(ticketDetailsScreen2, ticketDetailsScreen2.R2(), v.k((ActionsDelegate) ticketDetailsScreen2.N.getValue(), (CellDetailsActionDelegate) ticketDetailsScreen2.L.getValue(), (CellDetailsChevronDelegate) ticketDetailsScreen2.M.getValue(), (RowDelegate) ticketDetailsScreen2.O.getValue(), new RowLoadingDelegate(), new QRCodeDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsTextProgressDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TicketDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(ticketDetailsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((ewf.a) ((ewf.b) aVar2.b()).b().mo3808a(ticketDetailsScreen)).P(ticketDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                }
            }
        });
        final int i3 = 0;
        this.T = w.y0(new Function0(this) { // from class: dwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TicketDetailsScreen f120374b;

            {
                this.f120374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TicketDetailsScreen ticketDetailsScreen = this.f120374b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TicketDetailsScreen.U;
                        x xVar = (x) ticketDetailsScreen.S.getValue();
                        switch (xVar.f155974a) {
                            case 0:
                                return (h) xVar.f155983p.get();
                            default:
                                return (h) xVar.f155983p.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = TicketDetailsScreen.U;
                        TicketDetailsScreen ticketDetailsScreen2 = this.f120374b;
                        return dli.f.a(ticketDetailsScreen2, ticketDetailsScreen2.R2(), v.k((ActionsDelegate) ticketDetailsScreen2.N.getValue(), (CellDetailsActionDelegate) ticketDetailsScreen2.L.getValue(), (CellDetailsChevronDelegate) ticketDetailsScreen2.M.getValue(), (RowDelegate) ticketDetailsScreen2.O.getValue(), new RowLoadingDelegate(), new QRCodeDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsTextProgressDelegate(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = TicketDetailsScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(ticketDetailsScreen.m2()).a().get(hvf.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (x) ((ewf.a) ((ewf.b) aVar2.b()).b().mo3808a(ticketDetailsScreen)).P(ticketDetailsScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", hvf.q.class, " is not found"));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        g gVar = uiState.f120382b;
        if (gVar != null) {
            TextClause textClause = gVar.f120378a;
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setToolbarTitle(textClause);
            navBarWithToolbar.setTitle(textClause, null);
            navBarWithToolbar.setDescriptionText(gVar.f120379b);
            navBarWithToolbar.setDescriptionVisible(true);
            Clause clause = gVar.f120380c;
            if (clause != null) {
                navBarWithToolbar.setSecondDescriptionText(clause);
                navBarWithToolbar.setSecondDescriptionVisible(true);
            }
            navBarWithToolbar.setEndIconImage(gVar.d);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) R2();
        if (!(bVar.u instanceof TicketDetailsScreenContract$InputData.TicketId)) {
            return super.F2();
        }
        bVar.I2(new TransportStartType.Hub.Ticket(0));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new v0(this, null, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.N.getValue()).f51611c.f121375b), null, new c(this, null), 3);
        efm.r rVarFilter = ((RowDelegate) this.O.getValue()).f53218h.filter(new n(new ds4.b(25), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new d(this, null), 3);
        efm.r rVarFilter2 = ((CellDetailsChevronDelegate) this.M.getValue()).f51821c.filter(new n(new ds4.b(26), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new dwf.e(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final dwf.h R2() {
        return (dwf.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
