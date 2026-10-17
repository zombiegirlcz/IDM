package d27;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreen;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.OrderInitPageCreateScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OrderInitPageCreateScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(OrderInitPageCreateScreen orderInitPageCreateScreen, Continuation continuation) {
        super(2, continuation);
        this.v = orderInitPageCreateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarD = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar2 = (com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) zVarD;
        cli.y yVar = aVar2.E;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "LIST_ID_ITEM_EXPIRY_DATE_INPUT")) {
            LocalDate localDateE = ((l80.f) aVar2.f74179p).e();
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.F;
            aVar2.f74185x.getClass();
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_sale_setup_expiry_date_picker_title, null, null, 14);
            LocalDate localDate = ((u) ((j2) yVar.f22677a).getValue()).f110775g.f110767a;
            LocalDate localDate2 = localDate == null ? localDateE : localDate;
            LocalDate localDate3 = ((u) ((j2) yVar.f22677a).getValue()).f110775g.f110767a;
            LocalDate localDatePlusDays = localDateE.plusDays(1L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
            LocalDate localDatePlusDays2 = localDateE.plusDays(180L);
            Intrinsics.checkNotNullExpressionValue(localDatePlusDays2, "plusDays(...)");
            oki.h.v2(aVar3, new OrderInitPageCreateScreenContract$Step.DatePicker(textLocalisedClause, localDate2, localDate3, localDatePlusDays, localDatePlusDays2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
