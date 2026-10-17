package vvc;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f292516a;

    public m(int i) {
        this.f292516a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f292516a == ((m) obj2).f292516a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f292516a);
    }
}
