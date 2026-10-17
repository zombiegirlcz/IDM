package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class jj implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164848b;

    public jj(boolean z, boolean z3) {
        this.f164847a = z;
        this.f164848b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164848b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj2;
        return this.f164847a == jjVar.f164847a && this.f164848b == jjVar.f164848b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164848b) + (Boolean.hashCode(this.f164847a) * 31);
    }
}
