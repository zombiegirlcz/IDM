package hl7;

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
public final /* synthetic */ class e8 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8 f153081a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e8 e8Var = new e8();
        f153081a = e8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.PricingTogglesDto", e8Var, 2);
        pluginGeneratedSerialDescriptor.j("smartDriving", false);
        pluginGeneratedSerialDescriptor.j("annualPayment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e8() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        b8 b8Var = b8.f153038a;
        return new KSerializer[]{b8Var, b8Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        d8 d8Var = null;
        boolean z = true;
        int i = 0;
        d8 d8Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                d8Var = (d8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b8.f153038a, d8Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                d8Var2 = (d8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, b8.f153038a, d8Var2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g8(i, d8Var, d8Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g8 value = (g8) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        b8 b8Var = b8.f153038a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, b8Var, value.f153120a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, b8Var, value.f153121b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
