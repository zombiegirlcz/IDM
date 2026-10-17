package com.revolut.feature.card_management.impl.ui.kompot.replace.flow;

import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o03.e;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardReplaceFlowContract$Step f64890w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f64891x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, CardReplaceFlowContract$Step cardReplaceFlowContract$Step, e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f64890w = cardReplaceFlowContract$Step;
        this.f64891x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f64890w, this.f64891x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String str = ((CardReplaceFlowContract$Step.SelectReason) this.f64890w).f64889a;
            wy2.d dVar = ((o03.c) this.f64891x).f221106a;
            this.u = 1;
            if (d.I2(this.v, str, dVar, this) == aVar) {
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
