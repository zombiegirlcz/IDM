package rd0;

import d9.e1;
import java.lang.Thread;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import rch.o;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f253309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f253310b;

    public b(o setCustomKey, Thread.UncaughtExceptionHandler delegate) {
        Intrinsics.checkNotNullParameter(setCustomKey, "setCustomKey");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f253309a = setCustomKey;
        this.f253310b = delegate;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable error) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f253310b;
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(error, "error");
        try {
            for (Map.Entry entry : e1.d(error).entrySet()) {
                this.f253309a.invoke((String) entry.getKey(), (String) entry.getValue());
            }
            uncaughtExceptionHandler.uncaughtException(thread, error);
        } catch (Throwable unused) {
            uncaughtExceptionHandler.uncaughtException(thread, error);
        }
    }
}
