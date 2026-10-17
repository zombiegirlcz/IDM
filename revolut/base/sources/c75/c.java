package c75;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.impl.ui.rev10.loanslist.LoansListScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        e eVar = (e) this.receiver;
        KProperty[] kPropertyArr = LoansListScreen.c0;
        g gVar = (g) eVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        if (obj4 instanceof Loan) {
            d8l.d.t(gVar, new FeatureCommand(new LoanHomeFeatureConfig(((Loan) obj4).f70108a)));
        }
        return Unit.f186387a;
    }
}
