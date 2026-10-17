package mgm;

import ce9.m;
import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f205311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiConsumer f205312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function f205313c;
    public Disposable d;
    public boolean e;
    public Object f;

    public c(p pVar, Object obj2, BiConsumer biConsumer, Function function) {
        this.f205311a = pVar;
        this.f = obj2;
        this.f205312b = biConsumer;
        this.f205313c = function;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d.dispose();
        this.d = jgm.b.DISPOSED;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        p pVar = this.f205311a;
        if (this.e) {
            return;
        }
        this.e = true;
        this.d = jgm.b.DISPOSED;
        Object obj2 = this.f;
        this.f = null;
        try {
            Object objApply = this.f205313c.apply(obj2);
            Objects.requireNonNull(objApply, "The finisher returned a null value");
            pVar.onSuccess(objApply);
        } catch (Throwable th10) {
            m.F(th10);
            pVar.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
            return;
        }
        this.e = true;
        this.d = jgm.b.DISPOSED;
        this.f = null;
        this.f205311a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        try {
            this.f205312b.accept(this.f, obj2);
        } catch (Throwable th10) {
            m.F(th10);
            this.d.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.d, disposable)) {
            this.d = disposable;
            this.f205311a.onSubscribe(this);
        }
    }
}
