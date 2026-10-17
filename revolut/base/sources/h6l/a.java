package h6l;

import com.revolut.feature.shared_separate_favourites.domain.FavouritesCounterpartAsset;
import h93.f0;
import java.util.Comparator;
import java.util.Map;
import mk5.l;
import ogd.e;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cim.a f149755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f149756c;

    public /* synthetic */ a(cim.a aVar, Map map, int i) {
        this.f149754a = i;
        this.f149755b = aVar;
        this.f149756c = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f149754a) {
            case 0:
                f0 f0Var = (f0) obj2;
                String strB = b.b(f0Var);
                Map map = this.f149756c;
                Integer num = (Integer) map.get(strB);
                Integer num2 = null;
                if (num == null) {
                    String str = f0Var.o;
                    num = str != null ? (Integer) map.get(str) : null;
                }
                f0 f0Var2 = (f0) obj3;
                Integer num3 = (Integer) map.get(b.b(f0Var2));
                if (num3 == null) {
                    String str2 = f0Var2.o;
                    if (str2 != null) {
                        num2 = (Integer) map.get(str2);
                    }
                } else {
                    num2 = num3;
                }
                return this.f149755b.compare(num, num2);
            case 1:
                String str3 = ((xi0.b) obj2).f306286a;
                Map map2 = this.f149756c;
                return this.f149755b.compare((Integer) map2.get(str3), (Integer) map2.get(((xi0.b) obj3).f306286a));
            case 2:
                String str4 = ((e) obj2).f225109a.f86863a;
                Map map3 = this.f149756c;
                return this.f149755b.compare((Integer) map3.get(str4), (Integer) map3.get(((e) obj3).f225109a.f86863a));
            case 3:
                String str5 = ((FavouritesCounterpartAsset) obj2).f86867a;
                Map map4 = this.f149756c;
                return this.f149755b.compare((Integer) map4.get(str5), (Integer) map4.get(((FavouritesCounterpartAsset) obj3).f86867a));
            default:
                String str6 = ((l) obj2).f206187b.f306286a;
                Map map5 = this.f149756c;
                return this.f149755b.compare((Integer) map5.get(str6), (Integer) map5.get(((l) obj3).f206187b.f306286a));
        }
    }
}
