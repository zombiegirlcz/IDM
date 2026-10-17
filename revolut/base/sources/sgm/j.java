package sgm;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends ahm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayBlockingQueue f262915b = new ArrayBlockingQueue(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f262916c = new AtomicInteger();

    @Override // fgm.l
    public final void onComplete() {
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        Object obj3;
        Object obj4;
        fgm.f fVar = (fgm.f) obj2;
        if (this.f262916c.getAndSet(0) != 1 && (obj4 = fVar.f135107a) != null && !(obj4 instanceof ygm.j)) {
            return;
        }
        while (true) {
            ArrayBlockingQueue arrayBlockingQueue = this.f262915b;
            if (arrayBlockingQueue.offer(fVar)) {
                return;
            }
            fgm.f fVar2 = (fgm.f) arrayBlockingQueue.poll();
            if (fVar2 != null && ((obj3 = fVar2.f135107a) == null || (obj3 instanceof ygm.j))) {
                fVar = fVar2;
            }
        }
    }
}
