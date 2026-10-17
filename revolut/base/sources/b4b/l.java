package b4b;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import java.time.ZonedDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ExpiryDate expiryDate;
        ExpiryDate expiryDate2;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        l3b.a aVar3 = obj3 instanceof l3b.a ? (l3b.a) obj3 : null;
        if (aVar3 != null) {
            ZonedDateTime zonedDateTimeK = ((l80.f) aVar2.A).k();
            int i = a0.f12209a[aVar3.ordinal()];
            if (i == 1) {
                expiryDate = new ExpiryDate(aVar3, zonedDateTimeK.plusDays(90L));
            } else if (i == 2) {
                expiryDate = new ExpiryDate(aVar3, zonedDateTimeK);
            } else {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Can't select " + aVar3 + " date type");
                }
                expiryDate2 = new ExpiryDate(l3b.a.CUSTOM, zonedDateTimeK);
                aVar2.K2(expiryDate2);
            }
            expiryDate2 = expiryDate;
            aVar2.K2(expiryDate2);
        }
        return Unit.f186387a;
    }
}
