package ujb;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f280574a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f280574a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.savings.impl.challenge.data.dto.SavingsChallengeAccountDto.TrackedRewardDto", oVar, 5);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("startDate", false);
        pluginGeneratedSerialDescriptor.j("endDate", false);
        pluginGeneratedSerialDescriptor.j("eligibility", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, t0Var, t0Var, i.f280562a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        k kVar = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, i.f280562a, kVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q(i, strDecodeStringElement, strDecodeStringElement2, jDecodeLongElement, jDecodeLongElement2, kVar);
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
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f280578a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f280579b);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f280580c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, i.f280562a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
