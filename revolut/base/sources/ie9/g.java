package ie9;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f160677w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160677w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f160677w, continuation, 0);
            default:
                return new g(this.f160677w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = this.f160677w.a();
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Boolean.valueOf(((Number) obj2).intValue() >= 3);
            default:
                h hVar = this.f160677w;
                ue0.c cVar = hVar.f160679a;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = hVar.a();
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                int iIntValue = ((Number) obj2).intValue() + 1;
                if (iIntValue >= 3) {
                    com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, cVar, "KEY_LAST_VERIFICATION_ATTEMPT_TIME", Long.valueOf(((l80.f) hVar.f160680b).b().toEpochMilli()));
                }
                cVar.G(Integer.valueOf(iIntValue), "KEY_INCORRECT_ATTEMPT_COUNT", z.d(o0.b(Integer.TYPE)));
                return Unit.f186387a;
        }
    }
}
