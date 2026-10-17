package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d4 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl7.c f272687c;
    public final String d;
    public final boolean e;
    public final List f;

    public d4(String policyId, String billingOption, dl7.c type, String str, boolean z, List companions) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(billingOption, "billingOption");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(companions, "companions");
        this.f272685a = policyId;
        this.f272686b = billingOption;
        this.f272687c = type;
        this.d = str;
        this.e = z;
        this.f = companions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj2;
        return Intrinsics.f(this.f272685a, d4Var.f272685a) && Intrinsics.f(this.f272686b, d4Var.f272686b) && this.f272687c == d4Var.f272687c && Intrinsics.f(this.d, d4Var.d) && this.e == d4Var.e && Intrinsics.f(this.f, d4Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f272687c.hashCode() + p.a.c(this.f272685a.hashCode() * 31, 31, this.f272686b)) * 31;
        String str = this.d;
        return this.f.hashCode() + j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }
}
