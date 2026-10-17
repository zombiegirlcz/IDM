package y4l;

import android.os.Handler;
import android.os.Looper;
import efm.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f310972a = m70.a.m(new d());

    public static final class a {
        private a() {
        }

        public static c0 a() {
            c0 c0Var = e.f310972a;
            m70.a.p(c0Var);
            Intrinsics.checkNotNullExpressionValue(c0Var, "onMainThreadScheduler(...)");
            return c0Var;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f310973a = new c(new Handler(Looper.getMainLooper()));

        private b() {
        }
    }

    private e() {
        throw new AssertionError("No instances.");
    }
}
