package aim;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements Map.Entry, pim.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f5328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5330c;

    public h(f map, int i) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f5328a = map;
        this.f5329b = i;
        this.f5330c = map.f5324h;
    }

    public final void a() {
        if (this.f5328a.f5324h != this.f5330c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        return Intrinsics.f(entry.getKey(), getKey()) && Intrinsics.f(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f5328a.f5320a[this.f5329b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f5328a.f5321b;
        Intrinsics.h(objArr);
        return objArr[this.f5329b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        a();
        f fVar = this.f5328a;
        fVar.c();
        Object[] objArr = fVar.f5321b;
        if (objArr == null) {
            int length = fVar.f5320a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f5321b = objArr;
        }
        int i = this.f5329b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getKey());
        sb6.append('=');
        sb6.append(getValue());
        return sb6.toString();
    }
}
