package nj9;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pay_later.api.R$string;
import com.revolut.feature.pay_later.impl.ui.activation.ActivationController;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorController;
import com.revolut.feature.pay_later.impl.ui.purchasecalculator.PurchaseCalculatorControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.t;
import vkm.j2;
import zh9.a1;
import zh9.b1;
import zh9.k1;
import zh9.m1;
import zh9.z0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CellDetailsActionDelegate.Model action = (CellDetailsActionDelegate.Model) obj2;
        i iVar = (i) this.receiver;
        KProperty[] kPropertyArr = ActivationController.V;
        n nVar = (n) iVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        Object obj4 = action.f51787l;
        if (obj4 instanceof o) {
            y yVar = nVar.f216430s;
            m1 m1Var = ((h) ((j2) yVar.f22677a).getValue()).f216420c;
            if (m1Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            nVar.f2(new PurchaseCalculatorController(new PurchaseCalculatorControllerContract$InputData(m1Var.a(), ((zh9.n) zi0.c.I(((h) ((j2) yVar.f22677a).getValue()).f216418a)).f.f115083b)), ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a, new nfj.l(nVar, 16));
        } else if (obj4 instanceof p) {
            k1 k1Var = ((p) obj4).f216432a;
            j60.a aVar = nVar.f216428q;
            t tVar = new t(new TextLocalisedClause(R$string.pay_later_term_selector_explainer_max_purchase_amount_too_low_title, null, null, 14), new TextLocalisedClause(R$string.pay_later_term_selector_explainer_max_purchase_amount_too_low_description, v.k(Integer.valueOf(k1Var.f322296a), pi9.b.a(k1Var.f322298c.f322312a, null, 3)), null, 12), null, 28);
            LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("got_id_button", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_got_it, null, null, 14), false, null, null, 0, R$attr.uikit_dp8, 0, 0, 7152);
            yp0.b.r(model, 0, R$attr.uikit_dp8, 0, 0, 13);
            aVar.x(new rp0.y(u.c(model), tVar, null, null, null, null, 1020));
        } else if (obj4 instanceof q) {
            vj9.a aVar2 = ((q) obj4).f216433a;
            qi9.d dVar = nVar.f216429r;
            b1 b1Var = aVar2.f289656a;
            if (b1Var instanceof z0) {
                nVar.C1(dVar.b((z0) b1Var, aVar2.f289657b));
            } else {
                if (!(b1Var instanceof a1)) {
                    throw new NoWhenBranchMatchedException();
                }
                nVar.C1(dVar.c((a1) b1Var));
            }
        }
        return Unit.f186387a;
    }
}
