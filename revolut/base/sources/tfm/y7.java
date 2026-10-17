package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class y7 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x7 f270976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f270978c;

    public y7(x7 x7Var, int i) {
        this.f270976a = x7Var;
        this.f270977b = i;
    }

    @Override // efm.y
    public final void onComplete() {
        x7 x7Var = this.f270976a;
        int i = this.f270977b;
        if (this.f270978c) {
            x7Var.getClass();
            return;
        }
        x7Var.f270947g = true;
        x7Var.a(i);
        jh.d.o(x7Var.f270944a, x7Var, x7Var.f);
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        x7 x7Var = this.f270976a;
        int i = this.f270977b;
        x7Var.f270947g = true;
        lfm.d.a(x7Var.e);
        x7Var.a(i);
        jh.d.p(x7Var.f270944a, th10, x7Var, x7Var.f);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        if (!this.f270978c) {
            this.f270978c = true;
        }
        this.f270976a.d.set(this.f270977b, obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
