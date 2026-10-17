package sa;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261204b;

    public d(String stepId, String workflowId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        this.f261203a = stepId;
        this.f261204b = workflowId;
    }

    public final String b() {
        return this.f261203a;
    }

    public final String c() {
        return this.f261204b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261203a, dVar.f261203a) && Intrinsics.f(this.f261204b, dVar.f261204b);
    }

    public final int hashCode() {
        return this.f261204b.hashCode() + (this.f261203a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("UserDetailsDescriptor(stepId=", this.f261203a, ", workflowId=", this.f261204b, ")");
    }
}
