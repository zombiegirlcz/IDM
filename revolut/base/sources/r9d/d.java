package r9d;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r9d.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010*\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&¨\u0006,"}, d2 = {"Lr9d/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getTemplateName", "templateName", "b", "getInvoiceTitle", "invoiceTitle", "", "c", "Ljava/lang/Boolean;", "getLogoEnabled", "()Ljava/lang/Boolean;", "logoEnabled", "d", "getVatNumberEnabled", "vatNumberEnabled", "e", "getBankTransferDetailsEnabled", "bankTransferDetailsEnabled", "", "Lr9d/b$b;", "f", "Ljava/util/List;", "getCustomFields", "()Ljava/util/List;", "customFields", "g", "getLocale", "locale", "Lr9d/d$b;", "h", "Lr9d/d$b;", "getHeader", "()Lr9d/d$b;", "header", "i", "getFooter", "footer", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String templateName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("invoiceTitle")
    private final String invoiceTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("logoEnabled")
    private final Boolean logoEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("vatNumberEnabled")
    private final Boolean vatNumberEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("bankTransferDetailsEnabled")
    private final Boolean bankTransferDetailsEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customFields")
    private final List<b.C1393b> customFields;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("locale")
    private final String locale;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    private final b header;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("footer")
    private final b footer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lr9d/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getAction", "action", "b", "getValue", "value", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("action")
        @NotNull
        private final String action;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final String value;

        public b(String action, String str) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.action = action;
            this.value = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.action, bVar.action) && Intrinsics.f(this.value, bVar.value);
        }

        public final int hashCode() {
            int iHashCode = this.action.hashCode() * 31;
            String str = this.value;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    public d() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.templateName, dVar.templateName) && Intrinsics.f(this.invoiceTitle, dVar.invoiceTitle) && Intrinsics.f(this.logoEnabled, dVar.logoEnabled) && Intrinsics.f(this.vatNumberEnabled, dVar.vatNumberEnabled) && Intrinsics.f(this.bankTransferDetailsEnabled, dVar.bankTransferDetailsEnabled) && Intrinsics.f(this.customFields, dVar.customFields) && Intrinsics.f(this.locale, dVar.locale) && Intrinsics.f(this.header, dVar.header) && Intrinsics.f(this.footer, dVar.footer);
    }

    public final int hashCode() {
        String str = this.templateName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.invoiceTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.logoEnabled;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.vatNumberEnabled;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.bankTransferDetailsEnabled;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<b.C1393b> list = this.customFields;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.locale;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        b bVar = this.header;
        int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.footer;
        return iHashCode8 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public d(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, ArrayList arrayList, String str3, b bVar, b bVar2) {
        this.templateName = str;
        this.invoiceTitle = str2;
        this.logoEnabled = bool;
        this.vatNumberEnabled = bool2;
        this.bankTransferDetailsEnabled = bool3;
        this.customFields = arrayList;
        this.locale = str3;
        this.header = bVar;
        this.footer = bVar2;
    }
}
