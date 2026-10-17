package w5b;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f294994a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r1 r1Var = new r1();
        f294994a = r1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanDto", r1Var, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("tier", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("benefitList", false);
        pluginGeneratedSerialDescriptor.j("actionButtonText", false);
        pluginGeneratedSerialDescriptor.j("cardConfiguration", false);
        pluginGeneratedSerialDescriptor.j("virtualCardConfiguration", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("cardFees", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t1.f295012m;
        qlm.v1 v1Var = qlm.v1.f247718a;
        y yVar = y.f295078a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, lazyArr[5].getValue(), v1Var, yVar, nlm.a.c(yVar), nlm.a.c(v1Var), nlm.a.c(ld7.d.f194042a), nlm.a.c(i1.f294873a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t1.f295012m;
        dVarBeginStructure.getClass();
        a0 a0Var = null;
        k1 k1Var = null;
        String str2 = null;
        ld7.f fVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str3 = null;
        String strDecodeStringElement4 = null;
        List list = null;
        String strDecodeStringElement5 = null;
        a0 a0Var2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Lazy[] lazyArr2 = lazyArr;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement;
                    z = false;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 0:
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    lazyArr = lazyArr2;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    lazyArr = lazyArr2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    lazyArr = lazyArr2;
                    break;
                case 3:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
                    i |= 8;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    lazyArr = lazyArr2;
                    break;
                case 5:
                    str = strDecodeStringElement;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list);
                    i |= 32;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 6:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    lazyArr = lazyArr2;
                    break;
                case 7:
                    str = strDecodeStringElement;
                    a0Var2 = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, y.f295078a, a0Var2);
                    i |= 128;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 8:
                    str = strDecodeStringElement;
                    a0Var = (a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, y.f295078a, a0Var);
                    i |= 256;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str2);
                    i |= 512;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    fVar = (ld7.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, ld7.d.f194042a, fVar);
                    i |= 1024;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    k1Var = (k1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, i1.f294873a, k1Var);
                    i |= 2048;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str3, strDecodeStringElement4, list, strDecodeStringElement5, a0Var2, a0Var, str2, fVar, k1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t1 value = (t1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t1.f295012m;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f295013a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f295014b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f295015c);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f295016g);
        y yVar = y.f295078a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, yVar, value.f295017h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, yVar, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, value.f295018j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, ld7.d.f194042a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, i1.f294873a, value.f295019l);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
