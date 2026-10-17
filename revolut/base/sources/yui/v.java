package yui;

import android.os.Parcelable;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.widgets.AvatarWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.e4;
import com.revolut.core.ui_kit.delegates.widgets.g4;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.pay_with_smile.impl.ui.flow.create_passcode.CreatePasscodeFlowContract$State;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import com.youTransactor.uCube.rpc.Constants;
import grl.k9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import pcd.h0;
import zh9.u0;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f317052b;

    public /* synthetic */ v(csh.e eVar, String str, int i) {
        this.f317051a = i;
        this.f317052b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        int i = this.f317051a;
        boolean z = true;
        Object obj3 = null;
        String text = null;
        ar.a aVar = null;
        Object obj4 = null;
        String userPhone = this.f317052b;
        switch (i) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return l.a(update, null, null, null, null, 0, null, null, this.f317052b, null, null, false, false, false, false, 15231);
            case 1:
                return yv2.f.a((yv2.f) obj2, 0, null, new Data(this.f317052b, null, false, 6, null), false, null, false, false, null, Constants.TAG_FB_CHARGING_STATUS);
            case 2:
                yw9.e update2 = (yw9.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return yw9.e.a(update2, this.f317052b, null, null, null, null, 30);
            case 3:
                return ywb.d.a((ywb.d) obj2, null, null, userPhone, 3);
            case 4:
                yxe.f update3 = (yxe.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return yxe.f.a(update3, userPhone);
            case 5:
                z0f.q update4 = (z0f.q) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return z0f.q.a(update4, null, null, this.f317052b, null, null, false, null, null, 4091);
            case 6:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((CardOwnerWithStats) next).f81495a.f81490a, userPhone)) {
                            obj3 = next;
                        }
                    }
                }
                return (CardOwnerWithStats) obj3;
            case 7:
                z66.b update5 = (z66.b) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return z66.b.a(update5, null, null, null, null, null, false, d0.F0(userPhone).toString(), null, 191);
            case 8:
                LoanDetails loanDetails = (LoanDetails) obj2;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                String widgetId = this.f317052b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return new AvatarWidgetDelegate.Model(widgetId, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_percent, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), new TextClause(loanDetails.f70144a.f70119r.getF70169a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.loan_management_widget_mortgage_interest_rate_interest_rate, null, null, 14), null, null, null, null, null, loanDetails, null, 12272);
            case 9:
                z8b.g update6 = (z8b.g) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return z8b.g.a(update6, null, null, userPhone, 3);
            case 10:
                zac.f update7 = (zac.f) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return zac.f.a(update7, userPhone, null, 14);
            case 11:
                zba.f update8 = (zba.f) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return zba.f.a(update8, null, null, userPhone, 3);
            case 12:
                zf5.g update9 = (zf5.g) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                return zf5.g.a(update9, null, null, this.f317052b, null, null, null, 123);
            case 13:
                List details = (List) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                Iterator it9 = details.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (Intrinsics.f(((sf8.m) next2).c(), userPhone)) {
                            obj4 = next2;
                        }
                    }
                }
                return (sf8.m) obj4;
            case 14:
                zfd.h updateState = (zfd.h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return zfd.h.a(updateState, null, null, null, this.f317052b, 7);
            case 15:
                zhb.a update10 = (zhb.a) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                return zhb.a.a(update10, userPhone, null, 2);
            case 16:
                TabCryptoFlowV2Contract$FlowState update11 = (TabCryptoFlowV2Contract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return TabCryptoFlowV2Contract$FlowState.a(update11, qje.o.a(update11.f89811a, this.f317052b, null, false, null, 14), null, 2);
            case 17:
                PlansDashboardLayout$PlanPageLayout$BillingOptions billingOptions = (PlansDashboardLayout$PlanPageLayout$BillingOptions) obj2;
                Intrinsics.checkNotNullParameter(billingOptions, "billingOptions");
                return new zkk.i(this.f317052b, null, billingOptions.f102756b, billingOptions.f102757c, billingOptions.d);
            case 18:
                List options = (List) obj2;
                Intrinsics.checkNotNullParameter(options, "options");
                return new zkk.i(this.f317052b, null, null, null, options);
            case 19:
                ((CreatePasscodeFlowContract$State) obj2).getClass();
                Intrinsics.checkNotNullParameter(userPhone, "userPhone");
                return new CreatePasscodeFlowContract$State(userPhone);
            case 20:
                od0.i challengeAccountOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(challengeAccountOptional, "challengeAccountOptional");
                qib.i iVar = (qib.i) challengeAccountOptional.g();
                dj0.d dVar = iVar != null ? iVar.f246693c.f246687c : null;
                if (iVar == null || dVar == null || dVar.k()) {
                    return jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(userPhone, null), ProductId.SAVINGS), null), null, null, 12);
                }
                StartUpPocket.SavingsAccount savingsAccount = new StartUpPocket.SavingsAccount(userPhone);
                k9 k9Var = k9.Savings;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return u0.f(new MoveMoneyDestination(new MoveMoneyInputData(new Action.Topup(savingsAccount, dVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), true, true), y0.b(MoveMoneyInputData.ExtraConfiguration.LockAmount.f104838a), 2), null));
            case 21:
                zn6.h update12 = (zn6.h) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                Set set = update12.f323674b;
                return zn6.h.a(update12, null, set.contains(userPhone) ? a1.j(set, userPhone) : a1.m(set, userPhone), null, 13);
            case 22:
                com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$State update13 = (com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                update13.getClass();
                Intrinsics.checkNotNullParameter(userPhone, "passcodeOnCreate");
                return new com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$State(userPhone);
            case 23:
                rpb.q totalSavings = (rpb.q) obj2;
                Intrinsics.checkNotNullParameter(totalSavings, "totalSavings");
                List list2 = totalSavings.f256337b;
                dj0.d.Companion.getClass();
                dj0.d dVar2 = dj0.d.e;
                dj0.d dVarO = dVar2;
                int i2 = 0;
                for (Object obj5 : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    dVarO = i2 == 0 ? ((rpb.p) obj5).f256334b : pyd.c.O(dVarO, ((rpb.p) obj5).f256334b);
                    i2 = i3;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(totalSavings.f256336a, null, null, 14);
                MoneyClause moneyClause = new MoneyClause(dVarO, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                int i5 = R$drawable.uikit_icn_24_plus;
                List list3 = totalSavings.f256337b;
                List<rpb.p> list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    z = false;
                } else {
                    for (rpb.p pVar : list4) {
                        h0[] elements = {h0.ACTIVE, h0.PENDING_ACTIVATION};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        if (kotlin.collections.d.y0(elements).contains(pVar.f256335c)) {
                        }
                    }
                    z = false;
                }
                e4 e4Var = new e4(new g4(i5, z), new g4(R$drawable.uikit_icn_24_arrow_down, dVarO.f(dj0.d.e)));
                rpb.p pVar2 = (rpb.p) zhm.d0.M0(list3);
                return new SimpleTileWidgetDelegate.Model(this.f317052b, moneyClause, textLocalisedClause, null, e4Var, (pVar2 == null || (str = pVar2.f256333a) == null) ? zpb.f.f324227a : new zpb.g(str), 40);
            case 24:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `biometric_verification_deffered_upload_metadata` WHERE file_name = ?");
                try {
                    if (userPhone == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, userPhone);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "file_name");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "verification_id");
                    if (sQLiteStatementPrepare.step()) {
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow2)) {
                            text = sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        }
                        aVar = new ar.a(text2, text);
                    }
                    sQLiteStatementPrepare.close();
                    return aVar;
                } finally {
                }
            case 25:
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("DELETE FROM `biometric_verification_deffered_upload_metadata` WHERE file_name = ?");
                try {
                    if (userPhone == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, userPhone);
                    }
                    sQLiteStatementPrepare2.step();
                    Unit unit = Unit.f186387a;
                    sQLiteStatementPrepare2.close();
                    return unit;
                } finally {
                }
            case 26:
                return zq5.u.a((zq5.u) obj2, null, false, null, this.f317052b, null, 23);
            case 27:
                List requests = (List) obj2;
                Intrinsics.checkNotNullParameter(requests, "requests");
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : requests) {
                    if (!Intrinsics.f(((mr8.b) obj6).f208073a, userPhone)) {
                        arrayList.add(obj6);
                    }
                }
                return arrayList;
            case 28:
                PaymentGroup group = (PaymentGroup) obj2;
                Intrinsics.checkNotNullParameter(group, "group");
                return new FeatureCommand(new PaymentsGroupsRedesignFeatureConfig.GroupBillDetails(group, userPhone));
            default:
                zs2.k update14 = (zs2.k) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return zs2.k.a(update14, false, null, null, this.f317052b, 7);
        }
    }

    public /* synthetic */ v(String str, int i) {
        this.f317051a = i;
        this.f317052b = str;
    }
}
