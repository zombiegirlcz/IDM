package rgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class o extends AtomicReference implements fgm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f254267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f254268b;

    public o(p pVar) {
        this.f254267a = pVar;
    }

    @Override // fgm.p
    public final void onError(Throwable th10) {
        p pVar = this.f254267a;
        AtomicReference atomicReference = pVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                jb3.l.v(th10);
                return;
            }
        }
        if (pVar.d.a(th10)) {
            if (!pVar.f254271c) {
                pVar.f.dispose();
                pVar.a();
            }
            pVar.b();
        }
    }

    @Override // fgm.p
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }

    @Override // fgm.p
    public final void onSuccess(Object obj2) {
        this.f254268b = obj2;
        this.f254267a.b();
    }
}
