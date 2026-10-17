package d3g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f111120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final myf.a f111121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f111122c;
    public final Set d;
    public final List e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperiencesBookingContactDetails f111123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TravelExperienceSelectedLanguage f111124h;
    public final List i;

    public k(m questionsTypeMode, myf.a experience, List questions, Set focusedInputIds, List userAnswersList, Map answeredQuestions, TravelExperiencesBookingContactDetails contactDetails, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, List languages) {
        Intrinsics.checkNotNullParameter(questionsTypeMode, "questionsTypeMode");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(languages, "languages");
        this.f111120a = questionsTypeMode;
        this.f111121b = experience;
        this.f111122c = questions;
        this.d = focusedInputIds;
        this.e = userAnswersList;
        this.f = answeredQuestions;
        this.f111123g = contactDetails;
        this.f111124h = travelExperienceSelectedLanguage;
        this.i = languages;
    }

    public static k a(k kVar, Set set, List list, Map map, TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails, TravelExperienceSelectedLanguage travelExperienceSelectedLanguage, int i) {
        m questionsTypeMode = kVar.f111120a;
        myf.a experience = kVar.f111121b;
        List questions = kVar.f111122c;
        if ((i & 8) != 0) {
            set = kVar.d;
        }
        Set focusedInputIds = set;
        if ((i & 16) != 0) {
            list = kVar.e;
        }
        List userAnswersList = list;
        if ((i & 32) != 0) {
            map = kVar.f;
        }
        Map answeredQuestions = map;
        if ((i & 64) != 0) {
            travelExperiencesBookingContactDetails = kVar.f111123g;
        }
        TravelExperiencesBookingContactDetails contactDetails = travelExperiencesBookingContactDetails;
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage2 = (i & 128) != 0 ? kVar.f111124h : travelExperienceSelectedLanguage;
        List languages = kVar.i;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(questionsTypeMode, "questionsTypeMode");
        Intrinsics.checkNotNullParameter(experience, "experience");
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(focusedInputIds, "focusedInputIds");
        Intrinsics.checkNotNullParameter(userAnswersList, "userAnswersList");
        Intrinsics.checkNotNullParameter(answeredQuestions, "answeredQuestions");
        Intrinsics.checkNotNullParameter(contactDetails, "contactDetails");
        Intrinsics.checkNotNullParameter(languages, "languages");
        return new k(questionsTypeMode, experience, questions, focusedInputIds, userAnswersList, answeredQuestions, contactDetails, travelExperienceSelectedLanguage2, languages);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f111120a == kVar.f111120a && Intrinsics.f(this.f111121b, kVar.f111121b) && Intrinsics.f(this.f111122c, kVar.f111122c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f111123g, kVar.f111123g) && Intrinsics.f(this.f111124h, kVar.f111124h) && Intrinsics.f(this.i, kVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f111123g.hashCode() + p.a.e(p.a.d(p.a.f(p.a.d((this.f111121b.hashCode() + (this.f111120a.hashCode() * 31)) * 31, 31, this.f111122c), 31, this.d), 31, this.e), 31, this.f)) * 31;
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = this.f111124h;
        return this.i.hashCode() + ((iHashCode + (travelExperienceSelectedLanguage == null ? 0 : travelExperienceSelectedLanguage.hashCode())) * 31);
    }
}
