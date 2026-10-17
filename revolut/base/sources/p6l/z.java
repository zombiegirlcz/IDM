package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lp6l/z;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "eligible", "Lp6l/b0;", "b", "Lp6l/b0;", "()Lp6l/b0;", "reason", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("eligible")
    private final boolean eligible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final b0 reason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getEligible() {
        return this.eligible;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getReason() {
        return this.reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.eligible == zVar.eligible && Intrinsics.f(this.reason, zVar.reason);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.eligible) * 31;
        b0 b0Var = this.reason;
        return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }
}
