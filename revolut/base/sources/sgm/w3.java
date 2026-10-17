package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class w3 extends AtomicReference implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263245a;

    public w3(fgm.l lVar, x3 x3Var) {
        this.f263245a = lVar;
        lazySet(x3Var);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        x3 x3Var = (x3) getAndSet(null);
        if (x3Var != null) {
            x3Var.a(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get() == null;
    }
}
