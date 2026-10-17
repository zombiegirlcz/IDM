package eue;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i {
    public c() {
        super(null);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c)) {
            return false;
        }
        Long l2 = this.f129558a;
        if (l2 == null) {
            return ((c) obj2).f129558a == null;
        }
        long jLongValue = l2.longValue();
        Long l3 = ((c) obj2).f129558a;
        return l3 != null && jLongValue == l3.longValue();
    }

    public final int hashCode() {
        Long l2 = this.f129558a;
        if (l2 != null) {
            return Long.hashCode(l2.longValue());
        }
        return 0;
    }
}
