package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class t extends AtomicInteger implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f263160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.q f263161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ObservableSource f263162c;
    public final igm.o d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f263164h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f263165j;
    public long k;
    public final bhm.i i = new bhm.i(Observable.bufferSize());
    public final CompositeDisposable e = new CompositeDisposable();
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedHashMap f263166l = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ygm.c f263163g = new ygm.c();

    public t(fgm.l lVar, ObservableSource observableSource, igm.o oVar, igm.q qVar) {
        this.f263160a = lVar;
        this.f263161b = qVar;
        this.f263162c = observableSource;
        this.d = oVar;
    }

    public final void a(u uVar, long j2) {
        boolean z;
        this.e.b(uVar);
        if (this.e.f() == 0) {
            jgm.b.a(this.f);
            z = true;
        } else {
            z = false;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f263166l;
                if (linkedHashMap == null) {
                    return;
                }
                this.i.offer(linkedHashMap.remove(Long.valueOf(j2)));
                if (z) {
                    this.f263164h = true;
                }
                b();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void b() {
        if (getAndIncrement() != 0) {
            return;
        }
        fgm.l lVar = this.f263160a;
        bhm.i iVar = this.i;
        int iAddAndGet = 1;
        while (!this.f263165j) {
            boolean z = this.f263164h;
            if (z && this.f263163g.get() != null) {
                iVar.clear();
                this.f263163g.e(lVar);
                return;
            }
            Collection collection = (Collection) iVar.poll();
            boolean z3 = collection == null;
            if (z && z3) {
                lVar.onComplete();
                return;
            } else if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                lVar.onNext(collection);
            }
        }
        iVar.clear();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (jgm.b.a(this.f)) {
            this.f263165j = true;
            this.e.dispose();
            synchronized (this) {
                this.f263166l = null;
            }
            if (getAndIncrement() != 0) {
                this.i.clear();
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return jgm.b.b((Disposable) this.f.get());
    }

    @Override // fgm.l
    public final void onComplete() {
        this.e.dispose();
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f263166l;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it8 = linkedHashMap.values().iterator();
                while (it8.hasNext()) {
                    this.i.offer((Collection) it8.next());
                }
                this.f263166l = null;
                this.f263164h = true;
                b();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f263163g.a(th10)) {
            this.e.dispose();
            synchronized (this) {
                this.f263166l = null;
            }
            this.f263164h = true;
            b();
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f263166l;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it8 = linkedHashMap.values().iterator();
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
        if (jgm.b.e(this.f, disposable)) {
            s sVar = new s(this);
            this.e.a(sVar);
            this.f263162c.subscribe(sVar);
        }
    }
}
