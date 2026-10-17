package se1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ SaleScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SaleScreen saleScreen, Continuation continuation) {
        super(2, continuation);
        this.u = saleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.u.T2();
        iVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_custom_item_new_sale_action_add_description, null, null, 14);
        String str = ((d) iVar.t2()).f262081b;
        iVar.Y1(new AddNoteScreen(new AddNoteScreenContract$InputData(textLocalisedClause, new TextLocalisedClause(R$string.product_catalogue_common_title_description, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_common_action_save, null, null, 14), str)), ModalDestination.Style.POPUP.f98311a, new g(iVar, 1));
        return Unit.f186387a;
    }
}
