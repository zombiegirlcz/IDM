package w26;

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
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f293951a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f293951a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.impl.data.network.dto.DeFiQuoteErrorDto.AmountDto", bVar, 3);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("decimals", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.f293955a, v1.f247718a, n0.f247680a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        g gVar = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, e.f293955a, gVar);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, gVar, strDecodeStringElement, iDecodeIntElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, e.f293955a, value.f293952a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f293953b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f293954c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
