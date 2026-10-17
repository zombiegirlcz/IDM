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
public final /* synthetic */ class w5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w5 f153351a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w5 w5Var = new w5();
        f153351a = w5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.OfferingDto", w5Var, 3);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        pluginGeneratedSerialDescriptor.j("monthly", false);
        pluginGeneratedSerialDescriptor.j("annual", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        y7 y7Var = y7.f153380a;
        return new KSerializer[]{qlm.v1.f247718a, nlm.a.c(y7Var), nlm.a.c(y7Var)};
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
        a8 a8Var = null;
        a8 a8Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                a8Var = (a8) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, y7.f153380a, a8Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                a8Var2 = (a8) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y7.f153380a, a8Var2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new y5(i, strDecodeStringElement, a8Var, a8Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        y5 value = (y5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153377a);
        y7 y7Var = y7.f153380a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, y7Var, value.f153378b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, y7Var, value.f153379c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
