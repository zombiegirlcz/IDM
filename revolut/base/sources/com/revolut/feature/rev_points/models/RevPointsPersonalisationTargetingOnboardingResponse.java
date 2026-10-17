package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m1c.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationTargetingOnboardingResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationTargetingOnboardingResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f84028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingPrompt f84029b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPersonalisationTargetingOnboardingResponse(z0.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RevPointsPersonalisationTargetingOnboardingPrompt.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationTargetingOnboardingResponse[i];
        }
    }

    public RevPointsPersonalisationTargetingOnboardingResponse(z0 status, RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f84028a = status;
        this.f84029b = revPointsPersonalisationTargetingOnboardingPrompt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationTargetingOnboardingResponse)) {
            return false;
        }
        RevPointsPersonalisationTargetingOnboardingResponse revPointsPersonalisationTargetingOnboardingResponse = (RevPointsPersonalisationTargetingOnboardingResponse) obj2;
        return this.f84028a == revPointsPersonalisationTargetingOnboardingResponse.f84028a && Intrinsics.f(this.f84029b, revPointsPersonalisationTargetingOnboardingResponse.f84029b);
    }

    public final int hashCode() {
        int iHashCode = this.f84028a.hashCode() * 31;
        RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt = this.f84029b;
        return iHashCode + (revPointsPersonalisationTargetingOnboardingPrompt == null ? 0 : revPointsPersonalisationTargetingOnboardingPrompt.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84028a.name());
        RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt = this.f84029b;
        if (revPointsPersonalisationTargetingOnboardingPrompt == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsPersonalisationTargetingOnboardingPrompt.writeToParcel(dest, i);
        }
    }
}
