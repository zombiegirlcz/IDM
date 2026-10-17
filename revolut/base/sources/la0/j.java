package la0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import kotlin.jvm.internal.Intrinsics;
import smd.s;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends yc0.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f193311b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f193312c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s startScreenDetector, BackendFlowNavigationIcon startScreenNavigationIcon) {
        super(startScreenDetector);
        Intrinsics.checkNotNullParameter(startScreenDetector, "startScreenDetector");
        Intrinsics.checkNotNullParameter(startScreenNavigationIcon, "startScreenNavigationIcon");
        this.f193312c = startScreenNavigationIcon;
    }

    @Override // yc0.h
    public final BackendFlowNavigationIcon a() {
        switch (this.f193311b) {
            case 0:
                return (BackendFlowNavigationIcon) this.f193312c;
            default:
                return (BackendFlowNavigationIcon) ((qc0.k) this.f193312c).G().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s startScreenDetector, qc0.k state) {
        super(startScreenDetector);
        Intrinsics.checkNotNullParameter(startScreenDetector, "startScreenDetector");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f193312c = state;
    }
}
