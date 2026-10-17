package qfm;

import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class l2 extends AtomicReference implements efm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2 f245468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f245469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f245470c;
    public volatile nfm.j d;
    public volatile boolean e;
    public int f;

    public l2(m2 m2Var, long j2, int i) {
        this.f245468a = m2Var;
        this.f245469b = j2;
        this.f245470c = i;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.e(this, bVar)) {
            if (bVar instanceof nfm.g) {
                nfm.g gVar = (nfm.g) bVar;
                int iB = gVar.b(7);
                if (iB == 1) {
                    this.f = iB;
                    this.d = gVar;
                    this.e = true;
                    this.f245468a.c();
                    return;
                }
                if (iB == 2) {
                    this.f = iB;
                    this.d = gVar;
                    bVar.a(this.f245470c);
                    return;
                }
            }
            this.d = new vfm.b(this.f245470c);
            bVar.a(this.f245470c);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        m2 m2Var = this.f245468a;
        if (this.f245469b == m2Var.f245481j) {
            this.e = true;
            m2Var.c();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        m2 m2Var = this.f245468a;
        if (this.f245469b == m2Var.f245481j) {
            zfm.c cVar = m2Var.e;
            cVar.getClass();
            if (zfm.h.a(cVar, th10)) {
                m2Var.f245479g.cancel();
                m2Var.d = true;
                this.e = true;
                m2Var.c();
                return;
            }
        }
        mo3.a.m(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        m2 m2Var = this.f245468a;
        if (this.f245469b == m2Var.f245481j) {
            if (this.f != 0 || this.d.offer(obj2)) {
                m2Var.c();
            } else {
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }
    }
}
