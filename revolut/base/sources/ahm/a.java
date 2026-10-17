package ahm;

import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a implements l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5135a = new AtomicReference();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f5135a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f5135a.get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        do {
            atomicReference = this.f5135a;
            if (atomicReference.compareAndSet(null, disposable)) {
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
        if (atomicReference.get() != jgm.b.DISPOSED) {
            yh5.b.A(cls);
        }
    }
}
