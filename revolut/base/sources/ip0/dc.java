package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class dc implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163869c;

    public dc(boolean z, boolean z3, boolean z4) {
        this.f163867a = z;
        this.f163868b = z3;
        this.f163869c = z4;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163869c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj2;
        return this.f163867a == dcVar.f163867a && this.f163868b == dcVar.f163868b && this.f163869c == dcVar.f163869c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163869c) + j6.a.c(Boolean.hashCode(this.f163867a) * 31, 31, this.f163868b);
    }
}
