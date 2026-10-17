package w26;

import jo3.a;
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
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f293959a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f293959a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.impl.data.network.dto.DeFiQuoteErrorDto.LimitDto", iVar, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("usage", false);
        pluginGeneratedSerialDescriptor.j("limit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{v1.f247718a, c1001a, c1001a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, strDecodeStringElement, aVar, aVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f293960a);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f293961b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f293962c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
