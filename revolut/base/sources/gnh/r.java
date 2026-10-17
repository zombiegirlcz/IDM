package gnh;

import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesScreenDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerTopMoversDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xzg.l0;
import xzg.n0;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f145017w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f145017w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f145017w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f145017w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((vel.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aii.u uVarA;
        aii.u screenerTopMoversDestination;
        aii.u uVarB;
        int i = this.u;
        s sVar = this.f145017w;
        switch (i) {
            case 0:
                vel.f performanceAsset = (vel.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cc7.l lVar = sVar.d;
                Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
                if (performanceAsset instanceof vel.d) {
                    uVarA = new CommodityAssetDetailsDestination(((vel.d) performanceAsset).f288352a, null);
                } else if (performanceAsset instanceof vel.e) {
                    uVarA = new AssetDetailsDestination(performanceAsset.a(), null, false, null, null, null, 62);
                } else {
                    if (!(performanceAsset instanceof vel.c) && !(performanceAsset instanceof vel.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((g9h.c) lVar.f22961s).getClass();
                    uVarA = g9h.c.a(performanceAsset);
                }
                lVar.A2(uVarA);
                return Unit.f186387a;
            default:
                u uVar = (u) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cc7.l lVar2 = sVar.d;
                knh.h assetListSource = uVar.f145021a;
                Intrinsics.checkNotNullParameter(assetListSource, "assetListSource");
                if (assetListSource instanceof knh.c) {
                    knh.c assetListSource2 = (knh.c) assetListSource;
                    ((lnh.d) lVar2.f22956m).getClass();
                    Intrinsics.checkNotNullParameter(assetListSource2, "assetListSource");
                    int i2 = lnh.c.f197256a[assetListSource2.f186166a.ordinal()];
                    if (i2 == 1) {
                        uVarB = lnh.d.a(xzg.a.EQUITY);
                    } else if (i2 == 2) {
                        uVarB = lnh.d.a(xzg.a.ETF);
                    } else if (i2 == 3) {
                        uVarB = lnh.d.a(xzg.a.BOND);
                    } else if (i2 == 4) {
                        uVarB = PopularCommoditiesScreenDestination.f96024a;
                    } else {
                        if (i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uVarB = lnh.d.a(xzg.a.CFD);
                    }
                } else if (assetListSource instanceof knh.e) {
                    onh.b bVar = (onh.b) lVar2.f22957n;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter((knh.e) assetListSource, "assetListSource");
                    uVarB = u0.b(((g9h.e) bVar.f226950b).a(l0.ONE_DAY, n0.ALL));
                } else {
                    if (assetListSource instanceof knh.b) {
                        r10.t tVar = (r10.t) lVar2.o;
                        knh.b assetListSource3 = (knh.b) assetListSource;
                        tVar.getClass();
                        Intrinsics.checkNotNullParameter(assetListSource3, "assetListSource");
                        InstrumentsTrendCollectionId instrumentsTrendCollectionId = assetListSource3.f186164a;
                        screenerTopMoversDestination = new InstrumentsTrendCollectionDestination(instrumentsTrendCollectionId, ((fnh.c) tVar.f250858b).a(assetListSource3), ((fnh.a) tVar.f250857a).a(instrumentsTrendCollectionId));
                    } else if (assetListSource instanceof knh.d) {
                        ((mnh.d) lVar2.f22958p).getClass();
                        Intrinsics.checkNotNullParameter((knh.d) assetListSource, "assetListSource");
                        uVarB = u0.b(DummyCommand.f98635a);
                    } else if (assetListSource instanceof knh.g) {
                        knh.g assetListSource4 = (knh.g) assetListSource;
                        ((nnh.a) lVar2.f22959q).getClass();
                        Intrinsics.checkNotNullParameter(assetListSource4, "assetListSource");
                        ScreenerCollection screenerCollection = assetListSource4.f186170a;
                        screenerTopMoversDestination = new ScreenerCollectionDestination(screenerCollection.f105154a, screenerCollection);
                    } else {
                        if (!(assetListSource instanceof knh.f)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        knh.f assetListSource5 = (knh.f) assetListSource;
                        ((by5.a) lVar2.f22960r).getClass();
                        Intrinsics.checkNotNullParameter(assetListSource5, "assetListSource");
                        wgl.c cVar = assetListSource5.f186169a;
                        screenerTopMoversDestination = new ScreenerTopMoversDestination(cVar.f297342a, cVar.f297343b);
                    }
                    uVarB = screenerTopMoversDestination;
                }
                lVar2.A2(uVarB);
                return Unit.f186387a;
        }
    }
}
