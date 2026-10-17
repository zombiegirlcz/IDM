package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.claims;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ClaimsCount", "WindscreenClaimsCount", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step$ClaimsCount;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step$WindscreenClaimsCount;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ClaimsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step$ClaimsCount;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ClaimsCount extends ClaimsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ClaimsCount f75444a = new ClaimsCount();

        @NotNull
        public static final Parcelable.Creator<ClaimsCount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ClaimsCount.f75444a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimsCount[i];
            }
        }

        private ClaimsCount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step$WindscreenClaimsCount;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/claims/ClaimsFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WindscreenClaimsCount extends ClaimsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WindscreenClaimsCount f75445a = new WindscreenClaimsCount();

        @NotNull
        public static final Parcelable.Creator<WindscreenClaimsCount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WindscreenClaimsCount.f75445a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WindscreenClaimsCount[i];
            }
        }

        private WindscreenClaimsCount() {
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

    private ClaimsFlowContract$Step() {
    }
}
