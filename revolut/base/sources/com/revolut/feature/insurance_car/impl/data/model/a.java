package com.revolut.feature.insurance_car.impl.data.model;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final ApplicationForm a(ApplicationForm applicationForm, Survey.Claims claims) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(claims, "claims");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, null, null, null, claims, null, null, 55) : new Survey(null, null, null, claims, null, null, 55), null, null, 1015);
    }

    public static final ApplicationForm b(ApplicationForm applicationForm, Survey.CurrentInsurance currentInsurance) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(currentInsurance, "currentInsurance");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, null, null, currentInsurance, null, null, null, 59) : new Survey(null, null, currentInsurance, null, null, null, 59), null, null, 1015);
    }

    public static final ApplicationForm c(ApplicationForm applicationForm, Survey.Employment employment) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(employment, "employment");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, null, employment, null, null, null, null, 61) : new Survey(null, employment, null, null, null, null, 61), null, null, 1015);
    }

    public static final ApplicationForm d(ApplicationForm applicationForm, Survey.Licence licence) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(licence, "licence");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, licence, null, null, null, null, null, 62) : new Survey(licence, null, null, null, null, null, 62), null, null, 1015);
    }

    public static final ApplicationForm e(ApplicationForm applicationForm, Answer.Mileage mileage) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(mileage, "mileage");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, null, null, null, null, null, mileage, 31) : new Survey(null, null, null, null, null, mileage, 31), null, null, 1015);
    }

    public static final ApplicationForm f(ApplicationForm applicationForm, Survey.LicencePenalties penalties) {
        Intrinsics.checkNotNullParameter(applicationForm, "<this>");
        Intrinsics.checkNotNullParameter(penalties, "penalties");
        Survey survey = applicationForm.d;
        return ApplicationForm.a(applicationForm, null, null, survey != null ? Survey.a(survey, null, null, null, null, penalties, null, 47) : new Survey(null, null, null, null, penalties, null, 47), null, null, 1015);
    }
}
