package aa0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowBinary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlowBinary f2739a;

    public q0(BackendFlowBinary file) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.f2739a = file;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q0) && Intrinsics.f(this.f2739a, ((q0) obj2).f2739a);
    }

    public final int hashCode() {
        return this.f2739a.hashCode();
    }
}
