package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f49808h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f49810b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f49811c;
    public boolean d;
    public volatile d3 e;
    public Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f49812g;

    public v2(int i) {
        this.f49809a = i;
        Map map = Collections.EMPTY_MAP;
        this.f49811c = map;
        this.f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f49810b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f49810b
            java.lang.Object r2 = r2.get(r1)
            com.google.protobuf.b3 r2 = (com.google.protobuf.b3) r2
            java.lang.Comparable r2 = r2.a()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f49810b
            java.lang.Object r3 = r3.get(r2)
            com.google.protobuf.b3 r3 = (com.google.protobuf.b3) r3
            java.lang.Comparable r3 = r3.a()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.v2.a(java.lang.Comparable):int");
    }

    public final void b() {
        if (this.d) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f49810b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f49810b.isEmpty()) {
            this.f49810b.clear();
        }
        if (this.f49811c.isEmpty()) {
            return;
        }
        this.f49811c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        return a(comparable) >= 0 || this.f49811c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f49811c.isEmpty() ? a3.f49682b : this.f49811c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f49811c.isEmpty() && !(this.f49811c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f49811c = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.f49811c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.e == null) {
            this.e = new d3(this, 0);
        }
        return this.e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return super.equals(obj2);
        }
        v2 v2Var = (v2) obj2;
        int size = size();
        if (size == v2Var.size()) {
            int size2 = this.f49810b.size();
            if (size2 != v2Var.f49810b.size()) {
                return ((AbstractSet) entrySet()).equals(v2Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(v2Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.f49811c.equals(v2Var.f49811c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj2) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f49810b.get(iA)).setValue(obj2);
        }
        b();
        boolean zIsEmpty = this.f49810b.isEmpty();
        int i = this.f49809a;
        if (zIsEmpty && !(this.f49810b instanceof ArrayList)) {
            this.f49810b = new ArrayList(i);
        }
        int i2 = -(iA + 1);
        if (i2 >= i) {
            return e().put(comparable, obj2);
        }
        if (this.f49810b.size() == i) {
            b3 b3Var = (b3) this.f49810b.remove(i - 1);
            e().put(b3Var.a(), b3Var.getValue());
        }
        this.f49810b.add(i2, new b3(this, comparable, obj2));
        return null;
    }

    public final Object g(int i) {
        b();
        Object value = ((b3) this.f49810b.remove(i)).getValue();
        if (!this.f49811c.isEmpty()) {
            Iterator it8 = e().entrySet().iterator();
            this.f49810b.add(new b3(this, (Map.Entry) it8.next()));
            it8.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj2) {
        Comparable comparable = (Comparable) obj2;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f49810b.get(iA)).getValue() : this.f49811c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f49810b.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((b3) this.f49810b.get(i)).hashCode();
        }
        return this.f49811c.size() > 0 ? this.f49811c.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj2) {
        b();
        Comparable comparable = (Comparable) obj2;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.f49811c.isEmpty()) {
            return null;
        }
        return this.f49811c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f49811c.size() + this.f49810b.size();
    }
}
