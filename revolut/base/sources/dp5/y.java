package dp5;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f116825a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        f116825a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.dto.CryptoWithdrawFeesDto", yVar, 2);
        pluginGeneratedSerialDescriptor.j("networkFee", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(a.C1001a.f176860a), nlm.a.c(v.f116815a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        boolean z = true;
        int i = 0;
        x xVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                xVar = (x) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v.f116815a, xVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, aVar, xVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, value.f116725a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v.f116815a, value.f116726b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
