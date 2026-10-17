package wp9;

import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.api.navigation.SplitBillInputData;
import com.revolut.feature.payments.bills_chooser.impl.domain.SplitBillItem;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.SplitBillsSummaryScreenContract$Step;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationController;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.SplitItemizationControllerContract$InputData;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersController;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c f299186b;

    public /* synthetic */ h0(com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar, int i) {
        this.f299185a = i;
        this.f299186b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.f299185a;
        int i2 = 0;
        com.revolut.feature.payments.bills_chooser.impl.ui.bills_split_summary.c cVar = this.f299186b;
        switch (i) {
            case 0:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                SplitBillsSummaryScreenContract$Step step = (SplitBillsSummaryScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof SplitBillsSummaryScreenContract$Step.Itemization) {
                    SplitItemizationController splitItemizationController = new SplitItemizationController(((SplitBillsSummaryScreenContract$Step.Itemization) step).f79244a);
                    i0 block = new i0(cVar, step);
                    Intrinsics.checkNotNullParameter(block, "block");
                    splitItemizationController.H = block;
                    return splitItemizationController;
                }
                if (step instanceof SplitBillsSummaryScreenContract$Step.ItemizationMembers) {
                    ItemizationMembersController itemizationMembersController = new ItemizationMembersController(((SplitBillsSummaryScreenContract$Step.ItemizationMembers) step).f79246a);
                    i0 block2 = new i0(step, cVar);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    itemizationMembersController.H = block2;
                    return itemizationMembersController;
                }
                if (!(step instanceof SplitBillsSummaryScreenContract$Step.UnassignedItemsConfirmation)) {
                    throw new NoWhenBranchMatchedException();
                }
                np9.a aVar = cVar.u;
                SplitBillsSummaryScreenContract$Step.UnassignedItemsConfirmation unassignedItemsConfirmation = (SplitBillsSummaryScreenContract$Step.UnassignedItemsConfirmation) step;
                ArrayList unassignedItems = unassignedItemsConfirmation.f79247a;
                xi0.b currency = unassignedItemsConfirmation.f79248b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(unassignedItems, "unassignedItems");
                Intrinsics.checkNotNullParameter(currency, "currency");
                dj0.d.Companion.getClass();
                dj0.d dVar = dj0.d.e;
                dj0.d dVar2 = dVar;
                for (Object obj4 : unassignedItems) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVar2 = i2 == 0 ? new dj0.d(((SplitBillItem) obj4).f79227c, currency) : pyd.c.O(dVar2, new dj0.d(((SplitBillItem) obj4).f79227c, currency));
                    i2 = i3;
                }
                lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.split_bill_itemize_unassigned_sheet_title, zhm.u.c(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, null, false, 30);
                ArrayList arrayList = new ArrayList(zhm.w.t(unassignedItems, 10));
                Iterator it8 = unassignedItems.iterator();
                while (it8.hasNext()) {
                    arrayList.add(new eii.l((Clause) new TextClause(((SplitBillItem) it8.next()).f79226b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) new TextLocalisedClause(R$string.split_bill_itemize_unassigned_sheet_item_subtitle, null, null, 14), (RowDelegate.Model.MainImage) null, false, false, (RowDelegate.Model.c) null, (Object) null, 488));
                }
                m6 m6Var = n6.Companion;
                aw0.h hVar = new aw0.h(false, m6.c(m6Var, new TextLocalisedClause(R$string.split_bill_itemize_unassigned_sheet_button_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.split_bill_itemize_unassigned_sheet_button_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                k9 value = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                Intrinsics.checkNotNullParameter(value, "value");
                RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(new eii.c(aVar2, hVar, arrayList, new AnalyticsProduct.Retail(value), null));
                wk2.x block3 = new wk2.x(cVar, 25);
                Intrinsics.checkNotNullParameter(block3, "block");
                rowActionsBottomSheetController.H = block3;
                return rowActionsBottomSheetController;
            case 1:
                List items = (List) obj2;
                ItemizedBillData.ScanData scanData = (ItemizedBillData.ScanData) obj3;
                Intrinsics.checkNotNullParameter(items, "items");
                Intrinsics.checkNotNullParameter(scanData, "scanData");
                cVar.H2(cVar.z, new wp5.v(items, scanData, 1));
                return Unit.f186387a;
            default:
                List items2 = (List) obj2;
                ItemizedBillData.ScanData scanData2 = (ItemizedBillData.ScanData) obj3;
                Intrinsics.checkNotNullParameter(items2, "items");
                Intrinsics.checkNotNullParameter(scanData2, "scanData");
                com.revolut.kompot.navigable.vc.modal.a aVar3 = cVar.f79256y;
                SplitBillInputData splitBillInputData = cVar.v;
                xi0.b bVarC = com.revolut.feature.payments.bills_chooser.api.common.a.c(splitBillInputData.f79198b);
                List list = splitBillInputData.f79198b;
                dj0.d.Companion.getClass();
                dj0.d dVarA = dj0.d.e;
                for (Object obj5 : list) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarA = i2 == 0 ? com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj5).a() : pyd.c.O(dVarA, com.revolut.feature.payments.bills_chooser.api.common.a.b((BillType) obj5).a());
                    i2 = i5;
                }
                oki.h.v2(aVar3, new SplitBillsSummaryScreenContract$Step.Itemization(new SplitItemizationControllerContract$InputData(dVarA.f115082a, items2, bVarC, true), scanData2), ModalDestination.Style.POPUP.f98311a);
                return Unit.f186387a;
        }
    }
}
