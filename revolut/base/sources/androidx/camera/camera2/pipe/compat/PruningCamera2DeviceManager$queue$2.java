package androidx.camera.camera2.pipe.compat;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.PruningCamera2DeviceManager$queue$2", f = "Camera2DeviceManager.kt", l = {190}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroidx/camera/camera2/pipe/compat/CameraRequest;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class PruningCamera2DeviceManager$queue$2 extends i implements Function2<CameraRequest, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PruningCamera2DeviceManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PruningCamera2DeviceManager$queue$2(PruningCamera2DeviceManager pruningCamera2DeviceManager, Continuation<? super PruningCamera2DeviceManager$queue$2> continuation) {
        super(2, continuation);
        this.this$0 = pruningCamera2DeviceManager;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        PruningCamera2DeviceManager$queue$2 pruningCamera2DeviceManager$queue$2 = new PruningCamera2DeviceManager$queue$2(this.this$0, continuation);
        pruningCamera2DeviceManager$queue$2.L$0 = obj2;
        return pruningCamera2DeviceManager$queue$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CameraRequest cameraRequest, Continuation<? super Unit> continuation) {
        return ((PruningCamera2DeviceManager$queue$2) create(cameraRequest, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            CameraRequest cameraRequest = (CameraRequest) this.L$0;
            PruningCamera2DeviceManager pruningCamera2DeviceManager = this.this$0;
            this.label = 1;
            if (pruningCamera2DeviceManager.process(cameraRequest, this) == aVar) {
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
}
