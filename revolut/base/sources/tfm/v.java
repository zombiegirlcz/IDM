package tfm;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends ofm.q implements ifm.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f270876g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Callable f270877h;
    public ifm.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Collection f270878j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f270879l;

    public v(bgm.d dVar, Callable callable, efm.w wVar) {
        super(dVar, new ufm.g());
        this.f270877h = callable;
        this.k = wVar;
    }

    @Override // ofm.q
    public final void a(efm.y yVar, Object obj2) {
        switch (this.f270876g) {
            case 0:
                this.f224946b.onNext((Collection) obj2);
                break;
            default:
                this.f224946b.onNext((Collection) obj2);
                break;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f270876g) {
            case 0:
                if (!this.d) {
                    this.d = true;
                    this.i.dispose();
                    lfm.d.a((AtomicReference) this.f270879l);
                    if (f()) {
                        this.f224947c.clear();
                    }
                }
                break;
            default:
                if (!this.d) {
                    this.d = true;
                    ((x) this.f270879l).dispose();
                    this.i.dispose();
                    if (f()) {
                        this.f224947c.clear();
                    }
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f270876g) {
        }
        return this.d;
    }

    public void j0() {
        try {
            Object objCall = this.f270877h.call();
            mfm.f.b(objCall, "The buffer supplied is null");
            Collection collection = (Collection) objCall;
            try {
                Object objCall2 = ((Callable) this.k).call();
                mfm.f.b(objCall2, "The boundary ObservableSource supplied is null");
                efm.w wVar = (efm.w) objCall2;
                u uVar = new u(this, 0);
                if (lfm.d.c((AtomicReference) this.f270879l, uVar)) {
                    synchronized (this) {
                        try {
                            Collection collection2 = this.f270878j;
                            if (collection2 == null) {
                                return;
                            }
                            this.f270878j = collection;
                            wVar.subscribe(uVar);
                            h(collection2, this);
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                }
            } catch (Throwable th11) {
                m70.a.u(th11);
                this.d = true;
                this.i.dispose();
                this.f224946b.onError(th11);
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            dispose();
            this.f224946b.onError(th12);
        }
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270876g) {
            case 0:
                synchronized (this) {
                    try {
                        Collection collection = this.f270878j;
                        if (collection == null) {
                            return;
                        }
                        this.f270878j = null;
                        this.f224947c.offer(collection);
                        this.e = true;
                        if (f()) {
                            c6d.b.h(this.f224947c, this.f224946b, this, this);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        Collection collection2 = this.f270878j;
                        if (collection2 == null) {
                            return;
                        }
                        this.f270878j = null;
                        this.f224947c.offer(collection2);
                        this.e = true;
                        if (f()) {
                            c6d.b.h(this.f224947c, this.f224946b, this, this);
                            return;
                        }
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270876g) {
            case 0:
                dispose();
                this.f224946b.onError(th10);
                break;
            default:
                dispose();
                this.f224946b.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270876g) {
            case 0:
                synchronized (this) {
                    try {
                        Collection collection = this.f270878j;
                        if (collection == null) {
                            return;
                        }
                        collection.add(obj2);
                        return;
                    } finally {
                    }
                }
            default:
                synchronized (this) {
                    try {
                        Collection collection2 = this.f270878j;
                        if (collection2 == null) {
                            return;
                        }
                        collection2.add(obj2);
                        return;
                    } finally {
                    }
                }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        switch (this.f270876g) {
            case 0:
                if (lfm.d.f(this.i, cVar)) {
                    this.i = cVar;
                    bgm.d dVar = this.f224946b;
                    try {
                        Object objCall = this.f270877h.call();
                        mfm.f.b(objCall, "The buffer supplied is null");
                        this.f270878j = (Collection) objCall;
                        try {
                            Object objCall2 = ((Callable) this.k).call();
                            mfm.f.b(objCall2, "The boundary ObservableSource supplied is null");
                            efm.w wVar = (efm.w) objCall2;
                            u uVar = new u(this, 0);
                            ((AtomicReference) this.f270879l).set(uVar);
                            dVar.onSubscribe(this);
                            if (!this.d) {
                                wVar.subscribe(uVar);
                            }
                        } catch (Throwable th10) {
                            m70.a.u(th10);
                            this.d = true;
                            cVar.dispose();
                            lfm.e.d(th10, dVar);
                            return;
                        }
                    } catch (Throwable th11) {
                        m70.a.u(th11);
                        this.d = true;
                        cVar.dispose();
                        lfm.e.d(th11, dVar);
                        return;
                    }
                }
                break;
            default:
                if (lfm.d.f(this.i, cVar)) {
                    this.i = cVar;
                    try {
                        Object objCall3 = this.f270877h.call();
                        mfm.f.b(objCall3, "The buffer supplied is null");
                        this.f270878j = (Collection) objCall3;
                        x xVar = new x(this, 0);
                        this.f270879l = xVar;
                        this.f224946b.onSubscribe(this);
                        if (!this.d) {
                            ((efm.w) this.k).subscribe(xVar);
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        this.d = true;
                        cVar.dispose();
                        lfm.e.d(th12, this.f224946b);
                    }
                }
                break;
        }
    }

    public v(bgm.d dVar, Callable callable, Callable callable2) {
        super(dVar, new ufm.g());
        this.f270879l = new AtomicReference();
        this.f270877h = callable;
        this.k = callable2;
    }
}
