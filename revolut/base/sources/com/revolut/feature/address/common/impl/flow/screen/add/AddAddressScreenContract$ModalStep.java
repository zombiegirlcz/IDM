package com.revolut.feature.address.common.impl.flow.screen.add;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.common.impl.flow.screen.find.AddressSearchScreenContract$LocationSearchMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import ei1.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PostCodeSearch", "AddressSearch", "LocationPermission", "CountryPicker", "RegionPicker", "MunicipalitiesPicker", "FieldSearch", "StreetTypePicker", "AddressTypePicker", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$AddressSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$AddressTypePicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$FieldSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$LocationPermission;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$MunicipalitiesPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$PostCodeSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$RegionPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$StreetTypePicker;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddAddressScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$AddressSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressSearch extends AddAddressScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddressSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddressSearchScreenContract$LocationSearchMode f60992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressSearch((AddressSearchScreenContract$LocationSearchMode) parcel.readParcelable(AddressSearch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressSearch[i];
            }
        }

        public AddressSearch(AddressSearchScreenContract$LocationSearchMode locationSearchMode) {
            Intrinsics.checkNotNullParameter(locationSearchMode, "locationSearchMode");
            this.f60992a = locationSearchMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddressSearch) && Intrinsics.f(this.f60992a, ((AddressSearch) obj2).f60992a);
        }

        public final int hashCode() {
            return this.f60992a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60992a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$AddressTypePicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressTypePicker extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressTypePicker f60993a = new AddressTypePicker();

        @NotNull
        public static final Parcelable.Creator<AddressTypePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressTypePicker.f60993a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressTypePicker[i];
            }
        }

        private AddressTypePicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$CountryPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryPicker extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryPicker f60994a = new CountryPicker();

        @NotNull
        public static final Parcelable.Creator<CountryPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryPicker.f60994a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryPicker[i];
            }
        }

        private CountryPicker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$FieldSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldSearch extends AddAddressScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<FieldSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n f60995a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FieldSearch(n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FieldSearch[i];
            }
        }

        public FieldSearch(n searchType) {
            Intrinsics.checkNotNullParameter(searchType, "searchType");
            this.f60995a = searchType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FieldSearch) && this.f60995a == ((FieldSearch) obj2).f60995a;
        }

        public final int hashCode() {
            return this.f60995a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60995a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$LocationPermission;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LocationPermission extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LocationPermission f60996a = new LocationPermission();

        @NotNull
        public static final Parcelable.Creator<LocationPermission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LocationPermission.f60996a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationPermission[i];
            }
        }

        private LocationPermission() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$MunicipalitiesPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final class MunicipalitiesPicker extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MunicipalitiesPicker f60997a = new MunicipalitiesPicker();

        @NotNull
        public static final Parcelable.Creator<MunicipalitiesPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MunicipalitiesPicker.f60997a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MunicipalitiesPicker[i];
            }
        }

        private MunicipalitiesPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$PostCodeSearch;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PostCodeSearch extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PostCodeSearch f60998a = new PostCodeSearch();

        @NotNull
        public static final Parcelable.Creator<PostCodeSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PostCodeSearch.f60998a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostCodeSearch[i];
            }
        }

        private PostCodeSearch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$RegionPicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RegionPicker extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RegionPicker f60999a = new RegionPicker();

        @NotNull
        public static final Parcelable.Creator<RegionPicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RegionPicker.f60999a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegionPicker[i];
            }
        }

        private RegionPicker() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep$StreetTypePicker;", "Lcom/revolut/feature/address/common/impl/flow/screen/add/AddAddressScreenContract$ModalStep;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreetTypePicker extends AddAddressScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StreetTypePicker f61000a = new StreetTypePicker();

        @NotNull
        public static final Parcelable.Creator<StreetTypePicker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StreetTypePicker.f61000a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetTypePicker[i];
            }
        }

        private StreetTypePicker() {
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

    private AddAddressScreenContract$ModalStep() {
    }
}
