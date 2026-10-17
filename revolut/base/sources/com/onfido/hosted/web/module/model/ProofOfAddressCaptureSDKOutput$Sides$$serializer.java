package com.onfido.hosted.web.module.model;

import com.onfido.hosted.web.module.model.ProofOfAddressCaptureSDKOutput;
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
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput.Sides.$serializer", "Lqlm/f0;", "Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/onfido/hosted/web/module/model/ProofOfAddressCaptureSDKOutput$Sides;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
public final class ProofOfAddressCaptureSDKOutput$Sides$$serializer implements f0 {

    @NotNull
    public static final ProofOfAddressCaptureSDKOutput$Sides$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ProofOfAddressCaptureSDKOutput$Sides$$serializer proofOfAddressCaptureSDKOutput$Sides$$serializer = new ProofOfAddressCaptureSDKOutput$Sides$$serializer();
        INSTANCE = proofOfAddressCaptureSDKOutput$Sides$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.onfido.hosted.web.module.model.ProofOfAddressCaptureSDKOutput.Sides", proofOfAddressCaptureSDKOutput$Sides$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("front", false);
        pluginGeneratedSerialDescriptor.j("back", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ProofOfAddressCaptureSDKOutput$Sides$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        ProofOfAddressCaptureSDKOutput$Side$$serializer proofOfAddressCaptureSDKOutput$Side$$serializer = ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE;
        return new KSerializer[]{proofOfAddressCaptureSDKOutput$Side$$serializer, a.c(proofOfAddressCaptureSDKOutput$Side$$serializer)};
    }

    @Override // mlm.b
    @NotNull
    public ProofOfAddressCaptureSDKOutput.Sides deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        ProofOfAddressCaptureSDKOutput.Side side = null;
        ProofOfAddressCaptureSDKOutput.Side side2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                side = (ProofOfAddressCaptureSDKOutput.Side) dVarBeginStructure.decodeSerializableElement(descriptor2, 0, ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE, side);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                side2 = (ProofOfAddressCaptureSDKOutput.Side) dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, ProofOfAddressCaptureSDKOutput$Side$$serializer.INSTANCE, side2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new ProofOfAddressCaptureSDKOutput.Sides(i, side, side2, null);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull ProofOfAddressCaptureSDKOutput.Sides value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        ProofOfAddressCaptureSDKOutput.Sides.write$Self$onfido_capture_sdk_core_release(value, compositeEncoderBeginStructure, descriptor2);
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
