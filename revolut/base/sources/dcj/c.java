package dcj;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f112995b;

    public /* synthetic */ c(Map map, int i) {
        this.f112994a = i;
        this.f112995b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f112994a) {
            case 0:
                String str = ((xi0.b) obj2).f306286a;
                Map map = this.f112995b;
                Integer num = (Integer) map.get(str);
                Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                Integer num2 = (Integer) map.get(((xi0.b) obj3).f306286a);
                return cim.b.b(numValueOf, Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            case 1:
                Map map2 = this.f112995b;
                return cim.b.b((Integer) map2.get((FavouritesAssetTypeKey) obj2), (Integer) map2.get((FavouritesAssetTypeKey) obj3));
            case 2:
                Map map3 = this.f112995b;
                return cim.b.b((Integer) map3.get((FavouritesAssetTypeKey) obj2), (Integer) map3.get((FavouritesAssetTypeKey) obj3));
            default:
                Map map4 = this.f112995b;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) map4.get((String) obj2);
                String strT = juniorBankingProfile != null ? ta6.a.t(juniorBankingProfile) : null;
                JuniorBankingProfile juniorBankingProfile2 = (JuniorBankingProfile) map4.get((String) obj3);
                return cim.b.b(strT, juniorBankingProfile2 != null ? ta6.a.t(juniorBankingProfile2) : null);
        }
    }
}
