package com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow;

import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.flow.CeFiToDeFiFlowContract$Step;
import com.revolut.feature.defi.exchange.impl.ui.flow.DeFiExchangeFlowContract$InputData;
import com.revolut.feature.transfer.core.models.PocketSource;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import s36.h;
import t36.c;
import wd6.e;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f71752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f71752w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f71752w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.f71752w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = bVar.f71753p;
            this.u = 1;
            obj2 = hVar.c(cVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        PocketSource pocketSource = (PocketSource) obj2;
        yki.a aVar2 = bVar.f71755r;
        e eVar = e.BUY;
        xi0.b currency = cVar.f267661c.getCurrency();
        oki.h.t2(bVar, aVar2, new CeFiToDeFiFlowContract$Step.Exchange(new DeFiExchangeFlowContract$InputData(pocketSource, h46.a.CEFI_TO_DEFI, bVar.o.f71749a, eVar, currency)), false, null, false, 14);
        return Unit.f186387a;
    }
}
