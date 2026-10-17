package dj9;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0004R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0004¨\u0006\u001f"}, d2 = {"Ldj9/d;", "", "", "toString", "()Ljava/lang/String;", "Ldj9/q;", "a", "Ldj9/q;", "d", "()Ldj9/q;", "currentPromotion", "", "Ldj9/c0;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "upcomingPromotions", "c", "Ljava/lang/String;", "currentDate", "countryCode", "Ldj9/a0;", "e", "f", "termsDetails", "", "J", "()J", "minFeeAmount", "currency", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentPromotion")
    private final q currentPromotion;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upcomingPromotions")
    @NotNull
    private final List<c0> upcomingPromotions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentDate")
    @NotNull
    private final String currentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("countryCode")
    @NotNull
    private final String countryCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("termsDetails")
    @NotNull
    private final List<a0> termsDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("minFeeAmount")
    private final long minFeeAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final q getCurrentPromotion() {
        return this.currentPromotion;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMinFeeAmount() {
        return this.minFeeAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.currentPromotion, dVar.currentPromotion) && Intrinsics.f(this.upcomingPromotions, dVar.upcomingPromotions) && Intrinsics.f(this.currentDate, dVar.currentDate) && Intrinsics.f(this.countryCode, dVar.countryCode) && Intrinsics.f(this.termsDetails, dVar.termsDetails) && this.minFeeAmount == dVar.minFeeAmount && Intrinsics.f(this.currency, dVar.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTermsDetails() {
        return this.termsDetails;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getUpcomingPromotions() {
        return this.upcomingPromotions;
    }

    public final int hashCode() {
        q qVar = this.currentPromotion;
        return this.currency.hashCode() + a0.d.c(p.a.d(p.a.c(p.a.c(p.a.d((qVar == null ? 0 : qVar.hashCode()) * 31, 31, this.upcomingPromotions), 31, this.currentDate), 31, this.countryCode), 31, this.termsDetails), 31, this.minFeeAmount);
    }
}
