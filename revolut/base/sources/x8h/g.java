package x8h;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.wealth.api.domain.model.collectionquote.CollectionQuoteParams;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.impl.data.network.collections.CollectionsService;
import com.revolut.feature.wealth.impl.data.network.collections.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.wealth.impl.data.repositories.a f303339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f303340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f303341c;
    public final ybl.b d;

    public g(com.revolut.feature.wealth.impl.data.repositories.a collectionsRepository, c transformer, wsg.n walletInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(collectionsRepository, "collectionsRepository");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f303339a = collectionsRepository;
        this.f303340b = transformer;
        this.f303341c = walletInteractor;
        this.d = instrumentTickerInteractor;
    }

    public static final ufm.i a(g gVar, String collectionId, CollectionQuoteParams collectionQuoteParams) {
        com.revolut.feature.wealth.impl.data.repositories.a aVar = gVar.f303339a;
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        Intrinsics.checkNotNullParameter(collectionQuoteParams, "collectionQuoteParams");
        CollectionsService collectionsService = aVar.f95512c;
        a.C0583a c0583aA = com.revolut.feature.wealth.impl.data.network.collections.b.a(collectionQuoteParams);
        String str = collectionQuoteParams.f95274a;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = 3;
        ufm.i iVar = new ufm.i(new ufm.i(te0.w.i0(collectionsService.exchangeCollection(collectionId, str, c0583aA)), new e8h.c(2, new e8e.y(5)), 1), new e8h.c(i, new dkm.a(1, aVar, com.revolut.feature.wealth.impl.data.repositories.a.class, "handleCollectionExchangeErrors", "handleCollectionExchangeErrors(Ljava/lang/Throwable;)Lio/reactivex/SingleSource;", 0, 16)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }

    public final efm.r b(String collection, xzg.o collectionsAssetType) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        efm.r rVarCompose = this.f303339a.a(zhm.u.c(collection), collectionsAssetType).compose(this.f303340b);
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return nim.a.w(rVarCompose, new x64.a(26));
    }

    public final efm.r c(tzg.a collectionsScreen, xzg.o collectionsAssetType) {
        Intrinsics.checkNotNullParameter(collectionsScreen, "collectionsScreen");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        Intrinsics.checkNotNullParameter(collectionsAssetType, "collectionsAssetType");
        return pd.b.r(nim.a.w(this.f303339a.f95517m.f(collectionsAssetType, false), new d(collectionsScreen, 0)), new x52.a(this, collectionsAssetType, 8));
    }

    public final wkm.l d(InstrumentsCollectionType collectionType, InstrumentsCollectionSortOption sortOption, List filters, boolean z) {
        Object uVar;
        String strA;
        String strA2;
        Integer numB;
        Integer numB2;
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(filters, "filters");
        Intrinsics.checkNotNullParameter(collectionType, "collectionType");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(filters, "filters");
        x4l.c cVar = this.f303339a.k;
        Intrinsics.checkNotNullParameter(collectionType, "<this>");
        Intrinsics.checkNotNullParameter(sortOption, "sortOption");
        Intrinsics.checkNotNullParameter(filters, "filters");
        List list = filters;
        ArrayList<InstrumentsCollectionFilter.ListFilter> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof InstrumentsCollectionFilter.ListFilter) {
                arrayList.add(obj2);
            }
        }
        int iB = zhm.q0.b(zhm.w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (InstrumentsCollectionFilter.ListFilter listFilter : arrayList) {
            linkedHashMap.put(listFilter.f95289a, listFilter.a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof InstrumentsCollectionFilter.RangeFilter) {
                arrayList2.add(obj3);
            }
        }
        int iB2 = zhm.q0.b(zhm.w.t(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj4 : arrayList2) {
            linkedHashMap2.put(((InstrumentsCollectionFilter.RangeFilter) obj4).f95294a, obj4);
        }
        Continuation continuation = null;
        if (Intrinsics.f(collectionType, InstrumentsCollectionType.Bonds.f95283a)) {
            String strE = o7h.p.e(sortOption);
            zzg.s f95282a = sortOption.getF95282a();
            String strD = f95282a != null ? o7h.p.d(f95282a) : null;
            ArrayList arrayListA = o7h.y.a(linkedHashMap, BondsCollectionFilterId.ISSUER, new o69.b(14));
            ArrayList arrayListA2 = o7h.y.a(linkedHashMap, BondsCollectionFilterId.CREDIT_QUALITY, new o69.b(15));
            ArrayList arrayListA3 = o7h.y.a(linkedHashMap, BondsCollectionFilterId.MATURITY_TYPE, new o69.b(16));
            ArrayList arrayListA4 = o7h.y.a(linkedHashMap, BondsCollectionFilterId.COUPON_TYPE, new o69.b(17));
            BondsCollectionFilterId bondsCollectionFilterId = BondsCollectionFilterId.YIELD_TO_MATURITY;
            InstrumentsCollectionFilter.RangeFilter it8 = (InstrumentsCollectionFilter.RangeFilter) linkedHashMap2.get(bondsCollectionFilterId);
            if (it8 != null) {
                Intrinsics.checkNotNullParameter(it8, "it");
                strA = o7h.p.a(o7h.y.b(it8, it8.e.f95297a));
            } else {
                strA = null;
            }
            InstrumentsCollectionFilter.RangeFilter it9 = (InstrumentsCollectionFilter.RangeFilter) linkedHashMap2.get(bondsCollectionFilterId);
            if (it9 != null) {
                Intrinsics.checkNotNullParameter(it9, "it");
                strA2 = o7h.p.a(o7h.y.b(it9, it9.e.f95298b));
            } else {
                strA2 = null;
            }
            BondsCollectionFilterId bondsCollectionFilterId2 = BondsCollectionFilterId.MATURITY;
            InstrumentsCollectionFilter.RangeFilter it10 = (InstrumentsCollectionFilter.RangeFilter) linkedHashMap2.get(bondsCollectionFilterId2);
            if (it10 != null) {
                Intrinsics.checkNotNullParameter(it10, "it");
                numB = o7h.y.b(it10, it10.e.f95297a);
            } else {
                numB = null;
            }
            InstrumentsCollectionFilter.RangeFilter it11 = (InstrumentsCollectionFilter.RangeFilter) linkedHashMap2.get(bondsCollectionFilterId2);
            if (it11 != null) {
                Intrinsics.checkNotNullParameter(it11, "it");
                numB2 = o7h.y.b(it11, it11.e.f95298b);
            } else {
                numB2 = null;
            }
            uVar = new o7h.q(strE, strD, arrayListA, arrayListA2, strA, strA2, arrayListA3, numB, numB2, arrayListA4, o7h.y.a(linkedHashMap, BondsCollectionFilterId.ISSUER_COUNTRY, new o69.b(18)));
        } else if (Intrinsics.f(collectionType, InstrumentsCollectionType.Etfs.f95284a)) {
            String strE2 = o7h.p.e(sortOption);
            zzg.s f95282a2 = sortOption.getF95282a();
            uVar = new o7h.r(strE2, f95282a2 != null ? o7h.p.d(f95282a2) : null);
        } else if (collectionType instanceof InstrumentsCollectionType.Related.Instruments) {
            uVar = new o7h.v(((InstrumentsCollectionType.Related.Instruments) collectionType).f95288a);
        } else if (collectionType instanceof InstrumentsCollectionType.Related.Index) {
            InstrumentsCollectionType.Related.Index index = (InstrumentsCollectionType.Related.Index) collectionType;
            uVar = new o7h.u(index.f95286a, index.f95287b);
        } else {
            if (!Intrinsics.f(collectionType, InstrumentsCollectionType.RecommendedBuy.f95285a)) {
                throw new NoWhenBranchMatchedException();
            }
            uVar = o7h.t.f222841a;
        }
        return vkm.q.Q(boh.f.e(cVar.b(uVar, w4l.h.f294642c), new x0b.c(this, 29)), new a9j.m(continuation, z, this, collectionType, 7));
    }

    public final sfm.b e(List collectionKeys, qta.f range) {
        Intrinsics.checkNotNullParameter(collectionKeys, "collectionKeys");
        Intrinsics.checkNotNullParameter(range, "range");
        sfm.b bVar = new sfm.b(this.f303341c.x(AccountId.Personal.f51414a), new x0i.i(new wtl.f(this, 12, collectionKeys, range), 24), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }
}
