package pgm;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f236051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f236052n;

    public f(dom.a aVar, igm.o oVar, int i) {
        super(oVar, i);
        this.f236051m = aVar;
        this.f236052n = new AtomicInteger();
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f236024a.a(j2);
    }

    @Override // pgm.h
    public final void b(Throwable th10) {
        this.e.cancel();
        ygm.c cVar = this.f236029j;
        if (cVar.a(th10) && getAndIncrement() == 0) {
            cVar.c(this.f236051m);
        }
    }

    @Override // pgm.h
    public final void c(Object obj2) {
        yoj.b.v(this.f236051m, obj2, this, this.f236029j);
    }

    @Override // dom.b
    public final void cancel() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f236024a.cancel();
        this.e.cancel();
        this.f236029j.b();
    }

    @Override // pgm.d
    public final void f() {
        if (this.f236052n.getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.f236028h;
                    try {
                        Object objPoll = this.f236027g.poll();
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            this.f236051m.onComplete();
                            return;
                        }
                        if (!z3) {
                            try {
                                Object objApply = this.f236025b.apply(objPoll);
                                Objects.requireNonNull(objApply, "The mapper returned a null Publisher");
                                Publisher publisher = (Publisher) objApply;
                                if (this.f236030l != 1) {
                                    int i = this.f + 1;
                                    if (i == this.d) {
                                        this.f = 0;
                                        this.e.a(i);
                                    } else {
                                        this.f = i;
                                    }
                                }
                                if (publisher instanceof igm.q) {
                                    try {
                                        Object obj2 = ((igm.q) publisher).get();
                                        if (obj2 == null) {
                                            continue;
                                        } else if (!this.f236024a.f305780g) {
                                            this.k = true;
                                            this.f236024a.f(new i(obj2, this.f236024a, 0));
                                        } else if (!yoj.b.v(this.f236051m, obj2, this, this.f236029j)) {
                                            return;
                                        }
                                    } catch (Throwable th10) {
                                        ce9.m.F(th10);
                                        this.e.cancel();
                                        this.f236029j.a(th10);
                                        this.f236029j.c(this.f236051m);
                                        return;
                                    }
                                } else {
                                    this.k = true;
                                    publisher.a(this.f236024a);
                                }
                            } catch (Throwable th11) {
                                ce9.m.F(th11);
                                this.e.cancel();
                                this.f236029j.a(th11);
                                this.f236029j.c(this.f236051m);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        this.e.cancel();
                        this.f236029j.a(th12);
                        this.f236029j.c(this.f236051m);
                        return;
                    }
                }
                if (this.f236052n.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // pgm.d
    public final void h() {
        this.f236051m.e(this);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f236024a.cancel();
        ygm.c cVar = this.f236029j;
        if (cVar.a(th10) && getAndIncrement() == 0) {
            cVar.c(this.f236051m);
        }
    }
}
