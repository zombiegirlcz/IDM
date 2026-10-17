package androidx.camera.camera2.pipe.compat;

import com.youTransactor.uCube.rpc.Constants;
import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.CameraStateOpener", f = "RetryingCameraStateOpener.kt", l = {Constants.TAG_OS_VERSION, 275}, m = "tryOpenCamera-7pD7j80$camera_camera2_pipe", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class CameraStateOpener$tryOpenCamera$1 extends c {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CameraStateOpener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraStateOpener$tryOpenCamera$1(CameraStateOpener cameraStateOpener, Continuation<? super CameraStateOpener$tryOpenCamera$1> continuation) {
        super(continuation);
        this.this$0 = cameraStateOpener;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m413tryOpenCamera7pD7j80$camera_camera2_pipe(null, 0, 0L, null, null, this);
    }
}
