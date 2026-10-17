package j11;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lj11/d;", "", "", "toString", "()Ljava/lang/String;", "Lj11/d$a;", "a", "Lj11/d$a;", "c", "()Lj11/d$a;", "state", "Lj11/c;", "b", "Lj11/c;", "()Lj11/c;", "details", "Lj11/f;", "Lj11/f;", "()Lj11/f;", "planReward", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final a state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    @NotNull
    private final c details;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("planReward")
    private final f planReward;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lj11/d$a;", "", "INELIGIBLE", "READY_TO_CLAIM", "MAINTAIN_BALANCE", "REWARD_ACTIVE", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @lg.b("INELIGIBLE")
        public static final a INELIGIBLE;

        @lg.b("MAINTAIN_BALANCE")
        public static final a MAINTAIN_BALANCE;

        @lg.b("READY_TO_CLAIM")
        public static final a READY_TO_CLAIM;

        @lg.b("REWARD_ACTIVE")
        public static final a REWARD_ACTIVE;

        static {
            a aVar = new a("INELIGIBLE", 0);
            INELIGIBLE = aVar;
            a aVar2 = new a("READY_TO_CLAIM", 1);
            READY_TO_CLAIM = aVar2;
            a aVar3 = new a("MAINTAIN_BALANCE", 2);
            MAINTAIN_BALANCE = aVar3;
            a aVar4 = new a("REWARD_ACTIVE", 3);
            REWARD_ACTIVE = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = s.n(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getPlanReward() {
        return this.planReward;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.state == dVar.state && Intrinsics.f(this.details, dVar.details) && Intrinsics.f(this.planReward, dVar.planReward);
    }

    public final int hashCode() {
        int iHashCode = (this.details.hashCode() + (this.state.hashCode() * 31)) * 31;
        f fVar = this.planReward;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
