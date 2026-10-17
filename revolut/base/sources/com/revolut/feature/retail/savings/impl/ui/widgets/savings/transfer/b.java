package com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer;

import a15.n;
import an4.g;
import aqb.e;
import aqb.f;
import aqb.k;
import aqb.o;
import aqb.r;
import aqb.s;
import aqb.w;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.revolut.feature_fourthline_impl.R;
import d8l.d;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import pcd.g0;
import rp0.l;
import rp0.t;
import rp0.y;
import uib.c;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f83399a;

    public b(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f83399a = savingsInterestRateFormatter;
    }

    public static LargeActionButtonDelegate.Model b(String str) {
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(str, LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.button_action_done, null, null, 14), false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp8;
        int i3 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i2, i3, i3);
        return model;
    }

    public static List c() {
        List listK = v.k(new pb0("LOADING_STATE_ID_1"), new pb0("LOADING_STATE_ID_2"), new pb0("LOADING_STATE_ID_3"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // jki.p
    public final m a(i iVar) {
        TextLocalisedClause textLocalisedClause;
        y yVar;
        uib.a aVar;
        c cVar;
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransferWidgetCustomisationScreenContract$BottomSheetState transferWidgetCustomisationScreenContract$BottomSheetState = domainState.f8282a;
        Data data = domainState.f8283b;
        if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a)) {
            yVar = new y((List) iii.c.f(data, new s(this, 4), new g(29), new w(domainState.f8284c, domainState.e, this)), new t(new TextLocalisedClause(R$string.widgets_catalogue_savings_customise_sheet_title, null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016);
        } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.SelectAccount.f83390a)) {
            String str = domainState.d;
            if (str == null) {
                str = "ALL_ACCOUNTS_LIST_ID";
            }
            e eVar = (e) data.getContent();
            yVar = new y(d0.F0(b("SELECT_SAVINGS_DONE_BUTTON_LIST_ID"), (Collection) iii.c.f(data, new s(this, 2), new g(27), new n(str, this, 22))), new t(new TextLocalisedClause((eVar == null || (aVar = eVar.f8281b) == null || (cVar = aVar.f280366a) == null) ? R$string.savings_umbrella_products_group_name_savings_and_funds : oc.c.r(cVar), null, null, 14), null, null, 30), l.WINDOW, null, null, null, 1016);
        } else {
            boolean z = transferWidgetCustomisationScreenContract$BottomSheetState instanceof TransferWidgetCustomisationScreenContract$BottomSheetState.TopUp;
            TransferWidgetCustomisationScreenContract$BottomSheetState.Goal goal = TransferWidgetCustomisationScreenContract$BottomSheetState.Goal.f83389a;
            TransferWidgetCustomisationScreenContract$BottomSheetState.SpareChange spareChange = TransferWidgetCustomisationScreenContract$BottomSheetState.SpareChange.f83391a;
            TransferWidgetCustomisationScreenContract$BottomSheetState.Withdraw withdraw = TransferWidgetCustomisationScreenContract$BottomSheetState.Withdraw.f83393a;
            if (!z && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, withdraw) && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, spareChange) && !Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, goal)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_funding_options_add_money, null, null, 14);
            } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, withdraw)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.money_boxes_details_action_withdraw, null, null, 14);
            } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, spareChange)) {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_spare_change_bottom_sheet_title, null, null, 14);
            } else {
                if (!Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, goal)) {
                    throw new IllegalStateException(h30.l.r("Unhandled case, stateType=", o0.f186429a.b(transferWidgetCustomisationScreenContract$BottomSheetState.getClass()).m()));
                }
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_details_edit_your_vault_goal, null, null, 14);
            }
            yVar = new y((List) iii.c.f(data, new s(this, 3), new g(28), new n(this, transferWidgetCustomisationScreenContract$BottomSheetState, 23)), new t(textLocalisedClause, null, null, 30), l.WINDOW, null, null, null, 1016);
        }
        return new r(yVar);
    }

    public final ArrayList d(List list, String str, TransferWidgetCustomisationScreenContract$BottomSheetState transferWidgetCustomisationScreenContract$BottomSheetState) {
        Object kVar;
        List<SavingsAccountDetails> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (SavingsAccountDetails savingsAccountDetails : list2) {
            pcd.s sVar = savingsAccountDetails.f86460a;
            Image image = savingsAccountDetails.f86461b;
            SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
            String str2 = sVar.f234881a;
            g0 g0Var = sVar.f234885h;
            boolean zF = Intrinsics.f(str, str2);
            Clause clauseG = null;
            if (savingsProductData != null) {
                clauseG = this.f83399a.g(savingsProductData, false, null, true);
            }
            Clause clause = clauseG;
            String str3 = sVar.f234881a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(image, d.b(zF), null, false, null, false, 60);
            TextClause textClause = new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a) || Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.SelectAccount.f83390a)) {
                kVar = new k(str2, g0Var.f234859a);
            } else if (transferWidgetCustomisationScreenContract$BottomSheetState instanceof TransferWidgetCustomisationScreenContract$BottomSheetState.TopUp) {
                kVar = new aqb.n(str2, ((TransferWidgetCustomisationScreenContract$BottomSheetState.TopUp) transferWidgetCustomisationScreenContract$BottomSheetState).f83392a);
            } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Withdraw.f83393a)) {
                kVar = new o(str2);
            } else if (Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.SpareChange.f83391a)) {
                kVar = new aqb.m(str2);
            } else {
                if (!Intrinsics.f(transferWidgetCustomisationScreenContract$BottomSheetState, TransferWidgetCustomisationScreenContract$BottomSheetState.Goal.f83389a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kVar = new aqb.l(str2);
            }
            arrayList.add(new RowDelegate.Model(str3, image40, textClause, null, 0, clause, null, null, 0, bVar, false, null, zF, null, null, null, null, null, null, kVar, null, 0, 0, 0, 0, 532667352));
        }
        return arrayList;
    }
}
