package f2e;

import java.time.Instant;
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
public final /* synthetic */ class v implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f131727a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        f131727a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.CampaignDto", vVar, 26);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("adSetId", true);
        pluginGeneratedSerialDescriptor.j("adId", true);
        pluginGeneratedSerialDescriptor.j("brandId", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("logoUrl", false);
        pluginGeneratedSerialDescriptor.j("requiresSession", true);
        pluginGeneratedSerialDescriptor.j("activationState", true);
        pluginGeneratedSerialDescriptor.j("shortDescription", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("cashbackPercentage", true);
        pluginGeneratedSerialDescriptor.j("pointsMultiplier", true);
        pluginGeneratedSerialDescriptor.j("earningRate", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("hasPromoCode", true);
        pluginGeneratedSerialDescriptor.j("hasWebhook", true);
        pluginGeneratedSerialDescriptor.j("hasProducts", true);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("checkoutImageUrl", true);
        pluginGeneratedSerialDescriptor.j("analyticsRef", true);
        pluginGeneratedSerialDescriptor.j("eligiblePaymentMethods", true);
        pluginGeneratedSerialDescriptor.j("countries", true);
        pluginGeneratedSerialDescriptor.j("nearestOutlet", true);
        pluginGeneratedSerialDescriptor.k(new adk.i1(new String[]{"nearestOutlet", "outlet"}, 4));
        pluginGeneratedSerialDescriptor.j("endDate", true);
        pluginGeneratedSerialDescriptor.j("instalmentOption", true);
        pluginGeneratedSerialDescriptor.j("instructionList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = x.A;
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(v1Var);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(v1Var);
        qlm.x xVar = qlm.x.f247723a;
        KSerializer kSerializerC6 = nlm.a.c(xVar);
        KSerializer kSerializerC7 = nlm.a.c(xVar);
        KSerializer kSerializerC8 = nlm.a.c(y.f131770a);
        KSerializer kSerializerC9 = nlm.a.c(p.f131683a);
        KSerializer kSerializerC10 = nlm.a.c(s.f131707a);
        KSerializer kSerializerC11 = nlm.a.c(v1Var);
        KSerializer kSerializerC12 = nlm.a.c(v1Var);
        KSerializer kSerializerC13 = nlm.a.c((KSerializer) lazyArr[20].getValue());
        KSerializer kSerializerC14 = nlm.a.c((KSerializer) lazyArr[21].getValue());
        KSerializer kSerializerC15 = nlm.a.c(h0.f131611a);
        KSerializer kSerializerC16 = nlm.a.c(ie0.j.f160602a);
        KSerializer kSerializerC17 = nlm.a.c(b0.f131541a);
        KSerializer kSerializerC18 = nlm.a.c(y1.f131773a);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, kSerializerC, kSerializerC2, v1Var, v1Var, v1Var, hVar, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, hVar, hVar, hVar, kSerializerC10, kSerializerC11, kSerializerC12, kSerializerC13, kSerializerC14, kSerializerC15, kSerializerC16, kSerializerC17, kSerializerC18};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Double d;
        int i;
        u uVar;
        Double d5;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x.A;
        dVarBeginStructure.getClass();
        a2 a2Var = null;
        u uVar2 = null;
        r rVar = null;
        a0 a0Var = null;
        Double d6 = null;
        String str = null;
        j0 j0Var = null;
        Instant instant = null;
        String str2 = null;
        List list = null;
        List list2 = null;
        Double d10 = null;
        d0 d0Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i3 = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        boolean zDecodeBooleanElement3 = false;
        boolean zDecodeBooleanElement4 = false;
        while (z) {
            Double d15 = d6;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    uVar = uVar2;
                    d5 = d10;
                    z = false;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 0:
                    uVar = uVar2;
                    d5 = d10;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i3 |= 1;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 1:
                    uVar = uVar2;
                    d5 = d10;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str3);
                    i3 |= 2;
                    str4 = str4;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 2:
                    uVar = uVar2;
                    d5 = d10;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str4);
                    i3 |= 4;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 3:
                    uVar = uVar2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i3 |= 8;
                    d6 = d15;
                    uVar2 = uVar;
                    break;
                case 4:
                    uVar = uVar2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i3 |= 16;
                    d6 = d15;
                    uVar2 = uVar;
                    break;
                case 5:
                    uVar = uVar2;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i3 |= 32;
                    d6 = d15;
                    uVar2 = uVar;
                    break;
                case 6:
                    uVar = uVar2;
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                    i3 |= 64;
                    d6 = d15;
                    uVar2 = uVar;
                    break;
                case 7:
                    uVar = uVar2;
                    d5 = d10;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str5);
                    i3 |= 128;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 8:
                    uVar = uVar2;
                    d5 = d10;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str6);
                    i3 |= 256;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 9:
                    uVar = uVar2;
                    d5 = d10;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str7);
                    i3 |= 512;
                    d6 = d15;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 10:
                    uVar = uVar2;
                    d5 = d10;
                    d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.x.f247723a, d15);
                    i3 |= 1024;
                    d10 = d5;
                    uVar2 = uVar;
                    break;
                case 11:
                    uVar = uVar2;
                    d10 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.x.f247723a, d10);
                    i3 |= 2048;
                    d6 = d15;
                    uVar2 = uVar;
                    break;
                case 12:
                    d = d10;
                    a0Var = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, y.f131770a, a0Var);
                    i3 |= 4096;
                    d6 = d15;
                    d10 = d;
                    break;
                case 13:
                    d = d10;
                    rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, p.f131683a, rVar);
                    i3 |= 8192;
                    d6 = d15;
                    d10 = d;
                    break;
                case 14:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                    i3 |= 16384;
                    d6 = d15;
                    break;
                case 15:
                    zDecodeBooleanElement3 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                    i2 = 32768;
                    i3 |= i2;
                    d6 = d15;
                    break;
                case 16:
                    zDecodeBooleanElement4 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                    i2 = 65536;
                    i3 |= i2;
                    d6 = d15;
                    break;
                case 17:
                    d = d10;
                    uVar2 = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, s.f131707a, uVar2);
                    i = 131072;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 18:
                    d = d10;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, qlm.v1.f247718a, str);
                    i = 262144;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 19:
                    d = d10;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, qlm.v1.f247718a, str2);
                    i = 524288;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 20:
                    d = d10;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (mlm.b) lazyArr[20].getValue(), list);
                    i = PKIFailureInfo.badCertTemplate;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 21:
                    d = d10;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, (mlm.b) lazyArr[21].getValue(), list2);
                    i = PKIFailureInfo.badSenderNonce;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 22:
                    d = d10;
                    j0Var = (j0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, h0.f131611a, j0Var);
                    i = 4194304;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 23:
                    d = d10;
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, ie0.j.f160602a, instant);
                    i = 8388608;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 24:
                    d = d10;
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, b0.f131541a, d0Var);
                    i = 16777216;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                case 25:
                    d = d10;
                    a2Var = (a2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, y1.f131773a, a2Var);
                    i = 33554432;
                    i3 |= i;
                    d6 = d15;
                    d10 = d;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Double d41 = d6;
        Double d51 = d10;
        String str8 = str3;
        String str9 = str4;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i3, strDecodeStringElement, str8, str9, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, zDecodeBooleanElement, str5, str6, str7, d41, d51, a0Var, rVar, zDecodeBooleanElement2, zDecodeBooleanElement3, zDecodeBooleanElement4, uVar2, str, str2, list, list2, j0Var, instant, d0Var, a2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x.A;
        String str = value.f131745a;
        a2 a2Var = value.z;
        d0 d0Var = value.f131761y;
        Instant instant = value.f131760x;
        j0 j0Var = value.f131759w;
        List list = value.v;
        List list2 = value.u;
        String str2 = value.f131758t;
        String str3 = value.f131757s;
        u uVar = value.f131756r;
        boolean z = value.f131755q;
        boolean z3 = value.f131754p;
        boolean z4 = value.o;
        r rVar = value.f131753n;
        a0 a0Var = value.f131752m;
        Double d = value.f131751l;
        Double d5 = value.k;
        String str4 = value.f131750j;
        String str5 = value.i;
        String str6 = value.f131749h;
        boolean z6 = value.f131748g;
        String str7 = value.f131747c;
        String str8 = value.f131746b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str8);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str7);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z6);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str6);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, qlm.x.f247723a, d5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, qlm.x.f247723a, d);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || a0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, y.f131770a, a0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || rVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, p.f131683a, rVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, z4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 15, z3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 16, z);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || uVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, s.f131707a, uVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (mlm.h) lazyArr[20].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, (mlm.h) lazyArr[21].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, h0.f131611a, j0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, ie0.j.f160602a, instant);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, b0.f131541a, d0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || a2Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, y1.f131773a, a2Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
