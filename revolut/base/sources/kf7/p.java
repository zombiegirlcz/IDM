package kf7;

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
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f183307a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f183307a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.incentive_reward.impl.model.lotteries.LotteryEnrollmentDetails", pVar, 5);
        pluginGeneratedSerialDescriptor.j("enroll", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("iconName", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{qlm.h.f247648a, v1Var, v1Var, v1Var, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean zDecodeBooleanElement = false;
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, zDecodeBooleanElement, i);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f183308a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f183309b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f183310c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
