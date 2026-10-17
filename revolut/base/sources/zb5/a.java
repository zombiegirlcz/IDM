package zb5;

import ac5.s;
import ac5.t;
import ac5.u;
import ac5.v;
import ac5.w;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.AmountSelection;
import com.revolut.feature.credit_card.autopay.api.models_v3.BackupCardContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfig;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmation;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayConfirmationItem;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayContent;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayType;
import dx4.a1;
import dx4.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nb5.e;
import nb5.g;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v16, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v35, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.util.ArrayList] */
    public static final CreditCardAutopayConfig a(ac5.a aVar) {
        a1 a1VarA;
        Parcelable backupCard;
        ?? arrayList;
        ?? arrayList2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        List<w> availableTypes = aVar.getAvailableTypes();
        ArrayList arrayList3 = new ArrayList(zhm.w.t(availableTypes, 10));
        for (w wVar : availableTypes) {
            Intrinsics.checkNotNullParameter(wVar, "<this>");
            if (wVar instanceof t) {
                t tVar = (t) wVar;
                e eVarValueOf = e.valueOf(tVar.getPaymentType());
                List disallows = tVar.getDisallows();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(disallows, 10));
                Iterator it8 = disallows.iterator();
                while (it8.hasNext()) {
                    arrayList4.add(e.valueOf((String) it8.next()));
                }
                List requires = tVar.getRequires();
                ArrayList arrayList5 = new ArrayList(zhm.w.t(requires, 10));
                Iterator it9 = requires.iterator();
                while (it9.hasNext()) {
                    arrayList5.add(e.valueOf((String) it9.next()));
                }
                g gVarValueOf = g.valueOf(tVar.getAccountNumberFormat());
                wi0.a aVar2 = wi0.b.Companion;
                String bankCountry = tVar.getBankCountry();
                aVar2.getClass();
                wi0.b bVarA = wi0.a.a(bankCountry);
                int daysInAdvance = tVar.getDaysInAdvance();
                List allowedDay = tVar.getAllowedDay();
                ArrayList arrayList6 = new ArrayList(zhm.w.t(allowedDay, 10));
                Iterator it10 = allowedDay.iterator();
                while (it10.hasNext()) {
                    arrayList6.add(nb5.b.valueOf((String) it10.next()));
                }
                backupCard = new CreditCardAutopayType.DirectDebit(eVarValueOf, arrayList4, arrayList5, arrayList6, null, daysInAdvance, tVar.getStatementDueDay(), gVarValueOf, bVarA);
            } else if (wVar instanceof u) {
                u uVar = (u) wVar;
                e eVarValueOf2 = e.valueOf(uVar.getPaymentType());
                List disallows2 = uVar.getDisallows();
                ArrayList arrayList7 = new ArrayList(zhm.w.t(disallows2, 10));
                Iterator it11 = disallows2.iterator();
                while (it11.hasNext()) {
                    arrayList7.add(e.valueOf((String) it11.next()));
                }
                List requires2 = uVar.getRequires();
                ArrayList arrayList8 = new ArrayList(zhm.w.t(requires2, 10));
                Iterator it12 = requires2.iterator();
                while (it12.hasNext()) {
                    arrayList8.add(e.valueOf((String) it12.next()));
                }
                List allowedDay2 = uVar.getAllowedDay();
                ArrayList arrayList9 = new ArrayList(zhm.w.t(allowedDay2, 10));
                Iterator it13 = allowedDay2.iterator();
                while (it13.hasNext()) {
                    arrayList9.add(nb5.b.valueOf((String) it13.next()));
                }
                List allowedPaymentAmountTypes = uVar.getAllowedPaymentAmountTypes();
                if (allowedPaymentAmountTypes != null) {
                    List list = allowedPaymentAmountTypes;
                    arrayList2 = new ArrayList(zhm.w.t(list, 10));
                    Iterator it14 = list.iterator();
                    while (it14.hasNext()) {
                        arrayList2.add(com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf((String) it14.next()));
                    }
                } else {
                    arrayList2 = f0.f322471a;
                }
                backupCard = new CreditCardAutopayType.RevolutPocket(eVarValueOf2, arrayList7, arrayList8, arrayList9, arrayList2, uVar.getDaysInAdvance(), uVar.getStatementDueDay());
            } else if (wVar instanceof s) {
                s sVar = (s) wVar;
                e eVarValueOf3 = e.valueOf(sVar.getPaymentType());
                List disallows3 = sVar.getDisallows();
                ArrayList arrayList10 = new ArrayList(zhm.w.t(disallows3, 10));
                Iterator it15 = disallows3.iterator();
                while (it15.hasNext()) {
                    arrayList10.add(e.valueOf((String) it15.next()));
                }
                List requires3 = sVar.getRequires();
                ArrayList arrayList11 = new ArrayList(zhm.w.t(requires3, 10));
                Iterator it16 = requires3.iterator();
                while (it16.hasNext()) {
                    arrayList11.add(e.valueOf((String) it16.next()));
                }
                List allowedDay3 = sVar.getAllowedDay();
                ArrayList arrayList12 = new ArrayList(zhm.w.t(allowedDay3, 10));
                Iterator it17 = allowedDay3.iterator();
                while (it17.hasNext()) {
                    arrayList12.add(nb5.b.valueOf((String) it17.next()));
                }
                List allowedPaymentAmountTypes2 = sVar.getAllowedPaymentAmountTypes();
                if (allowedPaymentAmountTypes2 != null) {
                    List list2 = allowedPaymentAmountTypes2;
                    arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it18 = list2.iterator();
                    while (it18.hasNext()) {
                        arrayList.add(com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf((String) it18.next()));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                backupCard = new CreditCardAutopayType.BackupCard(eVarValueOf3, arrayList10, arrayList11, arrayList12, arrayList, sVar.getDaysInAdvance(), sVar.getStatementDueDay());
            } else {
                if (!(wVar instanceof v)) {
                    throw new NoWhenBranchMatchedException();
                }
                backupCard = CreditCardAutopayType.Unsupported.f70738a;
            }
            arrayList3.add(backupCard);
        }
        Map content = aVar.getContent();
        ArrayList arrayList13 = null;
        CreditCardAutopayContent creditCardAutopayContent = content != null ? new CreditCardAutopayContent(new AmountSelection((String) content.get("FIXED_AMOUNT_TITLE"), (String) content.get("FIXED_AMOUNT_DESCRIPTION"), (String) content.get("CUSTOM_AMOUNT_DISCLAIMER"), (String) content.get("MINIMUM_AMOUNT_TITLE"), (String) content.get("MINIMUM_AMOUNT_DESCRIPTION"), (String) content.get("STATEMENT_BALANCE_TITLE"), (String) content.get("STATEMENT_BALANCE_DESCRIPTION")), new BackupCardContent((String) content.get("BACKUP_CARD_SETUP_PROMPT_DESCRIPTION"), (String) content.get("BACKUP_CARD_INFO_DESCRIPTION"))) : null;
        List confirmations = aVar.getConfirmations();
        if (confirmations != null) {
            List<ac5.b> list3 = confirmations;
            ArrayList arrayList14 = new ArrayList(zhm.w.t(list3, 10));
            for (ac5.b bVar : list3) {
                String paymentAmountType = bVar.getPaymentAmountType();
                com.revolut.feature.credit_card.autopay.api.models_v3.a aVarValueOf = paymentAmountType != null ? com.revolut.feature.credit_card.autopay.api.models_v3.a.valueOf(paymentAmountType) : null;
                String title = bVar.getTitle();
                String description = bVar.getDescription();
                List<ac5.c> items = bVar.getItems();
                ArrayList arrayList15 = new ArrayList(zhm.w.t(items, 10));
                for (ac5.c cVar : items) {
                    String icon = cVar.getIcon();
                    if (icon != null) {
                        a1.Companion.getClass();
                        a1VarA = y0.a(icon);
                    } else {
                        a1VarA = null;
                    }
                    arrayList15.add(new CreditCardAutopayConfirmationItem(a1VarA, cVar.getTitle(), cVar.getSubtitle()));
                }
                arrayList14.add(new CreditCardAutopayConfirmation(aVarValueOf, title, description, arrayList15, bVar.getCheckbox()));
            }
            arrayList13 = arrayList14;
        }
        return new CreditCardAutopayConfig(arrayList3, creditCardAutopayContent, arrayList13);
    }
}
