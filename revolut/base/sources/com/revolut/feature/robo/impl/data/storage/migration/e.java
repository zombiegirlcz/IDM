package com.revolut.feature.robo.impl.data.storage.migration;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends we0.g {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001:\u0002\u0006\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/e$a;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a;", "a", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a;", "getAccount", "()Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a;", "account", "", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b;", "b", "Ljava/util/List;", "()Ljava/util/List;", "portfolios", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("account")
        @NotNull
        private final C0536a account;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("portfolios")
        @NotNull
        private final List<b> portfolios;

        /* JADX INFO: renamed from: com.revolut.feature.robo.impl.data.storage.migration.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a$a;", "a", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a$a;", "getOnboardingStatus", "()Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a$a;", "onboardingStatus", "Ljo3/b;", "b", "Ljo3/b;", "getMinimumWithdrawalAmount", "()Ljo3/b;", "minimumWithdrawalAmount", "c", "getMinimumBalanceAfterWithdraw", "minimumBalanceAfterWithdraw", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0536a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("onboardingStatus")
            @NotNull
            private final EnumC0537a onboardingStatus;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("minimumWithdrawalAmount")
            @NotNull
            private final jo3.b minimumWithdrawalAmount;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("minimumBalanceAfterWithdraw")
            @NotNull
            private final jo3.b minimumBalanceAfterWithdraw;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: com.revolut.feature.robo.impl.data.storage.migration.e$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$a$a;", "", "NONE", "PENDING", "COMPLETED", "FAILED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class EnumC0537a {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0537a[] $VALUES;

                @lg.b("COMPLETED")
                public static final EnumC0537a COMPLETED;

                @lg.b("FAILED")
                public static final EnumC0537a FAILED;

                @lg.b("NONE")
                public static final EnumC0537a NONE;

                @lg.b("PENDING")
                public static final EnumC0537a PENDING;

                static {
                    EnumC0537a enumC0537a = new EnumC0537a("NONE", 0);
                    NONE = enumC0537a;
                    EnumC0537a enumC0537a2 = new EnumC0537a("PENDING", 1);
                    PENDING = enumC0537a2;
                    EnumC0537a enumC0537a3 = new EnumC0537a("COMPLETED", 2);
                    COMPLETED = enumC0537a3;
                    EnumC0537a enumC0537a4 = new EnumC0537a("FAILED", 3);
                    FAILED = enumC0537a4;
                    EnumC0537a[] enumC0537aArr = {enumC0537a, enumC0537a2, enumC0537a3, enumC0537a4};
                    $VALUES = enumC0537aArr;
                    $ENTRIES = s.n(enumC0537aArr);
                }

                public static EnumC0537a valueOf(String str) {
                    return (EnumC0537a) Enum.valueOf(EnumC0537a.class, str);
                }

                public static EnumC0537a[] values() {
                    return (EnumC0537a[]) $VALUES.clone();
                }
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0536a)) {
                    return false;
                }
                C0536a c0536a = (C0536a) obj2;
                return this.onboardingStatus == c0536a.onboardingStatus && Intrinsics.f(this.minimumWithdrawalAmount, c0536a.minimumWithdrawalAmount) && Intrinsics.f(this.minimumBalanceAfterWithdraw, c0536a.minimumBalanceAfterWithdraw);
            }

            public final int hashCode() {
                return this.minimumBalanceAfterWithdraw.hashCode() + y.e(this.minimumWithdrawalAmount, this.onboardingStatus.hashCode() * 31, 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getPortfolioId", "portfolioId", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b$a;", "b", "Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b$a;", "getState", "()Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b$a;", "state", "c", "getPortfolioTemplate", "portfolioTemplate", "d", "getRecommendedTemplate", "recommendedTemplate", "e", "getNewTemplate", "newTemplate", "f", "baseCurrency", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("portfolioId")
            @NotNull
            private final String portfolioId;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("state")
            @NotNull
            private final EnumC0538a state;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("portfolioTemplate")
            private final String portfolioTemplate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("recommendedTemplate")
            private final String recommendedTemplate;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("newTemplate")
            private final String newTemplate;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("baseCurrency")
            private final String baseCurrency;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* JADX INFO: renamed from: com.revolut.feature.robo.impl.data.storage.migration.e$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/impl/data/storage/migration/e$a$b$a;", "", "CREATED", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class EnumC0538a {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0538a[] $VALUES;

                @lg.b("ACTIVE")
                public static final EnumC0538a ACTIVE;

                @lg.b("CREATED")
                public static final EnumC0538a CREATED;

                @lg.b(alternate = {"LIQUIDATING"}, value = "OFFBOARDING")
                public static final EnumC0538a OFFBOARDING;

                @lg.b("SUSPENDED")
                public static final EnumC0538a SUSPENDED;

                @lg.b("TERMINATED")
                public static final EnumC0538a TERMINATED;

                static {
                    EnumC0538a enumC0538a = new EnumC0538a("CREATED", 0);
                    CREATED = enumC0538a;
                    EnumC0538a enumC0538a2 = new EnumC0538a("ACTIVE", 1);
                    ACTIVE = enumC0538a2;
                    EnumC0538a enumC0538a3 = new EnumC0538a("SUSPENDED", 2);
                    SUSPENDED = enumC0538a3;
                    EnumC0538a enumC0538a4 = new EnumC0538a("OFFBOARDING", 3);
                    OFFBOARDING = enumC0538a4;
                    EnumC0538a enumC0538a5 = new EnumC0538a("TERMINATED", 4);
                    TERMINATED = enumC0538a5;
                    EnumC0538a[] enumC0538aArr = {enumC0538a, enumC0538a2, enumC0538a3, enumC0538a4, enumC0538a5};
                    $VALUES = enumC0538aArr;
                    $ENTRIES = s.n(enumC0538aArr);
                }

                public static EnumC0538a valueOf(String str) {
                    return (EnumC0538a) Enum.valueOf(EnumC0538a.class, str);
                }

                public static EnumC0538a[] values() {
                    return (EnumC0538a[]) $VALUES.clone();
                }
            }

            public b(String portfolioId, EnumC0538a state, String str, String str2, String str3, String str4) {
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(state, "state");
                this.portfolioId = portfolioId;
                this.state = state;
                this.portfolioTemplate = str;
                this.recommendedTemplate = str2;
                this.newTemplate = str3;
                this.baseCurrency = str4;
            }

            public static b a(b bVar, String str) {
                String portfolioId = bVar.portfolioId;
                EnumC0538a state = bVar.state;
                String str2 = bVar.portfolioTemplate;
                String str3 = bVar.recommendedTemplate;
                String str4 = bVar.newTemplate;
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                Intrinsics.checkNotNullParameter(state, "state");
                return new b(portfolioId, state, str2, str3, str4, str);
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getBaseCurrency() {
                return this.baseCurrency;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.portfolioId, bVar.portfolioId) && this.state == bVar.state && Intrinsics.f(this.portfolioTemplate, bVar.portfolioTemplate) && Intrinsics.f(this.recommendedTemplate, bVar.recommendedTemplate) && Intrinsics.f(this.newTemplate, bVar.newTemplate) && Intrinsics.f(this.baseCurrency, bVar.baseCurrency);
            }

            public final int hashCode() {
                int iHashCode = (this.state.hashCode() + (this.portfolioId.hashCode() * 31)) * 31;
                String str = this.portfolioTemplate;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.recommendedTemplate;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.newTemplate;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.baseCurrency;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }
        }

        public a(C0536a account, ArrayList portfolios) {
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            this.account = account;
            this.portfolios = portfolios;
        }

        public static a a(a aVar, ArrayList portfolios) {
            C0536a account = aVar.account;
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            return new a(account, portfolios);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getPortfolios() {
            return this.portfolios;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.account, aVar.account) && Intrinsics.f(this.portfolios, aVar.portfolios);
        }

        public final int hashCode() {
            return this.portfolios.hashCode() + (this.account.hashCode() * 31);
        }
    }

    public e() {
        super(6, 7, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    @Override // we0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.SharedPreferences r8, je0.d r9) {
        /*
            r7 = this;
            ij.a r8 = (ij.a) r8
            java.lang.String r0 = "ROBO_ACCOUNT_INFORMATION"
            java.lang.String r1 = "sharedPref"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "mapper"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            ij.e r1 = r8.edit()
            r2 = 0
            java.lang.String r8 = r8.getString(r0, r2)     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L7f
            com.revolut.feature.robo.impl.data.storage.migration.RoboStorageMigrationMakeBaseCcyNonNullV6V7$migrate$entityWithBaseCurrency$1$1 r3 = new com.revolut.feature.robo.impl.data.storage.migration.RoboStorageMigrationMakeBaseCcyNonNullV6V7$migrate$entityWithBaseCurrency$1$1     // Catch: java.lang.Exception -> L60
            r3.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Type r3 = r3.getType()     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "getType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch: java.lang.Exception -> L60
            java.lang.Object r8 = r9.b(r8, r3)     // Catch: java.lang.Exception -> L60
            com.revolut.feature.robo.impl.data.storage.migration.e$a r8 = (com.revolut.feature.robo.impl.data.storage.migration.e.a) r8     // Catch: java.lang.Exception -> L60
            if (r8 == 0) goto L7f
            java.util.List r3 = r8.getPortfolios()     // Catch: java.lang.Exception -> L60
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Exception -> L60
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L60
            r5 = 10
            int r5 = zhm.w.t(r3, r5)     // Catch: java.lang.Exception -> L60
            r4.<init>(r5)     // Catch: java.lang.Exception -> L60
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L60
        L44:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L6a
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Exception -> L60
            com.revolut.feature.robo.impl.data.storage.migration.e$a$b r5 = (com.revolut.feature.robo.impl.data.storage.migration.e.a.b) r5     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r5.getBaseCurrency()     // Catch: java.lang.Exception -> L60
            if (r6 != 0) goto L62
            xi0.a r6 = xi0.b.Companion     // Catch: java.lang.Exception -> L60
            r6.getClass()     // Catch: java.lang.Exception -> L60
            xi0.b r6 = xi0.b.i     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = r6.f306286a     // Catch: java.lang.Exception -> L60
            goto L62
        L60:
            r8 = move-exception
            goto L86
        L62:
            com.revolut.feature.robo.impl.data.storage.migration.e$a$b r5 = com.revolut.feature.robo.impl.data.storage.migration.e.a.b.a(r5, r6)     // Catch: java.lang.Exception -> L60
            r4.add(r5)     // Catch: java.lang.Exception -> L60
            goto L44
        L6a:
            com.revolut.feature.robo.impl.data.storage.migration.e$a r8 = com.revolut.feature.robo.impl.data.storage.migration.e.a.a(r8, r4)     // Catch: java.lang.Exception -> L60
            java.lang.Class<com.revolut.feature.robo.impl.data.storage.migration.e$a> r3 = com.revolut.feature.robo.impl.data.storage.migration.e.a.class
            kotlin.reflect.KType r3 = kotlin.jvm.internal.o0.b(r3)     // Catch: java.lang.Exception -> L60
            java.lang.reflect.Type r3 = wim.z.d(r3)     // Catch: java.lang.Exception -> L60
            java.lang.Object r8 = r9.c(r8, r3)     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L60
            goto L80
        L7f:
            r8 = r2
        L80:
            if (r8 == 0) goto L92
            r1.g(r0, r8)     // Catch: java.lang.Exception -> L60
            goto L92
        L86:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r2, r2, r8, r9)
            r1.i(r0)
        L92:
            r1.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.data.storage.migration.e.c(android.content.SharedPreferences, je0.d):void");
    }
}
