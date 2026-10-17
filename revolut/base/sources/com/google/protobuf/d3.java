package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class d3 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f49700b;

    public /* synthetic */ d3(AbstractMap abstractMap, int i) {
        this.f49699a = i;
        this.f49700b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj2) {
        switch (this.f49699a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj2;
                if (contains(entry)) {
                    return false;
                }
                ((v2) this.f49700b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f49699a) {
            case 0:
                ((v2) this.f49700b).clear();
                break;
            default:
                ((smm.d) this.f49700b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        switch (this.f49699a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj2;
                Object obj3 = ((v2) this.f49700b).get(entry.getKey());
                Object value = entry.getValue();
                return obj3 == value || (obj3 != null && obj3.equals(value));
            default:
                return ((smm.d) this.f49700b).f264462a.entrySet().contains(obj2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f49699a) {
            case 0:
                return new c3((v2) this.f49700b);
            default:
                smm.d dVar = (smm.d) this.f49700b;
                return new sgm.f(dVar, dVar.f264462a.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj2) {
        switch (this.f49699a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj2;
                if (contains(entry)) {
                    ((v2) this.f49700b).remove(entry.getKey());
                }
                break;
            default:
                if (contains(obj2)) {
                    ((smm.d) this.f49700b).f264463b.b(((Map.Entry) obj2).getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f49699a) {
            case 0:
                return ((v2) this.f49700b).size();
            default:
                return ((smm.d) this.f49700b).f264462a.size();
        }
    }
}
