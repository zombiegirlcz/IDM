package zda;

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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f321377a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f321377a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pockets.impl.details_v2.entities.AccountDetailsContentEntity", gVar, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("country", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("iban", false);
        pluginGeneratedSerialDescriptor.j("main", false);
        pluginGeneratedSerialDescriptor.j("tipsContent", false);
        pluginGeneratedSerialDescriptor.j("tips", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("qrCodes", false);
        pluginGeneratedSerialDescriptor.j("emptyState", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i.f321382m;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(j.f321390a), nlm.a.c(c1.f321366a), nlm.a.c((KSerializer) lazyArr[8].getValue()), nlm.a.c(d.f321367a), lazyArr[10].getValue(), nlm.a.c(h0.f321381a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.f321382m;
        dVarBeginStructure.getClass();
        List list = null;
        j0 j0Var = null;
        f fVar = null;
        List list2 = null;
        String str2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String str3 = null;
        l lVar = null;
        e1 e1Var = null;
        int i = 0;
        boolean z = true;
        while (z) {
            Lazy[] lazyArr2 = lazyArr;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    lazyArr = lazyArr2;
                    break;
                case 0:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str2);
                    i |= 1;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 1:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    lazyArr = lazyArr2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    lazyArr = lazyArr2;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    lazyArr = lazyArr2;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    lazyArr = lazyArr2;
                    break;
                case 5:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str3);
                    i |= 32;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 6:
                    str = strDecodeStringElement;
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, j.f321390a, lVar);
                    i |= 64;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 7:
                    str = strDecodeStringElement;
                    e1Var = (e1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, c1.f321366a, e1Var);
                    i |= 128;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 8:
                    str = strDecodeStringElement;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), list);
                    i |= 256;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, d.f321367a, fVar);
                    i |= 512;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), list2);
                    i |= 1024;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    j0Var = (j0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, h0.f321381a, j0Var);
                    i |= 2048;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, str2, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, str3, lVar, e1Var, list, fVar, list2, j0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.f321382m;
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f321383a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f321384b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f321385c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, j.f321390a, value.f321386g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, c1.f321366a, value.f321387h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, d.f321367a, value.f321388j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, h0.f321381a, value.f321389l);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
