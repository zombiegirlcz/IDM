package n8h;

import a0.d;
import java.time.LocalDate;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\n\u0010\u001c¨\u0006\u001e"}, d2 = {"Ln8h/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "collectionName", "", "b", "J", "e", "()J", "insuranceDuration", "", "Ljo3/b;", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "investmentLimits", "d", "campaignId", "headerImage", "g", "promotionType", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "campaignReimbursementDate", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("collectionName")
    @NotNull
    private final String collectionName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("insuranceDuration")
    private final long insuranceDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("investmentLimits")
    @NotNull
    private final Map<String, jo3.b> investmentLimits;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("campaignId")
    @NotNull
    private final String campaignId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("headerImage")
    @NotNull
    private final String headerImage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("promotionType")
    @NotNull
    private final String promotionType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("campaignReimbursementDate")
    @NotNull
    private final LocalDate campaignReimbursementDate;

    public a(String collectionName, long j2, Map investmentLimits, String campaignId, String headerImage, String promotionType, LocalDate campaignReimbursementDate) {
        Intrinsics.checkNotNullParameter(collectionName, "collectionName");
        Intrinsics.checkNotNullParameter(investmentLimits, "investmentLimits");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(headerImage, "headerImage");
        Intrinsics.checkNotNullParameter(promotionType, "promotionType");
        Intrinsics.checkNotNullParameter(campaignReimbursementDate, "campaignReimbursementDate");
        this.collectionName = collectionName;
        this.insuranceDuration = j2;
        this.investmentLimits = investmentLimits;
        this.campaignId = campaignId;
        this.headerImage = headerImage;
        this.promotionType = promotionType;
        this.campaignReimbursementDate = campaignReimbursementDate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getCampaignReimbursementDate() {
        return this.campaignReimbursementDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCollectionName() {
        return this.collectionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHeaderImage() {
        return this.headerImage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getInsuranceDuration() {
        return this.insuranceDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.collectionName, aVar.collectionName) && this.insuranceDuration == aVar.insuranceDuration && Intrinsics.f(this.investmentLimits, aVar.investmentLimits) && Intrinsics.f(this.campaignId, aVar.campaignId) && Intrinsics.f(this.headerImage, aVar.headerImage) && Intrinsics.f(this.promotionType, aVar.promotionType) && Intrinsics.f(this.campaignReimbursementDate, aVar.campaignReimbursementDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getInvestmentLimits() {
        return this.investmentLimits;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPromotionType() {
        return this.promotionType;
    }

    public final int hashCode() {
        return this.campaignReimbursementDate.hashCode() + p.a.c(p.a.c(p.a.c(p.a.e(d.c(this.collectionName.hashCode() * 31, 31, this.insuranceDuration), 31, this.investmentLimits), 31, this.campaignId), 31, this.headerImage), 31, this.promotionType);
    }
}
