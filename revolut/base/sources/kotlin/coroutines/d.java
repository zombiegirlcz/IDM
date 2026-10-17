package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext$Element;", "q1", "eim/a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends CoroutineContext.Element {

    @NotNull
    public static final eim.a q1 = eim.a.f126699a;

    Continuation interceptContinuation(Continuation continuation);

    void releaseInterceptedContinuation(Continuation continuation);
}
