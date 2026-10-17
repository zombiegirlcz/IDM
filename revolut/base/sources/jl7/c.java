package jl7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import hl7.a5;
import hl7.f1;
import hl7.i1;
import hl7.k3;
import hl7.m0;
import hl7.n3;
import hl7.p2;
import hl7.r1;
import hl7.t9;
import hl7.v5;
import hl7.x4;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl7.n0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f175619a = r0.k(new Pair("DISQUALIFICATIONS", n0.DISQUALIFICATIONS), new Pair("CONVICTIONS", n0.CONVICTIONS), new Pair("REFUSED_CAR_INSURANCE", n0.REFUSED_CAR_INSURANCE), new Pair("INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL", n0.INCREASED_EXCESS_AND_REDUCED_COVER_LEVEL), new Pair("DRIVER_DISABILITY", n0.DRIVER_DISABILITY), new Pair("NO_OR_RECENT_RESIDENCY_IRELAND", n0.NO_OR_RECENT_RESIDENCY_IRELAND), new Pair("CURRENT_INSURANCE_EXPIRED_30_OR_MORE", n0.CURRENT_INSURANCE_EXPIRED_30_OR_MORE));

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    public static final ApplicationForm a(hl7.i iVar) {
        LocalDate localDate;
        ArrayList arrayList;
        ZonedDateTime zonedDateTime;
        ZonedDateTime zonedDateTime2;
        t9 t9Var;
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        String str = iVar.f153134a;
        String str2 = iVar.f153135b;
        LinkedHashMap linkedHashMap = null;
        if (str2 != null) {
            Intrinsics.checkNotNullParameter(str2, "<this>");
            localDate = LocalDate.parse(str2);
        } else {
            localDate = null;
        }
        m0 m0Var = iVar.f153136c;
        InsurableCar insurableCarA = m0Var != null ? f.a(m0Var) : null;
        a5 a5Var = iVar.d;
        Survey surveyB = (a5Var == null || (t9Var = a5Var.f153020a) == null) ? null : b(t9Var);
        List list = iVar.e;
        if (list != null) {
            List<hl7.f> list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            for (hl7.f fVar : list2) {
                String str3 = fVar.f153088a;
                String str4 = fVar.e;
                Object obj2 = b.f175612a;
                Intrinsics.checkNotNullParameter(str4, "<this>");
                AdditionalDriver.Relationship relationship = (AdditionalDriver.Relationship) u1.u(str4, b.f175617j);
                String str5 = fVar.f153089b;
                String str6 = fVar.f153090c;
                String str7 = fVar.d;
                Intrinsics.checkNotNullParameter(str7, "<this>");
                LocalDate localDate2 = LocalDate.parse(str7);
                Intrinsics.checkNotNullExpressionValue(localDate2, "toDate(...)");
                Survey surveyB2 = b(fVar.f);
                String str8 = fVar.f153091g;
                if (str8 != null) {
                    Intrinsics.checkNotNullParameter(str8, "<this>");
                    zonedDateTime = ZonedDateTime.parse(str8);
                } else {
                    zonedDateTime = null;
                }
                String str9 = fVar.f153092h;
                if (str9 != null) {
                    Intrinsics.checkNotNullParameter(str9, "<this>");
                    zonedDateTime2 = ZonedDateTime.parse(str9);
                } else {
                    zonedDateTime2 = null;
                }
                arrayList2.add(new AdditionalDriver(str3, str5, str6, localDate2, relationship, surveyB2, zonedDateTime, zonedDateTime2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        List list3 = iVar.f;
        if (list3 != null) {
            List<k3> list4 = list3;
            int iB = q0.b(w.t(list4, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
            for (k3 k3Var : list4) {
                linkedHashMap2.put(u1.u(k3Var.f153168a, f175619a), Boolean.valueOf(k3Var.f153169b));
            }
            linkedHashMap = linkedHashMap2;
        }
        Iterable iterable = iVar.f153137g;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(w.t(iterable2, 10));
        Iterator it8 = iterable2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(f.a((m0) it8.next()));
        }
        Iterable iterable3 = iVar.f153138h;
        if (iterable3 == null) {
            iterable3 = f0.f322471a;
        }
        Iterable iterable4 = iterable3;
        ArrayList arrayList4 = new ArrayList(w.t(iterable4, 10));
        Iterator it9 = iterable4.iterator();
        while (it9.hasNext()) {
            arrayList4.add(f.a((m0) it9.next()));
        }
        Iterable iterable5 = iVar.i;
        if (iterable5 == null) {
            iterable5 = f0.f322471a;
        }
        Iterable iterable6 = iterable5;
        ArrayList arrayList5 = new ArrayList(w.t(iterable6, 10));
        Iterator it10 = iterable6.iterator();
        while (it10.hasNext()) {
            arrayList5.add(f.a((m0) it10.next()));
        }
        Boolean bool = iVar.f153139j;
        return new ApplicationForm(str, localDate, insurableCarA, surveyB, arrayList, linkedHashMap, arrayList3, arrayList4, arrayList5, bool != null ? bool.booleanValue() : true);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public static final Survey b(t9 t9Var) {
        Survey.Licence licence;
        Survey.Employment employment;
        Survey.CurrentInsurance currentInsurance;
        Survey.Claims claims;
        Survey.LicencePenalties licencePenalties;
        LocalDate localDate;
        Answer.NoClaimsDiscount noClaimsDiscount;
        Answer.AdditionalClaimsDiscount additionalClaimsDiscount;
        Occupation occupation;
        p2 p2Var = t9Var.f153318a;
        Answer.Mileage mileage = null;
        if (p2Var != null) {
            String str = p2Var.f153251a;
            Object obj2 = b.f175612a;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Answer.LicenceType licenceType = (Answer.LicenceType) u1.u(str, b.f175612a);
            String str2 = p2Var.f153252b;
            Intrinsics.checkNotNullParameter(str2, "<this>");
            licence = new Survey.Licence(licenceType, (Answer.LicenceDuration) u1.u(str2, b.f175613b));
        } else {
            licence = null;
        }
        n3 n3Var = t9Var.f153319b;
        if (n3Var != null) {
            String str3 = n3Var.f153222a;
            Object obj3 = b.f175612a;
            Intrinsics.checkNotNullParameter(str3, "<this>");
            Answer.EmploymentStatus employmentStatus = (Answer.EmploymentStatus) u1.u(str3, b.f175614c);
            v5 v5Var = n3Var.f153223b;
            if (v5Var != null) {
                Intrinsics.checkNotNullParameter(v5Var, "<this>");
                occupation = new Occupation(v5Var.f153338a, v5Var.f153339b);
            } else {
                occupation = null;
            }
            employment = new Survey.Employment(employmentStatus, occupation);
        } else {
            employment = null;
        }
        r1 r1Var = t9Var.f153320c;
        if (r1Var != null) {
            String str4 = r1Var.f153283a;
            Object obj4 = b.f175612a;
            Intrinsics.checkNotNullParameter(str4, "<this>");
            Answer.CurrentInsuranceState currentInsuranceState = (Answer.CurrentInsuranceState) u1.u(str4, b.d);
            String str5 = r1Var.f153284b;
            if (str5 != null) {
                Intrinsics.checkNotNullParameter(str5, "<this>");
                noClaimsDiscount = (Answer.NoClaimsDiscount) u1.u(str5, b.e);
            } else {
                noClaimsDiscount = null;
            }
            String str6 = r1Var.f153285c;
            if (str6 != null) {
                Intrinsics.checkNotNullParameter(str6, "<this>");
                additionalClaimsDiscount = (Answer.AdditionalClaimsDiscount) u1.u(str6, b.f);
            } else {
                additionalClaimsDiscount = null;
            }
            currentInsurance = new Survey.CurrentInsurance(currentInsuranceState, noClaimsDiscount, additionalClaimsDiscount);
        } else {
            currentInsurance = null;
        }
        i1 i1Var = t9Var.d;
        if (i1Var != null) {
            String str7 = i1Var.f153141a;
            Object obj5 = b.f175612a;
            Intrinsics.checkNotNullParameter(str7, "<this>");
            Answer.ClaimsState claimsState = (Answer.ClaimsState) u1.u(str7, b.f175615g);
            List<f1> list = i1Var.f153142b;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (f1 f1Var : list) {
                String str8 = f1Var.f153093a;
                if (str8 != null) {
                    Intrinsics.checkNotNullParameter(str8, "<this>");
                    localDate = LocalDate.parse(str8);
                } else {
                    localDate = null;
                }
                String str9 = f1Var.f153094b;
                Object obj6 = b.f175612a;
                Intrinsics.checkNotNullParameter(str9, "<this>");
                arrayList.add(new Survey.Claims.Details(localDate, (Answer.ClaimType) u1.u(str9, b.f175616h), f1Var.f153095c, f1Var.d));
            }
            claims = new Survey.Claims(claimsState, arrayList);
        } else {
            claims = null;
        }
        x4 x4Var = t9Var.e;
        if (x4Var != null) {
            String str10 = x4Var.f153363a;
            Object obj7 = b.f175612a;
            Intrinsics.checkNotNullParameter(str10, "<this>");
            licencePenalties = new Survey.LicencePenalties((Answer.PenaltyPoints) u1.u(str10, b.i), x4Var.f153364b, x4Var.f153365c);
        } else {
            licencePenalties = null;
        }
        String str11 = t9Var.f;
        if (str11 != null) {
            Object obj8 = b.f175612a;
            Intrinsics.checkNotNullParameter(str11, "<this>");
            mileage = (Answer.Mileage) u1.u(str11, b.k);
        }
        return new Survey(licence, employment, currentInsurance, claims, licencePenalties, mileage);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public static final hl7.f c(AdditionalDriver additionalDriver) {
        Intrinsics.checkNotNullParameter(additionalDriver, "<this>");
        String str = additionalDriver.f75161a;
        AdditionalDriver.Relationship relationship = additionalDriver.e;
        Object obj2 = b.f175612a;
        Intrinsics.checkNotNullParameter(relationship, "<this>");
        String strG = u1.g(relationship, b.f175617j);
        String str2 = additionalDriver.f75162b;
        String str3 = additionalDriver.f75163c;
        LocalDate localDate = additionalDriver.d;
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        String string = localDate.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        t9 t9VarE = e(additionalDriver.f);
        ZonedDateTime zonedDateTime = additionalDriver.f75164g;
        String strR = zonedDateTime != null ? cp5.c.R(zonedDateTime) : null;
        ZonedDateTime zonedDateTime2 = additionalDriver.f75165h;
        return new hl7.f(str, str2, str3, string, strG, t9VarE, strR, zonedDateTime2 != null ? cp5.c.R(zonedDateTime2) : null);
    }

    public static final hl7.i d(ApplicationForm applicationForm) {
        ArrayList arrayList;
        String string;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        String str = applicationForm.f75166a;
        InsurableCar insurableCar = applicationForm.f75168c;
        if (insurableCar == null) {
            throw new IllegalStateException("Car can not be null");
        }
        m0 m0VarB = f.b(insurableCar);
        Survey survey = applicationForm.d;
        ArrayList arrayList4 = null;
        a5 a5Var = survey != null ? new a5(e(survey)) : null;
        List list = applicationForm.e;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(c((AdditionalDriver) it8.next()));
            }
        } else {
            arrayList = null;
        }
        Map map = applicationForm.f;
        ArrayList arrayListF = map != null ? f(map) : null;
        LocalDate localDate = applicationForm.f75167b;
        if (localDate != null) {
            Intrinsics.checkNotNullParameter(localDate, "<this>");
            string = localDate.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        } else {
            string = null;
        }
        List listN = c6d.b.N(applicationForm.f75169g);
        if (listN != null) {
            List list3 = listN;
            ArrayList arrayList5 = new ArrayList(w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList5.add(f.b((InsurableCar) it9.next()));
            }
            arrayList2 = arrayList5;
        } else {
            arrayList2 = null;
        }
        List listN2 = c6d.b.N(applicationForm.f75170h);
        if (listN2 != null) {
            List list4 = listN2;
            ArrayList arrayList6 = new ArrayList(w.t(list4, 10));
            Iterator it10 = list4.iterator();
            while (it10.hasNext()) {
                arrayList6.add(f.b((InsurableCar) it10.next()));
            }
            arrayList3 = arrayList6;
        } else {
            arrayList3 = null;
        }
        List listN3 = c6d.b.N(applicationForm.i);
        if (listN3 != null) {
            List list5 = listN3;
            arrayList4 = new ArrayList(w.t(list5, 10));
            Iterator it11 = list5.iterator();
            while (it11.hasNext()) {
                arrayList4.add(f.b((InsurableCar) it11.next()));
            }
        }
        return new hl7.i(str, string, m0VarB, a5Var, arrayList, arrayListF, arrayList2, arrayList3, arrayList4, Boolean.valueOf(applicationForm.f75171j));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.Map] */
    public static final t9 e(Survey survey) {
        p2 p2Var;
        n3 n3Var;
        r1 r1Var;
        i1 i1Var;
        x4 x4Var;
        String strG;
        String string;
        String strG2;
        String strG3;
        v5 v5Var;
        Survey.Licence licence = survey.f75314a;
        String strG4 = null;
        if (licence != null) {
            Intrinsics.checkNotNullParameter(licence, "<this>");
            Answer.LicenceType licenceType = licence.f75327a;
            Object obj2 = b.f175612a;
            Intrinsics.checkNotNullParameter(licenceType, "<this>");
            String strG5 = u1.g(licenceType, b.f175612a);
            Answer.LicenceDuration licenceDuration = licence.f75328b;
            Intrinsics.checkNotNullParameter(licenceDuration, "<this>");
            p2Var = new p2(strG5, u1.g(licenceDuration, b.f175613b));
        } else {
            p2Var = null;
        }
        Survey.Employment employment = survey.f75315b;
        if (employment != null) {
            Answer.EmploymentStatus employmentStatus = employment.f75325a;
            Object obj3 = b.f175612a;
            Intrinsics.checkNotNullParameter(employmentStatus, "<this>");
            String strG6 = u1.g(employmentStatus, b.f175614c);
            Occupation occupation = employment.f75326b;
            if (occupation != null) {
                Intrinsics.checkNotNullParameter(occupation, "<this>");
                v5Var = new v5(occupation.f75264a, occupation.f75265b);
            } else {
                v5Var = null;
            }
            n3Var = new n3(strG6, v5Var);
        } else {
            n3Var = null;
        }
        Survey.CurrentInsurance currentInsurance = survey.f75316c;
        if (currentInsurance != null) {
            Answer.CurrentInsuranceState currentInsuranceState = currentInsurance.f75322a;
            Object obj4 = b.f175612a;
            Intrinsics.checkNotNullParameter(currentInsuranceState, "<this>");
            String strG7 = u1.g(currentInsuranceState, b.d);
            Answer.NoClaimsDiscount noClaimsDiscount = currentInsurance.f75323b;
            if (noClaimsDiscount != null) {
                Intrinsics.checkNotNullParameter(noClaimsDiscount, "<this>");
                strG2 = u1.g(noClaimsDiscount, b.e);
            } else {
                strG2 = null;
            }
            Answer.AdditionalClaimsDiscount additionalClaimsDiscount = currentInsurance.f75324c;
            if (additionalClaimsDiscount != null) {
                Intrinsics.checkNotNullParameter(additionalClaimsDiscount, "<this>");
                strG3 = u1.g(additionalClaimsDiscount, b.f);
            } else {
                strG3 = null;
            }
            r1Var = new r1(strG7, strG2, strG3);
        } else {
            r1Var = null;
        }
        Survey.Claims claims = survey.d;
        if (claims != null) {
            Answer.ClaimsState claimsState = claims.f75317a;
            if (claimsState == Answer.ClaimsState.WINDSCREEN_ONLY) {
                strG = null;
            } else {
                Object obj5 = b.f175612a;
                Intrinsics.checkNotNullParameter(claimsState, "<this>");
                strG = u1.g(claimsState, b.f175615g);
            }
            if (strG == null) {
                throw new IllegalStateException("WINDSCREEN_ONLY not valid state");
            }
            List<Survey.Claims.Details> list = claims.f75318b;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (Survey.Claims.Details details : list) {
                LocalDate localDate = details.f75319a;
                if (localDate != null) {
                    Intrinsics.checkNotNullParameter(localDate, "<this>");
                    string = localDate.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else {
                    string = null;
                }
                Answer.ClaimType claimType = details.f75320b;
                Object obj6 = b.f175612a;
                Intrinsics.checkNotNullParameter(claimType, "<this>");
                arrayList.add(new f1(string, u1.g(claimType, b.f175616h), details.f75321c, details.d));
            }
            i1Var = new i1(strG, arrayList);
        } else {
            i1Var = null;
        }
        Survey.LicencePenalties licencePenalties = survey.e;
        if (licencePenalties != null) {
            Answer.PenaltyPoints penaltyPoints = licencePenalties.f75329a;
            Object obj7 = b.f175612a;
            Intrinsics.checkNotNullParameter(penaltyPoints, "<this>");
            x4Var = new x4(u1.g(penaltyPoints, b.i), licencePenalties.f75330b, licencePenalties.f75331c);
        } else {
            x4Var = null;
        }
        Answer.Mileage mileage = survey.f;
        if (mileage != null) {
            Object obj8 = b.f175612a;
            Intrinsics.checkNotNullParameter(mileage, "<this>");
            strG4 = u1.g(mileage, b.k);
        }
        return new t9(p2Var, n3Var, r1Var, i1Var, x4Var, strG4);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList f(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            n0 n0Var = (n0) entry.getKey();
            Intrinsics.checkNotNullParameter(n0Var, "<this>");
            arrayList.add(new k3(u1.g(n0Var, f175619a), ((Boolean) entry.getValue()).booleanValue()));
        }
        return arrayList;
    }
}
