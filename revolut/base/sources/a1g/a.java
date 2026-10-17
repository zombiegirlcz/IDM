package a1g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (c((TravelExperienceBookingQuestion) obj2)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static final boolean b(List list) {
        List<TravelExperienceBookingQuestion> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (TravelExperienceBookingQuestion travelExperienceBookingQuestion : list2) {
            TravelExperienceBookingQuestion.Category category = travelExperienceBookingQuestion.i;
            if (Intrinsics.f(category != null ? category.f92795a : null, "PICKUP") && travelExperienceBookingQuestion.f92792h) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(TravelExperienceBookingQuestion travelExperienceBookingQuestion) {
        Intrinsics.checkNotNullParameter(travelExperienceBookingQuestion, "<this>");
        if (travelExperienceBookingQuestion.f92791g != myf.e.BOOKING) {
            return false;
        }
        TravelExperienceBookingQuestion.Category category = travelExperienceBookingQuestion.i;
        return Intrinsics.f(category != null ? category.f92795a : null, "PREFERENCES") && travelExperienceBookingQuestion.f92790c == myf.f.TEXT;
    }
}
