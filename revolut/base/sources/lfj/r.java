package lfj;

import kfj.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Llfj/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPocketId", "pocketId", "b", "getPocketCurrency", "pocketCurrency", "Lkfj/m2;", "c", "Lkfj/m2;", "getPointsRedemption", "()Lkfj/m2;", "pointsRedemption", "", "d", "Ljava/lang/Boolean;", "getUseRevPointsForRecurring", "()Ljava/lang/Boolean;", "useRevPointsForRecurring", "Ljo3/a;", "e", "Ljo3/a;", "getPrice", "()Ljo3/a;", "price", "Llfj/x;", "f", "Llfj/x;", "getTerms", "()Llfj/x;", "terms", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketCurrency")
    private final String pocketCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRedemptionOption")
    private final m2 pointsRedemption;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("useRevPointsForRecurring")
    private final Boolean useRevPointsForRecurring;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("price")
    private final jo3.a price;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("terms")
    private final x terms;

    public r(String str, String str2, m2 m2Var, Boolean bool, jo3.a aVar, x xVar) {
        this.pocketId = str;
        this.pocketCurrency = str2;
        this.pointsRedemption = m2Var;
        this.useRevPointsForRecurring = bool;
        this.price = aVar;
        this.terms = xVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.pocketId, rVar.pocketId) && Intrinsics.f(this.pocketCurrency, rVar.pocketCurrency) && Intrinsics.f(this.pointsRedemption, rVar.pointsRedemption) && Intrinsics.f(this.useRevPointsForRecurring, rVar.useRevPointsForRecurring) && Intrinsics.f(this.price, rVar.price) && Intrinsics.f(this.terms, rVar.terms);
    }

    public final int hashCode() {
        String str = this.pocketId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pocketCurrency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        m2 m2Var = this.pointsRedemption;
        int iHashCode3 = (iHashCode2 + (m2Var == null ? 0 : m2Var.hashCode())) * 31;
        Boolean bool = this.useRevPointsForRecurring;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        jo3.a aVar = this.price;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        x xVar = this.terms;
        return iHashCode5 + (xVar != null ? xVar.hashCode() : 0);
    }
}
