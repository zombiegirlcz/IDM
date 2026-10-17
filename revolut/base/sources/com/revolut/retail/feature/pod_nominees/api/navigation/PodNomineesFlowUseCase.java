package com.revolut.retail.feature.pod_nominees.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase;", "Landroid/os/Parcelable;", "aek/b", "Profile", "Onboarding", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PodNomineesFlowUseCase extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase;", "LegacyOnboarding", "WorkflowOnboarding", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding$LegacyOnboarding;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding$WorkflowOnboarding;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Onboarding extends PodNomineesFlowUseCase {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding$LegacyOnboarding;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class LegacyOnboarding implements Onboarding {

            @NotNull
            public static final Parcelable.Creator<LegacyOnboarding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f102579a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LegacyOnboarding((b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LegacyOnboarding[i];
                }
            }

            public LegacyOnboarding(b countryCode) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f102579a = countryCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof LegacyOnboarding) && Intrinsics.f(this.f102579a, ((LegacyOnboarding) obj2).f102579a);
            }

            @Override // com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase.Onboarding
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF102581b() {
                return this.f102579a;
            }

            public final int hashCode() {
                return this.f102579a.f297794a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f102579a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding$WorkflowOnboarding;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Onboarding;", "Laek/b;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WorkflowOnboarding implements Onboarding, aek.b {

            @NotNull
            public static final Parcelable.Creator<WorkflowOnboarding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f102581b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WorkflowOnboarding(parcel.readString(), (b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WorkflowOnboarding[i];
                }
            }

            public WorkflowOnboarding(String workflowStepId, b countryCode) {
                Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f102580a = workflowStepId;
                this.f102581b = countryCode;
            }

            @Override // aek.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF102583a() {
                return this.f102580a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WorkflowOnboarding)) {
                    return false;
                }
                WorkflowOnboarding workflowOnboarding = (WorkflowOnboarding) obj2;
                return Intrinsics.f(this.f102580a, workflowOnboarding.f102580a) && Intrinsics.f(this.f102581b, workflowOnboarding.f102581b);
            }

            @Override // com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase.Onboarding
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF102581b() {
                return this.f102581b;
            }

            public final int hashCode() {
                return this.f102581b.f297794a.hashCode() + (this.f102580a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102580a);
                dest.writeSerializable(this.f102581b);
            }
        }

        /* JADX INFO: renamed from: getCountryCode */
        b getF102581b();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase;", "LegacyProfile", "WorkflowProfile", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile$LegacyProfile;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile$WorkflowProfile;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Profile extends PodNomineesFlowUseCase {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile$LegacyProfile;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile;", "<init>", "()V", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class LegacyProfile implements Profile {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LegacyProfile f102582a = new LegacyProfile();

            @NotNull
            public static final Parcelable.Creator<LegacyProfile> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LegacyProfile.f102582a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LegacyProfile[i];
                }
            }

            private LegacyProfile() {
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile$WorkflowProfile;", "Lcom/revolut/retail/feature/pod_nominees/api/navigation/PodNomineesFlowUseCase$Profile;", "Laek/b;", "", "toString", "()Ljava/lang/String;", "feature_pod_nominees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WorkflowProfile implements Profile, aek.b {

            @NotNull
            public static final Parcelable.Creator<WorkflowProfile> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102583a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WorkflowProfile(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WorkflowProfile[i];
                }
            }

            public WorkflowProfile(String workflowStepId) {
                Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
                this.f102583a = workflowStepId;
            }

            @Override // aek.b
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF102583a() {
                return this.f102583a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof WorkflowProfile) && Intrinsics.f(this.f102583a, ((WorkflowProfile) obj2).f102583a);
            }

            public final int hashCode() {
                return this.f102583a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102583a);
            }
        }
    }
}
