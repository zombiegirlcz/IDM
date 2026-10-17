package f2e;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f131564a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d1 d1Var = new d1();
        f131564a = d1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.ExclusivesHeroTileDto", d1Var, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("productOffer", true);
        pluginGeneratedSerialDescriptor.j("auctionOffer", true);
        pluginGeneratedSerialDescriptor.j("soldOutProductOffer", true);
        pluginGeneratedSerialDescriptor.j("lockedProductOffer", true);
        pluginGeneratedSerialDescriptor.j("comingSoonProductOffer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = f1.f131578l;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c(x3.f131764a), nlm.a.c(e.f131573a), nlm.a.c(b5.f131546a), nlm.a.c(b2.f131544a), nlm.a.c(k0.f131640a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = f1.f131578l;
        dVarBeginStructure.getClass();
        d5 d5Var = null;
        d2 d2Var = null;
        m0 m0Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String str = null;
        String str2 = null;
        List list = null;
        z3 z3Var = null;
        g gVar = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    z3Var = (z3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, x3.f131764a, z3Var);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, e.f131573a, gVar);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    d5Var = (d5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, b5.f131546a, d5Var);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    d2Var = (d2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, b2.f131544a, d2Var);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    m0Var = (m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, k0.f131640a, m0Var);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, str2, list, z3Var, gVar, d5Var, d2Var, m0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f1 value = (f1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f1.f131578l;
        String str = value.f131579a;
        m0 m0Var = value.k;
        d2 d2Var = value.f131584j;
        d5 d5Var = value.i;
        g gVar = value.f131583h;
        z3 z3Var = value.f131582g;
        List list = value.f;
        String str2 = value.e;
        String str3 = value.d;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131580b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f131581c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z3Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, x3.f131764a, z3Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || gVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, e.f131573a, gVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, b5.f131546a, d5Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d2Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, b2.f131544a, d2Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || m0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, k0.f131640a, m0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
