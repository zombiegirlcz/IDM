package in4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0005\u0006\u000b\u000f\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, d2 = {"Lin4/a;", "", "", "toString", "()Ljava/lang/String;", "Lin4/a$a;", "a", "Lin4/a$a;", "()Lin4/a$a;", "cashback", "Lin4/a$c;", "b", "Lin4/a$c;", "()Lin4/a$c;", "rewards", "d", "e", "c", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    private final C0931a cashback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("rewards")
    private final c rewards;

    /* JADX INFO: renamed from: in4.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lin4/a$a;", "", "", "toString", "()Ljava/lang/String;", "Lin4/a$b;", "a", "Lin4/a$b;", "()Lin4/a$b;", "defaultCashback", "Lin4/a$d;", "b", "Lin4/a$d;", "()Lin4/a$d;", "welcomePromo", "Lin4/a$e;", "c", "Lin4/a$e;", "()Lin4/a$e;", "xmasPromo", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0931a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultCashback")
        @NotNull
        private final b defaultCashback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("welcomePromo")
        private final d welcomePromo;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("xmasPromo")
        private final e xmasPromo;

        public C0931a(b defaultCashback, d dVar, e eVar) {
            Intrinsics.checkNotNullParameter(defaultCashback, "defaultCashback");
            this.defaultCashback = defaultCashback;
            this.welcomePromo = dVar;
            this.xmasPromo = eVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getDefaultCashback() {
            return this.defaultCashback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final d getWelcomePromo() {
            return this.welcomePromo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final e getXmasPromo() {
            return this.xmasPromo;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0931a)) {
                return false;
            }
            C0931a c0931a = (C0931a) obj2;
            return Intrinsics.f(this.defaultCashback, c0931a.defaultCashback) && Intrinsics.f(this.welcomePromo, c0931a.welcomePromo) && Intrinsics.f(this.xmasPromo, c0931a.xmasPromo);
        }

        public final int hashCode() {
            int iHashCode = this.defaultCashback.hashCode() * 31;
            d dVar = this.welcomePromo;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            e eVar = this.xmasPromo;
            return iHashCode2 + (eVar != null ? eVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lin4/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "offerId", "b", "cashbackPocketId", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "startDate", "d", "endDate", "disbursalDate", "f", "rate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "earnsCap", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("offerId")
        @NotNull
        private final String offerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cashbackPocketId")
        @NotNull
        private final String cashbackPocketId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("startDate")
        @NotNull
        private final LocalDate startDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("endDate")
        @NotNull
        private final LocalDate endDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("disbursalDate")
        @NotNull
        private final LocalDate disbursalDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("rate")
        @NotNull
        private final String rate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("earnsCap")
        @NotNull
        private final jo3.a earnsCap;

        public b(String offerId, String cashbackPocketId, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, String rate, jo3.a earnsCap) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            Intrinsics.checkNotNullParameter(cashbackPocketId, "cashbackPocketId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
            this.offerId = offerId;
            this.cashbackPocketId = cashbackPocketId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.disbursalDate = disbursalDate;
            this.rate = rate;
            this.earnsCap = earnsCap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCashbackPocketId() {
            return this.cashbackPocketId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDisbursalDate() {
            return this.disbursalDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getEarnsCap() {
            return this.earnsCap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.offerId, bVar.offerId) && Intrinsics.f(this.cashbackPocketId, bVar.cashbackPocketId) && Intrinsics.f(this.startDate, bVar.startDate) && Intrinsics.f(this.endDate, bVar.endDate) && Intrinsics.f(this.disbursalDate, bVar.disbursalDate) && Intrinsics.f(this.rate, bVar.rate) && Intrinsics.f(this.earnsCap, bVar.earnsCap);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }

        public final int hashCode() {
            return this.earnsCap.hashCode() + p.a.c(y.a(y.a(y.a(p.a.c(this.offerId.hashCode() * 31, 31, this.cashbackPocketId), 31, this.startDate), 31, this.endDate), 31, this.disbursalDate), 31, this.rate);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lin4/a$c;", "", "", "toString", "()Ljava/lang/String;", "Lin4/a$c$a;", "a", "Lin4/a$c$a;", "()Lin4/a$c$a;", "spendXEarnY", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("spendXEarnY")
        private final C0932a spendXEarnY;

        /* JADX INFO: renamed from: in4.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\r\u0010\u0012¨\u0006\u0017"}, d2 = {"Lin4/a$c$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "a", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "startDate", "b", "endDate", "c", "disbursalDate", "Ljo3/a;", "Ljo3/a;", "f", "()Ljo3/a;", "totalSpends", "e", "targetSpends", "reward", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0932a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("startDate")
            @NotNull
            private final LocalDate startDate;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("endDate")
            @NotNull
            private final LocalDate endDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("disbursalDate")
            @NotNull
            private final LocalDate disbursalDate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("totalSpends")
            @NotNull
            private final jo3.a totalSpends;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            @lg.b("targetSpends")
            @NotNull
            private final jo3.a targetSpends;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            @lg.b("reward")
            @NotNull
            private final jo3.a reward;

            public C0932a(LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, jo3.a totalSpends, jo3.a targetSpends, jo3.a reward) {
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
                Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
                Intrinsics.checkNotNullParameter(totalSpends, "totalSpends");
                Intrinsics.checkNotNullParameter(targetSpends, "targetSpends");
                Intrinsics.checkNotNullParameter(reward, "reward");
                this.startDate = startDate;
                this.endDate = endDate;
                this.disbursalDate = disbursalDate;
                this.totalSpends = totalSpends;
                this.targetSpends = targetSpends;
                this.reward = reward;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final LocalDate getDisbursalDate() {
                return this.disbursalDate;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final LocalDate getEndDate() {
                return this.endDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getReward() {
                return this.reward;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final LocalDate getStartDate() {
                return this.startDate;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final jo3.a getTargetSpends() {
                return this.targetSpends;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0932a)) {
                    return false;
                }
                C0932a c0932a = (C0932a) obj2;
                return Intrinsics.f(this.startDate, c0932a.startDate) && Intrinsics.f(this.endDate, c0932a.endDate) && Intrinsics.f(this.disbursalDate, c0932a.disbursalDate) && Intrinsics.f(this.totalSpends, c0932a.totalSpends) && Intrinsics.f(this.targetSpends, c0932a.targetSpends) && Intrinsics.f(this.reward, c0932a.reward);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final jo3.a getTotalSpends() {
                return this.totalSpends;
            }

            public final int hashCode() {
                return this.reward.hashCode() + v7.j(this.targetSpends, v7.j(this.totalSpends, y.a(y.a(this.startDate.hashCode() * 31, 31, this.endDate), 31, this.disbursalDate), 31), 31);
            }
        }

        public c(C0932a c0932a) {
            this.spendXEarnY = c0932a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0932a getSpendXEarnY() {
            return this.spendXEarnY;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.spendXEarnY, ((c) obj2).spendXEarnY);
        }

        public final int hashCode() {
            C0932a c0932a = this.spendXEarnY;
            if (c0932a == null) {
                return 0;
            }
            return c0932a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0014\u0010\u001eR\u001a\u0010 \u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001c\u0010\u0019¨\u0006!"}, d2 = {"Lin4/a$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "offerId", "b", "cashbackPocketId", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "i", "()Ljava/time/LocalDate;", "startDate", "d", "endDate", "disbursalDate", "f", "g", "rate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "earnsCap", "", "h", "I", "()I", "periodOfMonth", "spendsCap", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("offerId")
        @NotNull
        private final String offerId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("cashbackPocketId")
        @NotNull
        private final String cashbackPocketId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("startDate")
        @NotNull
        private final LocalDate startDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("endDate")
        @NotNull
        private final LocalDate endDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("disbursalDate")
        @NotNull
        private final LocalDate disbursalDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("rate")
        @NotNull
        private final String rate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("earnsCap")
        @NotNull
        private final jo3.a earnsCap;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("periodOfMonth")
        private final int periodOfMonth;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("spendsCap")
        @NotNull
        private final jo3.a spendsCap;

        public d(String offerId, String cashbackPocketId, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, String rate, jo3.a earnsCap, int i, jo3.a spendsCap) {
            Intrinsics.checkNotNullParameter(offerId, "offerId");
            Intrinsics.checkNotNullParameter(cashbackPocketId, "cashbackPocketId");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
            Intrinsics.checkNotNullParameter(rate, "rate");
            Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
            Intrinsics.checkNotNullParameter(spendsCap, "spendsCap");
            this.offerId = offerId;
            this.cashbackPocketId = cashbackPocketId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.disbursalDate = disbursalDate;
            this.rate = rate;
            this.earnsCap = earnsCap;
            this.periodOfMonth = i;
            this.spendsCap = spendsCap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCashbackPocketId() {
            return this.cashbackPocketId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LocalDate getDisbursalDate() {
            return this.disbursalDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final jo3.a getEarnsCap() {
            return this.earnsCap;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final LocalDate getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getOfferId() {
            return this.offerId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.offerId, dVar.offerId) && Intrinsics.f(this.cashbackPocketId, dVar.cashbackPocketId) && Intrinsics.f(this.startDate, dVar.startDate) && Intrinsics.f(this.endDate, dVar.endDate) && Intrinsics.f(this.disbursalDate, dVar.disbursalDate) && Intrinsics.f(this.rate, dVar.rate) && Intrinsics.f(this.earnsCap, dVar.earnsCap) && this.periodOfMonth == dVar.periodOfMonth && Intrinsics.f(this.spendsCap, dVar.spendsCap);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getPeriodOfMonth() {
            return this.periodOfMonth;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final jo3.a getSpendsCap() {
            return this.spendsCap;
        }

        public final int hashCode() {
            return this.spendsCap.hashCode() + j6.a.b(this.periodOfMonth, v7.j(this.earnsCap, p.a.c(y.a(y.a(y.a(p.a.c(this.offerId.hashCode() * 31, 31, this.cashbackPocketId), 31, this.startDate), 31, this.endDate), 31, this.disbursalDate), 31, this.rate), 31), 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0010\u0010\u0016R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006 "}, d2 = {"Lin4/a$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "categoryPocketId", "h", "promoPocketId", "c", "categoryRate", "d", "i", "promoRate", "e", "defaultRate", "Ljava/time/LocalDate;", "f", "Ljava/time/LocalDate;", "j", "()Ljava/time/LocalDate;", "startDate", "g", "endDate", "disbursalDate", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "categoryEarnsCap", "promoEarnsCap", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("categoryPocketId")
        @NotNull
        private final String categoryPocketId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("promoPocketId")
        @NotNull
        private final String promoPocketId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("categoryRate")
        @NotNull
        private final String categoryRate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("promoRate")
        @NotNull
        private final String promoRate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("defaultRate")
        @NotNull
        private final String defaultRate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("startDate")
        @NotNull
        private final LocalDate startDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("endDate")
        @NotNull
        private final LocalDate endDate;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("disbursalDate")
        @NotNull
        private final LocalDate disbursalDate;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("categoryEarnsCap")
        @NotNull
        private final jo3.a categoryEarnsCap;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("promoEarnsCap")
        @NotNull
        private final jo3.a promoEarnsCap;

        public e(String categoryPocketId, String promoPocketId, String categoryRate, String promoRate, String defaultRate, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, jo3.a categoryEarnsCap, jo3.a promoEarnsCap) {
            Intrinsics.checkNotNullParameter(categoryPocketId, "categoryPocketId");
            Intrinsics.checkNotNullParameter(promoPocketId, "promoPocketId");
            Intrinsics.checkNotNullParameter(categoryRate, "categoryRate");
            Intrinsics.checkNotNullParameter(promoRate, "promoRate");
            Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
            Intrinsics.checkNotNullParameter(categoryEarnsCap, "categoryEarnsCap");
            Intrinsics.checkNotNullParameter(promoEarnsCap, "promoEarnsCap");
            this.categoryPocketId = categoryPocketId;
            this.promoPocketId = promoPocketId;
            this.categoryRate = categoryRate;
            this.promoRate = promoRate;
            this.defaultRate = defaultRate;
            this.startDate = startDate;
            this.endDate = endDate;
            this.disbursalDate = disbursalDate;
            this.categoryEarnsCap = categoryEarnsCap;
            this.promoEarnsCap = promoEarnsCap;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getCategoryEarnsCap() {
            return this.categoryEarnsCap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getCategoryPocketId() {
            return this.categoryPocketId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getCategoryRate() {
            return this.categoryRate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getDefaultRate() {
            return this.defaultRate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final LocalDate getDisbursalDate() {
            return this.disbursalDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.categoryPocketId, eVar.categoryPocketId) && Intrinsics.f(this.promoPocketId, eVar.promoPocketId) && Intrinsics.f(this.categoryRate, eVar.categoryRate) && Intrinsics.f(this.promoRate, eVar.promoRate) && Intrinsics.f(this.defaultRate, eVar.defaultRate) && Intrinsics.f(this.startDate, eVar.startDate) && Intrinsics.f(this.endDate, eVar.endDate) && Intrinsics.f(this.disbursalDate, eVar.disbursalDate) && Intrinsics.f(this.categoryEarnsCap, eVar.categoryEarnsCap) && Intrinsics.f(this.promoEarnsCap, eVar.promoEarnsCap);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final LocalDate getEndDate() {
            return this.endDate;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final jo3.a getPromoEarnsCap() {
            return this.promoEarnsCap;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getPromoPocketId() {
            return this.promoPocketId;
        }

        public final int hashCode() {
            return this.promoEarnsCap.hashCode() + v7.j(this.categoryEarnsCap, y.a(y.a(y.a(p.a.c(p.a.c(p.a.c(p.a.c(this.categoryPocketId.hashCode() * 31, 31, this.promoPocketId), 31, this.categoryRate), 31, this.promoRate), 31, this.defaultRate), 31, this.startDate), 31, this.endDate), 31, this.disbursalDate), 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getPromoRate() {
            return this.promoRate;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final LocalDate getStartDate() {
            return this.startDate;
        }
    }

    public a(C0931a c0931a, c cVar) {
        this.cashback = c0931a;
        this.rewards = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C0931a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getRewards() {
        return this.rewards;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.cashback, aVar.cashback) && Intrinsics.f(this.rewards, aVar.rewards);
    }

    public final int hashCode() {
        C0931a c0931a = this.cashback;
        int iHashCode = (c0931a == null ? 0 : c0931a.hashCode()) * 31;
        c cVar = this.rewards;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
