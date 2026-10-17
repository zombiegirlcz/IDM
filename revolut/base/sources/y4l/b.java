package y4l;

import android.os.Handler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Runnable, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f310968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f310969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f310970c;

    public b(Handler handler, Runnable delegate) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f310968a = handler;
        this.f310969b = delegate;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f310968a.removeCallbacks(this);
        this.f310970c = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f310970c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f310969b.run();
        } catch (Throwable th10) {
            mo3.a.m(th10);
        }
    }
}
