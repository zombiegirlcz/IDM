package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$Step;
import gim.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public c u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74276w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f74277x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f74277x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f74277x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar;
        yki.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f74276w;
        if (i == 0) {
            o.b(obj2);
            c cVar2 = this.f74277x;
            yki.i iVar2 = cVar2.f74283t;
            this.u = cVar2;
            this.v = iVar2;
            this.f74276w = 1;
            Serializable serializableI2 = c.I2(cVar2, this);
            if (serializableI2 == aVar) {
                return aVar;
            }
            cVar = cVar2;
            iVar = iVar2;
            obj2 = serializableI2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.i iVar3 = this.v;
            c cVar3 = this.u;
            o.b(obj2);
            iVar = iVar3;
            cVar = cVar3;
        }
        h.t2(cVar, iVar, new TaxHubFlowContract$Step.TaxPayment((wi0.b) obj2), true, null, false, 12);
        return Unit.f186387a;
    }
}
