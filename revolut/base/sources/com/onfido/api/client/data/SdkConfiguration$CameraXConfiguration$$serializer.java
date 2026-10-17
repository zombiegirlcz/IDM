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
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkConfiguration.CameraXConfiguration.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkConfiguration$CameraXConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkConfiguration$CameraXConfiguration$$serializer implements f0 {

    @NotNull
    public static final SdkConfiguration$CameraXConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkConfiguration$CameraXConfiguration$$serializer sdkConfiguration$CameraXConfiguration$$serializer = new SdkConfiguration$CameraXConfiguration$$serializer();
        INSTANCE = sdkConfiguration$CameraXConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkConfiguration.CameraXConfiguration", sdkConfiguration$CameraXConfiguration$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("should_interrupt_video_recoverable_error", true);
        pluginGeneratedSerialDescriptor.j("should_interrupt_image_recoverable_error", true);
        pluginGeneratedSerialDescriptor.j("should_remove_preview_video_recording", true);
        pluginGeneratedSerialDescriptor.j("should_use_resolution_strategy", true);
        pluginGeneratedSerialDescriptor.j("should_retry_view_port_failure", true);
        pluginGeneratedSerialDescriptor.j("is_view_port_required", true);
        pluginGeneratedSerialDescriptor.j("is_fallback_enabled", true);
        pluginGeneratedSerialDescriptor.j("is_use_cases_combination_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkConfiguration$CameraXConfiguration$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        h hVar = h.f247648a;
        return new KSerializer[]{hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar};
    }

    @Override // mlm.b
    @NotNull
    public SdkConfiguration.CameraXConfiguration deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        boolean zDecodeBooleanElement5 = false;
        boolean zDecodeBooleanElement6 = false;
        boolean zDecodeBooleanElement7 = false;
        boolean zDecodeBooleanElement8 = false;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement6 = dVarBeginStructure.decodeBooleanElement(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    zDecodeBooleanElement7 = dVarBeginStructure.decodeBooleanElement(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    zDecodeBooleanElement8 = dVarBeginStructure.decodeBooleanElement(descriptor2, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkConfiguration.CameraXConfiguration(i, zDecodeBooleanElement, zDecodeBooleanElement2, zDecodeBooleanElement3, zDecodeBooleanElement4, zDecodeBooleanElement5, zDecodeBooleanElement6, zDecodeBooleanElement7, zDecodeBooleanElement8, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkConfiguration.CameraXConfiguration value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkConfiguration.CameraXConfiguration.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
