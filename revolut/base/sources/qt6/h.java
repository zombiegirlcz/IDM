package qt6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010*\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u00100\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\u0004R\u001c\u00106\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b5\u0010\u0004¨\u00067"}, d2 = {"Lqt6/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getDefaultIssueDate", "defaultIssueDate", "b", "getDefaultSaleDate", "defaultSaleDate", "c", "getDefaultDueDate", "defaultDueDate", "d", "getDefaultAdditionalNote", "defaultAdditionalNote", "", "Lqt6/g;", "e", "Ljava/util/List;", "getDefaultReminders", "()Ljava/util/List;", "defaultReminders", "f", "getDefaultPaymentMethods", "defaultPaymentMethods", "g", "getDefaultInvoicePrefix", "defaultInvoicePrefix", "", "h", "Ljava/lang/Integer;", "getDefaultInvoiceNumber", "()Ljava/lang/Integer;", "defaultInvoiceNumber", "", "i", "Ljava/lang/Boolean;", "getLogoEnabled", "()Ljava/lang/Boolean;", "logoEnabled", "j", "getDefaultRecurringPeriod", "defaultRecurringPeriod", "k", "getDefaultRecurringLimit", "defaultRecurringLimit", "l", "getDefaultCustomerMessage", "defaultCustomerMessage", "m", "getDefaultCurrency", "defaultCurrency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultIssueDate")
    private final String defaultIssueDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultSaleDate")
    private final String defaultSaleDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultDueDate")
    private final String defaultDueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("defaultAdditionalNote")
    private final String defaultAdditionalNote;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("defaultReminders")
    private final List<g> defaultReminders;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("defaultPaymentMethods")
    private final List<String> defaultPaymentMethods;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultInvoicePrefix")
    private final String defaultInvoicePrefix;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultInvoiceNumber")
    private final Integer defaultInvoiceNumber;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("logoEnabled")
    private final Boolean logoEnabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultRecurringPeriod")
    private final String defaultRecurringPeriod;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("defaultRecurringLimit")
    private final Integer defaultRecurringLimit;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCustomerMessage")
    private final String defaultCustomerMessage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCurrency")
    private final String defaultCurrency;

    public h(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2, String str5, Integer num, Boolean bool, String str6, Integer num2, String str7, String str8) {
        this.defaultIssueDate = str;
        this.defaultSaleDate = str2;
        this.defaultDueDate = str3;
        this.defaultAdditionalNote = str4;
        this.defaultReminders = arrayList;
        this.defaultPaymentMethods = arrayList2;
        this.defaultInvoicePrefix = str5;
        this.defaultInvoiceNumber = num;
        this.logoEnabled = bool;
        this.defaultRecurringPeriod = str6;
        this.defaultRecurringLimit = num2;
        this.defaultCustomerMessage = str7;
        this.defaultCurrency = str8;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.defaultIssueDate, hVar.defaultIssueDate) && Intrinsics.f(this.defaultSaleDate, hVar.defaultSaleDate) && Intrinsics.f(this.defaultDueDate, hVar.defaultDueDate) && Intrinsics.f(this.defaultAdditionalNote, hVar.defaultAdditionalNote) && Intrinsics.f(this.defaultReminders, hVar.defaultReminders) && Intrinsics.f(this.defaultPaymentMethods, hVar.defaultPaymentMethods) && Intrinsics.f(this.defaultInvoicePrefix, hVar.defaultInvoicePrefix) && Intrinsics.f(this.defaultInvoiceNumber, hVar.defaultInvoiceNumber) && Intrinsics.f(this.logoEnabled, hVar.logoEnabled) && Intrinsics.f(this.defaultRecurringPeriod, hVar.defaultRecurringPeriod) && Intrinsics.f(this.defaultRecurringLimit, hVar.defaultRecurringLimit) && Intrinsics.f(this.defaultCustomerMessage, hVar.defaultCustomerMessage) && Intrinsics.f(this.defaultCurrency, hVar.defaultCurrency);
    }

    public final int hashCode() {
        String str = this.defaultIssueDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSaleDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultDueDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.defaultAdditionalNote;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<g> list = this.defaultReminders;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.defaultPaymentMethods;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.defaultInvoicePrefix;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.defaultInvoiceNumber;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.logoEnabled;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.defaultRecurringPeriod;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.defaultRecurringLimit;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.defaultCustomerMessage;
        int iHashCode12 = (iHashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.defaultCurrency;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }
}
