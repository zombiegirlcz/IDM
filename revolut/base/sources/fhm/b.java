package fhm;

import fgm.l;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class b extends AtomicBoolean implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f135268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PublishSubject f135269b;

    public b(l lVar, PublishSubject publishSubject) {
        this.f135268a = lVar;
        this.f135269b = publishSubject;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f135269b.c(this);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get();
    }
}
