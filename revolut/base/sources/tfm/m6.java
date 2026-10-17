package tfm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class m6 extends AtomicBoolean implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f270651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f270652c;
    public final TimeUnit d;
    public final efm.c0 e;
    public final vfm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f270653g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ifm.c f270654h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Throwable f270655j;

    public m6(efm.y yVar, long j2, long j3, TimeUnit timeUnit, efm.c0 c0Var, int i, boolean z) {
        this.f270650a = yVar;
        this.f270651b = j2;
        this.f270652c = j3;
        this.d = timeUnit;
        this.e = c0Var;
        this.f = new vfm.c(i);
        this.f270653g = z;
    }

    public final void a() {
        Throwable th10;
        if (compareAndSet(false, true)) {
            efm.y yVar = this.f270650a;
            vfm.c cVar = this.f;
            boolean z = this.f270653g;
            efm.c0 c0Var = this.e;
            TimeUnit timeUnit = this.d;
            c0Var.getClass();
            long jA = efm.c0.a(timeUnit) - this.f270652c;
            while (!this.i) {
                if (!z && (th10 = this.f270655j) != null) {
                    cVar.clear();
                    yVar.onError(th10);
                    return;
                }
                Object objPoll = cVar.poll();
                if (objPoll == null) {
                    Throwable th11 = this.f270655j;
                    if (th11 != null) {
                        yVar.onError(th11);
                        return;
                    } else {
                        yVar.onComplete();
                        return;
                    }
                }
                Object objPoll2 = cVar.poll();
                if (((Long) objPoll).longValue() >= jA) {
                    yVar.onNext(objPoll2);
                }
            }
            cVar.clear();
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f270654h.dispose();
        if (compareAndSet(false, true)) {
            this.f.clear();
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.i;
    }

    @Override // efm.y
    public final void onComplete() {
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f270655j = th10;
        a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2;
        long j3;
        this.e.getClass();
        long jA = efm.c0.a(this.d);
        long j5 = this.f270651b;
        boolean z = j5 == Long.MAX_VALUE;
        Long lValueOf = Long.valueOf(jA);
        vfm.c cVar = this.f;
        cVar.a(lValueOf, obj2);
        while (!cVar.isEmpty()) {
            if (((Long) cVar.c()).longValue() > jA - this.f270652c) {
                if (z) {
                    return;
                }
                AtomicLong atomicLong = cVar.f288677h;
                long j16 = atomicLong.get();
                while (true) {
                    j2 = cVar.f288673a.get();
                    j3 = atomicLong.get();
                    if (j16 == j3) {
                        break;
                    } else {
                        j16 = j3;
                    }
                }
                if ((((int) (j2 - j3)) >> 1) <= j5) {
                    return;
                }
            }
            cVar.poll();
            cVar.poll();
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f270654h, cVar)) {
            this.f270654h = cVar;
            this.f270650a.onSubscribe(this);
        }
    }
}
