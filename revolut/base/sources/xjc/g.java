package xjc;

import cli.k;
import cli.y;
import com.revolut.feature.rewards.impl.ui.subscription.cancellation.CancellationInstructionsContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends oki.h implements dli.b {
    public final CancellationInstructionsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f306513p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f306514q;

    public g(CancellationInstructionsContract$InputData inputData, x deeplinkHandler, i stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f306513p = deeplinkHandler;
        this.f306514q = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f306514q;
    }
}
