package ecd;

import ecd.s3;
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
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e3 f124537a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e3 e3Var = new e3();
        f124537a = e3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto", e3Var, 22);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("groupType", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("provider", false);
        pluginGeneratedSerialDescriptor.j("protection", false);
        pluginGeneratedSerialDescriptor.j("schedules", false);
        pluginGeneratedSerialDescriptor.j("interestRate", false);
        pluginGeneratedSerialDescriptor.j("pricingPlanId", false);
        pluginGeneratedSerialDescriptor.j("fees", false);
        pluginGeneratedSerialDescriptor.j("taxes", false);
        pluginGeneratedSerialDescriptor.j("limits", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("availableUntil", false);
        pluginGeneratedSerialDescriptor.j("campaign", false);
        pluginGeneratedSerialDescriptor.j("questionnaireId", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("accountType", false);
        pluginGeneratedSerialDescriptor.j("restrictions", false);
        pluginGeneratedSerialDescriptor.j("depositLimits", false);
        pluginGeneratedSerialDescriptor.j("disclaimers", true);
        pluginGeneratedSerialDescriptor.j("term", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e3() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d6.f124518w;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, nlm.a.c(f5.f124547a), nlm.a.c(w4.f124700a), o5.f124639a, c4.f124506a, nlm.a.c(v1Var), lazyArr[9].getValue(), lazyArr[10].getValue(), lazyArr[11].getValue(), lazyArr[12].getValue(), nlm.a.c(qlm.t0.f247706a), nlm.a.c(f3.f124546a), nlm.a.c(v1Var), v1Var, v1Var, nlm.a.c((KSerializer) lazyArr[18].getValue()), nlm.a.c(m3.f124618a), nlm.a.c(s3.a.f124668a), nlm.a.c(u5.f124683a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        Long l2;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d6.f124518w;
        dVarBeginStructure.getClass();
        String str3 = null;
        Long l3 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        h3 h3Var = null;
        String str4 = null;
        List list5 = null;
        o3 o3Var = null;
        s3 s3Var = null;
        c6 c6Var = null;
        k4 k4Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        n5 n5Var = null;
        e5 e5Var = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        t5 t5Var = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            k4 k4Var2 = k4Var;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    l2 = l3;
                    z = false;
                    k4Var = k4Var2;
                    l3 = l2;
                    break;
                case 0:
                    l2 = l3;
                    str2 = str3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 1:
                    l2 = l3;
                    str2 = str3;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 2:
                    l2 = l3;
                    str2 = str3;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 3:
                    l2 = l3;
                    str2 = str3;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 4:
                    l2 = l3;
                    str2 = str3;
                    n5Var = (n5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, f5.f124547a, n5Var);
                    i2 |= 16;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 5:
                    l2 = l3;
                    str2 = str3;
                    e5Var = (e5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, w4.f124700a, e5Var);
                    i2 |= 32;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 6:
                    l2 = l3;
                    str2 = str3;
                    t5Var = (t5) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, o5.f124639a, t5Var);
                    i2 |= 64;
                    k4Var = k4Var2;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 7:
                    l2 = l3;
                    str2 = str3;
                    k4Var = (k4) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, c4.f124506a, k4Var2);
                    i2 |= 128;
                    str3 = str2;
                    l3 = l2;
                    break;
                case 8:
                    l2 = l3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str3);
                    i2 |= 256;
                    k4Var = k4Var2;
                    l3 = l2;
                    break;
                case 9:
                    str = str3;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list3);
                    i2 |= 512;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 10:
                    str = str3;
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr[10].getValue(), list4);
                    i2 |= 1024;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 11:
                    str = str3;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list2);
                    i2 |= 2048;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 12:
                    str = str3;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr[12].getValue(), list);
                    i2 |= 4096;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 13:
                    str = str3;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.t0.f247706a, l3);
                    i2 |= 8192;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 14:
                    str = str3;
                    h3Var = (h3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, f3.f124546a, h3Var);
                    i2 |= 16384;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 15:
                    str = str3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, qlm.v1.f247718a, str4);
                    i = 32768;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 16:
                    str = str3;
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 16);
                    i = 65536;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 17:
                    str = str3;
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 18:
                    str = str3;
                    list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, (mlm.b) lazyArr[18].getValue(), list5);
                    i = 262144;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 19:
                    str = str3;
                    o3Var = (o3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, m3.f124618a, o3Var);
                    i = 524288;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 20:
                    str = str3;
                    s3Var = (s3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, s3.a.f124668a, s3Var);
                    i = PKIFailureInfo.badCertTemplate;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                case 21:
                    str = str3;
                    c6Var = (c6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, u5.f124683a, c6Var);
                    i = PKIFailureInfo.badSenderNonce;
                    i2 |= i;
                    k4Var = k4Var2;
                    str3 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Long l4 = l3;
        n5 n5Var2 = n5Var;
        dVarBeginStructure.endStructure(serialDescriptor);
        h3 h3Var2 = h3Var;
        String str5 = strDecodeStringElement;
        List list6 = list4;
        c6 c6Var2 = c6Var;
        return new d6(i2, str5, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, n5Var2, e5Var, t5Var, k4Var, str3, list3, list6, list2, list, l4, h3Var2, str4, strDecodeStringElement5, strDecodeStringElement6, list5, o3Var, s3Var, c6Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d6 value = (d6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d6.f124518w;
        String str = value.f124519a;
        c6 c6Var = value.v;
        s3 s3Var = value.u;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f124520b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f124521c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, f5.f124547a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, w4.f124700a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, o5.f124639a, value.f124522g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, c4.f124506a, value.f124523h);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f124524j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f124525l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), value.f124526m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, qlm.t0.f247706a, value.f124527n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, f3.f124546a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, v1Var, value.f124528p);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 16, value.f124529q);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 17, value.f124530r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, (mlm.h) lazyArr[18].getValue(), value.f124531s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, m3.f124618a, value.f124532t);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || s3Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, s3.a.f124668a, s3Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c6Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, u5.f124683a, c6Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
