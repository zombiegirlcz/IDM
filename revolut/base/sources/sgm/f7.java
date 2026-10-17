package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class f7 extends AtomicReference implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e7 f262834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f262836c;

    public f7(e7 e7Var, int i) {
        this.f262834a = e7Var;
        this.f262835b = i;
    }

    @Override // fgm.l
    public final void onComplete() {
        e7 e7Var = this.f262834a;
        int i = this.f262835b;
        if (this.f262836c) {
            e7Var.getClass();
            return;
        }
        e7Var.f262817g = true;
        e7Var.a(i);
        yoj.b.r(e7Var.f262814a, e7Var, e7Var.f);
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        e7 e7Var = this.f262834a;
        int i = this.f262835b;
        e7Var.f262817g = true;
        jgm.b.a(e7Var.e);
        e7Var.a(i);
        yoj.b.t(e7Var.f262814a, th10, e7Var, e7Var.f);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (!this.f262836c) {
            this.f262836c = true;
        }
        this.f262834a.d.set(this.f262835b, obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
