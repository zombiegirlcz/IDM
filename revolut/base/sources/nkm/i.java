package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f216844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f216845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f216846c;
    public final /* synthetic */ j d;

    public i(j jVar) {
        this.d = jVar;
        this.f216844a = jVar.f216847a.iterator();
    }

    public final boolean a() {
        Iterator it8;
        Iterator it9 = this.f216845b;
        if (it9 != null && it9.hasNext()) {
            this.f216846c = 1;
            return true;
        }
        do {
            Iterator it10 = this.f216844a;
            if (!it10.hasNext()) {
                this.f216846c = 2;
                this.f216845b = null;
                return false;
            }
            Object next = it10.next();
            j jVar = this.d;
            it8 = (Iterator) jVar.f216849c.invoke(jVar.f216848b.invoke(next));
        } while (!it8.hasNext());
        this.f216845b = it8;
        this.f216846c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f216846c;
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f216846c;
        if (i == 2) {
            throw new NoSuchElementException();
        }
        if (i == 0 && !a()) {
            throw new NoSuchElementException();
        }
        this.f216846c = 0;
        Iterator it8 = this.f216845b;
        Intrinsics.h(it8);
        return it8.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
