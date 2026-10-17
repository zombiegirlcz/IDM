package wn9;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0003\u000b\u0007\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lwn9/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "i", "type", "c", "h", "state", "d", "label", "e", "name", "f", "logoUrl", "Lwn9/a$c;", "g", "Lwn9/a$c;", "()Lwn9/a$c;", "settings", "", "Lwn9/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "references", "Lwn9/a$a;", "Lwn9/a$a;", "()Lwn9/a$a;", "attributes", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("logoUrl")
    private final String logoUrl;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("settings")
    private final c settings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("references")
    private final List<b> references;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("attributes")
    private final C1650a attributes;

    /* JADX INFO: renamed from: wn9.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lwn9/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "billerId", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1650a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("billerId")
        private final String billerId;

        public C1650a(String str) {
            this.billerId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBillerId() {
            return this.billerId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C1650a) && Intrinsics.f(this.billerId, ((C1650a) obj2).billerId);
        }

        public final int hashCode() {
            String str = this.billerId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lwn9/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "name", "label", "c", "value", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        public b(String name, String label, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(value, "value");
            this.name = name;
            this.label = label;
            this.value = value;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.value, bVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + p.a.c(this.name.hashCode() * 31, 31, this.label);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Lwn9/a$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "supportsPaymentReminders", "b", "showAsContacts", "labelEditable", "feature_payment_counterparty_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("supportsPaymentReminders")
        private final boolean supportsPaymentReminders;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("showAsContacts")
        private final boolean showAsContacts;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("labelEditable")
        private final boolean labelEditable;

        public c(boolean z, boolean z3, boolean z4) {
            this.supportsPaymentReminders = z;
            this.showAsContacts = z3;
            this.labelEditable = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getLabelEditable() {
            return this.labelEditable;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getShowAsContacts() {
            return this.showAsContacts;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getSupportsPaymentReminders() {
            return this.supportsPaymentReminders;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.supportsPaymentReminders == cVar.supportsPaymentReminders && this.showAsContacts == cVar.showAsContacts && this.labelEditable == cVar.labelEditable;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.labelEditable) + j6.a.c(Boolean.hashCode(this.supportsPaymentReminders) * 31, 31, this.showAsContacts);
        }
    }

    public a(String id10, String type, String state, String str, String str2, String str3, c cVar, ArrayList arrayList, C1650a c1650a) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = id10;
        this.type = type;
        this.state = state;
        this.label = str;
        this.name = str2;
        this.logoUrl = str3;
        this.settings = cVar;
        this.references = arrayList;
        this.attributes = c1650a;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C1650a getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.logoUrl, aVar.logoUrl) && Intrinsics.f(this.settings, aVar.settings) && Intrinsics.f(this.references, aVar.references) && Intrinsics.f(this.attributes, aVar.attributes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getReferences() {
        return this.references;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getSettings() {
        return this.settings;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.type), 31, this.state);
        String str = this.label;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logoUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c cVar = this.settings;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        List<b> list = this.references;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C1650a c1650a = this.attributes;
        return iHashCode5 + (c1650a != null ? c1650a.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
