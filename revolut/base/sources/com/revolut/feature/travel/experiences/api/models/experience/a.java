package com.revolut.feature.travel.experiences.api.models.experience;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import myf.d;
import myf.f;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final boolean a(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        return travelExperienceBookingQuestion.f92790c == f.COUNTRY;
    }

    public static final boolean b(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        List list = travelExperienceBookingQuestion.e;
        return (list == null || list.isEmpty() || c(travelExperienceBookingQuestion)) ? false : true;
    }

    public static final boolean c(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        return travelExperienceBookingQuestion.f92790c == f.TEXT_OR_LOCATION_REF;
    }

    public static final boolean d(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        List list = travelExperienceBookingQuestion.d;
        if (list != null) {
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((TravelExperienceBookingQuestion.AnswerUnit) it8.next()).f92794a == d.TEXT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean e(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        List list;
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        if (travelExperienceBookingQuestion.f92790c != f.NUMBER || (list = travelExperienceBookingQuestion.d) == null) {
            return false;
        }
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            d dVar = ((TravelExperienceBookingQuestion.AnswerUnit) it8.next()).f92794a;
            if (dVar == d.CM || dVar == d.FT || dVar == d.KG || dVar == d.LB) {
                return true;
            }
        }
        return false;
    }
}
