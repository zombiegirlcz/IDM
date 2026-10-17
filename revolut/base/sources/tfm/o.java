package tfm;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicBoolean implements efm.y, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f270686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f270687c;
    public final Callable d;
    public ifm.c e;
    public final ArrayDeque f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f270688g;

    public o(efm.y yVar, int i, int i2, Callable callable) {
        this.f270685a = yVar;
        this.f270686b = i;
        this.f270687c = i2;
        this.d = callable;
    }

    @Override // ifm.c
    public final void dispose() {
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        while (true) {
            ArrayDeque arrayDeque = this.f;
            boolean zIsEmpty = arrayDeque.isEmpty();
            efm.y yVar = this.f270685a;
            if (zIsEmpty) {
                yVar.onComplete();
                return;
            }
            yVar.onNext(arrayDeque.poll());
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f.clear();
        this.f270685a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        long j2 = this.f270688g;
        this.f270688g = 1 + j2;
        long j3 = j2 % ((long) this.f270687c);
        efm.y yVar = this.f270685a;
        ArrayDeque arrayDeque = this.f;
        if (j3 == 0) {
            try {
                Object objCall = this.d.call();
                mfm.f.b(objCall, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                arrayDeque.offer((Collection) objCall);
            } catch (Throwable th10) {
                arrayDeque.clear();
                this.e.dispose();
                yVar.onError(th10);
                return;
            }
        }
        Iterator it8 = arrayDeque.iterator();
        while (it8.hasNext()) {
            Collection collection = (Collection) it8.next();
            collection.add(obj2);
            if (this.f270686b <= collection.size()) {
                it8.remove();
                yVar.onNext(collection);
            }
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.e, cVar)) {
            this.e = cVar;
            this.f270685a.onSubscribe(this);
        }
    }
}
