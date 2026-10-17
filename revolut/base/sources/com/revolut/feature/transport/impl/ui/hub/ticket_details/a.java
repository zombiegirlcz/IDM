package com.revolut.feature.transport.impl.ui.hub.ticket_details;

import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreen;
import com.revolut.feature.transport.impl.ui.extend.ExtendTicketScreenContract$InputData;
import com.revolut.feature.transport.impl.ui.hub.ticket_details.TicketDetailsScreenContract$ModalStep;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import com.revolut.kompot.common.ModalDestination;
import g48.r;
import gim.i;
import ie7.h;
import ivf.e;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import yhm.o;
import zi0.c;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.Activated f92531w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, PurchasedTransitTicket.Activated activated, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f92531w = activated;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f92531w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        PurchasedTransitTicket.Activated activated = this.f92531w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            e eVar = bVar.f92535s;
            this.u = 1;
            obj2 = q.x(new h(new r(mo3.a.g(c.w(((ivf.r) eVar.f168844a).b()), null, null, 3), 14), activated, 6), this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        List list = (List) obj2;
        if (!list.isEmpty()) {
            return bVar.C1(new com.revolut.kompot.common.b(new ExtendTicketScreen(new ExtendTicketScreenContract$InputData(activated, list)), (ModalDestination.Style) null, 6));
        }
        oki.h.v2(bVar.f92537w, TicketDetailsScreenContract$ModalStep.NoTicketsToExtend.f92530a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
