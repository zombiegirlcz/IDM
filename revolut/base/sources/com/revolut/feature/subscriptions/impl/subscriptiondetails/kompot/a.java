package com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot;

import com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.SubscriptionDetailsControllerContract$ModalStep;
import gim.i;
import k1a.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDetailsControllerContract$ModalStep f89262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, SubscriptionDetailsControllerContract$ModalStep subscriptionDetailsControllerContract$ModalStep, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f89262w = subscriptionDetailsControllerContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f89262w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = cVar.f89269w;
            String str = ((SubscriptionDetailsControllerContract$ModalStep.CancelSplit) this.f89262w).f89251a.f79920a;
            this.u = 1;
            if (gVar.a(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.B2();
        return Unit.f186387a;
    }
}
