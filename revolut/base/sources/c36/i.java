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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f20902a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f20902a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.common.models.dto.DeFiFeeDto", iVar, 3);
        pluginGeneratedSerialDescriptor.j("total", false);
        pluginGeneratedSerialDescriptor.j("exchange", false);
        pluginGeneratedSerialDescriptor.j("network", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private i() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        com.revolut.feature.defi.common.models.dto.c cVar = com.revolut.feature.defi.common.models.dto.c.f71712a;
        return new KSerializer[]{cVar, f.f20899a, cVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        com.revolut.feature.defi.common.models.dto.d dVar = null;
        boolean z = true;
        int i = 0;
        h hVar = null;
        com.revolut.feature.defi.common.models.dto.d dVar2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (com.revolut.feature.defi.common.models.dto.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, com.revolut.feature.defi.common.models.dto.c.f71712a, dVar);
                i |= 1;
            } else if (iD == 1) {
                hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, f.f20899a, hVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                dVar2 = (com.revolut.feature.defi.common.models.dto.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, com.revolut.feature.defi.common.models.dto.c.f71712a, dVar2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, dVar, hVar, dVar2);
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
        com.revolut.feature.defi.common.models.dto.c cVar = com.revolut.feature.defi.common.models.dto.c.f71712a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, cVar, value.f20903a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, f.f20899a, value.f20904b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, cVar, value.f20905c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
