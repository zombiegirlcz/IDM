package ajd;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import ip0.az;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.a2;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShopsCombinedSearchScreen f5539w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ShopsCombinedSearchScreen shopsCombinedSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f5539w = shopsCombinedSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f5539w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f5539w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f5539w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f5539w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((az) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.f5539w;
        switch (i) {
            case 0:
                String searchQuery = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarT2 = shopsCombinedSearchScreen.T2();
                Intrinsics.h(searchQuery);
                s sVar = (s) lVarT2;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                if (d0.W(searchQuery) || searchQuery.length() < 2) {
                    sVar.x2(new aik.d(6));
                    sVar.z2();
                } else {
                    sVar.f5558x = searchQuery;
                    sVar.x2(new a31.g(searchQuery, 29));
                    a2 a2Var = sVar.f5557w;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    sVar.f5557w = yji.l.b1(sVar, nim.a.v(rd0.e.b(sVar.f5552p.r(searchQuery, whd.a.Search.a())), new aik.d(8)), null, new q(sVar, null, 2), 3);
                }
                break;
            case 1:
                List listOfItems = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarT22 = shopsCombinedSearchScreen.T2();
                Intrinsics.h(listOfItems);
                s sVar2 = (s) lVarT22;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(listOfItems, "listOfItems");
                sVar2.n2(new ad4.c(sVar2, listOfItems, null, 16), new whi.b(6));
                break;
            case 2:
                az azVar = (az) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(azVar.f163507a, "SHOPS_SEARCH_LAYOUT_EMPTY_NOTIFICATION")) {
                    s sVar3 = (s) shopsCombinedSearchScreen.T2();
                    sVar3.getClass();
                    LifestyleRevPointsOptInController$InputData lifestyleRevPointsOptInController$InputData = new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Shops.f84003a, false, 6);
                    RevPointsOptInNextDestination.Default r2 = RevPointsOptInNextDestination.Default.f83526a;
                    sVar3.C1(new BridgeDestination(u0.f(new RevPointsOptInDestination(r2, r2, lifestyleRevPointsOptInController$InputData))));
                }
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar4 = (s) shopsCombinedSearchScreen.T2();
                sVar4.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                sVar4.f5555s.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
