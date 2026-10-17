package f2e;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5 f131619a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h5 h5Var = new h5();
        f131619a = h5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.VoucherDto", h5Var, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("purchaseDate", true);
        pluginGeneratedSerialDescriptor.j("expiryDate", true);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("logoImageUrl", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("availableAmount", true);
        pluginGeneratedSerialDescriptor.j("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.t0 t0Var = qlm.t0.f247706a;
        KSerializer kSerializerC = nlm.a.c(t0Var);
        KSerializer kSerializerC2 = nlm.a.c(t0Var);
        a.C1001a c1001a = a.C1001a.f176860a;
        KSerializer kSerializerC3 = nlm.a.c(c1001a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, v1Var, v1Var, c1001a, kSerializerC3, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        Long l2 = null;
        Long l3 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        String strDecodeStringElement5 = null;
        int i = 0;
        boolean z = true;
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
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l2);
                    i |= 4;
                    break;
                case 3:
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l3);
                    i |= 8;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, a.C1001a.f176860a, aVar);
                    i |= 64;
                    break;
                case 7:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, a.C1001a.f176860a, aVar2);
                    i |= 128;
                    break;
                case 8:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j5(i, strDecodeStringElement, strDecodeStringElement2, l2, l3, strDecodeStringElement3, strDecodeStringElement4, aVar, aVar2, strDecodeStringElement5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j5 value = (j5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f131635a;
        jo3.a aVar = value.f131639h;
        Long l2 = value.d;
        Long l3 = value.f131637c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f131636b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, c1001a, value.f131638g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, c1001a, aVar);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
