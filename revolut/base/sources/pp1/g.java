package pp1;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004¨\u0006\u001e"}, d2 = {"Lpp1/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "b", "getType", "type", "c", "getDigitableLine", "digitableLine", "Ljo3/a;", "d", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "e", "getPocketId", "pocketId", "f", "getScheduledDate", "scheduledDate", "g", "getCounterpartyId", "counterpartyId", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitableLine")
    private final String digitableLine;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpartyId")
    private final String counterpartyId;

    public g(String paymentMethod, String type, String str, jo3.a amount, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.paymentMethod = paymentMethod;
        this.type = type;
        this.digitableLine = str;
        this.amount = amount;
        this.pocketId = str2;
        this.scheduledDate = str3;
        this.counterpartyId = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.paymentMethod, gVar.paymentMethod) && Intrinsics.f(this.type, gVar.type) && Intrinsics.f(this.digitableLine, gVar.digitableLine) && Intrinsics.f(this.amount, gVar.amount) && Intrinsics.f(this.pocketId, gVar.pocketId) && Intrinsics.f(this.scheduledDate, gVar.scheduledDate) && Intrinsics.f(this.counterpartyId, gVar.counterpartyId);
    }

    public final int hashCode() {
        int iC = p.a.c(this.paymentMethod.hashCode() * 31, 31, this.type);
        String str = this.digitableLine;
        int iJ = v7.j(this.amount, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.pocketId;
        int iHashCode = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.scheduledDate;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.counterpartyId;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }
}
