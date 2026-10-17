package androidx.camera.camera2.pipe.compat;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl", f = "RetryingCameraStateOpener.kt", l = {418, 423, 476}, m = "openCameraWithRetry-aeCOTgg", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class RetryingCameraStateOpenerImpl$openCameraWithRetry$1 extends c {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RetryingCameraStateOpenerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetryingCameraStateOpenerImpl$openCameraWithRetry$1(RetryingCameraStateOpenerImpl retryingCameraStateOpenerImpl, Continuation<? super RetryingCameraStateOpenerImpl$openCameraWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = retryingCameraStateOpenerImpl;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo424openCameraWithRetryaeCOTgg(null, null, null, this);
    }
}
