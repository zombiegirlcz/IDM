package sil;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f263664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f263665b;

    public k(String workflowId, ArrayList workflowActiveSteps) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(workflowActiveSteps, "workflowActiveSteps");
        this.f263664a = workflowId;
        this.f263665b = workflowActiveSteps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f263664a, kVar.f263664a) && this.f263665b.equals(kVar.f263665b);
    }

    public final int hashCode() {
        return this.f263665b.hashCode() + (this.f263664a.hashCode() * 31);
    }
}
