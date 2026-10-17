package dp5;

import bl5.b;
import cl5.a;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f116737a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f116737a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.dto.CryptoAddressDto", dVar, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("destinationTag", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("hasTransactions", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("archived", false);
        pluginGeneratedSerialDescriptor.j("blockchain", false);
        pluginGeneratedSerialDescriptor.j("flags", false);
        pluginGeneratedSerialDescriptor.j("recipientDetails", false);
        pluginGeneratedSerialDescriptor.j("revolutAddress", false);
        pluginGeneratedSerialDescriptor.j("limits", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("counterparty", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = f.f116745p;
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, hVar, v1Var, nlm.a.c(hVar), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c(b.a.f16474a), nlm.a.c(hVar), nlm.a.c(b0.f116727a), qlm.t0.f247706a, nlm.a.c(a.C0158a.f24964a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f.f116745p;
        dVarBeginStructure.getClass();
        Boolean bool = null;
        cl5.a aVar = null;
        bl5.b bVar = null;
        Boolean bool2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str2 = null;
        String str3 = null;
        d0 d0Var = null;
        String strDecodeStringElement4 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        String str4 = null;
        List list = null;
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
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    lazyArr = lazyArr2;
                    break;
                case 6:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    lazyArr = lazyArr2;
                    break;
                case 7:
                    str = strDecodeStringElement;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.h.f247648a, bool);
                    i |= 128;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 8:
                    str = strDecodeStringElement;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str4);
                    i |= 256;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 9:
                    str = strDecodeStringElement;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                    i |= 512;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 10:
                    str = strDecodeStringElement;
                    bVar = (bl5.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, b.a.f16474a, bVar);
                    i |= 1024;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    bool2 = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.h.f247648a, bool2);
                    i |= 2048;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 12:
                    str = strDecodeStringElement;
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, b0.f116727a, d0Var);
                    i |= 4096;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                case 13:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 13);
                    i |= 8192;
                    lazyArr = lazyArr2;
                    break;
                case 14:
                    str = strDecodeStringElement;
                    aVar = (cl5.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, a.C0158a.f24964a, aVar);
                    i |= 16384;
                    lazyArr = lazyArr2;
                    strDecodeStringElement = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str2, str3, zDecodeBooleanElement, strDecodeStringElement4, bool, str4, list, bVar, bool2, d0Var, jDecodeLongElement, aVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f.f116745p;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f116746a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f116747b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f116748c);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f116749g);
        qlm.h hVar = qlm.h.f247648a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, hVar, value.f116750h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f116751j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, b.a.f16474a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, hVar, value.f116752l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, b0.f116727a, value.f116753m);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 13, value.f116754n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, a.C0158a.f24964a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
