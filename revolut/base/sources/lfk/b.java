package lfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Llfk/b;", "", "", "toString", "()Ljava/lang/String;", "Llfk/b$a;", "a", "Llfk/b$a;", "()Llfk/b$a;", "addMember", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("addMember")
    private final a addMember;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Llfk/b$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "attemptsLeft", "attemptLimit", "c", "Ljava/lang/String;", "d", "limitPeriod", "e", "nextAttemptAt", "f", "resetStrategy", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "limitDisclosureRequired", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("attemptsLeft")
        private final int attemptsLeft;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("attemptLimit")
        private final int attemptLimit;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("limitPeriod")
        @NotNull
        private final String limitPeriod;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("nextAttemptAt")
        private final String nextAttemptAt;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("resetStrategy")
        private final String resetStrategy;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("limitDisclosureRequired")
        private final Boolean limitDisclosureRequired;

        public a(int i, int i2, String limitPeriod, String str, String str2, Boolean bool) {
            Intrinsics.checkNotNullParameter(limitPeriod, "limitPeriod");
            this.attemptsLeft = i;
            this.attemptLimit = i2;
            this.limitPeriod = limitPeriod;
            this.nextAttemptAt = str;
            this.resetStrategy = str2;
            this.limitDisclosureRequired = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAttemptLimit() {
            return this.attemptLimit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getAttemptsLeft() {
            return this.attemptsLeft;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getLimitDisclosureRequired() {
            return this.limitDisclosureRequired;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLimitPeriod() {
            return this.limitPeriod;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getNextAttemptAt() {
            return this.nextAttemptAt;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.attemptsLeft == aVar.attemptsLeft && this.attemptLimit == aVar.attemptLimit && Intrinsics.f(this.limitPeriod, aVar.limitPeriod) && Intrinsics.f(this.nextAttemptAt, aVar.nextAttemptAt) && Intrinsics.f(this.resetStrategy, aVar.resetStrategy) && Intrinsics.f(this.limitDisclosureRequired, aVar.limitDisclosureRequired);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getResetStrategy() {
            return this.resetStrategy;
        }

        public final int hashCode() {
            int iC = p.a.c(j6.a.b(this.attemptLimit, Integer.hashCode(this.attemptsLeft) * 31, 31), 31, this.limitPeriod);
            String str = this.nextAttemptAt;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.resetStrategy;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.limitDisclosureRequired;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }
    }

    public b(a aVar) {
        this.addMember = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddMember() {
        return this.addMember;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.addMember, ((b) obj2).addMember);
    }

    public final int hashCode() {
        a aVar = this.addMember;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }
}
