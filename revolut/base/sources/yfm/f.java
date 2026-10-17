package yfm;

import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public class f extends AtomicInteger implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dom.b f313470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f313471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f313472c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f313473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f313474h;

    public f(boolean z) {
        this.f = z;
    }

    @Override // dom.b
    public final void a(long j2) {
        if (!g.f(j2) || this.f313474h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            com.bumptech.glide.d.a(this.d, j2);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j3 = this.f313471b;
        if (j3 != Long.MAX_VALUE) {
            long jB = com.bumptech.glide.d.b(j3, j2);
            this.f313471b = jB;
            if (jB == Long.MAX_VALUE) {
                this.f313474h = true;
            }
        }
        dom.b bVar = this.f313470a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    public final void b() {
        int iAddAndGet = 1;
        long jB = 0;
        dom.b bVar = null;
        do {
            dom.b bVar2 = (dom.b) this.f313472c.get();
            if (bVar2 != null) {
                bVar2 = (dom.b) this.f313472c.getAndSet(null);
            }
            long andSet = this.d.get();
            if (andSet != 0) {
                andSet = this.d.getAndSet(0L);
            }
            long andSet2 = this.e.get();
            if (andSet2 != 0) {
                andSet2 = this.e.getAndSet(0L);
            }
            dom.b bVar3 = this.f313470a;
            if (this.f313473g) {
                if (bVar3 != null) {
                    bVar3.cancel();
                    this.f313470a = null;
                }
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else {
                long jB2 = this.f313471b;
                if (jB2 != Long.MAX_VALUE) {
                    jB2 = com.bumptech.glide.d.b(jB2, andSet);
                    if (jB2 != Long.MAX_VALUE) {
                        jB2 -= andSet2;
                        if (jB2 < 0) {
                            mo3.a.m(new ProtocolViolationException(p.a.m(jB2, "More produced than requested: ")));
                            jB2 = 0;
                        }
                    }
                    this.f313471b = jB2;
                }
                if (bVar2 != null) {
                    if (bVar3 != null && this.f) {
                        bVar3.cancel();
                    }
                    this.f313470a = bVar2;
                    if (jB2 != 0) {
                        jB = com.bumptech.glide.d.b(jB, jB2);
                        bVar = bVar2;
                    }
                } else if (bVar3 != null && andSet != 0) {
                    jB = com.bumptech.glide.d.b(jB, andSet);
                    bVar = bVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jB != 0) {
            bVar.a(jB);
        }
    }

    public final void c(long j2) {
        if (this.f313474h) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            com.bumptech.glide.d.a(this.e, j2);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j3 = this.f313471b;
        if (j3 != Long.MAX_VALUE) {
            long j5 = j3 - j2;
            if (j5 < 0) {
                mo3.a.m(new ProtocolViolationException(p.a.m(j5, "More produced than requested: ")));
                j5 = 0;
            }
            this.f313471b = j5;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public void cancel() {
        if (this.f313473g) {
            return;
        }
        this.f313473g = true;
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public void e(dom.b bVar) {
        f(bVar);
    }

    public final void f(dom.b bVar) {
        if (this.f313473g) {
            bVar.cancel();
            return;
        }
        mfm.f.b(bVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            dom.b bVar2 = (dom.b) this.f313472c.getAndSet(bVar);
            if (bVar2 != null && this.f) {
                bVar2.cancel();
            }
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        dom.b bVar3 = this.f313470a;
        if (bVar3 != null && this.f) {
            bVar3.cancel();
        }
        this.f313470a = bVar;
        long j2 = this.f313471b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j2 != 0) {
            bVar.a(j2);
        }
    }
}
