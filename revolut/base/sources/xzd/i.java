package xzd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CustomStatementScreen customStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CustomisationParameters parameters;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f53228a;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_ACCOUNTS_ITEM")) {
            CustomStatementData customStatementData = (CustomStatementData) ((k) ((j2) bVar.f88354x.f22677a).getValue()).f309930a.getContent();
            List<Product> products = (customStatementData == null || (parameters = customStatementData.getParameters()) == null) ? null : parameters.getProducts();
            if (products != null) {
                oki.h.v2(bVar.z, new CustomStatementScreenContract$ModalStep.Products(products, bVar.I2().getProductSelection(), d0.d1(bVar.I2().getExpandedProducts())), ModalDestination.Style.POPUP.f98311a);
            }
        }
        return Unit.f186387a;
    }
}
