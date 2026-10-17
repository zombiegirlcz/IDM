package se9;

import gim.i;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
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
        int i = this.u;
        Class cls = Long.TYPE;
        d dVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, dVar.f262163a, "KEY_FLOW_COMPLETED_TIMESTAMP", new Long(System.currentTimeMillis()));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Long l2 = (Long) j6.a.k(cls, dVar.f262163a, "KEY_FLOW_COMPLETED_TIMESTAMP");
                boolean z = true;
                if (l2 != null) {
                    if (System.currentTimeMillis() - l2.longValue() <= TimeUnit.HOURS.toMillis(24L)) {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
