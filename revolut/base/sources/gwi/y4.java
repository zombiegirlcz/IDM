package gwi;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y4 f147572a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y4 y4Var = new y4();
        f147572a = y4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airportlounges.impl.network.dto.AirportLoungesTermsAndConditionsDto", y4Var, 5);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("cryptoContent", true);
        pluginGeneratedSerialDescriptor.j("commodityContent", true);
        pluginGeneratedSerialDescriptor.j("savingsContent", true);
        pluginGeneratedSerialDescriptor.j("creditContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ld7.a aVar = ld7.a.f194038a;
        return new KSerializer[]{aVar, nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar), nlm.a.c(aVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        ld7.c cVar = null;
        ld7.c cVar2 = null;
        ld7.c cVar3 = null;
        ld7.c cVar4 = null;
        ld7.c cVar5 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                cVar = (ld7.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ld7.a.f194038a, cVar);
                i |= 1;
            } else if (iD == 1) {
                cVar2 = (ld7.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ld7.a.f194038a, cVar2);
                i |= 2;
            } else if (iD == 2) {
                cVar3 = (ld7.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ld7.a.f194038a, cVar3);
                i |= 4;
            } else if (iD == 3) {
                cVar4 = (ld7.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ld7.a.f194038a, cVar4);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                cVar5 = (ld7.c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ld7.a.f194038a, cVar5);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a5(i, cVar, cVar2, cVar3, cVar4, cVar5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a5 value = (a5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ld7.a aVar = ld7.a.f194038a;
        ld7.c cVar = value.f147339a;
        ld7.c cVar2 = value.e;
        ld7.c cVar3 = value.d;
        ld7.c cVar4 = value.f147341c;
        ld7.c cVar5 = value.f147340b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, aVar, cVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || cVar5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, aVar, cVar5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || cVar4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, aVar, cVar4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || cVar3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, aVar, cVar3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || cVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, aVar, cVar2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
