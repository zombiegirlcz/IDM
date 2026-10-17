package l10;

/* JADX INFO: loaded from: classes16.dex */
public final class u implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f191400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f191402c;

    public u(boolean z, boolean z3, boolean z4) {
        this.f191400a = z;
        this.f191401b = z3;
        this.f191402c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f191400a == uVar.f191400a && this.f191401b == uVar.f191401b && this.f191402c == uVar.f191402c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191402c) + j6.a.c(Boolean.hashCode(this.f191400a) * 31, 31, this.f191401b);
    }
}
