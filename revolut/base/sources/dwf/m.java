package dwf;

import com.revolut.data.model.Data;
import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import do8.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import skm.a2;
import tof.a3;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.hub.ticket_details.b f120386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f120386w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f120386w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f120386w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        long jB;
        int i = 3;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar = this.f120386w;
                l80.e eVar = bVar.f92536t;
                bVar.H2(bVar.v, new t(data, bVar));
                PurchasedTransitTicket purchasedTransitTicket = (PurchasedTransitTicket) data.getContent();
                if (purchasedTransitTicket != null) {
                    jvf.c cVar = bVar.f92534r;
                    String f92692q = purchasedTransitTicket.getF92692q();
                    int i2 = 1;
                    Continuation continuation = null;
                    if (f92692q != null) {
                        yji.l.a1(bVar, rd0.e.b(m70.a.g(nim.a.w(zi0.c.J(com.revolut.domain.interactors.transactions.a.c(bVar.f92532p, f92692q, null, false, 6)), new ds4.b(27)), null, null, 3)), null, null, new m(bVar, continuation, i2), 3);
                    }
                    if (purchasedTransitTicket instanceof PurchasedTransitTicket.Activated) {
                        jB = ruf.b.a((PurchasedTransitTicket.Activated) purchasedTransitTicket, oi0.d.R(((l80.f) eVar).f()));
                    } else if (purchasedTransitTicket instanceof PurchasedTransitTicket.ToBeActivated) {
                        jB = ruf.b.b((PurchasedTransitTicket.ToBeActivated) purchasedTransitTicket, oi0.d.R(((l80.f) eVar).f()));
                    } else {
                        if (!(purchasedTransitTicket instanceof PurchasedTransitTicket.Pending) && !(purchasedTransitTicket instanceof PurchasedTransitTicket.Expired) && !(purchasedTransitTicket instanceof PurchasedTransitTicket.NotPurchased)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jB = 0;
                    }
                    if (jB > 0) {
                        j onTicker = new j(bVar, i2);
                        cVar.getClass();
                        Intrinsics.checkNotNullParameter(onTicker, "onTicker");
                        cVar.b3(jB, new jsl.b(17), onTicker);
                    } else {
                        cVar.c3();
                    }
                    if (purchasedTransitTicket instanceof PurchasedTransitTicket.Pending) {
                        cVar.Z2(u.c(((PurchasedTransitTicket.Pending) purchasedTransitTicket).f92670a));
                    } else {
                        a2 a2Var = cVar.f178875m;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        cVar.f178875m = null;
                    }
                }
                return Unit.f186387a;
            default:
                a3 a3Var = (a3) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.transport.impl.ui.hub.ticket_details.b bVar2 = this.f120386w;
                bVar2.H2(bVar2.v, new aqd.g(a3Var, i));
                return Unit.f186387a;
        }
    }
}
