package m05;

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
import qlm.n0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f201070a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        f201070a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.health.impl.data.storage.entity.InsightActionDataEntity", nVar, 8);
        pluginGeneratedSerialDescriptor.j("targetMonthsOnTimePayments", false);
        pluginGeneratedSerialDescriptor.j("targetUtilisation", false);
        pluginGeneratedSerialDescriptor.j("waitMonths", false);
        pluginGeneratedSerialDescriptor.j("targetSpendIncomeRatio", false);
        pluginGeneratedSerialDescriptor.j("targetMonthsCoverageMin", false);
        pluginGeneratedSerialDescriptor.j("targetMonthsCoverageMax", false);
        pluginGeneratedSerialDescriptor.j("targetDtiMin", false);
        pluginGeneratedSerialDescriptor.j("targetDtiMax", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.f247680a;
        KSerializer kSerializerC = nlm.a.c(n0Var);
        qlm.x xVar = qlm.x.f247723a;
        return new KSerializer[]{kSerializerC, nlm.a.c(xVar), nlm.a.c(n0Var), nlm.a.c(xVar), nlm.a.c(n0Var), nlm.a.c(n0Var), nlm.a.c(xVar), nlm.a.c(xVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        Double d = null;
        Double d5 = null;
        Double d6 = null;
        Double d10 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, num);
                    i |= 1;
                    break;
                case 1:
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.x.f247723a, d);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, n0.f247680a, num2);
                    i |= 4;
                    break;
                case 3:
                    d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.x.f247723a, d5);
                    i |= 8;
                    break;
                case 4:
                    num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, n0.f247680a, num3);
                    i |= 16;
                    break;
                case 5:
                    num4 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, n0.f247680a, num4);
                    i |= 32;
                    break;
                case 6:
                    d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.x.f247723a, d6);
                    i |= 64;
                    break;
                case 7:
                    d10 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.x.f247723a, d10);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p(i, d, d5, d6, d10, num, num2, num3, num4);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p value = (p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        n0 n0Var = n0.f247680a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, n0Var, value.f201071a);
        qlm.x xVar = qlm.x.f247723a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, xVar, value.f201072b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, n0Var, value.f201073c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, xVar, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, n0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, n0Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, xVar, value.f201074g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, xVar, value.f201075h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
