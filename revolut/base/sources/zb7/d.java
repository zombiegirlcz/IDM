package zb7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f320835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f320836c;
    public final String d;

    public d(String surveyId, c rating, Set selectedCategories, String str) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        Intrinsics.checkNotNullParameter(rating, "rating");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f320834a = surveyId;
        this.f320835b = rating;
        this.f320836c = selectedCategories;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f320834a, dVar.f320834a) && this.f320835b == dVar.f320835b && Intrinsics.f(this.f320836c, dVar.f320836c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f((this.f320835b.hashCode() + (this.f320834a.hashCode() * 31)) * 31, 31, this.f320836c);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
