package ujb;

import java.util.List;
import kotlin.Lazy;
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
public final /* synthetic */ class h0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f280561a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h0 h0Var = new h0();
        f280561a = h0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.savings.impl.challenge.data.dto.SavingsChallengeOnboardingDto.ConfigDto", h0Var, 5);
        pluginGeneratedSerialDescriptor.j("productArticle", false);
        pluginGeneratedSerialDescriptor.j("entryPoint", false);
        pluginGeneratedSerialDescriptor.j("successInfo", false);
        pluginGeneratedSerialDescriptor.j("rewards", false);
        pluginGeneratedSerialDescriptor.j("catchUpPeriods", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(p0.f280577a), j0.f280563a, nlm.a.c(v0.f280595a), y0.f[3].getValue(), nlm.a.c(qlm.n0.f247680a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        r0 r0Var = null;
        l0 l0Var = null;
        x0 x0Var = null;
        List list = null;
        Integer num = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                r0Var = (r0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, p0.f280577a, r0Var);
                i |= 1;
            } else if (iD == 1) {
                l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, j0.f280563a, l0Var);
                i |= 2;
            } else if (iD == 2) {
                x0Var = (x0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v0.f280595a, x0Var);
                i |= 4;
            } else if (iD == 3) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y0(i, r0Var, l0Var, x0Var, list, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y0 value = (y0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y0.f;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, p0.f280577a, value.f280600a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, j0.f280563a, value.f280601b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v0.f280595a, value.f280602c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
