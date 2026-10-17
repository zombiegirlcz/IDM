package h1k;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.impl.flows.wealthnews.destination.WealthDailyNewsDestination;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreen;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthAssetTypeNewsScreen f148590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(WealthAssetTypeNewsScreen wealthAssetTypeNewsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f148590w = wealthAssetTypeNewsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f148590w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f148590w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f148590w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((rzj.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((rzj.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthAssetTypeNewsScreen wealthAssetTypeNewsScreen = this.f148590w;
        switch (i) {
            case 0:
                rzj.f fVar = (rzj.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar = (h) wealthAssetTypeNewsScreen.Z.getValue();
                WealthNewsArticle article = fVar.d();
                l lVar = (l) hVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(article, "article");
                lVar.C1(new WealthNewsArticleReaderDestination(article, lVar.u.f101868b, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE)));
                return Unit.f186387a;
            case 1:
                f fVar2 = (f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                h hVar2 = (h) wealthAssetTypeNewsScreen.Z.getValue();
                DateTime date = fVar2.f148591a;
                l lVar2 = (l) hVar2;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData = lVar2.u;
                lVar2.C1(new WealthDailyNewsDestination(date, wealthAssetTypeNewsScreenContract$InputData.f101867a, wealthAssetTypeNewsScreenContract$InputData.f101868b));
                return Unit.f186387a;
            default:
                ?? r06 = wealthAssetTypeNewsScreen.Z;
                rzj.j jVar = (rzj.j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (jVar instanceof rzj.h) {
                    h hVar3 = (h) r06.getValue();
                    InstrumentTicker asset = ((rzj.h) jVar).f258695a;
                    l lVar3 = (l) hVar3;
                    lVar3.getClass();
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    lVar3.C1(new AssetDetailsDestination(asset.f105112b, null, false, "MarketNewsHomeScreen", null, null, 54));
                } else {
                    if (!(jVar instanceof rzj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h hVar4 = (h) r06.getValue();
                    xi0.b asset2 = ((rzj.i) jVar).f258696a.f288344a;
                    l lVar4 = (l) hVar4;
                    lVar4.getClass();
                    Intrinsics.checkNotNullParameter(asset2, "asset");
                    lVar4.C1(new BridgeDestination(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(asset2, null, null, null, 62))));
                }
                return Unit.f186387a;
        }
    }
}
