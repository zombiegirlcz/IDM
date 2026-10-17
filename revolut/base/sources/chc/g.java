package chc;

import jo3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.n0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24159a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f24159a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rewards.impl.data.network.rent_and_bills.RentAndBillsConfigurationsDto.ConfigurationDto", gVar, 4);
        pluginGeneratedSerialDescriptor.j("maxEarnablePoints", false);
        pluginGeneratedSerialDescriptor.j("pointsEarnValue", false);
        pluginGeneratedSerialDescriptor.j("maxTransactions", false);
        pluginGeneratedSerialDescriptor.j("paymentCriteria", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.x.f247723a, a.C1001a.f176860a, n0.f247680a, i.f24160a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        int iDecodeIntElement = 0;
        double dDecodeDoubleElement = 0.0d;
        jo3.a aVar = null;
        k kVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dDecodeDoubleElement = dVarBeginStructure.decodeDoubleElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else if (iD == 2) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, i.f24160a, kVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, dDecodeDoubleElement, aVar, iDecodeIntElement, kVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m value = (m) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeDoubleElement(serialDescriptor, 0, value.f24169a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, value.f24170b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f24171c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, i.f24160a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
