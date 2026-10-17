package com.revolut.feature.profile.impl.ui.details.address.flow;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.profile.impl.ui.details.address.flow.ProfileAddressFlowContract$Step;
import do3.n;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import pmk.t;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            t tVar = new t(cVar, continuation, 20);
            this.u = 1;
            obj2 = cVar.p2(this, tVar);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Pair pair = (Pair) obj2;
        n nVar = (n) pair.f186385a;
        Boolean bool = (Boolean) pair.f186386b;
        yki.i iVar = cVar.v;
        Address address = nVar.k;
        Intrinsics.h(bool);
        h.u2(cVar, iVar, new ProfileAddressFlowContract$Step.AddressStep(address, bool.booleanValue()), null, 6);
        return Unit.f186387a;
    }
}
