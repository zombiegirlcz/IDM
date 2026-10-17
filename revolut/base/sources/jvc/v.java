package jvc;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178849a;

    public v(boolean z) {
        this.f178849a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f178849a == ((v) obj2).f178849a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178849a);
    }
}
