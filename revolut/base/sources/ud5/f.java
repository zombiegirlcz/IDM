package ud5;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\t\u0010\u0011R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Lud5/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "addressUrl", "c", "h", "transactionUrl", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "availableWithdrawalBlockchains", "availableDeFiWithdrawalBlockchains", "f", "availableDepositBlockchains", "", "Ljo3/a;", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "minimumDeposit", "Lud5/k;", "Lud5/k;", "()Lud5/k;", "revStablecoinDetails", "Companion", "feature_crypto_config_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressUrl")
    @NotNull
    private final String addressUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionUrl")
    @NotNull
    private final String transactionUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("availableWithdrawalBlockchains")
    private final List<String> availableWithdrawalBlockchains;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("availableDeFiWithdrawalBlockchains")
    private final List<String> availableDeFiWithdrawalBlockchains;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("availableDepositBlockchains")
    private final List<String> availableDepositBlockchains;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumDeposit")
    private final Map<String, jo3.a> minimumDeposit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("revStablecoin")
    private final k revStablecoinDetails;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddressUrl() {
        return this.addressUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAvailableDeFiWithdrawalBlockchains() {
        return this.availableDeFiWithdrawalBlockchains;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getAvailableDepositBlockchains() {
        return this.availableDepositBlockchains;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getAvailableWithdrawalBlockchains() {
        return this.availableWithdrawalBlockchains;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.addressUrl, fVar.addressUrl) && Intrinsics.f(this.transactionUrl, fVar.transactionUrl) && Intrinsics.f(this.availableWithdrawalBlockchains, fVar.availableWithdrawalBlockchains) && Intrinsics.f(this.availableDeFiWithdrawalBlockchains, fVar.availableDeFiWithdrawalBlockchains) && Intrinsics.f(this.availableDepositBlockchains, fVar.availableDepositBlockchains) && Intrinsics.f(this.minimumDeposit, fVar.minimumDeposit) && Intrinsics.f(this.revStablecoinDetails, fVar.revStablecoinDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getMinimumDeposit() {
        return this.minimumDeposit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final k getRevStablecoinDetails() {
        return this.revStablecoinDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransactionUrl() {
        return this.transactionUrl;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.addressUrl), 31, this.transactionUrl);
        List<String> list = this.availableWithdrawalBlockchains;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.availableDeFiWithdrawalBlockchains;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.availableDepositBlockchains;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, jo3.a> map = this.minimumDeposit;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        k kVar = this.revStablecoinDetails;
        return iHashCode4 + (kVar != null ? kVar.hashCode() : 0);
    }
}
