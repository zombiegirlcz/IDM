package d7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {
    public static final Executor e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f111674a = new LinkedHashSet(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f111675b = new LinkedHashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f111676c = new Handler(Looper.getMainLooper());
    public volatile g0 d = null;

    static {
        if ("true".equals(System.getProperty("lottie.testing.directExecutor"))) {
            e = new l.a(2);
        } else {
            e = Executors.newCachedThreadPool(new r7.d());
        }
    }

    public i0(j jVar) {
        d(new g0(jVar));
    }

    public final synchronized void a(d0 d0Var) {
        Throwable th10;
        try {
            g0 g0Var = this.d;
            if (g0Var != null && (th10 = g0Var.f111670b) != null) {
                d0Var.onResult(th10);
            }
            this.f111675b.add(d0Var);
        } catch (Throwable th11) {
            throw th11;
        }
    }

    public final synchronized void b(d0 d0Var) {
        j jVar;
        try {
            g0 g0Var = this.d;
            if (g0Var != null && (jVar = g0Var.f111669a) != null) {
                d0Var.onResult(jVar);
            }
            this.f111674a.add(d0Var);
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void c() {
        g0 g0Var = this.d;
        if (g0Var == null) {
            return;
        }
        j jVar = g0Var.f111669a;
        if (jVar != null) {
            synchronized (this) {
                Iterator it8 = new ArrayList(this.f111674a).iterator();
                while (it8.hasNext()) {
                    ((d0) it8.next()).onResult(jVar);
                }
            }
            return;
        }
        Throwable th10 = g0Var.f111670b;
        synchronized (this) {
            ArrayList arrayList = new ArrayList(this.f111675b);
            if (arrayList.isEmpty()) {
                r7.c.c("Lottie encountered an error but no failure listener was added:", th10);
                return;
            }
            Iterator it9 = arrayList.iterator();
            while (it9.hasNext()) {
                ((d0) it9.next()).onResult(th10);
            }
        }
    }

    public final void d(g0 g0Var) {
        if (this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = g0Var;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c();
        } else {
            this.f111676c.post(new androidx.view.d(this, 9));
        }
    }

    public i0(Callable callable, boolean z) {
        if (z) {
            try {
                d((g0) callable.call());
                return;
            } catch (Throwable th10) {
                d(new g0(th10));
                return;
            }
        }
        Executor executor = e;
        h0 h0Var = new h0(callable);
        h0Var.f111671a = this;
        executor.execute(h0Var);
    }
}
