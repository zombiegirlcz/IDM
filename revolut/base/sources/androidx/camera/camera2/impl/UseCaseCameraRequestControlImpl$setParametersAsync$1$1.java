package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.UseCaseCameraRequestControl;
import androidx.camera.core.impl.Config;
import fim.a;
import gim.d;
import gim.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.g0;
import yhm.o;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraRequestControlImpl$setParametersAsync$1$1", f = "UseCaseCameraRequestControl.kt", l = {351}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lskm/g0;", "", "<anonymous>", "()Lskm/g0;"}, k = 3, mv = {2, 1, 0})
public final class UseCaseCameraRequestControlImpl$setParametersAsync$1$1 extends i implements Function1<Continuation<? super g0>, Object> {
    final /* synthetic */ Config.OptionPriority $optionPriority;
    final /* synthetic */ UseCaseCameraRequestControl.Type $type;
    final /* synthetic */ Map<CaptureRequest.Key<?>, Object> $values;
    int label;
    final /* synthetic */ UseCaseCameraRequestControlImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraRequestControlImpl$setParametersAsync$1$1(UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl, UseCaseCameraRequestControl.Type type, Map<CaptureRequest.Key<?>, ? extends Object> map, Config.OptionPriority optionPriority, Continuation<? super UseCaseCameraRequestControlImpl$setParametersAsync$1$1> continuation) {
        super(1, continuation);
        this.this$0 = useCaseCameraRequestControlImpl;
        this.$type = type;
        this.$values = map;
        this.$optionPriority = optionPriority;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UseCaseCameraRequestControlImpl$setParametersAsync$1$1(this.this$0, this.$type, this.$values, this.$optionPriority, continuation);
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
        UseCaseCameraRequestControlImpl useCaseCameraRequestControlImpl = this.this$0;
        UseCaseCameraRequestControl.Type type = this.$type;
        Map<CaptureRequest.Key<?>, Object> map = this.$values;
        Config.OptionPriority optionPriority = this.$optionPriority;
        this.label = 1;
        Object parametersInternal = useCaseCameraRequestControlImpl.setParametersInternal(type, map, optionPriority, this);
        return parametersInternal == aVar ? aVar : parametersInternal;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super g0> continuation) {
        return ((UseCaseCameraRequestControlImpl$setParametersAsync$1$1) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
