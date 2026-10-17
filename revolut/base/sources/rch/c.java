package rch;

import com.revolut.feature.cryptocommodity_invest.api.CryptoInvestFeatureConfig;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsController;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PopularAssetsController f253270w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PopularAssetsController popularAssetsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253270w = popularAssetsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f253270w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f253270w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PopularAssetsController popularAssetsController = this.f253270w;
        switch (i) {
            case 0:
                ty0.a parcel = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVar = (d) popularAssetsController.O.getValue();
                Intrinsics.h(parcel);
                com.revolut.feature.wealth.impl.ui.screens.popularassets.a aVar2 = (com.revolut.feature.wealth.impl.ui.screens.popularassets.a) dVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                if (parcel.d == f.BONDS) {
                    oki.h.v2(aVar2.f95635w, PopularAssetsControllerContract$ModalStep.BondsLearnMore.f95629a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                j navigation = (j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                d dVar2 = (d) popularAssetsController.O.getValue();
                Intrinsics.h(navigation);
                com.revolut.feature.wealth.impl.ui.screens.popularassets.a aVar4 = (com.revolut.feature.wealth.impl.ui.screens.popularassets.a) dVar2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                if (navigation instanceof g) {
                    vel.f fVar = ((g) navigation).f253275b;
                    if (fVar instanceof vel.d) {
                        aVar4.C1(u0.c(new CryptoCommodityDetailsFeatureConfig(((vel.d) fVar).f288352a, null, null, null, 62)));
                    } else if (fVar instanceof vel.e) {
                        aVar4.C1(new AssetDetailsDestination(((vel.e) fVar).f288355a.f214560a.f214596b, null, false, null, null, null, 62));
                    } else {
                        if (!(fVar instanceof vel.c) && !(fVar instanceof vel.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4.f95634t.getClass();
                        aVar4.C1(g9h.c.a(fVar));
                    }
                } else if (navigation.equals(h.f253276a)) {
                    aVar4.C1(u0.c(DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a));
                } else {
                    if (!navigation.equals(i.f253277a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.C1(u0.c(CryptoInvestFeatureConfig.AllCrypto.f71497a));
                }
                return Unit.f186387a;
        }
    }
}
