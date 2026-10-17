package oti;

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
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f229648a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f229648a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftBookingSlotStatusDto", jVar, 13);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("freeCancellationUntilDate", false);
        pluginGeneratedSerialDescriptor.j("airportCipId", false);
        pluginGeneratedSerialDescriptor.j("cipName", false);
        pluginGeneratedSerialDescriptor.j("cipLocation", false);
        pluginGeneratedSerialDescriptor.j("terminalName", false);
        pluginGeneratedSerialDescriptor.j("date", false);
        pluginGeneratedSerialDescriptor.j("timeSlot", false);
        pluginGeneratedSerialDescriptor.j("passengersCount", false);
        pluginGeneratedSerialDescriptor.j("priceBreakdown", false);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("warningCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), v1Var, v1Var, v1Var, v1Var, v1Var, o.f229672a, qlm.n0.f247680a, y.f229705a, d2.f229629a, nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        a0 a0Var = null;
        f2 f2Var = null;
        String str2 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str3 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String strDecodeStringElement7 = null;
        q qVar = null;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement;
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    continue;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str3);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    str = strDecodeStringElement;
                    qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, o.f229672a, qVar);
                    i |= 256;
                    break;
                case 9:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    str = strDecodeStringElement;
                    a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, y.f229705a, a0Var);
                    i |= 1024;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    f2Var = (f2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, d2.f229629a, f2Var);
                    i |= 2048;
                    break;
                case 12:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str2);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            strDecodeStringElement = str;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, strDecodeStringElement, strDecodeStringElement2, str3, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, strDecodeStringElement7, qVar, iDecodeIntElement, a0Var, f2Var, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l value = (l) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f229654a;
        String str2 = value.f229661m;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f229655b);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f229656c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f229657g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.f229658h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, o.f229672a, value.i);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 9, value.f229659j);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, y.f229705a, value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, d2.f229629a, value.f229660l);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
