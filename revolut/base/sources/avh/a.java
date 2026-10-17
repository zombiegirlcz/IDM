package avh;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import dvh.e;
import dvh.j;
import dvh.k;
import dvh.l;
import dvh.m;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final l a(EligibilityDataPointValue eligibilityDataPointValue) {
        Intrinsics.checkNotNullParameter(eligibilityDataPointValue, "<this>");
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.StringDataPointValue) {
            EligibilityDataPointValue.StringDataPointValue stringDataPointValue = (EligibilityDataPointValue.StringDataPointValue) eligibilityDataPointValue;
            return new e.f(stringDataPointValue.f105411a, stringDataPointValue.f105412b);
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.PlaceOfBirthDataPointValue) {
            EligibilityDataPointValue.PlaceOfBirthDataPointValue placeOfBirthDataPointValue = (EligibilityDataPointValue.PlaceOfBirthDataPointValue) eligibilityDataPointValue;
            String str = placeOfBirthDataPointValue.f105406a;
            Intrinsics.checkNotNullParameter(placeOfBirthDataPointValue, "<this>");
            return new e.d(str, new dvh.i(placeOfBirthDataPointValue.f105407b, placeOfBirthDataPointValue.f105408c));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.PurposeOfAccountDataPointValue) {
            EligibilityDataPointValue.PurposeOfAccountDataPointValue purposeOfAccountDataPointValue = (EligibilityDataPointValue.PurposeOfAccountDataPointValue) eligibilityDataPointValue;
            String str2 = purposeOfAccountDataPointValue.f105409a;
            Intrinsics.checkNotNullParameter(purposeOfAccountDataPointValue, "<this>");
            return new e.C0713e(str2, new j(purposeOfAccountDataPointValue.f105410b));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.NameDataPointValue) {
            EligibilityDataPointValue.NameDataPointValue nameDataPointValue = (EligibilityDataPointValue.NameDataPointValue) eligibilityDataPointValue;
            return new e.c(nameDataPointValue.f105398a, m.b(nameDataPointValue));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.CitizenshipDataPointValue) {
            EligibilityDataPointValue.CitizenshipDataPointValue citizenshipDataPointValue = (EligibilityDataPointValue.CitizenshipDataPointValue) eligibilityDataPointValue;
            return new e.a(citizenshipDataPointValue.f105388a, new dvh.c(citizenshipDataPointValue.f105389b));
        }
        if (!(eligibilityDataPointValue instanceof EligibilityDataPointValue.DocumentIdDataPointValue)) {
            if (eligibilityDataPointValue instanceof EligibilityDataPointValue.AcceptedTermsDataPointValue) {
                EligibilityDataPointValue.AcceptedTermsDataPointValue acceptedTermsDataPointValue = (EligibilityDataPointValue.AcceptedTermsDataPointValue) eligibilityDataPointValue;
                return new k.a(acceptedTermsDataPointValue.f105381a, m.a(acceptedTermsDataPointValue.f105382b));
            }
            if (!(eligibilityDataPointValue instanceof EligibilityDataPointValue.PersonalCodeValue)) {
                throw new NoWhenBranchMatchedException();
            }
            EligibilityDataPointValue.PersonalCodeValue personalCodeValue = (EligibilityDataPointValue.PersonalCodeValue) eligibilityDataPointValue;
            String str3 = personalCodeValue.f105403a;
            Intrinsics.checkNotNullParameter(personalCodeValue, "<this>");
            return new k.e(str3, new dvh.h(u.c(new dvh.g(personalCodeValue.f105404b, personalCodeValue.f105405c))));
        }
        EligibilityDataPointValue.DocumentIdDataPointValue documentIdDataPointValue = (EligibilityDataPointValue.DocumentIdDataPointValue) eligibilityDataPointValue;
        String str4 = documentIdDataPointValue.f105390a;
        EligibilityDataPointValue.DocumentIdValue documentIdValue = documentIdDataPointValue.f105391b;
        String str5 = documentIdValue.f105392a;
        String str6 = documentIdValue.f105393b;
        String str7 = documentIdValue.f105394c;
        ArrayList<EligibilityDataPointValue.FieldValue> arrayList = documentIdValue.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (EligibilityDataPointValue.FieldValue fieldValue : arrayList) {
            arrayList2.add(new dvh.f(fieldValue.f105395a, fieldValue.f105396b, fieldValue.f105397c));
        }
        return new e.b(str4, new dvh.d(str5, str6, str7, arrayList2));
    }
}
