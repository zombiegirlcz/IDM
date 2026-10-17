package m1c;

import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f201471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f201472c;
    public final RevPoints d;
    public final RevPoints e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f201473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f201474h;

    public x(String pointsAccountId, w state, RevPoints balance, RevPoints totalAward, RevPoints totalRedeemed, dj0.d totalRedeemedCash, float f, Instant instant) {
        Intrinsics.checkNotNullParameter(pointsAccountId, "pointsAccountId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(totalAward, "totalAward");
        Intrinsics.checkNotNullParameter(totalRedeemed, "totalRedeemed");
        Intrinsics.checkNotNullParameter(totalRedeemedCash, "totalRedeemedCash");
        this.f201470a = pointsAccountId;
        this.f201471b = state;
        this.f201472c = balance;
        this.d = totalAward;
        this.e = totalRedeemed;
        this.f = totalRedeemedCash;
        this.f201473g = f;
        this.f201474h = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f201470a, xVar.f201470a) && this.f201471b == xVar.f201471b && Intrinsics.f(this.f201472c, xVar.f201472c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Float.compare(this.f201473g, xVar.f201473g) == 0 && Intrinsics.f(this.f201474h, xVar.f201474h);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f201473g, v7.c(v7.c(v7.c(v7.c((this.f201471b.hashCode() + (this.f201470a.hashCode() * 31)) * 31, 31, this.f201472c.f83960a), 31, this.d.f83960a), 31, this.e.f83960a), 31, this.f), 31);
        Instant instant = this.f201474h;
        return iB + (instant == null ? 0 : instant.hashCode());
    }
}
