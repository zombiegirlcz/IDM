package jhe;

import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f174218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f174219b;

    public /* synthetic */ f(g gVar, int i) {
        this.f174218a = i;
        this.f174219b = gVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        switch (this.f174218a) {
            case 0:
                TotalWealthCategoryKey totalWealthCategoryKey = ((ohe.f) obj2).f225361a;
                g gVar = this.f174219b;
                return cim.b.b(Integer.valueOf(g.a(gVar, totalWealthCategoryKey)), Integer.valueOf(g.a(gVar, ((ohe.f) obj3).f225361a)));
            case 1:
                TotalWealthCategoryKey totalWealthCategoryKey2 = ((ohe.f) obj2).f225361a;
                g gVar2 = this.f174219b;
                return cim.b.b(Integer.valueOf(g.a(gVar2, totalWealthCategoryKey2)), Integer.valueOf(g.a(gVar2, ((ohe.f) obj3).f225361a)));
            default:
                TotalWealthCategoryKey totalWealthCategoryKey3 = ((ohe.f) obj2).f225361a;
                g gVar3 = this.f174219b;
                return cim.b.b(Integer.valueOf(g.a(gVar3, totalWealthCategoryKey3)), Integer.valueOf(g.a(gVar3, ((ohe.f) obj3).f225361a)));
        }
    }
}
