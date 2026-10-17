package e7c;

import ip0.v7;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R.\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Le7c/y;", "Le7c/z;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "", "", "Le7c/y$a;", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "wallets", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("wallets")
    private final Map<String, List<a>> wallets;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\u000b"}, d2 = {"Le7c/y$a;", "", "", "toString", "()Ljava/lang/String;", "", "Le7c/y$a$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "pockets", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("pockets")
        @NotNull
        private final List<C0720a> pockets;

        /* JADX INFO: renamed from: e7c.y$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004R\u001c\u0010*\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b\u001b\u0010)R\u001c\u0010+\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006,"}, d2 = {"Le7c/y$a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "l", "type", "c", "k", "subtype", "", "d", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "selectable", "assetType", "Ljo3/a;", "f", "Ljo3/a;", "()Ljo3/a;", "balance", "g", "balanceInRequestedCurrency", "h", "name", "m", "wealthProtectionEnabled", "", "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "sharedPocketTotalMembersCount", "savingsAccountProvider", "Le7c/y$a$a$a;", "Le7c/y$a$a$a;", "()Le7c/y$a$a$a;", "savingsAccountEarningRates", "flexibleCashFunds", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0720a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("id")
            @NotNull
            private final String id;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("type")
            @NotNull
            private final String type;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("subtype")
            private final String subtype;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("selectable")
            private final Boolean selectable;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("assetType")
            @NotNull
            private final String assetType;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("balance")
            @NotNull
            private final jo3.a balance;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            @lg.b("balanceInRequestedCurrency")
            private final jo3.a balanceInRequestedCurrency;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            @lg.b("name")
            private final String name;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            @lg.b("wealthProtectionEnabled")
            private final Boolean wealthProtectionEnabled;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            @lg.b("sharedPocketTotalMembersCount")
            private final Integer sharedPocketTotalMembersCount;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            @lg.b("savingsAccountProvider")
            private final String savingsAccountProvider;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            @lg.b("savingsAccountEarningRates")
            private final C0721a savingsAccountEarningRates;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            @lg.b("flexibleCashFunds")
            private final Boolean flexibleCashFunds;

            /* JADX INFO: renamed from: e7c.y$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Le7c/y$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "Le7c/y$a$a$a$a;", "a", "Le7c/y$a$a$a$a;", "()Le7c/y$a$a$a$a;", "primaryRate", "b", "secondaryRate", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class C0721a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                @lg.b("primary")
                @NotNull
                private final C0722a primaryRate;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                @lg.b("secondary")
                private final C0722a secondaryRate;

                /* JADX INFO: renamed from: e7c.y$a$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Le7c/y$a$a$a$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "value", "Ljava/lang/String;", "name", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class C0722a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
                    @lg.b("value")
                    private final double value;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
                    @lg.b("name")
                    @NotNull
                    private final String name;

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final String getName() {
                        return this.name;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final double getValue() {
                        return this.value;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof C0722a)) {
                            return false;
                        }
                        C0722a c0722a = (C0722a) obj2;
                        return Double.compare(this.value, c0722a.value) == 0 && Intrinsics.f(this.name, c0722a.name);
                    }

                    public final int hashCode() {
                        return this.name.hashCode() + (Double.hashCode(this.value) * 31);
                    }
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final C0722a getPrimaryRate() {
                    return this.primaryRate;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final C0722a getSecondaryRate() {
                    return this.secondaryRate;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0721a)) {
                        return false;
                    }
                    C0721a c0721a = (C0721a) obj2;
                    return Intrinsics.f(this.primaryRate, c0721a.primaryRate) && Intrinsics.f(this.secondaryRate, c0721a.secondaryRate);
                }

                public final int hashCode() {
                    int iHashCode = this.primaryRate.hashCode() * 31;
                    C0722a c0722a = this.secondaryRate;
                    return iHashCode + (c0722a == null ? 0 : c0722a.hashCode());
                }
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getAssetType() {
                return this.assetType;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final jo3.a getBalance() {
                return this.balance;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getBalanceInRequestedCurrency() {
                return this.balanceInRequestedCurrency;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Boolean getFlexibleCashFunds() {
                return this.flexibleCashFunds;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final String getId() {
                return this.id;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0720a)) {
                    return false;
                }
                C0720a c0720a = (C0720a) obj2;
                return Intrinsics.f(this.id, c0720a.id) && Intrinsics.f(this.type, c0720a.type) && Intrinsics.f(this.subtype, c0720a.subtype) && Intrinsics.f(this.selectable, c0720a.selectable) && Intrinsics.f(this.assetType, c0720a.assetType) && Intrinsics.f(this.balance, c0720a.balance) && Intrinsics.f(this.balanceInRequestedCurrency, c0720a.balanceInRequestedCurrency) && Intrinsics.f(this.name, c0720a.name) && Intrinsics.f(this.wealthProtectionEnabled, c0720a.wealthProtectionEnabled) && Intrinsics.f(this.sharedPocketTotalMembersCount, c0720a.sharedPocketTotalMembersCount) && Intrinsics.f(this.savingsAccountProvider, c0720a.savingsAccountProvider) && Intrinsics.f(this.savingsAccountEarningRates, c0720a.savingsAccountEarningRates) && Intrinsics.f(this.flexibleCashFunds, c0720a.flexibleCashFunds);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final String getName() {
                return this.name;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final C0721a getSavingsAccountEarningRates() {
                return this.savingsAccountEarningRates;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final String getSavingsAccountProvider() {
                return this.savingsAccountProvider;
            }

            public final int hashCode() {
                int iC = p.a.c(this.id.hashCode() * 31, 31, this.type);
                String str = this.subtype;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.selectable;
                int iJ = v7.j(this.balance, p.a.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.assetType), 31);
                jo3.a aVar = this.balanceInRequestedCurrency;
                int iHashCode2 = (iJ + (aVar == null ? 0 : aVar.hashCode())) * 31;
                String str2 = this.name;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool2 = this.wealthProtectionEnabled;
                int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Integer num = this.sharedPocketTotalMembersCount;
                int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
                String str3 = this.savingsAccountProvider;
                int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
                C0721a c0721a = this.savingsAccountEarningRates;
                int iHashCode7 = (iHashCode6 + (c0721a == null ? 0 : c0721a.hashCode())) * 31;
                Boolean bool3 = this.flexibleCashFunds;
                return iHashCode7 + (bool3 != null ? bool3.hashCode() : 0);
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Boolean getSelectable() {
                return this.selectable;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Integer getSharedPocketTotalMembersCount() {
                return this.sharedPocketTotalMembersCount;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final String getSubtype() {
                return this.subtype;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final String getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Boolean getWealthProtectionEnabled() {
                return this.wealthProtectionEnabled;
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getPockets() {
            return this.pockets;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.pockets, ((a) obj2).pockets);
        }

        public final int hashCode() {
            return this.pockets.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Map getWallets() {
        return this.wallets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.id, yVar.id) && Intrinsics.f(this.wallets, yVar.wallets);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, List<a>> map = this.wallets;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
