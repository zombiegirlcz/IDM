package jv0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f178758a;

    public p(boolean z) {
        this.f178758a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f178758a == ((p) obj2).f178758a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f178758a);
    }
}
