package bb0;

import aii.r;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowUploadResult f14124a;

    public c(BackendFlowUploadResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f14124a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f14124a, ((c) obj2).f14124a);
    }

    public final int hashCode() {
        return this.f14124a.hashCode();
    }
}
