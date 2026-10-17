package pi3;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import hha.w0;
import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f236400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f236401c;
    public final hha.o d;
    public final String e;
    public final hha.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f236402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final PricingPlanOffer f236403h;
    public final boolean i;

    public e(String planId, w0 planTier, String preorderId, hha.o charge, String code, hha.i iVar, Instant instant, PricingPlanOffer pricingPlanOffer, boolean z) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(planTier, "planTier");
        Intrinsics.checkNotNullParameter(preorderId, "preorderId");
        Intrinsics.checkNotNullParameter(charge, "charge");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f236399a = planId;
        this.f236400b = planTier;
        this.f236401c = preorderId;
        this.d = charge;
        this.e = code;
        this.f = iVar;
        this.f236402g = instant;
        this.f236403h = pricingPlanOffer;
        this.i = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f236399a, eVar.f236399a) && this.f236400b == eVar.f236400b && Intrinsics.f(this.f236401c, eVar.f236401c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && this.f == eVar.f && Intrinsics.f(this.f236402g, eVar.f236402g) && Intrinsics.f(this.f236403h, eVar.f236403h) && this.i == eVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c((this.d.hashCode() + p.a.c((this.f236400b.hashCode() + (this.f236399a.hashCode() * 31)) * 31, 31, this.f236401c)) * 31, 31, this.e);
        hha.i iVar = this.f;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Instant instant = this.f236402g;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f236403h;
        return Boolean.hashCode(this.i) + ((iHashCode2 + (pricingPlanOffer != null ? pricingPlanOffer.hashCode() : 0)) * 31);
    }
}
