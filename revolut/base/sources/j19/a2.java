package j19;

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
public final /* synthetic */ class a2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a2 f170170a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a2 a2Var = new a2();
        f170170a = a2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.content_gateway.api.model.slot.LifestyleContentGatewaySlotProductCarouselItem.Content", a2Var, 10);
        pluginGeneratedSerialDescriptor.j("image", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("logo", true);
        pluginGeneratedSerialDescriptor.j("logoV2", true);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("analyticsRef", true);
        pluginGeneratedSerialDescriptor.j("badge", true);
        pluginGeneratedSerialDescriptor.j("richSubtitle", true);
        pluginGeneratedSerialDescriptor.j("progress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(k19.x.f180173a), k19.a.f180142a, nlm.a.c(v1Var), nlm.a.c(k19.n.f180162a), nlm.a.c(k19.d.f180150a), nlm.a.c(qlm.e0.f247634a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Float f = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        String str2 = null;
        k19.a0 a0Var = null;
        k19.c cVar = null;
        String str3 = null;
        k19.q qVar = null;
        k19.j jVar = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                    i |= 8;
                    break;
                case 4:
                    a0Var = (k19.a0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, k19.x.f180173a, a0Var);
                    i |= 16;
                    break;
                case 5:
                    cVar = (k19.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, k19.a.f180142a, cVar);
                    i |= 32;
                    break;
                case 6:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str3);
                    i |= 64;
                    break;
                case 7:
                    qVar = (k19.q) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, k19.n.f180162a, qVar);
                    i |= 128;
                    break;
                case 8:
                    jVar = (k19.j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, k19.d.f180150a, jVar);
                    i |= 256;
                    break;
                case 9:
                    f = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.e0.f247634a, f);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c2(i, strDecodeStringElement, strDecodeStringElement2, str, str2, a0Var, cVar, str3, qVar, jVar, f);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c2 value = (c2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f170177a;
        Float f = value.f170182j;
        k19.j jVar = value.i;
        k19.q qVar = value.f170181h;
        String str2 = value.f170180g;
        k19.a0 a0Var = value.e;
        String str3 = value.d;
        String str4 = value.f170179c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f170178b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || a0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, k19.x.f180173a, a0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, k19.a.f180142a, value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, k19.n.f180162a, qVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, k19.d.f180150a, jVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || f != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, qlm.e0.f247634a, f);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
