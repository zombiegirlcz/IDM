package zhm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f322468a;

    public e(c cVar) {
        this.f322468a = cVar;
    }

    @Override // zhm.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return this.f322468a.containsKey(obj2);
    }

    @Override // zhm.a
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f322468a.size();
    }

    @Override // zhm.k, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new d(this.f322468a.entrySet().iterator(), 0);
    }
}
