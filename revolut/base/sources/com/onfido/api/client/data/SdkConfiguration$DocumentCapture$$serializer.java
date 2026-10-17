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
import qlm.t0;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/api/client/data/SdkConfiguration.DocumentCapture.$serializer", "Lqlm/f0;", "Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/api/client/data/SdkConfiguration$DocumentCapture;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class SdkConfiguration$DocumentCapture$$serializer implements f0 {

    @NotNull
    public static final SdkConfiguration$DocumentCapture$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        SdkConfiguration$DocumentCapture$$serializer sdkConfiguration$DocumentCapture$$serializer = new SdkConfiguration$DocumentCapture$$serializer();
        INSTANCE = sdkConfiguration$DocumentCapture$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.api.client.data.SdkConfiguration.DocumentCapture", sdkConfiguration$DocumentCapture$$serializer, 16);
        pluginGeneratedSerialDescriptor.j("torch_turn_on_time_ms", true);
        pluginGeneratedSerialDescriptor.j("video_length_ms", true);
        pluginGeneratedSerialDescriptor.j("video_timeout_ms", true);
        pluginGeneratedSerialDescriptor.j("video_bitrate", true);
        pluginGeneratedSerialDescriptor.j("video_quality", true);
        pluginGeneratedSerialDescriptor.j("video_required", true);
        pluginGeneratedSerialDescriptor.j("barcode_detection_timeout_ms", true);
        pluginGeneratedSerialDescriptor.j("max_total_retries", true);
        pluginGeneratedSerialDescriptor.j("enable_mrz_detection", true);
        pluginGeneratedSerialDescriptor.j("nfc", true);
        pluginGeneratedSerialDescriptor.j("is_pin_enabled", true);
        pluginGeneratedSerialDescriptor.j("enable_passport_card", true);
        pluginGeneratedSerialDescriptor.j("is_camerax_view_port_enabled", true);
        pluginGeneratedSerialDescriptor.j("image_compression_quality", true);
        pluginGeneratedSerialDescriptor.j("target_resolution_width", true);
        pluginGeneratedSerialDescriptor.j("address_page_capture", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SdkConfiguration$DocumentCapture$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        t0 t0Var = t0.f247706a;
        n0 n0Var = n0.f247680a;
        h hVar = h.f247648a;
        return new KSerializer[]{t0Var, t0Var, t0Var, n0Var, n0Var, hVar, t0Var, n0Var, hVar, SdkConfiguration$NfcConfiguration$$serializer.INSTANCE, hVar, hVar, hVar, n0Var, n0Var, SdkConfiguration$DocumentCapture$AddressPageCapture$$serializer.INSTANCE};
    }

    @Override // mlm.b
    @NotNull
    public SdkConfiguration.DocumentCapture deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        SdkConfiguration.NfcConfiguration nfcConfiguration = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        long jDecodeLongElement3 = 0;
        long jDecodeLongElement4 = 0;
        SdkConfiguration.DocumentCapture.AddressPageCapture addressPageCapture = null;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        boolean zDecodeBooleanElement = false;
        int iDecodeIntElement3 = 0;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        boolean zDecodeBooleanElement5 = false;
        int iDecodeIntElement4 = 0;
        int iDecodeIntElement5 = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    jDecodeLongElement4 = dVarBeginStructure.decodeLongElement(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(descriptor2, 7);
                    i |= 128;
                    break;
                case 8:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(descriptor2, 8);
                    i |= 256;
                    break;
                case 9:
                    nfcConfiguration = (SdkConfiguration.NfcConfiguration) dVarBeginStructure.decodeSerializableElement(descriptor2, 9, SdkConfiguration$NfcConfiguration$$serializer.INSTANCE, nfcConfiguration);
                    i |= 512;
                    break;
                case 10:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(descriptor2, 10);
                    i |= 1024;
                    break;
                case 11:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(descriptor2, 11);
                    i |= 2048;
                    break;
                case 12:
                    zDecodeBooleanElement5 = dVarBeginStructure.decodeBooleanElement(descriptor2, 12);
                    i |= 4096;
                    break;
                case 13:
                    iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(descriptor2, 13);
                    i |= 8192;
                    break;
                case 14:
                    iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(descriptor2, 14);
                    i |= 16384;
                    break;
                case 15:
                    addressPageCapture = (SdkConfiguration.DocumentCapture.AddressPageCapture) dVarBeginStructure.decodeSerializableElement(descriptor2, 15, SdkConfiguration$DocumentCapture$AddressPageCapture$$serializer.INSTANCE, addressPageCapture);
                    i |= 32768;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new SdkConfiguration.DocumentCapture(i, jDecodeLongElement, jDecodeLongElement2, jDecodeLongElement3, iDecodeIntElement, iDecodeIntElement2, zDecodeBooleanElement, jDecodeLongElement4, iDecodeIntElement3, zDecodeBooleanElement2, nfcConfiguration, zDecodeBooleanElement3, zDecodeBooleanElement4, zDecodeBooleanElement5, iDecodeIntElement4, iDecodeIntElement5, addressPageCapture, (SerializationConstructorMarker) null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull SdkConfiguration.DocumentCapture value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        SdkConfiguration.DocumentCapture.write$Self$onfido_api_client(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
