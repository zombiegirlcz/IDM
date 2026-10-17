package c46;

import com.revolut.feature.defi.common.models.domain.DeFiAssetRiskAssessment;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiExchangeOrderDraft f21082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sh5.c f21083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeFiAssetRiskAssessment f21084c;

    public c(DeFiExchangeOrderDraft draft, sh5.c cVar, DeFiAssetRiskAssessment deFiAssetRiskAssessment) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f21082a = draft;
        this.f21083b = cVar;
        this.f21084c = deFiAssetRiskAssessment;
    }

    public static c a(c cVar, DeFiExchangeOrderDraft draft, sh5.c cVar2, DeFiAssetRiskAssessment deFiAssetRiskAssessment, int i) {
        if ((i & 1) != 0) {
            draft = cVar.f21082a;
        }
        if ((i & 2) != 0) {
            cVar2 = cVar.f21083b;
        }
        if ((i & 4) != 0) {
            deFiAssetRiskAssessment = cVar.f21084c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(draft, "draft");
        return new c(draft, cVar2, deFiAssetRiskAssessment);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f21082a, cVar.f21082a) && Intrinsics.f(this.f21083b, cVar.f21083b) && Intrinsics.f(this.f21084c, cVar.f21084c);
    }

    public final int hashCode() {
        int iHashCode = this.f21082a.hashCode() * 31;
        sh5.c cVar = this.f21083b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        DeFiAssetRiskAssessment deFiAssetRiskAssessment = this.f21084c;
        return iHashCode2 + (deFiAssetRiskAssessment != null ? deFiAssetRiskAssessment.hashCode() : 0);
    }
}
