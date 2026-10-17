package e60;

import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionsFlowContract$Explanation.PromptScreen f122865a;

    public n(PermissionsFlowContract$Explanation.PromptScreen camera) {
        Intrinsics.checkNotNullParameter(camera, "camera");
        this.f122865a = camera;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f122865a.equals(((n) obj2).f122865a);
    }

    public final int hashCode() {
        return this.f122865a.hashCode();
    }
}
