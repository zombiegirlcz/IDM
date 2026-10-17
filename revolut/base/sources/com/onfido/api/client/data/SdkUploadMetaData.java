package com.onfido.api.client.data;

import com.onfido.api.client.data.PhotoDetection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002GHBs\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014By\b\u0011\u0012\u0006\u0010\u0015\u001a\u00020\f\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBU\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u001bJ\u000b\u00100\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÂ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\nHÂ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0002\u00104J\u0010\u00105\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010$J\u000b\u00106\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0013HÆ\u0003Jn\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020\u000e2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\fHÖ\u0001J\t\u0010>\u001a\u00020\u0010HÖ\u0001J&\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020EHÁ\u0001¢\u0006\u0002\bFR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b \u0010\u001dR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\u001dR \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010%\u0012\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010(R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\n\n\u0002\u0010*\u0012\u0004\b)\u0010\u001dR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001d\u001a\u0004\b,\u0010-R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010-¨\u0006I"}, d2 = {"Lcom/onfido/api/client/data/SdkUploadMetaData;", "", "wasGlareDetected", "Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;", "blurDetection", "barcodeDetected", "mrzDetection", "deviceMetadata", "Lcom/onfido/api/client/data/DeviceMetadata;", "configuration", "Lcom/onfido/api/client/data/SdkConfiguration;", "photoTakenCount", "", "hasEnvironmentIntegrity", "", "sdkSource", "", "sdkVersion", "cameraMetadata", "Lcom/onfido/api/client/data/CameraMetadata;", "(Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/PhotoDetection$ProcessingResult;Lcom/onfido/api/client/data/DeviceMetadata;Lcom/onfido/api/client/data/SdkConfiguration;Ljava/lang/Integer;ZLjava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/CameraMetadata;)V", "seen1", "photoDetection", "Lcom/onfido/api/client/data/PhotoDetection;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/onfido/api/client/data/PhotoDetection;Lcom/onfido/api/client/data/DeviceMetadata;Lcom/onfido/api/client/data/SdkConfiguration;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/CameraMetadata;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/onfido/api/client/data/PhotoDetection;Lcom/onfido/api/client/data/DeviceMetadata;Lcom/onfido/api/client/data/SdkConfiguration;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/CameraMetadata;)V", "getCameraMetadata$annotations", "()V", "getCameraMetadata", "()Lcom/onfido/api/client/data/CameraMetadata;", "getConfiguration$annotations", "getDeviceMetadata$annotations", "getHasEnvironmentIntegrity$annotations", "getHasEnvironmentIntegrity", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPhotoDetection$annotations", "getPhotoDetection", "()Lcom/onfido/api/client/data/PhotoDetection;", "getPhotoTakenCount$annotations", "Ljava/lang/Integer;", "getSdkSource$annotations", "getSdkSource", "()Ljava/lang/String;", "getSdkVersion$annotations", "getSdkVersion", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "copy", "(Lcom/onfido/api/client/data/PhotoDetection;Lcom/onfido/api/client/data/DeviceMetadata;Lcom/onfido/api/client/data/SdkConfiguration;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/onfido/api/client/data/CameraMetadata;)Lcom/onfido/api/client/data/SdkUploadMetaData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class SdkUploadMetaData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final CameraMetadata cameraMetadata;
    private final SdkConfiguration configuration;
    private final DeviceMetadata deviceMetadata;
    private final Boolean hasEnvironmentIntegrity;
    private final PhotoDetection photoDetection;
    private final Integer photoTakenCount;
    private final String sdkSource;
    private final String sdkVersion;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/SdkUploadMetaData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SdkUploadMetaData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ SdkUploadMetaData(int i, PhotoDetection photoDetection, DeviceMetadata deviceMetadata, SdkConfiguration sdkConfiguration, Integer num, Boolean bool, String str, String str2, CameraMetadata cameraMetadata, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            j1.f(SdkUploadMetaData$$serializer.INSTANCE.getDescriptor(), i, 255);
            throw null;
        }
        this.photoDetection = photoDetection;
        this.deviceMetadata = deviceMetadata;
        this.configuration = sdkConfiguration;
        this.photoTakenCount = num;
        this.hasEnvironmentIntegrity = bool;
        this.sdkSource = str;
        this.sdkVersion = str2;
        this.cameraMetadata = cameraMetadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final DeviceMetadata getDeviceMetadata() {
        return this.deviceMetadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final SdkConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final Integer getPhotoTakenCount() {
        return this.photoTakenCount;
    }

    public static /* synthetic */ SdkUploadMetaData copy$default(SdkUploadMetaData sdkUploadMetaData, PhotoDetection photoDetection, DeviceMetadata deviceMetadata, SdkConfiguration sdkConfiguration, Integer num, Boolean bool, String str, String str2, CameraMetadata cameraMetadata, int i, Object obj2) {
        if ((i & 1) != 0) {
            photoDetection = sdkUploadMetaData.photoDetection;
        }
        if ((i & 2) != 0) {
            deviceMetadata = sdkUploadMetaData.deviceMetadata;
        }
        if ((i & 4) != 0) {
            sdkConfiguration = sdkUploadMetaData.configuration;
        }
        if ((i & 8) != 0) {
            num = sdkUploadMetaData.photoTakenCount;
        }
        if ((i & 16) != 0) {
            bool = sdkUploadMetaData.hasEnvironmentIntegrity;
        }
        if ((i & 32) != 0) {
            str = sdkUploadMetaData.sdkSource;
        }
        if ((i & 64) != 0) {
            str2 = sdkUploadMetaData.sdkVersion;
        }
        if ((i & 128) != 0) {
            cameraMetadata = sdkUploadMetaData.cameraMetadata;
        }
        String str3 = str2;
        CameraMetadata cameraMetadata2 = cameraMetadata;
        Boolean bool2 = bool;
        String str4 = str;
        return sdkUploadMetaData.copy(photoDetection, deviceMetadata, sdkConfiguration, num, bool2, str4, str3, cameraMetadata2);
    }

    public static /* synthetic */ void getCameraMetadata$annotations() {
    }

    private static /* synthetic */ void getConfiguration$annotations() {
    }

    private static /* synthetic */ void getDeviceMetadata$annotations() {
    }

    public static /* synthetic */ void getHasEnvironmentIntegrity$annotations() {
    }

    public static /* synthetic */ void getPhotoDetection$annotations() {
    }

    private static /* synthetic */ void getPhotoTakenCount$annotations() {
    }

    public static /* synthetic */ void getSdkSource$annotations() {
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(SdkUploadMetaData self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, PhotoDetection$$serializer.INSTANCE, self.photoDetection);
        output.encodeNullableSerializableElement(serialDesc, 1, DeviceMetadata$$serializer.INSTANCE, self.deviceMetadata);
        output.encodeNullableSerializableElement(serialDesc, 2, SdkConfiguration$$serializer.INSTANCE, self.configuration);
        output.encodeNullableSerializableElement(serialDesc, 3, n0.f247680a, self.photoTakenCount);
        output.encodeNullableSerializableElement(serialDesc, 4, h.f247648a, self.hasEnvironmentIntegrity);
        v1 v1Var = v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 5, v1Var, self.sdkSource);
        output.encodeNullableSerializableElement(serialDesc, 6, v1Var, self.sdkVersion);
        output.encodeNullableSerializableElement(serialDesc, 7, CameraMetadata$$serializer.INSTANCE, self.cameraMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PhotoDetection getPhotoDetection() {
        return this.photoDetection;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getHasEnvironmentIntegrity() {
        return this.hasEnvironmentIntegrity;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSdkSource() {
        return this.sdkSource;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final CameraMetadata getCameraMetadata() {
        return this.cameraMetadata;
    }

    @NotNull
    public final SdkUploadMetaData copy(PhotoDetection photoDetection, DeviceMetadata deviceMetadata, SdkConfiguration configuration, Integer photoTakenCount, Boolean hasEnvironmentIntegrity, String sdkSource, String sdkVersion, CameraMetadata cameraMetadata) {
        return new SdkUploadMetaData(photoDetection, deviceMetadata, configuration, photoTakenCount, hasEnvironmentIntegrity, sdkSource, sdkVersion, cameraMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkUploadMetaData)) {
            return false;
        }
        SdkUploadMetaData sdkUploadMetaData = (SdkUploadMetaData) other;
        return Intrinsics.f(this.photoDetection, sdkUploadMetaData.photoDetection) && Intrinsics.f(this.deviceMetadata, sdkUploadMetaData.deviceMetadata) && Intrinsics.f(this.configuration, sdkUploadMetaData.configuration) && Intrinsics.f(this.photoTakenCount, sdkUploadMetaData.photoTakenCount) && Intrinsics.f(this.hasEnvironmentIntegrity, sdkUploadMetaData.hasEnvironmentIntegrity) && Intrinsics.f(this.sdkSource, sdkUploadMetaData.sdkSource) && Intrinsics.f(this.sdkVersion, sdkUploadMetaData.sdkVersion) && Intrinsics.f(this.cameraMetadata, sdkUploadMetaData.cameraMetadata);
    }

    public final CameraMetadata getCameraMetadata() {
        return this.cameraMetadata;
    }

    public final Boolean getHasEnvironmentIntegrity() {
        return this.hasEnvironmentIntegrity;
    }

    public final PhotoDetection getPhotoDetection() {
        return this.photoDetection;
    }

    public final String getSdkSource() {
        return this.sdkSource;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        PhotoDetection photoDetection = this.photoDetection;
        int iHashCode = (photoDetection == null ? 0 : photoDetection.hashCode()) * 31;
        DeviceMetadata deviceMetadata = this.deviceMetadata;
        int iHashCode2 = (iHashCode + (deviceMetadata == null ? 0 : deviceMetadata.hashCode())) * 31;
        SdkConfiguration sdkConfiguration = this.configuration;
        int iHashCode3 = (iHashCode2 + (sdkConfiguration == null ? 0 : sdkConfiguration.hashCode())) * 31;
        Integer num = this.photoTakenCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.hasEnvironmentIntegrity;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.sdkSource;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sdkVersion;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CameraMetadata cameraMetadata = this.cameraMetadata;
        return iHashCode7 + (cameraMetadata != null ? cameraMetadata.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SdkUploadMetaData(photoDetection=" + this.photoDetection + ", deviceMetadata=" + this.deviceMetadata + ", configuration=" + this.configuration + ", photoTakenCount=" + this.photoTakenCount + ", hasEnvironmentIntegrity=" + this.hasEnvironmentIntegrity + ", sdkSource=" + this.sdkSource + ", sdkVersion=" + this.sdkVersion + ", cameraMetadata=" + this.cameraMetadata + ")";
    }

    public SdkUploadMetaData(PhotoDetection photoDetection, DeviceMetadata deviceMetadata, SdkConfiguration sdkConfiguration, Integer num, Boolean bool, String str, String str2, CameraMetadata cameraMetadata) {
        this.photoDetection = photoDetection;
        this.deviceMetadata = deviceMetadata;
        this.configuration = sdkConfiguration;
        this.photoTakenCount = num;
        this.hasEnvironmentIntegrity = bool;
        this.sdkSource = str;
        this.sdkVersion = str2;
        this.cameraMetadata = cameraMetadata;
    }

    public SdkUploadMetaData(PhotoDetection.ProcessingResult processingResult, PhotoDetection.ProcessingResult processingResult2, PhotoDetection.ProcessingResult processingResult3, PhotoDetection.ProcessingResult processingResult4, DeviceMetadata deviceMetadata, SdkConfiguration sdkConfiguration, Integer num, boolean z, String str, String str2, CameraMetadata cameraMetadata) {
        this(new PhotoDetection(processingResult, processingResult2, processingResult3, processingResult4), deviceMetadata, sdkConfiguration, num, Boolean.valueOf(z), str, str2, cameraMetadata);
    }
}
