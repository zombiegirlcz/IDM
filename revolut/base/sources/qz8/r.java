package qz8;

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
import qlm.f0;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f250401a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        f250401a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.learn.shared.impl.data.network.dto.course.CourseWithLessonsDto", rVar, 17);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("coverImage", true);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("incentiveEnded", false);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("lessonProgress", false);
        pluginGeneratedSerialDescriptor.j("lessons", false);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("productDomain", false);
        pluginGeneratedSerialDescriptor.j("reward", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("tags", true);
        pluginGeneratedSerialDescriptor.j("thumbnail", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("totalEarnedReward", true);
        pluginGeneratedSerialDescriptor.j("hasLessonsWithAbuseRewardStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t.f250402r;
        v1 v1Var = v1.f247718a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c(v1Var), v1Var, v1Var, hVar, n0.f247680a, lazyArr[6].getValue(), lazyArr[7].getValue(), nlm.a.c((KSerializer) lazyArr[8].getValue()), lazyArr[9].getValue(), lazyArr[10].getValue(), lazyArr[11].getValue(), nlm.a.c((KSerializer) lazyArr[12].getValue()), v1Var, v1Var, nlm.a.c(o.f250398a), nlm.a.c(hVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f250402r;
        dVarBeginStructure.getClass();
        pz8.b bVar = null;
        Boolean bool = null;
        q qVar = null;
        pz8.g gVar = null;
        zz8.c cVar = null;
        List list = null;
        String str2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        n nVar = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        int i2 = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        int iDecodeIntElement = 0;
        while (true) {
            String str3 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new t(i2, list, str2, str3, strDecodeStringElement2, zDecodeBooleanElement, iDecodeIntElement, list3, list4, bVar, gVar, cVar, nVar, list2, strDecodeStringElement3, strDecodeStringElement4, qVar, bool);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i2 |= 1;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i2 |= 2;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                    strDecodeStringElement = str3;
                    break;
                case 4:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i2 |= 16;
                    strDecodeStringElement = str3;
                    break;
                case 5:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i2 |= 32;
                    strDecodeStringElement = str3;
                    break;
                case 6:
                    str = strDecodeStringElement2;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list3);
                    i2 |= 64;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list4);
                    i2 |= 128;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    str = strDecodeStringElement2;
                    bVar = (pz8.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), bVar);
                    i2 |= 256;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    gVar = (pz8.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), gVar);
                    i2 |= 512;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    cVar = (zz8.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr[10].getValue(), cVar);
                    i2 |= 1024;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), nVar);
                    i2 |= 2048;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr[12].getValue(), list2);
                    i2 |= 4096;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
                    i2 |= 8192;
                    strDecodeStringElement = str3;
                    break;
                case 14:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 14);
                    i2 |= 16384;
                    strDecodeStringElement = str3;
                    break;
                case 15:
                    str = strDecodeStringElement2;
                    qVar = (q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, o.f250398a, qVar);
                    i = 32768;
                    i2 |= i;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 16:
                    str = strDecodeStringElement2;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, qlm.h.f247648a, bool);
                    i = 65536;
                    i2 |= i;
                    strDecodeStringElement = str3;
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
        t value = (t) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t.f250402r;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f250403a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f250403a);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f250404b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f250404b);
        }
        String str = value.f250405c;
        Boolean bool = value.f250413q;
        q qVar = value.f250412p;
        List list = value.f250410m;
        pz8.b bVar = value.i;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f250406g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f250407h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), bVar);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f250408j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f250409l);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), list);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, value.f250411n);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 14, value.o);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, o.f250398a, qVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, qlm.h.f247648a, bool);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
