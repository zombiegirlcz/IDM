package androidx.camera.camera2.pipe.compat;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.compat.Camera2Backend", f = "Camera2Backend.kt", l = {LDSFile.EF_DG15_TAG, 129}, m = "isConfigSupported-NpXggIU", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Camera2Backend$isConfigSupported$1 extends c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Camera2Backend this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Camera2Backend$isConfigSupported$1(Camera2Backend camera2Backend, Continuation<? super Camera2Backend$isConfigSupported$1> continuation) {
        super(continuation);
        this.this$0 = camera2Backend;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo104isConfigSupportedNpXggIU(null, this);
    }
}
