package x1e;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f302374a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f302374a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.core.impl.data.network.model.StoreProductDto", hVar, 14);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("date", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("maxQuantity", true);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("requiresAddress", true);
        pluginGeneratedSerialDescriptor.j("options", false);
        pluginGeneratedSerialDescriptor.j("productTerms", true);
        pluginGeneratedSerialDescriptor.j("variants", true);
        pluginGeneratedSerialDescriptor.j("deliveryCountries", true);
        pluginGeneratedSerialDescriptor.j("refundable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j.o;
        v1 v1Var = v1.f247718a;
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), v1Var, nlm.a.c(n0.f247680a), v1Var, hVar, lazyArr[9].getValue(), lazyArr[10].getValue(), nlm.a.c(q.f302391a), lazyArr[12].getValue(), hVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j.o;
        dVarBeginStructure.getClass();
        List list = null;
        List list2 = null;
        List list3 = null;
        s sVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str2 = null;
        String str3 = null;
        String strDecodeStringElement4 = null;
        Integer num = null;
        String strDecodeStringElement5 = null;
        int i = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
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
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
                    i |= 8;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 4:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                    i |= 16;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    lazyArr = lazyArr2;
                    break;
                case 6:
                    str = strDecodeStringElement;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, num);
                    i |= 64;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 7:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    lazyArr = lazyArr2;
                    break;
                case 8:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                    i |= 256;
                    lazyArr = lazyArr2;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                    i |= 512;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), list3);
                    i |= 1024;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    sVar = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, q.f302391a, sVar);
                    i |= 2048;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 12:
                    str = strDecodeStringElement;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, (mlm.b) lazyArr2[12].getValue(), list2);
                    i |= 4096;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 13:
                    zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                    i |= 8192;
                    lazyArr = lazyArr2;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str2, str3, strDecodeStringElement4, num, strDecodeStringElement5, zDecodeBooleanElement, list, list3, sVar, list2, zDecodeBooleanElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j value = (j) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j.o;
        String str = value.f302375a;
        boolean z = value.f302383n;
        List list = value.f302382m;
        s sVar = value.f302381l;
        List list2 = value.k;
        boolean z3 = value.i;
        Integer num = value.f302378g;
        String str2 = value.e;
        String str3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f302376b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f302377c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, num);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f302379h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z3);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f302380j);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list2, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || sVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, q.f302391a, sVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (mlm.h) lazyArr[12].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
