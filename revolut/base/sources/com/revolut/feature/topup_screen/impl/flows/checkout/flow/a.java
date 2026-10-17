package com.revolut.feature.topup_screen.impl.flows.checkout.flow;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$Step;
import efm.d0;
import gim.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ e A;
    public final /* synthetic */ xi0.b B;
    public AccountId u;
    public e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yki.a f90695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public io3.d f90696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AccountId f90697y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, xi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.A = eVar;
        this.B = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.A, this.B, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AccountId accountId;
        yki.a aVar;
        io3.d dVar;
        e eVar = this.A;
        CheckoutFlowContract$InputData checkoutFlowContract$InputData = eVar.o;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        if (i == 0) {
            o.b(obj2);
            AccountId accountIdA = e1f.c.a(checkoutFlowContract$InputData.f90670c);
            d0 d0VarR = osg.b.r(eVar.f90709y, this.B, e1f.c.b(checkoutFlowContract$InputData.f90670c), null, accountIdA, 28);
            this.u = accountIdA;
            this.z = 1;
            obj2 = nim.a.b(d0VarR, this);
            if (obj2 != aVar2) {
                accountId = accountIdA;
            }
            return aVar2;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AccountId accountId2 = this.f90697y;
            io3.d dVar2 = this.f90696x;
            yki.a aVar3 = this.f90695w;
            e eVar2 = this.v;
            o.b(obj2);
            accountId = accountId2;
            eVar = eVar2;
            aVar = aVar3;
            dVar = dVar2;
            h.t2(eVar, aVar, new CheckoutFlowContract$Step.PocketDetails(dVar, accountId, (CheckoutOrder) obj2), true, null, false, 12);
            return Unit.f186387a;
        }
        accountId = this.u;
        o.b(obj2);
        io3.d dVar3 = (io3.d) obj2;
        aVar = eVar.M;
        Intrinsics.h(dVar3);
        this.u = null;
        this.v = eVar;
        this.f90695w = aVar;
        this.f90696x = dVar3;
        this.f90697y = accountId;
        this.z = 2;
        Serializable serializableI2 = e.I2(eVar, this);
        if (serializableI2 != aVar2) {
            dVar = dVar3;
            obj2 = serializableI2;
            h.t2(eVar, aVar, new CheckoutFlowContract$Step.PocketDetails(dVar, accountId, (CheckoutOrder) obj2), true, null, false, 12);
            return Unit.f186387a;
        }
        return aVar2;
    }
}
