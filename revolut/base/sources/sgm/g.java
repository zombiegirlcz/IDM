package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Disposable f262837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f262838b;

    @Override // fgm.l
    public final void onComplete() {
        this.f262838b = ygm.l.COMPLETE;
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262838b = new ygm.j(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262838b = obj2;
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        Disposable disposable2 = this.f262837a;
        Objects.requireNonNull(disposable, "next is null");
        if (disposable2 == null) {
            this.f262837a = disposable;
            return;
        }
        disposable.dispose();
        if (disposable2 != jgm.b.DISPOSED) {
            yh5.b.A(g.class);
        }
    }
}
