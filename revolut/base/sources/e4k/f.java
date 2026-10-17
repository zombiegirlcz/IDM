package e4k;

import aw0.m6;
import aw0.n6;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.feature.shared.help_centre.impl.R$string;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.amount.BankTransferAmountScreen;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122592a;

    public /* synthetic */ f(int i) {
        this.f122592a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f122592a) {
            case 0:
                SuggestionsBarDelegate.Suggestion it8 = (SuggestionsBarDelegate.Suggestion) obj2;
                KProperty[] kPropertyArr = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.f53496h;
                if (obj3 instanceof String) {
                    return (String) obj3;
                }
                return null;
            case 1:
                SelectableDelegate.Model it9 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj4 = ((RowDelegate.Model) it9.f53305b).u;
                if (obj4 instanceof kq2.c) {
                    return (kq2.c) obj4;
                }
                return null;
            case 2:
                ty0.a it10 = (ty0.a) obj2;
                KProperty[] kPropertyArr3 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj5 = it10.d;
                if (obj5 instanceof kq2.e) {
                    return (kq2.e) obj5;
                }
                return null;
            case 3:
                LargeActionButtonDelegate.Model it11 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj6 = it11.i;
                if (obj6 instanceof kq2.c) {
                    return (kq2.c) obj6;
                }
                return null;
            case 4:
                LargeActionButtonDelegate.Model it12 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(zhm.u.c("INTEREST_DIALOG_BUTTON_ID").contains(it12.f52613a));
            case 5:
                LargeActionButtonDelegate.Model it13 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr6 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(Intrinsics.f(it13.f52613a, "FLOW_LIMITS_DIALOG_BUTTON_ID"));
            case 6:
                LargeActionButtonDelegate.Model it14 = (LargeActionButtonDelegate.Model) obj2;
                KProperty[] kPropertyArr7 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f52613a, "ID_CONFIRM_FIELD"));
            case 7:
                CenteredAmountDelegate.Model it15 = (CenteredAmountDelegate.Model) obj2;
                KProperty[] kPropertyArr8 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj7 = it15.f51981p;
                yof.b bVar = obj7 instanceof yof.b ? (yof.b) obj7 : null;
                bw0.m mVar = it15.e;
                Object obj8 = mVar != null ? mVar.e : null;
                return new Pair(bVar, obj8 instanceof c0 ? (c0) obj8 : null);
            case 8:
                InputTextDelegate.Model it16 = (InputTextDelegate.Model) obj2;
                KProperty[] kPropertyArr9 = BankTransferAmountScreen.f102060r0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(Intrinsics.f(it16.f52580a, "ITEM_NOTE_INPUT_ID"));
            case 9:
                rp0.z it17 = (rp0.z) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f256227a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.f0.f322471a;
            case 13:
                e54.m update = (e54.m) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e54.m.a(update, 0L, 0L, null, null, null, null, null, true, null, null, false, 3839);
            case 14:
                return e54.m.a((e54.m) obj2, 0L, 0L, null, null, null, null, null, false, null, null, false, 3839);
            case 15:
                Intrinsics.checkNotNullParameter((d56.c) obj2, "it");
                return null;
            case 16:
                e69.f update2 = (e69.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return e69.f.a(update2, Data.copy$default(update2.f122941a, null, null, true, 3, null), null, 2);
            case 17:
                e69.f it18 = (e69.f) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f122941a;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayListC = iii.c.c(3);
                n6.Companion.getClass();
                return new e69.n(arrayListC, new aw0.h(false, m6.a(), m6.a(), null, null, null, 121));
            case 19:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                List list = items;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it19 = list.iterator();
                while (it19.hasNext()) {
                    arrayList.add(c6d.b.J((d6d.b) it19.next()));
                }
                return arrayList;
            case 20:
                Data it20 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.getContent() != null && it20.getError() == null);
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "payment-settings-repayment-day-loading", false, 0, false, 30), nb0.b(nb0Var, "payment-settings-repayment-amount-loading", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                eVarB.addAll(yp0.b.h(zhm.v.k(nb0.b(nb0Var, "payment-settings-account-loading", false, 0, false, 30), nb0.b(nb0Var, "payment-settings-backup-card-loading", false, 0, false, 30)), new gu("payment-settings-repayment-methods-header-loading", 0, 0, 30), null, 0, 126));
                return zhm.u.a(eVarB);
            case 22:
                e7f.e it21 = (e7f.e) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21;
            case 23:
                Pair pair = (Pair) obj2;
                return new e85.f((LoanDetails) pair.f186385a, (LoanRepaymentAccountModelExtension.RepaymentAccountState) pair.f186386b);
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new e85.l((List) getDefaultLoadingItems.invoke(), e85.r.a(null, false));
            case 25:
                lf8.c it22 = (lf8.c) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.f194666a);
            case 26:
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(map, "map");
                LinkedHashMap linkedHashMap = new LinkedHashMap(zhm.q0.b(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(entry.getKey(), Boolean.valueOf(i26.l.j(((of8.b) entry.getValue()).f224757p.f235515a)));
                }
                return linkedHashMap;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new CellDetailsSingleButtonDelegate.Model("CHAT_BUTTON_ITEM_ID", new aw0.t0((Clause) new TextLocalisedClause(R$string.help_center_section_need_more_help_title, null, null, 14), (Image) null, 0, false, 30), new aw0.s0((Clause) null, (Image) null, true), null, null, SyslogConstants.LOG_CLOCK);
            case 28:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Pair pair3 = (Pair) pair2.f186385a;
                Pair pair4 = (Pair) pair2.f186386b;
                return new e8e.l((List) pair3.f186386b, (Subaccount) pair3.f186385a, (e8e.k) pair4.f186385a, (e8e.j) pair4.f186386b);
            default:
                e8e.m updateState = (e8e.m) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return e8e.m.a(updateState, null, null, null, null, 47);
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f122592a = i;
    }
}
