package qu8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f249263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249264b;

    public d(boolean z, boolean z3) {
        this.f249263a = z;
        this.f249264b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f249263a == dVar.f249263a && this.f249264b == dVar.f249264b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249264b) + (Boolean.hashCode(this.f249263a) * 31);
    }
}
