package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import com.revolut.domain.models.topup.methods.TopupMethod;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TopupMethod f90655w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90656x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, TopupMethod topupMethod, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f90655w = topupMethod;
        this.f90656x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f90655w, this.f90656x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            String str = this.f90656x;
            hl6.b bVar = new hl6.b(dVar, str, 22);
            this.u = 1;
            if (d.L2(dVar, this.f90655w, str, bVar, this) == aVar) {
                return aVar;
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
