package i7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Li7c/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "creditFacilityId", "", "Li7c/b;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "payLaterOffers", "missingOfferReason", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditFacilityId")
    private final String creditFacilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("offers")
    @NotNull
    private final List<b> payLaterOffers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("missingOfferReason")
    private final String missingOfferReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCreditFacilityId() {
        return this.creditFacilityId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMissingOfferReason() {
        return this.missingOfferReason;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPayLaterOffers() {
        return this.payLaterOffers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.creditFacilityId, fVar.creditFacilityId) && Intrinsics.f(this.payLaterOffers, fVar.payLaterOffers) && Intrinsics.f(this.missingOfferReason, fVar.missingOfferReason);
    }

    public final int hashCode() {
        String str = this.creditFacilityId;
        int iD = p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.payLaterOffers);
        String str2 = this.missingOfferReason;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
