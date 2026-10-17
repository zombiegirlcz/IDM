package xgm;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;

/* JADX INFO: loaded from: classes14.dex */
public class e extends AtomicInteger implements dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dom.b f305777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f305778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f305779c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final AtomicLong e = new AtomicLong();
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f305780g;

    @Override // dom.b
    public final void a(long j2) {
        if (!f.f(j2) || this.f305780g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            xam.a.b(this.d, j2);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j3 = this.f305778b;
        if (j3 != Long.MAX_VALUE) {
            long jC = xam.a.c(j3, j2);
            this.f305778b = jC;
            if (jC == Long.MAX_VALUE) {
                this.f305780g = true;
            }
        }
        dom.b bVar = this.f305777a;
        if (decrementAndGet() != 0) {
            b();
        }
        if (bVar != null) {
            bVar.a(j2);
        }
    }

    public final void b() {
        int iAddAndGet = 1;
        long jC = 0;
        dom.b bVar = null;
        do {
            dom.b bVar2 = (dom.b) this.f305779c.get();
            if (bVar2 != null) {
                bVar2 = (dom.b) this.f305779c.getAndSet(null);
            }
            long andSet = this.d.get();
            if (andSet != 0) {
                andSet = this.d.getAndSet(0L);
            }
            long andSet2 = this.e.get();
            if (andSet2 != 0) {
                andSet2 = this.e.getAndSet(0L);
            }
            dom.b bVar3 = this.f305777a;
            if (this.f) {
                if (bVar3 != null) {
                    bVar3.cancel();
                    this.f305777a = null;
                }
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else {
                long jC2 = this.f305778b;
                if (jC2 != Long.MAX_VALUE) {
                    jC2 = xam.a.c(jC2, andSet);
                    if (jC2 != Long.MAX_VALUE) {
                        jC2 -= andSet2;
                        if (jC2 < 0) {
                            l.v(new ProtocolViolationException(p.a.m(jC2, "More produced than requested: ")));
                            jC2 = 0;
                        }
                    }
                    this.f305778b = jC2;
                }
                if (bVar2 != null) {
                    this.f305777a = bVar2;
                    if (jC2 != 0) {
                        jC = xam.a.c(jC, jC2);
                        bVar = bVar2;
                    }
                } else if (bVar3 != null && andSet != 0) {
                    jC = xam.a.c(jC, andSet);
                    bVar = bVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jC != 0) {
            bVar.a(jC);
        }
    }

    public final void c(long j2) {
        if (this.f305780g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            xam.a.b(this.e, j2);
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        long j3 = this.f305778b;
        if (j3 != Long.MAX_VALUE) {
            long j5 = j3 - j2;
            if (j5 < 0) {
                l.v(new ProtocolViolationException(p.a.m(j5, "More produced than requested: ")));
                j5 = 0;
            }
            this.f305778b = j5;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        b();
    }

    public void cancel() {
        if (this.f) {
            return;
        }
        this.f = true;
        if (getAndIncrement() != 0) {
            return;
        }
        b();
    }

    public void e(dom.b bVar) {
        f(bVar);
    }

    public final void f(dom.b bVar) {
        if (this.f) {
            bVar.cancel();
            return;
        }
        Objects.requireNonNull(bVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            if (getAndIncrement() != 0) {
                return;
            }
            b();
            return;
        }
        this.f305777a = bVar;
        long j2 = this.f305778b;
        if (decrementAndGet() != 0) {
            b();
        }
        if (j2 != 0) {
            bVar.a(j2);
        }
    }
}
