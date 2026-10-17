package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import aw0.o9;
import b94.h;
import b94.u;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import pu3.d;
import qv0.i;
import yp0.r;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        boolean z;
        List listL;
        i model;
        Object value;
        int i;
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        b94.i iVar = domainState.f13645a;
        DetailsInputForm detailsInputForm = domainState.e;
        d dVar = domainState.f13647c;
        int[] iArr = u.f13664a;
        int i2 = iArr[iVar.ordinal()];
        TextClause textClause = null;
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(cp5.c.k(dVar), null, null, 14);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (detailsInputForm.b()) {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                switch (q84.c.f242971a[dVar.ordinal()]) {
                    case 1:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_mortgage_title;
                        break;
                    case 2:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_credit_card_title;
                        break;
                    case 3:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_loan_title;
                        break;
                    case 4:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_line_of_credit_title;
                        break;
                    case 5:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_overdraft_title;
                        break;
                    case 6:
                        i = R$string.credit_application_outstanding_debts_debt_details_prefilled_add_missing_info_bnpl_title;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                switch (q84.c.f242971a[dVar.ordinal()]) {
                    case 1:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_mortgage_title;
                        break;
                    case 2:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_credit_card_title;
                        break;
                    case 3:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_loan_title;
                        break;
                    case 4:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_line_of_credit_title;
                        break;
                    case 5:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_overdraft_title;
                        break;
                    case 6:
                        i = R$string.credit_application_outstanding_debts_debt_details_edit_bnpl_title;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause3 = textLocalisedClause;
        int i3 = iArr[iVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_add, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = detailsInputForm.b() ? new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_add, null, null, 14) : new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_update, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_debt_repaid_footer, null, null, 14);
        DetailsInputForm.DetailsInputField detailsInputFieldA = detailsInputForm.a("FIELD_ID_IS_REPAID");
        ?? r2 = detailsInputForm.f67474a;
        boolean z3 = false;
        TextLocalisedClause textLocalisedClause6 = (detailsInputFieldA == null || (value = detailsInputFieldA.getValue()) == null) ? false : ((Boolean) value).booleanValue() ? textLocalisedClause5 : null;
        Collection<DetailsInputForm.DetailsInputField> collectionValues = r2.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            z = false;
        } else {
            for (DetailsInputForm.DetailsInputField detailsInputField : collectionValues) {
                if (detailsInputField.getF67489g() && detailsInputField.getF() && detailsInputField.getValue() == null) {
                    z = true;
                }
            }
            z = false;
        }
        boolean z4 = !z;
        int i5 = u.f13664a[iVar.ordinal()];
        if (i5 == 1) {
            listL = f0.f322471a;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TextNavBarMenuItem textNavBarMenuItem = new TextNavBarMenuItem("LIST_ID_DELETE", new TextLocalisedClause(R$string.credit_application_outstanding_debts_debt_details_action_delete, null, null, 14), null, null, 12);
            if (!domainState.d) {
                textNavBarMenuItem = null;
            }
            listL = v.l(textNavBarMenuItem);
        }
        List list = listL;
        Object obj2 = null;
        for (Object obj3 : r2.entrySet()) {
            DetailsInputForm.DetailsInputField detailsInputField2 = (DetailsInputForm.DetailsInputField) ((Map.Entry) obj3).getValue();
            if ((detailsInputField2 instanceof DetailsInputForm.DetailsInputField.TextField) || (detailsInputField2 instanceof DetailsInputForm.DetailsInputField.MoneyField)) {
                obj2 = obj3;
                z3 = true;
            }
        }
        if (!z3) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        String str = (String) ((Map.Entry) obj2).getKey();
        Collection<DetailsInputForm.DetailsInputField> collectionValues2 = r2.values();
        ArrayList arrayList = new ArrayList(w.t(collectionValues2, 10));
        for (DetailsInputForm.DetailsInputField detailsInputField3 : collectionValues2) {
            String str2 = domainState.f;
            if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.TextField) {
                DetailsInputForm.DetailsInputField.TextField textField = (DetailsInputForm.DetailsInputField.TextField) detailsInputField3;
                String str3 = textField.f67486a;
                int i6 = Intrinsics.f(str3, str) ? 6 : 5;
                String str4 = textField.e;
                model = new InputTextDelegate.Model(str3, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : textClause, textField.f67487b, null, false, textField.f67488c, null, null, null, null, null, false, null, null, false, textField.f, 1, i6, null, false, Intrinsics.f(textField.f67486a, str2), null, !textField.c(), null, false, false, false, null, null, 0, -610533512, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.r(model, 0, 0, 0, 0, 15);
            } else if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.MoneyField) {
                DetailsInputForm.DetailsInputField.MoneyField moneyField = (DetailsInputForm.DetailsInputField.MoneyField) detailsInputField3;
                String str5 = moneyField.f67481a;
                int i21 = Intrinsics.f(str5, str) ? 6 : 5;
                Long l2 = moneyField.e;
                model = new InputTextDelegate.Model(str5, l2 != null ? new MoneyClause(new dj0.d(l2.longValue(), moneyField.f), new MoneyClause.Format.Editable(), null, null, 12) : null, moneyField.f67482b, null, false, moneyField.f67483c, null, null, null, null, null, false, null, null, false, moneyField.f67484g, 2, i21, null, false, Intrinsics.f(moneyField.f67481a, str2), null, !moneyField.c(), null, false, false, false, null, null, 0, -610533512, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                yp0.b.r(model, 0, 0, 0, 0, 15);
            } else if (detailsInputField3 instanceof DetailsInputForm.DetailsInputField.DropdownField) {
                DetailsInputForm.DetailsInputField.DropdownField dropdownField = (DetailsInputForm.DetailsInputField.DropdownField) detailsInputField3;
                String str6 = dropdownField.f67478a;
                String str7 = dropdownField.f67480c;
                i iVarA = r.a(new InputTextDelegate.Model(str6, str7 != null ? new TextClause(str7, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, dropdownField.f67479b, null, false, null, null, null, null, null, null, false, null, null, false, dropdownField.e, 1, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -606339216, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
                yp0.b.r(iVarA, 0, 0, 0, 0, 15);
                model = iVarA;
            } else {
                if (!(detailsInputField3 instanceof DetailsInputForm.DetailsInputField.CheckboxField)) {
                    throw new NoWhenBranchMatchedException();
                }
                DetailsInputForm.DetailsInputField.CheckboxField checkboxField = (DetailsInputForm.DetailsInputField.CheckboxField) detailsInputField3;
                model = new InputChecklistDelegate.Model(checkboxField.f67475a, checkboxField.f67476b, checkboxField.f67477c, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            }
            arrayList.add(model);
            textClause = null;
        }
        return new b94.o(textLocalisedClause3, textLocalisedClause4, textLocalisedClause6, arrayList, list, z4);
    }
}
