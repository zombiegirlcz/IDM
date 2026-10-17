package la0;

import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import kotlin.jvm.internal.Intrinsics;
import te0.r;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193304a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f193305b;

    public c(BackendFlow flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f193305b = flow;
    }

    public final BackendFlow a() {
        switch (this.f193304a) {
            case 0:
                return (BackendFlow) this.f193305b;
            default:
                return (BackendFlow) ((od0.i) ((r) ((qc0.k) this.f193305b).k()).get()).c();
        }
    }

    public c(qc0.k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f193305b = state;
    }
}
