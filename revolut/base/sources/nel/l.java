package nel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f214587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f214589c;
    public final jel.s0 d;
    public final jel.w0 e;
    public final jel.w f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f214590g;

    public l(g distributionPolicy, boolean z, j fundHouseId, jel.s0 s0Var, jel.w0 w0Var, jel.w wVar, k kVar) {
        Intrinsics.checkNotNullParameter(distributionPolicy, "distributionPolicy");
        Intrinsics.checkNotNullParameter(fundHouseId, "fundHouseId");
        this.f214587a = distributionPolicy;
        this.f214588b = z;
        this.f214589c = fundHouseId;
        this.d = s0Var;
        this.e = w0Var;
        this.f = wVar;
        this.f214590g = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f214587a == lVar.f214587a && this.f214588b == lVar.f214588b && Intrinsics.f(this.f214589c, lVar.f214589c) && this.d == lVar.d && this.e == lVar.e && this.f == lVar.f && Intrinsics.f(this.f214590g, lVar.f214590g);
    }

    public final int hashCode() {
        int iHashCode = (this.f214589c.hashCode() + j6.a.c(this.f214587a.hashCode() * 31, 31, this.f214588b)) * 31;
        jel.s0 s0Var = this.d;
        int iHashCode2 = (iHashCode + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        jel.w0 w0Var = this.e;
        int iHashCode3 = (iHashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        jel.w wVar = this.f;
        int iHashCode4 = (iHashCode3 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        k kVar = this.f214590g;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }
}
