package aj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Laj7/e0;", "", "", "toString", "()Ljava/lang/String;", "Lel7/a;", "a", "Lel7/a;", "()Lel7/a;", "insuranceSubtype", "", "Laj7/d0;", "b", "Ljava/util/List;", "()Ljava/util/List;", "limits", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("insuranceSubtype")
    @NotNull
    private final el7.a insuranceSubtype;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("limits")
    @NotNull
    private final List<d0> limits;

    public e0(el7.a insuranceSubtype, ArrayList limits) {
        Intrinsics.checkNotNullParameter(insuranceSubtype, "insuranceSubtype");
        Intrinsics.checkNotNullParameter(limits, "limits");
        this.insuranceSubtype = insuranceSubtype;
        this.limits = limits;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final el7.a getInsuranceSubtype() {
        return this.insuranceSubtype;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getLimits() {
        return this.limits;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.insuranceSubtype == e0Var.insuranceSubtype && Intrinsics.f(this.limits, e0Var.limits);
    }

    public final int hashCode() {
        return this.limits.hashCode() + (this.insuranceSubtype.hashCode() * 31);
    }
}
