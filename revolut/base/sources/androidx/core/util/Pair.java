package androidx.core.util;

import com.revolut.data.database.models.openbanking.d;

/* JADX INFO: loaded from: classes15.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f, S s2) {
        this.first = f;
        this.second = s2;
    }

    public static <A, B> Pair<A, B> create(A a7, B b4) {
        return new Pair<>(a7, b4);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj2;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f = this.first;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s2 = this.second;
        return iHashCode ^ (s2 != null ? s2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("Pair{");
        sb6.append(this.first);
        sb6.append(" ");
        return d.t(sb6, this.second, "}");
    }
}
