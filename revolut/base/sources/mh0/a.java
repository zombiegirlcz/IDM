package mh0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f205344b;

    public a(int i, int i2) {
        this.f205343a = i;
        this.f205344b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f205343a == aVar.f205343a && this.f205344b == aVar.f205344b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f205344b) + (Integer.hashCode(this.f205343a) * 31);
    }
}
