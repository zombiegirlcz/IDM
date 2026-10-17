package ahe;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f5063b;

    public /* synthetic */ z0(LinkedHashMap linkedHashMap, int i) {
        this.f5062a = i;
        this.f5063b = linkedHashMap;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num;
        Integer num2;
        switch (this.f5062a) {
            case 0:
                ProductAccount productAccount = ((ohe.a) obj2).f225352b;
                ProductAccount.ValueItem.Main main = productAccount instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount : null;
                LinkedHashMap linkedHashMap = this.f5063b;
                int iIntValue = Integer.MAX_VALUE;
                Integer numValueOf = Integer.valueOf((main == null || (num2 = (Integer) linkedHashMap.get(main.f89504c.f89729a)) == null) ? Integer.MAX_VALUE : num2.intValue());
                ProductAccount productAccount2 = ((ohe.a) obj3).f225352b;
                ProductAccount.ValueItem.Main main2 = productAccount2 instanceof ProductAccount.ValueItem.Main ? (ProductAccount.ValueItem.Main) productAccount2 : null;
                if (main2 != null && (num = (Integer) linkedHashMap.get(main2.f89504c.f89729a)) != null) {
                    iIntValue = num.intValue();
                }
                return cim.b.b(numValueOf, Integer.valueOf(iIntValue));
            case 1:
                String id10 = ((WatchlistItem) obj2).getId();
                LinkedHashMap linkedHashMap2 = this.f5063b;
                return cim.b.b((Integer) linkedHashMap2.get(id10), (Integer) linkedHashMap2.get(((WatchlistItem) obj3).getId()));
            case 2:
                String str = ((xi0.b) obj2).f306286a;
                LinkedHashMap linkedHashMap3 = this.f5063b;
                Long l2 = (Long) linkedHashMap3.get(str);
                if (l2 == null) {
                    l2 = l;
                }
                Long l3 = (Long) linkedHashMap3.get(((xi0.b) obj3).f306286a);
                return cim.b.b(l2, l3 != null ? l3 : 0L);
            case 3:
                String str2 = ((xi0.b) obj3).f306286a;
                LinkedHashMap linkedHashMap4 = this.f5063b;
                Long l4 = (Long) linkedHashMap4.get(str2);
                if (l4 == null) {
                    l4 = l;
                }
                Long l5 = (Long) linkedHashMap4.get(((xi0.b) obj2).f306286a);
                return cim.b.b(l4, l5 != null ? l5 : 0L);
            case 4:
                WatchlistItem watchlistItem = (WatchlistItem) obj2;
                FavouritesAssetDetails favouritesAssetDetails = watchlistItem.f86898a;
                FavouritesAssetTypeKey key = favouritesAssetDetails.d;
                String from = favouritesAssetDetails.f86864b;
                String to6 = watchlistItem.f86899b;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(from, "from");
                Intrinsics.checkNotNullParameter(to6, "to");
                xi0.a aVar = xi0.b.Companion;
                aVar.getClass();
                String strD = cp5.d.d(new Pair(xi0.a.a(from), xi0.a.a(to6)));
                LinkedHashMap linkedHashMap5 = this.f5063b;
                Integer num3 = (Integer) linkedHashMap5.get(strD);
                WatchlistItem watchlistItem2 = (WatchlistItem) obj3;
                FavouritesAssetDetails favouritesAssetDetails2 = watchlistItem2.f86898a;
                FavouritesAssetTypeKey key2 = favouritesAssetDetails2.d;
                String from2 = favouritesAssetDetails2.f86864b;
                String to10 = watchlistItem2.f86899b;
                Intrinsics.checkNotNullParameter(key2, "key");
                Intrinsics.checkNotNullParameter(from2, "from");
                Intrinsics.checkNotNullParameter(to10, "to");
                aVar.getClass();
                return cim.b.b(num3, (Integer) linkedHashMap5.get(cp5.d.d(new Pair(xi0.a.a(from2), xi0.a.a(to10)))));
            case 5:
                z3d.e eVar = (z3d.e) obj2;
                FavouritesAssetTypeKey key3 = eVar.d;
                String from3 = eVar.f319253a;
                String to11 = eVar.f319254b;
                Intrinsics.checkNotNullParameter(key3, "key");
                Intrinsics.checkNotNullParameter(from3, "from");
                Intrinsics.checkNotNullParameter(to11, "to");
                xi0.a aVar2 = xi0.b.Companion;
                aVar2.getClass();
                String strD2 = cp5.d.d(new Pair(xi0.a.a(from3), xi0.a.a(to11)));
                LinkedHashMap linkedHashMap6 = this.f5063b;
                Integer num4 = (Integer) linkedHashMap6.get(strD2);
                z3d.e eVar2 = (z3d.e) obj3;
                FavouritesAssetTypeKey key4 = eVar2.d;
                String from4 = eVar2.f319253a;
                String to12 = eVar2.f319254b;
                Intrinsics.checkNotNullParameter(key4, "key");
                Intrinsics.checkNotNullParameter(from4, "from");
                Intrinsics.checkNotNullParameter(to12, "to");
                aVar2.getClass();
                return cim.b.b(num4, (Integer) linkedHashMap6.get(cp5.d.d(new Pair(xi0.a.a(from4), xi0.a.a(to12)))));
            case 6:
                String strD3 = l3d.h0.d((z3d.e) obj2);
                LinkedHashMap linkedHashMap7 = this.f5063b;
                return cim.b.b((Integer) linkedHashMap7.get(strD3), (Integer) linkedHashMap7.get(l3d.h0.d((z3d.e) obj3)));
            case 7:
                FavouritesCounterpartAsset favouritesCounterpartAsset = (FavouritesCounterpartAsset) obj3;
                String str3 = favouritesCounterpartAsset.f86867a;
                LinkedHashMap linkedHashMap8 = this.f5063b;
                Object objA = linkedHashMap8.get(str3);
                if (objA == null) {
                    xi0.a aVar3 = xi0.b.Companion;
                    String str4 = favouritesCounterpartAsset.f86867a;
                    aVar3.getClass();
                    objA = xi0.a.a(str4);
                    linkedHashMap8.put(str3, objA);
                }
                Boolean boolValueOf = Boolean.valueOf(cp5.d.A((xi0.b) objA));
                FavouritesCounterpartAsset favouritesCounterpartAsset2 = (FavouritesCounterpartAsset) obj2;
                String str5 = favouritesCounterpartAsset2.f86867a;
                Object objA2 = linkedHashMap8.get(str5);
                if (objA2 == null) {
                    xi0.a aVar4 = xi0.b.Companion;
                    String str6 = favouritesCounterpartAsset2.f86867a;
                    aVar4.getClass();
                    objA2 = xi0.a.a(str6);
                    linkedHashMap8.put(str5, objA2);
                }
                return cim.b.b(boolValueOf, Boolean.valueOf(cp5.d.A((xi0.b) objA2)));
            case 8:
                String str7 = ((xi0.b) obj2).f306286a;
                LinkedHashMap linkedHashMap9 = this.f5063b;
                Integer num5 = (Integer) linkedHashMap9.get(str7);
                Integer numValueOf2 = Integer.valueOf(num5 != null ? num5.intValue() : Integer.MAX_VALUE);
                Integer num6 = (Integer) linkedHashMap9.get(((xi0.b) obj3).f306286a);
                return cim.b.b(numValueOf2, Integer.valueOf(num6 != null ? num6.intValue() : Integer.MAX_VALUE));
            case 9:
                String str8 = ((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj3).f87459a.f306286a;
                LinkedHashMap linkedHashMap10 = this.f5063b;
                return cim.b.b(Boolean.valueOf(linkedHashMap10.containsKey(str8)), Boolean.valueOf(linkedHashMap10.containsKey(((IncomeSorterDestinationInfo.Crypto.CryptoPocket) obj2).f87459a.f306286a)));
            case 10:
                String str9 = ((nel.a0) obj2).f214560a.f214596b;
                LinkedHashMap linkedHashMap11 = this.f5063b;
                Integer num7 = (Integer) linkedHashMap11.get(str9);
                Integer numValueOf3 = Integer.valueOf(num7 != null ? num7.intValue() : Integer.MAX_VALUE);
                Integer num8 = (Integer) linkedHashMap11.get(((nel.a0) obj3).f214560a.f214596b);
                return cim.b.b(numValueOf3, Integer.valueOf(num8 != null ? num8.intValue() : Integer.MAX_VALUE));
            default:
                String strD4 = edl.a.d((fel.b) obj2);
                LinkedHashMap linkedHashMap12 = this.f5063b;
                Integer num9 = (Integer) linkedHashMap12.get(strD4);
                Integer numValueOf4 = Integer.valueOf(num9 != null ? num9.intValue() : Integer.MAX_VALUE);
                Integer num10 = (Integer) linkedHashMap12.get(edl.a.d((fel.b) obj3));
                return cim.b.b(numValueOf4, Integer.valueOf(num10 != null ? num10.intValue() : Integer.MAX_VALUE));
        }
    }

    public z0(LinkedHashMap linkedHashMap, l3d.h0 h0Var) {
        this.f5062a = 6;
        this.f5063b = linkedHashMap;
    }
}
