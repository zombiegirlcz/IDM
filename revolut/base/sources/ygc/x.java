package ygc;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f313637a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        f313637a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rewards.impl.data.network.concierge.ConciergeAlbertineDetailsLayoutDto.HeaderDto", xVar, 4);
        pluginGeneratedSerialDescriptor.j("logo", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("notice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(z.f313638a);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, c0.f313600a, kSerializerC};
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
        h0 h0Var = null;
        b0 b0Var = null;
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
                h0Var = (h0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c0.f313600a, h0Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                b0Var = (b0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, z.f313638a, b0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i0(i, strDecodeStringElement, strDecodeStringElement2, h0Var, b0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i0 value = (i0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f313613a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f313614b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c0.f313600a, value.f313615c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, z.f313638a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
