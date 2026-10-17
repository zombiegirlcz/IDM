package beb;

import beb.i;
import com.revolut.feature.retail.restaurants.impl.domain.model.Customer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new r(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((r) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar = this.v;
        cli.y yVar = aVar.f82839s;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((h) ((j2) yVar.f22677a).getValue()).c() != null) {
                return Unit.f186387a;
            }
            Customer customer = ((h) ((j2) yVar.f22677a).getValue()).f14737c;
            if (customer == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (((h) ((j2) yVar.f22677a).getValue()).f14735a.getContent() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (!customer.a()) {
                return Unit.f186387a;
            }
            b94.s sVar = new b94.s(aVar, customer, null, 6);
            this.u = 1;
            if (u0.b0(aVar.X(), "CONFIRM_RESERVATION_CONFIRM", sVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar.C2(i.a.f14738a);
        return Unit.f186387a;
    }
}
