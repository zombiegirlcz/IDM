package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LicenceType", "LicenceDuration", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step$LicenceDuration;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step$LicenceType;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LicenceFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step$LicenceDuration;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LicenceDuration extends LicenceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LicenceDuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Answer.LicenceType f75459a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LicenceDuration(Answer.LicenceType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LicenceDuration[i];
            }
        }

        public LicenceDuration(Answer.LicenceType licenceType) {
            Intrinsics.checkNotNullParameter(licenceType, "licenceType");
            this.f75459a = licenceType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LicenceDuration) && this.f75459a == ((LicenceDuration) obj2).f75459a;
        }

        public final int hashCode() {
            return this.f75459a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75459a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step$LicenceType;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/licence/LicenceFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LicenceType extends LicenceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LicenceType f75460a = new LicenceType();

        @NotNull
        public static final Parcelable.Creator<LicenceType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LicenceType.f75460a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LicenceType[i];
            }
        }

        private LicenceType() {
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

    private LicenceFlowContract$Step() {
    }
}
