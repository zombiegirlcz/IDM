package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1", f = "Camera2CameraStatusMonitor.kt", l = {69}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraStatusMonitor$cameraStatusJob$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ Camera2CameraStatusMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraStatusMonitor$cameraStatusJob$1(Camera2CameraStatusMonitor camera2CameraStatusMonitor, Continuation<? super Camera2CameraStatusMonitor$cameraStatusJob$1> continuation) {
        super(2, continuation);
        this.this$0 = camera2CameraStatusMonitor;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new Camera2CameraStatusMonitor$cameraStatusJob$1(this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            Flow flow = this.this$0.cameraStatus;
            final Camera2CameraStatusMonitor camera2CameraStatusMonitor = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraStatusMonitor$cameraStatusJob$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                    return emit((CameraStatusMonitor.CameraStatus) obj3, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(CameraStatusMonitor.CameraStatus cameraStatus, Continuation<? super Unit> continuation) {
                    if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) {
                        Object objEmit = camera2CameraStatusMonitor._cameraAvailability.emit(cameraStatus, continuation);
                        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
                    }
                    if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable) {
                        Object objEmit2 = camera2CameraStatusMonitor._cameraAvailability.emit(cameraStatus, continuation);
                        return objEmit2 == fim.a.COROUTINE_SUSPENDED ? objEmit2 : Unit.f186387a;
                    }
                    if (!(cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged)) {
                        return Unit.f186387a;
                    }
                    MutableSharedFlow mutableSharedFlow = camera2CameraStatusMonitor._cameraPriorities;
                    Unit unit = Unit.f186387a;
                    Object objEmit3 = mutableSharedFlow.emit(unit, continuation);
                    return objEmit3 == fim.a.COROUTINE_SUSPENDED ? objEmit3 : unit;
                }
            };
            this.label = 1;
            if (flow.collect(flowCollector, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Camera2CameraStatusMonitor$cameraStatusJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
