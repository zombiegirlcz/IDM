package com.revolut.feature.in_app_calls.notifications;

import be7.p;
import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import gim.i;
import java.util.UUID;
import jc6.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n30.p0;
import skm.e0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ CallNotificationService v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CallNotificationService.Companion.InboundCallExtras f74831w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CallNotificationService callNotificationService, CallNotificationService.Companion.InboundCallExtras inboundCallExtras, Continuation continuation) {
        super(2, continuation);
        this.v = callNotificationService;
        this.f74831w = inboundCallExtras;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f74831w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        p pVar = (p) this.v.f74821l.getValue();
        CallNotificationService.Companion.InboundCallExtras inboundCallExtras = this.f74831w;
        UUID uuid = inboundCallExtras.f74826a;
        UUID uuid2 = inboundCallExtras.f74827b;
        String str = inboundCallExtras.f74828c;
        this.u = 1;
        p0 p0Var = (p0) pVar;
        p0Var.getClass();
        Object objG = e0.G(new r(str, p0Var, uuid, uuid2, (Continuation) null), this);
        return objG == aVar ? aVar : objG;
    }
}
