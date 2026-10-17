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
public final /* synthetic */ class d4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4 f153061a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d4 d4Var = new d4();
        f153061a = d4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_car.impl.data.dto.FuturePriceChangeDto", d4Var, 3);
        pluginGeneratedSerialDescriptor.j("oldPrice", false);
        pluginGeneratedSerialDescriptor.j("newPrice", false);
        pluginGeneratedSerialDescriptor.j("nextPaymentDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.o oVar = ie0.o.f160615a;
        return new KSerializer[]{oVar, oVar, qlm.v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        dj0.d dVar = null;
        boolean z = true;
        int i = 0;
        dj0.d dVar2 = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.o.f160615a, dVar);
                i |= 1;
            } else if (iD == 1) {
                dVar2 = (dj0.d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.o.f160615a, dVar2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f4(i, dVar, dVar2, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f4 value = (f4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ie0.o oVar = ie0.o.f160615a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, oVar, value.f153097a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, oVar, value.f153098b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f153099c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
