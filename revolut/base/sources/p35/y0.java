package p35;

import com.revolut.feature.credit.loan.api.models.legacy.UnavailabilityReason;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnavailabilityReason f232685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UnavailabilityReason f232686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UnavailabilityReason f232687c;
    public final UnavailabilityReason d;
    public final UnavailabilityReason e;
    public final UnavailabilityReason f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UnavailabilityReason f232688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UnavailabilityReason f232689h;

    public y0() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f232685a, y0Var.f232685a) && Intrinsics.f(this.f232686b, y0Var.f232686b) && Intrinsics.f(this.f232687c, y0Var.f232687c) && Intrinsics.f(this.d, y0Var.d) && Intrinsics.f(this.e, y0Var.e) && Intrinsics.f(this.f, y0Var.f) && Intrinsics.f(this.f232688g, y0Var.f232688g) && Intrinsics.f(this.f232689h, y0Var.f232689h);
    }

    public final int hashCode() {
        UnavailabilityReason unavailabilityReason = this.f232685a;
        int iHashCode = (unavailabilityReason == null ? 0 : unavailabilityReason.hashCode()) * 31;
        UnavailabilityReason unavailabilityReason2 = this.f232686b;
        int iHashCode2 = (iHashCode + (unavailabilityReason2 == null ? 0 : unavailabilityReason2.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason3 = this.f232687c;
        int iHashCode3 = (iHashCode2 + (unavailabilityReason3 == null ? 0 : unavailabilityReason3.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason4 = this.d;
        int iHashCode4 = (iHashCode3 + (unavailabilityReason4 == null ? 0 : unavailabilityReason4.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason5 = this.e;
        int iHashCode5 = (iHashCode4 + (unavailabilityReason5 == null ? 0 : unavailabilityReason5.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason6 = this.f;
        int iHashCode6 = (iHashCode5 + (unavailabilityReason6 == null ? 0 : unavailabilityReason6.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason7 = this.f232688g;
        int iHashCode7 = (iHashCode6 + (unavailabilityReason7 == null ? 0 : unavailabilityReason7.hashCode())) * 31;
        UnavailabilityReason unavailabilityReason8 = this.f232689h;
        return iHashCode7 + (unavailabilityReason8 != null ? unavailabilityReason8.hashCode() : 0);
    }

    public y0(UnavailabilityReason unavailabilityReason, UnavailabilityReason unavailabilityReason2, UnavailabilityReason unavailabilityReason3, UnavailabilityReason unavailabilityReason4, UnavailabilityReason unavailabilityReason5, UnavailabilityReason unavailabilityReason6, UnavailabilityReason unavailabilityReason7, UnavailabilityReason unavailabilityReason8) {
        this.f232685a = unavailabilityReason;
        this.f232686b = unavailabilityReason2;
        this.f232687c = unavailabilityReason3;
        this.d = unavailabilityReason4;
        this.e = unavailabilityReason5;
        this.f = unavailabilityReason6;
        this.f232688g = unavailabilityReason7;
        this.f232689h = unavailabilityReason8;
    }

    public /* synthetic */ y0(int i) {
        this(null, null, null, null, null, null, null, null);
    }
}
