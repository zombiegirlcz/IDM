package bn5;

import com.revolut.feature.crypto.tfr.validation.impl.data.models.CounterpartyUpdateData;
import com.revolut.feature.crypto.tfr.validation.impl.data.models.OwnershipPayloadData;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public com.revolut.feature.crypto.tfr.validation.impl.pob.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.tfr.validation.impl.pob.a f17115w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.crypto.tfr.validation.impl.pob.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f17115w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f17115w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.crypto.tfr.validation.impl.pob.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.crypto.tfr.validation.impl.pob.a aVar3 = this.f17115w;
            g gVar = ((e) ((j2) aVar3.f71048r.f22677a).getValue()).f17109a;
            if (gVar == null) {
                return null;
            }
            wi0.b bVar = gVar.f17112b;
            nm5.f fVar = aVar3.f71047q;
            PlaceOfBirthScreenContract$InputData placeOfBirthScreenContract$InputData = aVar3.o;
            String str = placeOfBirthScreenContract$InputData.f71043a;
            CounterpartyUpdateData counterpartyUpdateData = new CounterpartyUpdateData(qm5.a.SUCCESS, "ADDITIONAL_DETAILS", new OwnershipPayloadData.DateAndPlaceOfBirth(bVar.f297794a, placeOfBirthScreenContract$InputData.f71044b));
            this.u = aVar3;
            this.v = 1;
            if (((nm5.g) fVar).a(str, counterpartyUpdateData, this) == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            o.b(obj2);
        }
        aVar.C2(f.f17110a);
        return Unit.f186387a;
    }
}
