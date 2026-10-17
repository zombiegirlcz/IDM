package com.revolut.feature.donations.impl.ui.kompot.screen.charity.details;

import com.revolut.data.model.Data;
import com.revolut.feature.donations.api.interactor.DonationsInteractor$CharityNotFoundException;
import com.revolut.feature.donations.impl.ui.kompot.screen.charity.details.a;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tb6.x;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = data.getError() instanceof DonationsInteractor$CharityNotFoundException;
        c cVar = this.v;
        if (z) {
            cVar.C2(a.C0480a.f72067a);
        }
        cVar.H2(cVar.J, new x(data, 1));
        return Unit.f186387a;
    }
}
