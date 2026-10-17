package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraId;
import com.bumptech.glide.c;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import org.jmrtd.cbeff.ISO781611;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1", f = "RetryingCameraStateOpener.kt", l = {ISO781611.SMT_DO_DS}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/camera/camera2/pipe/CameraId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraAvailabilityMonitor$availableCameraFlow$1 extends i implements Function2<ProducerScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ Camera2CameraAvailabilityMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraAvailabilityMonitor$availableCameraFlow$1(Camera2CameraAvailabilityMonitor camera2CameraAvailabilityMonitor, Continuation<? super Camera2CameraAvailabilityMonitor$availableCameraFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = camera2CameraAvailabilityMonitor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CameraManager cameraManager, Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1) {
        cameraManager.unregisterAvailabilityCallback(camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1);
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        Camera2CameraAvailabilityMonitor$availableCameraFlow$1 camera2CameraAvailabilityMonitor$availableCameraFlow$1 = new Camera2CameraAvailabilityMonitor$availableCameraFlow$1(this.this$0, continuation);
        camera2CameraAvailabilityMonitor$availableCameraFlow$1.L$0 = obj2;
        return camera2CameraAvailabilityMonitor$availableCameraFlow$1;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            final ProducerScope producerScope = (ProducerScope) this.L$0;
            CameraManager.AvailabilityCallback availabilityCallback = new CameraManager.AvailabilityCallback() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$availableCameraFlow$1$availabilityCallback$1
                @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
                public void onCameraAvailable(String cameraIdString) {
                    Intrinsics.checkNotNullParameter(cameraIdString, "cameraIdString");
                    c.E(producerScope, CameraId.m181boximpl(CameraId.m182constructorimpl(cameraIdString)));
                }
            };
            CameraManager cameraManager = (CameraManager) this.this$0.cameraManager.get();
            Intrinsics.h(cameraManager);
            Api28Compat.registerAvailabilityCallback(cameraManager, this.this$0.threads.getCamera2Executor(), availabilityCallback);
            a aVar2 = new a(cameraManager, availabilityCallback, 0);
            this.label = 1;
            if (com.bumptech.glide.d.d(producerScope, aVar2, this) == aVar) {
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
    public final Object invoke(ProducerScope producerScope, Continuation<? super Unit> continuation) {
        return ((Camera2CameraAvailabilityMonitor$availableCameraFlow$1) create(producerScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
