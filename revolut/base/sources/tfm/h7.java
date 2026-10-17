package tfm;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 extends AtomicBoolean implements efm.y, ifm.c, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f270517c;
    public final int d;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f270519h;
    public ifm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f270520j = new AtomicInteger();
    public final ArrayDeque e = new ArrayDeque();

    public h7(efm.y yVar, long j2, long j3, int i) {
        this.f270515a = yVar;
        this.f270516b = j2;
        this.f270517c = j3;
        this.d = i;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270518g = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f270518g;
    }

    @Override // efm.y
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque.isEmpty()) {
                this.f270515a.onComplete();
                return;
            }
            ((ihm.m) arrayDeque.poll()).onComplete();
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        while (true) {
            ArrayDeque arrayDeque = this.e;
            if (arrayDeque.isEmpty()) {
                this.f270515a.onError(th10);
                return;
            }
            ((ihm.m) arrayDeque.poll()).onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        ArrayDeque arrayDeque = this.e;
        long j2 = this.f;
        long j3 = this.f270517c;
        if (j2 % j3 == 0 && !this.f270518g) {
            this.f270520j.getAndIncrement();
            ihm.m mVar = new ihm.m(this.d, this);
            arrayDeque.offer(mVar);
            this.f270515a.onNext(mVar);
        }
        long j5 = this.f270519h + 1;
        Iterator it8 = arrayDeque.iterator();
        while (it8.hasNext()) {
            ((ihm.m) it8.next()).onNext(obj2);
        }
        if (j5 >= this.f270516b) {
            ((ihm.m) arrayDeque.poll()).onComplete();
            if (arrayDeque.isEmpty() && this.f270518g) {
                this.i.dispose();
                return;
            }
            this.f270519h = j5 - j3;
        } else {
            this.f270519h = j5;
        }
        this.f = j2 + 1;
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.i, cVar)) {
            this.i = cVar;
            this.f270515a.onSubscribe(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f270520j.decrementAndGet() == 0 && this.f270518g) {
            this.i.dispose();
        }
    }
}
