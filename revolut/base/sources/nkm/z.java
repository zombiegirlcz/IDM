package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes14.dex */
public final class z implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216868a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f216869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f216870c;
    public final /* synthetic */ Sequence d;

    public z(c cVar) {
        this.d = cVar;
        this.f216869b = cVar.f216828b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it8;
        switch (this.f216868a) {
            case 0:
                a0 a0Var = (a0) this.d;
                while (true) {
                    int i = this.f216870c;
                    int i2 = a0Var.f216821b;
                    it8 = this.f216869b;
                    if (i < i2 && it8.hasNext()) {
                        it8.next();
                        this.f216870c++;
                    }
                }
                return this.f216870c < a0Var.f216822c && it8.hasNext();
            default:
                return this.f216869b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it8;
        switch (this.f216868a) {
            case 0:
                a0 a0Var = (a0) this.d;
                while (true) {
                    int i = this.f216870c;
                    int i2 = a0Var.f216821b;
                    it8 = this.f216869b;
                    if (i < i2 && it8.hasNext()) {
                        it8.next();
                        this.f216870c++;
                    }
                }
                int i3 = this.f216870c;
                if (i3 >= a0Var.f216822c) {
                    throw new NoSuchElementException();
                }
                this.f216870c = i3 + 1;
                return it8.next();
            default:
                Function2 function2 = (Function2) ((c) this.d).f216829c;
                int i5 = this.f216870c;
                this.f216870c = i5 + 1;
                if (i5 >= 0) {
                    return function2.invoke(Integer.valueOf(i5), this.f216869b.next());
                }
                zhm.v.s();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f216868a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(a0 a0Var) {
        this.d = a0Var;
        this.f216869b = a0Var.f216820a.iterator();
    }
}
