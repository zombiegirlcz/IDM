package rmm;

import java.util.Map;
import omm.c;
import smm.b;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements c, Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f255365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f255366b;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj2;
        Object obj3 = this.f255365a;
        if (obj3 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getKey())) {
            return false;
        }
        b bVar = this.f255366b;
        Object value = entry.getValue();
        return bVar == null ? value == null : bVar.equals(value);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f255365a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f255366b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj2 = this.f255365a;
        int iHashCode = obj2 == null ? 0 : obj2.hashCode();
        b bVar = this.f255366b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f255365a);
        sb6.append('=');
        sb6.append(this.f255366b);
        return sb6.toString();
    }
}
