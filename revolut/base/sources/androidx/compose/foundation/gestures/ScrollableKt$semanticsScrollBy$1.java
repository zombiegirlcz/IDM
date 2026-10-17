package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.gestures.ScrollableKt", f = "Scrollable.kt", l = {1118}, m = "semanticsScrollBy-d-4ec7I", v = 1)
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ScrollableKt$semanticsScrollBy$1 extends gim.c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    public ScrollableKt$semanticsScrollBy$1(Continuation<? super ScrollableKt$semanticsScrollBy$1> continuation) {
        super(continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(@NotNull Object obj2) {
        this.result = obj2;
        this.label |= Integer.MIN_VALUE;
        return ScrollableKt.m775semanticsScrollByd4ec7I(null, 0L, this);
    }
}
