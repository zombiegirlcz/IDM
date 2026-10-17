package dej;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f113487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f113488c;
    public final Period d;
    public final Long e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimCoverage f113489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimDataPlanOfferInfo f113490h;

    public a4(String id10, m mVar, l lVar, Period duration, Long l2, boolean z, EsimCoverage coverage, EsimDataPlanOfferInfo esimDataPlanOfferInfo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f113486a = id10;
        this.f113487b = mVar;
        this.f113488c = lVar;
        this.d = duration;
        this.e = l2;
        this.f = z;
        this.f113489g = coverage;
        this.f113490h = esimDataPlanOfferInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f113486a, a4Var.f113486a) && this.f113487b == a4Var.f113487b && this.f113488c == a4Var.f113488c && Intrinsics.f(this.d, a4Var.d) && Intrinsics.f(this.e, a4Var.e) && this.f == a4Var.f && Intrinsics.f(this.f113489g, a4Var.f113489g) && Intrinsics.f(this.f113490h, a4Var.f113490h);
    }

    public final int hashCode() {
        int iHashCode = this.f113486a.hashCode() * 31;
        m mVar = this.f113487b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l lVar = this.f113488c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        Long l2 = this.e;
        int iHashCode4 = (this.f113489g.hashCode() + j6.a.c((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f)) * 31;
        EsimDataPlanOfferInfo esimDataPlanOfferInfo = this.f113490h;
        return iHashCode4 + (esimDataPlanOfferInfo != null ? esimDataPlanOfferInfo.hashCode() : 0);
    }
}
