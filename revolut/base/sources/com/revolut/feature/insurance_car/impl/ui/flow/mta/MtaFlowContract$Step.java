package com.revolut.feature.insurance_car.impl.ui.flow.mta;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CarType", "SelectCar", "ViewDriver", "DriverType", "DriverDetails", "Eligibility", "Licence", "SelectDate", "Review", "ProofOfDrivingNumber", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$CarType;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$DriverDetails;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$DriverType;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Eligibility;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Licence;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$ProofOfDrivingNumber;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Review;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$SelectCar;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$SelectDate;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$ViewDriver;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MtaFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$CarType;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CarType extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CarType f75368a = new CarType();

        @NotNull
        public static final Parcelable.Creator<CarType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CarType.f75368a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CarType[i];
            }
        }

        private CarType() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$DriverDetails;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DriverDetails extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DriverDetails f75369a = new DriverDetails();

        @NotNull
        public static final Parcelable.Creator<DriverDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DriverDetails.f75369a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DriverDetails[i];
            }
        }

        private DriverDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$DriverType;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DriverType extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DriverType f75370a = new DriverType();

        @NotNull
        public static final Parcelable.Creator<DriverType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DriverType.f75370a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DriverType[i];
            }
        }

        private DriverType() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Eligibility;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Eligibility extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Eligibility f75371a = new Eligibility();

        @NotNull
        public static final Parcelable.Creator<Eligibility> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Eligibility.f75371a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Eligibility[i];
            }
        }

        private Eligibility() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Licence;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Licence extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Licence f75372a = new Licence();

        @NotNull
        public static final Parcelable.Creator<Licence> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Licence.f75372a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Licence[i];
            }
        }

        private Licence() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$ProofOfDrivingNumber;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProofOfDrivingNumber extends MtaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProofOfDrivingNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f75373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MtaCreateResult f75374b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProofOfDrivingNumber(parcel.readString(), (MtaCreateResult) parcel.readParcelable(ProofOfDrivingNumber.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProofOfDrivingNumber[i];
            }
        }

        public ProofOfDrivingNumber(String applicationId, MtaCreateResult mtaCreateResult) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(mtaCreateResult, "mtaCreateResult");
            this.f75373a = applicationId;
            this.f75374b = mtaCreateResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProofOfDrivingNumber)) {
                return false;
            }
            ProofOfDrivingNumber proofOfDrivingNumber = (ProofOfDrivingNumber) obj2;
            return Intrinsics.f(this.f75373a, proofOfDrivingNumber.f75373a) && Intrinsics.f(this.f75374b, proofOfDrivingNumber.f75374b);
        }

        public final int hashCode() {
            return this.f75374b.hashCode() + (this.f75373a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f75373a);
            dest.writeParcelable(this.f75374b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$Review;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends MtaFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MtaCreateResult f75375a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review((MtaCreateResult) parcel.readParcelable(Review.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(MtaCreateResult mtaCreateResult) {
            Intrinsics.checkNotNullParameter(mtaCreateResult, "mtaCreateResult");
            this.f75375a = mtaCreateResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f75375a, ((Review) obj2).f75375a);
        }

        public final int hashCode() {
            return this.f75375a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f75375a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$SelectCar;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectCar extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectCar f75376a = new SelectCar();

        @NotNull
        public static final Parcelable.Creator<SelectCar> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectCar.f75376a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCar[i];
            }
        }

        private SelectCar() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$SelectDate;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectDate extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectDate f75377a = new SelectDate();

        @NotNull
        public static final Parcelable.Creator<SelectDate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectDate.f75377a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectDate[i];
            }
        }

        private SelectDate() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step$ViewDriver;", "Lcom/revolut/feature/insurance_car/impl/ui/flow/mta/MtaFlowContract$Step;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ViewDriver extends MtaFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ViewDriver f75378a = new ViewDriver();

        @NotNull
        public static final Parcelable.Creator<ViewDriver> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ViewDriver.f75378a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewDriver[i];
            }
        }

        private ViewDriver() {
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

    private MtaFlowContract$Step() {
    }
}
