package evh;

import com.revolut.shared.feature.workflow.engine.api.models.EligibilityDataPointValue;
import dvh.k;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c0 {
    public static final dvh.k a(EligibilityDataPointValue eligibilityDataPointValue) {
        Intrinsics.checkNotNullParameter(eligibilityDataPointValue, "<this>");
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.StringDataPointValue) {
            EligibilityDataPointValue.StringDataPointValue stringDataPointValue = (EligibilityDataPointValue.StringDataPointValue) eligibilityDataPointValue;
            return new k.h(stringDataPointValue.f105411a, stringDataPointValue.f105412b);
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.PlaceOfBirthDataPointValue) {
            EligibilityDataPointValue.PlaceOfBirthDataPointValue placeOfBirthDataPointValue = (EligibilityDataPointValue.PlaceOfBirthDataPointValue) eligibilityDataPointValue;
            String str = placeOfBirthDataPointValue.f105406a;
            Intrinsics.checkNotNullParameter(placeOfBirthDataPointValue, "<this>");
            return new k.f(str, new dvh.i(placeOfBirthDataPointValue.f105407b, placeOfBirthDataPointValue.f105408c));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.PurposeOfAccountDataPointValue) {
            EligibilityDataPointValue.PurposeOfAccountDataPointValue purposeOfAccountDataPointValue = (EligibilityDataPointValue.PurposeOfAccountDataPointValue) eligibilityDataPointValue;
            String str2 = purposeOfAccountDataPointValue.f105409a;
            Intrinsics.checkNotNullParameter(purposeOfAccountDataPointValue, "<this>");
            return new k.g(str2, new dvh.j(purposeOfAccountDataPointValue.f105410b));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.NameDataPointValue) {
            EligibilityDataPointValue.NameDataPointValue nameDataPointValue = (EligibilityDataPointValue.NameDataPointValue) eligibilityDataPointValue;
            return new k.d(nameDataPointValue.f105398a, dvh.m.b(nameDataPointValue));
        }
        if (eligibilityDataPointValue instanceof EligibilityDataPointValue.CitizenshipDataPointValue) {
            EligibilityDataPointValue.CitizenshipDataPointValue citizenshipDataPointValue = (EligibilityDataPointValue.CitizenshipDataPointValue) eligibilityDataPointValue;
            String str3 = citizenshipDataPointValue.f105388a;
            Intrinsics.checkNotNullParameter(citizenshipDataPointValue, "<this>");
            return new k.b(str3, new dvh.c(citizenshipDataPointValue.f105389b));
        }
        if (!(eligibilityDataPointValue instanceof EligibilityDataPointValue.DocumentIdDataPointValue)) {
            if (eligibilityDataPointValue instanceof EligibilityDataPointValue.AcceptedTermsDataPointValue) {
                EligibilityDataPointValue.AcceptedTermsDataPointValue acceptedTermsDataPointValue = (EligibilityDataPointValue.AcceptedTermsDataPointValue) eligibilityDataPointValue;
                return new k.a(acceptedTermsDataPointValue.f105381a, dvh.m.a(acceptedTermsDataPointValue.f105382b));
            }
            if (!(eligibilityDataPointValue instanceof EligibilityDataPointValue.PersonalCodeValue)) {
                throw new NoWhenBranchMatchedException();
            }
            EligibilityDataPointValue.PersonalCodeValue personalCodeValue = (EligibilityDataPointValue.PersonalCodeValue) eligibilityDataPointValue;
            String str4 = personalCodeValue.f105403a;
            Intrinsics.checkNotNullParameter(personalCodeValue, "<this>");
            return new k.e(str4, new dvh.h(zhm.u.c(new dvh.g(personalCodeValue.f105404b, personalCodeValue.f105405c))));
        }
        EligibilityDataPointValue.DocumentIdDataPointValue documentIdDataPointValue = (EligibilityDataPointValue.DocumentIdDataPointValue) eligibilityDataPointValue;
        String str5 = documentIdDataPointValue.f105390a;
        EligibilityDataPointValue.DocumentIdValue documentIdValue = documentIdDataPointValue.f105391b;
        Intrinsics.checkNotNullParameter(documentIdValue, "<this>");
        String str6 = documentIdValue.f105392a;
        String str7 = documentIdValue.f105393b;
        String str8 = documentIdValue.f105394c;
        ArrayList<EligibilityDataPointValue.FieldValue> arrayList = documentIdValue.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (EligibilityDataPointValue.FieldValue fieldValue : arrayList) {
            arrayList2.add(new dvh.f(fieldValue.f105395a, fieldValue.f105396b, fieldValue.f105397c));
        }
        return new k.c(str5, new dvh.d(str6, str7, str8, arrayList2));
    }
}
