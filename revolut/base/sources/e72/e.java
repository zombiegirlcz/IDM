package e72;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001b"}, d2 = {"Le72/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "f", "pin", "e", "operationIdentifier", "d", "merchantName", "h", "revolutCardId", "i", "serviceCardNumber", "Ljo3/a;", "g", "Ljo3/a;", "()Ljo3/a;", "amount", "purchasedDate", "expirationDate", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pin")
    @NotNull
    private final String pin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("operationIdentifier")
    @NotNull
    private final String operationIdentifier;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("merchantName")
    @NotNull
    private final String merchantName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("revolutCardId")
    @NotNull
    private final String revolutCardId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("serviceCardNumber")
    @NotNull
    private final String serviceCardNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseDate")
    @NotNull
    private final String purchasedDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("expirationDate")
    @NotNull
    private final String expirationDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getOperationIdentifier() {
        return this.operationIdentifier;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.pin, eVar.pin) && Intrinsics.f(this.operationIdentifier, eVar.operationIdentifier) && Intrinsics.f(this.merchantName, eVar.merchantName) && Intrinsics.f(this.revolutCardId, eVar.revolutCardId) && Intrinsics.f(this.serviceCardNumber, eVar.serviceCardNumber) && Intrinsics.f(this.amount, eVar.amount) && Intrinsics.f(this.purchasedDate, eVar.purchasedDate) && Intrinsics.f(this.expirationDate, eVar.expirationDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getPurchasedDate() {
        return this.purchasedDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getRevolutCardId() {
        return this.revolutCardId;
    }

    public final int hashCode() {
        return this.expirationDate.hashCode() + p.a.c(v7.j(this.amount, p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.pin), 31, this.operationIdentifier), 31, this.merchantName), 31, this.revolutCardId), 31, this.serviceCardNumber), 31), 31, this.purchasedDate);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getServiceCardNumber() {
        return this.serviceCardNumber;
    }
}
