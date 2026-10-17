package mg7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.i3;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i3 f205165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205166c;
    public final String d;
    public final List e;
    public final boolean f;

    public g(String rewardId, i3 i3Var, String title, String successMessage, List subCategories, boolean z) {
        Intrinsics.checkNotNullParameter(rewardId, "rewardId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(successMessage, "successMessage");
        Intrinsics.checkNotNullParameter(subCategories, "subCategories");
        this.f205164a = rewardId;
        this.f205165b = i3Var;
        this.f205166c = title;
        this.d = successMessage;
        this.e = subCategories;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f205164a, gVar.f205164a) && Intrinsics.f(this.f205165b, gVar.f205165b) && Intrinsics.f(this.f205166c, gVar.f205166c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f205164a.hashCode() * 31;
        i3 i3Var = this.f205165b;
        return Boolean.hashCode(this.f) + p.a.d(p.a.c(p.a.c((iHashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31, 31, this.f205166c), 31, this.d), 31, this.e);
    }
}
