package ggm;

import ce9.m;
import igm.f;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends AtomicReference implements Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143810a;

    public /* synthetic */ b() {
        this.f143810a = 2;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        Object andSet;
        f fVar;
        switch (this.f143810a) {
            case 0:
                if (get() != null && (andSet = getAndSet(null)) != null) {
                    ((Runnable) andSet).run();
                    break;
                }
                break;
            case 1:
                if (get() != null && (fVar = (f) getAndSet(null)) != null) {
                    try {
                        fVar.cancel();
                    } catch (Throwable th10) {
                        m.F(th10);
                        l.v(th10);
                        return;
                    }
                    break;
                }
                break;
            default:
                jgm.b.a(this);
                break;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f143810a) {
            case 0:
                return get() == null;
            case 1:
                return get() == null;
            default:
                return jgm.b.b((Disposable) get());
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.f143810a) {
            case 0:
                return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + ")";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, int i) {
        super(obj2);
        this.f143810a = i;
    }
}
