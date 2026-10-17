package m3g;

import com.revolut.feature.travel.experiences.api.models.experience.TravelExperiencePreview;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencePreview f202550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperienceDatesSelection f202551c;

    public q(TravelExperiencePreview travelExperiencePreview, TravelExperienceDatesSelection datesSelection, String experienceId) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f202549a = experienceId;
        this.f202550b = travelExperiencePreview;
        this.f202551c = datesSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f202549a, qVar.f202549a) && Intrinsics.f(this.f202550b, qVar.f202550b) && Intrinsics.f(this.f202551c, qVar.f202551c);
    }

    public final int hashCode() {
        int iHashCode = this.f202549a.hashCode() * 31;
        TravelExperiencePreview travelExperiencePreview = this.f202550b;
        return this.f202551c.hashCode() + ((iHashCode + (travelExperiencePreview == null ? 0 : travelExperiencePreview.hashCode())) * 31);
    }
}
