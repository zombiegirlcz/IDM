package r9d;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r9d.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u0000 (2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\u0004¨\u0006)"}, d2 = {"Lr9d/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTemplateName", "templateName", "b", "getInvoiceTitle", "invoiceTitle", "", "c", "Z", "getLogoEnabled", "()Z", "logoEnabled", "d", "getVatNumberEnabled", "vatNumberEnabled", "e", "getBankTransferDetailsEnabled", "bankTransferDetailsEnabled", "", "Lr9d/b$b;", "f", "Ljava/util/List;", "getCustomFields", "()Ljava/util/List;", "customFields", "g", "getLocale", "locale", "h", "getHeader", "header", "i", "getFooter", "footer", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String templateName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("invoiceTitle")
    @NotNull
    private final String invoiceTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoEnabled")
    private final boolean logoEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("vatNumberEnabled")
    private final boolean vatNumberEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankTransferDetailsEnabled")
    private final boolean bankTransferDetailsEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customFields")
    @NotNull
    private final List<b.C1393b> customFields;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("locale")
    private final String locale;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    private final String header;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    public a(String templateName, String invoiceTitle, boolean z, boolean z3, boolean z4, ArrayList customFields, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(invoiceTitle, "invoiceTitle");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        this.templateName = templateName;
        this.invoiceTitle = invoiceTitle;
        this.logoEnabled = z;
        this.vatNumberEnabled = z3;
        this.bankTransferDetailsEnabled = z4;
        this.customFields = customFields;
        this.locale = str;
        this.header = str2;
        this.footer = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.templateName, aVar.templateName) && Intrinsics.f(this.invoiceTitle, aVar.invoiceTitle) && this.logoEnabled == aVar.logoEnabled && this.vatNumberEnabled == aVar.vatNumberEnabled && this.bankTransferDetailsEnabled == aVar.bankTransferDetailsEnabled && Intrinsics.f(this.customFields, aVar.customFields) && Intrinsics.f(this.locale, aVar.locale) && Intrinsics.f(this.header, aVar.header) && Intrinsics.f(this.footer, aVar.footer);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c(p.a.c(this.templateName.hashCode() * 31, 31, this.invoiceTitle), 31, this.logoEnabled), 31, this.vatNumberEnabled), 31, this.bankTransferDetailsEnabled), 31, this.customFields);
        String str = this.locale;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.header;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.footer;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
