package s3g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final myf.a f259665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f259666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f259667c;
    public final List d;
    public final Map e;
    public final TravelExperiencesBookingContactDetails f;

    public d(myf.a experience, List questions, Set focusedInputIds, List userAnswersList, Map answeredQuestions, TravelExperiencesBookingContactDetails contactDetails) {
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        this.f259665a = experience;
        this.f259666b = questions;
        this.f259667c = focusedInputIds;
        this.d = userAnswersList;
        this.e = answeredQuestions;
        this.f = contactDetails;
    }

    public static d a(d dVar, Set set, List list, Map map, TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails, int i) {
        myf.a experience = dVar.f259665a;
        List questions = dVar.f259666b;
        if ((i & 4) != 0) {
            set = dVar.f259667c;
        }
        Set focusedInputIds = set;
        if ((i & 8) != 0) {
            list = dVar.d;
        }
        List userAnswersList = list;
        if ((i & 16) != 0) {
            map = dVar.e;
        }
        Map answeredQuestions = map;
        if ((i & 32) != 0) {
            travelExperiencesBookingContactDetails = dVar.f;
        }
        TravelExperiencesBookingContactDetails contactDetails = travelExperiencesBookingContactDetails;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        return new d(experience, questions, focusedInputIds, userAnswersList, answeredQuestions, contactDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f259665a, dVar.f259665a) && Intrinsics.f(this.f259666b, dVar.f259666b) && Intrinsics.f(this.f259667c, dVar.f259667c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.e(p.a.d(p.a.f(p.a.d(this.f259665a.hashCode() * 31, 31, this.f259666b), 31, this.f259667c), 31, this.d), 31, this.e);
    }
}
