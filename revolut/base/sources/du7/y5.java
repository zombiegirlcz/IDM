package du7;

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
public final /* synthetic */ class y5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y5 f117913a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y5 y5Var = new y5();
        f117913a = y5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.InsuranceDocumentsDto", y5Var, 6);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("policySummary", false);
        pluginGeneratedSerialDescriptor.j("guideToBenefits", false);
        pluginGeneratedSerialDescriptor.j("claimsEligibilityStatement", false);
        pluginGeneratedSerialDescriptor.j("productSummaryBannerDocument", false);
        pluginGeneratedSerialDescriptor.j("statementOfInsurance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        l7 l7Var = l7.f117754a;
        return new KSerializer[]{nlm.a.c(l7Var), nlm.a.c(l7Var), nlm.a.c(l7Var), nlm.a.c(l7Var), nlm.a.c(l7Var), nlm.a.c(l7Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        n7 n7Var = null;
        n7 n7Var2 = null;
        n7 n7Var3 = null;
        n7 n7Var4 = null;
        n7 n7Var5 = null;
        n7 n7Var6 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    n7Var = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, l7.f117754a, n7Var);
                    i |= 1;
                    break;
                case 1:
                    n7Var2 = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l7.f117754a, n7Var2);
                    i |= 2;
                    break;
                case 2:
                    n7Var3 = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, l7.f117754a, n7Var3);
                    i |= 4;
                    break;
                case 3:
                    n7Var4 = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, l7.f117754a, n7Var4);
                    i |= 8;
                    break;
                case 4:
                    n7Var5 = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, l7.f117754a, n7Var5);
                    i |= 16;
                    break;
                case 5:
                    n7Var6 = (n7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, l7.f117754a, n7Var6);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a6(i, n7Var, n7Var2, n7Var3, n7Var4, n7Var5, n7Var6);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a6 value = (a6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        l7 l7Var = l7.f117754a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, l7Var, value.f117601a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, l7Var, value.f117602b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, l7Var, value.f117603c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, l7Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, l7Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, l7Var, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
