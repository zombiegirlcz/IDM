package l1k;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.reader.WealthNewsArticleReaderScreen;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ WealthNewsArticleReaderScreen f191560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(WealthNewsArticleReaderScreen wealthNewsArticleReaderScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f191560w = wealthNewsArticleReaderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f191560w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f191560w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((vel.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthNewsArticleReaderScreen wealthNewsArticleReaderScreen = this.f191560w;
        switch (i) {
            case 0:
                vel.f asset = (vel.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) wealthNewsArticleReaderScreen.Z.getValue();
                Intrinsics.h(asset);
                n nVar = (n) jVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(asset, "asset");
                if (asset instanceof vel.e) {
                    nVar.C1(new AssetDetailsDestination(((vel.e) asset).f288355a.f214560a.f214596b, null, false, "MarketNewsReaderScreen", null, null, 54));
                    Unit unit = Unit.f186387a;
                } else if (asset instanceof vel.d) {
                    nVar.C1(new BridgeDestination(new FeatureCommand(new CryptoCommodityDetailsFeatureConfig(((vel.d) asset).f288352a, null, null, null, 62))));
                } else {
                    if (!(asset instanceof vel.c) && !(asset instanceof vel.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar.z.getClass();
                    nVar.C1(g9h.c.a(asset));
                }
                return Unit.f186387a;
            default:
                String linkUrl = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar2 = (j) wealthNewsArticleReaderScreen.Z.getValue();
                Intrinsics.h(linkUrl);
                n nVar2 = (n) jVar2;
                nVar2.getClass();
                Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
                nVar2.C1(new ExternalDestination.Browser(linkUrl, null));
                return Unit.f186387a;
        }
    }
}
