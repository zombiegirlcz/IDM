package com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv;

import com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.CardDeferredCvvFlowContract$Step;
import cue.d;
import gim.i;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ste.g;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f90982w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f90982w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f90982w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            Map map = dVar.f108994g;
            Map map2 = dVar.f108994g;
            c cVar = this.f90982w;
            if (map == null || !dVar.d() || map.containsKey("payment_method_id") || dVar.f108993c != null) {
                if (dVar.d()) {
                    if (Intrinsics.f(map2 != null ? (String) map2.get("request_cvv") : null, "true")) {
                        h.u2(cVar, cVar.f90990y, new CardDeferredCvvFlowContract$Step.Cvv(dVar), null, 6);
                    } else {
                        this.u = 1;
                        if (c.J2(cVar, dVar, null, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    cVar.C2(new g(new IllegalStateException(j6.a.q("Unsupported origin: ", map2 != null ? (String) map2.get("origin") : null))));
                }
            } else {
                cVar.C2(ste.h.f265563a);
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
