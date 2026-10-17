package com.revolut.feature.address.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.bumptech.glide.d;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import p.a;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002IJB·\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003J»\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010<\u001a\u00020=J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AHÖ\u0003J\t\u0010B\u001a\u00020=HÖ\u0001J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\u0016\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020=R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006K"}, d2 = {"Lcom/revolut/feature/address/models/Address;", "Lcom/revolut/feature/address/models/FormattedAddress;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "streetLine1", "", "streetLine2", "region", "city", "postcode", "country", "fullAddress", "streetType", "street", "houseNumber", "flat", "neighborhood", "houseName", "type", "Lcom/revolut/feature/address/models/Address$Type;", "landmark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revolut/feature/address/models/Address$Type;Ljava/lang/String;)V", "getStreetLine1", "()Ljava/lang/String;", "getStreetLine2", "getRegion", "getCity", "getPostcode", "getCountry", "getFullAddress", "getStreetType", "getStreet", "getHouseNumber", "getFlat", "getNeighborhood", "getHouseName", "getType", "()Lcom/revolut/feature/address/models/Address$Type;", "getLandmark", "format", "Lcom/revolut/feature/address/models/AddressFormat;", "getFormat", "()Lcom/revolut/feature/address/models/AddressFormat;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "Type", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Address implements FormattedAddress, Parcelable, Serializable {
    private final String city;

    @NotNull
    private final String country;
    private final String flat;
    private final String fullAddress;
    private final String houseName;
    private final String houseNumber;
    private final String landmark;
    private final String neighborhood;
    private final String postcode;
    private final String region;
    private final String street;
    private final String streetLine1;
    private final String streetLine2;
    private final String streetType;
    private final Type type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Address> CREATOR = new Creator();

    @NotNull
    private static final Address EMPTY = new Address(null, null, null, null, null, "", null, null, null, null, null, null, null, null, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/address/models/Address$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/revolut/feature/address/models/Address;", "getEMPTY", "()Lcom/revolut/feature/address/models/Address;", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Address getEMPTY() {
            return Address.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Address> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Address[] newArray(int i) {
            return new Address[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/address/models/Address$Type;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "OFFICE", "COWORKING", "HOME", "PRIVATE_MAILBOX", "OTHER", "Companion", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private final String key;
        public static final Type OFFICE = new Type("OFFICE", 0, "OFFICE");
        public static final Type COWORKING = new Type("COWORKING", 1, "COWORKING");
        public static final Type HOME = new Type("HOME", 2, "HOME");
        public static final Type PRIVATE_MAILBOX = new Type("PRIVATE_MAILBOX", 3, "PRIVATE_MAILBOX");
        public static final Type OTHER = new Type("OTHER", 4, "OTHER");

        /* JADX INFO: loaded from: classes20.dex */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/address/models/Address$Type$Companion;", "", "<init>", "()V", "fromString", "Lcom/revolut/feature/address/models/Address$Type;", "str", "", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromString(String str) {
                Object obj2 = null;
                if (str == null) {
                    return null;
                }
                Iterator<E> it8 = Type.getEntries().iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (a0.z(((Type) next).getKey(), str, true)) {
                        obj2 = next;
                        break;
                    }
                }
                return (Type) obj2;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{OFFICE, COWORKING, HOME, PRIVATE_MAILBOX, OTHER};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = s.n(typeArr$values);
            INSTANCE = new Companion(null);
        }

        private Type(String str, int i, String str2) {
            this.key = str2;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }
    }

    public Address(String str, String str2, String str3, String str4, String str5, @NotNull String country, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Type type, String str13) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.streetLine1 = str;
        this.streetLine2 = str2;
        this.region = str3;
        this.city = str4;
        this.postcode = str5;
        this.country = country;
        this.fullAddress = str6;
        this.streetType = str7;
        this.street = str8;
        this.houseNumber = str9;
        this.flat = str10;
        this.neighborhood = str11;
        this.houseName = str12;
        this.type = type;
        this.landmark = str13;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getFlat() {
        return this.flat;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getNeighborhood() {
        return this.neighborhood;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getHouseName() {
        return this.houseName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getLandmark() {
        return this.landmark;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStreetType() {
        return this.streetType;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    @NotNull
    public final Address copy(String streetLine1, String streetLine2, String region, String city, String postcode, @NotNull String country, String fullAddress, String streetType, String street, String houseNumber, String flat, String neighborhood, String houseName, Type type, String landmark) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new Address(streetLine1, streetLine2, region, city, postcode, country, fullAddress, streetType, street, houseNumber, flat, neighborhood, houseName, type, landmark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address address = (Address) other;
        return Intrinsics.f(this.streetLine1, address.streetLine1) && Intrinsics.f(this.streetLine2, address.streetLine2) && Intrinsics.f(this.region, address.region) && Intrinsics.f(this.city, address.city) && Intrinsics.f(this.postcode, address.postcode) && Intrinsics.f(this.country, address.country) && Intrinsics.f(this.fullAddress, address.fullAddress) && Intrinsics.f(this.streetType, address.streetType) && Intrinsics.f(this.street, address.street) && Intrinsics.f(this.houseNumber, address.houseNumber) && Intrinsics.f(this.flat, address.flat) && Intrinsics.f(this.neighborhood, address.neighborhood) && Intrinsics.f(this.houseName, address.houseName) && this.type == address.type && Intrinsics.f(this.landmark, address.landmark);
    }

    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final String getFlat() {
        return this.flat;
    }

    @Override // com.revolut.feature.address.models.FormattedAddress
    @NotNull
    public AddressFormat getFormat() {
        return CountryExtKt.toAddressFormat(d.c(this.country));
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final String getHouseName() {
        return this.houseName;
    }

    public final String getHouseNumber() {
        return this.houseNumber;
    }

    public final String getLandmark() {
        return this.landmark;
    }

    public final String getNeighborhood() {
        return this.neighborhood;
    }

    public final String getPostcode() {
        return this.postcode;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getStreetLine1() {
        return this.streetLine1;
    }

    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final String getStreetType() {
        return this.streetType;
    }

    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.streetLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postcode;
        int iC = a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.country);
        String str6 = this.fullAddress;
        int iHashCode5 = (iC + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.streetType;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.street;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.houseNumber;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.flat;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.neighborhood;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.houseName;
        int iHashCode11 = (iHashCode10 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Type type = this.type;
        int iHashCode12 = (iHashCode11 + (type == null ? 0 : type.hashCode())) * 31;
        String str13 = this.landmark;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.streetLine1);
        dest.writeString(this.streetLine2);
        dest.writeString(this.region);
        dest.writeString(this.city);
        dest.writeString(this.postcode);
        dest.writeString(this.country);
        dest.writeString(this.fullAddress);
        dest.writeString(this.streetType);
        dest.writeString(this.street);
        dest.writeString(this.houseNumber);
        dest.writeString(this.flat);
        dest.writeString(this.neighborhood);
        dest.writeString(this.houseName);
        Type type = this.type;
        if (type == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(type.name());
        }
        dest.writeString(this.landmark);
    }

    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Type type, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : type, (i & 16384) != 0 ? null : str14);
    }
}
