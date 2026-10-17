package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationTargetingOnboardingStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationTargetingOnboardingStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84032c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPersonalisationTargetingOnboardingStep(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationTargetingOnboardingStep[i];
        }
    }

    public RevPointsPersonalisationTargetingOnboardingStep(String title, String subtitle, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f84030a = title;
        this.f84031b = subtitle;
        this.f84032c = icon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationTargetingOnboardingStep)) {
            return false;
        }
        RevPointsPersonalisationTargetingOnboardingStep revPointsPersonalisationTargetingOnboardingStep = (RevPointsPersonalisationTargetingOnboardingStep) obj2;
        return Intrinsics.f(this.f84030a, revPointsPersonalisationTargetingOnboardingStep.f84030a) && Intrinsics.f(this.f84031b, revPointsPersonalisationTargetingOnboardingStep.f84031b) && Intrinsics.f(this.f84032c, revPointsPersonalisationTargetingOnboardingStep.f84032c);
    }

    public final int hashCode() {
        return this.f84032c.hashCode() + p.a.c(this.f84030a.hashCode() * 31, 31, this.f84031b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84030a);
        dest.writeString(this.f84031b);
        dest.writeString(this.f84032c);
    }
}
