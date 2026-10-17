package dz1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ldz1/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "Ldz1/h;", "b", "Ldz1/h;", "getPaymentMethodDetails", "()Ldz1/h;", "paymentMethodDetails", "Ljo3/a;", "c", "Ljo3/a;", "getTransactionLimit", "()Ljo3/a;", "transactionLimit", "d", "getPocketId", "pocketId", "e", "getCreditorId", "creditorId", "f", "getStartDate", "startDate", "g", "getExpirationDate", "expirationDate", "Lk02/d;", "h", "Lk02/d;", "getSettings", "()Lk02/d;", "settings", "feature_apm_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodDetails")
    @NotNull
    private final h paymentMethodDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactionLimit")
    private final jo3.a transactionLimit;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("creditorId")
    private final String creditorId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expirationDate")
    private final String expirationDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    private final k02.d settings;

    public i(String paymentMethod, h paymentMethodDetails, jo3.a aVar, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(paymentMethodDetails, "paymentMethodDetails");
        this.paymentMethod = paymentMethod;
        this.paymentMethodDetails = paymentMethodDetails;
        this.transactionLimit = aVar;
        this.pocketId = str;
        this.creditorId = str2;
        this.startDate = str3;
        this.expirationDate = str4;
        this.settings = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.paymentMethod, iVar.paymentMethod) && Intrinsics.f(this.paymentMethodDetails, iVar.paymentMethodDetails) && Intrinsics.f(this.transactionLimit, iVar.transactionLimit) && Intrinsics.f(this.pocketId, iVar.pocketId) && Intrinsics.f(this.creditorId, iVar.creditorId) && Intrinsics.f(this.startDate, iVar.startDate) && Intrinsics.f(this.expirationDate, iVar.expirationDate) && Intrinsics.f(this.settings, iVar.settings);
    }

    public final int hashCode() {
        int iHashCode = (this.paymentMethodDetails.hashCode() + (this.paymentMethod.hashCode() * 31)) * 31;
        jo3.a aVar = this.transactionLimit;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.pocketId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.creditorId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDate;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationDate;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k02.d dVar = this.settings;
        return iHashCode6 + (dVar != null ? dVar.hashCode() : 0);
    }
}
