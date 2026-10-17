package n36;

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
public final /* synthetic */ class r implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f211899a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        f211899a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.exchange.impl.data.network.dto.DeFiSwapQuoteResponse.Rate", rVar, 3);
        pluginGeneratedSerialDescriptor.j("baseAsset", false);
        pluginGeneratedSerialDescriptor.j("counterAsset", false);
        pluginGeneratedSerialDescriptor.j("bid", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{c0.d, c36.a.f20896a, v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        b0 b0Var = null;
        boolean z = true;
        int i = 0;
        c36.c cVar = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b0Var = (b0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c0.d, b0Var);
                i |= 1;
            } else if (iD == 1) {
                cVar = (c36.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c36.a.f20896a, cVar);
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
        return new t(i, b0Var, cVar, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t value = (t) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c0.d, value.f211900a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c36.a.f20896a, value.f211901b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f211902c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
