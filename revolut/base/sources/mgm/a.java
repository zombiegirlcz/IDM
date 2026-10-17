package mgm;

import ce9.m;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends ngm.h implements fgm.l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BiConsumer f205306c;
    public final Function d;
    public Disposable e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f205307g;

    public a(fgm.l lVar, Object obj2, BiConsumer biConsumer, Function function) {
        super(lVar);
        this.f205307g = obj2;
        this.f205306c = biConsumer;
        this.d = function;
    }

    @Override // ngm.h, io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        super.dispose();
        this.e.dispose();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.e = jgm.b.DISPOSED;
        Object obj2 = this.f205307g;
        this.f205307g = null;
        try {
            Object objApply = this.d.apply(obj2);
            Objects.requireNonNull(objApply, "The finisher returned a null value");
            a(objApply);
        } catch (Throwable th10) {
            m.F(th10);
            this.f215244a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f) {
            jb3.l.v(th10);
            return;
        }
        this.f = true;
        this.e = jgm.b.DISPOSED;
        this.f205307g = null;
        this.f215244a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.f) {
            return;
        }
        try {
            this.f205306c.accept(this.f205307g, obj2);
        } catch (Throwable th10) {
            m.F(th10);
            this.e.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f215244a.onSubscribe(this);
        }
    }
}
