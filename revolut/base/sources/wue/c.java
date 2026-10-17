package wue;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ro3.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\f\u0006\u0011\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lwue/c;", "", "", "toString", "()Ljava/lang/String;", "Lwue/c$b;", "a", "Lwue/c$b;", "d", "()Lwue/c$b;", "institution", "Lwue/c$a;", "b", "Lwue/c$a;", "()Lwue/c$a;", "accountDetails", "", "c", "Z", "()Z", "deletionAllowed", "Lwue/c$c;", "Lwue/c$c;", "e", "()Lwue/c$c;", "linkedAccount", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "eligibleForMandateCreation", "Lwue/c$d;", "f", "Lwue/c$d;", "()Lwue/c$d;", "mandate", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("institution")
    @NotNull
    private final b institution;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountDetails")
    @NotNull
    private final a accountDetails;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deletionAllowed")
    private final boolean deletionAllowed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("linkedAccount")
    private final C1661c linkedAccount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("eligibleForMandateCreation")
    private final Boolean eligibleForMandateCreation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("mandate")
    private final d mandate;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwue/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "accountLabel", "c", "d", "currency", "accountName", "", "Lwue/c$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "accountNumbers", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

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
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("accountName")
        @NotNull
        private final String accountName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("accountNumbers")
        @NotNull
        private final List<C1659a> accountNumbers;

        /* JADX INFO: renamed from: wue.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Lwue/c$a$a;", "", "", "toString", "()Ljava/lang/String;", "", "Lwue/c$a$a$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "fields", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1659a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("fields")
            @NotNull
            private final List<C1660a> fields;

            /* JADX INFO: renamed from: wue.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lwue/c$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "label", "b", "value", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C1660a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("label")
                @NotNull
                private final String label;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("value")
                @NotNull
                private final String value;

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
                    if (!(obj2 instanceof C1660a)) {
                        return false;
                    }
                    C1660a c1660a = (C1660a) obj2;
                    return Intrinsics.f(this.label, c1660a.label) && Intrinsics.f(this.value, c1660a.value);
                }

                public final int hashCode() {
                    return this.value.hashCode() + (this.label.hashCode() * 31);
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getFields() {
                return this.fields;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C1659a) && Intrinsics.f(this.fields, ((C1659a) obj2).fields);
            }

            public final int hashCode() {
                return this.fields.hashCode();
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountLabel() {
            return this.accountLabel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getAccountName() {
            return this.accountName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getAccountNumbers() {
            return this.accountNumbers;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.accountLabel, aVar.accountLabel) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.accountName, aVar.accountName) && Intrinsics.f(this.accountNumbers, aVar.accountNumbers);
        }

        public final int hashCode() {
            return this.accountNumbers.hashCode() + p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.accountLabel), 31, this.currency), 31, this.accountName);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017¨\u0006\u0019"}, d2 = {"Lwue/c$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "d", "name", "Lque/a;", "c", "Lque/a;", "()Lque/a;", "logo", "Lro3/j;", "Lro3/j;", "e", "()Lro3/j;", "topUpSettings", "Lwue/c$b$a;", "Lwue/c$b$a;", "()Lwue/c$b$a;", "health", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        @NotNull
        private final que.a logo;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("settings")
        @NotNull
        private final j topUpSettings;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("health")
        private final a health;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lwue/c$b$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "general", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("general")
            @NotNull
            private final String general;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getGeneral() {
                return this.general;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.general, ((a) obj2).general);
            }

            public final int hashCode() {
                return this.general.hashCode();
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a getHealth() {
            return this.health;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final que.a getLogo() {
            return this.logo;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final j getTopUpSettings() {
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
            return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.logo, bVar.logo) && Intrinsics.f(this.topUpSettings, bVar.topUpSettings) && Intrinsics.f(this.health, bVar.health);
        }

        public final int hashCode() {
            int iHashCode = (this.topUpSettings.hashCode() + ((this.logo.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.name)) * 31)) * 31;
            a aVar = this.health;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }
    }

    /* JADX INFO: renamed from: wue.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0005\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwue/c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "c", "state", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "balance", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "validUntil", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C1661c {

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
        private final jo3.a balance;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("validUntil")
        private final Long validUntil;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getBalance() {
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
            if (!(obj2 instanceof C1661c)) {
                return false;
            }
            C1661c c1661c = (C1661c) obj2;
            return Intrinsics.f(this.id, c1661c.id) && Intrinsics.f(this.state, c1661c.state) && Intrinsics.f(this.balance, c1661c.balance) && Intrinsics.f(this.validUntil, c1661c.validUntil);
        }

        public final int hashCode() {
            int iC = p.a.c(this.id.hashCode() * 31, 31, this.state);
            jo3.a aVar = this.balance;
            int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Long l2 = this.validUntil;
            return iHashCode + (l2 != null ? l2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\f\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0018"}, d2 = {"Lwue/c$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "f", "state", "", "c", "Z", "()Z", "hasEditableLimits", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "maximumIndividualLimit", "e", "monthlyPeriodicLimit", "monthlyAmountRemaining", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("replaceable")
        private final boolean hasEditableLimits;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("maximumIndividualLimit")
        @NotNull
        private final jo3.a maximumIndividualLimit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("monthlyPeriodicLimit")
        private final jo3.a monthlyPeriodicLimit;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("amountRemaining")
        private final jo3.a monthlyAmountRemaining;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasEditableLimits() {
            return this.hasEditableLimits;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getMaximumIndividualLimit() {
            return this.maximumIndividualLimit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getMonthlyAmountRemaining() {
            return this.monthlyAmountRemaining;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getMonthlyPeriodicLimit() {
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
            int iJ = v7.j(this.maximumIndividualLimit, j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.hasEditableLimits), 31);
            jo3.a aVar = this.monthlyPeriodicLimit;
            int iHashCode2 = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
            jo3.a aVar2 = this.monthlyAmountRemaining;
            return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAccountDetails() {
        return this.accountDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDeletionAllowed() {
        return this.deletionAllowed;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getEligibleForMandateCreation() {
        return this.eligibleForMandateCreation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b getInstitution() {
        return this.institution;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C1661c getLinkedAccount() {
        return this.linkedAccount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.institution, cVar.institution) && Intrinsics.f(this.accountDetails, cVar.accountDetails) && this.deletionAllowed == cVar.deletionAllowed && Intrinsics.f(this.linkedAccount, cVar.linkedAccount) && Intrinsics.f(this.eligibleForMandateCreation, cVar.eligibleForMandateCreation) && Intrinsics.f(this.mandate, cVar.mandate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getMandate() {
        return this.mandate;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.accountDetails.hashCode() + (this.institution.hashCode() * 31)) * 31, 31, this.deletionAllowed);
        C1661c c1661c = this.linkedAccount;
        int iHashCode = (iC + (c1661c == null ? 0 : c1661c.hashCode())) * 31;
        Boolean bool = this.eligibleForMandateCreation;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.mandate;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }
}
