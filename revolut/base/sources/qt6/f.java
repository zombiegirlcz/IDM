package qt6;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\b\u001a\u0004\b\u0019\u0010\nR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0015\u0010!R\u001c\u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b$\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b\u001f\u0010!R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\f\u0010\u0004¨\u0006-"}, d2 = {"Lqt6/f;", "", "", "toString", "()Ljava/lang/String;", "", "Lqt6/d;", "a", "Ljava/util/List;", "n", "()Ljava/util/List;", "paymentMethodsDetails", "b", "Ljava/lang/String;", "g", "defaultIssueDate", "c", "l", "defaultSaleDate", "d", "defaultDueDate", "e", "defaultAdditionalNote", "Lqt6/g;", "f", "k", "defaultReminders", "h", "defaultPaymentMethods", "defaultInvoicePrefix", "", "i", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "defaultInvoiceNumber", "", "j", "Ljava/lang/Boolean;", "m", "()Ljava/lang/Boolean;", "logoEnabled", "defaultRecurringPeriod", "defaultRecurringLimit", "defaultCustomerMessage", "defaultCurrency", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethodsDetails")
    @NotNull
    private final List<d> paymentMethodsDetails;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultIssueDate")
    private final String defaultIssueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultSaleDate")
    private final String defaultSaleDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("defaultDueDate")
    private final String defaultDueDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("defaultAdditionalNote")
    private final String defaultAdditionalNote;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("defaultReminders")
    private final List<g> defaultReminders;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultPaymentMethods")
    private final List<String> defaultPaymentMethods;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultInvoicePrefix")
    private final String defaultInvoicePrefix;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("defaultInvoiceNumber")
    private final Integer defaultInvoiceNumber;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoEnabled")
    private final Boolean logoEnabled;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("defaultRecurringPeriod")
    private final String defaultRecurringPeriod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultRecurringLimit")
    private final Integer defaultRecurringLimit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCustomerMessage")
    private final String defaultCustomerMessage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultCurrency")
    private final String defaultCurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDefaultAdditionalNote() {
        return this.defaultAdditionalNote;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultCurrency() {
        return this.defaultCurrency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultCustomerMessage() {
        return this.defaultCustomerMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDefaultDueDate() {
        return this.defaultDueDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getDefaultInvoiceNumber() {
        return this.defaultInvoiceNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.paymentMethodsDetails, fVar.paymentMethodsDetails) && Intrinsics.f(this.defaultIssueDate, fVar.defaultIssueDate) && Intrinsics.f(this.defaultSaleDate, fVar.defaultSaleDate) && Intrinsics.f(this.defaultDueDate, fVar.defaultDueDate) && Intrinsics.f(this.defaultAdditionalNote, fVar.defaultAdditionalNote) && Intrinsics.f(this.defaultReminders, fVar.defaultReminders) && Intrinsics.f(this.defaultPaymentMethods, fVar.defaultPaymentMethods) && Intrinsics.f(this.defaultInvoicePrefix, fVar.defaultInvoicePrefix) && Intrinsics.f(this.defaultInvoiceNumber, fVar.defaultInvoiceNumber) && Intrinsics.f(this.logoEnabled, fVar.logoEnabled) && Intrinsics.f(this.defaultRecurringPeriod, fVar.defaultRecurringPeriod) && Intrinsics.f(this.defaultRecurringLimit, fVar.defaultRecurringLimit) && Intrinsics.f(this.defaultCustomerMessage, fVar.defaultCustomerMessage) && Intrinsics.f(this.defaultCurrency, fVar.defaultCurrency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDefaultInvoicePrefix() {
        return this.defaultInvoicePrefix;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDefaultIssueDate() {
        return this.defaultIssueDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getDefaultPaymentMethods() {
        return this.defaultPaymentMethods;
    }

    public final int hashCode() {
        int iHashCode = this.paymentMethodsDetails.hashCode() * 31;
        String str = this.defaultIssueDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultSaleDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.defaultDueDate;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.defaultAdditionalNote;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<g> list = this.defaultReminders;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.defaultPaymentMethods;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.defaultInvoicePrefix;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.defaultInvoiceNumber;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.logoEnabled;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.defaultRecurringPeriod;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.defaultRecurringLimit;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.defaultCustomerMessage;
        int iHashCode13 = (iHashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.defaultCurrency;
        return iHashCode13 + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getDefaultRecurringLimit() {
        return this.defaultRecurringLimit;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getDefaultRecurringPeriod() {
        return this.defaultRecurringPeriod;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getDefaultReminders() {
        return this.defaultReminders;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getDefaultSaleDate() {
        return this.defaultSaleDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Boolean getLogoEnabled() {
        return this.logoEnabled;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getPaymentMethodsDetails() {
        return this.paymentMethodsDetails;
    }
}
