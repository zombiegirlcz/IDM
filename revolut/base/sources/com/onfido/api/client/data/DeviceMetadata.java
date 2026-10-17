package com.onfido.api.client.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002ABB\u0091\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011BY\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003Jm\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0003HÖ\u0001J\t\u00108\u001a\u00020\u0005HÖ\u0001J&\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?HÁ\u0001¢\u0006\u0002\b@R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0014\u001a\u0004\b(\u0010\u0016¨\u0006C"}, d2 = {"Lcom/onfido/api/client/data/DeviceMetadata;", "", "seen1", "", "fingerprint", "", "model", "manufacturer", "brand", "product", "hardware", "androidApiLevel", "androidVersionNumber", "os", "osVersion", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidApiLevel$annotations", "()V", "getAndroidApiLevel", "()Ljava/lang/String;", "getAndroidVersionNumber$annotations", "getAndroidVersionNumber", "getBrand$annotations", "getBrand", "getFingerprint$annotations", "getFingerprint", "getHardware$annotations", "getHardware", "getManufacturer$annotations", "getManufacturer", "getModel$annotations", "getModel", "getOs$annotations", "getOs", "getOsVersion$annotations", "getOsVersion", "getProduct$annotations", "getProduct", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class DeviceMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String androidApiLevel;

    @NotNull
    private final String androidVersionNumber;

    @NotNull
    private final String brand;

    @NotNull
    private final String fingerprint;

    @NotNull
    private final String hardware;

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osVersion;

    @NotNull
    private final String product;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/DeviceMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/DeviceMetadata;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return DeviceMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ DeviceMetadata(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            j1.f(DeviceMetadata$$serializer.INSTANCE.getDescriptor(), i, 255);
            throw null;
        }
        this.fingerprint = str;
        this.model = str2;
        this.manufacturer = str3;
        this.brand = str4;
        this.product = str5;
        this.hardware = str6;
        this.androidApiLevel = str7;
        this.androidVersionNumber = str8;
        if ((i & 256) == 0) {
            this.os = "android";
        } else {
            this.os = str9;
        }
        if ((i & 512) == 0) {
            this.osVersion = str8;
        } else {
            this.osVersion = str10;
        }
    }

    public static /* synthetic */ DeviceMetadata copy$default(DeviceMetadata deviceMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = deviceMetadata.fingerprint;
        }
        if ((i & 2) != 0) {
            str2 = deviceMetadata.model;
        }
        if ((i & 4) != 0) {
            str3 = deviceMetadata.manufacturer;
        }
        if ((i & 8) != 0) {
            str4 = deviceMetadata.brand;
        }
        if ((i & 16) != 0) {
            str5 = deviceMetadata.product;
        }
        if ((i & 32) != 0) {
            str6 = deviceMetadata.hardware;
        }
        if ((i & 64) != 0) {
            str7 = deviceMetadata.androidApiLevel;
        }
        if ((i & 128) != 0) {
            str8 = deviceMetadata.androidVersionNumber;
        }
        if ((i & 256) != 0) {
            str9 = deviceMetadata.os;
        }
        if ((i & 512) != 0) {
            str10 = deviceMetadata.osVersion;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return deviceMetadata.copy(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    public static /* synthetic */ void getAndroidApiLevel$annotations() {
    }

    public static /* synthetic */ void getAndroidVersionNumber$annotations() {
    }

    public static /* synthetic */ void getBrand$annotations() {
    }

    public static /* synthetic */ void getFingerprint$annotations() {
    }

    public static /* synthetic */ void getHardware$annotations() {
    }

    public static /* synthetic */ void getManufacturer$annotations() {
    }

    public static /* synthetic */ void getModel$annotations() {
    }

    public static /* synthetic */ void getOs$annotations() {
    }

    public static /* synthetic */ void getOsVersion$annotations() {
    }

    public static /* synthetic */ void getProduct$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(DeviceMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.fingerprint);
        output.encodeStringElement(serialDesc, 1, self.model);
        output.encodeStringElement(serialDesc, 2, self.manufacturer);
        output.encodeStringElement(serialDesc, 3, self.brand);
        output.encodeStringElement(serialDesc, 4, self.product);
        output.encodeStringElement(serialDesc, 5, self.hardware);
        output.encodeStringElement(serialDesc, 6, self.androidApiLevel);
        output.encodeStringElement(serialDesc, 7, self.androidVersionNumber);
        if (output.d(serialDesc) || !Intrinsics.f(self.os, "android")) {
            output.encodeStringElement(serialDesc, 8, self.os);
        }
        if (!output.d(serialDesc) && Intrinsics.f(self.osVersion, self.androidVersionNumber)) {
            return;
        }
        output.encodeStringElement(serialDesc, 9, self.osVersion);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHardware() {
        return this.hardware;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAndroidVersionNumber() {
        return this.androidVersionNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final DeviceMetadata copy(@NotNull String fingerprint, @NotNull String model, @NotNull String manufacturer, @NotNull String brand, @NotNull String product, @NotNull String hardware, @NotNull String androidApiLevel, @NotNull String androidVersionNumber, @NotNull String os4, @NotNull String osVersion) {
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        Intrinsics.checkNotNullParameter(androidVersionNumber, "androidVersionNumber");
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        return new DeviceMetadata(fingerprint, model, manufacturer, brand, product, hardware, androidApiLevel, androidVersionNumber, os4, osVersion);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetadata)) {
            return false;
        }
        DeviceMetadata deviceMetadata = (DeviceMetadata) other;
        return Intrinsics.f(this.fingerprint, deviceMetadata.fingerprint) && Intrinsics.f(this.model, deviceMetadata.model) && Intrinsics.f(this.manufacturer, deviceMetadata.manufacturer) && Intrinsics.f(this.brand, deviceMetadata.brand) && Intrinsics.f(this.product, deviceMetadata.product) && Intrinsics.f(this.hardware, deviceMetadata.hardware) && Intrinsics.f(this.androidApiLevel, deviceMetadata.androidApiLevel) && Intrinsics.f(this.androidVersionNumber, deviceMetadata.androidVersionNumber) && Intrinsics.f(this.os, deviceMetadata.os) && Intrinsics.f(this.osVersion, deviceMetadata.osVersion);
    }

    @NotNull
    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    @NotNull
    public final String getAndroidVersionNumber() {
        return this.androidVersionNumber;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @NotNull
    public final String getHardware() {
        return this.hardware;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.osVersion.hashCode() + a.c(a.c(a.c(a.c(a.c(a.c(a.c(a.c(this.fingerprint.hashCode() * 31, 31, this.model), 31, this.manufacturer), 31, this.brand), 31, this.product), 31, this.hardware), 31, this.androidApiLevel), 31, this.androidVersionNumber), 31, this.os);
    }

    @NotNull
    public String toString() {
        String str = this.fingerprint;
        String str2 = this.model;
        String str3 = this.manufacturer;
        String str4 = this.brand;
        String str5 = this.product;
        String str6 = this.hardware;
        String str7 = this.androidApiLevel;
        String str8 = this.androidVersionNumber;
        String str9 = this.os;
        String str10 = this.osVersion;
        StringBuilder sbM = v0.a.m("DeviceMetadata(fingerprint=", str, ", model=", str2, ", manufacturer=");
        j6.a.D(sbM, str3, ", brand=", str4, ", product=");
        j6.a.D(sbM, str5, ", hardware=", str6, ", androidApiLevel=");
        j6.a.D(sbM, str7, ", androidVersionNumber=", str8, ", os=");
        return j6.a.w(sbM, str9, ", osVersion=", str10, ")");
    }

    public DeviceMetadata(@NotNull String fingerprint, @NotNull String model, @NotNull String manufacturer, @NotNull String brand, @NotNull String product, @NotNull String hardware, @NotNull String androidApiLevel, @NotNull String androidVersionNumber, @NotNull String os4, @NotNull String osVersion) {
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        Intrinsics.checkNotNullParameter(androidVersionNumber, "androidVersionNumber");
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        this.fingerprint = fingerprint;
        this.model = model;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.product = product;
        this.hardware = hardware;
        this.androidApiLevel = androidApiLevel;
        this.androidVersionNumber = androidVersionNumber;
        this.os = os4;
        this.osVersion = osVersion;
    }

    public /* synthetic */ DeviceMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? "android" : str9, (i & 512) != 0 ? str8 : str10);
    }
}
