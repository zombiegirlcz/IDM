package j1k;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.retail.feature.marketnews.api.navigation.destination.WealthNewsArticleReaderDestination;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily.WealthDailyNewsScreen;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rzj.h;
import rzj.j;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthDailyNewsScreen f170622w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(WealthDailyNewsScreen wealthDailyNewsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170622w = wealthDailyNewsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f170622w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f170622w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((rzj.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthDailyNewsScreen wealthDailyNewsScreen = this.f170622w;
        switch (i) {
            case 0:
                rzj.f fVar = (rzj.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) wealthDailyNewsScreen.f101869a0.getValue();
                WealthNewsArticle article = fVar.d();
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(article, "article");
                fVar2.C1(new WealthNewsArticleReaderDestination(article, fVar2.f170628p.f101873c, null));
                return Unit.f186387a;
            default:
                ?? r06 = wealthDailyNewsScreen.f101869a0;
                j jVar = (j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (jVar instanceof h) {
                    f fVar3 = (f) r06.getValue();
                    InstrumentTicker asset = ((h) jVar).f258695a;
                    fVar3.getClass();
                    Intrinsics.checkNotNullParameter(asset, "asset");
                    fVar3.C1(new AssetDetailsDestination(asset.f105112b, null, false, "MarketNewsDayListScreen", null, null, 54));
                } else {
                    if (!(jVar instanceof rzj.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f fVar4 = (f) r06.getValue();
                    xi0.b asset2 = ((rzj.i) jVar).f258696a.f288344a;
                    fVar4.getClass();
                    Intrinsics.checkNotNullParameter(asset2, "asset");
                    fVar4.C1(new BridgeDestination(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(asset2, null, null, null, 62))));
                }
                return Unit.f186387a;
        }
    }
}
