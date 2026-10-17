package f2e;

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
public final /* synthetic */ class t2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f131715a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t2 t2Var = new t2();
        f131715a = t2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.MegaOfferDto", t2Var, 10);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("brandName", false);
        pluginGeneratedSerialDescriptor.j("brandImageUrl", false);
        pluginGeneratedSerialDescriptor.j("brandLogoUrl", false);
        pluginGeneratedSerialDescriptor.j("brandLogoBadge", false);
        pluginGeneratedSerialDescriptor.j("earn", false);
        pluginGeneratedSerialDescriptor.j("redeem", false);
        pluginGeneratedSerialDescriptor.j("msi", false);
        pluginGeneratedSerialDescriptor.j("discount", false);
        pluginGeneratedSerialDescriptor.j("analyticsRef", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(e2.f131575a), nlm.a.c(y2.f131774a), nlm.a.c(e3.f131576a), nlm.a.c(b3.f131545a), nlm.a.c(v2.f131736a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str2 = null;
        String strDecodeStringElement3 = null;
        g2 g2Var = null;
        a3 a3Var = null;
        g3 g3Var = null;
        d3 d3Var = null;
        x2 x2Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    g2Var = (g2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, e2.f131575a, g2Var);
                    i |= 16;
                    break;
                case 5:
                    a3Var = (a3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, y2.f131774a, a3Var);
                    i |= 32;
                    break;
                case 6:
                    g3Var = (g3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, e3.f131576a, g3Var);
                    i |= 64;
                    break;
                case 7:
                    d3Var = (d3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b3.f131545a, d3Var);
                    i |= 128;
                    break;
                case 8:
                    x2Var = (x2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v2.f131736a, x2Var);
                    i |= 256;
                    break;
                case 9:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h3(i, strDecodeStringElement, strDecodeStringElement2, str2, strDecodeStringElement3, g2Var, a3Var, g3Var, d3Var, x2Var, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h3 value = (h3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f131613a;
        String str2 = value.f131618j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131614b);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f131615c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, e2.f131575a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, y2.f131774a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, e3.f131576a, value.f131616g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, b3.f131545a, value.f131617h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v2.f131736a, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
