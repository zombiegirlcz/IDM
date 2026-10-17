package aq6;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8270a;

    public b() {
        this(true);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f8270a == ((b) obj2).f8270a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8270a);
    }

    public b(boolean z) {
        this.f8270a = z;
    }
}
