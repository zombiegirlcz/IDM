package e60;

import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionsFlowContract$Explanation f122870a;

    public v(PermissionsFlowContract$Explanation explanation) {
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f122870a = explanation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f122870a, ((v) obj2).f122870a);
    }

    public final int hashCode() {
        return this.f122870a.hashCode();
    }
}
