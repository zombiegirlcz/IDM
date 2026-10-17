package rp0;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import com.revolut.feature.payments.bills_chooser.api.common.SplitMethod;
import com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection.BillsChooserScreen;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.shared.feature.wealth.models.config.Links;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import rp0.m;
import rp0.p0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256132a;

    public /* synthetic */ n0(int i) {
        this.f256132a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        rpb.p pVar;
        switch (this.f256132a) {
            case 0:
                PromptContentDelegate.Model it8 = (PromptContentDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new p0.a(it8.f53071x);
            case 1:
                m.a it9 = (m.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new p0.b(it9.f256127a);
            case 2:
                PromptContentDelegate.Model it10 = (PromptContentDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new p0.b(it10.f53071x);
            case 3:
                PromptContentDelegate.Model it11 = (PromptContentDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new p0.a(it11.f53071x);
            case 4:
                a0 it12 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new v0(it12.f256041b, it12.f256040a);
            case 5:
                PromptContentDelegate.Model it13 = (PromptContentDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new p0.a(it13.f53071x);
            case 6:
                PromptContentDelegate.Model it14 = (PromptContentDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new p0.a(it14.f53071x);
            case 7:
                ty0.a clauseClickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clauseClickData, "clauseClickData");
                return new o0(clauseClickData.d, clauseClickData.f275445a, clauseClickData.f275446b);
            case 8:
                rp4.a update = (rp4.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                boolean z = !update.f256256b;
                CreditCardAutopayConfirmation confirmation = update.f256255a;
                Intrinsics.checkNotNullParameter(confirmation, "confirmation");
                return new rp4.a(confirmation, z);
            case 9:
                rp8.f update2 = (rp8.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return rp8.f.a(update2, null, null, true, 3);
            case 10:
                rp8.f update3 = (rp8.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return rp8.f.a(update3, null, null, false, 3);
            case 11:
                SelectableDelegate.Model model = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(model, "model");
                return new dp9.b(model.f53304a, ((RowDelegate.Model) model.f53305b).u);
            case 12:
                RowDelegate.Model model2 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(model2, "model");
                return new dp9.b(model2.f53228a, model2.u);
            case 13:
                ReferralContactDelegate.Model model3 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(model3, "model");
                return new dp9.b(model3.f53161a, model3.f53167l);
            case 14:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = BillsChooserScreen.g0;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj3 = it15.u;
                if (obj3 instanceof SplitMethod) {
                    return (SplitMethod) obj3;
                }
                return null;
            case 15:
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                return kii.e.u(vault, xi0.b.Companion);
            case 16:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return zhm.w.u(it16);
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                qib.i challengeAccount = (qib.i) obj2;
                Intrinsics.checkNotNullParameter(challengeAccount, "challengeAccount");
                qib.b bVar = challengeAccount.d;
                return new rpb.i(bVar.d, oi0.d.R(bVar.f246679c), challengeAccount.f246693c.d);
            case 19:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                uib.a aVar = (uib.a) pair.f186385a;
                List list = (List) pair.f186386b;
                uib.c cVar = aVar.f280366a;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                int i2 = vib.b.f289560a[cVar.ordinal()];
                if (i2 == 1) {
                    i = R$string.savings_widget_total_savings_title_savings_funds;
                } else if (i2 == 2) {
                    i = R$string.savings_widget_total_savings_title_flexible_cash_funds;
                } else if (i2 == 3) {
                    i = R$string.savings_widget_total_savings_title_flexible_accounts;
                } else if (i2 == 4) {
                    i = R$string.savings_widget_total_savings_title_interest;
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.savings_widget_total_savings_title_savings;
                }
                return new rpb.q(i, list);
            case 20:
                List<npg.a> decoratedVaults = (List) obj2;
                Intrinsics.checkNotNullParameter(decoratedVaults, "decoratedVaults");
                ArrayList arrayList = new ArrayList();
                for (npg.a aVar2 : decoratedVaults) {
                    dj0.d dVar = aVar2.f218205a;
                    if (dVar != null) {
                        pcd.s sVar = (pcd.s) aVar2.f218206b;
                        pVar = new rpb.p(sVar.f234881a, dVar, sVar.f234883c);
                    } else {
                        pVar = null;
                    }
                    if (pVar != null) {
                        arrayList.add(pVar);
                    }
                }
                return arrayList;
            case 21:
                pcd.s vault2 = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault2, "vault");
                return zhm.u.c(vault2);
            case 22:
                lcd.i savingsAccount = (lcd.i) obj2;
                Intrinsics.checkNotNullParameter(savingsAccount, "savingsAccount");
                return Boolean.valueOf(savingsAccount.f193860s != null);
            case 23:
                lcd.i savingsAccount2 = (lcd.i) obj2;
                Intrinsics.checkNotNullParameter(savingsAccount2, "savingsAccount");
                String str = savingsAccount2.f193858q;
                return Boolean.valueOf(!(str == null || str.length() == 0));
            case 24:
                List disclaimers = (List) obj2;
                Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
                return new ppc.q(disclaimers);
            case 25:
                k1h.j links = (k1h.j) obj2;
                Intrinsics.checkNotNullParameter(links, "links");
                return new k1h.c(links);
            case 26:
                k1h.j links2 = (k1h.j) obj2;
                Intrinsics.checkNotNullParameter(links2, "links");
                return new k1h.d(links2);
            case 27:
                k1h.j links3 = (k1h.j) obj2;
                Intrinsics.checkNotNullParameter(links3, "links");
                return new k1h.b(links3);
            case 28:
                hel.a it17 = (hel.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Links links4 = it17.e;
                Intrinsics.checkNotNullParameter(links4, "<this>");
                return new k1h.j(links4.f105098p);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "LOADING_ITEM_ID", false, 0, false, 30);
        }
    }
}
