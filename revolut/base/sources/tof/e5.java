package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl7.c f272734b;

    public e5(String policyId, dl7.c type) {
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter("", "billingOption");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f272733a = policyId;
        this.f272734b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return this.f272733a.equals(e5Var.f272733a) && this.f272734b == e5Var.f272734b;
    }

    public final int hashCode() {
        return this.f272734b.hashCode() + (this.f272733a.hashCode() * 961);
    }
}
