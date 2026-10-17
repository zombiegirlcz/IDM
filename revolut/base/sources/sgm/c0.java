package sgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 extends ngm.n implements Runnable, Disposable {
    public final igm.q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f262730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f262731h;
    public final TimeUnit i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final fgm.o f262732j;
    public final LinkedList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Disposable f262733l;

    public c0(ahm.c cVar, igm.q qVar, long j2, long j3, TimeUnit timeUnit, fgm.o oVar) {
        super(cVar, new su9.c());
        this.f = qVar;
        this.f262730g = j2;
        this.f262731h = j3;
        this.i = timeUnit;
        this.f262732j = oVar;
        this.k = new LinkedList();
    }

    @Override // ngm.n
    public final void b(fgm.l lVar, Object obj2) {
        lVar.onNext((Collection) obj2);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        synchronized (this) {
            this.k.clear();
        }
        this.f262733l.dispose();
        this.f262732j.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // fgm.l
    public final void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.k);
            this.k.clear();
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            this.f215263c.offer((Collection) it8.next());
        }
        this.e = true;
        if (j()) {
            z92.f.f(this.f215263c, this.f215262b, this.f262732j, this);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.e = true;
        synchronized (this) {
            this.k.clear();
        }
        this.f215262b.onError(th10);
        this.f262732j.dispose();
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                Iterator it8 = this.k.iterator();
                while (it8.hasNext()) {
                    ((Collection) it8.next()).add(obj2);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        fgm.o oVar = this.f262732j;
        ahm.c cVar = this.f215262b;
        if (jgm.b.f(this.f262733l, disposable)) {
            this.f262733l = disposable;
            try {
                Object obj2 = this.f.get();
                Objects.requireNonNull(obj2, "The buffer supplied is null");
                Collection collection = (Collection) obj2;
                this.k.add(collection);
                cVar.onSubscribe(this);
                long j2 = this.f262731h;
                this.f262732j.c(this, j2, j2, this.i);
                oVar.a(new b0(this, collection, 1), this.f262730g, this.i);
            } catch (Throwable th10) {
                ce9.m.F(th10);
                disposable.dispose();
                jgm.c.c(th10, cVar);
                oVar.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            return;
        }
        try {
            Object obj2 = this.f.get();
            Objects.requireNonNull(obj2, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) obj2;
            synchronized (this) {
                try {
                    if (this.d) {
                        return;
                    }
                    this.k.add(collection);
                    this.f262732j.a(new b0(this, collection, 0), this.f262730g, this.i);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            this.f215262b.onError(th11);
            dispose();
        }
    }
}
