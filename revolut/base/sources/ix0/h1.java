package ix0;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Lazy f169241a = yhm.j.b(new af0.a(25));

    private h1() {
    }

    public static Handler a() {
        return (Handler) f169241a.getValue();
    }

    public static void b(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a().post(runnable);
    }

    public static void c(js0.b runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (runnable.a()) {
            return;
        }
        a().post(runnable);
    }

    public static void d(long j2, Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a().postDelayed(runnable, j2);
    }

    public static void e(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        a().removeCallbacks(runnable);
    }

    public static void f(js0.b runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (runnable.a()) {
            return;
        }
        if (Intrinsics.f(Looper.getMainLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            a().post(runnable);
        }
    }
}
