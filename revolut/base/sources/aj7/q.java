package aj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0010"}, d2 = {"Laj7/q;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "b", "()J", "minAllowedCreatedDate", "", "Laj7/q$a;", "Ljava/util/List;", "()Ljava/util/List;", "eligibleTransactions", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAllowedCreatedDate")
    private final long minAllowedCreatedDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligibleTransactions")
    @NotNull
    private final List<a> eligibleTransactions;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Laj7/q$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "type", "b", "state", "direction", "", "d", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isRecipientSet", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("state")
        @NotNull
        private final String state;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("direction")
        @NotNull
        private final String direction;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("isRecipientSet")
        private final Boolean isRecipientSet;

        public a(String type, String state, String direction, Boolean bool) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(direction, "direction");
            this.type = type;
            this.state = state;
            this.direction = direction;
            this.isRecipientSet = bool;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDirection() {
            return this.direction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Boolean getIsRecipientSet() {
            return this.isRecipientSet;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.direction, aVar.direction) && Intrinsics.f(this.isRecipientSet, aVar.isRecipientSet);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.state), 31, this.direction);
            Boolean bool = this.isRecipientSet;
            return iC + (bool == null ? 0 : bool.hashCode());
        }
    }

    public q(long j2, ArrayList eligibleTransactions) {
        Intrinsics.checkNotNullParameter(eligibleTransactions, "eligibleTransactions");
        this.minAllowedCreatedDate = j2;
        this.eligibleTransactions = eligibleTransactions;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getEligibleTransactions() {
        return this.eligibleTransactions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getMinAllowedCreatedDate() {
        return this.minAllowedCreatedDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.minAllowedCreatedDate == qVar.minAllowedCreatedDate && Intrinsics.f(this.eligibleTransactions, qVar.eligibleTransactions);
    }

    public final int hashCode() {
        return this.eligibleTransactions.hashCode() + (Long.hashCode(this.minAllowedCreatedDate) * 31);
    }
}
