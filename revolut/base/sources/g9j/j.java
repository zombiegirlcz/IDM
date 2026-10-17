package g9j;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.staking.api.model.StakingAvailability;
import com.revolut.feature.staking.api.model.StakingPocket;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto.asset_details.impl.ui.screens.earning.v2.CryptoEarningScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f141923b;

    public /* synthetic */ j(t tVar, int i) {
        this.f141922a = i;
        this.f141923b = tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f141922a) {
            case 0:
                StakingAvailability stakingAvailability = (StakingAvailability) obj2;
                Intrinsics.checkNotNullParameter(stakingAvailability, "stakingAvailability");
                StakingProduct stakingProduct = stakingAvailability.f88058a;
                if (stakingProduct == null) {
                    return te0.w.h(new k(stakingAvailability, null));
                }
                s8j.c cVar = this.f141923b.f141938r;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(stakingProduct, "stakingProduct");
                return rd0.e.c(t1.E(new qij.s(cVar.f261053a.C0(s8j.c.a(stakingProduct), Boolean.TYPE), 9)), kotlin.coroutines.g.f186406a).map(new g48.k(28, new g4k.e(stakingAvailability, 15)));
            default:
                StakingPocket stakingPocket = ((ytd.b) obj2).f316699a;
                if (stakingPocket != null && !stakingPocket.f88084g.k()) {
                    yji.n.P2(this.f141923b, new CryptoEarningScreen(stakingPocket), ModalDestination.Style.POPUP.f98311a, null, 2);
                }
                return Unit.f186387a;
        }
    }
}
