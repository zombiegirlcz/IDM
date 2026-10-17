package w4k;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.t;
import rp0.y;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Clause clause = model.i;
        j60.a aVar2 = this.v.f294623l;
        t tVar = new t(new TextLocalisedClause(R$string.payments_transfer_estimation_bottom_sheet_title, v.l(clause), null, 12), new TextLocalisedClause(R$string.payments_transfer_estimation_bottom_sheet_subtitle, u.c(new TextLocalisedClause(R$string.payments_transfer_estimation_bottom_sheet_subtitle_here, null, new Click(30, (Integer) null, (Object) null, "DESCRIPTION_HERE_BUTTON_ID", false), 10)), null, 12), new rp0.v("IMAGE_MENU_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D031", null, null, null, 30)), 24);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transfer_remittance_price_comparison_cheaper_price_dialog_button_title, null, null, 14);
        int i = R$attr.uikit_dp16;
        aVar2.x(new y(u.c(new LargeActionButtonDelegate.Model("GOT_IT_BUTTON_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i, R$attr.uikit_dp24, i, i, 496)), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
