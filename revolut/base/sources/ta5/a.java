package ta5;

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
import qlm.n0;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f269097a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f269097a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.credit.post_termination_plan.impl.network.models.PostTerminationPlanDetailsDto", aVar, 10);
        pluginGeneratedSerialDescriptor.j("planId", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("amountDue", false);
        pluginGeneratedSerialDescriptor.j("discountedAmount", false);
        pluginGeneratedSerialDescriptor.j("leftToRepay", false);
        pluginGeneratedSerialDescriptor.j("repaymentDay", false);
        pluginGeneratedSerialDescriptor.j("remainingRepayments", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("repaymentInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        n0 n0Var = n0.f247680a;
        KSerializer kSerializerC3 = nlm.a.c(n0Var);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, t0Var, kSerializerC, kSerializerC2, kSerializerC3, n0Var, v1Var, g.f269107a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Integer num = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        Long l2 = null;
        Long l3 = null;
        String strDecodeStringElement4 = null;
        long jDecodeLongElement = 0;
        int i = 0;
        int iDecodeIntElement = 0;
        boolean z = true;
        i iVar = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, t0.f247706a, l2);
                    i |= 16;
                    break;
                case 5:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, t0.f247706a, l3);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, num);
                    i |= 64;
                    break;
                case 7:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    iVar = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, g.f269107a, iVar);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, l2, l3, num, iDecodeIntElement, strDecodeStringElement4, iVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f269098a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f269099b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f269100c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        t0 t0Var = t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, t0Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, n0.f247680a, value.f269101g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.f269102h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, g.f269107a, value.f269103j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
