package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.ApplicationForm;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Application", "RenewalPolicy", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData$Application;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData$RenewalPolicy;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MotorPlanSelectorScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData$Application;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Application extends MotorPlanSelectorScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Application> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f75607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f75608c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Application(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Application[i];
            }
        }

        public Application(String applicationFormId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
            this.f75606a = applicationFormId;
            this.f75607b = z;
            this.f75608c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Application)) {
                return false;
            }
            Application application = (Application) obj2;
            return Intrinsics.f(this.f75606a, application.f75606a) && this.f75607b == application.f75607b && this.f75608c == application.f75608c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f75608c) + j6.a.c(this.f75606a.hashCode() * 31, 31, this.f75607b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75606a);
            dest.writeInt(this.f75607b ? 1 : 0);
            dest.writeInt(this.f75608c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData$RenewalPolicy;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_selection/MotorPlanSelectorScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenewalPolicy extends MotorPlanSelectorScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RenewalPolicy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ApplicationForm f75610b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenewalPolicy(parcel.readString(), ApplicationForm.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenewalPolicy[i];
            }
        }

        public RenewalPolicy(String policyId, ApplicationForm applicationForm) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            Intrinsics.checkNotNullParameter(applicationForm, "applicationForm");
            this.f75609a = policyId;
            this.f75610b = applicationForm;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RenewalPolicy)) {
                return false;
            }
            RenewalPolicy renewalPolicy = (RenewalPolicy) obj2;
            return Intrinsics.f(this.f75609a, renewalPolicy.f75609a) && Intrinsics.f(this.f75610b, renewalPolicy.f75610b);
        }

        public final int hashCode() {
            return this.f75610b.hashCode() + (this.f75609a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75609a);
            this.f75610b.writeToParcel(dest, i);
        }
    }

    private MotorPlanSelectorScreenContract$InputData() {
    }
}
