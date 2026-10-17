package aj7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Laj7/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "mode", "b", "policyId", "Lel7/a;", "c", "Lel7/a;", "()Lel7/a;", "policySubtype", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("policyId")
    private final String policyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("policySubtype")
    private final el7.a policySubtype;

    public l(el7.a aVar, String mode, String str) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.mode = mode;
        this.policyId = str;
        this.policySubtype = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPolicyId() {
        return this.policyId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final el7.a getPolicySubtype() {
        return this.policySubtype;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.mode, lVar.mode) && Intrinsics.f(this.policyId, lVar.policyId) && this.policySubtype == lVar.policySubtype;
    }

    public final int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        String str = this.policyId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        el7.a aVar = this.policySubtype;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
