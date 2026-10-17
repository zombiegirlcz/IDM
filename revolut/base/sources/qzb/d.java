package qzb;

import aw0.n6;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsOptInScreen f250493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsOptInScreen revPointsOptInScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f250493w = revPointsOptInScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f250493w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f250493w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f250493w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f250493w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        RevPointsOptInScreen revPointsOptInScreen = this.f250493w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE3 = revPointsOptInScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar2 = (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) kVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof fub.b) {
                    aVar2.l2(new qu4.s(aVar2, obj3, (Continuation) null), new yi5.b(26));
                }
                break;
            case 1:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE32 = revPointsOptInScreen.d();
                Intrinsics.h(clickData2);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar4 = (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) kVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Object obj4 = clickData2.d;
                if (obj4 instanceof fub.b) {
                    aVar4.l2(new qu4.s(aVar4, obj4, (Continuation) null), new yi5.b(26));
                }
                break;
            case 2:
                n6 buttonModel = (n6) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE33 = revPointsOptInScreen.d();
                Intrinsics.h(buttonModel);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar6 = (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) kVarE33;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
                aVar6.l2(new u(2, aVar6, continuation), new m(aVar6, i2));
                break;
            default:
                String itemId = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVarE34 = revPointsOptInScreen.d();
                Intrinsics.h(itemId);
                com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar8 = (com.revolut.feature.rev_points.impl.ui.opt_in.screen.a) kVarE34;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("MENU_ITEM_NOT_NOW_TAG")) {
                    aVar8.C2(new j(false));
                }
                break;
        }
        return Unit.f186387a;
    }
}
