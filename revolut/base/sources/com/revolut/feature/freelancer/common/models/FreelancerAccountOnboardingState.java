package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState;", "Landroid/os/Parcelable;", "<init>", "()V", "Onboarded", "NotOnboarded", "Pending", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$NotOnboarded;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$Onboarded;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$Pending;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerAccountOnboardingState implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$NotOnboarded;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState;", "<init>", "()V", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotOnboarded extends FreelancerAccountOnboardingState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotOnboarded f73272a = new NotOnboarded();

        @NotNull
        public static final Parcelable.Creator<NotOnboarded> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotOnboarded.f73272a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotOnboarded[i];
            }
        }

        private NotOnboarded() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$Onboarded;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Onboarded extends FreelancerAccountOnboardingState {

        @NotNull
        public static final Parcelable.Creator<Onboarded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FreelancerAccountDetails f73273a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Onboarded(FreelancerAccountDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Onboarded[i];
            }
        }

        public Onboarded(FreelancerAccountDetails accountDetails) {
            Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
            this.f73273a = accountDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Onboarded) && Intrinsics.f(this.f73273a, ((Onboarded) obj2).f73273a);
        }

        public final int hashCode() {
            return this.f73273a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f73273a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState$Pending;", "Lcom/revolut/feature/freelancer/common/models/FreelancerAccountOnboardingState;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pending extends FreelancerAccountOnboardingState {

        @NotNull
        public static final Parcelable.Creator<Pending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f73274a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pending(u.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pending[i];
            }
        }

        public Pending(u reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f73274a = reason;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pending) && this.f73274a == ((Pending) obj2).f73274a;
        }

        public final int hashCode() {
            return this.f73274a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73274a.name());
        }
    }

    private FreelancerAccountOnboardingState() {
    }
}
