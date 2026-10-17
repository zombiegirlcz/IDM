package ue9;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c cVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cVar.f279316a.I0("KEY_LAST_FAILED_ATTEMPT_TIME");
                return Boolean.valueOf(cVar.f279316a.I0("KEY_FAILED_ATTEMPT_COUNT"));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                boolean zA = cVar.a();
                ue0.c cVar2 = cVar.f279316a;
                Class cls = Integer.TYPE;
                cVar2.G(new Integer((zA ? ((Number) cVar2.v0(0, "KEY_FAILED_ATTEMPT_COUNT", z.d(o0.b(cls)))).intValue() : 0) + 1), "KEY_FAILED_ATTEMPT_COUNT", z.d(o0.b(cls)));
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar2, "KEY_LAST_FAILED_ATTEMPT_TIME", new Long(System.currentTimeMillis()));
                return Unit.f186387a;
        }
    }
}
