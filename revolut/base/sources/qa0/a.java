package qa0;

import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import kotlin.jvm.internal.Intrinsics;
import smd.s;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f243921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendFlowInput f243922b;

    public a(s startScreenDetector, BackendFlowInput inputData) {
        Intrinsics.checkNotNullParameter(startScreenDetector, "startScreenDetector");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f243921a = startScreenDetector;
        this.f243922b = inputData;
    }
}
