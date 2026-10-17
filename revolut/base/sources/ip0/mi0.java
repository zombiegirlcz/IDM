package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165386c;

    public mi0(boolean z, boolean z3, boolean z4) {
        this.f165384a = z;
        this.f165385b = z3;
        this.f165386c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mi0)) {
            return false;
        }
        mi0 mi0Var = (mi0) obj2;
        return this.f165384a == mi0Var.f165384a && this.f165385b == mi0Var.f165385b && this.f165386c == mi0Var.f165386c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165386c) + j6.a.c(Boolean.hashCode(this.f165384a) * 31, 31, this.f165385b);
    }
}
