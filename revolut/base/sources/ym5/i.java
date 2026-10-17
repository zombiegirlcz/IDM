package ym5;

import com.revolut.feature.crypto.tfr.validation.impl.data.models.CounterpartyUpdateData;
import com.revolut.feature.crypto.tfr.validation.impl.data.models.OwnershipPayloadData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.d0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            nm5.f fVar = jVar.f314865p;
            String str = jVar.o.f71041a;
            CounterpartyUpdateData counterpartyUpdateData = new CounterpartyUpdateData(qm5.a.SUCCESS, "ADDITIONAL_DETAILS", new OwnershipPayloadData.LegalEntityId(d0.F0(((e) ((j2) jVar.f314866q.f22677a).getValue()).f314861a).toString()));
            this.u = 1;
            if (((nm5.g) fVar).a(str, counterpartyUpdateData, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        jVar.C2(f.f314862a);
        return Unit.f186387a;
    }
}
