package tq0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f273478c;

    public l(boolean z, boolean z3, boolean z4) {
        this.f273476a = z;
        this.f273477b = z3;
        this.f273478c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f273476a == lVar.f273476a && this.f273477b == lVar.f273477b && this.f273478c == lVar.f273478c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f273478c) + j6.a.c(Boolean.hashCode(this.f273476a) * 31, 31, this.f273477b);
    }
}
