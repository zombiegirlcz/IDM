package qt6;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010%\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010*\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010/\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010-\u001a\u0004\b\f\u0010.R\u001c\u00105\u001a\u0004\u0018\u0001008\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010;\u001a\u0004\u0018\u0001068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b\u001b\u0010>R\"\u0010A\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\b\u001d\u0010>R \u0010D\u001a\b\u0012\u0004\u0012\u00020B0<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010=\u001a\u0004\bC\u0010>R \u0010F\u001a\b\u0012\u0004\u0012\u00020E0<8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010=\u001a\u0004\b&\u0010>R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010H\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010J\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\b1\u0010\u0004R\u001c\u0010O\u001a\u0004\u0018\u00010K8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\b7\u0010NR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\bI\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010Q8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010R\u001a\u0004\bL\u0010S¨\u0006U"}, d2 = {"Lqt6/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "l", "number", "c", "m", "numberFormatted", "d", "n", "numberPrefix", "", "e", "Ljava/lang/Long;", "q", "()Ljava/lang/Long;", "saleDate", "f", "j", "issueDate", "g", "dueDate", "h", "currency", "r", "status", "Ljo3/a;", "Ljo3/a;", "y", "()Ljo3/a;", "total", "k", "t", "subtotal", "z", "totalTax", "customerId", "Lqt6/a;", "Lqt6/a;", "()Lqt6/a;", "customerDetails", "Lqt6/j;", "o", "Lqt6/j;", "u", "()Lqt6/j;", "supplierDetails", "Lqt6/i;", "p", "Lqt6/i;", "s", "()Lqt6/i;", "statusDetails", "", "Ljava/util/List;", "()Ljava/util/List;", "enabledPaymentMethods", "Lqt6/e;", "enabledReminders", "Lqt6/k;", "v", "taxes", "Lqt6/c;", "items", "additionalNote", "customerMessage", "w", "recurringInvoiceId", "Lqt6/q;", "x", "Lqt6/q;", "()Lqt6/q;", "recurringSchedule", "templateId", "Lr9d/c;", "Lr9d/c;", "()Lr9d/c;", "templateOverride", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    @NotNull
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("formattedNumber")
    @NotNull
    private final String numberFormatted;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("numberPrefix")
    @NotNull
    private final String numberPrefix;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("saleDate")
    private final Long saleDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("issueDate")
    private final Long issueDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("dueDate")
    private final Long dueDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("subtotal")
    @NotNull
    private final jo3.a subtotal;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTax")
    @NotNull
    private final jo3.a totalTax;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerId")
    private final String customerId;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerDetails")
    private final a customerDetails;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("supplierDetails")
    private final j supplierDetails;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("statusDetails")
    private final i statusDetails;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabledPaymentMethods")
    @NotNull
    private final List<String> enabledPaymentMethods;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabledReminders")
    private final List<e> enabledReminders;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxes")
    @NotNull
    private final List<k> taxes;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("items")
    @NotNull
    private final List<c> items;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("additionalNote")
    private final String additionalNote;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("customerMessage")
    private final String customerMessage;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringInvoiceId")
    private final String recurringInvoiceId;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringSchedule")
    private final q recurringSchedule;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("templateId")
    private final String templateId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("templateOverrides")
    private final r9d.c templateOverride;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditionalNote() {
        return this.additionalNote;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCustomerDetails() {
        return this.customerDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCustomerMessage() {
        return this.customerMessage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.number, bVar.number) && Intrinsics.f(this.numberFormatted, bVar.numberFormatted) && Intrinsics.f(this.numberPrefix, bVar.numberPrefix) && Intrinsics.f(this.saleDate, bVar.saleDate) && Intrinsics.f(this.issueDate, bVar.issueDate) && Intrinsics.f(this.dueDate, bVar.dueDate) && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.status, bVar.status) && Intrinsics.f(this.total, bVar.total) && Intrinsics.f(this.subtotal, bVar.subtotal) && Intrinsics.f(this.totalTax, bVar.totalTax) && Intrinsics.f(this.customerId, bVar.customerId) && Intrinsics.f(this.customerDetails, bVar.customerDetails) && Intrinsics.f(this.supplierDetails, bVar.supplierDetails) && Intrinsics.f(this.statusDetails, bVar.statusDetails) && Intrinsics.f(this.enabledPaymentMethods, bVar.enabledPaymentMethods) && Intrinsics.f(this.enabledReminders, bVar.enabledReminders) && Intrinsics.f(this.taxes, bVar.taxes) && Intrinsics.f(this.items, bVar.items) && Intrinsics.f(this.additionalNote, bVar.additionalNote) && Intrinsics.f(this.customerMessage, bVar.customerMessage) && Intrinsics.f(this.recurringInvoiceId, bVar.recurringInvoiceId) && Intrinsics.f(this.recurringSchedule, bVar.recurringSchedule) && Intrinsics.f(this.templateId, bVar.templateId) && Intrinsics.f(this.templateOverride, bVar.templateOverride);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getEnabledPaymentMethods() {
        return this.enabledPaymentMethods;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getEnabledReminders() {
        return this.enabledReminders;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.number), 31, this.numberFormatted), 31, this.numberPrefix);
        Long l2 = this.saleDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.issueDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.dueDate;
        int iJ = v7.j(this.totalTax, v7.j(this.subtotal, v7.j(this.total, p.a.c(p.a.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.currency), 31, this.status), 31), 31), 31);
        String str = this.customerId;
        int iHashCode3 = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.customerDetails;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        j jVar = this.supplierDetails;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i iVar = this.statusDetails;
        int iD = p.a.d((iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.enabledPaymentMethods);
        List<e> list = this.enabledReminders;
        int iD2 = p.a.d(p.a.d((iD + (list == null ? 0 : list.hashCode())) * 31, 31, this.taxes), 31, this.items);
        String str2 = this.additionalNote;
        int iHashCode6 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerMessage;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recurringInvoiceId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        q qVar = this.recurringSchedule;
        int iHashCode9 = (iHashCode8 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        String str5 = this.templateId;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        r9d.c cVar = this.templateOverride;
        return iHashCode10 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getIssueDate() {
        return this.issueDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getNumberFormatted() {
        return this.numberFormatted;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNumberPrefix() {
        return this.numberPrefix;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRecurringInvoiceId() {
        return this.recurringInvoiceId;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final q getRecurringSchedule() {
        return this.recurringSchedule;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Long getSaleDate() {
        return this.saleDate;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final i getStatusDetails() {
        return this.statusDetails;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final jo3.a getSubtotal() {
        return this.subtotal;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final j getSupplierDetails() {
        return this.supplierDetails;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final r9d.c getTemplateOverride() {
        return this.templateOverride;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final jo3.a getTotalTax() {
        return this.totalTax;
    }
}
