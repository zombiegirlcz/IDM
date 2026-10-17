package h26;

import h26.k;
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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f148717a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f148717a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.asset_details.impl.data.model.DeFiAssetDetailsResponse", gVar, 11);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("assetRepresentations", false);
        pluginGeneratedSerialDescriptor.j("chains", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("website", true);
        pluginGeneratedSerialDescriptor.j("whitepaper", true);
        pluginGeneratedSerialDescriptor.j("marketCap", true);
        pluginGeneratedSerialDescriptor.j("circulatingSupply", true);
        pluginGeneratedSerialDescriptor.j("maxSupply", true);
        pluginGeneratedSerialDescriptor.j("volume24Hour", true);
        pluginGeneratedSerialDescriptor.j("risk", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i.f148718l;
        v1 v1Var = v1.f247718a;
        l lVar = l.f148731a;
        return new KSerializer[]{d26.d.f110724a, v1Var, lazyArr[2].getValue(), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(lVar), nlm.a.c(lVar), nlm.a.c(lVar), nlm.a.c(lVar), nlm.a.c(k.a.f148730a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = i.f148718l;
        dVarBeginStructure.getClass();
        n nVar = null;
        n nVar2 = null;
        k kVar = null;
        d26.f fVar = null;
        String strDecodeStringElement = null;
        List list = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        n nVar3 = null;
        n nVar4 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    lazyArr = lazyArr2;
                    z = false;
                    break;
                case 0:
                    lazyArr = lazyArr2;
                    fVar = (d26.f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, d26.d.f110724a, fVar);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str3);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    nVar3 = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, l.f148731a, nVar3);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    nVar4 = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, l.f148731a, nVar4);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    nVar = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, l.f148731a, nVar);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    nVar2 = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, l.f148731a, nVar2);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    kVar = (k) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, k.a.f148730a, kVar);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, fVar, strDecodeStringElement, list, str, str2, str3, nVar3, nVar4, nVar, nVar2, kVar);
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
        Lazy[] lazyArr = i.f148718l;
        d26.d dVar = d26.d.f110724a;
        d26.f fVar = value.f148719a;
        k kVar = value.k;
        n nVar = value.f148724j;
        n nVar2 = value.i;
        n nVar3 = value.f148723h;
        n nVar4 = value.f148722g;
        String str = value.f;
        String str2 = value.e;
        String str3 = value.d;
        List list = value.f148721c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, dVar, fVar);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f148720b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || nVar4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, l.f148731a, nVar4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || nVar3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, l.f148731a, nVar3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || nVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, l.f148731a, nVar2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || nVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, l.f148731a, nVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || kVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, k.a.f148730a, kVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
