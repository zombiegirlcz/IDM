package androidx.camera.camera2.impl;

import fim.a;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1", f = "DeferredUseCaseCameraRequestControl.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
public final class DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(Continuation continuation, DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl) {
        super(2, continuation);
        this.this$0 = deferredUseCaseCameraRequestControl;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1(continuation, this.this$0);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0.impl;
        if (useCaseCameraRequestControlImpl != null) {
            useCaseCameraRequestControlImpl.close();
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeferredUseCaseCameraRequestControl$close$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
