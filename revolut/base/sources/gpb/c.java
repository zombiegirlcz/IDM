package gpb;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.y;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) obj2;
        h hVar = (h) this.receiver;
        KProperty[] kPropertyArr = InterestAndFeesScreen.W;
        o oVar = (o) hVar;
        skb.f fVar = oVar.f145422p;
        j60.a aVar = oVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51832a;
        if (Intrinsics.f(str, "SERVICE_FEE_INTEREST_ITEM_LIST_ID")) {
            aVar.x(fVar.d());
        } else if (Intrinsics.f(str, "TAX_ITEM_LIST_ID")) {
            Object content = ((g) ((j2) oVar.f145426t.f22677a).getValue()).f145416a.getContent();
            if (content == null) {
                throw new IllegalStateException("Illegal state Data should not be null");
            }
            y yVarF = fVar.f((SavingsProductData) content);
            if (yVarF != null) {
                aVar.x(yVarF);
            }
        }
        return Unit.f186387a;
    }
}
