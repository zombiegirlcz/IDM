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
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f237736a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f237736a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.tax_residency.impl.exemption.models.dto.LimitOrderRequestDto", sVar, 3);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("validityPeriod", false);
        pluginGeneratedSerialDescriptor.j("allowanceLimit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{v1.f247718a, f0.f237718a, ie0.o.f160615a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        h0 h0Var = null;
        dj0.d dVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                h0Var = (h0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, f0.f237718a, h0Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.o.f160615a, dVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, strDecodeStringElement, h0Var, dVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f237737a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, f0.f237718a, value.f237738b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.o.f160615a, value.f237739c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
