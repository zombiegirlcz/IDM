package b4b;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import java.time.Clock;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
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
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        j60.a aVar3 = aVar2.B;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        Object obj3 = model.i;
        int iHashCode = str.hashCode();
        int i = 0;
        if (iHashCode != -1367954366) {
            if (iHashCode != -1220896227) {
                if (iHashCode == 1550890570 && str.equals("CALENDAR_SET_BUTTON_ID")) {
                    l3b.a aVar4 = l3b.a.CUSTOM;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type java.time.LocalDate");
                    aVar2.K2(new ExpiryDate(aVar4, ((LocalDate) obj3).atStartOfDay(Clock.systemDefaultZone().getZone())));
                }
            } else if (str.equals("CFD_FEE_BREAKDOWN_DESCRIPTION_DIALOG_GOT_IT_ID")) {
                j60.a.v(aVar3, false, null, 3);
            }
        } else if (str.equals("CALENDAR_SCHEDULE_ID")) {
            aVar2.f82249p.a(new z(obj3 instanceof ExpiryDate ? (ExpiryDate) obj3 : null, i));
            j60.a.v(aVar3, false, null, 3);
        }
        return Unit.f186387a;
    }
}
