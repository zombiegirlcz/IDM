package vd5;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000  2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\t\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R(\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Lvd5/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "addressUrl", "c", "h", "transactionUrl", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "availableWithdrawalBlockchains", "availableDeFiWithdrawalBlockchains", "f", "availableDepositBlockchains", "", "Ljo3/a;", "g", "Ljava/util/Map;", "()Ljava/util/Map;", "minimumDeposit", "Lvd5/d;", "Lvd5/d;", "()Lvd5/d;", "revStablecoinDetailsEntity", "Companion", "feature_crypto_config_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

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
    @NotNull
    private final List<String> availableWithdrawalBlockchains;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("availableDeFiWithdrawalBlockchains")
    private final List<String> availableDeFiWithdrawalBlockchains;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("availableDepositBlockchains")
    @NotNull
    private final List<String> availableDepositBlockchains;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumDeposit")
    private final Map<String, jo3.a> minimumDeposit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("revStablecoinDetails")
    private final d revStablecoinDetailsEntity;

    public c(String id10, String addressUrl, String transactionUrl, ArrayList availableWithdrawalBlockchains, ArrayList arrayList, ArrayList availableDepositBlockchains, LinkedHashMap linkedHashMap, d dVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(addressUrl, "addressUrl");
        Intrinsics.checkNotNullParameter(transactionUrl, "transactionUrl");
        Intrinsics.checkNotNullParameter(availableWithdrawalBlockchains, "availableWithdrawalBlockchains");
        Intrinsics.checkNotNullParameter(availableDepositBlockchains, "availableDepositBlockchains");
        this.id = id10;
        this.addressUrl = addressUrl;
        this.transactionUrl = transactionUrl;
        this.availableWithdrawalBlockchains = availableWithdrawalBlockchains;
        this.availableDeFiWithdrawalBlockchains = arrayList;
        this.availableDepositBlockchains = availableDepositBlockchains;
        this.minimumDeposit = linkedHashMap;
        this.revStablecoinDetailsEntity = dVar;
    }

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
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.addressUrl, cVar.addressUrl) && Intrinsics.f(this.transactionUrl, cVar.transactionUrl) && Intrinsics.f(this.availableWithdrawalBlockchains, cVar.availableWithdrawalBlockchains) && Intrinsics.f(this.availableDeFiWithdrawalBlockchains, cVar.availableDeFiWithdrawalBlockchains) && Intrinsics.f(this.availableDepositBlockchains, cVar.availableDepositBlockchains) && Intrinsics.f(this.minimumDeposit, cVar.minimumDeposit) && Intrinsics.f(this.revStablecoinDetailsEntity, cVar.revStablecoinDetailsEntity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getMinimumDeposit() {
        return this.minimumDeposit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getRevStablecoinDetailsEntity() {
        return this.revStablecoinDetailsEntity;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTransactionUrl() {
        return this.transactionUrl;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.addressUrl), 31, this.transactionUrl), 31, this.availableWithdrawalBlockchains);
        List<String> list = this.availableDeFiWithdrawalBlockchains;
        int iD2 = p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.availableDepositBlockchains);
        Map<String, jo3.a> map = this.minimumDeposit;
        int iHashCode = (iD2 + (map == null ? 0 : map.hashCode())) * 31;
        d dVar = this.revStablecoinDetailsEntity;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }
}
