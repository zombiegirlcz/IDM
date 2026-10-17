package pne;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.t0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f237718a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        f237718a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tax_residency.impl.exemption.models.dto.ValidityPeriodDto", f0Var, 2);
        pluginGeneratedSerialDescriptor.j("from", false);
        pluginGeneratedSerialDescriptor.j("to", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{t0Var, t0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h0(i, jDecodeLongElement, jDecodeLongElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h0 value = (h0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f237720a);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, value.f237721b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
