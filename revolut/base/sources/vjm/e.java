package vjm;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends AbstractMap {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f289832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f289833b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f289834c = Collections.EMPTY_MAP;
    public boolean d;
    public volatile k e;

    public e(int i) {
        this.f289832a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f289833b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L21
            java.util.List r2 = r4.f289833b
            java.lang.Object r2 = r2.get(r1)
            vjm.i r2 = (vjm.i) r2
            java.lang.Comparable r2 = r2.f289837a
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1e
            int r0 = r0 + 1
        L1c:
            int r5 = -r0
            return r5
        L1e:
            if (r2 != 0) goto L21
            return r1
        L21:
            r0 = 0
        L22:
            if (r0 > r1) goto L43
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f289833b
            java.lang.Object r3 = r3.get(r2)
            vjm.i r3 = (vjm.i) r3
            java.lang.Comparable r3 = r3.f289837a
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r1 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r0 = r2
            goto L22
        L42:
            return r2
        L43:
            int r0 = r0 + 1
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: vjm.e.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.f289834c.isEmpty() ? h.f289836b : this.f289834c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f289833b.isEmpty()) {
            this.f289833b.clear();
        }
        if (this.f289834c.isEmpty()) {
            return;
        }
        this.f289834c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        return a(comparable) >= 0 || this.f289834c.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.f289834c.isEmpty() && !(this.f289834c instanceof TreeMap)) {
            this.f289834c = new TreeMap();
        }
        return (SortedMap) this.f289834c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj2) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((i) this.f289833b.get(iA)).setValue(obj2);
        }
        b();
        boolean zIsEmpty = this.f289833b.isEmpty();
        int i = this.f289832a;
        if (zIsEmpty && !(this.f289833b instanceof ArrayList)) {
            this.f289833b = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return d().put(comparable, obj2);
        }
        if (this.f289833b.size() == i) {
            i iVar = (i) this.f289833b.remove(i - 1);
            d().put(iVar.f289837a, iVar.f289838b);
        }
        this.f289833b.add(i2, new i(this, comparable, obj2));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new k(this);
        }
        return this.e;
    }

    public final Object f(int i) {
        b();
        Object obj2 = ((i) this.f289833b.remove(i)).f289838b;
        if (!this.f289834c.isEmpty()) {
            Iterator it8 = d().entrySet().iterator();
            List list = this.f289833b;
            Map.Entry entry = (Map.Entry) it8.next();
            list.add(new i(this, (Comparable) entry.getKey(), entry.getValue()));
            it8.remove();
        }
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        int iA = a(comparable);
        return iA >= 0 ? ((i) this.f289833b.get(iA)).f289838b : this.f289834c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        b();
        Comparable comparable = (Comparable) obj2;
        int iA = a(comparable);
        if (iA >= 0) {
            return f(iA);
        }
        if (this.f289834c.isEmpty()) {
            return null;
        }
        return this.f289834c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f289834c.size() + this.f289833b.size();
    }
}
