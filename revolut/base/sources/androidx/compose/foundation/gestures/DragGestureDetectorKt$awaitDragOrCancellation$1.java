package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1103}, m = "awaitDragOrCancellation-rnUCldI", v = 1)
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends gim.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitDragOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitDragOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m702awaitDragOrCancellationrnUCldI(null, 0L, this);
    }
}
