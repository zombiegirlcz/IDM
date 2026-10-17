package com.revolut.feature.insurance_car.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Home", "com/revolut/feature/insurance_car/api/navigation/a", "HomeDestination", "OnboardingDestination", "PolicyDestination", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$Home;", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InsuranceCarFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$HomeDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HomeDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HomeDestination f75152a = new HomeDestination();

        @NotNull
        public static final Parcelable.Creator<HomeDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HomeDestination.f75152a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HomeDestination[i];
            }
        }

        private HomeDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$OnboardingDestination;", "", "<init>", "()V", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OnboardingDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnboardingDestination f75153a = new OnboardingDestination();

        @NotNull
        public static final Parcelable.Creator<OnboardingDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OnboardingDestination.f75153a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingDestination[i];
            }
        }

        private OnboardingDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination;", "", "", "toString", "()Ljava/lang/String;", "Step", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PolicyDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<PolicyDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Step f75155b;

        /* JADX INFO: loaded from: classes4.dex */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step;", "Landroid/os/Parcelable;", "<init>", "()V", "TelematicsDeviceDelivery", "DocumentsRequested", "SmartDriving", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$DocumentsRequested;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$SmartDriving;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$TelematicsDeviceDelivery;", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class Step implements Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$DocumentsRequested;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step;", "<init>", "()V", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DocumentsRequested extends Step {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final DocumentsRequested f75156a = new DocumentsRequested();

                @NotNull
                public static final Parcelable.Creator<DocumentsRequested> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return DocumentsRequested.f75156a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DocumentsRequested[i];
                    }
                }

                private DocumentsRequested() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$SmartDriving;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step;", "<init>", "()V", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class SmartDriving extends Step {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final SmartDriving f75157a = new SmartDriving();

                @NotNull
                public static final Parcelable.Creator<SmartDriving> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return SmartDriving.f75157a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SmartDriving[i];
                    }
                }

                private SmartDriving() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step$TelematicsDeviceDelivery;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$PolicyDestination$Step;", "<init>", "()V", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class TelematicsDeviceDelivery extends Step {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final TelematicsDeviceDelivery f75158a = new TelematicsDeviceDelivery();

                @NotNull
                public static final Parcelable.Creator<TelematicsDeviceDelivery> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return TelematicsDeviceDelivery.f75158a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new TelematicsDeviceDelivery[i];
                    }
                }

                private TelematicsDeviceDelivery() {
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

            private Step() {
            }
        }

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PolicyDestination(parcel.readString(), (Step) parcel.readParcelable(PolicyDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PolicyDestination[i];
            }
        }

        public PolicyDestination(String policyId, Step step) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f75154a = policyId;
            this.f75155b = step;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PolicyDestination)) {
                return false;
            }
            PolicyDestination policyDestination = (PolicyDestination) obj2;
            return Intrinsics.f(this.f75154a, policyDestination.f75154a) && Intrinsics.f(this.f75155b, policyDestination.f75155b);
        }

        public final int hashCode() {
            int iHashCode = this.f75154a.hashCode() * 31;
            Step step = this.f75155b;
            return iHashCode + (step == null ? 0 : step.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75154a);
            dest.writeParcelable(this.f75155b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig$Home;", "Lcom/revolut/feature/insurance_car/api/navigation/InsuranceCarFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Home extends InsuranceCarFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Home> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f75151g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Home((ActivityAnimation) parcel.readParcelable(Home.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Home[i];
            }
        }

        public Home(ActivityAnimation activityAnimation) {
            super(activityAnimation, HomeDestination.f75152a, false, null, 0, 60);
            this.f75151g = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF78199g() {
            return this.f75151g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Home) && Intrinsics.f(this.f75151g, ((Home) obj2).f75151g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f75151g;
            if (activityAnimation == null) {
                return 0;
            }
            return activityAnimation.hashCode();
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75151g, i);
        }

        public Home() {
            this(null);
        }
    }
}
