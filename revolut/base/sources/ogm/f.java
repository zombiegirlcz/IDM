package ogm;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends AtomicInteger implements fgm.b, Disposable, fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f225216c;
    public Disposable d;

    public /* synthetic */ f(Object obj2, igm.a aVar, int i) {
        this.f225214a = i;
        this.f225215b = obj2;
        this.f225216c = aVar;
    }

    public void a() {
        switch (this.f225214a) {
            case 0:
                if (compareAndSet(0, 1)) {
                    try {
                        ((com.onfido.android.sdk.capture.component.active.video.capture.data.repository.b) this.f225216c).run();
                    } catch (Throwable th10) {
                        ce9.m.F(th10);
                        jb3.l.v(th10);
                        return;
                    }
                }
                break;
            default:
                if (compareAndSet(0, 1)) {
                    try {
                        ((igm.a) this.f225216c).run();
                    } catch (Throwable th11) {
                        ce9.m.F(th11);
                        jb3.l.v(th11);
                    }
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        switch (this.f225214a) {
            case 0:
                this.d.dispose();
                a();
                break;
            case 1:
                ((CompositeDisposable) this.d).dispose();
                ((AtomicBoolean) this.f225216c).set(true);
                break;
            default:
                this.d.dispose();
                a();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f225214a) {
            case 0:
                return this.d.isDisposed();
            case 1:
                return ((CompositeDisposable) this.d).f163117b;
            default:
                return this.d.isDisposed();
        }
    }

    @Override // fgm.b
    public void onComplete() {
        switch (this.f225214a) {
            case 0:
                ((fgm.b) this.f225215b).onComplete();
                a();
                break;
            default:
                if (decrementAndGet() == 0) {
                    ((fgm.b) this.f225215b).onComplete();
                }
                break;
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        switch (this.f225214a) {
            case 0:
                ((fgm.b) this.f225215b).onError(th10);
                a();
                break;
            case 1:
                ((CompositeDisposable) this.d).dispose();
                if (!((AtomicBoolean) this.f225216c).compareAndSet(false, true)) {
                    jb3.l.v(th10);
                } else {
                    ((fgm.b) this.f225215b).onError(th10);
                }
                break;
            default:
                ((fgm.p) this.f225215b).onError(th10);
                a();
                break;
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        switch (this.f225214a) {
            case 0:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.b) this.f225215b).onSubscribe(this);
                }
                break;
            case 1:
                ((CompositeDisposable) this.d).a(disposable);
                break;
            default:
                if (jgm.b.f(this.d, disposable)) {
                    this.d = disposable;
                    ((fgm.p) this.f225215b).onSubscribe(this);
                }
                break;
        }
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((fgm.p) this.f225215b).onSuccess(obj2);
        a();
    }

    public f(fgm.b bVar, AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, int i) {
        this.f225214a = 1;
        this.f225215b = bVar;
        this.f225216c = atomicBoolean;
        this.d = compositeDisposable;
        lazySet(i);
    }
}
