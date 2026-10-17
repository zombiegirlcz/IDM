package pl9;

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
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f237302a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        n nVar = new n();
        f237302a = nVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.pay_with_smile.impl.data.dto.ConfirmationDetailsDto", nVar, 7);
        pluginGeneratedSerialDescriptor.j("expiresAt", false);
        pluginGeneratedSerialDescriptor.j("createdAt", false);
        pluginGeneratedSerialDescriptor.j("merchantTradingName", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("device", false);
        pluginGeneratedSerialDescriptor.j("client", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private n() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.f247706a;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{t0Var, t0Var, v1Var, t0Var, v1Var, q.f237307a, k.f237299a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        s sVar = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        long jDecodeLongElement3 = 0;
        m mVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    jDecodeLongElement3 = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    sVar = (s) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, q.f237307a, sVar);
                    i |= 32;
                    break;
                case 6:
                    mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, k.f237299a, mVar);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p(i, jDecodeLongElement, jDecodeLongElement2, strDecodeStringElement, jDecodeLongElement3, strDecodeStringElement2, sVar, mVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p value = (p) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f237303a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f237304b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f237305c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, q.f237307a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, k.f237299a, value.f237306g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
