package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$Step;
import et6.i2;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n33.l0;
import vkm.q;
import w4l.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public d u;
    public yki.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f74325x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.f74325x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f74325x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        yki.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.f74324w;
        if (i == 0) {
            o.b(obj2);
            d dVar2 = this.f74325x;
            yki.a aVar3 = dVar2.f74329r;
            this.u = dVar2;
            this.v = aVar3;
            this.f74324w = 1;
            Object objX = q.x(mo3.a.g(((i2) dVar2.f74327p).b(h.f294642c), null, new l0(5), 1), this);
            if (objX == aVar2) {
                return aVar2;
            }
            dVar = dVar2;
            aVar = aVar3;
            obj2 = objX;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yki.a aVar4 = this.v;
            d dVar3 = this.u;
            o.b(obj2);
            aVar = aVar4;
            dVar = dVar3;
        }
        oki.h.t2(dVar, aVar, new TaxHubPaymentFlowContract$Step.AccountDetails((io3.d) obj2), true, null, false, 12);
        return Unit.f186387a;
    }
}
