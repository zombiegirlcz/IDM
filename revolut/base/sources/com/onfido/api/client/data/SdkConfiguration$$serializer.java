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
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkConfiguration.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkConfiguration$$serializer implements f0 {

    @NotNull
    public static final SdkConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkConfiguration$$serializer sdkConfiguration$$serializer = new SdkConfiguration$$serializer();
        INSTANCE = sdkConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkConfiguration", sdkConfiguration$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("validations", true);
        pluginGeneratedSerialDescriptor.j("document_capture", true);
        pluginGeneratedSerialDescriptor.j("experimental_features", true);
        pluginGeneratedSerialDescriptor.j("face_video_capture", true);
        pluginGeneratedSerialDescriptor.j("face_selfie_capture", true);
        pluginGeneratedSerialDescriptor.j("motion_capture", true);
        pluginGeneratedSerialDescriptor.j("sdk_features", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkConfiguration$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        return new KSerializer[]{a.c(SdkConfiguration$Validations$$serializer.INSTANCE), a.c(SdkConfiguration$DocumentCapture$$serializer.INSTANCE), a.c(SdkConfiguration$ExperimentalFeatures$$serializer.INSTANCE), a.c(SdkConfiguration$LivenessCapture$$serializer.INSTANCE), a.c(SdkConfiguration$SelfieCapture$$serializer.INSTANCE), a.c(SdkConfiguration$MotionCapture$$serializer.INSTANCE), a.c(SdkConfiguration$SdkFeatures$$serializer.INSTANCE), a.c(v1.f247718a)};
    }

    @Override // mlm.b
    @NotNull
    public SdkConfiguration deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        int i = 0;
        SdkConfiguration.Validations validations = null;
        SdkConfiguration.DocumentCapture documentCapture = null;
        SdkConfiguration.ExperimentalFeatures experimentalFeatures = null;
        SdkConfiguration.LivenessCapture livenessCapture = null;
        SdkConfiguration.SelfieCapture selfieCapture = null;
        SdkConfiguration.MotionCapture motionCapture = null;
        SdkConfiguration.SdkFeatures sdkFeatures = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    validations = (SdkConfiguration.Validations) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, SdkConfiguration$Validations$$serializer.INSTANCE, validations);
                    i |= 1;
                    break;
                case 1:
                    documentCapture = (SdkConfiguration.DocumentCapture) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, SdkConfiguration$DocumentCapture$$serializer.INSTANCE, documentCapture);
                    i |= 2;
                    break;
                case 2:
                    experimentalFeatures = (SdkConfiguration.ExperimentalFeatures) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, SdkConfiguration$ExperimentalFeatures$$serializer.INSTANCE, experimentalFeatures);
                    i |= 4;
                    break;
                case 3:
                    livenessCapture = (SdkConfiguration.LivenessCapture) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, SdkConfiguration$LivenessCapture$$serializer.INSTANCE, livenessCapture);
                    i |= 8;
                    break;
                case 4:
                    selfieCapture = (SdkConfiguration.SelfieCapture) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 4, SdkConfiguration$SelfieCapture$$serializer.INSTANCE, selfieCapture);
                    i |= 16;
                    break;
                case 5:
                    motionCapture = (SdkConfiguration.MotionCapture) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 5, SdkConfiguration$MotionCapture$$serializer.INSTANCE, motionCapture);
                    i |= 32;
                    break;
                case 6:
                    sdkFeatures = (SdkConfiguration.SdkFeatures) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 6, SdkConfiguration$SdkFeatures$$serializer.INSTANCE, sdkFeatures);
                    i |= 64;
                    break;
                case 7:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 7, v1.f247718a, str);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkConfiguration(i, validations, documentCapture, experimentalFeatures, livenessCapture, selfieCapture, motionCapture, sdkFeatures, str, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkConfiguration value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkConfiguration.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
