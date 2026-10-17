package c0c;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreen;
import com.revolut.feature.rev_points.impl.ui.bottom_sheet.RevPointsBottomSheetScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e0;
import m1c.q0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsRedeemScreen f20208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(RevPointsRedeemScreen revPointsRedeemScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f20208w = revPointsRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f20208w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f20208w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevPointsRedeemScreen revPointsRedeemScreen = this.f20208w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE3 = revPointsRedeemScreen.d();
                Intrinsics.h(itemId);
                s sVar = (s) lVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("REV_POINTS_BALANCE_MENU_ID")) {
                    yji.l.j2(sVar, new RevPointsBottomSheetScreen(new RevPointsBottomSheetScreenContract$InputData(e0.REDEEM_HUB)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                }
                break;
            default:
                List<koi.j> items = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarE32 = revPointsRedeemScreen.d();
                Intrinsics.h(items);
                s sVar2 = (s) lVarE32;
                sVar2.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList = new ArrayList();
                for (koi.j jVar : items) {
                    VoucherSmallTileDelegate.Model model = jVar instanceof VoucherSmallTileDelegate.Model ? (VoucherSmallTileDelegate.Model) jVar : null;
                    Object obj3 = model != null ? model.f53623w : null;
                    q0 q0Var = obj3 instanceof q0 ? (q0) obj3 : null;
                    if (q0Var != null) {
                        arrayList.add(q0Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sVar2.H2(sVar2.A, new byc.a(sVar2, arrayList, 7));
                }
                break;
        }
        return Unit.f186387a;
    }
}
