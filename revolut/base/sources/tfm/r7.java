package tfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r7 extends ofm.q implements ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f270784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TimeUnit f270785h;
    public final efm.c0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f270786j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f270787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c0.a f270788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f270789n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ifm.c f270790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ihm.m f270791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile boolean f270792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lfm.b f270793s;

    public r7(bgm.d dVar, long j2, TimeUnit timeUnit, efm.c0 c0Var, int i, long j3, boolean z) {
        super(dVar, new ufm.g());
        this.f270793s = new lfm.b(1);
        this.f270784g = j2;
        this.f270785h = timeUnit;
        this.i = c0Var;
        this.f270786j = i;
        this.f270787l = j3;
        this.k = z;
        if (z) {
            this.f270788m = c0Var.b();
        } else {
            this.f270788m = null;
        }
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
        ihm.m mVar;
        ufm.g gVar = this.f224947c;
        bgm.d dVar = this.f224946b;
        ihm.m mVar2 = this.f270791q;
        int iAddAndGet = 1;
        while (!this.f270792r) {
            boolean z = this.e;
            Object objPoll = gVar.poll();
            boolean z3 = objPoll == null;
            boolean z4 = objPoll instanceof q7;
            if (z && (z3 || z4)) {
                this.f270791q = null;
                gVar.clear();
                Throwable th10 = this.f;
                if (th10 != null) {
                    mVar2.onError(th10);
                } else {
                    mVar2.onComplete();
                }
                lfm.d.a(this.f270793s);
                c0.a aVar = this.f270788m;
                if (aVar != null) {
                    aVar.dispose();
                    return;
                }
                return;
            }
            if (z3) {
                iAddAndGet = this.f224945a.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else if (z4) {
                q7 q7Var = (q7) objPoll;
                if (!this.k || this.o == q7Var.f270756a) {
                    mVar2.onComplete();
                    this.f270789n = 0L;
                    mVar = new ihm.m(this.f270786j);
                    this.f270791q = mVar;
                    dVar.onNext(mVar);
                    mVar2 = mVar;
                }
            } else {
                mVar2.onNext(objPoll);
                long j2 = this.f270789n + 1;
                if (j2 >= this.f270787l) {
                    this.o++;
                    this.f270789n = 0L;
                    mVar2.onComplete();
                    mVar = new ihm.m(this.f270786j);
                    this.f270791q = mVar;
                    this.f224946b.onNext(mVar);
                    if (this.k) {
                        ifm.c cVar = (ifm.c) this.f270793s.get();
                        cVar.dispose();
                        c0.a aVar2 = this.f270788m;
                        q7 q7Var2 = new q7(this.o, this);
                        long j3 = this.f270784g;
                        ifm.c cVarC = aVar2.c(q7Var2, j3, j3, this.f270785h);
                        if (!this.f270793s.compareAndSet(cVar, cVarC)) {
                            cVarC.dispose();
                        }
                    }
                    mVar2 = mVar;
                } else {
                    this.f270789n = j2;
                }
            }
        }
        this.f270790p.dispose();
        gVar.clear();
        lfm.d.a(this.f270793s);
        c0.a aVar3 = this.f270788m;
        if (aVar3 != null) {
            aVar3.dispose();
        }
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
        if (this.f270792r) {
            return;
        }
        if (g()) {
            ihm.m mVar = this.f270791q;
            mVar.onNext(obj2);
            long j2 = this.f270789n + 1;
            if (j2 >= this.f270787l) {
                this.o++;
                this.f270789n = 0L;
                mVar.onComplete();
                ihm.m mVar2 = new ihm.m(this.f270786j);
                this.f270791q = mVar2;
                this.f224946b.onNext(mVar2);
                if (this.k) {
                    ((ifm.c) this.f270793s.get()).dispose();
                    c0.a aVar = this.f270788m;
                    q7 q7Var = new q7(this.o, this);
                    long j3 = this.f270784g;
                    lfm.d.c(this.f270793s, aVar.c(q7Var, j3, j3, this.f270785h));
                }
            } else {
                this.f270789n = j2;
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
        ifm.c cVarE;
        if (lfm.d.f(this.f270790p, cVar)) {
            this.f270790p = cVar;
            bgm.d dVar = this.f224946b;
            dVar.onSubscribe(this);
            if (this.d) {
                return;
            }
            ihm.m mVar = new ihm.m(this.f270786j);
            this.f270791q = mVar;
            dVar.onNext(mVar);
            q7 q7Var = new q7(this.o, this);
            if (this.k) {
                c0.a aVar = this.f270788m;
                long j2 = this.f270784g;
                cVarE = aVar.c(q7Var, j2, j2, this.f270785h);
            } else {
                efm.c0 c0Var = this.i;
                long j3 = this.f270784g;
                cVarE = c0Var.e(q7Var, j3, j3, this.f270785h);
            }
            lfm.b bVar = this.f270793s;
            bVar.getClass();
            lfm.d.c(bVar, cVarE);
        }
    }
}
