package jgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes14.dex */
public final class a extends AtomicReferenceArray implements Disposable {
    public final boolean a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) get(i);
            if (disposable2 == b.DISPOSED) {
                disposable.dispose();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Disposable disposable;
        if (get(0) != b.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                Disposable disposable2 = (Disposable) get(i);
                b bVar = b.DISPOSED;
                if (disposable2 != bVar && (disposable = (Disposable) getAndSet(i, bVar)) != bVar && disposable != null) {
                    disposable.dispose();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get(0) == b.DISPOSED;
    }
}
