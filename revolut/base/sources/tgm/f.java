package tgm;

import ce9.m;
import fgm.p;
import igm.o;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import sgm.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends AtomicReference implements p, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f271213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f271214c;

    public /* synthetic */ f(int i, p pVar, o oVar) {
        this.f271212a = i;
        this.f271213b = pVar;
        this.f271214c = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f271212a) {
            case 0:
                jgm.b.a(this);
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f271212a) {
        }
        return jgm.b.b((Disposable) get());
    }

    @Override // fgm.p
    public final void onError(Throwable th10) {
        switch (this.f271212a) {
            case 0:
                this.f271213b.onError(th10);
                break;
            default:
                p pVar = this.f271213b;
                try {
                    Object objApply = this.f271214c.apply(th10);
                    Objects.requireNonNull(objApply, "The nextFunction returned a null SingleSource.");
                    ((SingleSource) objApply).c(new k7i.i(this, pVar, 12));
                } catch (Throwable th11) {
                    m.F(th11);
                    pVar.onError(new CompositeException(th10, th11));
                }
                break;
        }
    }

    @Override // fgm.p
    public final void onSubscribe(Disposable disposable) {
        switch (this.f271212a) {
            case 0:
                if (jgm.b.e(this, disposable)) {
                    this.f271213b.onSubscribe(this);
                }
                break;
            default:
                if (jgm.b.e(this, disposable)) {
                    this.f271213b.onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.p
    public final void onSuccess(Object obj2) {
        switch (this.f271212a) {
            case 0:
                p pVar = this.f271213b;
                try {
                    Object objApply = this.f271214c.apply(obj2);
                    Objects.requireNonNull(objApply, "The single returned by the mapper is null");
                    SingleSource singleSource = (SingleSource) objApply;
                    if (!isDisposed()) {
                        singleSource.c(new e3(this, pVar, 4));
                    }
                } catch (Throwable th10) {
                    m.F(th10);
                    pVar.onError(th10);
                    return;
                }
                break;
            default:
                this.f271213b.onSuccess(obj2);
                break;
        }
    }
}
