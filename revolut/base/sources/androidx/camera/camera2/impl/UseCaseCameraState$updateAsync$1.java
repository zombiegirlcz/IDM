package androidx.camera.camera2.impl;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.UseCaseCameraState", f = "UseCaseCameraState.kt", l = {150}, m = "updateAsync-Tp9XwKQ", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class UseCaseCameraState$updateAsync$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UseCaseCameraState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraState$updateAsync$1(UseCaseCameraState useCaseCameraState, Continuation<? super UseCaseCameraState$updateAsync$1> continuation) {
        super(continuation);
        this.this$0 = useCaseCameraState;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m62updateAsyncTp9XwKQ(null, false, null, false, null, null, null, this);
    }
}
