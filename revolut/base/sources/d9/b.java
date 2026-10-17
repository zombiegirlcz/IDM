package d9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f112300c = new b(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f112301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f112302b;

    public b(Object obj2, Boolean bool) {
        this.f112301a = obj2;
        this.f112302b = bool;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 != null && obj2.getClass() == b.class) {
            b bVar = (b) obj2;
            Object obj3 = bVar.f112301a;
            Boolean bool = bVar.f112302b;
            Boolean bool2 = this.f112302b;
            if (bool2 == null ? bool == null : bool2.equals(bool)) {
                Object obj4 = this.f112301a;
                return obj4 == null ? obj3 == null : obj4.equals(obj3);
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f112301a;
        int iHashCode = obj2 != null ? 1 + obj2.hashCode() : 1;
        Boolean bool = this.f112302b;
        return bool != null ? bool.hashCode() + iHashCode : iHashCode;
    }

    public final String toString() {
        return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f112301a, this.f112302b);
    }
}
