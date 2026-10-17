package i7c;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0003\f\u0011\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Li7c/g;", "", "", "toString", "()Ljava/lang/String;", "", "Li7c/c;", "a", "Ljava/util/List;", "()Ljava/util/List;", "options", "Li7c/g$b;", "b", "Li7c/g$b;", "()Li7c/g$b;", "points", "", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "promotePointsEarning", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("options")
    @NotNull
    private final List<i7c.c> options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    private final b points;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("promotePointsEarning")
    private final Boolean promotePointsEarning;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0015"}, d2 = {"Li7c/g$b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "balance", "Li7c/d;", "b", "Li7c/d;", "c", "()Li7c/d;", "reward", "Li7c/g$c;", "Li7c/g$c;", "()Li7c/g$c;", "redemption", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("balance")
        @NotNull
        private final BigDecimal balance;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("reward")
        private final d reward;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("redemption")
        private final c redemption;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBalance() {
            return this.balance;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final c getRedemption() {
            return this.redemption;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final d getReward() {
            return this.reward;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.balance, bVar.balance) && Intrinsics.f(this.reward, bVar.reward) && Intrinsics.f(this.redemption, bVar.redemption);
        }

        public final int hashCode() {
            int iHashCode = this.balance.hashCode() * 31;
            d dVar = this.reward;
            int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            c cVar = this.redemption;
            return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\t"}, d2 = {"Li7c/g$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "quoteToken", "Companion", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("quoteToken")
        @NotNull
        private final String quoteToken;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQuoteToken() {
            return this.quoteToken;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.quoteToken, ((c) obj2).quoteToken);
        }

        public final int hashCode() {
            return this.quoteToken.hashCode();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPoints() {
        return this.points;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getPromotePointsEarning() {
        return this.promotePointsEarning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.options, gVar.options) && Intrinsics.f(this.points, gVar.points) && Intrinsics.f(this.promotePointsEarning, gVar.promotePointsEarning);
    }

    public final int hashCode() {
        int iHashCode = this.options.hashCode() * 31;
        b bVar = this.points;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.promotePointsEarning;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }
}
