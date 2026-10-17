package vjm;

import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class i implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f289837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f289838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f289839c;

    public i(e eVar, Comparable comparable, Object obj2) {
        this.f289839c = eVar;
        this.f289837a = comparable;
        this.f289838b = obj2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        return this.f289837a.compareTo(((i) obj2).f289837a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            if (obj2 instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj2;
                Object key = entry.getKey();
                Comparable comparable = this.f289837a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj3 = this.f289838b;
                    Object value = entry.getValue();
                    if (obj3 == null ? value == null : obj3.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f289837a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f289838b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f289837a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj2 = this.f289838b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        this.f289839c.b();
        Object obj3 = this.f289838b;
        this.f289838b = obj2;
        return obj3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f289837a);
        String strValueOf2 = String.valueOf(this.f289838b);
        return a0.d.u(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
