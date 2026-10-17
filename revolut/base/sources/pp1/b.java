package pp1;

import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xo1.k;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00109\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\u0004R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u0006\u001a\u0004\b;\u0010\u0004R\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\u0004¨\u0006@"}, d2 = {"Lpp1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPaymentMethod", "paymentMethod", "b", "getType", "type", "Ljo3/a;", "c", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "d", "getPocketId", "pocketId", "Lt02/d;", "e", "Lt02/d;", "getSource", "()Lt02/d;", "source", "", "Lgp1/a;", "f", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "inputs", "g", "getDigitableLine", "digitableLine", "Lpp1/a;", "h", "Lpp1/a;", "getDarfDetails", "()Lpp1/a;", "darfDetails", "i", "getBillId", "billId", "j", "getLabel", "label", "Lxo1/k;", "k", "Lxo1/k;", "getPaymentMethodDetails", "()Lxo1/k;", "paymentMethodDetails", "l", "getCounterpartyId", "counterpartyId", "m", "getFrequency", "frequency", "n", "getScheduledDate", "scheduledDate", "feature_apm_bills_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    @NotNull
    private final String paymentMethod;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pocketId")
    private final String pocketId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("source")
    private final t02.d source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("inputs")
    private final List<gp1.a> inputs;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitableLine")
    private final String digitableLine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("darfDetails")
    private final a darfDetails;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("billId")
    private final String billId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("paymentMethodDetails")
    private final k paymentMethodDetails;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterpartyId")
    private final String counterpartyId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("scheduledDate")
    private final String scheduledDate;

    public b(String paymentMethod, String type, jo3.a amount, String str, t02.d dVar, ArrayList arrayList, String str2, a aVar, String str3, String str4, k kVar, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.paymentMethod = paymentMethod;
        this.type = type;
        this.amount = amount;
        this.pocketId = str;
        this.source = dVar;
        this.inputs = arrayList;
        this.digitableLine = str2;
        this.darfDetails = aVar;
        this.billId = str3;
        this.label = str4;
        this.paymentMethodDetails = kVar;
        this.counterpartyId = str5;
        this.frequency = str6;
        this.scheduledDate = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.paymentMethod, bVar.paymentMethod) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.amount, bVar.amount) && Intrinsics.f(this.pocketId, bVar.pocketId) && Intrinsics.f(this.source, bVar.source) && Intrinsics.f(this.inputs, bVar.inputs) && Intrinsics.f(this.digitableLine, bVar.digitableLine) && Intrinsics.f(this.darfDetails, bVar.darfDetails) && Intrinsics.f(this.billId, bVar.billId) && Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.paymentMethodDetails, bVar.paymentMethodDetails) && Intrinsics.f(this.counterpartyId, bVar.counterpartyId) && Intrinsics.f(this.frequency, bVar.frequency) && Intrinsics.f(this.scheduledDate, bVar.scheduledDate);
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, p.a.c(this.paymentMethod.hashCode() * 31, 31, this.type), 31);
        String str = this.pocketId;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        t02.d dVar = this.source;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<gp1.a> list = this.inputs;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.digitableLine;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.darfDetails;
        int iHashCode5 = (iHashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.billId;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.label;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k kVar = this.paymentMethodDetails;
        int iHashCode8 = (iHashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str5 = this.counterpartyId;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.frequency;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.scheduledDate;
        return iHashCode10 + (str7 != null ? str7.hashCode() : 0);
    }
}
