package epb;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        f fVar = (f) this.receiver;
        KProperty[] kPropertyArr = FundInfoController.V;
        j jVar = (j) fVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        jVar.n2(new i(jVar, null), new whi.b(6));
        return Unit.f186387a;
    }
}
