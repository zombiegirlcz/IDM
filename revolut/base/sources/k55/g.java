package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lk55/g;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "duration", "Ljava/lang/String;", "behaviour", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cooldownDuration")
    private final Long duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("behaviour")
    private final String behaviour;

    public g(Long l2, String str) {
        this.duration = l2;
        this.behaviour = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBehaviour() {
        return this.behaviour;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.duration, gVar.duration) && Intrinsics.f(this.behaviour, gVar.behaviour);
    }

    public final int hashCode() {
        Long l2 = this.duration;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.behaviour;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
