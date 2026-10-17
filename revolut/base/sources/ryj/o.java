package ryj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u09.v f258405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258406b;

    public o(u09.v domain) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.f258405a = domain;
        this.f258406b = domain.name();
    }

    @Override // ryj.p
    public final String a() {
        return this.f258406b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f258405a == ((o) obj2).f258405a;
    }

    public final int hashCode() {
        return this.f258405a.hashCode();
    }
}
