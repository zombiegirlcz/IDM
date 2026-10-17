package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import b94.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.feature.credit.core.R$string;
import foh.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import jli.g;
import jli.h;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import qu3.d;
import qu3.e;
import qu3.f;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f67496a = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_provider, null, null, 14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f67497b = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_loan_amount, null, null, 14);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f67498c = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_credit_limit, null, null, 14);
    public final TextLocalisedClause d = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_current_balance, null, null, 14);
    public final TextLocalisedClause e = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_loan_type, null, null, 14);

    public final DetailsInputForm a(e debt) {
        d dVar;
        Intrinsics.checkNotNullParameter(debt, "debt");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_prefilled_helper, null, null, 14);
        qu3.c cVar = debt.d;
        boolean z = debt.f249205j;
        d dVar2 = debt.f249203g;
        pu3.d dVar3 = debt.f249201b;
        String str = cVar.f249197a;
        TextLocalisedClause textLocalisedClause2 = cVar.x3() ? textLocalisedClause : null;
        String str2 = cVar.f249198b;
        boolean z3 = cVar.f249199c;
        boolean z4 = cVar.d;
        TextLocalisedClause textLocalisedClause3 = this.f67496a;
        linkedHashMap.put(str, new DetailsInputForm.DetailsInputField.TextField(str, textLocalisedClause3, textLocalisedClause2, textLocalisedClause3, str2, z3, z4));
        TextLocalisedClause textLocalisedClause4 = this.f67497b;
        if (!z || dVar3 != pu3.d.LOAN) {
            d dVar4 = debt.e;
            if (dVar4 != null) {
                String id10 = dVar4.getId();
                int i = t.f13663a[dVar3.ordinal()];
                TextLocalisedClause textLocalisedClause5 = (i == 1 || i == 2) ? textLocalisedClause4 : this.f67498c;
                String id11 = dVar4.getId();
                TextLocalisedClause textLocalisedClause6 = dVar4.x3() ? textLocalisedClause : null;
                dj0.d dVar5 = (dj0.d) dVar4.getValue();
                linkedHashMap.put(id10, new DetailsInputForm.DetailsInputField.MoneyField(id11, textLocalisedClause5, textLocalisedClause6, textLocalisedClause5, dVar5 != null ? Long.valueOf(dVar5.f115082a) : null, debt.f249202c, dVar4.k0(), dVar4.f0()));
            }
        } else if (dVar2 != null) {
            String id12 = dVar2.getId();
            String id13 = dVar2.getId();
            TextLocalisedClause textLocalisedClause7 = dVar2.x3() ? textLocalisedClause : null;
            dj0.d dVar6 = (dj0.d) dVar2.getValue();
            Long lValueOf = dVar6 != null ? Long.valueOf(dVar6.f115082a) : null;
            xi0.b bVar = debt.f249202c;
            boolean zK0 = dVar2.k0();
            boolean zF0 = dVar2.f0();
            TextLocalisedClause textLocalisedClause8 = this.f67497b;
            linkedHashMap.put(id12, new DetailsInputForm.DetailsInputField.MoneyField(id13, textLocalisedClause8, textLocalisedClause7, textLocalisedClause8, lValueOf, bVar, zK0, zF0));
        }
        int[] iArr = t.f13663a;
        int i2 = iArr[dVar3.ordinal()];
        if (i2 == 1 || i2 == 2) {
            d dVar7 = debt.f;
            if (dVar7 != null) {
                String id14 = dVar7.getId();
                TextLocalisedClause textLocalisedClause9 = new TextLocalisedClause(debt.i ? R$string.credit_application_outstanding_debts_debts_hub_dialog_debt_details_revolut_monthly_repayment : R$string.credit_application_outstanding_debts_debt_details_monthly_repayment, null, null, 14);
                String id15 = dVar7.getId();
                TextLocalisedClause textLocalisedClause10 = dVar7.x3() ? textLocalisedClause : null;
                dj0.d dVar8 = (dj0.d) dVar7.getValue();
                linkedHashMap.put(id14, new DetailsInputForm.DetailsInputField.MoneyField(id15, textLocalisedClause9, textLocalisedClause10, textLocalisedClause9, dVar8 != null ? Long.valueOf(dVar8.f115082a) : null, debt.f249202c, dVar7.k0(), dVar7.f0()));
            }
        } else {
            int i3 = h.f175850a;
        }
        int i5 = iArr[dVar3.ordinal()];
        if (i5 != 2 && i5 != 3) {
            int i6 = h.f175850a;
        } else if (dVar2 != null) {
            if (!z || dVar3 != pu3.d.LOAN) {
                textLocalisedClause4 = this.d;
            }
            TextLocalisedClause textLocalisedClause11 = textLocalisedClause4;
            String id16 = dVar2.getId();
            String id17 = dVar2.getId();
            TextLocalisedClause textLocalisedClause12 = dVar2.x3() ? textLocalisedClause : null;
            dj0.d dVar9 = (dj0.d) dVar2.getValue();
            linkedHashMap.put(id16, new DetailsInputForm.DetailsInputField.MoneyField(id17, textLocalisedClause11, textLocalisedClause12, textLocalisedClause11, dVar9 != null ? Long.valueOf(dVar9.f115082a) : null, debt.f249202c, dVar2.k0(), dVar2.f0()));
        }
        if (dVar3 == pu3.d.MORTGAGE && (dVar = debt.f249204h) != null) {
            String id18 = dVar.getId();
            String id19 = dVar.getId();
            String str3 = (String) dVar.getValue();
            EnumEntries enumEntriesA = f.a();
            ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
            Iterator<E> it8 = enumEntriesA.iterator();
            while (it8.hasNext()) {
                String lowerCase = ((f) it8.next()).name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(g.b(lowerCase));
            }
            linkedHashMap.put(id18, new DetailsInputForm.DetailsInputField.DropdownField(id19, this.e, str3, arrayList, dVar.k0(), dVar.f0()));
        }
        if (debt.x3()) {
            linkedHashMap.put("FIELD_ID_IS_REPAID", new DetailsInputForm.DetailsInputField.CheckboxField(new TextLocalisedClause(t.f13663a[dVar3.ordinal()] == 3 ? R$string.credit_application_outstanding_debts_debt_details_card_closed : R$string.credit_application_outstanding_debts_debt_details_debt_repaid, null, null, 14), "FIELD_ID_IS_REPAID", debt.k));
        }
        return new DetailsInputForm(i.f(linkedHashMap));
    }
}
