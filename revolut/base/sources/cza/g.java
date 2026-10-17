package cza;

import cli.n;
import cli.y;
import com.revolut.feature.referrals.shared.ui.impl.ui.reward_details.RewardDetailsScreenContract$Input;
import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends oki.h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f110177p;

    public g(n stateMapper, RewardDetailsScreenContract$Input input, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f110177p = mra.d.b(this, new d(input.f81952a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f110177p;
    }
}
