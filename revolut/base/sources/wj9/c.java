package wj9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_later.api.navigation.PayLaterKompotFeatureConfig;
import com.revolut.feature.pay_later.impl.ui.paymentbreakdown.PayLaterPaymentBreakdownScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import md6.s;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        KProperty[] kPropertyArr = PayLaterPaymentBreakdownScreen.c0;
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof bi9.b) {
            bi9.b bVar = (bi9.b) obj4;
            String strH = s.h(bVar);
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            iVar.C1(new PayLaterKompotFeatureConfig.RepaymentDetailsNavigationDestination(strH, bVar.f15447a.f322366b.f322316a));
        }
        return Unit.f186387a;
    }
}
