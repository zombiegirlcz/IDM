package pr1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import xo1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lpr1/a;", "Lxo1/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getDebtId", "debtId", "b", "getProductId", "productId", "c", "getProductLabel", "productLabel", "d", "getReferenceValue", "referenceValue", "e", "getAmountType", "amountType", "f", "getServiceProviderId", "serviceProviderId", "feature_apm_bills_tapi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("debtId")
    private final String debtId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("productId")
    private final String productId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("productLabel")
    private final String productLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("referenceValue")
    private final String referenceValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("amountType")
    private final String amountType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("serviceProviderId")
    private final String serviceProviderId;

    public a(String str, String str2, String str3, String str4, String str5, String str6) {
        this.debtId = str;
        this.productId = str2;
        this.productLabel = str3;
        this.referenceValue = str4;
        this.amountType = str5;
        this.serviceProviderId = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.debtId, aVar.debtId) && Intrinsics.f(this.productId, aVar.productId) && Intrinsics.f(this.productLabel, aVar.productLabel) && Intrinsics.f(this.referenceValue, aVar.referenceValue) && Intrinsics.f(this.amountType, aVar.amountType) && Intrinsics.f(this.serviceProviderId, aVar.serviceProviderId);
    }

    public final int hashCode() {
        String str = this.debtId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productLabel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.referenceValue;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.amountType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.serviceProviderId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
