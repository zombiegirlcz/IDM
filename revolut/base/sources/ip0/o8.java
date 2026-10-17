package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class o8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165636c;

    public o8(boolean z, boolean z3, boolean z4) {
        this.f165634a = z;
        this.f165635b = z3;
        this.f165636c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj2;
        return this.f165634a == o8Var.f165634a && this.f165635b == o8Var.f165635b && this.f165636c == o8Var.f165636c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165636c) + j6.a.c(Boolean.hashCode(this.f165634a) * 31, 31, this.f165635b);
    }
}
