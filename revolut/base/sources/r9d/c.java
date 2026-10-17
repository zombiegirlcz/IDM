package r9d;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r9d.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00172\u00020\u0001:\u0002\t\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lr9d/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "locale", "b", "d", "invoiceTitle", "", "Lr9d/b$b;", "c", "Ljava/util/List;", "()Ljava/util/List;", "customFields", "Lr9d/c$b;", "Lr9d/c$b;", "()Lr9d/c$b;", "header", "footer", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locale")
    private final String locale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("invoiceTitle")
    private final String invoiceTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("customFields")
    private final List<b.C1393b> customFields;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("header")
    private final b header;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("footer")
    private final b footer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lr9d/c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "action", "b", "value", "Companion", "feature_shared_invoices_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValue() {
            return this.value;
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

    public c() {
        this(null, null, null, null, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCustomFields() {
        return this.customFields;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInvoiceTitle() {
        return this.invoiceTitle;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.locale, cVar.locale) && Intrinsics.f(this.invoiceTitle, cVar.invoiceTitle) && Intrinsics.f(this.customFields, cVar.customFields) && Intrinsics.f(this.header, cVar.header) && Intrinsics.f(this.footer, cVar.footer);
    }

    public final int hashCode() {
        String str = this.locale;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.invoiceTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<b.C1393b> list = this.customFields;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        b bVar = this.header;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.footer;
        return iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    public c(String str, String str2, ArrayList arrayList, b bVar, b bVar2) {
        this.locale = str;
        this.invoiceTitle = str2;
        this.customFields = arrayList;
        this.header = bVar;
        this.footer = bVar2;
    }
}
