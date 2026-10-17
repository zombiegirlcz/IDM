package xzd;

import cli.y;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreen;
import com.revolut.feature.statements.impl.ui.custom_statement.screen.CustomStatementScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomStatementScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CustomStatementScreen customStatementScreen, Continuation continuation) {
        super(2, continuation);
        this.v = customStatementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CustomisationParameters parameters;
        CustomisationParameters parameters2;
        Locale language;
        xi0.b currency;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        String listId = model.f51781a;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = (com.revolut.feature.statements.impl.ui.custom_statement.screen.b) mVarE3;
        y yVar = bVar.f88354x;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.z;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        ?? transactionCategories = 0;
        transactionDirections = null;
        List<SelectableOption> transactionDirections = null;
        transactionCategories = 0;
        switch (iHashCode) {
            case 62698546:
                if (listId.equals("ID_CATEGORIES_ITEM")) {
                    CustomStatementData customStatementData = (CustomStatementData) ((k) ((j2) yVar.f22677a).getValue()).f309930a.getContent();
                    if (customStatementData != null && (parameters = customStatementData.getParameters()) != null) {
                        transactionCategories = parameters.getTransactionCategories();
                    }
                    if (transactionCategories != 0) {
                        oki.h.v2(aVar2, new CustomStatementScreenContract$ModalStep.Categories(transactionCategories, d0.d1(bVar.I2().getSelectedCategories())), popup);
                    }
                }
                break;
            case 742203704:
                if (listId.equals("ID_TRANSACTION_DIRECTION_ITEM")) {
                    CustomStatementData customStatementData2 = (CustomStatementData) ((k) ((j2) yVar.f22677a).getValue()).f309930a.getContent();
                    if (customStatementData2 != null && (parameters2 = customStatementData2.getParameters()) != null) {
                        transactionDirections = parameters2.getTransactionDirections();
                    }
                    if (transactionDirections != null) {
                        oki.h.v2(aVar2, new CustomStatementScreenContract$ModalStep.TransactionDirections(transactionDirections, d0.d1(bVar.I2().getSelectedTransactionDirections())), popup);
                    }
                }
                break;
            case 748075516:
                if (listId.equals("ID_LANGUAGE") && (language = bVar.I2().getLanguage()) != null) {
                    oki.h.v2(aVar2, new CustomStatementScreenContract$ModalStep.LanguagePicker(language), popup);
                }
                break;
            case 1949816242:
                if (listId.equals("ID_DISPLAY_CURRENCY") && (currency = bVar.I2().getCurrency()) != null) {
                    bVar.l2(new xnl.f(bVar, currency, transactionCategories, 22), new yi5.b(26));
                }
                break;
            case 1996142903:
                if (listId.equals("ID_FORMAT_ITEM")) {
                    bVar.l2(new p(bVar, transactionCategories, 1), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
