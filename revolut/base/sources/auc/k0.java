package auc;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f9742a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k0 k0Var = new k0();
        f9742a = k0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.security_hub.impl.network.StreetModeTrustedLocationDto", k0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.j("radiusInMeters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        qlm.x xVar = qlm.x.f247723a;
        return new KSerializer[]{v1Var, v1Var, xVar, xVar, qlm.n0.f247680a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        double dDecodeDoubleElement = 0.0d;
        double dDecodeDoubleElement2 = 0.0d;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                dDecodeDoubleElement2 = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m0(i, strDecodeStringElement, strDecodeStringElement2, dDecodeDoubleElement, dDecodeDoubleElement2, iDecodeIntElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m0 value = (m0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f9748a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f9749b);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 2, value.f9750c);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
