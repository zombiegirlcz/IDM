package o23;

import com.revolut.feature.address.models.Address;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.m1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Address f221457w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar, Address address, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f221457w = address;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, this.f221457w, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar = this.v;
        cli.y yVar = bVar.D;
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean z = n1Var instanceof l1;
        Address address = this.f221457w;
        if (z) {
            bVar.H2(yVar, new avj.p(bVar, address, 15));
        } else if (n1Var instanceof m1) {
            bVar.C2(new x(address, ((w) ((j2) yVar.f22677a).getValue()).f221469j, null, 8));
        }
        return Unit.f186387a;
    }
}
