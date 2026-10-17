package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {1116, 1158}, m = "awaitTouchSlopOrCancellation-jO51t88", v = 1)
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class DragGestureDetectorKt$awaitTouchSlopOrCancellation$1 extends gim.c {
    float F$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public DragGestureDetectorKt$awaitTouchSlopOrCancellation$1(Continuation<? super DragGestureDetectorKt$awaitTouchSlopOrCancellation$1> continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m704awaitTouchSlopOrCancellationjO51t88(null, 0L, null, this);
    }
}
