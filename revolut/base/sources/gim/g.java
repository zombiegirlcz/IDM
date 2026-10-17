package gim;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g extends a {
    public g(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != kotlin.coroutines.g.f186406a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.g.f186406a;
    }
}
