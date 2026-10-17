package oti;

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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class v implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f229695a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        f229695a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftCheckoutPointsOptionsDto", vVar, 4);
        pluginGeneratedSerialDescriptor.j("points", false);
        pluginGeneratedSerialDescriptor.j("discount", false);
        pluginGeneratedSerialDescriptor.j("finalPrice", false);
        pluginGeneratedSerialDescriptor.j("preselected", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{qlm.v1.f247718a, c1001a, c1001a, qlm.h.f247648a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        jo3.a aVar = null;
        jo3.a aVar2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else if (iD == 2) {
                aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x(i, strDecodeStringElement, aVar, aVar2, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x value = (x) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f229701a);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c1001a, value.f229702b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, c1001a, value.f229703c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
