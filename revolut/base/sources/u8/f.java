package u8;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import v8.l;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements Future, l, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f278000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f278001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f278002c;
    public boolean d;
    public boolean e;
    public GlideException f;

    @Override // v8.l
    public final void a(j jVar) {
        jVar.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // v8.l
    public final void b(Drawable drawable) {
    }

    @Override // v8.l
    public final synchronized void c(c cVar) {
        this.f278001b = cVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f278002c = true;
                notifyAll();
                c cVar = null;
                if (z) {
                    c cVar2 = this.f278001b;
                    this.f278001b = null;
                    cVar = cVar2;
                }
                if (cVar != null) {
                    cVar.clear();
                }
                return true;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // v8.l
    public final synchronized void d(Object obj2, w8.d dVar) {
    }

    @Override // v8.l
    public final void e(j jVar) {
    }

    @Override // v8.l
    public final void f(Drawable drawable) {
    }

    @Override // v8.l
    public final synchronized void g(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return h(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // v8.l
    public final synchronized c getRequest() {
        return this.f278001b;
    }

    public final synchronized Object h(Long l2) {
        if (!isDone()) {
            char[] cArr = y8.l.f311609a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.f278002c) {
            throw new CancellationException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.d) {
            return this.f278000a;
        }
        if (l2 == null) {
            wait(0L);
        } else if (l2.longValue() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = l2.longValue() + jCurrentTimeMillis;
            while (!isDone() && jCurrentTimeMillis < jLongValue) {
                wait(jLongValue - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.e) {
            throw new ExecutionException(this.f);
        }
        if (this.f278002c) {
            throw new CancellationException();
        }
        if (!this.d) {
            throw new TimeoutException();
        }
        return this.f278000a;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.f278002c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0012  */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isDone() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f278002c     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L12
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto Le
            goto L12
        Le:
            r0 = 0
            goto L13
        L10:
            r0 = move-exception
            goto L15
        L12:
            r0 = 1
        L13:
            monitor-exit(r1)
            return r0
        L15:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.f.isDone():boolean");
    }

    @Override // r8.j
    public final void onDestroy() {
    }

    @Override // u8.g
    public final synchronized boolean onLoadFailed(GlideException glideException, Object obj2, l lVar, boolean z) {
        this.e = true;
        this.f = glideException;
        notifyAll();
        return false;
    }

    @Override // u8.g
    public final synchronized boolean onResourceReady(Object obj2, Object obj3, l lVar, c8.a aVar, boolean z) {
        this.d = true;
        this.f278000a = obj2;
        notifyAll();
        return false;
    }

    @Override // r8.j
    public final void onStart() {
    }

    @Override // r8.j
    public final void onStop() {
    }

    public final String toString() {
        c cVar;
        String str;
        String strI = v0.a.i(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                cVar = null;
                if (this.f278002c) {
                    str = "CANCELLED";
                } else if (this.e) {
                    str = "FAILURE";
                } else if (this.d) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    cVar = this.f278001b;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        if (cVar == null) {
            return com.google.android.gms.internal.mlkit_vision_face.a.o(strI, str, "]");
        }
        return strI + str + ", request=[" + cVar + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return h(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
