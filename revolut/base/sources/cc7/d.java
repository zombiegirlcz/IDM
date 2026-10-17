package cc7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zb7.g f22944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f22945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22946c;

    public d(zb7.g survey, Set selectedCategories, String customNote) {
        Intrinsics.checkNotNullParameter(survey, "survey");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(customNote, "customNote");
        this.f22944a = survey;
        this.f22945b = selectedCategories;
        this.f22946c = customNote;
    }

    public static d a(d dVar, zb7.g survey, Set selectedCategories, String customNote, int i) {
        if ((i & 1) != 0) {
            survey = dVar.f22944a;
        }
        if ((i & 2) != 0) {
            selectedCategories = dVar.f22945b;
        }
        if ((i & 4) != 0) {
            customNote = dVar.f22946c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(survey, "survey");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(customNote, "customNote");
        return new d(survey, selectedCategories, customNote);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f22944a, dVar.f22944a) && Intrinsics.f(this.f22945b, dVar.f22945b) && Intrinsics.f(this.f22946c, dVar.f22946c);
    }

    public final int hashCode() {
        return this.f22946c.hashCode() + p.a.f(this.f22944a.hashCode() * 31, 31, this.f22945b);
    }
}
