package cxe;

import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$ModalStep;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.bottom_sheet.CheckoutBottomSheetInput;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CheckoutTopupScreen f109944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(CheckoutTopupScreen checkoutTopupScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109944w = checkoutTopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g0 g0Var = new g0(this.f109944w, continuation, 0);
                g0Var.v = obj2;
                return g0Var;
            case 1:
                g0 g0Var2 = new g0(this.f109944w, continuation, 1);
                g0Var2.v = obj2;
                return g0Var2;
            default:
                g0 g0Var3 = new g0(this.f109944w, continuation, 2);
                g0Var3.v = obj2;
                return g0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g0) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g0) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CheckoutTopupScreen checkoutTopupScreen = this.f109944w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = checkoutTopupScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) oVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                cVar.n2(new cvi.j(clickData, cVar, (Continuation) null), new whi.b(6));
                break;
            case 1:
                String listId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = checkoutTopupScreen.R2();
                Intrinsics.h(listId);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar2 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) oVarE32;
                cVar2.getClass();
                com.revolut.kompot.navigable.vc.modal.a aVar3 = cVar2.z;
                Intrinsics.checkNotNullParameter(listId, "listId");
                int iHashCode = listId.hashCode();
                if (iHashCode != -2139250438) {
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (iHashCode != -2059631958) {
                        if (iHashCode == 665635567 && listId.equals("ID_REV_POINTS_NAV_BAR_MENU_ITEM")) {
                            oki.h.v2(aVar3, CheckoutScreenContract$ModalStep.RevPointsBottomSheet.f90725a, bottom_dialog);
                        }
                    } else if (listId.equals("TOOLBAR_MENU_ITEM_CANCEL")) {
                        cVar2.f90745q.getClass();
                        oki.h.v2(aVar3, new CheckoutScreenContract$ModalStep.ShowDialog(CheckoutBottomSheetInput.CancelOrder.f90731a), bottom_dialog);
                    }
                } else if (listId.equals("TOOLBAR_MENU_ITEM_NOT_NOW")) {
                    cVar2.C2(m.f109958a);
                }
                break;
            default:
                h extraTopUpAmountAction = (h) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = checkoutTopupScreen.R2();
                Intrinsics.h(extraTopUpAmountAction);
                com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c cVar3 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.c) oVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(extraTopUpAmountAction, "extraTopUpAmountAction");
                cVar3.n2(new cn0.d(cVar3, extraTopUpAmountAction, (Continuation) null, 25), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
