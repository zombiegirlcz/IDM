package du7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b4 f117611a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b4 b4Var = new b4();
        f117611a = b4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.EmbeddedInsuranceDetailsLayoutDto", b4Var, 15);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("header", false);
        pluginGeneratedSerialDescriptor.j("documents", false);
        pluginGeneratedSerialDescriptor.j("getHelp", false);
        pluginGeneratedSerialDescriptor.j("claims", false);
        pluginGeneratedSerialDescriptor.j("orderCardWidget", false);
        pluginGeneratedSerialDescriptor.j("activateCoverageWidget", false);
        pluginGeneratedSerialDescriptor.j("conditions", false);
        pluginGeneratedSerialDescriptor.j("coverages", false);
        pluginGeneratedSerialDescriptor.j("promotion", false);
        pluginGeneratedSerialDescriptor.j("pricingPlanBanner", false);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        pluginGeneratedSerialDescriptor.j("footerText", false);
        pluginGeneratedSerialDescriptor.j("contacts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.v1.f247718a, u4.f117865a, nlm.a.c(h3.f117695a), nlm.a.c(v0.f117869a), nlm.a.c(i0.INSTANCE.serializer()), nlm.a.c(c7.f117625a), nlm.a.c(a.f117594a), nlm.a.c(k0.f117729a), nlm.a.c(q2.f117819a), nlm.a.c(i7.f117722a), nlm.a.c(f7.f117677a), nlm.a.c(m4.f117773a), nlm.a.c(d4.f117642a), nlm.a.c(i4.f117716a), nlm.a.c(j1.f117724a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        i1 i1Var;
        k4 k4Var;
        i1 i1Var2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        k7 k7Var = null;
        k4 k4Var2 = null;
        h4 h4Var = null;
        h7 h7Var = null;
        t4 t4Var = null;
        t1 t1Var = null;
        a4 a4Var = null;
        i1 i1Var3 = null;
        i0 i0Var = null;
        e7 e7Var = null;
        c cVar = null;
        r0 r0Var = null;
        d3 d3Var = null;
        String strDecodeStringElement = null;
        h5 h5Var = null;
        int i = 0;
        boolean z = true;
        while (z) {
            a4 a4Var2 = a4Var;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    i1Var = i1Var3;
                    z = false;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 0:
                    k4Var = k4Var2;
                    i1Var2 = i1Var3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    a4Var = a4Var2;
                    i1Var3 = i1Var2;
                    k4Var2 = k4Var;
                    break;
                case 1:
                    k4Var = k4Var2;
                    i1Var2 = i1Var3;
                    h5Var = (h5) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, u4.f117865a, h5Var);
                    i |= 2;
                    a4Var = a4Var2;
                    i1Var3 = i1Var2;
                    k4Var2 = k4Var;
                    break;
                case 2:
                    k4Var = k4Var2;
                    i1Var2 = i1Var3;
                    a4Var = (a4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, h3.f117695a, a4Var2);
                    i |= 4;
                    i1Var3 = i1Var2;
                    k4Var2 = k4Var;
                    break;
                case 3:
                    k4Var = k4Var2;
                    i1Var3 = (i1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v0.f117869a, i1Var3);
                    i |= 8;
                    a4Var = a4Var2;
                    k4Var2 = k4Var;
                    break;
                case 4:
                    i1Var = i1Var3;
                    i0Var = (i0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i0.INSTANCE.serializer(), i0Var);
                    i |= 16;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 5:
                    i1Var = i1Var3;
                    e7Var = (e7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, c7.f117625a, e7Var);
                    i |= 32;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 6:
                    i1Var = i1Var3;
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, a.f117594a, cVar);
                    i |= 64;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 7:
                    i1Var = i1Var3;
                    r0Var = (r0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, k0.f117729a, r0Var);
                    i |= 128;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 8:
                    i1Var = i1Var3;
                    d3Var = (d3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, q2.f117819a, d3Var);
                    i |= 256;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 9:
                    i1Var = i1Var3;
                    k7Var = (k7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, i7.f117722a, k7Var);
                    i |= 512;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 10:
                    i1Var = i1Var3;
                    h7Var = (h7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, f7.f117677a, h7Var);
                    i |= 1024;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 11:
                    i1Var = i1Var3;
                    t4Var = (t4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, m4.f117773a, t4Var);
                    i |= 2048;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 12:
                    i1Var = i1Var3;
                    h4Var = (h4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, d4.f117642a, h4Var);
                    i |= 4096;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 13:
                    i1Var = i1Var3;
                    k4Var2 = (k4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, i4.f117716a, k4Var2);
                    i |= 8192;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                case 14:
                    i1Var = i1Var3;
                    t1Var = (t1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, j1.f117724a, t1Var);
                    i |= 16384;
                    a4Var = a4Var2;
                    i1Var3 = i1Var;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        i1 i1Var4 = i1Var3;
        h5 h5Var2 = h5Var;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l4(i, strDecodeStringElement, h5Var2, a4Var, i1Var4, i0Var, e7Var, cVar, r0Var, d3Var, k7Var, h7Var, t4Var, h4Var, k4Var2, t1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l4 value = (l4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117744a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, u4.f117865a, value.f117745b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, h3.f117695a, value.f117746c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v0.f117869a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, i0.INSTANCE.serializer(), value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, c7.f117625a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, a.f117594a, value.f117747g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, k0.f117729a, value.f117748h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, q2.f117819a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, i7.f117722a, value.f117749j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, f7.f117677a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, m4.f117773a, value.f117750l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, d4.f117642a, value.f117751m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, i4.f117716a, value.f117752n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, j1.f117724a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
