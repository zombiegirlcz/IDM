package ie7;

import com.revolut.feature.in_app_calls.notifications.CallNotificationService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.e0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CallNotificationService f160660w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CallNotificationService callNotificationService, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160660w = callNotificationService;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f160660w, continuation, 0);
            default:
                return new c(this.f160660w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    CallNotificationService callNotificationService = this.f160660w;
                    fe7.b bVar = callNotificationService.f74823n;
                    if (bVar == null) {
                        Intrinsics.r("callControlsDispatcher");
                        throw null;
                    }
                    j2 j2Var = bVar.f134458c;
                    b bVar2 = new b(callNotificationService, 0);
                    this.v = 1;
                    if (j2Var.collect(bVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    CallNotificationService callNotificationService2 = this.f160660w;
                    fe7.b bVar3 = callNotificationService2.f74823n;
                    if (bVar3 == null) {
                        Intrinsics.r("callControlsDispatcher");
                        throw null;
                    }
                    e0 e0VarT = q.t(q.q(new aa7.c(new t0(bVar3.d, 1), 4)), 1);
                    b bVar4 = new b(callNotificationService2, 1);
                    this.v = 1;
                    if (e0VarT.collect(bVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
