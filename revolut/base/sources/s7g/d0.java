package s7g;

import java.util.List;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f260696a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        f260696a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingDetailsResponseDto", d0Var, 15);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j("destination", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("customerOrderReference", false);
        pluginGeneratedSerialDescriptor.j("tripType", false);
        pluginGeneratedSerialDescriptor.j("departureDate", false);
        pluginGeneratedSerialDescriptor.j("returnDate", true);
        pluginGeneratedSerialDescriptor.j("destinationImageUrl", false);
        pluginGeneratedSerialDescriptor.j("primaryContact", true);
        pluginGeneratedSerialDescriptor.j("bounds", false);
        pluginGeneratedSerialDescriptor.j("travellers", false);
        pluginGeneratedSerialDescriptor.j("ticketRules", true);
        pluginGeneratedSerialDescriptor.j("checkInInstructions", false);
        pluginGeneratedSerialDescriptor.j("itineraryTraits", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = f0.f260711p;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, nlm.a.c(v1Var), v1Var, nlm.a.c(a0.f260682a), lazyArr[10].getValue(), lazyArr[11].getValue(), nlm.a.c(p0.f260780a), lazyArr[13].getValue(), nlm.a.c((KSerializer) lazyArr[14].getValue())};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.f260711p;
        dVarBeginStructure.getClass();
        c0 c0Var = null;
        List list = null;
        List list2 = null;
        r0 r0Var = null;
        List list3 = null;
        List list4 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        String str2 = null;
        String strDecodeStringElement7 = null;
        String strDecodeStringElement8 = null;
        int i = 0;
        boolean z = true;
        while (true) {
            String str3 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f0(i, strDecodeStringElement8, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, str2, strDecodeStringElement7, c0Var, list3, list4, r0Var, list2, list);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement2;
                    z = false;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    strDecodeStringElement8 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    i |= 2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    strDecodeStringElement = str3;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str3;
                    break;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str3;
                    break;
                case 5:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    strDecodeStringElement = str3;
                    break;
                case 6:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    strDecodeStringElement = str3;
                    break;
                case 7:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 8:
                    strDecodeStringElement7 = dVarBeginStructure.decodeStringElement(serialDescriptor, 8);
                    i |= 256;
                    strDecodeStringElement = str3;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, a0.f260682a, c0Var);
                    i |= 512;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr[10].getValue(), list3);
                    i |= 1024;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, (mlm.b) lazyArr[11].getValue(), list4);
                    i |= 2048;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    r0Var = (r0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, p0.f260780a, r0Var);
                    i |= 4096;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    str = strDecodeStringElement2;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 13, (mlm.b) lazyArr[13].getValue(), list2);
                    i |= 8192;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 14:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, (mlm.b) lazyArr[14].getValue(), list);
                    i |= 16384;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f0 value = (f0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f0.f260711p;
        String str = value.f260712a;
        List list = value.o;
        r0 r0Var = value.f260719m;
        c0 c0Var = value.f260717j;
        String str2 = value.f260716h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f260713b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f260714c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f260715g);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, a0.f260682a, c0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (mlm.h) lazyArr[11].getValue(), value.f260718l);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || r0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, p0.f260780a, r0Var);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (mlm.h) lazyArr[13].getValue(), value.f260720n);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, (mlm.h) lazyArr[14].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
