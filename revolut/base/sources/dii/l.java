package dii;

import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ActionsBottomSheetController f115072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(ActionsBottomSheetController actionsBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f115072w = actionsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f115072w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f115072w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f115072w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ActionsBottomSheetController actionsBottomSheetController = this.f115072w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = actionsBottomSheetController.N;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                mVar.C2(new b(clickData));
                break;
            case 1:
                lw0.l menuItem = (lw0.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar2 = actionsBottomSheetController.N;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(menuItem, "menuItem");
                mVar2.C2(new d(menuItem));
                break;
            default:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar3 = actionsBottomSheetController.N;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                mVar3.C2(new c(clickData2));
                break;
        }
        return Unit.f186387a;
    }
}
