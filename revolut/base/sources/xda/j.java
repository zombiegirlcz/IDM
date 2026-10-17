package xda;

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
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f304334a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f304334a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pockets.impl.details_v2.dto.AccountDetailsContentDto", jVar, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("preview", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("country", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("iban", false);
        pluginGeneratedSerialDescriptor.j("main", false);
        pluginGeneratedSerialDescriptor.j("tips", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("qr", false);
        pluginGeneratedSerialDescriptor.j("emptyState", false);
        pluginGeneratedSerialDescriptor.j("displayAccountNumber", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = l.f304336n;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(m.f304348a), nlm.a.c(e1.f304318a), nlm.a.c(g.f304323a), nlm.a.c((KSerializer) lazyArr[10].getValue()), nlm.a.c(j0.f304335a), nlm.a.c((KSerializer) lazyArr[12].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f304336n;
        dVarBeginStructure.getClass();
        g1 g1Var = null;
        List list = null;
        l0 l0Var = null;
        i iVar = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String str4 = null;
        o oVar = null;
        int i = 0;
        boolean z = true;
        while (true) {
            String str5 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new l(i, str2, str3, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, str4, oVar, g1Var, iVar, list2, l0Var, list);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str2);
                    i |= 1;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str3);
                    i |= 2;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str5;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str5;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    strDecodeStringElement = str5;
                    break;
                case 6:
                    str = strDecodeStringElement2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str4);
                    i |= 64;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, m.f304348a, oVar);
                    i |= 128;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    str = strDecodeStringElement2;
                    g1Var = (g1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, e1.f304318a, g1Var);
                    i |= 256;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    iVar = (i) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, g.f304323a, iVar);
                    i |= 512;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr[10].getValue(), list2);
                    i |= 1024;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    l0Var = (l0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, j0.f304335a, l0Var);
                    i |= 2048;
                    strDecodeStringElement = str5;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr[12].getValue(), list);
                    i |= 4096;
                    strDecodeStringElement = str5;
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
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = l.f304336n;
        v1 v1Var = v1.f247718a;
        String str = value.f304337a;
        List list = value.f304344m;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, str);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f304338b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f304339c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f304340g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, m.f304348a, value.f304341h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, e1.f304318a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, g.f304323a, value.f304342j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, j0.f304335a, value.f304343l);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
