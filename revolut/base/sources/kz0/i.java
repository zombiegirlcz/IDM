package kz0;

import android.app.Activity;
import android.os.Looper;
import efm.r;
import eoi.s;
import ix0.h1;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i implements a, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f191040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f191042c;
    public g d;
    public final AtomicInteger e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public s f191043g;

    public i(Activity activity, long j2) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f191040a = activity;
        this.f191041b = j2;
        this.e = new AtomicInteger(0);
        this.f = v0.a.d("create(...)");
    }

    @Override // kz0.a
    public final r a() {
        return this.f;
    }

    @Override // kz0.a
    public final void b(s callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        g gVar = this.d;
        if (gVar == null) {
            this.f191043g = callback;
        } else {
            Intrinsics.checkNotNullParameter(callback, "callback");
            gVar.f191039h = callback;
        }
    }

    public final a c() {
        g gVar = this.d;
        if (gVar == null) {
            gVar = new g(this.f191040a, this.f191041b);
            gVar.f191037c.subscribe(this.f);
            s callback = this.f191043g;
            if (callback != null) {
                this.f191043g = null;
                Intrinsics.checkNotNullParameter(callback, "callback");
                gVar.f191039h = callback;
            }
            this.d = gVar;
        }
        return gVar;
    }

    @Override // kz0.a
    public final void dismiss() {
        Lazy lazy = h1.f169241a;
        boolean zF = Intrinsics.f(Looper.getMainLooper(), Looper.myLooper());
        AtomicInteger atomicInteger = this.e;
        if (!zF) {
            if (atomicInteger.getAndSet(2) == 0) {
                h1.b(this);
            }
        } else {
            atomicInteger.set(0);
            if (this.f191042c) {
                this.f191042c = false;
                ((g) c()).dismiss();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int andSet = this.e.getAndSet(0);
        if (andSet == 1) {
            if (this.f191042c) {
                return;
            }
            this.f191042c = true;
            ((g) c()).show();
            return;
        }
        if (andSet == 2 && this.f191042c) {
            this.f191042c = false;
            ((g) c()).dismiss();
        }
    }

    @Override // kz0.a
    public final void show() throws Throwable {
        Lazy lazy = h1.f169241a;
        boolean zF = Intrinsics.f(Looper.getMainLooper(), Looper.myLooper());
        AtomicInteger atomicInteger = this.e;
        if (!zF) {
            if (atomicInteger.getAndSet(1) == 0) {
                h1.b(this);
            }
        } else {
            atomicInteger.set(0);
            if (this.f191042c) {
                return;
            }
            this.f191042c = true;
            ((g) c()).show();
        }
    }
}
