package meg;

import kotlin.jvm.internal.Intrinsics;
import zfi.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f204671c;

    public f(String reference, String queryParam, n nVar) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        this.f204669a = reference;
        this.f204670b = queryParam;
        this.f204671c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204669a, fVar.f204669a) && Intrinsics.f(this.f204670b, fVar.f204670b) && Intrinsics.f(this.f204671c, fVar.f204671c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f204669a.hashCode() * 31, 31, this.f204670b);
        n nVar = this.f204671c;
        return iC + (nVar == null ? 0 : nVar.hashCode());
    }
}
