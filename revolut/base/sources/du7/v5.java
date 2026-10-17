package du7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5 f117879a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v5 v5Var = new v5();
        f117879a = v5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.InsuranceDetailsDto", v5Var, 16);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("subtype", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("policyNumber", false);
        pluginGeneratedSerialDescriptor.j("groupPolicyNumber", false);
        pluginGeneratedSerialDescriptor.j("summary", false);
        pluginGeneratedSerialDescriptor.j("coverage", false);
        pluginGeneratedSerialDescriptor.j("restrictions", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("contactInfo", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("suitabilityStatement", false);
        pluginGeneratedSerialDescriptor.j("claimsInfo", false);
        pluginGeneratedSerialDescriptor.j("usesDynamicClaimUrl", false);
        pluginGeneratedSerialDescriptor.j("claimsBanner", false);
        pluginGeneratedSerialDescriptor.j("documentsBanner", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v5() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = x5.f117901q;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), n6.f117787a, lazyArr[9].getValue(), y5.f117913a, nlm.a.c((KSerializer) lazyArr[11].getValue()), nlm.a.c(j5.f117726a), nlm.a.c(qlm.h.f247648a), nlm.a.c(f0.f117669a), nlm.a.c(e3.f117663a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Boolean bool;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.f117901q;
        dVarBeginStructure.getClass();
        p6 p6Var = null;
        Boolean bool2 = null;
        l5 l5Var = null;
        List list = null;
        List list2 = null;
        a6 a6Var = null;
        h0 h0Var = null;
        g3 g3Var = null;
        String str3 = null;
        String str4 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str5 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str6 = str3;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    bool = bool2;
                    str2 = str4;
                    z = false;
                    str3 = str6;
                    str4 = str2;
                    bool2 = bool;
                    break;
                case 0:
                    bool = bool2;
                    str2 = str4;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    str3 = str6;
                    str4 = str2;
                    bool2 = bool;
                    break;
                case 1:
                    bool = bool2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    str3 = str6;
                    bool2 = bool;
                    break;
                case 2:
                    bool = bool2;
                    str2 = str4;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str5);
                    i |= 4;
                    str3 = str6;
                    str4 = str2;
                    bool2 = bool;
                    break;
                case 3:
                    bool = bool2;
                    str2 = str4;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str6);
                    i |= 8;
                    str4 = str2;
                    bool2 = bool;
                    break;
                case 4:
                    bool = bool2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str4);
                    i |= 16;
                    str3 = str6;
                    bool2 = bool;
                    break;
                case 5:
                    str = str4;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                    i |= 32;
                    str3 = str6;
                    str4 = str;
                    break;
                case 6:
                    str = str4;
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                    i |= 64;
                    str3 = str6;
                    str4 = str;
                    break;
                case 7:
                    str = str4;
                    list5 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list5);
                    i |= 128;
                    str3 = str6;
                    str4 = str;
                    break;
                case 8:
                    str = str4;
                    p6Var = (p6) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, n6.f117787a, p6Var);
                    i |= 256;
                    str3 = str6;
                    str4 = str;
                    break;
                case 9:
                    str = str4;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                    i |= 512;
                    str3 = str6;
                    str4 = str;
                    break;
                case 10:
                    str = str4;
                    a6Var = (a6) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, y5.f117913a, a6Var);
                    i |= 1024;
                    str3 = str6;
                    str4 = str;
                    break;
                case 11:
                    str = str4;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list);
                    i |= 2048;
                    str3 = str6;
                    str4 = str;
                    break;
                case 12:
                    str = str4;
                    l5Var = (l5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, j5.f117726a, l5Var);
                    i |= 4096;
                    str3 = str6;
                    str4 = str;
                    break;
                case 13:
                    str = str4;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, bool2);
                    i |= 8192;
                    str3 = str6;
                    str4 = str;
                    break;
                case 14:
                    str = str4;
                    h0Var = (h0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, f0.f117669a, h0Var);
                    i |= 16384;
                    str3 = str6;
                    str4 = str;
                    break;
                case 15:
                    str = str4;
                    g3Var = (g3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, e3.f117663a, g3Var);
                    i |= 32768;
                    str3 = str6;
                    str4 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Boolean bool3 = bool2;
        dVarBeginStructure.endStructure(serialDescriptor);
        h0 h0Var2 = h0Var;
        return new x5(i, strDecodeStringElement, strDecodeStringElement2, str5, str3, str4, list3, list4, list5, p6Var, list2, a6Var, list, l5Var, bool3, h0Var2, g3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x5 value = (x5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.f117901q;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117902a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f117903b);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f117904c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f117905g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f117906h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, n6.f117787a, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f117907j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, y5.f117913a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f117908l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, j5.f117726a, value.f117909m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, value.f117910n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, f0.f117669a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, e3.f117663a, value.f117911p);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
