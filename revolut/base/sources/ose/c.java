package ose;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f229322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f229323b;

    public c() {
        this(3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f229322a == cVar.f229322a && this.f229323b == cVar.f229323b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f229323b) + (Boolean.hashCode(this.f229322a) * 31);
    }

    public /* synthetic */ c(int i) {
        this(true, false);
    }

    public c(boolean z, boolean z3) {
        this.f229322a = z;
        this.f229323b = z3;
    }
}
