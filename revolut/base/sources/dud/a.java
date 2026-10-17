package dud;

import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.navigation.destination.StakeFeatureDestination;
import gud.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends std.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f117966m;

    public a(b buyDestinationProvider) {
        Intrinsics.checkNotNullParameter(buyDestinationProvider, "buyDestinationProvider");
        this.f117966m = buyDestinationProvider;
    }

    @Override // std.a
    public final void Z2(StakingProduct stakingProduct) {
        Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
        if (stakingProduct.f88087b.k == vtd.b.AUTO) {
            A2(this.f117966m.a(null, stakingProduct.d));
        } else {
            A2(new StakeFeatureDestination(null, stakingProduct, null));
        }
    }
}
