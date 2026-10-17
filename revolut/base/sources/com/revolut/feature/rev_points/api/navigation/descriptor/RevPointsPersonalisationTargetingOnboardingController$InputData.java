package com.revolut.feature.rev_points.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/api/navigation/descriptor/RevPointsPersonalisationTargetingOnboardingController$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationTargetingOnboardingController$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingController$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingPrompt f83545a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPersonalisationTargetingOnboardingController$InputData((RevPointsPersonalisationTargetingOnboardingPrompt) parcel.readParcelable(RevPointsPersonalisationTargetingOnboardingController$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationTargetingOnboardingController$InputData[i];
        }
    }

    public RevPointsPersonalisationTargetingOnboardingController$InputData(RevPointsPersonalisationTargetingOnboardingPrompt prompt) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f83545a = prompt;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final RevPointsPersonalisationTargetingOnboardingPrompt getF83545a() {
        return this.f83545a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPointsPersonalisationTargetingOnboardingController$InputData) && Intrinsics.f(this.f83545a, ((RevPointsPersonalisationTargetingOnboardingController$InputData) obj2).f83545a);
    }

    public final int hashCode() {
        return this.f83545a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83545a, i);
    }
}
