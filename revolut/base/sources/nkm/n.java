package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes13.dex */
public final class n extends o implements Iterator, Continuation, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f216858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f216859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f216860c;
    public Continuation d;

    @Override // nkm.o
    public final fim.a b(Object obj2, Continuation continuation) {
        this.f216859b = obj2;
        this.f216858a = 3;
        this.d = continuation;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        nim.a.C(continuation);
        return aVar;
    }

    @Override // nkm.o
    public final Object c(Iterator it8, Continuation frame) {
        if (!it8.hasNext()) {
            return Unit.f186387a;
        }
        this.f216860c = it8;
        this.f216858a = 2;
        this.d = frame;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException f() {
        int i = this.f216858a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f216858a);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f186406a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.f216858a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator it8 = this.f216860c;
                Intrinsics.h(it8);
                if (it8.hasNext()) {
                    this.f216858a = 2;
                    return true;
                }
                this.f216860c = null;
            }
            this.f216858a = 5;
            Continuation continuation = this.d;
            Intrinsics.h(continuation);
            this.d = null;
            Unit unit = Unit.f186387a;
            m.Companion aVar = yhm.m.INSTANCE;
            continuation.resumeWith(unit);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f216858a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f216858a = 1;
            Iterator it8 = this.f216860c;
            Intrinsics.h(it8);
            return it8.next();
        }
        if (i != 3) {
            throw f();
        }
        this.f216858a = 0;
        Object obj2 = this.f216859b;
        this.f216859b = null;
        return obj2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj2) {
        yhm.o.b(obj2);
        this.f216858a = 4;
    }
}
