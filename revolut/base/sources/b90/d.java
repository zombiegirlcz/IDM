package b90;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13522a;

    public d(boolean z) {
        this.f13522a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f13522a == ((d) obj2).f13522a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13522a);
    }
}
