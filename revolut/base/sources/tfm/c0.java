package tfm;

import efm.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends ofm.q implements Runnable, ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Callable f270377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270378h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f270379j;
    public final c0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedList f270380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ifm.c f270381m;

    public c0(bgm.d dVar, Callable callable, long j2, long j3, TimeUnit timeUnit, c0.a aVar) {
        super(dVar, new ufm.g());
        this.f270377g = callable;
        this.f270378h = j2;
        this.i = j3;
        this.f270379j = timeUnit;
        this.k = aVar;
        this.f270380l = new LinkedList();
    }

    @Override // ofm.q
    public final void a(efm.y yVar, Object obj2) {
        yVar.onNext((Collection) obj2);
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.d) {
            return;
        }
        this.d = true;
        synchronized (this) {
            this.f270380l.clear();
        }
        this.f270381m.dispose();
        this.k.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }

    @Override // efm.y
    public final void onComplete() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f270380l);
            this.f270380l.clear();
        }
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            this.f224947c.offer((Collection) it8.next());
        }
        this.e = true;
        if (f()) {
            c6d.b.h(this.f224947c, this.f224946b, this.k, this);
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.e = true;
        synchronized (this) {
            this.f270380l.clear();
        }
        this.f224946b.onError(th10);
        this.k.dispose();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        synchronized (this) {
            try {
                Iterator it8 = this.f270380l.iterator();
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
        c0.a aVar = this.k;
        bgm.d dVar = this.f224946b;
        if (lfm.d.f(this.f270381m, cVar)) {
            this.f270381m = cVar;
            try {
                Object objCall = this.f270377g.call();
                mfm.f.b(objCall, "The buffer supplied is null");
                Collection collection = (Collection) objCall;
                this.f270380l.add(collection);
                dVar.onSubscribe(this);
                long j2 = this.i;
                this.k.c(this, j2, j2, this.f270379j);
                aVar.b(new b0(this, collection), this.f270378h, this.f270379j);
            } catch (Throwable th10) {
                m70.a.u(th10);
                cVar.dispose();
                lfm.e.d(th10, dVar);
                aVar.dispose();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            return;
        }
        try {
            Object objCall = this.f270377g.call();
            mfm.f.b(objCall, "The bufferSupplier returned a null buffer");
            Collection collection = (Collection) objCall;
            synchronized (this) {
                try {
                    if (this.d) {
                        return;
                    }
                    this.f270380l.add(collection);
                    this.k.b(new a0(this, collection), this.f270378h, this.f270379j);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            m70.a.u(th11);
            this.f224946b.onError(th11);
            dispose();
        }
    }
}
