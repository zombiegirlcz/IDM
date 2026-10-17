package rgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class i extends AtomicReference implements fgm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f254248a;

    public i(j jVar) {
        this.f254248a = jVar;
    }

    @Override // fgm.b
    public final void onComplete() {
        j jVar = this.f254248a;
        AtomicReference atomicReference = jVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                return;
            }
        }
        if (jVar.f) {
            jVar.d.d(jVar.f254250a);
        }
    }

    @Override // fgm.b, efm.f0
    public final void onError(Throwable th10) {
        j jVar = this.f254248a;
        AtomicReference atomicReference = jVar.e;
        while (!atomicReference.compareAndSet(this, null)) {
            if (atomicReference.get() != this) {
                jb3.l.v(th10);
                return;
            }
        }
        if (jVar.d.a(th10)) {
            if (jVar.f254252c) {
                if (jVar.f) {
                    jVar.d.d(jVar.f254250a);
                }
            } else {
                jVar.f254253g.dispose();
                jVar.a();
                jVar.d.d(jVar.f254250a);
            }
        }
    }

    @Override // fgm.b
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }
}
