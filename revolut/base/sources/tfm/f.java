package tfm;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends bgm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayBlockingQueue f270440b = new ArrayBlockingQueue(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f270441c = new AtomicInteger();

    @Override // efm.y
    public final void onComplete() {
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        mo3.a.m(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        efm.p pVar = (efm.p) obj2;
        if (this.f270441c.getAndSet(0) != 1 && pVar.d()) {
            return;
        }
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f270440b;
            if (arrayBlockingQueue.offer(pVar)) {
                return;
            }
            efm.p pVar2 = (efm.p) arrayBlockingQueue.poll();
            if (pVar2 != null && !pVar2.d()) {
                pVar = pVar2;
            }
        }
    }
}
