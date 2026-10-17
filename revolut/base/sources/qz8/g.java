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
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f250383a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f250383a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.learn.shared.impl.data.network.dto.course.CourseOverviewDto", gVar, 16);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("coverImage", true);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("incentiveEnded", false);
        pluginGeneratedSerialDescriptor.j("index", false);
        pluginGeneratedSerialDescriptor.j("lessonProgress", false);
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

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i.f250384q;
        v1 v1Var = v1.f247718a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c(v1Var), v1Var, v1Var, hVar, n0.f247680a, lazyArr[6].getValue(), nlm.a.c((KSerializer) lazyArr[7].getValue()), lazyArr[8].getValue(), lazyArr[9].getValue(), lazyArr[10].getValue(), nlm.a.c((KSerializer) lazyArr[11].getValue()), v1Var, v1Var, nlm.a.c(o.f250398a), nlm.a.c(hVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i.f250384q;
        dVarBeginStructure.getClass();
        pz8.g gVar = null;
        Boolean bool = null;
        zz8.c cVar = null;
        n nVar = null;
        List list = null;
        String str2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        List list2 = null;
        q qVar = null;
        List list3 = null;
        pz8.b bVar = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        int i = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        int iDecodeIntElement = 0;
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
                    str = strDecodeStringElement;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr2[0].getValue(), list);
                    i |= 1;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 1:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    lazyArr = lazyArr2;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    lazyArr = lazyArr2;
                    break;
                case 4:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                    i |= 16;
                    lazyArr = lazyArr2;
                    break;
                case 5:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    lazyArr = lazyArr2;
                    break;
                case 6:
                    str = strDecodeStringElement;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), list3);
                    i |= 64;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 7:
                    str = strDecodeStringElement;
                    bVar = (pz8.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), bVar);
                    i |= 128;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 8:
                    str = strDecodeStringElement;
                    gVar = (pz8.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), gVar);
                    i |= 256;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    cVar = (zz8.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), cVar);
                    i |= 512;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), nVar);
                    i |= 1024;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr2[11].getValue(), list2);
                    i |= 2048;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 12:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
                    i |= 4096;
                    lazyArr = lazyArr2;
                    break;
                case 13:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 13);
                    i |= 8192;
                    lazyArr = lazyArr2;
                    break;
                case 14:
                    str = strDecodeStringElement;
                    qVar = (q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, o.f250398a, qVar);
                    i |= 16384;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 15:
                    str = strDecodeStringElement;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, qlm.h.f247648a, bool);
                    i |= 32768;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        q qVar2 = qVar;
        int i2 = iDecodeIntElement;
        List list4 = list2;
        return new i(i, list, str2, strDecodeStringElement, strDecodeStringElement2, zDecodeBooleanElement, i2, list3, bVar, gVar, cVar, nVar, list4, strDecodeStringElement3, strDecodeStringElement4, qVar2, bool);
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
        Lazy[] lazyArr = i.f250384q;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f250385a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f250385a);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f250386b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f250386b);
        }
        String str = value.f250387c;
        Boolean bool = value.f250394p;
        q qVar = value.o;
        List list = value.f250391l;
        pz8.b bVar = value.f250389h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f250388g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), bVar);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f250390j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), list);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.f250392m);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, value.f250393n);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, o.f250398a, qVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, qlm.h.f247648a, bool);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
