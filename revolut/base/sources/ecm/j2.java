package ecm;

import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class j2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f124827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f124828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f124829c;

    public j2(Runnable runnable) {
        this.f124827a = (Runnable) Preconditions.checkNotNull(runnable, "task");
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f124828b) {
            return;
        }
        this.f124829c = true;
        this.f124827a.run();
    }
}
