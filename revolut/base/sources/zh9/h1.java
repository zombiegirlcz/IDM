package zh9;

/* JADX INFO: loaded from: classes5.dex */
public final class h1 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f322279a;

    public h1(boolean z) {
        this.f322279a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h1) && this.f322279a == ((h1) obj2).f322279a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322279a);
    }
}
