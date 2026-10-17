package oem;

import java.util.Iterator;

/* JADX INFO: loaded from: classes23.dex */
public final class g implements Iterator, pim.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f224661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f224662b;

    public g(h hVar) {
        this.f224662b = hVar;
        this.f224661a = hVar.f224663a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f224661a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f224662b.f224664b.invoke(this.f224661a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f224661a.remove();
    }
}
