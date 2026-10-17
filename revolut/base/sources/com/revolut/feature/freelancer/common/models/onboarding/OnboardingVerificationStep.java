package com.revolut.feature.freelancer.common.models.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep;", "Landroid/os/Parcelable;", "<init>", "()V", "UrlSpecification", "ActivityProof", "Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep$ActivityProof;", "Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep$UrlSpecification;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingVerificationStep implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep$ActivityProof;", "Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivityProof extends OnboardingVerificationStep {

        @NotNull
        public static final Parcelable.Creator<ActivityProof> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73447b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivityProof(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivityProof[i];
            }
        }

        public ActivityProof(String verificationType, String formId) {
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            Intrinsics.checkNotNullParameter(formId, "formId");
            this.f73446a = verificationType;
            this.f73447b = formId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActivityProof)) {
                return false;
            }
            ActivityProof activityProof = (ActivityProof) obj2;
            return Intrinsics.f(this.f73446a, activityProof.f73446a) && Intrinsics.f(this.f73447b, activityProof.f73447b);
        }

        public final int hashCode() {
            return this.f73447b.hashCode() + (this.f73446a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73446a);
            dest.writeString(this.f73447b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep$UrlSpecification;", "Lcom/revolut/feature/freelancer/common/models/onboarding/OnboardingVerificationStep;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UrlSpecification extends OnboardingVerificationStep {

        @NotNull
        public static final Parcelable.Creator<UrlSpecification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f73449b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UrlSpecification(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UrlSpecification[i];
            }
        }

        public UrlSpecification(String verificationType, boolean z) {
            Intrinsics.checkNotNullParameter(verificationType, "verificationType");
            this.f73448a = verificationType;
            this.f73449b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UrlSpecification)) {
                return false;
            }
            UrlSpecification urlSpecification = (UrlSpecification) obj2;
            return Intrinsics.f(this.f73448a, urlSpecification.f73448a) && this.f73449b == urlSpecification.f73449b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73449b) + (this.f73448a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73448a);
            dest.writeInt(this.f73449b ? 1 : 0);
        }
    }

    private OnboardingVerificationStep() {
    }
}
