package fjd;

import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreen;
import com.revolut.feature.shops.impl.ui.home.ShopsCombinedHomeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ShopsCombinedHomeScreen f135569w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(ShopsCombinedHomeScreen shopsCombinedHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135569w = shopsCombinedHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f135569w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f135569w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            case 2:
                f fVar3 = new f(this.f135569w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
            case 3:
                f fVar4 = new f(this.f135569w, continuation, 3);
                fVar4.v = obj2;
                return fVar4;
            case 4:
                f fVar5 = new f(this.f135569w, continuation, 4);
                fVar5.v = obj2;
                return fVar5;
            case 5:
                f fVar6 = new f(this.f135569w, continuation, 5);
                fVar6.v = obj2;
                return fVar6;
            default:
                f fVar7 = new f(this.f135569w, continuation, 6);
                fVar7.v = obj2;
                return fVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((d9) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        ShopsCombinedHomeScreen shopsCombinedHomeScreen = this.f135569w;
        switch (i) {
            case 0:
                d9 d9Var = (d9) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE3 = shopsCombinedHomeScreen.R2();
                String listId = d9Var.f54014a;
                com.revolut.feature.shops.impl.ui.home.a aVar2 = (com.revolut.feature.shops.impl.ui.home.a) uVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                aVar2.M2(listId);
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE32 = shopsCombinedHomeScreen.R2();
                String listId2 = aVar3.f275445a;
                com.revolut.feature.shops.impl.ui.home.a aVar5 = (com.revolut.feature.shops.impl.ui.home.a) uVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                aVar5.M2(listId2);
                break;
            case 2:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE33 = shopsCombinedHomeScreen.R2();
                String id10 = aVar6.f275445a;
                com.revolut.feature.shops.impl.ui.home.a aVar8 = (com.revolut.feature.shops.impl.ui.home.a) uVarE33;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                aVar8.n2(new f0(aVar8, id10, continuation, i2), new whi.b(6));
                break;
            case 3:
                List listOfItems = (List) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE34 = shopsCombinedHomeScreen.R2();
                Intrinsics.h(listOfItems);
                com.revolut.feature.shops.impl.ui.home.a aVar10 = (com.revolut.feature.shops.impl.ui.home.a) uVarE34;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(listOfItems, "listOfItems");
                aVar10.n2(new g0(aVar10, listOfItems, continuation, i2), new whi.b(6));
                break;
            case 4:
                String listId3 = (String) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE35 = shopsCombinedHomeScreen.R2();
                Intrinsics.h(listId3);
                com.revolut.feature.shops.impl.ui.home.a aVar12 = (com.revolut.feature.shops.impl.ui.home.a) uVarE35;
                aVar12.getClass();
                Intrinsics.checkNotNullParameter(listId3, "listId");
                if (listId3.equals("SHOPS_COMBINED_ACTION_ID_REV_POINTS")) {
                    oki.h.v2(aVar12.P, ShopsCombinedHomeScreenContract$ModalStep.RevPointsBottomSheet.f87190a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            case 5:
                String str = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u uVarE36 = shopsCombinedHomeScreen.R2();
                Intrinsics.h(str);
                ((com.revolut.feature.shops.impl.ui.home.a) uVarE36).O2(str, true);
                break;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.shops.impl.ui.home.a aVar15 = (com.revolut.feature.shops.impl.ui.home.a) shopsCombinedHomeScreen.R2();
                aVar15.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                aVar15.v.b3(viewableRecordSnapshot);
                break;
        }
        return Unit.f186387a;
    }
}
