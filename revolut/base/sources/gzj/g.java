package gzj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import yt8.i;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f148155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148156c;
    public final boolean d;
    public final i e;
    public final l71.d f;

    public g(List planLimits, List walletLimits, boolean z, boolean z3, i addressKycStatus, l71.d userCompany) {
        Intrinsics.checkNotNullParameter(planLimits, "planLimits");
        Intrinsics.checkNotNullParameter(walletLimits, "walletLimits");
        Intrinsics.checkNotNullParameter(addressKycStatus, "addressKycStatus");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f148154a = planLimits;
        this.f148155b = walletLimits;
        this.f148156c = z;
        this.d = z3;
        this.e = addressKycStatus;
        this.f = userCompany;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148154a, gVar.f148154a) && Intrinsics.f(this.f148155b, gVar.f148155b) && this.f148156c == gVar.f148156c && this.d == gVar.d && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.c(j6.a.c(p.a.d(this.f148154a.hashCode() * 31, 31, this.f148155b), 31, this.f148156c), 31, this.d)) * 31);
    }
}
