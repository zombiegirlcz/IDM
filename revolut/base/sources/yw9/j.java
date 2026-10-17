package yw9;

import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.statements.impl.ui.account.AccountsStatementScreen;
import com.revolut.feature.statements.impl.ui.account.flow.AccountsStatementFlowContract$Step;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.home.SchemeLoungesHomeScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreenContract$InputData;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p35.e0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317364a;

    public /* synthetic */ j(int i) {
        this.f317364a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f317364a) {
            case 0:
                Throwable error = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (nVar == null) {
                    return error;
                }
                return null;
            case 1:
                Throwable error2 = (Throwable) obj2;
                iw9.b bVar = (iw9.b) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bVar == null) {
                    return error2;
                }
                return null;
            case 2:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new ywb.i((List) defaultErrorItemsProvider.invoke(new iii.d(12, null, true, true, null)));
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(6, ywg.e.f317429a, true, false, null));
            case 4:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new ywi.f((List) getDefaultErrorItems2.invoke(new iii.d(8, null, true, true, "ID_ERROR_ITEM")));
            case 5:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return (List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null));
            case 6:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 7:
                NaviCommand homeCommand = (NaviCommand) obj2;
                NaviCommand navCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand, "homeCommand");
                Intrinsics.checkNotNullParameter(navCommand, "navCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand, navCommand);
            case 8:
                NaviCommand homeCommand2 = (NaviCommand) obj2;
                NaviCommand upsellSelectPlanCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand2, "homeCommand");
                Intrinsics.checkNotNullParameter(upsellSelectPlanCommand, "upsellSelectPlanCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand2, upsellSelectPlanCommand);
            case 9:
                NaviCommand homeCommand3 = (NaviCommand) obj2;
                NaviCommand learnCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand3, "homeCommand");
                Intrinsics.checkNotNullParameter(learnCommand, "learnCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand3, learnCommand);
            case 10:
                NaviCommand homeCommand4 = (NaviCommand) obj2;
                NaviCommand trophyRoomCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand4, "homeCommand");
                Intrinsics.checkNotNullParameter(trophyRoomCommand, "trophyRoomCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand4, trophyRoomCommand);
            case 11:
                NaviCommand homeCommand5 = (NaviCommand) obj2;
                NaviCommand wrappedCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand5, "homeCommand");
                Intrinsics.checkNotNullParameter(wrappedCommand, "wrappedCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand5, wrappedCommand);
            case 12:
                NaviCommand homeCommand6 = (NaviCommand) obj2;
                NaviCommand transactionCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand6, "homeCommand");
                Intrinsics.checkNotNullParameter(transactionCommand, "transactionCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand6, transactionCommand);
            case 13:
                Throwable error3 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list == null) {
                    return error3;
                }
                return null;
            case 14:
                NaviCommand homeCommand7 = (NaviCommand) obj2;
                NaviCommand bottomSheetCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand7, "homeCommand");
                Intrinsics.checkNotNullParameter(bottomSheetCommand, "bottomSheetCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand7, bottomSheetCommand);
            case 15:
                NaviCommand homeCommand8 = (NaviCommand) obj2;
                NaviCommand pointsCommand = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand8, "homeCommand");
                Intrinsics.checkNotNullParameter(pointsCommand, "pointsCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand8, pointsCommand);
            case 16:
                Throwable error4 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list2 == null) {
                    return error4;
                }
                return null;
            case 17:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 18:
                NaviCommand homeCommand9 = (NaviCommand) obj2;
                NaviCommand transactionCommand2 = (NaviCommand) obj3;
                Intrinsics.checkNotNullParameter(homeCommand9, "homeCommand");
                Intrinsics.checkNotNullParameter(transactionCommand2, "transactionCommand");
                return com.revolut.retail.core.navigation.a.c(homeCommand9, transactionCommand2);
            case 19:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return null;
            case 20:
                InvoiceTemplate.CustomField field = (InvoiceTemplate.CustomField) obj2;
                String text = (String) obj3;
                Intrinsics.checkNotNullParameter(field, "field");
                Intrinsics.checkNotNullParameter(text, "text");
                return InvoiceTemplate.CustomField.a(field, text, null, 2);
            case 21:
                InvoiceTemplate.CustomField field2 = (InvoiceTemplate.CustomField) obj2;
                String text2 = (String) obj3;
                Intrinsics.checkNotNullParameter(field2, "field");
                Intrinsics.checkNotNullParameter(text2, "text");
                return InvoiceTemplate.CustomField.a(field2, null, text2, 1);
            case 22:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(12, null, true, true, null));
            case 23:
                yki.l FlowCoordinator = (yki.l) obj2;
                AccountsStatementFlowContract$Step step = (AccountsStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof AccountsStatementFlowContract$Step.AccountsStatementScreen) {
                    return new AccountsStatementScreen();
                }
                throw new NoWhenBranchMatchedException();
            case 24:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SchemeLoungesHomeScreenContract$ModalStep step2 = (SchemeLoungesHomeScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof SchemeLoungesHomeScreenContract$ModalStep.HowToActivate)) {
                    throw new NoWhenBranchMatchedException();
                }
                SchemeLoungesHomeScreenContract$ModalStep.HowToActivate howToActivate = (SchemeLoungesHomeScreenContract$ModalStep.HowToActivate) step2;
                return new SchemeLoungesHowToAccessScreen(new SchemeLoungesHowToAccessScreenContract$InputData(howToActivate.f99150a, howToActivate.f99151b, howToActivate.f99152c));
            case 25:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new yyi.i(null, (List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)));
            case 26:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 27:
                Throwable th11 = (Throwable) obj2;
                if (((e0) obj3) == null) {
                    return th11;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                n4l.e eVar = (n4l.e) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (eVar == null) {
                    return error6;
                }
                return null;
            default:
                Throwable error7 = (Throwable) obj2;
                yhm.r rVar = (yhm.r) obj3;
                Intrinsics.checkNotNullParameter(error7, "error");
                if (rVar == null) {
                    return error7;
                }
                return null;
        }
    }
}
