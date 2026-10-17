package vgm;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class h extends fgm.o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f289234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f289235c;
    public final AtomicBoolean d = new AtomicBoolean();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeDisposable f289233a = new CompositeDisposable();

    public h(g gVar) {
        i iVar;
        i iVar2;
        this.f289234b = gVar;
        if (gVar.f289232c.f163117b) {
            iVar2 = j.f289238h;
        } else {
            while (true) {
                if (gVar.f289231b.isEmpty()) {
                    iVar = new i(gVar.f);
                    gVar.f289232c.a(iVar);
                    break;
                } else {
                    iVar = (i) gVar.f289231b.poll();
                    if (iVar != null) {
                        break;
                    }
                }
            }
            iVar2 = iVar;
        }
        this.f289235c = iVar2;
    }

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f289233a.f163117b ? jgm.c.INSTANCE : this.f289235c.d(runnable, j2, timeUnit, this.f289233a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d.compareAndSet(false, true)) {
            this.f289233a.dispose();
            if (j.i) {
                this.f289235c.d(this, 0L, TimeUnit.NANOSECONDS, null);
                return;
            }
            g gVar = this.f289234b;
            gVar.getClass();
            long jNanoTime = System.nanoTime() + gVar.f289230a;
            i iVar = this.f289235c;
            iVar.f289236c = jNanoTime;
            gVar.f289231b.offer(iVar);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        g gVar = this.f289234b;
        gVar.getClass();
        long jNanoTime = System.nanoTime() + gVar.f289230a;
        i iVar = this.f289235c;
        iVar.f289236c = jNanoTime;
        gVar.f289231b.offer(iVar);
    }
}
