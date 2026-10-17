package sr6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265126a;

    public c(int i) {
        this.f265126a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f265126a == ((c) obj2).f265126a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f265126a);
    }
}
