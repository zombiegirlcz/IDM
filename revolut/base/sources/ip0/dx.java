package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dx implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163971b;

    public dx(boolean z, boolean z3) {
        this.f163970a = z;
        this.f163971b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163971b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dx)) {
            return false;
        }
        dx dxVar = (dx) obj2;
        return this.f163970a == dxVar.f163970a && this.f163971b == dxVar.f163971b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163971b) + (Boolean.hashCode(this.f163970a) * 31);
    }
}
