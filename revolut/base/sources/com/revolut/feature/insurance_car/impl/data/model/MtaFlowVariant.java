package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "Landroid/os/Parcelable;", "AddDriver", "ReplaceCar", "AddTemporaryCar", "UpdateLicence", "ViewDriver", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$AddDriver;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$AddTemporaryCar;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$ReplaceCar;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$UpdateLicence;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$ViewDriver;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MtaFlowVariant extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$AddDriver;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddDriver implements MtaFlowVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddDriver f75251a = new AddDriver();

        @NotNull
        public static final Parcelable.Creator<AddDriver> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddDriver.f75251a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddDriver[i];
            }
        }

        private AddDriver() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$AddTemporaryCar;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddTemporaryCar implements MtaFlowVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddTemporaryCar f75252a = new AddTemporaryCar();

        @NotNull
        public static final Parcelable.Creator<AddTemporaryCar> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddTemporaryCar.f75252a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddTemporaryCar[i];
            }
        }

        private AddTemporaryCar() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$ReplaceCar;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReplaceCar implements MtaFlowVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReplaceCar f75253a = new ReplaceCar();

        @NotNull
        public static final Parcelable.Creator<ReplaceCar> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReplaceCar.f75253a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReplaceCar[i];
            }
        }

        private ReplaceCar() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$UpdateLicence;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "<init>", "()V", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateLicence implements MtaFlowVariant {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateLicence f75254a = new UpdateLicence();

        @NotNull
        public static final Parcelable.Creator<UpdateLicence> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateLicence.f75254a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateLicence[i];
            }
        }

        private UpdateLicence() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant$ViewDriver;", "Lcom/revolut/feature/insurance_car/impl/data/model/MtaFlowVariant;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewDriver implements MtaFlowVariant {

        @NotNull
        public static final Parcelable.Creator<ViewDriver> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalDriver f75255a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewDriver(AdditionalDriver.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewDriver[i];
            }
        }

        public ViewDriver(AdditionalDriver driver) {
            Intrinsics.checkNotNullParameter(driver, "driver");
            this.f75255a = driver;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ViewDriver) && Intrinsics.f(this.f75255a, ((ViewDriver) obj2).f75255a);
        }

        public final int hashCode() {
            return this.f75255a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f75255a.writeToParcel(dest, i);
        }
    }
}
