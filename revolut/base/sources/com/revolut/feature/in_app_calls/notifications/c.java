package com.revolut.feature.in_app_calls.notifications;

import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ CallNotificationService v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CallNotificationService.Companion.InboundCallExtras f74832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f74833x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CallNotificationService callNotificationService, CallNotificationService.Companion.InboundCallExtras inboundCallExtras, int i, Continuation continuation) {
        super(2, continuation);
        this.v = callNotificationService;
        this.f74832w = inboundCallExtras;
        this.f74833x = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f74832w, this.f74833x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            this.u = 1;
            if (CallNotificationService.b(this.v, this.f74832w, this.f74833x, this) == aVar) {
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
