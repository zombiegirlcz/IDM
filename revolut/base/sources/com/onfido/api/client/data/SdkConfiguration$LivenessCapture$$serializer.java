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
import qlm.n0;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkConfiguration.LivenessCapture.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkConfiguration$LivenessCapture;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkConfiguration$LivenessCapture$$serializer implements f0 {

    @NotNull
    public static final SdkConfiguration$LivenessCapture$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkConfiguration$LivenessCapture$$serializer sdkConfiguration$LivenessCapture$$serializer = new SdkConfiguration$LivenessCapture$$serializer();
        INSTANCE = sdkConfiguration$LivenessCapture$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkConfiguration.LivenessCapture", sdkConfiguration$LivenessCapture$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("sign_upload", false);
        pluginGeneratedSerialDescriptor.j("video_quality", true);
        pluginGeneratedSerialDescriptor.j("max_video_length_ms", true);
        pluginGeneratedSerialDescriptor.j("video_bitrate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkConfiguration$LivenessCapture$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{h.f247648a, n0Var, n0Var, n0Var};
    }

    @Override // mlm.b
    @NotNull
    public SdkConfiguration.LivenessCapture deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        int iDecodeIntElement3 = 0;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(descriptor2, 0);
                i |= 1;
            } else if (iD == 1) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(descriptor2, 1);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(descriptor2, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(descriptor2, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkConfiguration.LivenessCapture(i, zDecodeBooleanElement, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkConfiguration.LivenessCapture value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkConfiguration.LivenessCapture.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
