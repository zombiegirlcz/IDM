package n0c;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionDetailsScreen f210980w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f210980w = revPointsTransactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f210980w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f210980w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        RevPointsTransactionDetailsScreen revPointsTransactionDetailsScreen = this.f210980w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = revPointsTransactionDetailsScreen.R2();
                Intrinsics.h(itemId);
                com.revolut.feature.rev_points.impl.ui.transactions.details.b bVar = (com.revolut.feature.rev_points.impl.ui.transactions.details.b) jVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("THREE_DOTS_MENU_ID") && (list = ((h) ((j2) bVar.f83860x.f22677a).getValue()).f210982b) != null) {
                    if (list.isEmpty()) {
                        list = null;
                    }
                    if (list != null) {
                        l0.f(bVar.v, itemId, zi0.c.d(list), null, null, 12);
                    }
                }
                break;
            default:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE32 = revPointsTransactionDetailsScreen.R2();
                String listId = popupMenuItem.getF53837a();
                popupMenuItem.getE();
                ((com.revolut.feature.rev_points.impl.ui.transactions.details.b) jVarE32).getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                break;
        }
        return Unit.f186387a;
    }
}
