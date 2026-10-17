package tfm;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends bgm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f270331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f270332c;
    public final Object d;
    public boolean e;
    public final AtomicBoolean f = new AtomicBoolean();

    public a1(b1 b1Var, long j2, Object obj2) {
        this.f270331b = b1Var;
        this.f270332c = j2;
        this.d = obj2;
    }

    public final void a() {
        if (this.f.compareAndSet(false, true)) {
            b1 b1Var = this.f270331b;
            long j2 = this.f270332c;
            Object obj2 = this.d;
            if (j2 == b1Var.e) {
                b1Var.f270357a.onNext(obj2);
            }
        }
    }

    @Override // efm.y
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        if (this.e) {
            mo3.a.m(th10);
        } else {
            this.e = true;
            this.f270331b.onError(th10);
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        this.e = true;
        dispose();
        a();
    }
}
