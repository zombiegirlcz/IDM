package d56;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f111373a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        f111373a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.remittances.impl.data.network.dto.DeFiTransferQuoteResponseDto.PriceImpactDto", fVar, 3);
        pluginGeneratedSerialDescriptor.j("market", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        pluginGeneratedSerialDescriptor.j("confirmationRequired", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(k.f111378a), nlm.a.c(h.f111374a), nlm.a.c(qlm.h.f247648a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        m mVar = null;
        boolean z = true;
        int i = 0;
        j jVar = null;
        Boolean bool = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                mVar = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, k.f111378a, mVar);
                i |= 1;
            } else if (iD == 1) {
                jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, h.f111374a, jVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, bool);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, mVar, jVar, bool);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, k.f111378a, value.f111382a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, h.f111374a, value.f111383b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.h.f247648a, value.f111384c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
