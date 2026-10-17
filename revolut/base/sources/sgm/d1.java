package sgm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class d1 extends ahm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f262760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f262761c;
    public final Object d;
    public boolean e;
    public final AtomicBoolean f = new AtomicBoolean();

    public d1(e1 e1Var, long j2, Object obj2) {
        this.f262760b = e1Var;
        this.f262761c = j2;
        this.d = obj2;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            e1 e1Var = this.f262760b;
            long j2 = this.f262761c;
            Object obj2 = this.d;
            if (j2 == e1Var.e) {
                e1Var.f262791a.onNext(obj2);
            }
        }
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
        } else {
            this.e = true;
            this.f262760b.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        this.e = true;
        dispose();
        a();
    }
}
