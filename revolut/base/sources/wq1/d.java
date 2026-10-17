package wq1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PagoPABillInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PagoPABillInputScreen pagoPABillInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pagoPABillInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData text = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarT2 = this.v.T2();
        Intrinsics.h(text);
        q qVar = (q) lVarT2;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        String upperCase = text.f52598b.toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        String str = text.f52597a;
        int iHashCode = str.hashCode();
        if (iHashCode != -358314579) {
            if (iHashCode != 758805536) {
                if (iHashCode == 1842817259 && str.equals("FISCAL_CODE_LIST_ID")) {
                    qVar.x2(new wb3.k(upperCase, 19));
                }
            } else if (str.equals("VEHICLE_PLATE_LIST_ID")) {
                qVar.x2(new wb3.k(upperCase, 20));
            }
        } else if (str.equals("NOTICE_NUMBER_LIST_ID")) {
            qVar.x2(new wb3.k(upperCase, 18));
        }
        return Unit.f186387a;
    }
}
