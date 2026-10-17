package q34;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.TicketProgression;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.CobrandedCardsPlanHubTransactionsScreenContract$ModalStep;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.details.CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.WealthMarginMinimumRequirementContract$ModalStep;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreen;
import com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_status_info.MarginStatusInfoScreenContract$InputData;
import do3.n;
import e7l.f;
import java.util.List;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import q3d.k;
import q64.p;
import q6h.j;
import q75.m;
import v1d.l;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241791a;

    public /* synthetic */ a(int i) {
        this.f241791a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f241791a) {
            case 0:
                Intrinsics.checkNotNullParameter((String) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter((TicketProgression) obj3, "<unused var>");
                int i = h.f175850a;
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new l(new TextLocalisedClause(R$string.shared_watchlist_widget_watchlist_error_title, null, null, 14), new TextLocalisedClause(R$string.shared_watchlist_watchlist_screen_asset_section_buttons_try_again, null, null, 14));
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return k.a();
            case 3:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null));
            case 4:
                Throwable th10 = (Throwable) obj2;
                if (((List) obj3) == null) {
                    return th10;
                }
                return null;
            case 5:
                Throwable th11 = (Throwable) obj2;
                if (((Boolean) obj3) == null) {
                    return th11;
                }
                return null;
            case 6:
                Throwable th12 = (Throwable) obj2;
                if (((n) obj3) == null) {
                    return th12;
                }
                return null;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 8:
                Throwable error = (Throwable) obj2;
                f fVar = (f) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (fVar == null) {
                    return error;
                }
                return null;
            case 9:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return (List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null));
            case 10:
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                return new p((List) getDefaultErrorItems3.invoke(new iii.d(14, null, true, false, null)));
            case 11:
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return (List) getDefaultErrorItems4.invoke(new iii.d(14, null, true, false, null));
            case 12:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 13:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                WealthMarginMinimumRequirementContract$ModalStep step = (WealthMarginMinimumRequirementContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, WealthMarginMinimumRequirementContract$ModalStep.MarginStatusInfo.f95467a)) {
                    return new MarginStatusInfoScreen(new MarginStatusInfoScreenContract$InputData(u6h.d.MARGIN_REQUIRED_MINIMUM));
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                Function1 getDefaultErrorItems5 = (Function1) obj3;
                j.a aVar = j.Companion;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems5, "getDefaultErrorItems");
                return (List) getDefaultErrorItems5.invoke(new iii.d(10, null, true, false, "error_item"));
            case 15:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                i.Companion.getClass();
                return i.f224256b;
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 17:
                Throwable error2 = (Throwable) obj2;
                f fVar2 = (f) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (fVar2 == null) {
                    return error2;
                }
                return null;
            case 18:
                Function1 getDefaultErrorItems6 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems6, "getDefaultErrorItems");
                return new m((List) getDefaultErrorItems6.invoke(new iii.d(14, null, true, false, null)), new q75.h(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null);
            case 19:
                Throwable error3 = (Throwable) obj2;
                fo3.c cVar = (fo3.c) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (cVar == null) {
                    return error3;
                }
                return null;
            case 20:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CobrandedCardsPlanHubTransactionsScreenContract$ModalStep step2 = (CobrandedCardsPlanHubTransactionsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof CobrandedCardsPlanHubTransactionsScreenContract$ModalStep.TransactionDetails) {
                    return new CobrandedCardsPlanHubTransactionDetailsScreen(new CobrandedCardsPlanHubTransactionDetailsScreenContract$InputData(((CobrandedCardsPlanHubTransactionsScreenContract$ModalStep.TransactionDetails) step2).f82604a));
                }
                throw new NoWhenBranchMatchedException();
            case 21:
                Function1 getDefaultErrorItems7 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems7, "getDefaultErrorItems");
                return hx7.a.p(getDefaultErrorItems7);
            case 22:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return Boolean.FALSE;
            case 23:
                Function1 getDefaultErrorItems8 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems8, "getDefaultErrorItems");
                return (List) getDefaultErrorItems8.invoke(new iii.d(14, null, false, false, null));
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 25:
                Function1 getDefaultErrorItems9 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems9, "getDefaultErrorItems");
                return (List) getDefaultErrorItems9.invoke(new iii.d(12, null, true, true, null));
            case 26:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 27:
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            default:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f241791a = i;
    }
}
