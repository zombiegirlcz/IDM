package huh;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f155652b = new LinkedHashSet();

    public a(int i) {
        this.f155651a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f155651a == ((a) obj2).f155651a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f155651a);
    }
}
