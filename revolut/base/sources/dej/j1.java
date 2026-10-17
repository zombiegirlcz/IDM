package dej;

import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f113569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimMobilePlanPointsOption f113570c;

    public j1(String token, dj0.d originalPrice, EsimMobilePlanPointsOption pointsOption) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOption, "pointsOption");
        this.f113568a = token;
        this.f113569b = originalPrice;
        this.f113570c = pointsOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f113568a, j1Var.f113568a) && Intrinsics.f(this.f113569b, j1Var.f113569b) && Intrinsics.f(this.f113570c, j1Var.f113570c);
    }

    public final int hashCode() {
        return this.f113570c.hashCode() + v7.c(this.f113568a.hashCode() * 31, 31, this.f113569b);
    }
}
