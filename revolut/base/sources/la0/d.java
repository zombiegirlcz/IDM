package la0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements in0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFlow f193306a;

    public d(BackendFlow backendFlow) {
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        this.f193306a = backendFlow;
    }

    @Override // in0.g
    public final boolean p0() {
        return ta6.a.B(this.f193306a);
    }
}
