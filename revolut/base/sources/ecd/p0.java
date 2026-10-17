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
public final /* synthetic */ class p0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f124641a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p0 p0Var = new p0();
        f124641a = p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.ProductGroupDto.InterestRatesConfigDto", p0Var, 11);
        pluginGeneratedSerialDescriptor.j("effectiveRateConfig", false);
        pluginGeneratedSerialDescriptor.j("grossRateConfig", false);
        pluginGeneratedSerialDescriptor.j("preTaxNetRateConfig", false);
        pluginGeneratedSerialDescriptor.j("netRateConfig", false);
        pluginGeneratedSerialDescriptor.j("referenceRateConfig", false);
        pluginGeneratedSerialDescriptor.j("estimationBreakdownDisclaimer", false);
        pluginGeneratedSerialDescriptor.j("suffixRate", false);
        pluginGeneratedSerialDescriptor.j("interestAliasVariant", false);
        pluginGeneratedSerialDescriptor.j("breakdownConfig", false);
        pluginGeneratedSerialDescriptor.j("kind", false);
        pluginGeneratedSerialDescriptor.j("rateDisplayStyle", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        x0 x0Var = x0.f124703a;
        KSerializer kSerializerC = nlm.a.c(x0Var);
        KSerializer kSerializerC2 = nlm.a.c(x0Var);
        KSerializer kSerializerC3 = nlm.a.c(x0Var);
        KSerializer kSerializerC4 = nlm.a.c(x0Var);
        KSerializer kSerializerC5 = nlm.a.c(x0Var);
        KSerializer kSerializerC6 = nlm.a.c(t0.f124673a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, nlm.a.c(v1Var), nlm.a.c(v1Var), q0.f124650a, nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        String str2 = null;
        z0 z0Var = null;
        z0 z0Var2 = null;
        z0 z0Var3 = null;
        z0 z0Var4 = null;
        z0 z0Var5 = null;
        v0 v0Var = null;
        String str3 = null;
        String str4 = null;
        s0 s0Var = null;
        int i = 0;
        boolean z3 = true;
        while (z3) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    z0Var = (z0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, x0.f124703a, z0Var);
                    i |= 1;
                    break;
                case 1:
                    z = z3;
                    z0Var2 = (z0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, x0.f124703a, z0Var2);
                    i |= 2;
                    break;
                case 2:
                    z = z3;
                    z0Var3 = (z0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x0.f124703a, z0Var3);
                    i |= 4;
                    break;
                case 3:
                    z = z3;
                    z0Var4 = (z0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, x0.f124703a, z0Var4);
                    i |= 8;
                    break;
                case 4:
                    z = z3;
                    z0Var5 = (z0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, x0.f124703a, z0Var5);
                    i |= 16;
                    break;
                case 5:
                    z = z3;
                    v0Var = (v0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f124673a, v0Var);
                    i |= 32;
                    break;
                case 6:
                    z = z3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str3);
                    i |= 64;
                    break;
                case 7:
                    z = z3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str4);
                    i |= 128;
                    break;
                case 8:
                    z = z3;
                    s0Var = (s0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, q0.f124650a, s0Var);
                    i |= 256;
                    break;
                case 9:
                    z = z3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str);
                    i |= 512;
                    break;
                case 10:
                    z = z3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a1(i, z0Var, z0Var2, z0Var3, z0Var4, z0Var5, v0Var, str3, str4, s0Var, str, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a1 value = (a1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        x0 x0Var = x0.f124703a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, x0Var, value.f124482a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, x0Var, value.f124483b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, x0Var, value.f124484c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, x0Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, x0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0.f124673a, value.f);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f124485g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f124486h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, q0.f124650a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, value.f124487j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, value.k);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
