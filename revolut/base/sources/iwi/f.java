package iwi;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\n\u000b\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\r"}, d2 = {"Liwi/f;", "", "", "toString", "()Ljava/lang/String;", "Liwi/f$d;", "a", "Liwi/f$d;", "()Liwi/f$d;", "existingPass", "d", "b", "c", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("existingLoungePass")
    private final d existingPass;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Liwi/f$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "totalCount", "", "Liwi/f$c;", "Ljava/util/List;", "()Ljava/util/List;", "rewards", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("totalCount")
        private final int totalCount;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("rewards")
        @NotNull
        private final List<c> rewards;

        public a(int i, ArrayList rewards) {
            Intrinsics.checkNotNullParameter(rewards, "rewards");
            this.totalCount = i;
            this.rewards = rewards;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getRewards() {
            return this.rewards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getTotalCount() {
            return this.totalCount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.totalCount == aVar.totalCount && Intrinsics.f(this.rewards, aVar.rewards);
        }

        public final int hashCode() {
            return this.rewards.hashCode() + (Integer.hashCode(this.totalCount) * 31);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017¨\u0006\u0019"}, d2 = {"Liwi/f$b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "c", "()I", "remaining", "b", "e", "total", "", "J", "d", "()J", "renewalDate", "Ljava/lang/String;", "planName", "", "Z", "()Z", "purchaseEnabled", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("remaining")
        private final int remaining;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        private final int total;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("renewalDate")
        private final long renewalDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("planName")
        @NotNull
        private final String planName;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("purchaseEnabled")
        private final boolean purchaseEnabled;

        public b(boolean z, String planName, int i, int i2, long j2) {
            Intrinsics.checkNotNullParameter(planName, "planName");
            this.remaining = i;
            this.total = i2;
            this.renewalDate = j2;
            this.planName = planName;
            this.purchaseEnabled = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPlanName() {
            return this.planName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getPurchaseEnabled() {
            return this.purchaseEnabled;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getRemaining() {
            return this.remaining;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getRenewalDate() {
            return this.renewalDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return this.remaining == bVar.remaining && this.total == bVar.total && this.renewalDate == bVar.renewalDate && Intrinsics.f(this.planName, bVar.planName) && this.purchaseEnabled == bVar.purchaseEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.purchaseEnabled) + p.a.c(a0.d.c(j6.a.b(this.total, Integer.hashCode(this.remaining) * 31, 31), 31, this.renewalDate), 31, this.planName);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Liwi/f$c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "()I", "count", "b", "Ljava/lang/String;", "description", "", "c", "J", "()J", "expirationDate", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("count")
        private final int count;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("expirationDate")
        private final long expirationDate;

        public c(int i, long j2, String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.count = i;
            this.description = description;
            this.expirationDate = j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getExpirationDate() {
            return this.expirationDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return this.count == cVar.count && Intrinsics.f(this.description, cVar.description) && this.expirationDate == cVar.expirationDate;
        }

        public final int hashCode() {
            return Long.hashCode(this.expirationDate) + p.a.c(Integer.hashCode(this.count) * 31, 31, this.description);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b\r\u0010!R\u001a\u0010&\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\u0005\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b'\u0010\u0004¨\u0006)"}, d2 = {"Liwi/f$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "i", "type", "", "c", "I", "f", "()I", "passes", "h", "state", "e", "freeCompanionEntries", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lastPurchaseDate", "Liwi/f$b;", "g", "Liwi/f$b;", "()Liwi/f$b;", "recurringPasses", "Liwi/f$a;", "Liwi/f$a;", "()Liwi/f$a;", "giftedPasses", "", "Z", "()Z", "collinson", "j", "walletStyle", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("passes")
        private final int passes;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("freeCompanionPasses")
        private final int freeCompanionEntries;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("lastPurchaseDate")
        private final Long lastPurchaseDate;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @lg.b("recurringPasses")
        private final b recurringPasses;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @lg.b("giftedPasses")
        private final a giftedPasses;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @lg.b("collinson")
        private final boolean collinson;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @lg.b("walletStyle")
        private final String walletStyle;

        public d(String id10, String type, int i, String state, int i2, Long l2, b bVar, a aVar, boolean z, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.id = id10;
            this.type = type;
            this.passes = i;
            this.state = state;
            this.freeCompanionEntries = i2;
            this.lastPurchaseDate = l2;
            this.recurringPasses = bVar;
            this.giftedPasses = aVar;
            this.collinson = z;
            this.walletStyle = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCollinson() {
            return this.collinson;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFreeCompanionEntries() {
            return this.freeCompanionEntries;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a getGiftedPasses() {
            return this.giftedPasses;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Long getLastPurchaseDate() {
            return this.lastPurchaseDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.type, dVar.type) && this.passes == dVar.passes && Intrinsics.f(this.state, dVar.state) && this.freeCompanionEntries == dVar.freeCompanionEntries && Intrinsics.f(this.lastPurchaseDate, dVar.lastPurchaseDate) && Intrinsics.f(this.recurringPasses, dVar.recurringPasses) && Intrinsics.f(this.giftedPasses, dVar.giftedPasses) && this.collinson == dVar.collinson && Intrinsics.f(this.walletStyle, dVar.walletStyle);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getPasses() {
            return this.passes;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final b getRecurringPasses() {
            return this.recurringPasses;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final int hashCode() {
            int iB = j6.a.b(this.freeCompanionEntries, p.a.c(j6.a.b(this.passes, p.a.c(this.id.hashCode() * 31, 31, this.type), 31), 31, this.state), 31);
            Long l2 = this.lastPurchaseDate;
            int iHashCode = (iB + (l2 == null ? 0 : l2.hashCode())) * 31;
            b bVar = this.recurringPasses;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            a aVar = this.giftedPasses;
            int iC = j6.a.c((iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.collinson);
            String str = this.walletStyle;
            return iC + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getWalletStyle() {
            return this.walletStyle;
        }
    }

    public f(d dVar) {
        this.existingPass = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getExistingPass() {
        return this.existingPass;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.existingPass, ((f) obj2).existingPass);
    }

    public final int hashCode() {
        d dVar = this.existingPass;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }
}
