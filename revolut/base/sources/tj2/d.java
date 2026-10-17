package tj2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f271601a;

    public d(Map workflowParams) {
        Intrinsics.checkNotNullParameter(workflowParams, "workflowParams");
        this.f271601a = workflowParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271601a, ((d) obj2).f271601a);
    }

    public final int hashCode() {
        return this.f271601a.hashCode();
    }
}
