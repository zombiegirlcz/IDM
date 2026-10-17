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
public final /* synthetic */ class t0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f131714a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        f131714a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.DealsTileDto", t0Var, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("richSubtitle", true);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", true);
        pluginGeneratedSerialDescriptor.j("logoUrl", true);
        pluginGeneratedSerialDescriptor.j("logoBadge", true);
        pluginGeneratedSerialDescriptor.j("badges", true);
        pluginGeneratedSerialDescriptor.j("deeplinkOffer", true);
        pluginGeneratedSerialDescriptor.j("megaOffer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = v0.f131728l;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(r4.f131706a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(e2.f131575a), nlm.a.c((KSerializer) lazyArr[8].getValue()), nlm.a.c(w0.f131737a), nlm.a.c(t2.f131715a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = v0.f131728l;
        dVarBeginStructure.getClass();
        List list = null;
        y0 y0Var = null;
        h3 h3Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        String str2 = null;
        t4 t4Var = null;
        String str3 = null;
        String str4 = null;
        g2 g2Var = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    t4Var = (t4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, r4.f131706a, t4Var);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str3);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str4);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    g2Var = (g2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, e2.f131575a, g2Var);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    y0Var = (y0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, w0.f131737a, y0Var);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    h3Var = (h3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, t2.f131715a, h3Var);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v0(i, strDecodeStringElement, strDecodeStringElement2, str, str2, t4Var, str3, str4, g2Var, list, y0Var, h3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v0 value = (v0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v0.f131728l;
        String str = value.f131729a;
        h3 h3Var = value.k;
        y0 y0Var = value.f131734j;
        List list = value.i;
        g2 g2Var = value.f131733h;
        String str2 = value.f131732g;
        String str3 = value.f;
        t4 t4Var = value.e;
        String str4 = value.d;
        String str5 = value.f131731c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131730b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || t4Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, r4.f131706a, t4Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || g2Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, e2.f131575a, g2Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || y0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, w0.f131737a, y0Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || h3Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, t2.f131715a, h3Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
