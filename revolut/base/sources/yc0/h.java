package yc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class h implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final smd.s f312425a;

    public h(smd.s startScreenDetector) {
        Intrinsics.checkNotNullParameter(startScreenDetector, "startScreenDetector");
        this.f312425a = startScreenDetector;
    }

    public abstract BackendFlowNavigationIcon a();
}
