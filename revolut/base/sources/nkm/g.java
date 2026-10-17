package nkm;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements Iterator, pim.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f216839b;
    public Object d;
    public final /* synthetic */ Sequence e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216838a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f216840c = -1;

    public g(h hVar) {
        this.e = hVar;
        this.f216839b = hVar.f216841a.iterator();
    }

    public void a() {
        Object next;
        h hVar = (h) this.e;
        do {
            Iterator it8 = this.f216839b;
            if (!it8.hasNext()) {
                this.f216840c = 0;
                return;
            }
            next = it8.next();
        } while (((Boolean) hVar.f216843c.invoke(next)).booleanValue() != hVar.f216842b);
        this.d = next;
        this.f216840c = 1;
    }

    public void b() {
        Iterator it8 = this.f216839b;
        if (it8.hasNext()) {
            Object next = it8.next();
            if (((Boolean) ((l) this.e).f216854b.invoke(next)).booleanValue()) {
                this.f216840c = 1;
                this.d = next;
                return;
            }
        }
        this.f216840c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f216838a) {
            case 0:
                if (this.f216840c == -1) {
                    a();
                }
                if (this.f216840c == 1) {
                }
                break;
            default:
                if (this.f216840c == -1) {
                    b();
                }
                if (this.f216840c == 1) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f216838a) {
            case 0:
                if (this.f216840c == -1) {
                    a();
                }
                if (this.f216840c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.d;
                this.d = null;
                this.f216840c = -1;
                return obj2;
            default:
                if (this.f216840c == -1) {
                    b();
                }
                if (this.f216840c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.d;
                this.d = null;
                this.f216840c = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f216838a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(l lVar) {
        this.e = lVar;
        this.f216839b = ((Sequence) lVar.f216855c).iterator();
    }
}
