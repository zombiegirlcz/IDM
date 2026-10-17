package v15;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f285234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wi0.b f285235c;

    public f(dj0.d amount, String pocketId, wi0.b countyCode) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(countyCode, "countyCode");
        this.f285233a = pocketId;
        this.f285234b = amount;
        this.f285235c = countyCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f285233a, fVar.f285233a) && Intrinsics.f(this.f285234b, fVar.f285234b) && Intrinsics.f(this.f285235c, fVar.f285235c);
    }

    public final int hashCode() {
        return this.f285235c.f297794a.hashCode() + v7.c(this.f285233a.hashCode() * 31, 31, this.f285234b);
    }
}
