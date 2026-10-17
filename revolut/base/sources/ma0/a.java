package ma0;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import qc0.k;
import te0.r;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends rc0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f203863b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f203864c;

    public a(BackendFlowInput inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f203864c = inputData;
    }

    @Override // rc0.a
    public final AnalyticsProduct a() {
        switch (this.f203863b) {
            case 0:
                return ((BackendFlowInput) this.f203864c).f51219b;
            default:
                return (AnalyticsProduct) ((i) ((r) ((k) this.f203864c).P()).get()).f224257a;
        }
    }

    public a(k state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f203864c = state;
    }
}
