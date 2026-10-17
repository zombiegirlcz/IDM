package ir6;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f168009a;

    public a(boolean z) {
        this.f168009a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f168009a == ((a) obj2).f168009a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168009a);
    }
}
