package qwf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransitCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarH3 = this.v.T2();
        String str = model.f52613a;
        Object obj3 = model.i;
        ruf.e model2 = new ruf.e(str, obj3);
        z zVar = (z) qVarH3;
        zVar.getClass();
        Intrinsics.checkNotNullParameter(model2, "model");
        if (obj3 instanceof TransportCheckoutField) {
            zVar.f249941s.h3((TransportCheckoutField) obj3);
        } else if (str.equals("ID_ELIGIBILITY_ACTION_GOT_IT")) {
            j60.a.v(zVar.v, false, null, 3);
        }
        return Unit.f186387a;
    }
}
