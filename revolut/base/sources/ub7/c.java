package ub7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lub7/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "e", "screenId", "c", "d", "rating", "question", "", "Lub7/a;", "Ljava/util/List;", "()Ljava/util/List;", "categories", "f", "surveyEntityId", "feature_home_nps_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("surveyName")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b(ib.b.Screen)
    @NotNull
    private final String screenId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rating")
    private final String rating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("question")
    @NotNull
    private final String question;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<a> categories;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("surveyEntityId")
    private final String surveyEntityId;

    public c(String id10, String screenId, String str, String question, String str2, ArrayList categories) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.id = id10;
        this.screenId = screenId;
        this.rating = str;
        this.question = question;
        this.categories = categories;
        this.surveyEntityId = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.screenId, cVar.screenId) && Intrinsics.f(this.rating, cVar.rating) && Intrinsics.f(this.question, cVar.question) && Intrinsics.f(this.categories, cVar.categories) && Intrinsics.f(this.surveyEntityId, cVar.surveyEntityId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSurveyEntityId() {
        return this.surveyEntityId;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.screenId);
        String str = this.rating;
        int iD = p.a.d(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.question), 31, this.categories);
        String str2 = this.surveyEntityId;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }
}
