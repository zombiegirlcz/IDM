package xkm;

import java.util.concurrent.CompletionException;
import java.util.function.BiFunction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements BiFunction {
    public volatile Continuation<Object> cont;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj2, Object obj3) {
        Throwable cause;
        Throwable th10 = (Throwable) obj3;
        Continuation<Object> continuation = this.cont;
        if (continuation != null) {
            if (th10 == null) {
                m.Companion companion = m.INSTANCE;
                continuation.resumeWith(obj2);
            } else {
                CompletionException completionException = th10 instanceof CompletionException ? (CompletionException) th10 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th10 = cause;
                }
                m.Companion companion2 = m.INSTANCE;
                continuation.resumeWith(o.a(th10));
            }
        }
        return Unit.f186387a;
    }
}
