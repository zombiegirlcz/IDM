package q6;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f242434b;

    public /* synthetic */ a(AtomicBoolean atomicBoolean, int i) {
        this.f242433a = i;
        this.f242434b = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f242433a) {
            case 0:
                this.f242434b.set(true);
                break;
            default:
                this.f242434b.set(true);
                break;
        }
    }
}
