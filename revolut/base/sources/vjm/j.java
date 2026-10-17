package vjm;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f289840a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f289841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f289842c;
    public final /* synthetic */ e d;

    public j(e eVar) {
        this.d = eVar;
    }

    public final Iterator a() {
        if (this.f289842c == null) {
            this.f289842c = this.d.f289834c.entrySet().iterator();
        }
        return this.f289842c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f289840a + 1 < this.d.f289833b.size() || a().hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f289841b = true;
        int i = this.f289840a + 1;
        this.f289840a = i;
        e eVar = this.d;
        return i < eVar.f289833b.size() ? (Map.Entry) eVar.f289833b.get(this.f289840a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f289841b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f289841b = false;
        int i = e.f;
        e eVar = this.d;
        eVar.b();
        if (this.f289840a >= eVar.f289833b.size()) {
            a().remove();
            return;
        }
        int i2 = this.f289840a;
        this.f289840a = i2 - 1;
        eVar.f(i2);
    }
}
