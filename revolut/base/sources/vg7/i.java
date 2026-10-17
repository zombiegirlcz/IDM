package vg7;

import cli.y;
import com.revolut.feature.incentive_reward.impl.ui.lottery.draw.screen.share.LotteryShareControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final nad.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f288792p;

    public i(k stateMapper, LotteryShareControllerContract$InputData inputData, nad.c shareMediaInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareMediaInteractor, "shareMediaInteractor");
        this.o = shareMediaInteractor;
        this.f288792p = mra.d.b(this, new d(inputData.f74878a, shareMediaInteractor.b(true)), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f288792p;
    }
}
