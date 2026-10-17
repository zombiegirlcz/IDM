package eii;

import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowActionsBottomSheetController f126662w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(RowActionsBottomSheetController rowActionsBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126662w = rowActionsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f126662w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o(this.f126662w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o(this.f126662w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o(this.f126662w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            default:
                o oVar5 = new o(this.f126662w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RowActionsBottomSheetController rowActionsBottomSheetController = this.f126662w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ay4.a aVar2 = rowActionsBottomSheetController.T;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                aVar2.C2(new d(clickData));
                break;
            case 1:
                Object obj3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ay4.a aVar4 = rowActionsBottomSheetController.T;
                Object i2 = ((qv0.p) obj3).getI();
                aVar4.getClass();
                aVar4.C2(new i(i2));
                break;
            case 2:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ay4.a aVar6 = rowActionsBottomSheetController.T;
                Intrinsics.h(clickData2);
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                aVar6.C2(new h(clickData2));
                break;
            case 3:
                lw0.l menuItem = (lw0.l) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ay4.a aVar8 = rowActionsBottomSheetController.T;
                aVar8.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                aVar8.C2(new f(menuItem));
                break;
            default:
                ty0.a clickData3 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ay4.a aVar10 = rowActionsBottomSheetController.T;
                aVar10.getClass();
                Intrinsics.checkNotNullParameter(clickData3, "clickData");
                aVar10.C2(new e(clickData3));
                break;
        }
        return Unit.f186387a;
    }
}
