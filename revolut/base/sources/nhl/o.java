package nhl;

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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f215542a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o oVar = new o();
        f215542a = oVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerCollectionDto", oVar, 12);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("count", false);
        pluginGeneratedSerialDescriptor.j("limit", true);
        pluginGeneratedSerialDescriptor.j("securityTypes", false);
        pluginGeneratedSerialDescriptor.j("createdBy", false);
        pluginGeneratedSerialDescriptor.j("collectionKey", true);
        pluginGeneratedSerialDescriptor.j("filters", false);
        pluginGeneratedSerialDescriptor.j("sortingOptions", false);
        pluginGeneratedSerialDescriptor.j("topSecurities", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = q.f215544m;
        v1 v1Var = v1.f247718a;
        qlm.n0 n0Var = qlm.n0.f247680a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), n0Var, nlm.a.c(n0Var), lazyArr[6].getValue(), lazyArr[7].getValue(), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c(i.f215528a), nlm.a.c((KSerializer) lazyArr[11].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = q.f215544m;
        dVarBeginStructure.getClass();
        String str = null;
        List list = null;
        k kVar = null;
        String strDecodeStringElement = null;
        String str2 = null;
        String strDecodeStringElement2 = null;
        String str3 = null;
        List list2 = null;
        Integer num = null;
        List list3 = null;
        zel.d dVar = null;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.n0.f247680a, num);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list3);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    dVar = (zel.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), dVar);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, i.f215528a, kVar);
                    i |= 1024;
                    break;
                case 11:
                    lazyArr = lazyArr2;
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr2[11].getValue(), list2);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q(i, strDecodeStringElement, str2, strDecodeStringElement2, str3, iDecodeIntElement, num, list3, dVar, str, list, kVar, list2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q value = (q) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = q.f215544m;
        String str = value.f215545a;
        List list = value.f215551l;
        String str2 = value.i;
        Integer num = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f215546b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f215547c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.n0.f247680a, num);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f215548g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f215549h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, str2);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f215550j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, i.f215528a, value.k);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
