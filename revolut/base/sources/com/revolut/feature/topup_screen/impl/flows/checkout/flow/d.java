package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import gim.i;
import hwe.j;
import hwe.k;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ k A;
    public final /* synthetic */ TopUpTarget B;
    public e u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public io3.d f90699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AccountId f90700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f90701y;
    public final /* synthetic */ e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, k kVar, TopUpTarget topUpTarget, Continuation continuation) {
        super(1, continuation);
        this.z = eVar;
        this.A = kVar;
        this.B = topUpTarget;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.z, this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        io3.d dVar;
        yki.a aVar;
        e eVar;
        AccountId accountId;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f90701y;
        if (i == 0) {
            o.b(obj2);
            e eVar2 = this.z;
            yki.a aVar3 = eVar2.M;
            dVar = ((j) this.A).f156144a;
            AccountId accountIdA = e1f.c.a(this.B);
            this.u = eVar2;
            this.v = aVar3;
            this.f90699w = dVar;
            this.f90700x = accountIdA;
            this.f90701y = 1;
            Serializable serializableI2 = e.I2(eVar2, this);
            if (serializableI2 == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = serializableI2;
            eVar = eVar2;
            accountId = accountIdA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountId = this.f90700x;
            dVar = this.f90699w;
            yki.a aVar4 = this.v;
            e eVar3 = this.u;
            o.b(obj2);
            aVar = aVar4;
            eVar = eVar3;
        }
        h.t2(eVar, aVar, new CheckoutFlowContract$Step.PocketDetails(dVar, accountId, (CheckoutOrder) obj2), true, null, false, 12);
        return Unit.f186387a;
    }
}
