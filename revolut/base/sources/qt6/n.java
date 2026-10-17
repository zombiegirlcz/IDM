package qt6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\u0004R\"\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\"\u00101\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u001c\u00107\u001a\u0004\u0018\u0001028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010=\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\u0004R\u001c\u0010F\u001a\u0004\u0018\u00010A8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lqt6/n;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getNumberPrefix", "numberPrefix", "b", "getNumber", "number", "", "c", "Ljava/lang/Long;", "getIssueDate", "()Ljava/lang/Long;", "issueDate", "d", "getSaleDate", "saleDate", "e", "getDueDate", "dueDate", "f", "getCurrency", "currency", "g", "getCustomerId", "customerId", "h", "getCustomerMessage", "customerMessage", "", "Lqt6/o;", "i", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "items", "j", "getAdditionalNote", "additionalNote", "k", "getEnabledPaymentMethods", "enabledPaymentMethods", "Lqt6/e;", "l", "getEnabledReminders", "enabledReminders", "Lqt6/q;", "m", "Lqt6/q;", "getRecurringSchedule", "()Lqt6/q;", "recurringSchedule", "Lqt6/p;", "n", "Lqt6/p;", "getSupplierDetails", "()Lqt6/p;", "supplierDetails", "o", "getTemplateId", "templateId", "Lr9d/c;", "p", "Lr9d/c;", "getTemplateOverride", "()Lr9d/c;", "templateOverride", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberPrefix")
    private final String numberPrefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("issueDate")
    private final Long issueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("saleDate")
    private final Long saleDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dueDate")
    private final Long dueDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerId")
    private final String customerId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customerMessage")
    private final String customerMessage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("items")
    private final List<o> items;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalNote")
    private final String additionalNote;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("enabledPaymentMethods")
    private final List<String> enabledPaymentMethods;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("reminders")
    private final List<e> enabledReminders;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("recurringSchedule")
    private final q recurringSchedule;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("supplierDetails")
    private final p supplierDetails;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("templateId")
    private final String templateId;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("templateOverrides")
    private final r9d.c templateOverride;

    public n() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.numberPrefix, nVar.numberPrefix) && Intrinsics.f(this.number, nVar.number) && Intrinsics.f(this.issueDate, nVar.issueDate) && Intrinsics.f(this.saleDate, nVar.saleDate) && Intrinsics.f(this.dueDate, nVar.dueDate) && Intrinsics.f(this.currency, nVar.currency) && Intrinsics.f(this.customerId, nVar.customerId) && Intrinsics.f(this.customerMessage, nVar.customerMessage) && Intrinsics.f(this.items, nVar.items) && Intrinsics.f(this.additionalNote, nVar.additionalNote) && Intrinsics.f(this.enabledPaymentMethods, nVar.enabledPaymentMethods) && Intrinsics.f(this.enabledReminders, nVar.enabledReminders) && Intrinsics.f(this.recurringSchedule, nVar.recurringSchedule) && Intrinsics.f(this.supplierDetails, nVar.supplierDetails) && Intrinsics.f(this.templateId, nVar.templateId) && Intrinsics.f(this.templateOverride, nVar.templateOverride);
    }

    public final int hashCode() {
        String str = this.numberPrefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.number;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.issueDate;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.saleDate;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.dueDate;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerId;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerMessage;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<o> list = this.items;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.additionalNote;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list2 = this.enabledPaymentMethods;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<e> list3 = this.enabledReminders;
        int iHashCode12 = (iHashCode11 + (list3 == null ? 0 : list3.hashCode())) * 31;
        q qVar = this.recurringSchedule;
        int iHashCode13 = (iHashCode12 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        p pVar = this.supplierDetails;
        int iHashCode14 = (iHashCode13 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str7 = this.templateId;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        r9d.c cVar = this.templateOverride;
        return iHashCode15 + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ n(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public n(String str, String str2, Long l2, Long l3, Long l4, String str3, String str4, String str5, ArrayList arrayList, String str6, ArrayList arrayList2, ArrayList arrayList3, q qVar, p pVar, String str7, r9d.c cVar) {
        this.numberPrefix = str;
        this.number = str2;
        this.issueDate = l2;
        this.saleDate = l3;
        this.dueDate = l4;
        this.currency = str3;
        this.customerId = str4;
        this.customerMessage = str5;
        this.items = arrayList;
        this.additionalNote = str6;
        this.enabledPaymentMethods = arrayList2;
        this.enabledReminders = arrayList3;
        this.recurringSchedule = qVar;
        this.supplierDetails = pVar;
        this.templateId = str7;
        this.templateOverride = cVar;
    }
}
