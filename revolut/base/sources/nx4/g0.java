package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lnx4/g0;", "Lnx4/h0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "label", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("label")
    @NotNull
    private final String label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final n action;

    public g0(String label, n nVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.label = label;
        this.action = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.label, g0Var.label) && Intrinsics.f(this.action, g0Var.action);
    }

    public final int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        n nVar = this.action;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
