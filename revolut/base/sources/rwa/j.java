package rwa;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f257872a;

    public j(boolean z) {
        this.f257872a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f257872a == ((j) obj2).f257872a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f257872a);
    }
}
