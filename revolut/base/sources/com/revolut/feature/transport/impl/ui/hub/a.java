package com.revolut.feature.transport.impl.ui.hub;

import ba4.x;
import bbk.z;
import bt9.t;
import bwf.f;
import bwf.m;
import bwf.s;
import com.revolut.feature.transport.api.navigation.TransportStartType;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import com.revolut.feature.transport.impl.ui.hub.TransportHubFlowContract$Tab;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreen;
import com.revolut.feature.transport.impl.ui.hub.transit.TransportHubTransitScreenContract$InputData;
import com.revolut.feature.transport.models.TransportLocation;
import com.revolut.kompot.navigable.flow.scroller.ScrollerFlowStep;
import eki.g;
import fki.b;
import ivf.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll6.i;
import ue0.c;
import vkm.j2;
import vkm.q;
import vkm.y;
import yji.l;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements bwf.g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TransportHubFlowContract$InputData f92524n;
    public final lvf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final cwf.a f92525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s f92526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f92527r;

    public a(TransportHubFlowContract$InputData inputData, lvf.a transportLocationExtension, ouf.a transportInteractor, cwf.a locationObserver, s tabsStateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transportLocationExtension, "transportLocationExtension");
        Intrinsics.checkNotNullParameter(transportInteractor, "transportInteractor");
        Intrinsics.checkNotNullParameter(locationObserver, "locationObserver");
        Intrinsics.checkNotNullParameter(tabsStateMapper, "tabsStateMapper");
        this.f92524n = inputData;
        this.o = transportLocationExtension;
        this.f92525p = locationObserver;
        this.f92526q = tabsStateMapper;
        List list = q2().f135842a;
        String str = q2().f135843b;
        c cVar = ((r) transportInteractor).f168858a.d;
        TransportLocation transportLocation = (TransportLocation) cVar.T2("AUTO_SELECTED_LOCATION_KEY", TransportLocation.class);
        transportLocation = transportLocation == null ? (TransportLocation) cVar.T2("SELECTED_LOCATION_KEY", TransportLocation.class) : transportLocation;
        this.f92527r = q.c(new f(list, str, transportLocation != null ? new TransportHubLocation.Selected(transportLocation) : TransportHubLocation.Unknown.f92505a));
    }

    @Override // yji.l
    public final void I1() {
        lvf.c cVar = (lvf.c) this.o;
        l.a1(this, new x(new x(new y(new i(cVar, (Continuation) null, 25), cVar.f200376p), this, 9), this, 10), null, null, new m(this, null, 0), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        j2 j2Var = this.f92527r;
        l.b1(this, q.q(new z(j2Var, 19)), null, new m(this, null, 1), 3);
        l.b1(this, new bwf.q(q.q(new z(j2Var, 20)), this, 0), null, null, 7);
    }

    @Override // eki.g
    public final b q2() {
        com.revolut.feature.transport.api.navigation.a aVar;
        String str;
        TransportHubFlowContract$Tab.Transit transit = TransportHubFlowContract$Tab.Transit.f92523b;
        TransportHubFlowContract$InputData transportHubFlowContract$InputData = this.f92524n;
        TransportStartType.Hub hub2 = transportHubFlowContract$InputData.f92521a;
        TransportStartType.Hub.Ticket ticket = hub2 instanceof TransportStartType.Hub.Ticket ? (TransportStartType.Hub.Ticket) hub2 : null;
        if (ticket == null || (aVar = ticket.f92498a) == null) {
            aVar = com.revolut.feature.transport.api.navigation.a.NONE;
        }
        TransportHubFlowContract$Tab.Tickets tickets = new TransportHubFlowContract$Tab.Tickets(aVar);
        List listK = v.k(transit, tickets);
        TransportStartType.Hub hub3 = transportHubFlowContract$InputData.f92521a;
        if (hub3 instanceof TransportStartType.Hub.Transit) {
            str = transit.f98432a;
        } else {
            if (!(hub3 instanceof TransportStartType.Hub.Ticket)) {
                throw new NoWhenBranchMatchedException();
            }
            str = tickets.f98432a;
        }
        return new b(listK, str);
    }

    public final void s2(String tabId) {
        j2 j2Var;
        Object value;
        f updateState;
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        do {
            j2Var = this.f92527r;
            value = j2Var.getValue();
            updateState = (f) value;
            Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        } while (!j2Var.h(value, f.a(updateState, tabId, null, 5)));
    }

    @Override // eki.n
    public final com.revolut.kompot.navigable.a x(ScrollerFlowStep scrollerFlowStep) {
        TransportHubFlowContract$Tab step = (TransportHubFlowContract$Tab) scrollerFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof TransportHubFlowContract$Tab.Transit) {
            TransportHubTransitScreen transportHubTransitScreen = new TransportHubTransitScreen(new TransportHubTransitScreenContract$InputData(((f) this.f92527r.getValue()).f19328c));
            bwf.i iVar = new bwf.i(this, 0);
            Intrinsics.checkNotNullParameter(iVar, "<set-?>");
            transportHubTransitScreen.H = iVar;
            return transportHubTransitScreen;
        }
        if (!(step instanceof TransportHubFlowContract$Tab.Tickets)) {
            throw new NoWhenBranchMatchedException();
        }
        TransportHubTicketsScreen transportHubTicketsScreen = new TransportHubTicketsScreen(new TransportHubTicketsScreenContract$InputData(((TransportHubFlowContract$Tab.Tickets) step).f92522b));
        t tVar = new t(20);
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        transportHubTicketsScreen.H = tVar;
        return transportHubTicketsScreen;
    }
}
