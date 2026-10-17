package com.revolut.feature.topup_screen.impl.mcy.account_verification;

import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
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
            c cVar = this.v;
            McyTopupAccountVerificationScreenContract$InputData mcyTopupAccountVerificationScreenContract$InputData = cVar.o;
            if (mcyTopupAccountVerificationScreenContract$InputData instanceof McyTopupAccountVerificationScreenContract$InputData.FromDeeplink) {
                this.u = 1;
                if (c.I2(cVar, (McyTopupAccountVerificationScreenContract$InputData.FromDeeplink) mcyTopupAccountVerificationScreenContract$InputData, this) == aVar) {
                    return aVar;
                }
            } else if (!(mcyTopupAccountVerificationScreenContract$InputData instanceof McyTopupAccountVerificationScreenContract$InputData.FromTopUp)) {
                throw new NoWhenBranchMatchedException();
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
