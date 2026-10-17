package ike;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161940b;

    public a(boolean z, boolean z3) {
        this.f161939a = z;
        this.f161940b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f161939a == aVar.f161939a && this.f161940b == aVar.f161940b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161940b) + (Boolean.hashCode(this.f161939a) * 31);
    }
}
