package com.revolut.feature.address.common.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"com/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId", "Landroid/os/Parcelable;", "Country", "AddressLine1", "AddressLine2", "StreetType", "StreetName", "HouseNumber", "HouseName", "FlatNumber", "Postcode", "Neighbourhood", "City", "Region", "AddressType", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressLine1;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressLine2;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressType;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$City;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Country;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$FlatNumber;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$HouseName;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$HouseNumber;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Neighbourhood;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Postcode;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Region;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$StreetName;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$StreetType;", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddressConfiguration$FieldId implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressLine1;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressLine1 extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressLine1 f61043a = new AddressLine1();

        @NotNull
        public static final Parcelable.Creator<AddressLine1> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressLine1.f61043a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressLine1[i];
            }
        }

        private AddressLine1() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressLine2;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressLine2 extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressLine2 f61044a = new AddressLine2();

        @NotNull
        public static final Parcelable.Creator<AddressLine2> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressLine2.f61044a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressLine2[i];
            }
        }

        private AddressLine2() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$AddressType;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddressType extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddressType f61045a = new AddressType();

        @NotNull
        public static final Parcelable.Creator<AddressType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddressType.f61045a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressType[i];
            }
        }

        private AddressType() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$City;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class City extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final City f61046a = new City();

        @NotNull
        public static final Parcelable.Creator<City> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return City.f61046a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new City[i];
            }
        }

        private City() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Country;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Country extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Country f61047a = new Country();

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Country.f61047a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        private Country() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$FlatNumber;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FlatNumber extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FlatNumber f61048a = new FlatNumber();

        @NotNull
        public static final Parcelable.Creator<FlatNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FlatNumber.f61048a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlatNumber[i];
            }
        }

        private FlatNumber() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$HouseName;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HouseName extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HouseName f61049a = new HouseName();

        @NotNull
        public static final Parcelable.Creator<HouseName> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HouseName.f61049a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HouseName[i];
            }
        }

        private HouseName() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$HouseNumber;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HouseNumber extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HouseNumber f61050a = new HouseNumber();

        @NotNull
        public static final Parcelable.Creator<HouseNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HouseNumber.f61050a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HouseNumber[i];
            }
        }

        private HouseNumber() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Neighbourhood;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Neighbourhood extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Neighbourhood f61051a = new Neighbourhood();

        @NotNull
        public static final Parcelable.Creator<Neighbourhood> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Neighbourhood.f61051a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Neighbourhood[i];
            }
        }

        private Neighbourhood() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Postcode;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Postcode extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Postcode f61052a = new Postcode();

        @NotNull
        public static final Parcelable.Creator<Postcode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Postcode.f61052a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Postcode[i];
            }
        }

        private Postcode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$Region;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Region extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Region f61053a = new Region();

        @NotNull
        public static final Parcelable.Creator<Region> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Region.f61053a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Region[i];
            }
        }

        private Region() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$StreetName;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreetName extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StreetName f61054a = new StreetName();

        @NotNull
        public static final Parcelable.Creator<StreetName> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StreetName.f61054a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetName[i];
            }
        }

        private StreetName() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId$StreetType;", "Lcom/revolut/feature/address/common/impl/models/AddressConfiguration$FieldId;", "<init>", "()V", "feature_address_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StreetType extends AddressConfiguration$FieldId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final StreetType f61055a = new StreetType();

        @NotNull
        public static final Parcelable.Creator<StreetType> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return StreetType.f61055a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StreetType[i];
            }
        }

        private StreetType() {
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
}
