package n4k;

import a5k.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r4k.m;
import r4k.p;
import r4k.q;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f212467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar, q qVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f212467w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f212467w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.c cVar = this.v;
        t tVar = cVar.f102111q;
        p pVar = (p) this.f212467w;
        BankTransferData bankTransferData = pVar.f251493a;
        m mVar = pVar.f251494b;
        f5j.a aVar2 = pVar.f251495c;
        AccountId accountId = pVar.d;
        BankTransferFlowInputData bankTransferFlowInputData = cVar.o;
        boolean z = (bankTransferFlowInputData instanceof BankTransferFlowInputData.NewTransfer) && ((BankTransferFlowInputData.NewTransfer) bankTransferFlowInputData).i;
        this.u = 1;
        Object objC3 = tVar.c3(bankTransferData, mVar, aVar2, accountId, z, this);
        return objC3 == aVar ? aVar : objC3;
    }
}
