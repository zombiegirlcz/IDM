package androidx.camera.camera2.pipe.internal;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.internal.GraphSessionLock", f = "GraphSessionLock.kt", l = {105}, m = "acquireToken$camera_camera2_pipe", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class GraphSessionLock$acquireToken$1 extends c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GraphSessionLock this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphSessionLock$acquireToken$1(GraphSessionLock graphSessionLock, Continuation<? super GraphSessionLock$acquireToken$1> continuation) {
        super(continuation);
        this.this$0 = graphSessionLock;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.acquireToken$camera_camera2_pipe(this);
    }
}
