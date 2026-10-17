package rgm;

import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class p extends AtomicInteger implements fgm.l, Disposable {
    public static final o i = new o(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f254269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.o f254270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254271c;
    public final ygm.c d = new ygm.c();
    public final AtomicReference e = new AtomicReference();
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f254272g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f254273h;

    public p(fgm.l lVar, igm.o oVar, boolean z) {
        this.f254269a = lVar;
        this.f254270b = oVar;
        this.f254271c = z;
    }

    public final void a() {
        AtomicReference atomicReference = this.e;
        o oVar = i;
        o oVar2 = (o) atomicReference.getAndSet(oVar);
        if (oVar2 == null || oVar2 == oVar) {
            return;
        }
        jgm.b.a(oVar2);
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f254269a;
        ygm.c cVar = this.d;
        AtomicReference atomicReference = this.e;
        int iAddAndGet = 1;
        while (!this.f254273h) {
            if (cVar.get() != null && !this.f254271c) {
                cVar.e(lVar);
                return;
            }
            boolean z = this.f254272g;
            o oVar = (o) atomicReference.get();
            boolean z3 = oVar == null;
            if (z && z3) {
                cVar.e(lVar);
                return;
            }
            if (z3 || oVar.f254268b == null) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                while (!atomicReference.compareAndSet(oVar, null) && atomicReference.get() == oVar) {
                }
                lVar.onNext(oVar.f254268b);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f254273h = true;
        this.f.dispose();
        a();
        this.d.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f254273h;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f254272g = true;
        b();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.d.a(th10)) {
            if (!this.f254271c) {
                a();
            }
            this.f254272g = true;
            b();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        o oVar = i;
        AtomicReference atomicReference = this.e;
        o oVar2 = (o) atomicReference.get();
        if (oVar2 != null) {
            jgm.b.a(oVar2);
        }
        try {
            Object objApply = this.f254270b.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
            SingleSource singleSource = (SingleSource) objApply;
            o oVar3 = new o(this);
            while (true) {
                o oVar4 = (o) atomicReference.get();
                if (oVar4 == oVar) {
                    return;
                }
                while (!atomicReference.compareAndSet(oVar4, oVar3)) {
                    if (atomicReference.get() != oVar4) {
                        break;
                    }
                }
                singleSource.c(oVar3);
                return;
            }
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.dispose();
            atomicReference.getAndSet(oVar);
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f254269a.onSubscribe(this);
        }
    }
}
