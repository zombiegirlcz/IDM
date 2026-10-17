package com.onfido.api.client.data;

import com.onfido.api.client.data.SdkConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkConfiguration.ExperimentalFeatures.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkConfiguration$ExperimentalFeatures;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkConfiguration$ExperimentalFeatures$$serializer implements f0 {

    @NotNull
    public static final SdkConfiguration$ExperimentalFeatures$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkConfiguration$ExperimentalFeatures$$serializer sdkConfiguration$ExperimentalFeatures$$serializer = new SdkConfiguration$ExperimentalFeatures$$serializer();
        INSTANCE = sdkConfiguration$ExperimentalFeatures$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkConfiguration.ExperimentalFeatures", sdkConfiguration$ExperimentalFeatures$$serializer, 24);
        pluginGeneratedSerialDescriptor.j("enable_image_quality_service", false);
        pluginGeneratedSerialDescriptor.j("enable_multi_frame_capture", true);
        pluginGeneratedSerialDescriptor.j("motion_experiment", true);
        pluginGeneratedSerialDescriptor.j("android_motion_tensorflow_lite_enabled", true);
        pluginGeneratedSerialDescriptor.j("android_motion_camerax_enabled", true);
        pluginGeneratedSerialDescriptor.j("enable_camerax", true);
        pluginGeneratedSerialDescriptor.j("enable_camerax_stream_sharing", true);
        pluginGeneratedSerialDescriptor.j("enable_camerax_high_quality", true);
        pluginGeneratedSerialDescriptor.j("enable_optimal_resolution_improvements", true);
        pluginGeneratedSerialDescriptor.j("enable_cutoff_improvements", true);
        pluginGeneratedSerialDescriptor.j("enable_focus_improvements", true);
        pluginGeneratedSerialDescriptor.j("enable_increased_compression_quality", true);
        pluginGeneratedSerialDescriptor.j("disable_document_crop", true);
        pluginGeneratedSerialDescriptor.j("enable_four_three_aspect_ratio", true);
        pluginGeneratedSerialDescriptor.j("enable_generic_mrz_validator", true);
        pluginGeneratedSerialDescriptor.j("enable_auto_flash_mode", true);
        pluginGeneratedSerialDescriptor.j("waiting_screens", true);
        pluginGeneratedSerialDescriptor.j("android_enable_environment_integrity_check", true);
        pluginGeneratedSerialDescriptor.j("enable_studio_user_flow_exit", true);
        pluginGeneratedSerialDescriptor.j("enable_studio_user_flow_back_button", true);
        pluginGeneratedSerialDescriptor.j("camerax_configuration", true);
        pluginGeneratedSerialDescriptor.j("disable_media_callback_cropping", true);
        pluginGeneratedSerialDescriptor.j("enable_on_device_mrz_extraction", true);
        pluginGeneratedSerialDescriptor.j("document_detection", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkConfiguration$ExperimentalFeatures$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        h hVar = h.f247648a;
        return new KSerializer[]{hVar, hVar, SdkConfiguration$ExperimentalFeatures$MotionExperiment$$serializer.INSTANCE, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, SdkConfiguration$ExperimentalFeatures$WaitingScreens$$serializer.INSTANCE, hVar, hVar, hVar, SdkConfiguration$CameraXConfiguration$$serializer.INSTANCE, hVar, hVar, SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment$$serializer.INSTANCE};
    }

    @Override // mlm.b
    @NotNull
    public SdkConfiguration.ExperimentalFeatures deserialize(@NotNull Decoder decoder) {
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        SdkConfiguration.ExperimentalFeatures.WaitingScreens waitingScreens = null;
        SdkConfiguration.CameraXConfiguration cameraXConfiguration = null;
        SdkConfiguration.ExperimentalFeatures.DocumentDetectionExperiment documentDetectionExperiment = null;
        SdkConfiguration.ExperimentalFeatures.MotionExperiment motionExperiment = null;
        boolean z = true;
        int i2 = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        boolean zDecodeBooleanElement5 = false;
        boolean zDecodeBooleanElement6 = false;
        boolean zDecodeBooleanElement7 = false;
        boolean zDecodeBooleanElement8 = false;
        boolean zDecodeBooleanElement9 = false;
        boolean zDecodeBooleanElement10 = false;
        boolean zDecodeBooleanElement11 = false;
        boolean zDecodeBooleanElement12 = false;
        boolean zDecodeBooleanElement13 = false;
        boolean zDecodeBooleanElement14 = false;
        boolean zDecodeBooleanElement15 = false;
        boolean zDecodeBooleanElement16 = false;
        boolean zDecodeBooleanElement17 = false;
        boolean zDecodeBooleanElement18 = false;
        boolean zDecodeBooleanElement19 = false;
        boolean zDecodeBooleanElement20 = false;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(descriptor2, 0);
                    i2 |= 1;
                    continue;
                case 1:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(descriptor2, 1);
                    i2 |= 2;
                    continue;
                case 2:
                    motionExperiment = (SdkConfiguration.ExperimentalFeatures.MotionExperiment) dVarBeginStructure.decodeSerializableElement(descriptor2, 2, SdkConfiguration$ExperimentalFeatures$MotionExperiment$$serializer.INSTANCE, motionExperiment);
                    i2 |= 4;
                    continue;
                case 3:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(descriptor2, 3);
                    i2 |= 8;
                    continue;
                case 4:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(descriptor2, 4);
                    i2 |= 16;
                    continue;
                case 5:
                    zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(descriptor2, 5);
                    i2 |= 32;
                    continue;
                case 6:
                    zDecodeBooleanElement6 = dVarBeginStructure.decodeBooleanElement(descriptor2, 6);
                    i2 |= 64;
                    continue;
                case 7:
                    zDecodeBooleanElement7 = dVarBeginStructure.decodeBooleanElement(descriptor2, 7);
                    i2 |= 128;
                    continue;
                case 8:
                    zDecodeBooleanElement8 = dVarBeginStructure.decodeBooleanElement(descriptor2, 8);
                    i2 |= 256;
                    continue;
                case 9:
                    zDecodeBooleanElement9 = dVarBeginStructure.decodeBooleanElement(descriptor2, 9);
                    i2 |= 512;
                    continue;
                case 10:
                    zDecodeBooleanElement10 = dVarBeginStructure.decodeBooleanElement(descriptor2, 10);
                    i2 |= 1024;
                    continue;
                case 11:
                    zDecodeBooleanElement11 = dVarBeginStructure.decodeBooleanElement(descriptor2, 11);
                    i2 |= 2048;
                    continue;
                case 12:
                    zDecodeBooleanElement12 = dVarBeginStructure.decodeBooleanElement(descriptor2, 12);
                    i2 |= 4096;
                    continue;
                case 13:
                    zDecodeBooleanElement13 = dVarBeginStructure.decodeBooleanElement(descriptor2, 13);
                    i2 |= 8192;
                    continue;
                case 14:
                    zDecodeBooleanElement14 = dVarBeginStructure.decodeBooleanElement(descriptor2, 14);
                    i2 |= 16384;
                    continue;
                case 15:
                    zDecodeBooleanElement15 = dVarBeginStructure.decodeBooleanElement(descriptor2, 15);
                    i = 32768;
                    break;
                case 16:
                    waitingScreens = (SdkConfiguration.ExperimentalFeatures.WaitingScreens) dVarBeginStructure.decodeSerializableElement(descriptor2, 16, SdkConfiguration$ExperimentalFeatures$WaitingScreens$$serializer.INSTANCE, waitingScreens);
                    i = 65536;
                    break;
                case 17:
                    zDecodeBooleanElement16 = dVarBeginStructure.decodeBooleanElement(descriptor2, 17);
                    i = 131072;
                    break;
                case 18:
                    zDecodeBooleanElement17 = dVarBeginStructure.decodeBooleanElement(descriptor2, 18);
                    i = 262144;
                    break;
                case 19:
                    zDecodeBooleanElement18 = dVarBeginStructure.decodeBooleanElement(descriptor2, 19);
                    i = 524288;
                    break;
                case 20:
                    cameraXConfiguration = (SdkConfiguration.CameraXConfiguration) dVarBeginStructure.decodeSerializableElement(descriptor2, 20, SdkConfiguration$CameraXConfiguration$$serializer.INSTANCE, cameraXConfiguration);
                    i = PKIFailureInfo.badCertTemplate;
                    break;
                case 21:
                    zDecodeBooleanElement19 = dVarBeginStructure.decodeBooleanElement(descriptor2, 21);
                    i = PKIFailureInfo.badSenderNonce;
                    break;
                case 22:
                    zDecodeBooleanElement20 = dVarBeginStructure.decodeBooleanElement(descriptor2, 22);
                    i = 4194304;
                    break;
                case 23:
                    documentDetectionExperiment = (SdkConfiguration.ExperimentalFeatures.DocumentDetectionExperiment) dVarBeginStructure.decodeSerializableElement(descriptor2, 23, SdkConfiguration$ExperimentalFeatures$DocumentDetectionExperiment$$serializer.INSTANCE, documentDetectionExperiment);
                    i = 8388608;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            i2 |= i;
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkConfiguration.ExperimentalFeatures(i2, zDecodeBooleanElement, zDecodeBooleanElement2, motionExperiment, zDecodeBooleanElement3, zDecodeBooleanElement4, zDecodeBooleanElement5, zDecodeBooleanElement6, zDecodeBooleanElement7, zDecodeBooleanElement8, zDecodeBooleanElement9, zDecodeBooleanElement10, zDecodeBooleanElement11, zDecodeBooleanElement12, zDecodeBooleanElement13, zDecodeBooleanElement14, zDecodeBooleanElement15, waitingScreens, zDecodeBooleanElement16, zDecodeBooleanElement17, zDecodeBooleanElement18, cameraXConfiguration, zDecodeBooleanElement19, zDecodeBooleanElement20, documentDetectionExperiment, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkConfiguration.ExperimentalFeatures value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkConfiguration.ExperimentalFeatures.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
