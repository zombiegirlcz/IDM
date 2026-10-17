package nf;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final qf.a f214789c = qf.a.d();
    public static w d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f214790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f214791b;

    public w(ExecutorService executorService) {
        this.f214791b = executorService;
    }

    public static Context a() {
        try {
            pd.g.c();
            pd.g gVarC = pd.g.c();
            gVarC.a();
            return gVarC.f235023a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized w b() {
        try {
            if (d == null) {
                d = new w(Executors.newSingleThreadExecutor());
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return d;
    }

    public final synchronized void c(Context context) {
        if (this.f214790a == null && context != null) {
            this.f214791b.execute(new ce.j(this, context, 16));
        }
    }

    public final void d(double d5, String str) {
        if (this.f214790a == null) {
            c(a());
            if (this.f214790a == null) {
                return;
            }
        }
        this.f214790a.edit().putLong(str, Double.doubleToRawLongBits(d5)).apply();
    }

    public final void e(long j2, String str) {
        if (this.f214790a == null) {
            c(a());
            if (this.f214790a == null) {
                return;
            }
        }
        this.f214790a.edit().putLong(str, j2).apply();
    }

    public final void f(String str, String str2) {
        if (this.f214790a == null) {
            c(a());
            if (this.f214790a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f214790a.edit().remove(str).apply();
        } else {
            this.f214790a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.f214790a == null) {
            c(a());
            if (this.f214790a == null) {
                return;
            }
        }
        this.f214790a.edit().putBoolean(str, z).apply();
    }
}
