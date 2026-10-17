package u70;

import java.lang.Thread;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f277711a = new e();

    private e() {
    }

    public final Thread.UncaughtExceptionHandler a() {
        return Thread.getDefaultUncaughtExceptionHandler();
    }

    public final void b(rd0.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Thread.setDefaultUncaughtExceptionHandler(handler);
    }
}
