package tfm;

import efm.c0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class u7 extends ofm.q implements ifm.c, Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f270870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270871h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c0.a f270872j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedList f270873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ifm.c f270874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f270875n;

    public u7(bgm.d dVar, long j2, long j3, TimeUnit timeUnit, c0.a aVar, int i) {
        super(dVar, new ufm.g());
        this.f270870g = j2;
        this.f270871h = j3;
        this.i = timeUnit;
        this.f270872j = aVar;
        this.k = i;
        this.f270873l = new LinkedList();
    }

    @Override // ifm.c
    public final void dispose() {
        this.d = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    public final void j0() {
        ufm.g gVar = this.f224947c;
        bgm.d dVar = this.f224946b;
        LinkedList linkedList = this.f270873l;
        int iAddAndGet = 1;
        while (!this.f270875n) {
            boolean z = this.e;
            Object objPoll = gVar.poll();
            boolean z3 = objPoll == null;
            boolean z4 = objPoll instanceof t7;
            if (z && (z3 || z4)) {
                gVar.clear();
                Throwable th10 = this.f;
                if (th10 != null) {
                    Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        ((ihm.m) it8.next()).onError(th10);
                    }
                } else {
                    Iterator it9 = linkedList.iterator();
                    while (it9.hasNext()) {
                        ((ihm.m) it9.next()).onComplete();
                    }
                }
                linkedList.clear();
                this.f270872j.dispose();
                return;
            }
            if (z3) {
                iAddAndGet = this.f224945a.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (z4) {
                t7 t7Var = (t7) objPoll;
                if (!t7Var.f270850b) {
                    linkedList.remove(t7Var.f270849a);
                    t7Var.f270849a.onComplete();
                    if (linkedList.isEmpty() && this.d) {
                        this.f270875n = true;
                    }
                } else if (!this.d) {
                    ihm.m mVar = new ihm.m(this.k);
                    linkedList.add(mVar);
                    dVar.onNext(mVar);
                    this.f270872j.b(new r8.d(this, mVar, 9), this.f270870g, this.i);
                }
            } else {
                Iterator it10 = linkedList.iterator();
                while (it10.hasNext()) {
                    ((ihm.m) it10.next()).onNext(objPoll);
                }
            }
        }
        this.f270874m.dispose();
        gVar.clear();
        linkedList.clear();
        this.f270872j.dispose();
    }

    @Override // efm.y
    public final void onComplete() {
        this.e = true;
        if (f()) {
            j0();
        }
        this.f224946b.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f = th10;
        this.e = true;
        if (f()) {
            j0();
        }
        this.f224946b.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (g()) {
            Iterator it8 = this.f270873l.iterator();
            while (it8.hasNext()) {
                ((ihm.m) it8.next()).onNext(obj2);
            }
            if (this.f224945a.addAndGet(-1) == 0) {
                return;
            }
        } else {
            this.f224947c.offer(obj2);
            if (!f()) {
                return;
            }
        }
        j0();
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270874m, cVar)) {
            this.f270874m = cVar;
            this.f224946b.onSubscribe(this);
            if (this.d) {
                return;
            }
            ihm.m mVar = new ihm.m(this.k);
            this.f270873l.add(mVar);
            this.f224946b.onNext(mVar);
            this.f270872j.b(new r8.d(this, mVar, 9), this.f270870g, this.i);
            c0.a aVar = this.f270872j;
            long j2 = this.f270871h;
            aVar.c(this, j2, j2, this.i);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        t7 t7Var = new t7(new ihm.m(this.k), true);
        if (!this.d) {
            this.f224947c.offer(t7Var);
        }
        if (f()) {
            j0();
        }
    }
}
