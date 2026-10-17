package tfm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class m7 extends ofm.q implements ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.w f270656g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kfm.o f270657h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ifm.b f270658j;
    public ifm.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f270659l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f270660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicLong f270661n;
    public final AtomicBoolean o;

    public m7(bgm.d dVar, efm.w wVar, kfm.o oVar, int i) {
        super(dVar, new ufm.g());
        this.f270659l = new AtomicReference();
        AtomicLong atomicLong = new AtomicLong();
        this.f270661n = atomicLong;
        this.o = new AtomicBoolean();
        this.f270656g = wVar;
        this.f270657h = oVar;
        this.i = i;
        this.f270658j = new ifm.b();
        this.f270660m = new ArrayList();
        atomicLong.lazySet(1L);
    }

    @Override // ofm.q
    public final void a(efm.y yVar, Object obj2) {
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.o.compareAndSet(false, true)) {
            lfm.d.a(this.f270659l);
            if (this.f270661n.decrementAndGet() == 0) {
                this.k.dispose();
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.o.get();
    }

    public final void j0() {
        ufm.g gVar = this.f224947c;
        bgm.d dVar = this.f224946b;
        ArrayList arrayList = this.f270660m;
        int iAddAndGet = 1;
        while (true) {
            boolean z = this.e;
            Object objPoll = gVar.poll();
            boolean z3 = objPoll == null;
            if (z && z3) {
                this.f270658j.dispose();
                lfm.d.a(this.f270659l);
                Throwable th10 = this.f;
                if (th10 != null) {
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        ((ihm.m) it8.next()).onError(th10);
                    }
                } else {
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        ((ihm.m) it9.next()).onComplete();
                    }
                }
                arrayList.clear();
                return;
            }
            if (z3) {
                iAddAndGet = this.f224945a.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (objPoll instanceof n7) {
                n7 n7Var = (n7) objPoll;
                ihm.m mVar = n7Var.f270683a;
                if (mVar != null) {
                    if (arrayList.remove(mVar)) {
                        n7Var.f270683a.onComplete();
                        if (this.f270661n.decrementAndGet() == 0) {
                            this.f270658j.dispose();
                            lfm.d.a(this.f270659l);
                            return;
                        }
                    } else {
                        continue;
                    }
                } else if (!this.o.get()) {
                    ihm.m mVar2 = new ihm.m(this.i);
                    arrayList.add(mVar2);
                    dVar.onNext(mVar2);
                    try {
                        Object objApply = this.f270657h.apply(n7Var.f270684b);
                        mfm.f.b(objApply, "The ObservableSource supplied is null");
                        efm.w wVar = (efm.w) objApply;
                        l7 l7Var = new l7(this, mVar2);
                        if (this.f270658j.a(l7Var)) {
                            this.f270661n.getAndIncrement();
                            wVar.subscribe(l7Var);
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        this.o.set(true);
                        dVar.onError(th11);
                    }
                }
            } else {
                Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    ((ihm.m) it10.next()).onNext(objPoll);
                }
            }
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        if (f()) {
            j0();
        }
        if (this.f270661n.decrementAndGet() == 0) {
            this.f270658j.dispose();
        }
        this.f224946b.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
            return;
        }
        this.f = th10;
        this.e = true;
        if (f()) {
            j0();
        }
        if (this.f270661n.decrementAndGet() == 0) {
            this.f270658j.dispose();
        }
        this.f224946b.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (g()) {
            Iterator it8 = this.f270660m.iterator();
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
        AtomicReference atomicReference;
        if (lfm.d.f(this.k, cVar)) {
            this.k = cVar;
            this.f224946b.onSubscribe(this);
            if (this.o.get()) {
                return;
            }
            x xVar = new x(this, 1);
            do {
                atomicReference = this.f270659l;
                if (atomicReference.compareAndSet(null, xVar)) {
                    this.f270656g.subscribe(xVar);
                    return;
                }
            } while (atomicReference.get() == null);
        }
    }
}
