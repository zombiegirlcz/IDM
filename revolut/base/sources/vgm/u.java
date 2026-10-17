package vgm;

import efm.c0;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;
import wfm.z;

/* JADX INFO: loaded from: classes14.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f289255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f289256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f289257c;
    public final Object d;

    public /* synthetic */ u(Runnable runnable, Object obj2, long j2, int i) {
        this.f289255a = i;
        this.f289256b = runnable;
        this.d = obj2;
        this.f289257c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f289255a) {
            case 0:
                if (!((w) this.d).d) {
                    long jA = Scheduler.a(TimeUnit.MILLISECONDS);
                    long j2 = this.f289257c;
                    if (j2 > jA) {
                        try {
                            Thread.sleep(j2 - jA);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            jb3.l.v(e);
                            return;
                        }
                    }
                    if (!((w) this.d).d) {
                        this.f289256b.run();
                    }
                }
                break;
            default:
                if (!((z) this.d).d) {
                    long jA2 = c0.a(TimeUnit.MILLISECONDS);
                    long j3 = this.f289257c;
                    if (j3 > jA2) {
                        try {
                            Thread.sleep(j3 - jA2);
                        } catch (InterruptedException e2) {
                            Thread.currentThread().interrupt();
                            mo3.a.m(e2);
                            return;
                        }
                    }
                    if (!((z) this.d).d) {
                        this.f289256b.run();
                    }
                }
                break;
        }
    }
}
