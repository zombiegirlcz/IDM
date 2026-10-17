package xyh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_crypto_order_flow.impl.exchange.extensions.dialog.OrderTypeDialogController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderTypeDialogController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(OrderTypeDialogController orderTypeDialogController, Continuation continuation) {
        super(2, continuation);
        this.v = orderTypeDialogController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wd6.h hVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        String listId = model.f53228a;
        o oVar = (o) eVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1785655485:
                if (listId.equals("RECURRING_ORDER_DIALOG_ITEM_ID")) {
                    hVar = wd6.h.RECURRING;
                    oVar.C2(new d(hVar));
                    return Unit.f186387a;
                }
                break;
            case -1265328827:
                if (listId.equals("TAKE_PROFIT_STOP_LOSS_ITEM_ID")) {
                    hVar = wd6.h.TAKE_PROFIT_STOP_LOSS;
                    oVar.C2(new d(hVar));
                    return Unit.f186387a;
                }
                break;
            case -836234971:
                if (listId.equals("LIMIT_ORDER_DIALOG_ITEM_ID")) {
                    hVar = wd6.h.LIMIT;
                    oVar.C2(new d(hVar));
                    return Unit.f186387a;
                }
                break;
            case -224134370:
                if (listId.equals("STOP_ORDER_DIALOG_ITEM_ID")) {
                    hVar = wd6.h.STOP;
                    oVar.C2(new d(hVar));
                    return Unit.f186387a;
                }
                break;
            case 2082257700:
                if (listId.equals("MARKET_ORDER_DIALOG_ITEM_ID")) {
                    hVar = wd6.h.MARKET;
                    oVar.C2(new d(hVar));
                    return Unit.f186387a;
                }
                break;
        }
        throw new IllegalStateException("invalid list id");
    }
}
