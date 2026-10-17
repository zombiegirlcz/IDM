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
public final /* synthetic */ class g0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f260726a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g0 g0Var = new g0();
        f260726a = g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingDetailsSegmentDto", g0Var, 10);
        pluginGeneratedSerialDescriptor.j("flightNumber", false);
        pluginGeneratedSerialDescriptor.j("operationalCarrier", false);
        pluginGeneratedSerialDescriptor.j("marketingCarrier", true);
        pluginGeneratedSerialDescriptor.j("cabinClass", false);
        pluginGeneratedSerialDescriptor.j("durationMinutes", false);
        pluginGeneratedSerialDescriptor.j("technicalStops", true);
        pluginGeneratedSerialDescriptor.j("departure", false);
        pluginGeneratedSerialDescriptor.j("arrival", false);
        pluginGeneratedSerialDescriptor.j("layoverDurationMinutes", true);
        pluginGeneratedSerialDescriptor.j("traits", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = i0.k;
        KSerializer kSerializerC = nlm.a.c(t7g.d.f268670a);
        qlm.n0 n0Var = qlm.n0.f247680a;
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC3 = nlm.a.c(n0Var);
        KSerializer kSerializerC4 = nlm.a.c((KSerializer) lazyArr[9].getValue());
        qlm.v1 v1Var = qlm.v1.f247718a;
        t7g.g gVar = t7g.g.f268674a;
        return new KSerializer[]{v1Var, x.f260812a, kSerializerC, v1Var, n0Var, kSerializerC2, gVar, gVar, kSerializerC3, kSerializerC4};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = i0.k;
        dVarBeginStructure.getClass();
        Integer num = null;
        List list = null;
        String strDecodeStringElement = null;
        z zVar = null;
        t7g.f fVar = null;
        String strDecodeStringElement2 = null;
        List list2 = null;
        t7g.i iVar = null;
        t7g.i iVar2 = null;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
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
                    zVar = (z) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, x.f260812a, zVar);
                    i |= 2;
                    break;
                case 2:
                    fVar = (t7g.f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t7g.d.f268670a, fVar);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    iVar = (t7g.i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, t7g.g.f268674a, iVar);
                    i |= 64;
                    break;
                case 7:
                    iVar2 = (t7g.i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, t7g.g.f268674a, iVar2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, num);
                    i |= 256;
                    break;
                case 9:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i0(i, strDecodeStringElement, zVar, fVar, strDecodeStringElement2, iDecodeIntElement, list2, iVar, iVar2, num, list);
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
        Lazy[] lazyArr = i0.k;
        String str = value.f260738a;
        List list = value.f260743j;
        Integer num = value.i;
        List list2 = value.f;
        t7g.f fVar = value.f260740c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, x.f260812a, value.f260739b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t7g.d.f268670a, fVar);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list2);
        }
        t7g.g gVar = t7g.g.f268674a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, gVar, value.f260741g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, gVar, value.f260742h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, qlm.n0.f247680a, num);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
