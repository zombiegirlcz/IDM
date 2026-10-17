package lk9;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.pay_later.impl.ui.repaymentdetails.PayLaterRepaymentDetailsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) obj2;
        o oVar = (o) this.receiver;
        KProperty[] kPropertyArr = PayLaterRepaymentDetailsScreen.f78910k0;
        y yVar = (y) oVar;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        com.revolut.feature.pay_later.impl.ui.help.a aVar = (com.revolut.feature.pay_later.impl.ui.help.a) yVar.v;
        aVar.getClass();
        aVar.V2(new qc8.b(aVar, null, 7), new yi5.b(29));
        return Unit.f186387a;
    }
}
