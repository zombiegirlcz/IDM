package ecd;

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
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f124640a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f124640a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.ProductGroupDto", pVar, 22);
        pluginGeneratedSerialDescriptor.j("groupType", false);
        pluginGeneratedSerialDescriptor.j("accountType", false);
        pluginGeneratedSerialDescriptor.j("defaultCurrency", false);
        pluginGeneratedSerialDescriptor.j("interestRatesConfig", false);
        pluginGeneratedSerialDescriptor.j("legalDisclaimer", false);
        pluginGeneratedSerialDescriptor.j("accountLegalDisclaimer", false);
        pluginGeneratedSerialDescriptor.j("consentDisclaimer", false);
        pluginGeneratedSerialDescriptor.j("upsellConfig", false);
        pluginGeneratedSerialDescriptor.j("currencySelectionScreen", false);
        pluginGeneratedSerialDescriptor.j("riskConfig", false);
        pluginGeneratedSerialDescriptor.j("fundInformationConfig", false);
        pluginGeneratedSerialDescriptor.j("productArticle", false);
        pluginGeneratedSerialDescriptor.j("taxes", false);
        pluginGeneratedSerialDescriptor.j("settlementType", false);
        pluginGeneratedSerialDescriptor.j("transfersConfig", false);
        pluginGeneratedSerialDescriptor.j("interestPayoutConfig", false);
        pluginGeneratedSerialDescriptor.j("interestPayoutDetailsConfig", false);
        pluginGeneratedSerialDescriptor.j("faqConfig", false);
        pluginGeneratedSerialDescriptor.j("documentsConfig", false);
        pluginGeneratedSerialDescriptor.j("interestAndTaxConfig", false);
        pluginGeneratedSerialDescriptor.j("interestAndTaxDetailsConfig", false);
        pluginGeneratedSerialDescriptor.j("selectionScreens", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i2.f124572w;
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(v1Var);
        KSerializer kSerializerC4 = nlm.a.c(h1.f124559a);
        j0 j0Var = j0.f124587a;
        KSerializer kSerializerC5 = nlm.a.c(j0Var);
        KSerializer kSerializerC6 = nlm.a.c(e1.f124534a);
        KSerializer kSerializerC7 = nlm.a.c((KSerializer) lazyArr[12].getValue());
        KSerializer kSerializerC8 = nlm.a.c(v1Var);
        KSerializer kSerializerC9 = nlm.a.c(c2.f124505a);
        m0 m0Var = m0.f124614a;
        KSerializer kSerializerC10 = nlm.a.c(m0Var);
        KSerializer kSerializerC11 = nlm.a.c(m0Var);
        q qVar = q.f124649a;
        return new KSerializer[]{v1Var, v1Var, v1Var, p0.f124641a, kSerializerC, kSerializerC2, kSerializerC3, f2.f124545a, x.f124702a, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, kSerializerC11, nlm.a.c(qVar), nlm.a.c(a0.f124481a), nlm.a.c(qVar), nlm.a.c(j0Var), nlm.a.c(q1.f124651a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        l0 l0Var;
        int i;
        String str;
        l0 l0Var2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i2.f124572w;
        dVarBeginStructure.getClass();
        String str2 = null;
        List list = null;
        g1 g1Var = null;
        j1 j1Var = null;
        l0 l0Var3 = null;
        e2 e2Var = null;
        o0 o0Var = null;
        o0 o0Var2 = null;
        s sVar = null;
        c0 c0Var = null;
        s sVar2 = null;
        l0 l0Var4 = null;
        s1 s1Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        a1 a1Var = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        h2 h2Var = null;
        z zVar = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            j1 j1Var2 = j1Var;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = str2;
                    l0Var2 = l0Var3;
                    z = false;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 0:
                    str = str2;
                    l0Var2 = l0Var3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 1:
                    str = str2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                    j1Var = j1Var2;
                    str2 = str;
                    break;
                case 2:
                    str = str2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                    j1Var = j1Var2;
                    str2 = str;
                    break;
                case 3:
                    str = str2;
                    l0Var2 = l0Var3;
                    a1Var = (a1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, p0.f124641a, a1Var);
                    i2 |= 8;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 4:
                    str = str2;
                    l0Var2 = l0Var3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str3);
                    i2 |= 16;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 5:
                    str = str2;
                    l0Var2 = l0Var3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str4);
                    i2 |= 32;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 6:
                    str = str2;
                    l0Var2 = l0Var3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str5);
                    i2 |= 64;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 7:
                    str = str2;
                    l0Var2 = l0Var3;
                    h2Var = (h2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, f2.f124545a, h2Var);
                    i2 |= 128;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 8:
                    str = str2;
                    l0Var2 = l0Var3;
                    zVar = (z) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, x.f124702a, zVar);
                    i2 |= 256;
                    j1Var = j1Var2;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 9:
                    str = str2;
                    l0Var2 = l0Var3;
                    j1Var = (j1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, h1.f124559a, j1Var2);
                    i2 |= 512;
                    l0Var3 = l0Var2;
                    str2 = str;
                    break;
                case 10:
                    str = str2;
                    l0Var3 = (l0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, j0.f124587a, l0Var3);
                    i2 |= 1024;
                    j1Var = j1Var2;
                    str2 = str;
                    break;
                case 11:
                    l0Var = l0Var3;
                    g1Var = (g1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, e1.f124534a, g1Var);
                    i2 |= 2048;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 12:
                    l0Var = l0Var3;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr[12].getValue(), list);
                    i2 |= 4096;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 13:
                    l0Var = l0Var3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.v1.f247718a, str2);
                    i2 |= 8192;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 14:
                    l0Var = l0Var3;
                    e2Var = (e2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, c2.f124505a, e2Var);
                    i2 |= 16384;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 15:
                    l0Var = l0Var3;
                    o0Var = (o0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, m0.f124614a, o0Var);
                    i = 32768;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 16:
                    l0Var = l0Var3;
                    o0Var2 = (o0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, m0.f124614a, o0Var2);
                    i = 65536;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 17:
                    l0Var = l0Var3;
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, q.f124649a, sVar);
                    i = 131072;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 18:
                    l0Var = l0Var3;
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, a0.f124481a, c0Var);
                    i = 262144;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 19:
                    l0Var = l0Var3;
                    sVar2 = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, q.f124649a, sVar2);
                    i = 524288;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 20:
                    l0Var = l0Var3;
                    l0Var4 = (l0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, j0.f124587a, l0Var4);
                    i = PKIFailureInfo.badCertTemplate;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                case 21:
                    l0Var = l0Var3;
                    s1Var = (s1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, q1.f124651a, s1Var);
                    i = PKIFailureInfo.badSenderNonce;
                    i2 |= i;
                    j1Var = j1Var2;
                    l0Var3 = l0Var;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        String str6 = str2;
        l0 l0Var5 = l0Var3;
        a1 a1Var2 = a1Var;
        dVarBeginStructure.endStructure(serialDescriptor);
        c0 c0Var2 = c0Var;
        z zVar2 = zVar;
        s sVar3 = sVar2;
        l0 l0Var6 = l0Var4;
        return new i2(i2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, a1Var2, str3, str4, str5, h2Var, zVar2, j1Var, l0Var5, g1Var, list, str6, e2Var, o0Var, o0Var2, sVar, c0Var2, sVar3, l0Var6, s1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i2 value = (i2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i2.f124572w;
        String str = value.f124573a;
        s1 s1Var = value.v;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f124574b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f124575c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, p0.f124641a, value.d);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f124576g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, f2.f124545a, value.f124577h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, x.f124702a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, h1.f124559a, value.f124578j);
        j0 j0Var = j0.f124587a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, j0Var, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, e1.f124534a, value.f124579l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), value.f124580m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f124581n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, c2.f124505a, value.o);
        m0 m0Var = m0.f124614a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, m0Var, value.f124582p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, m0Var, value.f124583q);
        q qVar = q.f124649a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, qVar, value.f124584r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, a0.f124481a, value.f124585s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, qVar, value.f124586t);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, j0Var, value.u);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || s1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, q1.f124651a, s1Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
