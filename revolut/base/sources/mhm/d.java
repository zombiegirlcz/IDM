package mhm;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f205589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f205590b;

    public d(Object obj2, Object obj3) {
        this.f205589a = obj2;
        this.f205590b = obj3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        d dVar = (d) obj2;
        int iCompareTo = ((Comparable) this.f205589a).compareTo(dVar.f205589a);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = ((Comparable) this.f205590b).compareTo(dVar.f205590b);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Objects.equals(this.f205589a, dVar.f205589a) && Objects.equals(this.f205590b, dVar.f205590b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f205590b) + ((Objects.hashCode(this.f205589a) + 31) * 31);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("(");
        sb6.append(this.f205589a);
        sb6.append(", ");
        return com.revolut.data.database.models.openbanking.d.t(sb6, this.f205590b, ")");
    }
}
