package ef2;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R(\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lef2/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTransactionType", "transactionType", "b", "getBeneficiaryId", "beneficiaryId", "c", "getMerchantId", "merchantId", "d", "getExternalRef", "externalRef", "e", "getMerchantRequestId", "merchantRequestId", "", "f", "Ljava/util/Map;", "getQrAttributes", "()Ljava/util/Map;", "qrAttributes", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionType")
    @NotNull
    private final String transactionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantId")
    private final String merchantId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("externalRef")
    private final String externalRef;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("merchantRequestId")
    private final String merchantRequestId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("qrAttributes")
    private final Map<String, String> qrAttributes;

    public f(String transactionType, String str, String str2, String str3, String str4, Map map) {
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        this.transactionType = transactionType;
        this.beneficiaryId = str;
        this.merchantId = str2;
        this.externalRef = str3;
        this.merchantRequestId = str4;
        this.qrAttributes = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.transactionType, fVar.transactionType) && Intrinsics.f(this.beneficiaryId, fVar.beneficiaryId) && Intrinsics.f(this.merchantId, fVar.merchantId) && Intrinsics.f(this.externalRef, fVar.externalRef) && Intrinsics.f(this.merchantRequestId, fVar.merchantRequestId) && Intrinsics.f(this.qrAttributes, fVar.qrAttributes);
    }

    public final int hashCode() {
        int iHashCode = this.transactionType.hashCode() * 31;
        String str = this.beneficiaryId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalRef;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.merchantRequestId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.qrAttributes;
        return iHashCode5 + (map != null ? map.hashCode() : 0);
    }
}
