package r9d;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0002\n\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u0005\u0010\rR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006$"}, d2 = {"Lr9d/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "", "b", "Z", "k", "()Z", "isDefault", "c", "i", "templateName", "d", "f", "invoiceTitle", "h", "logoEnabled", "j", "vatNumberEnabled", "g", "bankTransferDetailsEnabled", "", "Lr9d/b$b;", "Ljava/util/List;", "()Ljava/util/List;", "customFields", "locale", "header", "footer", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("isDefault")
    private final boolean isDefault;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String templateName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("invoiceTitle")
    private final String invoiceTitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("logoEnabled")
    private final boolean logoEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("vatNumberEnabled")
    private final boolean vatNumberEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("bankTransferDetailsEnabled")
    private final boolean bankTransferDetailsEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("customFields")
    @NotNull
    private final List<C1393b> customFields;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("locale")
    private final String locale;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("header")
    private final String header;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("footer")
    private final String footer;

    /* JADX INFO: renamed from: r9d.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lr9d/b$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "name", "b", "value", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1393b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        public C1393b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1393b)) {
                return false;
            }
            C1393b c1393b = (C1393b) obj2;
            return Intrinsics.f(this.name, c1393b.name) && Intrinsics.f(this.value, c1393b.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.name.hashCode() * 31);
        }
    }

    public b(String id10, boolean z, String templateName, String str, boolean z3, boolean z4, boolean z6, ArrayList customFields, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(templateName, "templateName");
        Intrinsics.checkNotNullParameter(customFields, "customFields");
        this.id = id10;
        this.isDefault = z;
        this.templateName = templateName;
        this.invoiceTitle = str;
        this.logoEnabled = z3;
        this.vatNumberEnabled = z4;
        this.bankTransferDetailsEnabled = z6;
        this.customFields = customFields;
        this.locale = str2;
        this.header = str3;
        this.footer = str4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getBankTransferDetailsEnabled() {
        return this.bankTransferDetailsEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCustomFields() {
        return this.customFields;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && this.isDefault == bVar.isDefault && Intrinsics.f(this.templateName, bVar.templateName) && Intrinsics.f(this.invoiceTitle, bVar.invoiceTitle) && this.logoEnabled == bVar.logoEnabled && this.vatNumberEnabled == bVar.vatNumberEnabled && this.bankTransferDetailsEnabled == bVar.bankTransferDetailsEnabled && Intrinsics.f(this.customFields, bVar.customFields) && Intrinsics.f(this.locale, bVar.locale) && Intrinsics.f(this.header, bVar.header) && Intrinsics.f(this.footer, bVar.footer);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getLogoEnabled() {
        return this.logoEnabled;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(this.id.hashCode() * 31, 31, this.isDefault), 31, this.templateName);
        String str = this.invoiceTitle;
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.logoEnabled), 31, this.vatNumberEnabled), 31, this.bankTransferDetailsEnabled), 31, this.customFields);
        String str2 = this.locale;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.header;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.footer;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getVatNumberEnabled() {
        return this.vatNumberEnabled;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }
}
