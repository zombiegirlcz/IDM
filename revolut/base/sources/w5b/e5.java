package w5b;

import java.util.List;
import jo3.a;
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
import w5b.d5;
import w5b.n5;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e5 f294825a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e5 e5Var = new e5();
        f294825a = e5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsTransactionDto", e5Var, 16);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("date", false);
        pluginGeneratedSerialDescriptor.j("points", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("transactionGroupId", true);
        pluginGeneratedSerialDescriptor.j("category", true);
        pluginGeneratedSerialDescriptor.j("logo", false);
        pluginGeneratedSerialDescriptor.j("secondaryLogo", false);
        pluginGeneratedSerialDescriptor.j("statusMessage", false);
        pluginGeneratedSerialDescriptor.j("state", true);
        pluginGeneratedSerialDescriptor.j("stateLabel", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("pointsDetails", true);
        pluginGeneratedSerialDescriptor.j("upsellBanner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g5.f294847q;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, qlm.t0.f247706a, qlm.n0.f247680a, a.C1001a.f176860a, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(d5.a.f294816a), nlm.a.c((KSerializer) lazyArr[14].getValue()), nlm.a.c(n5.a.f294940a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        jo3.a aVar;
        n5 n5Var;
        jo3.a aVar2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g5.f294847q;
        dVarBeginStructure.getClass();
        String str = null;
        n5 n5Var2 = null;
        List list = null;
        d5 d5Var = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        jo3.a aVar3 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        String str7 = null;
        String str8 = null;
        while (z) {
            String str9 = strDecodeStringElement;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    n5Var = n5Var2;
                    z = false;
                    strDecodeStringElement = str9;
                    n5Var2 = n5Var;
                    break;
                case 0:
                    n5Var = n5Var2;
                    aVar2 = aVar3;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    aVar3 = aVar2;
                    strDecodeStringElement = str9;
                    n5Var2 = n5Var;
                    break;
                case 1:
                    n5Var = n5Var2;
                    aVar2 = aVar3;
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                    aVar3 = aVar2;
                    strDecodeStringElement = str9;
                    n5Var2 = n5Var;
                    break;
                case 2:
                    n5Var = n5Var2;
                    aVar2 = aVar3;
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    aVar3 = aVar2;
                    strDecodeStringElement = str9;
                    n5Var2 = n5Var;
                    break;
                case 3:
                    n5Var = n5Var2;
                    aVar3 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar3);
                    i |= 8;
                    strDecodeStringElement = str9;
                    n5Var2 = n5Var;
                    break;
                case 4:
                    aVar = aVar3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    aVar3 = aVar;
                    break;
                case 5:
                    aVar = aVar3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                    i |= 32;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 6:
                    aVar = aVar3;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str7);
                    i |= 64;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 7:
                    aVar = aVar3;
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str8);
                    i |= 128;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 8:
                    aVar = aVar3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str2);
                    i |= 256;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 9:
                    aVar = aVar3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str3);
                    i |= 512;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 10:
                    aVar = aVar3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str4);
                    i |= 1024;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 11:
                    aVar = aVar3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str5);
                    i |= 2048;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 12:
                    aVar = aVar3;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str6);
                    i |= 4096;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 13:
                    aVar = aVar3;
                    d5Var = (d5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, d5.a.f294816a, d5Var);
                    i |= 8192;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 14:
                    aVar = aVar3;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (mlm.b) lazyArr[14].getValue(), list);
                    i |= 16384;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                case 15:
                    aVar = aVar3;
                    n5Var2 = (n5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, n5.a.f294940a, n5Var2);
                    i |= 32768;
                    strDecodeStringElement = str9;
                    aVar3 = aVar;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        String str10 = str3;
        return new g5(i, strDecodeStringElement2, jDecodeLongElement, iDecodeIntElement, aVar3, strDecodeStringElement, str, str7, str8, str2, str10, str4, str5, str6, d5Var, list, n5Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g5 value = (g5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g5.f294847q;
        String str = value.f294848a;
        n5 n5Var = value.f294857p;
        List list = value.o;
        d5 d5Var = value.f294856n;
        String str2 = value.f294855m;
        String str3 = value.f294854l;
        String str4 = value.f294852h;
        String str5 = value.f294851g;
        String str6 = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f294849b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f294850c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str6);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str4);
        }
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, value.f294853j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, value.k);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, d5.a.f294816a, d5Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (mlm.h) lazyArr[14].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || n5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, n5.a.f294940a, n5Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
