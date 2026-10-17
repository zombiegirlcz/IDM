package dp5;

import jo3.a;
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
public final /* synthetic */ class z0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f116829a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        f116829a = z0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.dto.CryptoWithdrawQuoteResponseDto", z0Var, 8);
        pluginGeneratedSerialDescriptor.j("token", false);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        pluginGeneratedSerialDescriptor.j("rate", false);
        pluginGeneratedSerialDescriptor.j("billAmount", false);
        pluginGeneratedSerialDescriptor.j("recipientAmount", false);
        pluginGeneratedSerialDescriptor.j("charges", false);
        pluginGeneratedSerialDescriptor.j("tax", false);
        pluginGeneratedSerialDescriptor.j("recipientAmountModified", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(t0.f116812a);
        KSerializer kSerializerC2 = nlm.a.c(q0.f116794a);
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{v1.f247718a, qlm.t0.f247706a, kSerializerC, c1001a, c1001a, n0.f116785a, kSerializerC2, qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        s0 s0Var = null;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        v0 v0Var = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        p0 p0Var = null;
        long jDecodeLongElement = 0;
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
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    v0Var = (v0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t0.f116812a, v0Var);
                    i |= 4;
                    break;
                case 3:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar);
                    i |= 8;
                    break;
                case 4:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar2);
                    i |= 16;
                    break;
                case 5:
                    p0Var = (p0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, n0.f116785a, p0Var);
                    i |= 32;
                    break;
                case 6:
                    s0Var = (s0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, q0.f116794a, s0Var);
                    i |= 64;
                    break;
                case 7:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b1(i, strDecodeStringElement, jDecodeLongElement, v0Var, aVar, aVar2, p0Var, s0Var, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b1 value = (b1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f116728a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f116729b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t0.f116812a, value.f116730c);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, c1001a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, c1001a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, n0.f116785a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, q0.f116794a, value.f116731g);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.f116732h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
