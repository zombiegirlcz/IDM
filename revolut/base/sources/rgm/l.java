package rgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends AtomicReference implements fgm.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f254257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f254258b;

    public l(m mVar) {
        this.f254257a = mVar;
    }

    @Override // fgm.e
    public final void onComplete() {
        m mVar = this.f254257a;
        AtomicReference atomicReference = mVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        mVar.b();
    }

    @Override // fgm.e
    public final void onError(Throwable th10) {
        m mVar = this.f254257a;
        AtomicReference atomicReference = mVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                jb3.l.v(th10);
                return;
            }
        }
        if (mVar.d.a(th10)) {
            if (!mVar.f254261c) {
                mVar.f.dispose();
                mVar.a();
            }
            mVar.b();
        }
    }

    @Override // fgm.e
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }

    @Override // fgm.e, fgm.p
    public final void onSuccess(Object obj2) {
        this.f254258b = obj2;
        this.f254257a.b();
    }
}
