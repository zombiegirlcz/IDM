package kvl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.trading_orders.common.models.AutoTopUpSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
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
        c cVar = this.v.d;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        String str = model.f53228a;
        if (kotlin.text.a0.H(str, "pocket_", false) && (obj3 instanceof ida.d)) {
            cVar.e3(new AutoTopUpSource.Pocket(((ida.d) obj3).f160458a.f163163a));
        } else if (str.equals("AUTO_TOP_UP_ACTIONS_DIALOG_BUTTON_EDIT")) {
            cVar.c3();
        } else if (str.equals("LIST_ID_AUTO_TOP_UP_EDIT_DIALOG_BUTTON_DELETE")) {
            cVar.b3();
        }
        return Unit.f186387a;
    }
}
