package xfm;

import efm.j;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;
import yfm.g;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AtomicReference implements j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfm.j f305445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f305446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f305447c;
    public volatile nfm.j d;
    public volatile boolean e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f305448g;

    public c(qfm.j jVar, int i) {
        this.f305445a = jVar;
        this.f305446b = i;
        this.f305447c = i - (i >> 2);
    }

    @Override // dom.b
    public final void a(long j2) {
        if (this.f305448g != 1) {
            long j3 = this.f + j2;
            if (j3 < this.f305447c) {
                this.f = j3;
            } else {
                this.f = 0L;
                ((dom.b) get()).a(j3);
            }
        }
    }

    @Override // dom.b
    public final void cancel() {
        g.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (g.e(this, bVar)) {
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(3);
                if (iB == 1) {
                    this.f305448g = iB;
                    this.d = gVar;
                    this.e = true;
                    qfm.j jVar = this.f305445a;
                    jVar.getClass();
                    this.e = true;
                    jVar.c();
                    return;
                }
                if (iB == 2) {
                    this.f305448g = iB;
                    this.d = gVar;
                    int i = this.f305446b;
                    bVar.a(i >= 0 ? i : Long.MAX_VALUE);
                    return;
                }
            }
            int i2 = this.f305446b;
            this.d = i2 < 0 ? new vfm.c(-i2) : new vfm.b(i2);
            int i3 = this.f305446b;
            bVar.a(i3 >= 0 ? i3 : Long.MAX_VALUE);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        qfm.j jVar = this.f305445a;
        jVar.getClass();
        this.e = true;
        jVar.c();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f305445a.f(this, th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.f305448g != 0) {
            this.f305445a.c();
            return;
        }
        qfm.j jVar = this.f305445a;
        jVar.getClass();
        if (this.d.offer(obj2)) {
            jVar.c();
        } else {
            g.b(this);
            jVar.f(this, new MissingBackpressureException());
        }
    }
}
