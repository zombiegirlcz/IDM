package ukh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        InvestDocumentsType taxAdvantageDocument;
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        j jVar = (j) this.receiver;
        KProperty[] kPropertyArr = InvestDocumentsScreen.c0;
        m mVar = (m) jVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.u;
        i iVar = obj4 instanceof i ? (i) obj4 : null;
        if (iVar != null) {
            if (iVar instanceof g) {
                g gVar = (g) iVar;
                taxAdvantageDocument = new InvestDocumentsType.Stocks(gVar.f280756a, gVar.f280757b);
            } else if (iVar instanceof f) {
                taxAdvantageDocument = InvestDocumentsType.ROBO.f95912a;
            } else if (iVar instanceof d) {
                taxAdvantageDocument = InvestDocumentsType.COMMODITY.f95910a;
            } else if (iVar instanceof e) {
                taxAdvantageDocument = new InvestDocumentsType.MarginTrading(((e) iVar).f280754a);
            } else {
                if (!(iVar instanceof h)) {
                    throw new NoWhenBranchMatchedException();
                }
                h hVar = (h) iVar;
                taxAdvantageDocument = new InvestDocumentsType.TaxAdvantageDocument(hVar.f280758a, hVar.f280759b);
            }
            mVar.C1(new InvestDocumentsDetailsDestination(taxAdvantageDocument));
        }
        return Unit.f186387a;
    }
}
