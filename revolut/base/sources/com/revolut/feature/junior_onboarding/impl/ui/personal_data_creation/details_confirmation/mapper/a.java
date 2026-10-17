package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper;

import aim.b;
import aim.e;
import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.junior_onboarding.impl.R$string;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$PersonalDetails;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$UiConfiguration;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper.CheckboxParcel;
import fi8.i;
import grl.b4;
import hi8.c;
import ip0.ck0;
import ip0.qd0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lh8.f;
import md6.s;
import org.jetbrains.annotations.NotNull;
import rh8.o0;
import vh8.d;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements n {

    @NotNull
    public static final hi8.a Companion = new hi8.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorDetailsConfirmationScreenContract$InputData f77033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f77034b;

    public a(JuniorDetailsConfirmationScreenContract$InputData inputData, c mandatoryCheckboxFactory, f termsUiFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mandatoryCheckboxFactory, "mandatoryCheckboxFactory");
        Intrinsics.checkNotNullParameter(termsUiFactory, "termsUiFactory");
        this.f77033a = inputData;
        this.f77034b = termsUiFactory;
    }

    public static SelectableDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, boolean z, CheckboxParcel checkboxParcel) {
        return new SelectableDelegate.Model(j6.a.q("ID_CHECKBOX_ITEM_", str), new TextDelegate.Model(str, textLocalisedClause, false, new ck0(0), checkboxParcel, null, 0, 0, 0, 0, b4.EXPIRED_OR_INVALID_KEY_VALUE), z ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, true, 31736);
    }

    @Override // cli.n
    public final o c(j jVar) {
        Collection collectionK;
        boolean z;
        Collection collection;
        boolean zBooleanValue;
        b bVar;
        fi8.f domainState = (fi8.f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f135346b;
        Set set = domainState.f135347c;
        Data data2 = domainState.f135345a;
        OnboardingTerms onboardingTerms = (OnboardingTerms) data.getContent();
        TextLocalisedClause textLocalisedClauseC = onboardingTerms != null ? ((o0) this.f77034b).c(onboardingTerms) : null;
        JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = this.f77033a;
        JuniorDetailsConfirmationScreenContract$UiConfiguration juniorDetailsConfirmationScreenContract$UiConfiguration = juniorDetailsConfirmationScreenContract$InputData.f77022b;
        JuniorDetailsConfirmationScreenContract$PersonalDetails juniorDetailsConfirmationScreenContract$PersonalDetails = juniorDetailsConfirmationScreenContract$InputData.f77021a;
        d dVar = juniorDetailsConfirmationScreenContract$UiConfiguration.d;
        e eVarB = u.b();
        do3.n nVar = (do3.n) data2.getContent();
        String juniorFirstName = juniorDetailsConfirmationScreenContract$PersonalDetails.f77023a;
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        if (nVar == null) {
            collectionK = f0.f322471a;
        } else {
            Address address = nVar.k;
            wi0.b bVarG = address != null ? nz8.d.g(address) : null;
            wi0.b.Companion.getClass();
            collectionK = Intrinsics.f(bVarG, wi0.b.Y1) ? v.k(new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_legal_guardian_confirmation_title, null, null, 14), "ID_CHECKBOX_PERSONAL_LEGAL_GUARDIAN"), new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_same_address_confirmation_title, u.c(juniorFirstName), null, 12), "ID_CHECKBOX_PERSONAL_SAME_ADDRESS")) : Intrinsics.f(bVarG, wi0.b.M0) ? u.c(new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_legal_guardian_confirmation_title, null, null, 14), "ID_CHECKBOX_PERSONAL_DATA_ACCURATE")) : Intrinsics.f(bVarG, wi0.b.O) ? u.c(new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_parent_confirmation_title, null, null, 14), "ID_CHECKBOX_PERSONAL_DATA_ACCURATE")) : Intrinsics.f(bVarG, wi0.b.f297734c) ? v.k(new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_confirmation_title, null, null, 14), "ID_CHECKBOX_PERSONAL_DATA_ACCURATE"), new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_account_purpose_confirmation_title, null, null, 14), "ID_CHECKBOX_YOUTH_ACCOUNT_PURPOSE")) : u.c(new hi8.b(new TextLocalisedClause(R$string.junior_signup_details_confirmation_confirmation_title, null, null, 14), "ID_CHECKBOX_PERSONAL_DATA_ACCURATE"));
        }
        eVarB.addAll(collectionK);
        d dVar2 = d.Checkbox;
        if (dVar == dVar2 && textLocalisedClauseC != null) {
            eVarB.add(new hi8.b(textLocalisedClauseC, "ID_CHECKBOX_TERMS_AND_CONDITIONS"));
        }
        e eVarA = u.a(eVarB);
        if (data2.getContent() != null && !domainState.f135346b.getLoading() && (dVar != dVar2 || textLocalisedClauseC != null)) {
            if (eVarA == null || !eVarA.isEmpty()) {
                ListIterator listIterator = eVarA.listIterator(0);
                do {
                    bVar = (b) listIterator;
                    if (bVar.hasNext()) {
                    }
                } while (set.contains(((hi8.b) bVar.next()).f152530a));
                z = false;
            }
            z = true;
            break;
        } else {
            z = false;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_signup_details_confirmation_title, null, null, 14);
        Clause clause = juniorDetailsConfirmationScreenContract$UiConfiguration.f77028a;
        aw0.e eVar = new aw0.e(false, dVar == d.Footer ? textLocalisedClauseC : null, null, m6.c(n6.Companion, juniorDetailsConfirmationScreenContract$UiConfiguration.f77030c, LargeActionButton.ButtonStyle.f58725a, null, "PERSONAL_DETAILS_CONFIRMATION_ACTION_BUTTON_TAG", z, null, null, null, 972), null, null, 53);
        e eVarB2 = u.b();
        CellDetailsDelegate.Model[] elements = {new CellDetailsDelegate.Model("ID_FULL_NAME", new TextLocalisedClause(R$string.junior_signup_details_confirmation_full_name, null, null, 14), new TextLocalisedClause(R$string.junior_signup_details_confirmation_full_name_value, u.c(s.d(d0.F0(juniorDetailsConfirmationScreenContract$PersonalDetails.f77023a).toString(), d0.F0(juniorDetailsConfirmationScreenContract$PersonalDetails.f77024b).toString(), d0.F0(juniorDetailsConfirmationScreenContract$PersonalDetails.f77025c).toString())), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("ID_DATE_OF_BIRTH", new TextLocalisedClause(R$string.junior_signup_details_confirmation_date_of_birth, null, null, 14), new TextLocalisedClause(R$string.junior_signup_details_confirmation_date_of_birth_value, u.c(new TimeClause(oc.c.F(juniorDetailsConfirmationScreenContract$PersonalDetails.d), TimeClause.Format.DateEditable.f57960b, null, null, 12)), null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), juniorDetailsConfirmationScreenContract$UiConfiguration.f77029b ? new CellDetailsDelegate.Model("ID_RELATIONSHIP", new TextLocalisedClause(R$string.junior_signup_details_confirmation_relationship, null, null, 14), new TextLocalisedClause(R$string.youth_signup_details_relationship_parent, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        eVarB2.addAll(listL);
        ArrayList arrayList = juniorDetailsConfirmationScreenContract$PersonalDetails.e;
        Map map = domainState.d;
        if (arrayList.isEmpty()) {
            collection = f0.f322471a;
        } else {
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (Iterator it8 = arrayList.iterator(); it8.hasNext(); it8 = it8) {
                ConsentMechanics.OptOut optOut = (ConsentMechanics.OptOut) it8.next();
                Boolean bool = (Boolean) map.get(optOut.f76951a);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    r6.b.D("The previous state of consent toggle is absent");
                    zBooleanValue = optOut.f76953c;
                }
                arrayList2.add(a(optOut.f76951a, new TextLocalisedClause(R$string.junior_signup_details_confirmation_consent, u.c(optOut.f76952b), null, 12), zBooleanValue, new CheckboxParcel.Consent(optOut)));
            }
            collection = arrayList2;
        }
        Collection collection2 = collection;
        ArrayList arrayList3 = new ArrayList(w.t(eVarA, 10));
        ListIterator listIterator2 = eVarA.listIterator(0);
        while (true) {
            b bVar2 = (b) listIterator2;
            if (!bVar2.hasNext()) {
                break;
            }
            hi8.b bVar3 = (hi8.b) bVar2.next();
            String str = bVar3.f152530a;
            arrayList3.add(a(str, bVar3.f152531b, set.contains(str), new CheckboxParcel.Mandatory(bVar3.f152530a)));
        }
        ArrayList arrayListE0 = zhm.d0.E0(arrayList3, collection2);
        if (!arrayListE0.isEmpty()) {
            yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
            eVarB2.addAll(arrayListE0);
        }
        return new i(textLocalisedClause, clause, eVar, u.a(eVarB2));
    }
}
