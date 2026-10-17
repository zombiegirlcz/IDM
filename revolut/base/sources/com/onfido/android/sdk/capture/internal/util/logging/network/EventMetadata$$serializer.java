package com.onfido.android.sdk.capture.internal.util.logging.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata.$serializer", "Lqlm/f0;", "Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/android/sdk/capture/internal/util/logging/network/EventMetadata;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class EventMetadata$$serializer implements f0 {

    @NotNull
    public static final EventMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EventMetadata$$serializer eventMetadata$$serializer = new EventMetadata$$serializer();
        INSTANCE = eventMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.android.sdk.capture.internal.util.logging.network.EventMetadata", eventMetadata$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("os", false);
        pluginGeneratedSerialDescriptor.j("os_version", false);
        pluginGeneratedSerialDescriptor.j("fingerprint", false);
        pluginGeneratedSerialDescriptor.j("model", false);
        pluginGeneratedSerialDescriptor.j("manufacturer", false);
        pluginGeneratedSerialDescriptor.j("brand", false);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("hardware", false);
        pluginGeneratedSerialDescriptor.j("androidApiLevel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EventMetadata$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var};
    }

    @Override // mlm.b
    @NotNull
    public EventMetadata deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        String strDecodeStringElement9 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(descriptor2, 7);
                    i |= 128;
                    break;
                case 8:
                    strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(descriptor2, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new EventMetadata(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8, strDecodeStringElement9, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull EventMetadata value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        EventMetadata.write$Self$onfido_capture_sdk_core_release(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
