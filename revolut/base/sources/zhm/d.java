package zhm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Iterator, pim.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Iterator f322467b;

    public /* synthetic */ d(Iterator it8, int i) {
        this.f322466a = i;
        this.f322467b = it8;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f322466a) {
        }
        return this.f322467b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f322466a) {
            case 0:
                return ((Map.Entry) this.f322467b.next()).getKey();
            default:
                return ((Map.Entry) this.f322467b.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f322466a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
