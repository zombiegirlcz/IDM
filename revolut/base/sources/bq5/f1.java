package bq5;

import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingCheckResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f1 f1Var = new f1(this.v, continuation);
        f1Var.u = obj2;
        return f1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f1) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CryptoAddressHostingCheckResult.Found foundA = com.revolut.feature.crypto.withdraw.api.models.a.a((CryptoAddressHostingCheckResult) data.getContent());
        wk5.h hVar = foundA != null ? foundA.f71073b : null;
        com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a aVar2 = this.v;
        aVar2.H2(aVar2.C, new bhl.g(hVar, 29));
        return Unit.f186387a;
    }
}
