package gam;

import e8.q;
import efm.c0;
import efm.y;
import ifm.c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import zfm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends AtomicInteger implements c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f142197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f142198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.a f142199c;
    public final boolean d;
    public volatile boolean e;

    public a(y yVar, b bVar, c0.a aVar, boolean z) {
        this.f142197a = yVar;
        this.f142198b = bVar;
        this.f142199c = aVar;
        this.d = z;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e = true;
        this.f142198b.e(this);
        this.f142199c.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f142198b;
        q qVar = bVar.f142202g;
        y yVar = this.f142197a;
        AtomicReference atomicReference = bVar.i;
        boolean z = this.d;
        int iAddAndGet = 1;
        while (!this.e) {
            Throwable th10 = (Throwable) atomicReference.get();
            boolean z3 = th10 != null;
            if (z3 && !z && th10 != h.f322035a) {
                qVar.clear();
                yVar.onError(th10);
                this.f142199c.dispose();
                return;
            }
            Object objPoll = qVar.poll();
            boolean z4 = objPoll == null;
            if (z3 && z4) {
                if (th10 == h.f322035a) {
                    yVar.onComplete();
                } else {
                    yVar.onError(th10);
                }
                this.f142199c.dispose();
                return;
            }
            if (z4) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                yVar.onNext(objPoll);
            }
        }
    }
}
