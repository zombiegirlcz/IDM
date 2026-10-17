package zv6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((Address) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Address address = (Address) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Address address2 = new Address(null, null, null, null, null, address.getCountry(), null, null, null, null, null, null, null, null, null, 32735, null);
        k kVar = this.v;
        Address address3 = ((d) kVar.t2()).f;
        if (address3 == null) {
            address3 = address2;
        }
        kVar.f2(kVar.e1(new th1.a(new AddressFlowContract$InputData(address3, new TextLocalisedClause(R$string.freelancer_billing_address_title, null, null, 14), null, true, null, null, null, null, false, null, 2097116), null, null, 6)), ModalDestination.Style.POPUP.f98311a, new i(address2, kVar));
        return Unit.f186387a;
    }
}
