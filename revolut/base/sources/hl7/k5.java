package hl7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5 f153170a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k5 k5Var = new k5();
        f153170a = k5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.MtaQuoteDto", k5Var, 3);
        pluginGeneratedSerialDescriptor.j("futureInstallmentsPriceChange", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("quoteError", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(d4.f153061a), nlm.a.c(z5.f153392a), nlm.a.c(n5.f153226a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        f4 f4Var = null;
        boolean z = true;
        int i = 0;
        b6 b6Var = null;
        p5 p5Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                f4Var = (f4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, d4.f153061a, f4Var);
                i |= 1;
            } else if (iD == 1) {
                b6Var = (b6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, z5.f153392a, b6Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                p5Var = (p5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, n5.f153226a, p5Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m5(i, f4Var, b6Var, p5Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m5 value = (m5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, d4.f153061a, value.f153213a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, z5.f153392a, value.f153214b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, n5.f153226a, value.f153215c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
