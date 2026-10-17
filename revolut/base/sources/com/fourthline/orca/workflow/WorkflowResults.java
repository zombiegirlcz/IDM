package com.fourthline.orca.workflow;

import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import com.fourthline.core.Gender;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.nfc.NfcAuthenticationChecks;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults;", "", "IDV", "Component", "Lcom/fourthline/orca/workflow/WorkflowResults$Component;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface WorkflowResults {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/orca/workflow/WorkflowResults;", "Document", "SecondaryDocument", "Attachment", "Selfie", "Nfc", "DocumentVideo", "SelfieVideo", "Address", "Person", "Geolocation", "DeviceMetadata", "TaxInfo", "Contacts", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface IDV extends WorkflowResults {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJZ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\u000e¨\u0006/"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "street", "", "streetNumber", "streetNumberSuffix", "postalCode", "city", "countryCode", "region", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Address;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStreet", "b", "I", "getStreetNumber", "c", "getStreetNumberSuffix", "d", "getPostalCode", "e", "getCity", "f", "getCountryCode", "g", "getRegion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Address implements IDV {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String street;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final int streetNumber;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String streetNumberSuffix;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String postalCode;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String city;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String countryCode;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final String region;

            public Address(@NotNull String street, int i, String str, @NotNull String postalCode, @NotNull String city, @NotNull String countryCode, String str2) {
                Intrinsics.checkNotNullParameter(street, "street");
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.street = street;
                this.streetNumber = i;
                this.streetNumberSuffix = str;
                this.postalCode = postalCode;
                this.city = city;
                this.countryCode = countryCode;
                this.region = str2;
            }

            public static /* synthetic */ Address copy$default(Address address, String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    str = address.street;
                }
                if ((i2 & 2) != 0) {
                    i = address.streetNumber;
                }
                if ((i2 & 4) != 0) {
                    str2 = address.streetNumberSuffix;
                }
                if ((i2 & 8) != 0) {
                    str3 = address.postalCode;
                }
                if ((i2 & 16) != 0) {
                    str4 = address.city;
                }
                if ((i2 & 32) != 0) {
                    str5 = address.countryCode;
                }
                if ((i2 & 64) != 0) {
                    str6 = address.region;
                }
                String str7 = str5;
                String str8 = str6;
                String str9 = str4;
                String str10 = str2;
                return address.copy(str, i, str10, str3, str9, str7, str8);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getStreet() {
                return this.street;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final int getStreetNumber() {
                return this.streetNumber;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getStreetNumberSuffix() {
                return this.streetNumberSuffix;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getPostalCode() {
                return this.postalCode;
            }

            @NotNull
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getCity() {
                return this.city;
            }

            @NotNull
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getCountryCode() {
                return this.countryCode;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getRegion() {
                return this.region;
            }

            @NotNull
            public final Address copy(@NotNull String street, int streetNumber, String streetNumberSuffix, @NotNull String postalCode, @NotNull String city, @NotNull String countryCode, String region) {
                Intrinsics.checkNotNullParameter(street, "street");
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                Intrinsics.checkNotNullParameter(city, "city");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return new Address(street, streetNumber, streetNumberSuffix, postalCode, city, countryCode, region);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Address)) {
                    return false;
                }
                Address address = (Address) other;
                return Intrinsics.f(this.street, address.street) && this.streetNumber == address.streetNumber && Intrinsics.f(this.streetNumberSuffix, address.streetNumberSuffix) && Intrinsics.f(this.postalCode, address.postalCode) && Intrinsics.f(this.city, address.city) && Intrinsics.f(this.countryCode, address.countryCode) && Intrinsics.f(this.region, address.region);
            }

            @NotNull
            public final String getCity() {
                return this.city;
            }

            @NotNull
            public final String getCountryCode() {
                return this.countryCode;
            }

            @NotNull
            public final String getPostalCode() {
                return this.postalCode;
            }

            public final String getRegion() {
                return this.region;
            }

            @NotNull
            public final String getStreet() {
                return this.street;
            }

            public final int getStreetNumber() {
                return this.streetNumber;
            }

            public final String getStreetNumberSuffix() {
                return this.streetNumberSuffix;
            }

            public int hashCode() {
                int iHashCode = ((this.street.hashCode() * 31) + Integer.hashCode(this.streetNumber)) * 31;
                String str = this.streetNumberSuffix;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.postalCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.countryCode.hashCode()) * 31;
                String str2 = this.region;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Address(street=" + this.street + ", streetNumber=" + this.streetNumber + ", streetNumberSuffix=" + this.streetNumberSuffix + ", postalCode=" + this.postalCode + ", city=" + this.city + ", countryCode=" + this.countryCode + ", region=" + this.region + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JF\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0007\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0017¨\u00061"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "", "Landroid/graphics/Bitmap;", "image", "Lcom/fourthline/core/DocumentFileSide;", "fileSide", "", "isAngled", "Lcom/fourthline/core/location/Coordinate;", "location", "", "timestamp", "<init>", "(Landroid/graphics/Bitmap;Lcom/fourthline/core/DocumentFileSide;ZLcom/fourthline/core/location/Coordinate;Ljava/lang/Long;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Lcom/fourthline/core/DocumentFileSide;", "component3", "()Z", "component4", "()Lcom/fourthline/core/location/Coordinate;", "component5", "()Ljava/lang/Long;", "copy", "(Landroid/graphics/Bitmap;Lcom/fourthline/core/DocumentFileSide;ZLcom/fourthline/core/location/Coordinate;Ljava/lang/Long;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "getImage", "b", "Lcom/fourthline/core/DocumentFileSide;", "getFileSide", "c", "Z", "d", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "e", "Ljava/lang/Long;", "getTimestamp", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Attachment {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Bitmap image;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final DocumentFileSide fileSide;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final boolean isAngled;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final Coordinate location;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final Long timestamp;

            public Attachment(@NotNull Bitmap image, @NotNull DocumentFileSide fileSide, boolean z, Coordinate coordinate, Long l2) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(fileSide, "fileSide");
                this.image = image;
                this.fileSide = fileSide;
                this.isAngled = z;
                this.location = coordinate;
                this.timestamp = l2;
            }

            public static /* synthetic */ Attachment copy$default(Attachment attachment, Bitmap bitmap, DocumentFileSide documentFileSide, boolean z, Coordinate coordinate, Long l2, int i, Object obj2) {
                if ((i & 1) != 0) {
                    bitmap = attachment.image;
                }
                if ((i & 2) != 0) {
                    documentFileSide = attachment.fileSide;
                }
                if ((i & 4) != 0) {
                    z = attachment.isAngled;
                }
                if ((i & 8) != 0) {
                    coordinate = attachment.location;
                }
                if ((i & 16) != 0) {
                    l2 = attachment.timestamp;
                }
                Long l3 = l2;
                boolean z3 = z;
                return attachment.copy(bitmap, documentFileSide, z3, coordinate, l3);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Bitmap getImage() {
                return this.image;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final DocumentFileSide getFileSide() {
                return this.fileSide;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final boolean getIsAngled() {
                return this.isAngled;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Coordinate getLocation() {
                return this.location;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Long getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final Attachment copy(@NotNull Bitmap image, @NotNull DocumentFileSide fileSide, boolean isAngled, Coordinate location, Long timestamp) {
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(fileSide, "fileSide");
                return new Attachment(image, fileSide, isAngled, location, timestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Attachment)) {
                    return false;
                }
                Attachment attachment = (Attachment) other;
                return Intrinsics.f(this.image, attachment.image) && this.fileSide == attachment.fileSide && this.isAngled == attachment.isAngled && Intrinsics.f(this.location, attachment.location) && Intrinsics.f(this.timestamp, attachment.timestamp);
            }

            @NotNull
            public final DocumentFileSide getFileSide() {
                return this.fileSide;
            }

            @NotNull
            public final Bitmap getImage() {
                return this.image;
            }

            public final Coordinate getLocation() {
                return this.location;
            }

            public final Long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                int iHashCode = ((((this.image.hashCode() * 31) + this.fileSide.hashCode()) * 31) + Boolean.hashCode(this.isAngled)) * 31;
                Coordinate coordinate = this.location;
                int iHashCode2 = (iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
                Long l2 = this.timestamp;
                return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
            }

            public final boolean isAngled() {
                return this.isAngled;
            }

            @NotNull
            public String toString() {
                return "Attachment(image=" + this.image + ", fileSide=" + this.fileSide + ", isAngled=" + this.isAngled + ", location=" + this.location + ", timestamp=" + this.timestamp + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJd\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b3\u0010\u000fR\u001a\u00106\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010\u000f¨\u00067"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "language", "region", "model", "osVersion", "sdkVersion", "", "osCompromised", "appTrackerId", "analyticsId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DeviceMetadata;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLanguage", "b", "getRegion", "c", "getModel", "d", "getOsVersion", "e", "getSdkVersion", "f", "Z", "getOsCompromised", "g", "getAppTrackerId", "h", "getAnalyticsId", "i", "getSdkOrigin", "sdkOrigin", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DeviceMetadata implements IDV {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String language;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String region;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String model;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String osVersion;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String sdkVersion;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final boolean osCompromised;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final String appTrackerId;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final String analyticsId;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final String sdkOrigin;

            public DeviceMetadata(@NotNull String language, String str, @NotNull String model, @NotNull String osVersion, @NotNull String sdkVersion, boolean z, @NotNull String appTrackerId, String str2) {
                Intrinsics.checkNotNullParameter(language, "language");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(osVersion, "osVersion");
                Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
                Intrinsics.checkNotNullParameter(appTrackerId, "appTrackerId");
                this.language = language;
                this.region = str;
                this.model = model;
                this.osVersion = osVersion;
                this.sdkVersion = sdkVersion;
                this.osCompromised = z;
                this.appTrackerId = appTrackerId;
                this.analyticsId = str2;
                this.sdkOrigin = "android";
            }

            public static /* synthetic */ DeviceMetadata copy$default(DeviceMetadata deviceMetadata, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = deviceMetadata.language;
                }
                if ((i & 2) != 0) {
                    str2 = deviceMetadata.region;
                }
                if ((i & 4) != 0) {
                    str3 = deviceMetadata.model;
                }
                if ((i & 8) != 0) {
                    str4 = deviceMetadata.osVersion;
                }
                if ((i & 16) != 0) {
                    str5 = deviceMetadata.sdkVersion;
                }
                if ((i & 32) != 0) {
                    z = deviceMetadata.osCompromised;
                }
                if ((i & 64) != 0) {
                    str6 = deviceMetadata.appTrackerId;
                }
                if ((i & 128) != 0) {
                    str7 = deviceMetadata.analyticsId;
                }
                String str8 = str6;
                String str9 = str7;
                String str10 = str5;
                boolean z3 = z;
                return deviceMetadata.copy(str, str2, str3, str4, str10, z3, str8, str9);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getLanguage() {
                return this.language;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getRegion() {
                return this.region;
            }

            @NotNull
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getModel() {
                return this.model;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getOsVersion() {
                return this.osVersion;
            }

            @NotNull
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getSdkVersion() {
                return this.sdkVersion;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final boolean getOsCompromised() {
                return this.osCompromised;
            }

            @NotNull
            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getAppTrackerId() {
                return this.appTrackerId;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            @NotNull
            public final DeviceMetadata copy(@NotNull String language, String region, @NotNull String model, @NotNull String osVersion, @NotNull String sdkVersion, boolean osCompromised, @NotNull String appTrackerId, String analyticsId) {
                Intrinsics.checkNotNullParameter(language, "language");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(osVersion, "osVersion");
                Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
                Intrinsics.checkNotNullParameter(appTrackerId, "appTrackerId");
                return new DeviceMetadata(language, region, model, osVersion, sdkVersion, osCompromised, appTrackerId, analyticsId);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DeviceMetadata)) {
                    return false;
                }
                DeviceMetadata deviceMetadata = (DeviceMetadata) other;
                return Intrinsics.f(this.language, deviceMetadata.language) && Intrinsics.f(this.region, deviceMetadata.region) && Intrinsics.f(this.model, deviceMetadata.model) && Intrinsics.f(this.osVersion, deviceMetadata.osVersion) && Intrinsics.f(this.sdkVersion, deviceMetadata.sdkVersion) && this.osCompromised == deviceMetadata.osCompromised && Intrinsics.f(this.appTrackerId, deviceMetadata.appTrackerId) && Intrinsics.f(this.analyticsId, deviceMetadata.analyticsId);
            }

            public final String getAnalyticsId() {
                return this.analyticsId;
            }

            @NotNull
            public final String getAppTrackerId() {
                return this.appTrackerId;
            }

            @NotNull
            public final String getLanguage() {
                return this.language;
            }

            @NotNull
            public final String getModel() {
                return this.model;
            }

            public final boolean getOsCompromised() {
                return this.osCompromised;
            }

            @NotNull
            public final String getOsVersion() {
                return this.osVersion;
            }

            public final String getRegion() {
                return this.region;
            }

            @NotNull
            public final String getSdkOrigin() {
                return this.sdkOrigin;
            }

            @NotNull
            public final String getSdkVersion() {
                return this.sdkVersion;
            }

            public int hashCode() {
                int iHashCode = this.language.hashCode() * 31;
                String str = this.region;
                int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.model.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31) + Boolean.hashCode(this.osCompromised)) * 31) + this.appTrackerId.hashCode()) * 31;
                String str2 = this.analyticsId;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "DeviceMetadata(language=" + this.language + ", region=" + this.region + ", model=" + this.model + ", osVersion=" + this.osVersion + ", sdkVersion=" + this.sdkVersion + ", osCompromised=" + this.osCompromised + ", appTrackerId=" + this.appTrackerId + ", analyticsId=" + this.analyticsId + ")";
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JX\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010\u0014R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018¨\u00064"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/core/DocumentType;", "type", "", "number", "Ljava/util/Date;", "issueDate", "issuingCountry", "expirationDate", "", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "images", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Date;", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Document;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getType", "b", "Ljava/lang/String;", "getNumber", "c", "Ljava/util/Date;", "getIssueDate", "d", "getIssuingCountry", "e", "getExpirationDate", "f", "Ljava/util/List;", "getImages", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Document implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final DocumentType type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String number;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Date issueDate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String issuingCountry;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final Date expirationDate;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final List images;

            public Document(@NotNull DocumentType type, @NotNull String number, Date date, String str, Date date2, @NotNull List<Attachment> images) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(images, "images");
                this.type = type;
                this.number = number;
                this.issueDate = date;
                this.issuingCountry = str;
                this.expirationDate = date2;
                this.images = images;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Document copy$default(Document document, DocumentType documentType, String str, Date date, String str2, Date date2, List list, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = document.type;
                }
                if ((i & 2) != 0) {
                    str = document.number;
                }
                if ((i & 4) != 0) {
                    date = document.issueDate;
                }
                if ((i & 8) != 0) {
                    str2 = document.issuingCountry;
                }
                if ((i & 16) != 0) {
                    date2 = document.expirationDate;
                }
                if ((i & 32) != 0) {
                    list = document.images;
                }
                Date date3 = date2;
                List list2 = list;
                return document.copy(documentType, str, date, str2, date3, list2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getType() {
                return this.type;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getNumber() {
                return this.number;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Date getIssueDate() {
                return this.issueDate;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            @NotNull
            public final List<Attachment> component6() {
                return this.images;
            }

            @NotNull
            public final Document copy(@NotNull DocumentType type, @NotNull String number, Date issueDate, String issuingCountry, Date expirationDate, @NotNull List<Attachment> images) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(number, "number");
                Intrinsics.checkNotNullParameter(images, "images");
                return new Document(type, number, issueDate, issuingCountry, expirationDate, images);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Document)) {
                    return false;
                }
                Document document = (Document) other;
                return this.type == document.type && Intrinsics.f(this.number, document.number) && Intrinsics.f(this.issueDate, document.issueDate) && Intrinsics.f(this.issuingCountry, document.issuingCountry) && Intrinsics.f(this.expirationDate, document.expirationDate) && Intrinsics.f(this.images, document.images);
            }

            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            @NotNull
            public final List<Attachment> getImages() {
                return this.images;
            }

            public final Date getIssueDate() {
                return this.issueDate;
            }

            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            @NotNull
            public final String getNumber() {
                return this.number;
            }

            @NotNull
            public final DocumentType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = ((this.type.hashCode() * 31) + this.number.hashCode()) * 31;
                Date date = this.issueDate;
                int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
                String str = this.issuingCountry;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                Date date2 = this.expirationDate;
                return ((iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.images.hashCode();
            }

            @NotNull
            public String toString() {
                return "Document(type=" + this.type + ", number=" + this.number + ", issueDate=" + this.issueDate + ", issuingCountry=" + this.issuingCountry + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/core/VideoRecording;", "recording", "<init>", "(Lcom/fourthline/core/VideoRecording;)V", "component1", "()Lcom/fourthline/core/VideoRecording;", "copy", "(Lcom/fourthline/core/VideoRecording;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$DocumentVideo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/VideoRecording;", "getRecording", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DocumentVideo implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final VideoRecording recording;

            public DocumentVideo(@NotNull VideoRecording recording) {
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.recording = recording;
            }

            public static /* synthetic */ DocumentVideo copy$default(DocumentVideo documentVideo, VideoRecording videoRecording, int i, Object obj2) {
                if ((i & 1) != 0) {
                    videoRecording = documentVideo.recording;
                }
                return documentVideo.copy(videoRecording);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final VideoRecording getRecording() {
                return this.recording;
            }

            @NotNull
            public final DocumentVideo copy(@NotNull VideoRecording recording) {
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new DocumentVideo(recording);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DocumentVideo) && Intrinsics.f(this.recording, ((DocumentVideo) other).recording);
            }

            @NotNull
            public final VideoRecording getRecording() {
                return this.recording;
            }

            public int hashCode() {
                return this.recording.hashCode();
            }

            @NotNull
            public String toString() {
                return "DocumentVideo(recording=" + this.recording + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/core/location/Coordinate;", "location", "<init>", "(Lcom/fourthline/core/location/Coordinate;)V", "component1", "()Lcom/fourthline/core/location/Coordinate;", "copy", "(Lcom/fourthline/core/location/Coordinate;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Geolocation;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Geolocation implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Coordinate location;

            public Geolocation(Coordinate coordinate) {
                this.location = coordinate;
            }

            public static /* synthetic */ Geolocation copy$default(Geolocation geolocation, Coordinate coordinate, int i, Object obj2) {
                if ((i & 1) != 0) {
                    coordinate = geolocation.location;
                }
                return geolocation.copy(coordinate);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Coordinate getLocation() {
                return this.location;
            }

            @NotNull
            public final Geolocation copy(Coordinate location) {
                return new Geolocation(location);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Geolocation) && Intrinsics.f(this.location, ((Geolocation) other).location);
            }

            public final Coordinate getLocation() {
                return this.location;
            }

            public int hashCode() {
                Coordinate coordinate = this.location;
                if (coordinate == null) {
                    return 0;
                }
                return coordinate.hashCode();
            }

            @NotNull
            public String toString() {
                return "Geolocation(location=" + this.location + ")";
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ^\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001d¨\u0006:"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "mrz", "Landroid/graphics/Bitmap;", "image", "Lcom/fourthline/core/location/Coordinate;", "location", "", "timestamp", "", "", "", "dataGroups", "Lcom/fourthline/nfc/NfcAuthenticationChecks;", "authenticationChecks", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/fourthline/core/location/Coordinate;Ljava/lang/Long;Ljava/util/Map;Lcom/fourthline/nfc/NfcAuthenticationChecks;)V", "component1", "()Ljava/lang/String;", "component2", "()Landroid/graphics/Bitmap;", "component3", "()Lcom/fourthline/core/location/Coordinate;", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/fourthline/nfc/NfcAuthenticationChecks;", "copy", "(Ljava/lang/String;Landroid/graphics/Bitmap;Lcom/fourthline/core/location/Coordinate;Ljava/lang/Long;Ljava/util/Map;Lcom/fourthline/nfc/NfcAuthenticationChecks;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Nfc;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMrz", "b", "Landroid/graphics/Bitmap;", "getImage", "c", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "d", "Ljava/lang/Long;", "getTimestamp", "e", "Ljava/util/Map;", "getDataGroups", "f", "Lcom/fourthline/nfc/NfcAuthenticationChecks;", "getAuthenticationChecks", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Nfc implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String mrz;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Bitmap image;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Coordinate location;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final Long timestamp;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final Map dataGroups;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final NfcAuthenticationChecks authenticationChecks;

            public Nfc(@NotNull String mrz, Bitmap bitmap, Coordinate coordinate, Long l2, @NotNull Map<Integer, byte[]> dataGroups, @NotNull NfcAuthenticationChecks authenticationChecks) {
                Intrinsics.checkNotNullParameter(mrz, "mrz");
                Intrinsics.checkNotNullParameter(dataGroups, "dataGroups");
                Intrinsics.checkNotNullParameter(authenticationChecks, "authenticationChecks");
                this.mrz = mrz;
                this.image = bitmap;
                this.location = coordinate;
                this.timestamp = l2;
                this.dataGroups = dataGroups;
                this.authenticationChecks = authenticationChecks;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Nfc copy$default(Nfc nfc2, String str, Bitmap bitmap, Coordinate coordinate, Long l2, Map map, NfcAuthenticationChecks nfcAuthenticationChecks, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = nfc2.mrz;
                }
                if ((i & 2) != 0) {
                    bitmap = nfc2.image;
                }
                if ((i & 4) != 0) {
                    coordinate = nfc2.location;
                }
                if ((i & 8) != 0) {
                    l2 = nfc2.timestamp;
                }
                if ((i & 16) != 0) {
                    map = nfc2.dataGroups;
                }
                if ((i & 32) != 0) {
                    nfcAuthenticationChecks = nfc2.authenticationChecks;
                }
                Map map2 = map;
                NfcAuthenticationChecks nfcAuthenticationChecks2 = nfcAuthenticationChecks;
                return nfc2.copy(str, bitmap, coordinate, l2, map2, nfcAuthenticationChecks2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getMrz() {
                return this.mrz;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Bitmap getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Coordinate getLocation() {
                return this.location;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Long getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final Map<Integer, byte[]> component5() {
                return this.dataGroups;
            }

            @NotNull
            /* JADX INFO: renamed from: component6, reason: from getter */
            public final NfcAuthenticationChecks getAuthenticationChecks() {
                return this.authenticationChecks;
            }

            @NotNull
            public final Nfc copy(@NotNull String mrz, Bitmap image, Coordinate location, Long timestamp, @NotNull Map<Integer, byte[]> dataGroups, @NotNull NfcAuthenticationChecks authenticationChecks) {
                Intrinsics.checkNotNullParameter(mrz, "mrz");
                Intrinsics.checkNotNullParameter(dataGroups, "dataGroups");
                Intrinsics.checkNotNullParameter(authenticationChecks, "authenticationChecks");
                return new Nfc(mrz, image, location, timestamp, dataGroups, authenticationChecks);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Nfc)) {
                    return false;
                }
                Nfc nfc2 = (Nfc) other;
                return Intrinsics.f(this.mrz, nfc2.mrz) && Intrinsics.f(this.image, nfc2.image) && Intrinsics.f(this.location, nfc2.location) && Intrinsics.f(this.timestamp, nfc2.timestamp) && Intrinsics.f(this.dataGroups, nfc2.dataGroups) && Intrinsics.f(this.authenticationChecks, nfc2.authenticationChecks);
            }

            @NotNull
            public final NfcAuthenticationChecks getAuthenticationChecks() {
                return this.authenticationChecks;
            }

            @NotNull
            public final Map<Integer, byte[]> getDataGroups() {
                return this.dataGroups;
            }

            public final Bitmap getImage() {
                return this.image;
            }

            public final Coordinate getLocation() {
                return this.location;
            }

            @NotNull
            public final String getMrz() {
                return this.mrz;
            }

            public final Long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                int iHashCode = this.mrz.hashCode() * 31;
                Bitmap bitmap = this.image;
                int iHashCode2 = (iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
                Coordinate coordinate = this.location;
                int iHashCode3 = (iHashCode2 + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
                Long l2 = this.timestamp;
                return ((((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.dataGroups.hashCode()) * 31) + this.authenticationChecks.hashCode();
            }

            @NotNull
            public String toString() {
                return "Nfc(mrz=" + this.mrz + ", image=" + this.image + ", location=" + this.location + ", timestamp=" + this.timestamp + ", dataGroups=" + this.dataGroups + ", authenticationChecks=" + this.authenticationChecks + ")";
            }
        }

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jf\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010\u0010R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010\u0010R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010\u0010R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0019¨\u00068"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "firstName", "middleName", "lastName", "Lcom/fourthline/core/Gender;", "gender", "nationalityCode", "birthCountryCode", "birthPlace", "Ljava/util/Date;", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/fourthline/core/Gender;", "component5", "component6", "component7", "component8", "()Ljava/util/Date;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Person;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getMiddleName", "c", "getLastName", "d", "Lcom/fourthline/core/Gender;", "getGender", "e", "getNationalityCode", "f", "getBirthCountryCode", "g", "getBirthPlace", "h", "Ljava/util/Date;", "getBirthDate", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Person implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String firstName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String middleName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String lastName;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final Gender gender;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String nationalityCode;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String birthCountryCode;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final String birthPlace;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final Date birthDate;

            public Person(@NotNull String firstName, String str, @NotNull String lastName, @NotNull Gender gender, @NotNull String nationalityCode, String str2, String str3, @NotNull Date birthDate) {
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(gender, "gender");
                Intrinsics.checkNotNullParameter(nationalityCode, "nationalityCode");
                Intrinsics.checkNotNullParameter(birthDate, "birthDate");
                this.firstName = firstName;
                this.middleName = str;
                this.lastName = lastName;
                this.gender = gender;
                this.nationalityCode = nationalityCode;
                this.birthCountryCode = str2;
                this.birthPlace = str3;
                this.birthDate = birthDate;
            }

            public static /* synthetic */ Person copy$default(Person person, String str, String str2, String str3, Gender gender, String str4, String str5, String str6, Date date, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = person.firstName;
                }
                if ((i & 2) != 0) {
                    str2 = person.middleName;
                }
                if ((i & 4) != 0) {
                    str3 = person.lastName;
                }
                if ((i & 8) != 0) {
                    gender = person.gender;
                }
                if ((i & 16) != 0) {
                    str4 = person.nationalityCode;
                }
                if ((i & 32) != 0) {
                    str5 = person.birthCountryCode;
                }
                if ((i & 64) != 0) {
                    str6 = person.birthPlace;
                }
                if ((i & 128) != 0) {
                    date = person.birthDate;
                }
                String str7 = str6;
                Date date2 = date;
                String str8 = str4;
                String str9 = str5;
                return person.copy(str, str2, str3, gender, str8, str9, str7, date2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getMiddleName() {
                return this.middleName;
            }

            @NotNull
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Gender getGender() {
                return this.gender;
            }

            @NotNull
            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getNationalityCode() {
                return this.nationalityCode;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getBirthCountryCode() {
                return this.birthCountryCode;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final String getBirthPlace() {
                return this.birthPlace;
            }

            @NotNull
            /* JADX INFO: renamed from: component8, reason: from getter */
            public final Date getBirthDate() {
                return this.birthDate;
            }

            @NotNull
            public final Person copy(@NotNull String firstName, String middleName, @NotNull String lastName, @NotNull Gender gender, @NotNull String nationalityCode, String birthCountryCode, String birthPlace, @NotNull Date birthDate) {
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(gender, "gender");
                Intrinsics.checkNotNullParameter(nationalityCode, "nationalityCode");
                Intrinsics.checkNotNullParameter(birthDate, "birthDate");
                return new Person(firstName, middleName, lastName, gender, nationalityCode, birthCountryCode, birthPlace, birthDate);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Person)) {
                    return false;
                }
                Person person = (Person) other;
                return Intrinsics.f(this.firstName, person.firstName) && Intrinsics.f(this.middleName, person.middleName) && Intrinsics.f(this.lastName, person.lastName) && this.gender == person.gender && Intrinsics.f(this.nationalityCode, person.nationalityCode) && Intrinsics.f(this.birthCountryCode, person.birthCountryCode) && Intrinsics.f(this.birthPlace, person.birthPlace) && Intrinsics.f(this.birthDate, person.birthDate);
            }

            public final String getBirthCountryCode() {
                return this.birthCountryCode;
            }

            @NotNull
            public final Date getBirthDate() {
                return this.birthDate;
            }

            public final String getBirthPlace() {
                return this.birthPlace;
            }

            @NotNull
            public final String getFirstName() {
                return this.firstName;
            }

            @NotNull
            public final Gender getGender() {
                return this.gender;
            }

            @NotNull
            public final String getLastName() {
                return this.lastName;
            }

            public final String getMiddleName() {
                return this.middleName;
            }

            @NotNull
            public final String getNationalityCode() {
                return this.nationalityCode;
            }

            public int hashCode() {
                int iHashCode = this.firstName.hashCode() * 31;
                String str = this.middleName;
                int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.lastName.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.nationalityCode.hashCode()) * 31;
                String str2 = this.birthCountryCode;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.birthPlace;
                return ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.birthDate.hashCode();
            }

            @NotNull
            public String toString() {
                return "Person(firstName=" + this.firstName + ", middleName=" + this.middleName + ", lastName=" + this.lastName + ", gender=" + this.gender + ", nationalityCode=" + this.nationalityCode + ", birthCountryCode=" + this.birthCountryCode + ", birthPlace=" + this.birthPlace + ", birthDate=" + this.birthDate + ")";
            }
        }

        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012¨\u0006+"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/core/DocumentType;", "type", "Ljava/util/Date;", "issueDate", "expirationDate", "", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "images", "<init>", "(Lcom/fourthline/core/DocumentType;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)V", "component1", "()Lcom/fourthline/core/DocumentType;", "component2", "()Ljava/util/Date;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/fourthline/core/DocumentType;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SecondaryDocument;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/DocumentType;", "getType", "b", "Ljava/util/Date;", "getIssueDate", "c", "getExpirationDate", "d", "Ljava/util/List;", "getImages", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SecondaryDocument implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final DocumentType type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Date issueDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Date expirationDate;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final List images;

            public SecondaryDocument(@NotNull DocumentType type, Date date, Date date2, @NotNull List<Attachment> images) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(images, "images");
                this.type = type;
                this.issueDate = date;
                this.expirationDate = date2;
                this.images = images;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SecondaryDocument copy$default(SecondaryDocument secondaryDocument, DocumentType documentType, Date date, Date date2, List list, int i, Object obj2) {
                if ((i & 1) != 0) {
                    documentType = secondaryDocument.type;
                }
                if ((i & 2) != 0) {
                    date = secondaryDocument.issueDate;
                }
                if ((i & 4) != 0) {
                    date2 = secondaryDocument.expirationDate;
                }
                if ((i & 8) != 0) {
                    list = secondaryDocument.images;
                }
                return secondaryDocument.copy(documentType, date, date2, list);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final DocumentType getType() {
                return this.type;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Date getIssueDate() {
                return this.issueDate;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            @NotNull
            public final List<Attachment> component4() {
                return this.images;
            }

            @NotNull
            public final SecondaryDocument copy(@NotNull DocumentType type, Date issueDate, Date expirationDate, @NotNull List<Attachment> images) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(images, "images");
                return new SecondaryDocument(type, issueDate, expirationDate, images);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SecondaryDocument)) {
                    return false;
                }
                SecondaryDocument secondaryDocument = (SecondaryDocument) other;
                return this.type == secondaryDocument.type && Intrinsics.f(this.issueDate, secondaryDocument.issueDate) && Intrinsics.f(this.expirationDate, secondaryDocument.expirationDate) && Intrinsics.f(this.images, secondaryDocument.images);
            }

            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            @NotNull
            public final List<Attachment> getImages() {
                return this.images;
            }

            public final Date getIssueDate() {
                return this.issueDate;
            }

            @NotNull
            public final DocumentType getType() {
                return this.type;
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Date date = this.issueDate;
                int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
                Date date2 = this.expirationDate;
                return ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.images.hashCode();
            }

            @NotNull
            public String toString() {
                return "SecondaryDocument(type=" + this.type + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", images=" + this.images + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Landroid/graphics/Bitmap;", "image", "Lcom/fourthline/core/location/Coordinate;", "location", "", "timestamp", "<init>", "(Landroid/graphics/Bitmap;Lcom/fourthline/core/location/Coordinate;Ljava/lang/Long;)V", "component1", "()Landroid/graphics/Bitmap;", "component2", "()Lcom/fourthline/core/location/Coordinate;", "component3", "()Ljava/lang/Long;", "copy", "(Landroid/graphics/Bitmap;Lcom/fourthline/core/location/Coordinate;Ljava/lang/Long;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Selfie;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "getImage", "b", "Lcom/fourthline/core/location/Coordinate;", "getLocation", "c", "Ljava/lang/Long;", "getTimestamp", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Selfie implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Bitmap image;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final Coordinate location;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final Long timestamp;

            public Selfie(@NotNull Bitmap image, Coordinate coordinate, Long l2) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.location = coordinate;
                this.timestamp = l2;
            }

            public static /* synthetic */ Selfie copy$default(Selfie selfie, Bitmap bitmap, Coordinate coordinate, Long l2, int i, Object obj2) {
                if ((i & 1) != 0) {
                    bitmap = selfie.image;
                }
                if ((i & 2) != 0) {
                    coordinate = selfie.location;
                }
                if ((i & 4) != 0) {
                    l2 = selfie.timestamp;
                }
                return selfie.copy(bitmap, coordinate, l2);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final Bitmap getImage() {
                return this.image;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final Coordinate getLocation() {
                return this.location;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final Long getTimestamp() {
                return this.timestamp;
            }

            @NotNull
            public final Selfie copy(@NotNull Bitmap image, Coordinate location, Long timestamp) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new Selfie(image, location, timestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Selfie)) {
                    return false;
                }
                Selfie selfie = (Selfie) other;
                return Intrinsics.f(this.image, selfie.image) && Intrinsics.f(this.location, selfie.location) && Intrinsics.f(this.timestamp, selfie.timestamp);
            }

            @NotNull
            public final Bitmap getImage() {
                return this.image;
            }

            public final Coordinate getLocation() {
                return this.location;
            }

            public final Long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                int iHashCode = this.image.hashCode() * 31;
                Coordinate coordinate = this.location;
                int iHashCode2 = (iHashCode + (coordinate == null ? 0 : coordinate.hashCode())) * 31;
                Long l2 = this.timestamp;
                return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Selfie(image=" + this.image + ", location=" + this.location + ", timestamp=" + this.timestamp + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "Lcom/fourthline/core/VideoRecording;", "recording", "<init>", "(Lcom/fourthline/core/VideoRecording;)V", "component1", "()Lcom/fourthline/core/VideoRecording;", "copy", "(Lcom/fourthline/core/VideoRecording;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$SelfieVideo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/VideoRecording;", "getRecording", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelfieVideo implements IDV {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final VideoRecording recording;

            public SelfieVideo(@NotNull VideoRecording recording) {
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.recording = recording;
            }

            public static /* synthetic */ SelfieVideo copy$default(SelfieVideo selfieVideo, VideoRecording videoRecording, int i, Object obj2) {
                if ((i & 1) != 0) {
                    videoRecording = selfieVideo.recording;
                }
                return selfieVideo.copy(videoRecording);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final VideoRecording getRecording() {
                return this.recording;
            }

            @NotNull
            public final SelfieVideo copy(@NotNull VideoRecording recording) {
                Intrinsics.checkNotNullParameter(recording, "recording");
                return new SelfieVideo(recording);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SelfieVideo) && Intrinsics.f(this.recording, ((SelfieVideo) other).recording);
            }

            @NotNull
            public final VideoRecording getRecording() {
                return this.recording;
            }

            public int hashCode() {
                return this.recording.hashCode();
            }

            @NotNull
            public String toString() {
                return "SelfieVideo(recording=" + this.recording + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "email", "mobile", "phone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Contacts;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", "getMobile", "c", "getPhone", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Contacts implements IDV {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String email;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String mobile;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String phone;

            public Contacts(@NotNull String email, @NotNull String mobile, String str) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(mobile, "mobile");
                this.email = email;
                this.mobile = mobile;
                this.phone = str;
            }

            public static /* synthetic */ Contacts copy$default(Contacts contacts, String str, String str2, String str3, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = contacts.email;
                }
                if ((i & 2) != 0) {
                    str2 = contacts.mobile;
                }
                if ((i & 4) != 0) {
                    str3 = contacts.phone;
                }
                return contacts.copy(str, str2, str3);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getMobile() {
                return this.mobile;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @NotNull
            public final Contacts copy(@NotNull String email, @NotNull String mobile, String phone) {
                Intrinsics.checkNotNullParameter(email, "email");
                Intrinsics.checkNotNullParameter(mobile, "mobile");
                return new Contacts(email, mobile, phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Contacts)) {
                    return false;
                }
                Contacts contacts = (Contacts) other;
                return Intrinsics.f(this.email, contacts.email) && Intrinsics.f(this.mobile, contacts.mobile) && Intrinsics.f(this.phone, contacts.phone);
            }

            @NotNull
            public final String getEmail() {
                return this.email;
            }

            @NotNull
            public final String getMobile() {
                return this.mobile;
            }

            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                int iHashCode = ((this.email.hashCode() * 31) + this.mobile.hashCode()) * 31;
                String str = this.phone;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "Contacts(email=" + this.email + ", mobile=" + this.mobile + ", phone=" + this.phone + ")";
            }

            public /* synthetic */ Contacts(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? null : str3);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\n¨\u0006\""}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV;", "", "taxationCountryCode", "taxNumber", "usPerson", "usTin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$IDV$TaxInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTaxationCountryCode", "b", "getTaxNumber", "c", "getUsPerson", "d", "getUsTin", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxInfo implements IDV {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String taxationCountryCode;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String taxNumber;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String usPerson;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final String usTin;

            public TaxInfo(@NotNull String taxationCountryCode, @NotNull String taxNumber, @NotNull String usPerson, String str) {
                Intrinsics.checkNotNullParameter(taxationCountryCode, "taxationCountryCode");
                Intrinsics.checkNotNullParameter(taxNumber, "taxNumber");
                Intrinsics.checkNotNullParameter(usPerson, "usPerson");
                this.taxationCountryCode = taxationCountryCode;
                this.taxNumber = taxNumber;
                this.usPerson = usPerson;
                this.usTin = str;
            }

            public static /* synthetic */ TaxInfo copy$default(TaxInfo taxInfo, String str, String str2, String str3, String str4, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = taxInfo.taxationCountryCode;
                }
                if ((i & 2) != 0) {
                    str2 = taxInfo.taxNumber;
                }
                if ((i & 4) != 0) {
                    str3 = taxInfo.usPerson;
                }
                if ((i & 8) != 0) {
                    str4 = taxInfo.usTin;
                }
                return taxInfo.copy(str, str2, str3, str4);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getTaxationCountryCode() {
                return this.taxationCountryCode;
            }

            @NotNull
            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getTaxNumber() {
                return this.taxNumber;
            }

            @NotNull
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getUsPerson() {
                return this.usPerson;
            }

            /* JADX INFO: renamed from: component4, reason: from getter */
            public final String getUsTin() {
                return this.usTin;
            }

            @NotNull
            public final TaxInfo copy(@NotNull String taxationCountryCode, @NotNull String taxNumber, @NotNull String usPerson, String usTin) {
                Intrinsics.checkNotNullParameter(taxationCountryCode, "taxationCountryCode");
                Intrinsics.checkNotNullParameter(taxNumber, "taxNumber");
                Intrinsics.checkNotNullParameter(usPerson, "usPerson");
                return new TaxInfo(taxationCountryCode, taxNumber, usPerson, usTin);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TaxInfo)) {
                    return false;
                }
                TaxInfo taxInfo = (TaxInfo) other;
                return Intrinsics.f(this.taxationCountryCode, taxInfo.taxationCountryCode) && Intrinsics.f(this.taxNumber, taxInfo.taxNumber) && Intrinsics.f(this.usPerson, taxInfo.usPerson) && Intrinsics.f(this.usTin, taxInfo.usTin);
            }

            @NotNull
            public final String getTaxNumber() {
                return this.taxNumber;
            }

            @NotNull
            public final String getTaxationCountryCode() {
                return this.taxationCountryCode;
            }

            @NotNull
            public final String getUsPerson() {
                return this.usPerson;
            }

            public final String getUsTin() {
                return this.usTin;
            }

            public int hashCode() {
                int iHashCode = ((((this.taxationCountryCode.hashCode() * 31) + this.taxNumber.hashCode()) * 31) + this.usPerson.hashCode()) * 31;
                String str = this.usTin;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @NotNull
            public String toString() {
                return "TaxInfo(taxationCountryCode=" + this.taxationCountryCode + ", taxNumber=" + this.taxNumber + ", usPerson=" + this.usPerson + ", usTin=" + this.usTin + ")";
            }

            public /* synthetic */ TaxInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, (i & 4) != 0 ? "no" : str3, (i & 8) != 0 ? null : str4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$Component;", "Lcom/fourthline/orca/workflow/WorkflowResults;", "Document", "DocumentAnalysis", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Component extends WorkflowResults {

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "Lcom/fourthline/orca/workflow/WorkflowResults$Component;", "Lcom/fourthline/core/VideoRecording;", "videoRecording", "Lcom/fourthline/core/mrz/MrzInfo;", "mrzInfo", "Lcom/fourthline/core/DocumentType;", "documentType", "", "Lcom/fourthline/orca/workflow/WorkflowResults$IDV$Attachment;", "images", "<init>", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;)V", "component1", "()Lcom/fourthline/core/VideoRecording;", "component2", "()Lcom/fourthline/core/mrz/MrzInfo;", "component3", "()Lcom/fourthline/core/DocumentType;", "component4", "()Ljava/util/List;", "copy", "(Lcom/fourthline/core/VideoRecording;Lcom/fourthline/core/mrz/MrzInfo;Lcom/fourthline/core/DocumentType;Ljava/util/List;)Lcom/fourthline/orca/workflow/WorkflowResults$Component$Document;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/core/VideoRecording;", "getVideoRecording", "b", "Lcom/fourthline/core/mrz/MrzInfo;", "getMrzInfo", "c", "Lcom/fourthline/core/DocumentType;", "getDocumentType", "d", "Ljava/util/List;", "getImages", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Document implements Component {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final VideoRecording videoRecording;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final MrzInfo mrzInfo;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final DocumentType documentType;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final List images;

            public Document(VideoRecording videoRecording, MrzInfo mrzInfo, @NotNull DocumentType documentType, @NotNull List<IDV.Attachment> images) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(images, "images");
                this.videoRecording = videoRecording;
                this.mrzInfo = mrzInfo;
                this.documentType = documentType;
                this.images = images;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Document copy$default(Document document, VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, int i, Object obj2) {
                if ((i & 1) != 0) {
                    videoRecording = document.videoRecording;
                }
                if ((i & 2) != 0) {
                    mrzInfo = document.mrzInfo;
                }
                if ((i & 4) != 0) {
                    documentType = document.documentType;
                }
                if ((i & 8) != 0) {
                    list = document.images;
                }
                return document.copy(videoRecording, mrzInfo, documentType, list);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final VideoRecording getVideoRecording() {
                return this.videoRecording;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final MrzInfo getMrzInfo() {
                return this.mrzInfo;
            }

            @NotNull
            /* JADX INFO: renamed from: component3, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            @NotNull
            public final List<IDV.Attachment> component4() {
                return this.images;
            }

            @NotNull
            public final Document copy(VideoRecording videoRecording, MrzInfo mrzInfo, @NotNull DocumentType documentType, @NotNull List<IDV.Attachment> images) {
                Intrinsics.checkNotNullParameter(documentType, "documentType");
                Intrinsics.checkNotNullParameter(images, "images");
                return new Document(videoRecording, mrzInfo, documentType, images);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Document)) {
                    return false;
                }
                Document document = (Document) other;
                return Intrinsics.f(this.videoRecording, document.videoRecording) && Intrinsics.f(this.mrzInfo, document.mrzInfo) && this.documentType == document.documentType && Intrinsics.f(this.images, document.images);
            }

            @NotNull
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            @NotNull
            public final List<IDV.Attachment> getImages() {
                return this.images;
            }

            public final MrzInfo getMrzInfo() {
                return this.mrzInfo;
            }

            public final VideoRecording getVideoRecording() {
                return this.videoRecording;
            }

            public int hashCode() {
                VideoRecording videoRecording = this.videoRecording;
                int iHashCode = (videoRecording == null ? 0 : videoRecording.hashCode()) * 31;
                MrzInfo mrzInfo = this.mrzInfo;
                return ((((iHashCode + (mrzInfo != null ? mrzInfo.hashCode() : 0)) * 31) + this.documentType.hashCode()) * 31) + this.images.hashCode();
            }

            @NotNull
            public String toString() {
                return "Document(videoRecording=" + this.videoRecording + ", mrzInfo=" + this.mrzInfo + ", documentType=" + this.documentType + ", images=" + this.images + ")";
            }

            public /* synthetic */ Document(VideoRecording videoRecording, MrzInfo mrzInfo, DocumentType documentType, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : videoRecording, (i & 2) != 0 ? null : mrzInfo, documentType, list);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0012\u0010$\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0017J¶\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0017R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bJ\u00104\u001a\u0004\bK\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bO\u00104\u001a\u0004\bP\u0010\u0017R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u0010\u0017¨\u0006S"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "Lcom/fourthline/orca/workflow/WorkflowResults$Component;", "", "firstName", "lastName", "initials", "Lcom/fourthline/core/Gender;", "gender", "nationality", "issuingCountry", "Ljava/util/Date;", "issueDate", "expirationDate", "dateOfBirth", "birthPlace", "documentNumber", "Lcom/fourthline/core/DocumentType;", "documentType", "documentModel", "taxIdentificationNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/fourthline/core/Gender;", "component5", "component6", "component7", "()Ljava/util/Date;", "component8", "component9", "component10", "component11", "component12", "()Lcom/fourthline/core/DocumentType;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/Gender;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/fourthline/core/DocumentType;Ljava/lang/String;Ljava/lang/String;)Lcom/fourthline/orca/workflow/WorkflowResults$Component$DocumentAnalysis;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "c", "getInitials", "d", "Lcom/fourthline/core/Gender;", "getGender", "e", "getNationality", "f", "getIssuingCountry", "g", "Ljava/util/Date;", "getIssueDate", "h", "getExpirationDate", "i", "getDateOfBirth", "j", "getBirthPlace", "k", "getDocumentNumber", "l", "Lcom/fourthline/core/DocumentType;", "getDocumentType", "m", "getDocumentModel", "n", "getTaxIdentificationNumber", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DocumentAnalysis implements Component {
            public static final int $stable = 8;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final String firstName;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final String lastName;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final String initials;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private final Gender gender;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private final String nationality;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private final String issuingCountry;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
            private final Date issueDate;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
            private final Date expirationDate;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private final Date dateOfBirth;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
            private final String birthPlace;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private final String documentNumber;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
            private final DocumentType documentType;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
            private final String documentModel;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final String taxIdentificationNumber;

            public DocumentAnalysis(String str, String str2, String str3, @NotNull Gender gender, String str4, String str5, Date date, Date date2, Date date3, String str6, String str7, DocumentType documentType, String str8, String str9) {
                Intrinsics.checkNotNullParameter(gender, "gender");
                this.firstName = str;
                this.lastName = str2;
                this.initials = str3;
                this.gender = gender;
                this.nationality = str4;
                this.issuingCountry = str5;
                this.issueDate = date;
                this.expirationDate = date2;
                this.dateOfBirth = date3;
                this.birthPlace = str6;
                this.documentNumber = str7;
                this.documentType = documentType;
                this.documentModel = str8;
                this.taxIdentificationNumber = str9;
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getFirstName() {
                return this.firstName;
            }

            /* JADX INFO: renamed from: component10, reason: from getter */
            public final String getBirthPlace() {
                return this.birthPlace;
            }

            /* JADX INFO: renamed from: component11, reason: from getter */
            public final String getDocumentNumber() {
                return this.documentNumber;
            }

            /* JADX INFO: renamed from: component12, reason: from getter */
            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            /* JADX INFO: renamed from: component13, reason: from getter */
            public final String getDocumentModel() {
                return this.documentModel;
            }

            /* JADX INFO: renamed from: component14, reason: from getter */
            public final String getTaxIdentificationNumber() {
                return this.taxIdentificationNumber;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final String getLastName() {
                return this.lastName;
            }

            /* JADX INFO: renamed from: component3, reason: from getter */
            public final String getInitials() {
                return this.initials;
            }

            @NotNull
            /* JADX INFO: renamed from: component4, reason: from getter */
            public final Gender getGender() {
                return this.gender;
            }

            /* JADX INFO: renamed from: component5, reason: from getter */
            public final String getNationality() {
                return this.nationality;
            }

            /* JADX INFO: renamed from: component6, reason: from getter */
            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            /* JADX INFO: renamed from: component7, reason: from getter */
            public final Date getIssueDate() {
                return this.issueDate;
            }

            /* JADX INFO: renamed from: component8, reason: from getter */
            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            /* JADX INFO: renamed from: component9, reason: from getter */
            public final Date getDateOfBirth() {
                return this.dateOfBirth;
            }

            @NotNull
            public final DocumentAnalysis copy(String firstName, String lastName, String initials, @NotNull Gender gender, String nationality, String issuingCountry, Date issueDate, Date expirationDate, Date dateOfBirth, String birthPlace, String documentNumber, DocumentType documentType, String documentModel, String taxIdentificationNumber) {
                Intrinsics.checkNotNullParameter(gender, "gender");
                return new DocumentAnalysis(firstName, lastName, initials, gender, nationality, issuingCountry, issueDate, expirationDate, dateOfBirth, birthPlace, documentNumber, documentType, documentModel, taxIdentificationNumber);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DocumentAnalysis)) {
                    return false;
                }
                DocumentAnalysis documentAnalysis = (DocumentAnalysis) other;
                return Intrinsics.f(this.firstName, documentAnalysis.firstName) && Intrinsics.f(this.lastName, documentAnalysis.lastName) && Intrinsics.f(this.initials, documentAnalysis.initials) && this.gender == documentAnalysis.gender && Intrinsics.f(this.nationality, documentAnalysis.nationality) && Intrinsics.f(this.issuingCountry, documentAnalysis.issuingCountry) && Intrinsics.f(this.issueDate, documentAnalysis.issueDate) && Intrinsics.f(this.expirationDate, documentAnalysis.expirationDate) && Intrinsics.f(this.dateOfBirth, documentAnalysis.dateOfBirth) && Intrinsics.f(this.birthPlace, documentAnalysis.birthPlace) && Intrinsics.f(this.documentNumber, documentAnalysis.documentNumber) && this.documentType == documentAnalysis.documentType && Intrinsics.f(this.documentModel, documentAnalysis.documentModel) && Intrinsics.f(this.taxIdentificationNumber, documentAnalysis.taxIdentificationNumber);
            }

            public final String getBirthPlace() {
                return this.birthPlace;
            }

            public final Date getDateOfBirth() {
                return this.dateOfBirth;
            }

            public final String getDocumentModel() {
                return this.documentModel;
            }

            public final String getDocumentNumber() {
                return this.documentNumber;
            }

            public final DocumentType getDocumentType() {
                return this.documentType;
            }

            public final Date getExpirationDate() {
                return this.expirationDate;
            }

            public final String getFirstName() {
                return this.firstName;
            }

            @NotNull
            public final Gender getGender() {
                return this.gender;
            }

            public final String getInitials() {
                return this.initials;
            }

            public final Date getIssueDate() {
                return this.issueDate;
            }

            public final String getIssuingCountry() {
                return this.issuingCountry;
            }

            public final String getLastName() {
                return this.lastName;
            }

            public final String getNationality() {
                return this.nationality;
            }

            public final String getTaxIdentificationNumber() {
                return this.taxIdentificationNumber;
            }

            public int hashCode() {
                String str = this.firstName;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.lastName;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.initials;
                int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.gender.hashCode()) * 31;
                String str4 = this.nationality;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.issuingCountry;
                int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
                Date date = this.issueDate;
                int iHashCode6 = (iHashCode5 + (date == null ? 0 : date.hashCode())) * 31;
                Date date2 = this.expirationDate;
                int iHashCode7 = (iHashCode6 + (date2 == null ? 0 : date2.hashCode())) * 31;
                Date date3 = this.dateOfBirth;
                int iHashCode8 = (iHashCode7 + (date3 == null ? 0 : date3.hashCode())) * 31;
                String str6 = this.birthPlace;
                int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.documentNumber;
                int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
                DocumentType documentType = this.documentType;
                int iHashCode11 = (iHashCode10 + (documentType == null ? 0 : documentType.hashCode())) * 31;
                String str8 = this.documentModel;
                int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.taxIdentificationNumber;
                return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "DocumentAnalysis(firstName=" + this.firstName + ", lastName=" + this.lastName + ", initials=" + this.initials + ", gender=" + this.gender + ", nationality=" + this.nationality + ", issuingCountry=" + this.issuingCountry + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ", birthPlace=" + this.birthPlace + ", documentNumber=" + this.documentNumber + ", documentType=" + this.documentType + ", documentModel=" + this.documentModel + ", taxIdentificationNumber=" + this.taxIdentificationNumber + ")";
            }

            public /* synthetic */ DocumentAnalysis(String str, String str2, String str3, Gender gender, String str4, String str5, Date date, Date date2, Date date3, String str6, String str7, DocumentType documentType, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, gender, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : date, (i & 128) != 0 ? null : date2, (i & 256) != 0 ? null : date3, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : documentType, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : str9);
            }
        }
    }
}
