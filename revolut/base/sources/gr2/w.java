package gr2;

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

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f145872a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        f145872a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.be_driven_design.models.dto.FincrimeHomeScreenDto", wVar, 13);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("descriptionAction", true);
        pluginGeneratedSerialDescriptor.j("sections", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        pluginGeneratedSerialDescriptor.j("headerActions", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("moreInfo", true);
        pluginGeneratedSerialDescriptor.j("actions", true);
        pluginGeneratedSerialDescriptor.j("progressBar", true);
        pluginGeneratedSerialDescriptor.j("restrictions", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = y.f145873n;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(h.f145837a), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue()), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[8].getValue()), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c(q.f145861a), nlm.a.c((KSerializer) lazyArr[11].getValue()), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y.f145873n;
        dVarBeginStructure.getClass();
        List list = null;
        String str2 = null;
        List list2 = null;
        List list3 = null;
        s sVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        j jVar = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        String str6 = null;
        int i2 = 0;
        boolean z = true;
        while (z) {
            String strDecodeStringElement = str3;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    i = i2;
                    z = false;
                    i2 = i;
                    str3 = strDecodeStringElement;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i = i2 | 1;
                    i2 = i;
                    str3 = strDecodeStringElement;
                    break;
                case 1:
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str4);
                    i2 |= 2;
                    str3 = strDecodeStringElement;
                    break;
                case 2:
                    str = str4;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str5);
                    i2 |= 4;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 3:
                    str = str4;
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, h.f145837a, jVar);
                    i2 |= 8;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 4:
                    str = str4;
                    list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list4);
                    i2 |= 16;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 5:
                    str = str4;
                    list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list5);
                    i2 |= 32;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 6:
                    str = str4;
                    list6 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list6);
                    i2 |= 64;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 7:
                    str = str4;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                    i2 |= 128;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 8:
                    str = str4;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i2 |= 256;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 9:
                    str = str4;
                    list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list3);
                    i2 |= 512;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 10:
                    str = str4;
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, q.f145861a, sVar);
                    i2 |= 1024;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 11:
                    str = str4;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list2);
                    i2 |= 2048;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                case 12:
                    str = str4;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, v1.f247718a, str2);
                    i2 |= 4096;
                    str3 = strDecodeStringElement;
                    str4 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y(i2, str3, str4, str5, jVar, list4, list5, list6, str6, list, list3, sVar, list2, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y value = (y) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = y.f145873n;
        String str = value.f145874a;
        String str2 = value.f145881m;
        List list = value.f145880l;
        s sVar = value.k;
        List list2 = value.f145879j;
        List list3 = value.i;
        String str3 = value.f145878h;
        List list4 = value.f145877g;
        List list5 = value.f;
        List list6 = value.e;
        j jVar = value.d;
        String str4 = value.f145876c;
        String str5 = value.f145875b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, h.f145837a, jVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), list6);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), list4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || sVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, q.f145861a, sVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
