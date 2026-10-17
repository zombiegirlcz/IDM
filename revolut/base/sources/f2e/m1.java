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
public final /* synthetic */ class m1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f131657a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m1 m1Var = new m1();
        f131657a = m1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.ExclusivesTileDto", m1Var, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("productOffer", true);
        pluginGeneratedSerialDescriptor.j("auctionOffer", true);
        pluginGeneratedSerialDescriptor.j("soldOutProductOffer", true);
        pluginGeneratedSerialDescriptor.j("lockedProductOffer", true);
        pluginGeneratedSerialDescriptor.j("comingSoonProductOffer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(x3.f131764a);
        KSerializer kSerializerC2 = nlm.a.c(e.f131573a);
        KSerializer kSerializerC3 = nlm.a.c(b5.f131546a);
        KSerializer kSerializerC4 = nlm.a.c(b2.f131544a);
        KSerializer kSerializerC5 = nlm.a.c(k0.f131640a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        z3 z3Var = null;
        g gVar = null;
        d5 d5Var = null;
        d2 d2Var = null;
        m0 m0Var = null;
        int i = 0;
        boolean z = true;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3Var = (z3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, x3.f131764a, z3Var);
                    i |= 16;
                    break;
                case 5:
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, e.f131573a, gVar);
                    i |= 32;
                    break;
                case 6:
                    d5Var = (d5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b5.f131546a, d5Var);
                    i |= 64;
                    break;
                case 7:
                    d2Var = (d2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b2.f131544a, d2Var);
                    i |= 128;
                    break;
                case 8:
                    m0Var = (m0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, k0.f131640a, m0Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, z3Var, gVar, d5Var, d2Var, m0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o1 value = (o1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f131673a;
        m0 m0Var = value.i;
        d2 d2Var = value.f131677h;
        d5 d5Var = value.f131676g;
        g gVar = value.f;
        z3 z3Var = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131674b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f131675c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || z3Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, x3.f131764a, z3Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || gVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, e.f131573a, gVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, b5.f131546a, d5Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d2Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, b2.f131544a, d2Var);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || m0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, k0.f131640a, m0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
