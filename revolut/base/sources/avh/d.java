package avh;

import bvh.b0;
import com.revolut.feature.address.models.Address;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.eligibility.exceptions.UnrecognisedContractException;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExpiryCollection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExplicitTerm;
import evh.m;
import evh.n;
import evh.o;
import evh.p;
import evh.q;
import evh.r;
import evh.s;
import evh.t;
import evh.u;
import evh.v;
import evh.w;
import evh.x;
import evh.y;
import evh.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.o;
import kg.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f10033a;

    public d(o gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f10033a = gson;
    }

    public static Address a(b0 b0Var) {
        String country = b0Var.getCountry();
        if (country == null) {
            country = "";
        }
        return new Address(b0Var.getStreetLine1(), b0Var.getStreetLine2(), b0Var.getRegion(), b0Var.getCity(), b0Var.getPostcode(), country, null, b0Var.getStreetType(), b0Var.getStreet(), b0Var.getHouseNumber(), b0Var.getFlat(), b0Var.getNeighbourhood(), b0Var.getHouseName(), null, null, 24640, null);
    }

    public final WorkflowStepConfiguration.Screen b(String str, w wVar) {
        ril.h hVar;
        Object next;
        ArrayList arrayList;
        sil.d dVar = null;
        if (str == null) {
            return null;
        }
        ril.h[] hVarArrValues = ril.h.values();
        int length = hVarArrValues.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                hVar = null;
                break;
            }
            hVar = hVarArrValues[i2];
            if (a0.z(hVar.name(), str, true)) {
                break;
            }
            i2++;
        }
        if (hVar == null) {
            throw new UnrecognisedContractException("Unknown configuration screenName: ".concat(str));
        }
        int i3 = c.f10032a[hVar.ordinal()];
        o oVar = this.f10033a;
        switch (i3) {
            case 1:
                if (wVar == null) {
                    return new WorkflowStepConfiguration.Screen.Employer(false);
                }
                Object objE = oVar.e(wVar, q.class);
                Intrinsics.checkNotNullExpressionValue(objE, "fromJson(...)");
                Boolean addressRequired = ((q) ((z) objE)).getAddressRequired();
                return new WorkflowStepConfiguration.Screen.Employer(addressRequired != null ? addressRequired.booleanValue() : false);
            case 2:
                return WorkflowStepConfiguration.Screen.RiskAssessment.f105549a;
            case 3:
                return WorkflowStepConfiguration.Screen.PeriodicReview.f105539a;
            case 4:
                Object objE2 = oVar.e(wVar, x.class);
                Intrinsics.checkNotNullExpressionValue(objE2, "fromJson(...)");
                x xVar = (x) ((z) objE2);
                return new WorkflowStepConfiguration.Screen.TermsReview(xVar.getCountryCode(), xVar.getTermsIds());
            case 5:
                Object objE3 = oVar.e(wVar, n.a.class);
                Intrinsics.checkNotNullExpressionValue(objE3, "fromJson(...)");
                n contactSelectionScreen = ((n.a) ((z) objE3)).getContactSelectionScreen();
                return new WorkflowStepConfiguration.Screen.ContactSelection(contactSelectionScreen.getTitle(), contactSelectionScreen.getSubmitButton(), contactSelectionScreen.getSearchPlaceholder(), contactSelectionScreen.getShowNewContactAction(), contactSelectionScreen.getShowLocalContacts(), contactSelectionScreen.getCanSearchByRevTag(), contactSelectionScreen.getCanSelectMultipleContacts());
            case 6:
                return WorkflowStepConfiguration.Screen.TrackingConsent.f105559a;
            case 7:
                Object objE4 = oVar.e(wVar, p.class);
                Intrinsics.checkNotNullExpressionValue(objE4, "fromJson(...)");
                p pVar = (p) ((z) objE4);
                String citizenshipSelectionTitle = pVar.getCitizenshipSelectionTitle();
                String citizenshipSelectionSubtitle = pVar.getCitizenshipSelectionSubtitle();
                String citizenshipConfirmationSubtitle = pVar.getCitizenshipConfirmationSubtitle();
                String documentSelectionTitle = pVar.getDocumentSelectionTitle();
                String documentSelectionSubtitle = pVar.getDocumentSelectionSubtitle();
                String documentSelectionSubmitButton = pVar.getDocumentSelectionSubmitButton();
                String documentSelectionSkipButton = pVar.getDocumentSelectionSkipButton();
                String citizenshipsQuery = pVar.getCitizenshipsQuery();
                String applicableDocumentsQuery = pVar.getApplicableDocumentsQuery();
                p.a alternativeDocuments = pVar.getAlternativeDocuments();
                return new WorkflowStepConfiguration.Screen.DocumentSelection(citizenshipSelectionTitle, citizenshipSelectionSubtitle, citizenshipConfirmationSubtitle, documentSelectionTitle, documentSelectionSubtitle, documentSelectionSubmitButton, documentSelectionSkipButton, citizenshipsQuery, applicableDocumentsQuery, alternativeDocuments != null ? new WorkflowStepConfiguration.Screen.DocumentSelection.AlternativeDocuments(alternativeDocuments.getTitle(), alternativeDocuments.getSubtitle(), alternativeDocuments.getAlternativeMethodsLabel(), alternativeDocuments.getAlternativeMethodsFaqDeeplink()) : null);
            case 8:
                Object objE5 = oVar.e(wVar, u.class);
                Intrinsics.checkNotNullExpressionValue(objE5, "fromJson(...)");
                return new WorkflowStepConfiguration.Screen.ResidentialAddressCollection(((u) ((z) objE5)).getCountryChoiceState());
            case 9:
                Object objE6 = oVar.e(wVar, v.class);
                Intrinsics.checkNotNullExpressionValue(objE6, "fromJson(...)");
                v vVar = (v) ((z) objE6);
                String prefillChoice = vVar.getPrefillChoice();
                b0 address = vVar.getAddress();
                return new WorkflowStepConfiguration.Screen.ResidentialAddressCollectionV2(address != null ? a(address) : null, prefillChoice, vVar.getCountryCode());
            case 10:
                Object objE7 = oVar.e(wVar, y.a.class);
                Intrinsics.checkNotNullExpressionValue(objE7, "fromJson(...)");
                y.a aVar = (y.a) ((z) objE7);
                y transactionActivity = aVar.getTransactionActivity();
                String title = transactionActivity.getTitle();
                String subtitle = transactionActivity.getSubtitle();
                List suggestedCountries = transactionActivity.getSuggestedCountries();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(suggestedCountries, 10));
                Iterator it8 = suggestedCountries.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(com.bumptech.glide.d.c((String) it8.next()));
                }
                List allCountries = transactionActivity.getAllCountries();
                ArrayList arrayList3 = new ArrayList(zhm.w.t(allCountries, 10));
                Iterator it9 = allCountries.iterator();
                while (it9.hasNext()) {
                    arrayList3.add(com.bumptech.glide.d.c((String) it9.next()));
                }
                return new WorkflowStepConfiguration.Screen.TransactionCountries(title, subtitle, arrayList2, arrayList3, com.bumptech.glide.d.c(aVar.getCountryCode()), transactionActivity.getValueAndFrequencyRequired());
            case 11:
            case 12:
                return new WorkflowStepConfiguration.Screen.PepConnections(hVar);
            case 13:
                Object objE8 = oVar.e(wVar, t.a.class);
                Intrinsics.checkNotNullExpressionValue(objE8, "fromJson(...)");
                t productObstacles = ((t.a) ((z) objE8)).getProductObstacles();
                return new WorkflowStepConfiguration.Screen.ProductClosures(productObstacles.getTitle(), productObstacles.getSubtitle(), productObstacles.getMigrationContext());
            case 14:
                Object objE9 = oVar.e(wVar, r.class);
                Intrinsics.checkNotNullExpressionValue(objE9, "fromJson(...)");
                r rVar = (r) ((z) objE9);
                String flowType = rVar.getFlowType();
                sil.d[] dVarArrValues = sil.d.values();
                int length2 = dVarArrValues.length;
                while (true) {
                    if (i < length2) {
                        sil.d dVar2 = dVarArrValues[i];
                        if (a0.z(dVar2.name(), flowType, true)) {
                            dVar = dVar2;
                        } else {
                            i++;
                        }
                    }
                }
                if (dVar != null) {
                    return new WorkflowStepConfiguration.Screen.PodBeneficiaries(dVar);
                }
                throw new UnrecognisedContractException(j6.a.q("Unknown PodBeneficiariesFlowType: ", rVar.getFlowType()));
            case 15:
                Object objE10 = oVar.e(wVar, m.b.class);
                Intrinsics.checkNotNullExpressionValue(objE10, "fromJson(...)");
                m addressSuggestion = ((m.b) ((z) objE10)).getAddressSuggestion();
                String title2 = addressSuggestion.getTitle();
                String subtitle2 = addressSuggestion.getSubtitle();
                String submissionButton = addressSuggestion.getSubmissionButton();
                String skipButton = addressSuggestion.getSkipButton();
                List<m.a> items = addressSuggestion.getItems();
                ArrayList arrayList4 = new ArrayList(zhm.w.t(items, 10));
                for (m.a aVar2 : items) {
                    arrayList4.add(new WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem(a(aVar2.getAddress()), aVar2.getTitle(), aVar2.getTag()));
                }
                Iterator it10 = addressSuggestion.getItems().iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(((m.a) next).getPreselected(), Boolean.TRUE)) {
                        }
                    } else {
                        next = null;
                    }
                }
                m.a aVar3 = (m.a) next;
                return new WorkflowStepConfiguration.Screen.AddressSuggestion(title2, subtitle2, submissionButton, skipButton, arrayList4, aVar3 != null ? new WorkflowStepConfiguration.Screen.AddressSuggestion.AddressSuggestionItem(a(aVar3.getAddress()), aVar3.getTitle(), aVar3.getTag()) : null);
            case 16:
                if (wVar == null) {
                    return new WorkflowStepConfiguration.Screen.CreditConsent(null, null, null);
                }
                Object objE11 = oVar.e(wVar, evh.o.class);
                Intrinsics.checkNotNullExpressionValue(objE11, "fromJson(...)");
                evh.o oVar2 = (evh.o) ((z) objE11);
                String termsScope = oVar2.getTermsScope();
                List explicitTerms = oVar2.getExplicitTerms();
                if (explicitTerms != null) {
                    List<o.b> list = explicitTerms;
                    arrayList = new ArrayList(zhm.w.t(list, 10));
                    for (o.b bVar : list) {
                        arrayList.add(new CreditConsentExplicitTerm(bVar.getId(), bVar.getDisclosure()));
                    }
                } else {
                    arrayList = null;
                }
                o.a expiryCollection = oVar2.getExpiryCollection();
                return new WorkflowStepConfiguration.Screen.CreditConsent(termsScope, arrayList, expiryCollection != null ? new CreditConsentExpiryCollection(expiryCollection.getApprovedDefaultDays(), expiryCollection.getRejectedDefaultDays()) : null);
            case 17:
                Object objE12 = oVar.e(wVar, evh.w.class);
                Intrinsics.checkNotNullExpressionValue(objE12, "fromJson(...)");
                evh.w wVar2 = (evh.w) ((z) objE12);
                String principalRegisteredIdentityId = wVar2.getPrincipalRegisteredIdentityId();
                String flowType2 = wVar2.getFlowType();
                w.a productConfigurationKey = wVar2.getProductConfigurationKey();
                return new WorkflowStepConfiguration.Screen.TaxResidenciesCollection(new WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey(productConfigurationKey.getProduct(), productConfigurationKey.getDivision(), productConfigurationKey.getCompanyId(), com.bumptech.glide.d.c(productConfigurationKey.getCountry())), principalRegisteredIdentityId, flowType2);
            case 18:
                return WorkflowStepConfiguration.Screen.SendGuardianInvitation.f105550a;
            case 19:
                Object objE13 = oVar.e(wVar, s.class);
                Intrinsics.checkNotNullExpressionValue(objE13, "fromJson(...)");
                return new WorkflowStepConfiguration.Screen.PricingPlansPrompt(((s) ((z) objE13)).getPromptType());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
