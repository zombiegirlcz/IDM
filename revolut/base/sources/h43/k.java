package h43;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.chooser.ChooserScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ChooserScreen chooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.d();
        Intrinsics.h(model);
        s sVar = (s) oVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1985689064) {
            if (iHashCode != -1578114620) {
                if (iHashCode == -1367817307 && str.equals("ADD_NEW_CARD_ITEM")) {
                    sVar.L2();
                }
            } else if (str.equals("LIST_ID_ORDER_PHYSICAL_CARD")) {
                sVar.I2(b93.e.PHYSICAL);
            }
        } else if (str.equals("LIST_ID_ORDER_VIRTUAL_CARD")) {
            sVar.I2(b93.e.VIRTUAL);
        }
        return Unit.f186387a;
    }
}
