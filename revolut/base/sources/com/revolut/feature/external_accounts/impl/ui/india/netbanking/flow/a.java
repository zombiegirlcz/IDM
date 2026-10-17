package com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow;

import com.revolut.feature.external_accounts.impl.ui.india.netbanking.flow.IndiaNetBankingFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            b bVar = this.v;
            bVar.f72931r.a("NET_BANKING_TRANSFER");
            IndiaNetBankingFlowContract$InputData indiaNetBankingFlowContract$InputData = bVar.o;
            ve6.a aVar2 = indiaNetBankingFlowContract$InputData.f72926c;
            String str = indiaNetBankingFlowContract$InputData.d;
            if (aVar2 == null && str == null) {
                h.t2(bVar, bVar.f72933t, IndiaNetBankingFlowContract$Step.NetBankingApplications.f72927a, false, null, false, 12);
            } else {
                this.u = 1;
                if (b.I2(bVar, str, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
