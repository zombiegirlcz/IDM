package com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure;

import com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.AccountClosureFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f94918w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f94918w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f94918w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        String str = this.f94918w;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            obj2 = b.I2(bVar, str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(bVar, bVar.f94924w, ((Boolean) obj2).booleanValue() ? new AccountClosureFlowContract$Step.PrivateMarketsConsent(str) : new AccountClosureFlowContract$Step.Feedback(str, bVar.K2()), true, null, false, 12);
        return Unit.f186387a;
    }
}
