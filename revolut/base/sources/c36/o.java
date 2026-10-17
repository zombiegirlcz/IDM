package c36;

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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f20909a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f20909a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.models.dto.DeFiRateDto", oVar, 3);
        pluginGeneratedSerialDescriptor.j("baseAsset", false);
        pluginGeneratedSerialDescriptor.j("counterAsset", false);
        pluginGeneratedSerialDescriptor.j("bid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a aVar = a.f20896a;
        return new KSerializer[]{aVar, aVar, v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        c cVar = null;
        boolean z = true;
        int i = 0;
        c cVar2 = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.f20896a, cVar);
                i |= 1;
            } else if (iD == 1) {
                cVar2 = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.f20896a, cVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q(i, cVar, cVar2, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q value = (q) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a aVar = a.f20896a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, aVar, value.f20910a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, aVar, value.f20911b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f20912c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
