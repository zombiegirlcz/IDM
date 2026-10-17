package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163850c;

    public d7(boolean z, boolean z3, boolean z4) {
        this.f163848a = z;
        this.f163849b = z3;
        this.f163850c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj2;
        return this.f163848a == d7Var.f163848a && this.f163849b == d7Var.f163849b && this.f163850c == d7Var.f163850c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163850c) + j6.a.c(Boolean.hashCode(this.f163848a) * 31, 31, this.f163849b);
    }
}
