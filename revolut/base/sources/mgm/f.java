package mgm;

import ce9.m;
import igm.o;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f205320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f205321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f205322c;
    public volatile boolean d;
    public boolean e;

    public f(fgm.l lVar, o oVar) {
        this.f205320a = lVar;
        this.f205321b = oVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d = true;
        this.f205322c.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f205320a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.e) {
            jb3.l.v(th10);
        } else {
            this.e = true;
            this.f205320a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.e) {
            return;
        }
        try {
            Object objApply = this.f205321b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null Stream");
            Stream stream = (Stream) objApply;
            try {
                Iterator it8 = stream.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (this.d) {
                        this.e = true;
                        break;
                    }
                    Object next = it8.next();
                    Objects.requireNonNull(next, "The Stream's Iterator.next returned a null value");
                    if (this.d) {
                        this.e = true;
                        break;
                    }
                    this.f205320a.onNext(next);
                    if (this.d) {
                        this.e = true;
                        break;
                    }
                }
                stream.close();
            } finally {
            }
        } catch (Throwable th10) {
            m.F(th10);
            this.f205322c.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f205322c, disposable)) {
            this.f205322c = disposable;
            this.f205320a.onSubscribe(this);
        }
    }
}
