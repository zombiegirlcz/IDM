package androidx.camera.camera2.pipe.graph;

import gim.c;
import gim.d;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.camera.camera2.pipe.graph.Controller3A", f = "Controller3A.kt", l = {373}, m = "lock3A-Qz1gx5w", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final class Controller3A$lock3A$1 extends c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Controller3A this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Controller3A$lock3A$1(Controller3A controller3A, Continuation<? super Controller3A$lock3A$1> continuation) {
        super(continuation);
        this.this$0 = controller3A;
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m452lock3AQz1gx5w(null, null, null, null, null, null, null, null, null, 0, null, null, this);
    }
}
