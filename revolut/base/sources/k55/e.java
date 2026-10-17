package k55;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lk55/e;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "hasFeature", "hasEntryPoint", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasFeature")
    private final Boolean hasFeature;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("hasEntryPoint")
    private final Boolean hasEntryPoint;

    public e(Boolean bool, Boolean bool2) {
        this.hasFeature = bool;
        this.hasEntryPoint = bool2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getHasEntryPoint() {
        return this.hasEntryPoint;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getHasFeature() {
        return this.hasFeature;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.hasFeature, eVar.hasFeature) && Intrinsics.f(this.hasEntryPoint, eVar.hasEntryPoint);
    }

    public final int hashCode() {
        Boolean bool = this.hasFeature;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hasEntryPoint;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
