package tk2;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271841a;

    public j(boolean z) {
        this.f271841a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f271841a == ((j) obj2).f271841a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271841a);
    }
}
