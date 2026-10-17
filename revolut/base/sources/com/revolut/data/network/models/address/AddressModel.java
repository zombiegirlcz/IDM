package com.revolut.data.network.models.address;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006,"}, d2 = {"Lcom/revolut/data/network/models/address/AddressModel;", "Ljava/io/Serializable;", "streetLine1", "", "streetLine2", "streetName", "houseNumber", "region", "city", "postcode", "country", "fullAddress", "neighborhood", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStreetLine1", "()Ljava/lang/String;", "getStreetLine2", "getStreetName", "getHouseNumber", "getRegion", "getCity", "getPostcode", "getCountry", "getFullAddress", "getNeighborhood", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "", "hashCode", "", "toString", "retail_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressModel implements Serializable {

    @b("city")
    private final String city;

    @b("country")
    @NotNull
    private final String country;

    @b("fullAddress")
    private final String fullAddress;

    @b("houseNumber")
    private final String houseNumber;

    @b("neighborhood")
    private final String neighborhood;

    @b("postcode")
    private final String postcode;

    @b("region")
    private final String region;

    @b("streetLine1")
    private final String streetLine1;

    @b("streetLine2")
    private final String streetLine2;

    @b("streetName")
    private final String streetName;

    public AddressModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, @NotNull String country, String str8, String str9) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.streetLine1 = str;
        this.streetLine2 = str2;
        this.streetName = str3;
        this.houseNumber = str4;
        this.region = str5;
        this.city = str6;
        this.postcode = str7;
        this.country = country;
        this.fullAddress = str8;
        this.neighborhood = str9;
    }

    public static /* synthetic */ AddressModel copy$default(AddressModel addressModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = addressModel.streetLine1;
        }
        if ((i & 2) != 0) {
            str2 = addressModel.streetLine2;
        }
        if ((i & 4) != 0) {
            str3 = addressModel.streetName;
        }
        if ((i & 8) != 0) {
            str4 = addressModel.houseNumber;
        }
        if ((i & 16) != 0) {
            str5 = addressModel.region;
        }
        if ((i & 32) != 0) {
            str6 = addressModel.city;
        }
        if ((i & 64) != 0) {
            str7 = addressModel.postcode;
        }
        if ((i & 128) != 0) {
            str8 = addressModel.country;
        }
        if ((i & 256) != 0) {
            str9 = addressModel.fullAddress;
        }
        if ((i & 512) != 0) {
            str10 = addressModel.neighborhood;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return addressModel.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStreetLine1() {
        return this.streetLine1;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNeighborhood() {
        return this.neighborhood;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStreetLine2() {
        return this.streetLine2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStreetName() {
        return this.streetName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHouseNumber() {
        return this.houseNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPostcode() {
        return this.postcode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFullAddress() {
        return this.fullAddress;
    }

    @NotNull
    public final AddressModel copy(String streetLine1, String streetLine2, String streetName, String houseNumber, String region, String city, String postcode, @NotNull String country, String fullAddress, String neighborhood) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new AddressModel(streetLine1, streetLine2, streetName, houseNumber, region, city, postcode, country, fullAddress, neighborhood);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressModel)) {
            return false;
        }
        AddressModel addressModel = (AddressModel) other;
        return Intrinsics.f(this.streetLine1, addressModel.streetLine1) && Intrinsics.f(this.streetLine2, addressModel.streetLine2) && Intrinsics.f(this.streetName, addressModel.streetName) && Intrinsics.f(this.houseNumber, addressModel.houseNumber) && Intrinsics.f(this.region, addressModel.region) && Intrinsics.f(this.city, addressModel.city) && Intrinsics.f(this.postcode, addressModel.postcode) && Intrinsics.f(this.country, addressModel.country) && Intrinsics.f(this.fullAddress, addressModel.fullAddress) && Intrinsics.f(this.neighborhood, addressModel.neighborhood);
    }

    public final String getCity() {
        return this.city;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final String getHouseNumber() {
        return this.houseNumber;
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

    public final String getStreetLine1() {
        return this.streetLine1;
    }

    public final String getStreetLine2() {
        return this.streetLine2;
    }

    public final String getStreetName() {
        return this.streetName;
    }

    public int hashCode() {
        String str = this.streetLine1;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.streetLine2;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.streetName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.houseNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.region;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postcode;
        int iC = a.c((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.country);
        String str8 = this.fullAddress;
        int iHashCode7 = (iC + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.neighborhood;
        return iHashCode7 + (str9 != null ? str9.hashCode() : 0);
    }
}
