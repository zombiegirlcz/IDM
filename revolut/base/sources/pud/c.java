package pud;

import com.revolut.feature.crypto.earn.assets.shared.api.navigation.EarnAssetsScreenDestination;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.api.navigation.StakingKompotFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.crypto.asset_details.api.navigation.CryptoAssetDetailsFeatureConfig;
import efm.d0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import prl.n;
import w4l.i;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f239864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f239865c;

    public /* synthetic */ c(g gVar, boolean z, int i) {
        this.f239863a = i;
        this.f239864b = gVar;
        this.f239865c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f239863a;
        boolean z = this.f239865c;
        g gVar = this.f239864b;
        int i2 = 0;
        switch (i) {
            case 0:
                List stakingProducts = (List) obj2;
                Intrinsics.checkNotNullParameter(stakingProducts, "stakingProducts");
                if (stakingProducts.isEmpty()) {
                    return d0.m(Boolean.FALSE);
                }
                NaviCommand[] elements = {z ? gVar.f : null, u0.f(EarnAssetsScreenDestination.f70788b)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return gVar.h(new CompositeCommand(kotlin.collections.d.L(elements)));
            case 1:
                StakingAvailability stakingAvailability = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
                StakingPocket stakingPocket = stakingAvailability.f88059b;
                if (stakingPocket == null) {
                    return d0.m(Boolean.FALSE);
                }
                NaviCommand[] elements2 = {z ? gVar.f : null, new FeatureCommand(new CryptoAssetDetailsFeatureConfig.EarnDetails(stakingPocket))};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                return gVar.h(new CompositeCommand(kotlin.collections.d.L(elements2)));
            case 2:
                yoj.a cryptoFeature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(cryptoFeature, "cryptoFeature");
                if (!yoj.b.k(cryptoFeature)) {
                    return yoj.b.l(cryptoFeature) ? gVar.h(gVar.f) : d0.m(Boolean.FALSE);
                }
                d0 d0VarFirstOrError = zi0.c.J(rd0.e.c(gVar.f239870b.e(i.f294643c), kotlin.coroutines.g.f186406a)).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                ufm.i iVar = new ufm.i(zi0.c.t(d0VarFirstOrError), new n(15, new c(gVar, z, i2)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return ue0.e.I(iVar, h0.f322473a, new psl.e(27));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                io3.d dVar = (io3.d) pair.f186385a;
                StakingAvailability stakingAvailability2 = (StakingAvailability) pair.f186386b;
                StakingProduct stakingProduct = stakingAvailability2.f88058a;
                if (stakingProduct == null) {
                    return d0.m(Boolean.FALSE);
                }
                NaviCommand[] elements3 = {z ? gVar.f : null, new FeatureCommand(new StakingKompotFeatureConfig.Stake(dVar.f163145a, stakingProduct, stakingAvailability2.f88059b))};
                Intrinsics.checkNotNullParameter(elements3, "elements");
                return gVar.h(new CompositeCommand(kotlin.collections.d.L(elements3)));
        }
    }
}
