package androidx.camera.camera2.pipe.compat;

import ch.qos.logback.core.net.SyslogConstants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.q;
import skm.r;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1", f = "RetryingCameraStateOpener.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ q $listener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1(q qVar, Continuation<? super Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1> continuation) {
        super(2, continuation);
        this.$listener = qVar;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1(this.$listener, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            q qVar = this.$listener;
            this.label = 1;
            if (((r) qVar).y(this) == aVar) {
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
        return ((Camera2CameraAvailabilityMonitor$startMonitoring$2$awaitAvailableCamera$success$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
