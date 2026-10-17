package androidx.camera.camera2.impl;

import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.core.impl.Config;
import fim.a;
import gim.d;
import gim.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1", f = "DeferredUseCaseCameraRequestControl.kt", l = {90}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
public final class DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Config.OptionPriority $optionPriority$inlined;
    final /* synthetic */ UseCaseCameraRequestControl.Type $type$inlined;
    final /* synthetic */ Map $values$inlined;
    int label;
    final /* synthetic */ DeferredUseCaseCameraRequestControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1(DeferredUseCaseCameraRequestControl deferredUseCaseCameraRequestControl, Continuation continuation, Map map, UseCaseCameraRequestControl.Type type, Config.OptionPriority optionPriority) {
        super(2, continuation);
        this.this$0 = deferredUseCaseCameraRequestControl;
        this.$values$inlined = map;
        this.$type$inlined = type;
        this.$optionPriority$inlined = optionPriority;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1(this.this$0, continuation, this.$values$inlined, this.$type$inlined, this.$optionPriority$inlined);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        g0 g0VarSubmitParameters = this.this$0.getOrCreateImpl().submitParameters(this.$values$inlined, this.$type$inlined, this.$optionPriority$inlined);
        this.label = 1;
        Object objI = g0VarSubmitParameters.i(this);
        return objI == aVar ? aVar : objI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DeferredUseCaseCameraRequestControl$submitParameters$$inlined$runOnSequential$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
