package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f322470a;

    public f(c cVar) {
        this.f322470a = cVar;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return this.f322470a.containsValue(obj2);
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f322470a.size();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(this.f322470a.entrySet().iterator(), 1);
    }
}
