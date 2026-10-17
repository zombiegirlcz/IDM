package jw0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178917a;

    public a(int i) {
        this.f178917a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f178917a == ((a) obj2).f178917a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f178917a);
    }
}
