package cvl;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.trading_orders.api.ui.pocket_picker.SourcePocketPickerContract$OutputData;
import com.revolut.trading.orders.ui.screens.pocket_picker.SourcePocketPickerController;
import cul.n0;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SourcePocketPickerController f109483w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(SourcePocketPickerController sourcePocketPickerController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109483w = sourcePocketPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f109483w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f109483w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SourcePocketPickerController sourcePocketPickerController = this.f109483w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE3 = sourcePocketPickerController.R2();
                String listId = ((koi.j) obj3).getF55172b();
                Object f53564b = ((qv0.p) obj3).getF55176j();
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) pVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (f53564b instanceof m) {
                    m mVar = (m) f53564b;
                    bVar.H2(bVar.getState(), new n0(mVar, 11));
                    if (!((l) ((j2) bVar.getState().f22677a).getValue()).f109495l) {
                        bVar.C2(new SourcePocketPickerContract$OutputData(null, mVar.f109497a));
                    }
                } else if (Intrinsics.f(listId, "ERROR_STATE_ID")) {
                    bVar.f107059x.b(Unit.f186387a);
                }
                break;
            default:
                y clickData = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                p pVarE32 = sourcePocketPickerController.R2();
                Intrinsics.h(clickData);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar2 = (com.revolut.trading.orders.ui.screens.pocket_picker.b) pVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ActionsView.Item item = clickData.f167226b;
                Continuation continuation = null;
                if (Intrinsics.f(item.f58316a, "list_id_currency_section_item_other")) {
                    bVar2.n2(new i(bVar2, continuation, 2), new whi.b(6));
                } else {
                    Object obj4 = item.f58324n;
                    xi0.b bVar3 = obj4 instanceof xi0.b ? (xi0.b) obj4 : null;
                    if (bVar3 != null) {
                        bVar2.n2(new cuc.c(bVar2, bVar3, ((l) ((j2) bVar2.getState().f22677a).getValue()).f109490b, (Continuation) null, 7), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
