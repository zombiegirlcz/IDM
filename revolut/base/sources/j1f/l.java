package j1f;

import j1f.k;
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
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f170399a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f170399a = lVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.trade_rev_points.impl.data.network.models.TradeRevPointsAgentDto", lVar, 20);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("programmeName", false);
        pluginGeneratedSerialDescriptor.j("programmeDescription", true);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("logoUrl", false);
        pluginGeneratedSerialDescriptor.j("learnMoreUrl", false);
        pluginGeneratedSerialDescriptor.j("additionalInfoUrl", true);
        pluginGeneratedSerialDescriptor.j("suggested", false);
        pluginGeneratedSerialDescriptor.j("backgroundUrl", false);
        pluginGeneratedSerialDescriptor.j("loyaltyProgramme", false);
        pluginGeneratedSerialDescriptor.j("redeemTypes", false);
        pluginGeneratedSerialDescriptor.j("websiteUrl", true);
        pluginGeneratedSerialDescriptor.j("voucherProductGroupId", true);
        pluginGeneratedSerialDescriptor.j("redeemOptions", true);
        pluginGeneratedSerialDescriptor.j("extraRedeemOptions", true);
        pluginGeneratedSerialDescriptor.j("additionalDetails", true);
        pluginGeneratedSerialDescriptor.j("limit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = n.u;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), qlm.h.f247648a, v1Var, v.f170439a, lazyArr[13].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[16].getValue()), nlm.a.c((KSerializer) lazyArr[17].getValue()), nlm.a.c(k.a.f170397a), nlm.a.c(g.f170380a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n.u;
        dVarBeginStructure.getClass();
        String str2 = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        x xVar = null;
        List list2 = null;
        List list3 = null;
        k kVar = null;
        i iVar = null;
        String str5 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        String strDecodeStringElement9 = null;
        int i2 = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        while (true) {
            String str6 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                k kVar2 = kVar;
                return new n(i2, strDecodeStringElement6, strDecodeStringElement7, strDecodeStringElement8, strDecodeStringElement9, str5, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, str2, zDecodeBooleanElement, strDecodeStringElement5, xVar, list2, str4, str3, list, list3, kVar2, iVar);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                    strDecodeStringElement = str6;
                    break;
                case 2:
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                    strDecodeStringElement = str6;
                    break;
                case 3:
                    strDecodeStringElement9 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                    strDecodeStringElement = str6;
                    break;
                case 4:
                    str = strDecodeStringElement2;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str5);
                    i2 |= 16;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 5:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i2 |= 32;
                    break;
                case 6:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i2 |= 64;
                    strDecodeStringElement = str6;
                    break;
                case 7:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i2 |= 128;
                    strDecodeStringElement = str6;
                    break;
                case 8:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i2 |= 256;
                    strDecodeStringElement = str6;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str2);
                    i2 |= 512;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                    i2 |= 1024;
                    strDecodeStringElement = str6;
                    break;
                case 11:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                    i2 |= 2048;
                    strDecodeStringElement = str6;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    xVar = (x) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, v.f170439a, xVar);
                    i2 |= 4096;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    str = strDecodeStringElement2;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 13, (mlm.b) lazyArr[13].getValue(), list2);
                    i2 |= 8192;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 14:
                    str = strDecodeStringElement2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str4);
                    i2 |= 16384;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 15:
                    str = strDecodeStringElement2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, v1.f247718a, str3);
                    i = 32768;
                    i2 |= i;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 16:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (mlm.b) lazyArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 17:
                    str = strDecodeStringElement2;
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (mlm.b) lazyArr[17].getValue(), list3);
                    i = 131072;
                    i2 |= i;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 18:
                    str = strDecodeStringElement2;
                    kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, k.a.f170397a, kVar);
                    i = 262144;
                    i2 |= i;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                case 19:
                    str = strDecodeStringElement2;
                    iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, g.f170380a, iVar);
                    i = 524288;
                    i2 |= i;
                    strDecodeStringElement = str6;
                    strDecodeStringElement2 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        n value = (n) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = n.u;
        String str = value.f170403a;
        i iVar = value.f170416t;
        k kVar = value.f170415s;
        List list = value.f170414r;
        List list2 = value.f170413q;
        String str2 = value.f170412p;
        String str3 = value.o;
        String str4 = value.f170408j;
        String str5 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f170404b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f170405c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str5);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f170406g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f170407h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1.f247718a, str4);
        }
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.f170409l);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, v.f170439a, value.f170410m);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (mlm.h) lazyArr[13].getValue(), value.f170411n);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list2, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, (mlm.h) lazyArr[16].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, (mlm.h) lazyArr[17].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || kVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, k.a.f170397a, kVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || iVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, g.f170380a, iVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
