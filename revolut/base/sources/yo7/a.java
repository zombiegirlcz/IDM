package yo7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final AdditionalDriver a(h hVar) {
        ArrayList arrayListA;
        LocalDate localDate;
        AdditionalDriver.Relationship relationship;
        Answer.LicenceType licenceType;
        Answer.LicenceDuration licenceDuration;
        Answer.EmploymentStatus employmentStatus;
        Boolean bool;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Answer.ClaimsState claimsState = hVar.f315612h;
        Answer.PenaltyPoints penaltyPoints = hVar.f315613j;
        Occupation occupation = hVar.f315616n;
        if (claimsState != null && (arrayListA = vp7.c.a(hVar.i)) != null) {
            String string = d0.F0(hVar.f315609b).toString();
            String str = !d0.W(string) ? string : null;
            if (str != null) {
                String string2 = d0.F0(hVar.f315610c).toString();
                String str2 = !d0.W(string2) ? string2 : null;
                if (str2 != null && (localDate = hVar.d) != null && (relationship = hVar.e) != null && (licenceType = hVar.f) != null && (licenceDuration = hVar.f315611g) != null) {
                    Survey.Licence licence = new Survey.Licence(licenceType, licenceDuration);
                    Answer.EmploymentStatus employmentStatus2 = hVar.f315615m;
                    if (employmentStatus2 != null && (employmentStatus2 != (employmentStatus = Answer.EmploymentStatus.EMPLOYED) || occupation != null)) {
                        if (employmentStatus2 != employmentStatus) {
                            occupation = null;
                        }
                        Survey.Employment employment = new Survey.Employment(employmentStatus2, occupation);
                        Survey.Claims claims = new Survey.Claims(claimsState, arrayListA);
                        if (penaltyPoints != null) {
                            if (jl7.b.a(penaltyPoints)) {
                                bool = hVar.k;
                                if (bool != null) {
                                }
                            } else {
                                bool = null;
                            }
                            if (jl7.b.a(penaltyPoints)) {
                                Boolean bool3 = hVar.f315614l;
                                bool2 = bool3 != null ? bool3 : null;
                            }
                            return new AdditionalDriver(null, str, str2, localDate, relationship, new Survey(licence, employment, null, claims, new Survey.LicencePenalties(penaltyPoints, bool, bool2), null), null, null);
                        }
                    }
                }
            }
        }
        return null;
    }
}
