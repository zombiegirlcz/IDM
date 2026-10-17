package androidx.camera.camera2.pipe.compat;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1", f = "VirtualCamera.kt", l = {177}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class VirtualCameraState$connect$2$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $state;
    int label;
    final /* synthetic */ VirtualCameraState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCameraState$connect$2$1(Flow flow, VirtualCameraState virtualCameraState, Continuation<? super VirtualCameraState$connect$2$1> continuation) {
        super(2, continuation);
        this.$state = flow;
        this.this$0 = virtualCameraState;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new VirtualCameraState$connect$2$1(this.$state, this.this$0, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            Flow flow = this.$state;
            final VirtualCameraState virtualCameraState = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.camera.camera2.pipe.compat.VirtualCameraState$connect$2$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj3, Continuation continuation) {
                    return emit((CameraState) obj3, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(CameraState cameraState, Continuation<? super Unit> continuation) {
                    Object obj3 = virtualCameraState.lock;
                    VirtualCameraState virtualCameraState2 = virtualCameraState;
                    synchronized (obj3) {
                        try {
                            if (cameraState instanceof CameraStateOpen) {
                                CameraDeviceWrapper cameraDevice = ((CameraStateOpen) cameraState).getCameraDevice();
                                Intrinsics.i(cameraDevice, "null cannot be cast to non-null type androidx.camera.camera2.pipe.compat.AndroidCameraDevice");
                                VirtualAndroidCameraDevice virtualAndroidCameraDevice = new VirtualAndroidCameraDevice((AndroidCameraDevice) cameraDevice);
                                virtualCameraState2.currentVirtualAndroidCamera = virtualAndroidCameraDevice;
                                virtualCameraState2.emitState(new CameraStateOpen(virtualAndroidCameraDevice));
                            } else {
                                virtualCameraState2.emitState(cameraState);
                            }
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                    return Unit.f186387a;
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
        return ((VirtualCameraState$connect$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
