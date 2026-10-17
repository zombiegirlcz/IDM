package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lnx4/t0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "buttonText", "Lnx4/n;", "Lnx4/n;", "()Lnx4/n;", "action", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("buttonText")
    @NotNull
    private final String buttonText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final n action;

    public t0(String buttonText, n nVar) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.buttonText = buttonText;
        this.action = nVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final n getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.buttonText, t0Var.buttonText) && Intrinsics.f(this.action, t0Var.action);
    }

    public final int hashCode() {
        int iHashCode = this.buttonText.hashCode() * 31;
        n nVar = this.action;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}
