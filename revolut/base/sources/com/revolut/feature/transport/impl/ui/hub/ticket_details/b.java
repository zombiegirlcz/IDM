package com.revolut.feature.transport.impl.ui.hub.ticket_details;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.transport.api.navigation.TransportFlowDestination;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$InputData;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import dt4.p;
import dwf.f;
import dwf.k;
import dwf.m;
import ivf.e;
import ivf.r;
import jvf.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rvf.d;
import w4l.i;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends h implements dwf.h {

    @NotNull
    public static final k Companion = new k();
    public final ouf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f92532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f92533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f92534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f92535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l80.e f92536t;
    public final TicketDetailsScreenContract$InputData u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f92537w;

    public b(ouf.a transportInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, d activationModelExtension, c timerExtension, e extendInteractor, l80.e dateProvider, TicketDetailsScreenContract$InputData inputData, n stateMapper) {
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(activationModelExtension, "activationModelExtension");
        Intrinsics.checkNotNullParameter(timerExtension, "timerExtension");
        Intrinsics.checkNotNullParameter(extendInteractor, "extendInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = transportInteractor;
        this.f92532p = transactionsInteractor;
        this.f92533q = activationModelExtension;
        this.f92534r = timerExtension;
        this.f92535s = extendInteractor;
        this.f92536t = dateProvider;
        this.u = inputData;
        boolean z = inputData instanceof TicketDetailsScreenContract$InputData.TicketDetails;
        Data data = z ? new Data(((TicketDetailsScreenContract$InputData.TicketDetails) inputData).f92528a, null, false, 6, null) : new Data(null, null, true, 3, null);
        TicketDetailsScreenContract$InputData.TicketDetails ticketDetails = z ? (TicketDetailsScreenContract$InputData.TicketDetails) inputData : null;
        PurchasedTransitTicket purchasedTransitTicket = ticketDetails != null ? ticketDetails.f92528a : null;
        this.v = mra.d.b(this, new f(data, purchasedTransitTicket instanceof PurchasedTransitTicket.Activated ? ((PurchasedTransitTicket.Activated) purchasedTransitTicket).f92642s : null, null, ((l80.f) dateProvider).f()), stateMapper, null, false, 12);
        this.f92537w = hx7.e.a(this, new p(this, 11));
    }

    @Override // yji.l
    public final void I1() {
        TicketDetailsScreenContract$InputData ticketDetailsScreenContract$InputData = this.u;
        if (ticketDetailsScreenContract$InputData instanceof TicketDetailsScreenContract$InputData.TicketId) {
            J2(((TicketDetailsScreenContract$InputData.TicketId) ticketDetailsScreenContract$InputData).f92529a);
        } else {
            if (!(ticketDetailsScreenContract$InputData instanceof TicketDetailsScreenContract$InputData.TicketDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            J2(((TicketDetailsScreenContract$InputData.TicketDetails) ticketDetailsScreenContract$InputData).f92528a.getF92682a());
        }
    }

    public final void I2(TransportStartType.Hub hub2) {
        C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new TransportFlowDestination(hub2)))));
    }

    public final void J2(String ticketId) {
        r rVar = (r) this.o;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        l.a1(this, nim.a.v(c6d.b.i(rVar.f168858a.f265756g.b(Unit.f186387a, i.f294643c), new ivf.i(rVar, 0)), new ik3.a(ticketId, 12)), null, null, new m(this, null, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f92537w;
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
