package jf7;

import kotlin.Lazy;
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

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class y0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f173726a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y0 y0Var = new y0();
        f173726a = y0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.incentive_reward.impl.model.details.block.IncentiveRewardDetailsBlock.ToDo.Action", y0Var, 3);
        pluginGeneratedSerialDescriptor.j("style", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("deeplink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{a1.d[0].getValue(), v1Var, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a1.d;
        dVarBeginStructure.getClass();
        b1 b1Var = null;
        boolean z = true;
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b1Var = (b1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), b1Var);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a1(i, b1Var, strDecodeStringElement, strDecodeStringElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a1 value = (a1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) a1.d[0].getValue(), value.f173656a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f173657b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f173658c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
