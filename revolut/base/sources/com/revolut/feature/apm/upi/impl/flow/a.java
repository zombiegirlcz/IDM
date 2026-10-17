package com.revolut.feature.apm.upi.impl.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import eg2.j;
import eg2.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f62973w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f62973w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f62973w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand naviCommandD;
        b bVar = this.f62973w;
        b3a.a aVar = bVar.f62975p;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            p pVar = ((j) this.v).f125533a;
            if (pVar == null) {
                naviCommandD = ((v3a.b) aVar).d(new ScheduledPaymentsInputData((RecurringPaymentAccount) null, (ScheduledPaymentsInputData.InitialAction) null, 7));
                return bVar.C1(new BridgeDestination(naviCommandD));
            }
            this.u = 1;
            obj2 = ((v3a.b) aVar).c(pVar, AccountId.Personal.f51414a, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        naviCommandD = (NaviCommand) obj2;
        return bVar.C1(new BridgeDestination(naviCommandD));
    }
}
