package qni;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f247952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f247953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f247954c;

    public d(long j2, boolean z, boolean z3) {
        this.f247952a = j2;
        this.f247953b = z;
        this.f247954c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f247952a == dVar.f247952a && this.f247953b == dVar.f247953b && this.f247954c == dVar.f247954c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f247954c) + j6.a.c(Long.hashCode(this.f247952a) * 31, 31, this.f247953b);
    }
}
