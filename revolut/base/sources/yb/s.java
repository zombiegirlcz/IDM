package yb;

/* JADX INFO: loaded from: classes16.dex */
public final class s extends e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f312130a;

    public s(r rVar) {
        this.f312130a = rVar;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        d0 d0Var = this.f312130a;
        s sVar = (s) ((e0) obj2);
        return d0Var == null ? sVar.f312130a == null : d0Var.equals(sVar.f312130a);
    }

    public final int hashCode() {
        d0 d0Var = this.f312130a;
        return (d0Var == null ? 0 : d0Var.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f312130a + "}";
    }
}
