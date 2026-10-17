package chc;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f24156a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f24156a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rewards.impl.data.network.rent_and_bills.RentAndBillsConfigurationsDto", eVar, 2);
        pluginGeneratedSerialDescriptor.j("rent", false);
        pluginGeneratedSerialDescriptor.j("bills", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        g gVar = g.f24159a;
        return new KSerializer[]{nlm.a.c(gVar), nlm.a.c(gVar)};
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
        m mVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                mVar = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, g.f24159a, mVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                mVar2 = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, g.f24159a, mVar2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new n(i, mVar, mVar2);
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
        g gVar = g.f24159a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, gVar, value.f24172a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, gVar, value.f24173b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
