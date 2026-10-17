package oi4;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f225437a;

    public f(boolean z) {
        this.f225437a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f225437a == ((f) obj2).f225437a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225437a);
    }
}
