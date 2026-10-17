package epb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.savings.api.documents.navigation.SavingsDocumentLauncherDestination;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.y0;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        SavingsDocument savingsDocumentI2;
        RowDelegate.Model model = (RowDelegate.Model) obj2;
        f fVar = (f) this.receiver;
        KProperty[] kPropertyArr = FundInfoController.V;
        j jVar = (j) fVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        try {
            savingsDocumentI2 = jVar.I2();
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            savingsDocumentI2 = null;
        }
        if (savingsDocumentI2 != null) {
            jVar.C1(new SavingsDocumentLauncherDestination(savingsDocumentI2));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Fund key information document is not found");
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
            l.a1(jVar, jVar.X1(new y0(null, frg.a.a(), false, 5)), null, null, null, 7);
        }
        return Unit.f186387a;
    }
}
