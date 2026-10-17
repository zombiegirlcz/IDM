package aqb;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8288a;

    public h(boolean z) {
        this.f8288a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f8288a == ((h) obj2).f8288a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8288a);
    }
}
