package jyf;

import com.revolut.feature.rev_points.models.RevPoints;
import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import m1c.v;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f179419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f179420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f179421c;
    public final d d;
    public final d e;
    public final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f179422g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RevPoints f179423h;

    public b(d refund, d monetaryRefund, v pointsRefund, d penalty, d monetaryPenalty, v pointsPenalty, d cashbackReversal, RevPoints pointsRewardReversal) {
        Intrinsics.checkNotNullParameter(refund, "refund");
        Intrinsics.checkNotNullParameter(monetaryRefund, "monetaryRefund");
        Intrinsics.checkNotNullParameter(pointsRefund, "pointsRefund");
        Intrinsics.checkNotNullParameter(penalty, "penalty");
        Intrinsics.checkNotNullParameter(monetaryPenalty, "monetaryPenalty");
        Intrinsics.checkNotNullParameter(pointsPenalty, "pointsPenalty");
        Intrinsics.checkNotNullParameter(cashbackReversal, "cashbackReversal");
        Intrinsics.checkNotNullParameter(pointsRewardReversal, "pointsRewardReversal");
        this.f179419a = refund;
        this.f179420b = monetaryRefund;
        this.f179421c = pointsRefund;
        this.d = penalty;
        this.e = monetaryPenalty;
        this.f = pointsPenalty;
        this.f179422g = cashbackReversal;
        this.f179423h = pointsRewardReversal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f179419a, bVar.f179419a) && Intrinsics.f(this.f179420b, bVar.f179420b) && Intrinsics.f(this.f179421c, bVar.f179421c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f179422g, bVar.f179422g) && Intrinsics.f(this.f179423h, bVar.f179423h);
    }

    public final int hashCode() {
        return this.f179423h.f83960a.hashCode() + v7.c((this.f.hashCode() + v7.c(v7.c((this.f179421c.hashCode() + v7.c(this.f179419a.hashCode() * 31, 31, this.f179420b)) * 31, 31, this.d), 31, this.e)) * 31, 31, this.f179422g);
    }
}
