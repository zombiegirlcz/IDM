package w9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Comparable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f295661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f295662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f295663c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        return this.f295661a.compareTo(((a) obj2).f295661a);
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        return obj2 != null && obj2.getClass() == a.class && ((a) obj2).f295662b == this.f295662b;
    }

    public final int hashCode() {
        return this.f295663c;
    }

    public final String toString() {
        return this.f295661a;
    }
}
