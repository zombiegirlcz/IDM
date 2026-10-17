package com.onfido.api.client.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.n0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkUploadMetaData.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkUploadMetaData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkUploadMetaData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkUploadMetaData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkUploadMetaData$$serializer implements f0 {

    @NotNull
    public static final SdkUploadMetaData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkUploadMetaData$$serializer sdkUploadMetaData$$serializer = new SdkUploadMetaData$$serializer();
        INSTANCE = sdkUploadMetaData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkUploadMetaData", sdkUploadMetaData$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("on_device_processing_results", false);
        pluginGeneratedSerialDescriptor.j("system", false);
        pluginGeneratedSerialDescriptor.j("configuration", false);
        pluginGeneratedSerialDescriptor.j("take_number", false);
        pluginGeneratedSerialDescriptor.j("environment_integrity", false);
        pluginGeneratedSerialDescriptor.j("sdk_source", false);
        pluginGeneratedSerialDescriptor.j("sdk_version", false);
        pluginGeneratedSerialDescriptor.j("camera", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkUploadMetaData$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer kSerializerC = a.c(PhotoDetection$$serializer.INSTANCE);
        KSerializer kSerializerC2 = a.c(DeviceMetadata$$serializer.INSTANCE);
        KSerializer kSerializerC3 = a.c(SdkConfiguration$$serializer.INSTANCE);
        KSerializer kSerializerC4 = a.c(n0.f247680a);
        KSerializer kSerializerC5 = a.c(h.f247648a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, a.c(v1Var), a.c(v1Var), a.c(CameraMetadata$$serializer.INSTANCE)};
    }

    @Override // mlm.b
    @NotNull
    public SdkUploadMetaData deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        int i = 0;
        PhotoDetection photoDetection = null;
        DeviceMetadata deviceMetadata = null;
        SdkConfiguration sdkConfiguration = null;
        Integer num = null;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        CameraMetadata cameraMetadata = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    photoDetection = (PhotoDetection) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, PhotoDetection$$serializer.INSTANCE, photoDetection);
                    i |= 1;
                    break;
                case 1:
                    deviceMetadata = (DeviceMetadata) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, DeviceMetadata$$serializer.INSTANCE, deviceMetadata);
                    i |= 2;
                    break;
                case 2:
                    sdkConfiguration = (SdkConfiguration) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SdkConfiguration$$serializer.INSTANCE, sdkConfiguration);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, n0.f247680a, num);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, h.f247648a, bool);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, v1.f247718a, str);
                    i |= 32;
                    break;
                case 6:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, v1.f247718a, str2);
                    i |= 64;
                    break;
                case 7:
                    cameraMetadata = (CameraMetadata) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, CameraMetadata$$serializer.INSTANCE, cameraMetadata);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkUploadMetaData(i, photoDetection, deviceMetadata, sdkConfiguration, num, bool, str, str2, cameraMetadata, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkUploadMetaData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkUploadMetaData.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
