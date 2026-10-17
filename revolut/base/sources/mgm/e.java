package mgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.NoSuchElementException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends CompletableFuture implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f205317a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f205318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f205319c;
    public final boolean d;
    public final Object e;

    public e(boolean z, Object obj2, int i) {
        this.f205319c = i;
        this.d = z;
        this.e = obj2;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        jgm.b.a(this.f205317a);
        return super.cancel(z);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean complete(Object obj2) {
        jgm.b.a(this.f205317a);
        return super.complete(obj2);
    }

    @Override // java.util.concurrent.CompletableFuture
    public final boolean completeExceptionally(Throwable th10) {
        jgm.b.a(this.f205317a);
        return super.completeExceptionally(th10);
    }

    @Override // fgm.l
    public final void onComplete() {
        switch (this.f205319c) {
            case 0:
                if (!isDone()) {
                    this.f205318b = null;
                    this.f205317a.lazySet(jgm.b.DISPOSED);
                    if (!this.d) {
                        completeExceptionally(new NoSuchElementException());
                    } else {
                        complete(this.e);
                    }
                }
                break;
            case 1:
                if (!isDone()) {
                    Object obj2 = this.f205318b;
                    this.f205318b = null;
                    this.f205317a.lazySet(jgm.b.DISPOSED);
                    if (obj2 != null) {
                        complete(obj2);
                    } else if (!this.d) {
                        completeExceptionally(new NoSuchElementException());
                    } else {
                        complete(this.e);
                    }
                }
                break;
            default:
                if (!isDone()) {
                    Object obj3 = this.f205318b;
                    this.f205318b = null;
                    this.f205317a.lazySet(jgm.b.DISPOSED);
                    if (obj3 != null) {
                        complete(obj3);
                    } else if (!this.d) {
                        completeExceptionally(new NoSuchElementException());
                    } else {
                        complete(this.e);
                    }
                }
                break;
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f205318b = null;
        this.f205317a.lazySet(jgm.b.DISPOSED);
        if (completeExceptionally(th10)) {
            return;
        }
        jb3.l.v(th10);
    }

    @Override // fgm.l
    public void onNext(Object obj2) {
        switch (this.f205319c) {
            case 1:
                this.f205318b = obj2;
                break;
            case 2:
                if (this.f205318b == null) {
                    this.f205318b = obj2;
                } else {
                    this.f205318b = null;
                    completeExceptionally(new IllegalArgumentException("Sequence contains more than one element!"));
                }
                break;
            default:
                complete(obj2);
                break;
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this.f205317a, disposable);
    }
}
