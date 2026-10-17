package zr4;

import com.revolut.feature.credit.card.impl.ui.instalment.details.post_purchase.InstalmentDetailsScreenContract$DomainState$CancellationModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.p f324561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ql4.q f324562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324563c;
    public final xi0.b d;
    public final InstalmentDetailsScreenContract$DomainState$CancellationModel e;
    public final h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f324564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi0.b f324565h;

    public g(whf.p transactionsContent, ql4.q instalmentDetails, boolean z, xi0.b currency, InstalmentDetailsScreenContract$DomainState$CancellationModel instalmentDetailsScreenContract$DomainState$CancellationModel, h hVar, String facilityId, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(instalmentDetails, "instalmentDetails");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f324561a = transactionsContent;
        this.f324562b = instalmentDetails;
        this.f324563c = z;
        this.d = currency;
        this.e = instalmentDetailsScreenContract$DomainState$CancellationModel;
        this.f = hVar;
        this.f324564g = facilityId;
        this.f324565h = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f324561a, gVar.f324561a) && Intrinsics.f(this.f324562b, gVar.f324562b) && this.f324563c == gVar.f324563c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f324564g, gVar.f324564g) && Intrinsics.f(this.f324565h, gVar.f324565h);
    }

    public final int hashCode() {
        int iJ = h30.l.j(this.d, j6.a.c((this.f324562b.hashCode() + (this.f324561a.hashCode() * 31)) * 31, 31, this.f324563c), 31);
        InstalmentDetailsScreenContract$DomainState$CancellationModel instalmentDetailsScreenContract$DomainState$CancellationModel = this.e;
        int iHashCode = (iJ + (instalmentDetailsScreenContract$DomainState$CancellationModel == null ? 0 : instalmentDetailsScreenContract$DomainState$CancellationModel.hashCode())) * 31;
        h hVar = this.f;
        return this.f324565h.f297794a.hashCode() + p.a.c((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31, 31, this.f324564g);
    }
}
