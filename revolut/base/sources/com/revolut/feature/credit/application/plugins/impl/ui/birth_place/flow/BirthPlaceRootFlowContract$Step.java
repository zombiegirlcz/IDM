package com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChooseCountry", "ChooseCity", "CountryPicker", "InitialCityPicker", "CityPicker", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$ChooseCity;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$ChooseCountry;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$CityPicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$CountryPicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$InitialCityPicker;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BirthPlaceRootFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$ChooseCity;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseCity extends BirthPlaceRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseCity f67167a = new ChooseCity();

        @NotNull
        public static final Parcelable.Creator<ChooseCity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseCity.f67167a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCity[i];
            }
        }

        private ChooseCity() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$ChooseCountry;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseCountry extends BirthPlaceRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseCountry f67168a = new ChooseCountry();

        @NotNull
        public static final Parcelable.Creator<ChooseCountry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseCountry.f67168a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseCountry[i];
            }
        }

        private ChooseCountry() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$CityPicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CityPicker extends BirthPlaceRootFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CityPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f67169a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CityPicker(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CityPicker[i];
            }
        }

        public CityPicker(String currentCity) {
            Intrinsics.checkNotNullParameter(currentCity, "currentCity");
            this.f67169a = currentCity;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CityPicker) && Intrinsics.f(this.f67169a, ((CityPicker) obj2).f67169a);
        }

        public final int hashCode() {
            return this.f67169a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67169a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$CountryPicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryPicker extends BirthPlaceRootFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f67170a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryPicker((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        public CountryPicker(b currentCountryCode) {
            Intrinsics.checkNotNullParameter(currentCountryCode, "currentCountryCode");
            this.f67170a = currentCountryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryPicker) && Intrinsics.f(this.f67170a, ((CountryPicker) obj2).f67170a);
        }

        public final int hashCode() {
            return this.f67170a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67170a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step$InitialCityPicker;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/birth_place/flow/BirthPlaceRootFlowContract$Step;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InitialCityPicker extends BirthPlaceRootFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialCityPicker f67171a = new InitialCityPicker();

        @NotNull
        public static final Parcelable.Creator<InitialCityPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InitialCityPicker.f67171a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InitialCityPicker[i];
            }
        }

        private InitialCityPicker() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof InitialCityPicker);
        }

        public final int hashCode() {
            return 892647103;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private BirthPlaceRootFlowContract$Step() {
    }
}
