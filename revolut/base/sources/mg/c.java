package mg;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends kg.l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f205054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.gson.internal.r f205055b;

    public c(t tVar, com.google.gson.internal.r rVar) {
        this.f205054a = tVar;
        this.f205055b = rVar;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) throws IOException {
        if (aVar.A() == qg.b.NULL) {
            aVar.w();
            return null;
        }
        Collection collection = (Collection) this.f205055b.construct();
        aVar.d();
        while (aVar.n()) {
            collection.add(this.f205054a.f205124c.c(aVar));
        }
        aVar.i();
        return collection;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        Collection collection = (Collection) obj2;
        if (collection == null) {
            cVar.m();
            return;
        }
        cVar.f();
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            this.f205054a.d(cVar, it8.next());
        }
        cVar.i();
    }
}
