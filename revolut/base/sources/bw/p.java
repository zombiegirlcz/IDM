package bw;

import android.os.Handler;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageProxy f19156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f19157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f19158c;
    public final a0.a d;

    public p(ImageProxy proxy, Handler handler) {
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f19156a = proxy;
        this.f19157b = handler;
        this.f19158c = new AtomicBoolean(false);
        a0.a aVar = new a0.a(this, 7);
        this.d = aVar;
        handler.postDelayed(aVar, 2000L);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f19158c.compareAndSet(false, true)) {
            this.f19157b.removeCallbacks(this.d);
            this.f19156a.close();
        }
    }
}
