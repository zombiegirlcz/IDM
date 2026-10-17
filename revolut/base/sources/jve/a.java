package jve;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\f\u0006\u0011\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010 \u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ljve/a;", "", "", "toString", "()Ljava/lang/String;", "Ljve/a$b;", "a", "Ljve/a$b;", "e", "()Ljve/a$b;", "institution", "Ljve/a$a;", "b", "Ljve/a$a;", "()Ljve/a$a;", "accountDetails", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "deletionAllowed", "Ljve/a$c;", "d", "Ljve/a$c;", "f", "()Ljve/a$c;", "linkedAccount", "eligibleForMandateCreation", "Ljve/a$d;", "Ljve/a$d;", "g", "()Ljve/a$d;", "mandate", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("institution")
    @NotNull
    private final b institution;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountDetails")
    @NotNull
    private final C1016a accountDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deletionAllowed")
    private final Boolean deletionAllowed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("linkedAccount")
    private final c linkedAccount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("eligibleForMandateCreation")
    private final Boolean eligibleForMandateCreation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("mandate")
    private final d mandate;

    /* JADX INFO: renamed from: jve.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0015"}, d2 = {"Ljve/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "accountLabel", "c", "e", "currencyCode", "d", "accountName", "", "Ljve/a$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "accountNumbers", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1016a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("accountLabel")
        @NotNull
        private final String accountLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currencyCode;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("accountName")
        @NotNull
        private final String accountName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("accountNumbers")
        private final List<C1017a> accountNumbers;

        /* JADX INFO: renamed from: jve.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Ljve/a$a$a;", "", "", "toString", "()Ljava/lang/String;", "", "Ljve/a$a$a$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "fields", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1017a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("fields")
            @NotNull
            private final List<C1018a> fields;

            /* JADX INFO: renamed from: jve.a$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Ljve/a$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "label", "b", "value", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1018a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("value")
                @NotNull
                private final String value;

                public C1018a(String label, String value) {
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.label = label;
                    this.value = value;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final String getValue() {
                    return this.value;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C1018a)) {
                        return false;
                    }
                    C1018a c1018a = (C1018a) obj2;
                    return Intrinsics.f(this.label, c1018a.label) && Intrinsics.f(this.value, c1018a.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + (this.label.hashCode() * 31);
                }
            }

            public C1017a(ArrayList fields) {
                Intrinsics.checkNotNullParameter(fields, "fields");
                this.fields = fields;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getFields() {
                return this.fields;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1017a) && Intrinsics.f(this.fields, ((C1017a) obj2).fields);
            }

            public final int hashCode() {
                return this.fields.hashCode();
            }
        }

        public C1016a(String id10, String accountLabel, String currencyCode, String accountName, List list) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountLabel, "accountLabel");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            this.id = id10;
            this.accountLabel = accountLabel;
            this.currencyCode = currencyCode;
            this.accountName = accountName;
            this.accountNumbers = list;
        }

        public static C1016a a(C1016a c1016a, String accountLabel) {
            String id10 = c1016a.id;
            String currencyCode = c1016a.currencyCode;
            String accountName = c1016a.accountName;
            List<C1017a> list = c1016a.accountNumbers;
            c1016a.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountLabel, "accountLabel");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(accountName, "accountName");
            return new C1016a(id10, accountLabel, currencyCode, accountName, list);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAccountLabel() {
            return this.accountLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final List getAccountNumbers() {
            return this.accountNumbers;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C1016a)) {
                return false;
            }
            C1016a c1016a = (C1016a) obj2;
            return Intrinsics.f(this.id, c1016a.id) && Intrinsics.f(this.accountLabel, c1016a.accountLabel) && Intrinsics.f(this.currencyCode, c1016a.currencyCode) && Intrinsics.f(this.accountName, c1016a.accountName) && Intrinsics.f(this.accountNumbers, c1016a.accountNumbers);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.accountLabel), 31, this.currencyCode), 31, this.accountName);
            List<C1017a> list = this.accountNumbers;
            return iC + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljve/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "name", "Ljve/a$b$a;", "Ljve/a$b$a;", "()Ljve/a$b$a;", "logo", "Lte6/a;", "d", "Lte6/a;", "()Lte6/a;", "topUpSettings", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("logo")
        private final C1019a logo;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("topUpSettings")
        private final te6.a topUpSettings;

        /* JADX INFO: renamed from: jve.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Ljve/a$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "type", "b", "value", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1019a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            public C1019a(String type, String value) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(value, "value");
                this.type = type;
                this.value = value;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1019a)) {
                    return false;
                }
                C1019a c1019a = (C1019a) obj2;
                return Intrinsics.f(this.type, c1019a.type) && Intrinsics.f(this.value, c1019a.value);
            }

            public final int hashCode() {
                return this.value.hashCode() + (this.type.hashCode() * 31);
            }
        }

        public b(String id10, String name, C1019a c1019a, te6.a aVar) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.id = id10;
            this.name = name;
            this.logo = c1019a;
            this.topUpSettings = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1019a getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final te6.a getTopUpSettings() {
            return this.topUpSettings;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.logo, bVar.logo) && Intrinsics.f(this.topUpSettings, bVar.topUpSettings);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.name);
            C1019a c1019a = this.logo;
            int iHashCode = (iC + (c1019a == null ? 0 : c1019a.hashCode())) * 31;
            te6.a aVar = this.topUpSettings;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Ljve/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "c", "state", "Ljo3/b;", "Ljo3/b;", "()Ljo3/b;", "balance", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "validUntil", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("balance")
        private final jo3.b balance;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("validUntil")
        private final Long validUntil;

        public c(String id10, String state, jo3.b bVar, Long l2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id10;
            this.state = state;
            this.balance = bVar;
            this.validUntil = l2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.b getBalance() {
            return this.balance;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Long getValidUntil() {
            return this.validUntil;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.state, cVar.state) && Intrinsics.f(this.balance, cVar.balance) && Intrinsics.f(this.validUntil, cVar.validUntil);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
            jo3.b bVar = this.balance;
            int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Long l2 = this.validUntil;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, d2 = {"Ljve/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "state", "", "c", "Z", "()Z", "hasEditableLimits", "Ljo3/b;", "d", "Ljo3/b;", "()Ljo3/b;", "maximumIndividualLimit", "e", "monthlyPeriodicLimit", "monthlyAmountRemaining", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("hasEditableLimits")
        private final boolean hasEditableLimits;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("maximumIndividualLimit")
        @NotNull
        private final jo3.b maximumIndividualLimit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("monthlyPeriodicLimit")
        private final jo3.b monthlyPeriodicLimit;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("amountRemaining")
        private final jo3.b monthlyAmountRemaining;

        public d(String id10, String str, boolean z, jo3.b maximumIndividualLimit, jo3.b bVar, jo3.b bVar2) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(maximumIndividualLimit, "maximumIndividualLimit");
            this.id = id10;
            this.state = str;
            this.hasEditableLimits = z;
            this.maximumIndividualLimit = maximumIndividualLimit;
            this.monthlyPeriodicLimit = bVar;
            this.monthlyAmountRemaining = bVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasEditableLimits() {
            return this.hasEditableLimits;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.b getMaximumIndividualLimit() {
            return this.maximumIndividualLimit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.b getMonthlyAmountRemaining() {
            return this.monthlyAmountRemaining;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.b getMonthlyPeriodicLimit() {
            return this.monthlyPeriodicLimit;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.state, dVar.state) && this.hasEditableLimits == dVar.hasEditableLimits && Intrinsics.f(this.maximumIndividualLimit, dVar.maximumIndividualLimit) && Intrinsics.f(this.monthlyPeriodicLimit, dVar.monthlyPeriodicLimit) && Intrinsics.f(this.monthlyAmountRemaining, dVar.monthlyAmountRemaining);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.state;
            int iE = y.e(this.maximumIndividualLimit, j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasEditableLimits), 31);
            jo3.b bVar = this.monthlyPeriodicLimit;
            int iHashCode2 = (iE + (bVar == null ? 0 : bVar.hashCode())) * 31;
            jo3.b bVar2 = this.monthlyAmountRemaining;
            return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        }
    }

    public a(b institution, C1016a accountDetails, Boolean bool, c cVar, Boolean bool2, d dVar) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        this.institution = institution;
        this.accountDetails = accountDetails;
        this.deletionAllowed = bool;
        this.linkedAccount = cVar;
        this.eligibleForMandateCreation = bool2;
        this.mandate = dVar;
    }

    public static a a(a aVar, C1016a c1016a, int i) {
        b institution = aVar.institution;
        if ((i & 2) != 0) {
            c1016a = aVar.accountDetails;
        }
        C1016a accountDetails = c1016a;
        Boolean bool = aVar.deletionAllowed;
        c cVar = (i & 8) != 0 ? aVar.linkedAccount : null;
        Boolean bool2 = aVar.eligibleForMandateCreation;
        d dVar = (i & 32) != 0 ? aVar.mandate : null;
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
        return new a(institution, accountDetails, bool, cVar, bool2, dVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C1016a getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getDeletionAllowed() {
        return this.deletionAllowed;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getEligibleForMandateCreation() {
        return this.eligibleForMandateCreation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getInstitution() {
        return this.institution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.institution, aVar.institution) && Intrinsics.f(this.accountDetails, aVar.accountDetails) && Intrinsics.f(this.deletionAllowed, aVar.deletionAllowed) && Intrinsics.f(this.linkedAccount, aVar.linkedAccount) && Intrinsics.f(this.eligibleForMandateCreation, aVar.eligibleForMandateCreation) && Intrinsics.f(this.mandate, aVar.mandate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final c getLinkedAccount() {
        return this.linkedAccount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final d getMandate() {
        return this.mandate;
    }

    public final int hashCode() {
        int iHashCode = (this.accountDetails.hashCode() + (this.institution.hashCode() * 31)) * 31;
        Boolean bool = this.deletionAllowed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        c cVar = this.linkedAccount;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Boolean bool2 = this.eligibleForMandateCreation;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        d dVar = this.mandate;
        return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
    }
}
