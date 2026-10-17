package ecd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e4 f124538a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e4 e4Var = new e4();
        f124538a = e4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto.InterestRateDto.RatePercentages", e4Var, 5);
        pluginGeneratedSerialDescriptor.j("annualGrossPercentage", false);
        pluginGeneratedSerialDescriptor.j("annualEffectivePercentage", false);
        pluginGeneratedSerialDescriptor.j("annualNetPercentage", false);
        pluginGeneratedSerialDescriptor.j("annualPreTaxNetPercentage", false);
        pluginGeneratedSerialDescriptor.j("referencePercentage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.x xVar = qlm.x.f247723a;
        return new KSerializer[]{xVar, xVar, xVar, nlm.a.c(xVar), nlm.a.c(xVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Double d = null;
        int i = 0;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        double dDecodeDoubleElement3 = 0.0d;
        Double d5 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                dDecodeDoubleElement3 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.x.f247723a, d5);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.x.f247723a, d);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g4(i, dDecodeDoubleElement, dDecodeDoubleElement2, dDecodeDoubleElement3, d5, d);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g4 value = (g4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, value.f124554a);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 1, value.f124555b);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f124556c);
        qlm.x xVar = qlm.x.f247723a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, xVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, xVar, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
