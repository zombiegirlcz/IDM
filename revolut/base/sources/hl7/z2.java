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
public final /* synthetic */ class z2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2 f153390a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z2 z2Var = new z2();
        f153390a = z2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.DrivingStatisticsDto", z2Var, 4);
        pluginGeneratedSerialDescriptor.j("reportStartDate", false);
        pluginGeneratedSerialDescriptor.j("reportEndDate", false);
        pluginGeneratedSerialDescriptor.j("scores", false);
        pluginGeneratedSerialDescriptor.j("tripSummary", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(c3.f153046a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, f3.f153096a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        e3 e3Var = null;
        h3 h3Var = null;
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
                e3Var = (e3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c3.f153046a, e3Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                h3Var = (h3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, f3.f153096a, h3Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new b3(i, strDecodeStringElement, strDecodeStringElement2, e3Var, h3Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        b3 value = (b3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f153028a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f153029b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, c3.f153046a, value.f153030c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, f3.f153096a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
