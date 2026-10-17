package androidx.camera.camera2.pipe.compat;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2DeviceCache", f = "Camera2DeviceCache.kt", l = {169}, m = "getOrInitializeDeviceSetupWrapper-0r8Bogc", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1(Camera2DeviceCache camera2DeviceCache, Continuation<? super Camera2DeviceCache$getOrInitializeDeviceSetupWrapper$1> continuation) {
        super(continuation);
        this.this$0 = camera2DeviceCache;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m393getOrInitializeDeviceSetupWrapper0r8Bogc(null, this);
    }
}
