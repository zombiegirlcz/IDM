package oyd;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000eR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0015"}, d2 = {"Loyd/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "language", "b", "currency", "", "Loyd/d$a;", "Ljava/util/List;", "()Ljava/util/List;", "accounts", "Loyd/d$b;", "d", "e", "transactionDirections", "transactionCategories", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("language")
    @NotNull
    private final String language;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accounts")
    private final List<a> accounts;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("transactionDirections")
    private final List<b> transactionDirections;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("transactionCategories")
    private final List<b> transactionCategories;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0005\u0010\u0010¨\u0006\u0012"}, d2 = {"Loyd/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "productType", "b", "c", "label", "icon", "", "Loyd/d$a$a;", "Ljava/util/List;", "()Ljava/util/List;", "elements", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("elements")
        private final List<C1269a> elements;

        /* JADX INFO: renamed from: oyd.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\t\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0019"}, d2 = {"Loyd/d$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "type", "b", "e", "id", "c", "f", "label", "d", "icon", "backgroundColor", "g", "ownerId", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "balance", "currency", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1269a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("label")
            @NotNull
            private final String label;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("icon")
            private final String icon;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("backgroundColor")
            private final String backgroundColor;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("ownerId")
            private final String ownerId;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("balance")
            private final jo3.a balance;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @lg.b("currency")
            private final String currency;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getBackgroundColor() {
                return this.backgroundColor;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final jo3.a getBalance() {
                return this.balance;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getCurrency() {
                return this.currency;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1269a)) {
                    return false;
                }
                C1269a c1269a = (C1269a) obj2;
                return Intrinsics.f(this.type, c1269a.type) && Intrinsics.f(this.id, c1269a.id) && Intrinsics.f(this.label, c1269a.label) && Intrinsics.f(this.icon, c1269a.icon) && Intrinsics.f(this.backgroundColor, c1269a.backgroundColor) && Intrinsics.f(this.ownerId, c1269a.ownerId) && Intrinsics.f(this.balance, c1269a.balance) && Intrinsics.f(this.currency, c1269a.currency);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final String getOwnerId() {
                return this.ownerId;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getType() {
                return this.type;
            }

            public final int hashCode() {
                int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.id), 31, this.label);
                String str = this.icon;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.backgroundColor;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.ownerId;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                jo3.a aVar = this.balance;
                int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str4 = this.currency;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getElements() {
            return this.elements;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getProductType() {
            return this.productType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.icon, aVar.icon) && Intrinsics.f(this.elements, aVar.elements);
        }

        public final int hashCode() {
            int iC = p.a.c(this.productType.hashCode() * 31, 31, this.label);
            String str = this.icon;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            List<C1269a> list = this.elements;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\f"}, d2 = {"Loyd/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "c", "type", "icon", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("icon")
        private final String icon;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.label, bVar.label) && Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.icon, bVar.icon);
        }

        public final int hashCode() {
            int iC = p.a.c(this.label.hashCode() * 31, 31, this.type);
            String str = this.icon;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAccounts() {
        return this.accounts;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTransactionCategories() {
        return this.transactionCategories;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getTransactionDirections() {
        return this.transactionDirections;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.language, dVar.language) && Intrinsics.f(this.currency, dVar.currency) && Intrinsics.f(this.accounts, dVar.accounts) && Intrinsics.f(this.transactionDirections, dVar.transactionDirections) && Intrinsics.f(this.transactionCategories, dVar.transactionCategories);
    }

    public final int hashCode() {
        int iC = p.a.c(this.language.hashCode() * 31, 31, this.currency);
        List<a> list = this.accounts;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<b> list2 = this.transactionDirections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<b> list3 = this.transactionCategories;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }
}
