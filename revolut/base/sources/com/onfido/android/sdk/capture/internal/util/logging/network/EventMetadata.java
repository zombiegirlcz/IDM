package com.onfido.android.sdk.capture.internal.util.logging.network;

import ch.qos.logback.core.CoreConstants;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 >2\u00020\u0001:\u0002=>B\u0085\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BM\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u0011J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003Jc\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0003HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001J&\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;HÁ\u0001¢\u0006\u0002\b<R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0015R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u0015¨\u0006?"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "", "seen1", "", "os", "", "osVersion", "fingerprint", "model", "manufacturer", "brand", "product", "hardware", "androidApiLevel", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidApiLevel$annotations", "()V", "getAndroidApiLevel", "()Ljava/lang/String;", "getBrand$annotations", "getBrand", "getFingerprint$annotations", "getFingerprint", "getHardware$annotations", "getHardware", "getManufacturer$annotations", "getManufacturer", "getModel$annotations", "getModel", "getOs$annotations", "getOs", "getOsVersion$annotations", "getOsVersion", "getProduct$annotations", "getProduct", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_capture_sdk_core_release", "$serializer", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class EventMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String androidApiLevel;

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

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return EventMetadata$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @d
    public /* synthetic */ EventMetadata(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            j1.f(EventMetadata$$serializer.INSTANCE.getDescriptor(), i, 511);
            throw null;
        }
        this.os = str;
        this.osVersion = str2;
        this.fingerprint = str3;
        this.model = str4;
        this.manufacturer = str5;
        this.brand = str6;
        this.product = str7;
        this.hardware = str8;
        this.androidApiLevel = str9;
    }

    public static /* synthetic */ EventMetadata copy$default(EventMetadata eventMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = eventMetadata.os;
        }
        if ((i & 2) != 0) {
            str2 = eventMetadata.osVersion;
        }
        if ((i & 4) != 0) {
            str3 = eventMetadata.fingerprint;
        }
        if ((i & 8) != 0) {
            str4 = eventMetadata.model;
        }
        if ((i & 16) != 0) {
            str5 = eventMetadata.manufacturer;
        }
        if ((i & 32) != 0) {
            str6 = eventMetadata.brand;
        }
        if ((i & 64) != 0) {
            str7 = eventMetadata.product;
        }
        if ((i & 128) != 0) {
            str8 = eventMetadata.hardware;
        }
        if ((i & 256) != 0) {
            str9 = eventMetadata.androidApiLevel;
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = str6;
        String str13 = str7;
        String str14 = str5;
        String str15 = str3;
        return eventMetadata.copy(str, str2, str15, str4, str14, str12, str13, str10, str11);
    }

    public static /* synthetic */ void getAndroidApiLevel$annotations() {
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

    public static final /* synthetic */ void write$Self$onfido_capture_sdk_core_release(EventMetadata self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.os);
        output.encodeStringElement(serialDesc, 1, self.osVersion);
        output.encodeStringElement(serialDesc, 2, self.fingerprint);
        output.encodeStringElement(serialDesc, 3, self.model);
        output.encodeStringElement(serialDesc, 4, self.manufacturer);
        output.encodeStringElement(serialDesc, 5, self.brand);
        output.encodeStringElement(serialDesc, 6, self.product);
        output.encodeStringElement(serialDesc, 7, self.hardware);
        output.encodeStringElement(serialDesc, 8, self.androidApiLevel);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHardware() {
        return this.hardware;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
    }

    @NotNull
    public final EventMetadata copy(@NotNull String os4, @NotNull String osVersion, @NotNull String fingerprint, @NotNull String model, @NotNull String manufacturer, @NotNull String brand, @NotNull String product, @NotNull String hardware, @NotNull String androidApiLevel) {
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        return new EventMetadata(os4, osVersion, fingerprint, model, manufacturer, brand, product, hardware, androidApiLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) other;
        return Intrinsics.f(this.os, eventMetadata.os) && Intrinsics.f(this.osVersion, eventMetadata.osVersion) && Intrinsics.f(this.fingerprint, eventMetadata.fingerprint) && Intrinsics.f(this.model, eventMetadata.model) && Intrinsics.f(this.manufacturer, eventMetadata.manufacturer) && Intrinsics.f(this.brand, eventMetadata.brand) && Intrinsics.f(this.product, eventMetadata.product) && Intrinsics.f(this.hardware, eventMetadata.hardware) && Intrinsics.f(this.androidApiLevel, eventMetadata.androidApiLevel);
    }

    @NotNull
    public final String getAndroidApiLevel() {
        return this.androidApiLevel;
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
        return this.androidApiLevel.hashCode() + a.c(a.c(a.c(a.c(a.c(a.c(a.c(this.os.hashCode() * 31, 31, this.osVersion), 31, this.fingerprint), 31, this.model), 31, this.manufacturer), 31, this.brand), 31, this.product), 31, this.hardware);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("EventMetadata(os=");
        sb6.append(this.os);
        sb6.append(", osVersion=");
        sb6.append(this.osVersion);
        sb6.append(", fingerprint=");
        sb6.append(this.fingerprint);
        sb6.append(", model=");
        sb6.append(this.model);
        sb6.append(", manufacturer=");
        sb6.append(this.manufacturer);
        sb6.append(", brand=");
        sb6.append(this.brand);
        sb6.append(", product=");
        sb6.append(this.product);
        sb6.append(", hardware=");
        sb6.append(this.hardware);
        sb6.append(", androidApiLevel=");
        return j6.a.u(sb6, this.androidApiLevel, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public EventMetadata(@NotNull String os4, @NotNull String osVersion, @NotNull String fingerprint, @NotNull String model, @NotNull String manufacturer, @NotNull String brand, @NotNull String product, @NotNull String hardware, @NotNull String androidApiLevel) {
        Intrinsics.checkNotNullParameter(os4, "os");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(fingerprint, "fingerprint");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(hardware, "hardware");
        Intrinsics.checkNotNullParameter(androidApiLevel, "androidApiLevel");
        this.os = os4;
        this.osVersion = osVersion;
        this.fingerprint = fingerprint;
        this.model = model;
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.product = product;
        this.hardware = hardware;
        this.androidApiLevel = androidApiLevel;
    }
}
