package rgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends AtomicReference implements fgm.d, fgm.b, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f254227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Publisher f254228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f254229c;
    public final AtomicLong d = new AtomicLong();

    public b(dom.a aVar, Publisher publisher) {
        this.f254227a = aVar;
        this.f254228b = publisher;
    }

    @Override // dom.b
    public final void a(long j2) {
        xgm.f.c(this, this.d, j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f254229c.dispose();
        xgm.f.b(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        xgm.f.d(this, this.d, bVar);
    }

    @Override // dom.a
    public final void onComplete() {
        Publisher publisher = this.f254228b;
        if (publisher == null) {
            this.f254227a.onComplete();
        } else {
            this.f254228b = null;
            publisher.a(this);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f254227a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f254227a.onNext(obj2);
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f254229c, disposable)) {
            this.f254229c = disposable;
            this.f254227a.e(this);
        }
    }
}
