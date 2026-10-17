package vxb;

import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e {

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f292940a = new b();

        private b() {
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public final int hashCode() {
            return -1201835084;
        }
    }

    private e() {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b\r\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0005\u0010 ¨\u0006\""}, d2 = {"Lvxb/e$a;", "Lvxb/e;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "pointsAccountId", "b", "e", "state", "", "c", "D", "()D", "balance", "f", "totalAward", "g", "totalRedeemed", "Ljo3/b;", "Ljo3/b;", "h", "()Ljo3/b;", "totalRedeemedCash", "", "F", "()F", "earnedPointsMultiplier", "Ljava/time/Instant;", "Ljava/time/Instant;", "()Ljava/time/Instant;", "activationDate", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("pointsAccountId")
        @NotNull
        private final String pointsAccountId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("balance")
        private final double balance;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("totalAward")
        private final double totalAward;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("totalRedeemed")
        private final double totalRedeemed;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("totalRedeemedCashAmount")
        @NotNull
        private final jo3.b totalRedeemedCash;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("earnedPointsMultiplier")
        private final float earnedPointsMultiplier;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("activationDate")
        private final Instant activationDate;

        public a(String pointsAccountId, String state, double d, double d5, double d6, jo3.b totalRedeemedCash, float f, Instant instant) {
            Intrinsics.checkNotNullParameter(pointsAccountId, "pointsAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(totalRedeemedCash, "totalRedeemedCash");
            this.pointsAccountId = pointsAccountId;
            this.state = state;
            this.balance = d;
            this.totalAward = d5;
            this.totalRedeemed = d6;
            this.totalRedeemedCash = totalRedeemedCash;
            this.earnedPointsMultiplier = f;
            this.activationDate = instant;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Instant getActivationDate() {
            return this.activationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final double getBalance() {
            return this.balance;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getEarnedPointsMultiplier() {
            return this.earnedPointsMultiplier;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPointsAccountId() {
            return this.pointsAccountId;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.pointsAccountId, aVar.pointsAccountId) && Intrinsics.f(this.state, aVar.state) && Double.compare(this.balance, aVar.balance) == 0 && Double.compare(this.totalAward, aVar.totalAward) == 0 && Double.compare(this.totalRedeemed, aVar.totalRedeemed) == 0 && Intrinsics.f(this.totalRedeemedCash, aVar.totalRedeemedCash) && Float.compare(this.earnedPointsMultiplier, aVar.earnedPointsMultiplier) == 0 && Intrinsics.f(this.activationDate, aVar.activationDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final double getTotalAward() {
            return this.totalAward;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final double getTotalRedeemed() {
            return this.totalRedeemed;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final jo3.b getTotalRedeemedCash() {
            return this.totalRedeemedCash;
        }

        public final int hashCode() {
            int iB = m72.b.b(this.earnedPointsMultiplier, wp5.y.e(this.totalRedeemedCash, m72.b.c(m72.b.c(m72.b.c(p.a.c(this.pointsAccountId.hashCode() * 31, 31, this.state), this.balance, 31), this.totalAward, 31), this.totalRedeemed, 31), 31), 31);
            Instant instant = this.activationDate;
            return iB + (instant == null ? 0 : instant.hashCode());
        }

        public /* synthetic */ a(String str, double d, double d5, double d6, jo3.b bVar, float f) {
            this(str, "UNKNOWN", d, d5, d6, bVar, f, null);
        }
    }
}
