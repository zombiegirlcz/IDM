package ie9;

import ch.qos.logback.core.util.FileSize;
import gim.i;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends i implements Function2 {
    public long u;
    public float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f160675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f160676x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, Continuation continuation) {
        super(2, continuation);
        this.f160676x = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.f160676x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        float f;
        long j2;
        h hVar = this.f160676x;
        ue0.c cVar = hVar.f160679a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f160675w;
        a aVar2 = a.f160673a;
        if (i == 0) {
            o.b(obj2);
            long jLongValue = ((Number) cVar.v0(0L, "KEY_LAST_VERIFICATION_ATTEMPT_TIME", h.d)).longValue();
            if (jLongValue == 0) {
                return aVar2;
            }
            long epochMilli = ((l80.f) hVar.f160680b).b().minusMillis(jLongValue).toEpochMilli();
            this.u = epochMilli;
            this.v = 2.0f;
            this.f160675w = 1;
            Object objA = hVar.a();
            if (objA == aVar) {
                return aVar;
            }
            f = 2.0f;
            obj2 = objA;
            j2 = epochMilli;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = this.v;
            j2 = this.u;
            o.b(obj2);
        }
        long jScalb = (long) Math.scalb(f, ((Number) obj2).intValue() - 3);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (jScalb > FileSize.KB_COEFFICIENT) {
            jScalb = 1024;
        }
        long millis = timeUnit.toMillis(jScalb);
        if (j2 < millis) {
            return new b(millis - j2);
        }
        cVar.I0("KEY_LAST_VERIFICATION_ATTEMPT_TIME");
        return aVar2;
    }
}
