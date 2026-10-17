package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationTargetingOnboardingCta;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationTargetingOnboardingCta implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingCta> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84023b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPersonalisationTargetingOnboardingCta(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationTargetingOnboardingCta[i];
        }
    }

    public RevPointsPersonalisationTargetingOnboardingCta(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84022a = text;
        this.f84023b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationTargetingOnboardingCta)) {
            return false;
        }
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta = (RevPointsPersonalisationTargetingOnboardingCta) obj2;
        return Intrinsics.f(this.f84022a, revPointsPersonalisationTargetingOnboardingCta.f84022a) && Intrinsics.f(this.f84023b, revPointsPersonalisationTargetingOnboardingCta.f84023b);
    }

    public final int hashCode() {
        int iHashCode = this.f84022a.hashCode() * 31;
        String str = this.f84023b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84022a);
        dest.writeString(this.f84023b);
    }
}
