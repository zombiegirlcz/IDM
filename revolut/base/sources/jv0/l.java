package jv0;

/* JADX INFO: loaded from: classes19.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178750a;

    public l(boolean z) {
        this.f178750a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f178750a == ((l) obj2).f178750a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178750a);
    }
}
