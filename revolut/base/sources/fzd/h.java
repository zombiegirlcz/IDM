package fzd;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreen;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consolidatedStatementCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List<SelectableOption> transactionCategories;
        List<Product> products;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f52613a;
        u uVar = (u) lVarE3;
        cli.y yVar = uVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "ID_PRODUCT_SEE_ALL");
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (zF) {
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            CustomisationParameters customisationParameters = (CustomisationParameters) ((j) j2Var.getValue()).f139143a.getContent();
            if (customisationParameters == null || (products = customisationParameters.getProducts()) == null) {
                products = f0.f322471a;
            }
            uVar.f2(new AllProductsScreen(new AllProductsScreenContract$InputData(products, ((j) j2Var2.getValue()).f139144b.getExpandedProducts(), ((j) j2Var2.getValue()).f139144b.getProductSelection())), popup, new o(uVar, products));
        } else if (Intrinsics.f(listId, "ID_TRANSACTION_CATEGORIES_SEE_ALL")) {
            CustomisationParameters customisationParameters2 = (CustomisationParameters) ((j) ((j2) yVar.f22677a).getValue()).f139143a.getContent();
            if (customisationParameters2 == null || (transactionCategories = customisationParameters2.getTransactionCategories()) == null) {
                transactionCategories = f0.f322471a;
            }
            uVar.f2(new AllCategoriesScreen(new AllCategoriesScreenContract$InputData(new TextLocalisedClause(R$string.consolidated_statement_filters_categories_title, null, null, 14), transactionCategories, ((j) ((j2) yVar.f22677a).getValue()).f139144b.getSelectedCategories())), popup, new o(transactionCategories, uVar));
        }
        return Unit.f186387a;
    }
}
