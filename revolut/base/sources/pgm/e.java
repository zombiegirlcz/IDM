package pgm;

import java.util.Objects;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dom.a f236045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f236046n;

    public e(dom.a aVar, igm.o oVar, int i, boolean z) {
        super(oVar, i);
        this.f236045m = aVar;
        this.f236046n = z;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f236024a.a(j2);
    }

    @Override // pgm.h
    public final void b(Throwable th10) {
        if (this.f236029j.a(th10)) {
            if (!this.f236046n) {
                this.e.cancel();
                this.f236028h = true;
            }
            this.k = false;
            f();
        }
    }

    @Override // pgm.h
    public final void c(Object obj2) {
        this.f236045m.onNext(obj2);
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
        Object obj2;
        if (getAndIncrement() == 0) {
            while (!this.i) {
                if (!this.k) {
                    boolean z = this.f236028h;
                    if (z && !this.f236046n && ((Throwable) this.f236029j.get()) != null) {
                        this.f236029j.c(this.f236045m);
                        return;
                    }
                    try {
                        Object objPoll = this.f236027g.poll();
                        boolean z3 = objPoll == null;
                        if (z && z3) {
                            this.f236029j.c(this.f236045m);
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
                                        obj2 = ((igm.q) publisher).get();
                                    } catch (Throwable th10) {
                                        ce9.m.F(th10);
                                        this.f236029j.a(th10);
                                        if (!this.f236046n) {
                                            this.e.cancel();
                                            this.f236029j.c(this.f236045m);
                                            return;
                                        }
                                        obj2 = null;
                                    }
                                    if (obj2 == null) {
                                        continue;
                                    } else if (this.f236024a.f305780g) {
                                        this.f236045m.onNext(obj2);
                                    } else {
                                        this.k = true;
                                        this.f236024a.f(new i(obj2, this.f236024a, 0));
                                    }
                                } else {
                                    this.k = true;
                                    publisher.a(this.f236024a);
                                }
                            } catch (Throwable th11) {
                                ce9.m.F(th11);
                                this.e.cancel();
                                this.f236029j.a(th11);
                                this.f236029j.c(this.f236045m);
                                return;
                            }
                        }
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        this.e.cancel();
                        this.f236029j.a(th12);
                        this.f236029j.c(this.f236045m);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // pgm.d
    public final void h() {
        this.f236045m.e(this);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236029j.a(th10)) {
            this.f236028h = true;
            f();
        }
    }
}
