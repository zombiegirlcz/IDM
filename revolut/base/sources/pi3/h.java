package pi3;

import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f236404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.i f236405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanOffer f236406c;
    public final boolean d;
    public final iha.a e;
    public final Boolean f;

    public /* synthetic */ h(hha.d dVar, hha.i iVar, PricingPlanOffer pricingPlanOffer, boolean z, int i) {
        this(dVar, iVar, (i & 4) != 0 ? null : pricingPlanOffer, z, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f236404a, hVar.f236404a) && this.f236405b == hVar.f236405b && Intrinsics.f(this.f236406c, hVar.f236406c) && this.d == hVar.d && this.e == hVar.e && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f236404a.hashCode() * 31;
        hha.i iVar = this.f236405b;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        PricingPlanOffer pricingPlanOffer = this.f236406c;
        int iC = j6.a.c((iHashCode2 + (pricingPlanOffer == null ? 0 : pricingPlanOffer.hashCode())) * 31, 31, this.d);
        iha.a aVar = this.e;
        int iHashCode3 = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool = this.f;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public h(hha.d plan, hha.i iVar, PricingPlanOffer pricingPlanOffer, boolean z, iha.a aVar, Boolean bool) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f236404a = plan;
        this.f236405b = iVar;
        this.f236406c = pricingPlanOffer;
        this.d = z;
        this.e = aVar;
        this.f = bool;
    }
}
