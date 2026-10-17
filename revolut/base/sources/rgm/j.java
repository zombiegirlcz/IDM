package rgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements fgm.l, Disposable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f254249h = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.b f254250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f254251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254252c;
    public final ygm.c d = new ygm.c();
    public final AtomicReference e = new AtomicReference();
    public volatile boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Disposable f254253g;

    public j(fgm.b bVar, igm.o oVar, boolean z) {
        this.f254250a = bVar;
        this.f254251b = oVar;
        this.f254252c = z;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        i iVar = f254249h;
        i iVar2 = (i) atomicReference.getAndSet(iVar);
        if (iVar2 == null || iVar2 == iVar) {
            return;
        }
        jgm.b.a(iVar2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f254253g.dispose();
        a();
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.get() == f254249h;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f = true;
        if (this.e.get() == null) {
            this.d.d(this.f254250a);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        ygm.c cVar = this.d;
        if (cVar.a(th10)) {
            if (this.f254252c) {
                onComplete();
            } else {
                a();
                cVar.d(this.f254250a);
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f254251b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            CompletableSource completableSource = (CompletableSource) objApply;
            i iVar = new i(this);
            while (true) {
                AtomicReference atomicReference = this.e;
                i iVar2 = (i) atomicReference.get();
                if (iVar2 == f254249h) {
                    return;
                }
                while (!atomicReference.compareAndSet(iVar2, iVar)) {
                    if (atomicReference.get() != iVar2) {
                        break;
                    }
                }
                if (iVar2 != null) {
                    jgm.b.a(iVar2);
                }
                completableSource.c(iVar);
                return;
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f254253g.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f254253g, disposable)) {
            this.f254253g = disposable;
            this.f254250a.onSubscribe(this);
        }
    }
}
