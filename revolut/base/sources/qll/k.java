package qll;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f247590a;

    public k(boolean z) {
        this.f247590a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f247590a == ((k) obj2).f247590a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247590a);
    }
}
