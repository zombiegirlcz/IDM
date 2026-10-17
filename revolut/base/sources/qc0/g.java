package qc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f244423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlow f244424b;

    public g(BackendFlow oldBackendFlow, BackendFlow newBackendFlow) {
        Intrinsics.checkNotNullParameter(oldBackendFlow, "oldBackendFlow");
        Intrinsics.checkNotNullParameter(newBackendFlow, "newBackendFlow");
        this.f244423a = oldBackendFlow;
        this.f244424b = newBackendFlow;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f244423a, gVar.f244423a) && Intrinsics.f(this.f244424b, gVar.f244424b);
    }

    public final int hashCode() {
        return this.f244424b.hashCode() + (this.f244423a.hashCode() * 31);
    }
}
