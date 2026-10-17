package ttj;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class q0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q0 f274394a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q0 q0Var = new q0();
        f274394a = q0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.rewards_hub.network.dto.RewardsHubCollectionItemDto", q0Var, 10);
        pluginGeneratedSerialDescriptor.j("campaignId", false);
        pluginGeneratedSerialDescriptor.j("challengeId", true);
        pluginGeneratedSerialDescriptor.j("itemId", false);
        pluginGeneratedSerialDescriptor.j("position", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("reward", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, qlm.n0.f247680a, v1Var, e0.f274336a, v1Var, nlm.a.c(v1Var), n0.f274376a, nlm.a.c(t0.f274406a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        v0 v0Var = null;
        String strDecodeStringElement = null;
        String str = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        g0 g0Var = null;
        String strDecodeStringElement4 = null;
        String str2 = null;
        p0 p0Var = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    g0Var = (g0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, e0.f274336a, g0Var);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    break;
                case 8:
                    p0Var = (p0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, n0.f274376a, p0Var);
                    i |= 256;
                    break;
                case 9:
                    v0Var = (v0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, t0.f274406a, v0Var);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s0(i, strDecodeStringElement, str, strDecodeStringElement2, iDecodeIntElement, strDecodeStringElement3, g0Var, strDecodeStringElement4, str2, p0Var, v0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s0 value = (s0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f274398a;
        v0 v0Var = value.f274403j;
        String str2 = value.f274402h;
        String str3 = value.f274399b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str3);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f274400c);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, e0.f274336a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f274401g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, n0.f274376a, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || v0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, t0.f274406a, v0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
