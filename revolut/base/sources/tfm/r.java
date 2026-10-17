package tfm;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends AtomicInteger implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Callable f270759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.w f270760c;
    public final kfm.o d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f270762h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f270763j;
    public long k;
    public final vfm.c i = new vfm.c(efm.r.bufferSize());
    public final ifm.b e = new ifm.b();
    public final AtomicReference f = new AtomicReference();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinkedHashMap f270764l = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zfm.c f270761g = new zfm.c();

    public r(efm.y yVar, efm.w wVar, kfm.o oVar, Callable callable) {
        this.f270758a = yVar;
        this.f270759b = callable;
        this.f270760c = wVar;
        this.d = oVar;
    }

    public final void a(s sVar, long j2) {
        boolean z;
        this.e.b(sVar);
        if (this.e.f() == 0) {
            lfm.d.a(this.f);
            z = true;
        } else {
            z = false;
        }
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f270764l;
                if (linkedHashMap == null) {
                    return;
                }
                this.i.offer(linkedHashMap.remove(Long.valueOf(j2)));
                if (z) {
                    this.f270762h = true;
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
        efm.y yVar = this.f270758a;
        vfm.c cVar = this.i;
        int iAddAndGet = 1;
        while (!this.f270763j) {
            boolean z = this.f270762h;
            if (z && this.f270761g.get() != null) {
                cVar.clear();
                zfm.c cVar2 = this.f270761g;
                cVar2.getClass();
                yVar.onError(zfm.h.b(cVar2));
                return;
            }
            Collection collection = (Collection) cVar.poll();
            boolean z3 = collection == null;
            if (z && z3) {
                yVar.onComplete();
                return;
            } else if (z3) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                yVar.onNext(collection);
            }
        }
        cVar.clear();
    }

    @Override // ifm.c
    public final void dispose() {
        if (lfm.d.a(this.f)) {
            this.f270763j = true;
            this.e.dispose();
            synchronized (this) {
                this.f270764l = null;
            }
            if (getAndIncrement() != 0) {
                this.i.clear();
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return lfm.d.b((ifm.c) this.f.get());
    }

    @Override // efm.y
    public final void onComplete() {
        this.e.dispose();
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f270764l;
                if (linkedHashMap == null) {
                    return;
                }
                Iterator it8 = linkedHashMap.values().iterator();
                while (it8.hasNext()) {
                    this.i.offer((Collection) it8.next());
                }
                this.f270764l = null;
                this.f270762h = true;
                b();
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f270761g;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        this.e.dispose();
        synchronized (this) {
            this.f270764l = null;
        }
        this.f270762h = true;
        b();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = this.f270764l;
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

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.e(this.f, cVar)) {
            q qVar = new q(this);
            this.e.a(qVar);
            this.f270760c.subscribe(qVar);
        }
    }
}
