package ux0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283739a;

    public c() {
        this(4);
    }

    @Override // tx0.b
    public final int a() {
        return this.f283739a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f283739a == ((c) obj2).f283739a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283739a);
    }

    public c(int i) {
        this.f283739a = i;
    }
}
