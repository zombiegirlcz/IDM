package jv;

import com.revolut.camerakit.client.api.models.CaptureMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ CaptureMode v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f178712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CaptureMode captureMode, r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = captureMode;
        this.f178712w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n(this.v, this.f178712w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            long j2 = ((CaptureMode.AutoCaptureTimeout) this.v).f50714a;
            this.u = 1;
            if (k0.b(j2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        this.f178712w.i.e.set(true);
        return Unit.f186387a;
    }
}
