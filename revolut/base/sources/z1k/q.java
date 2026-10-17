package z1k;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lz1k/q;", "", "", "toString", "()Ljava/lang/String;", "Ldj0/d;", "a", "Ldj0/d;", "()Ldj0/d;", "lower", "b", "upper", "feature_payments_bank_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("lower")
    @NotNull
    private final dj0.d lower;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("upper")
    private final dj0.d upper;

    public q(dj0.d lower, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(lower, "lower");
        this.lower = lower;
        this.upper = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final dj0.d getLower() {
        return this.lower;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final dj0.d getUpper() {
        return this.upper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.lower, qVar.lower) && Intrinsics.f(this.upper, qVar.upper);
    }

    public final int hashCode() {
        int iHashCode = this.lower.hashCode() * 31;
        dj0.d dVar = this.upper;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
