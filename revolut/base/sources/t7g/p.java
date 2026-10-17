package t7g;

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
import qlm.f0;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f268685a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f268685a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.common.SegmentDto", pVar, 9);
        pluginGeneratedSerialDescriptor.j("flightNumber", false);
        pluginGeneratedSerialDescriptor.j("operationalCarrier", false);
        pluginGeneratedSerialDescriptor.j("marketingCarrier", true);
        pluginGeneratedSerialDescriptor.j("cabinClass", false);
        pluginGeneratedSerialDescriptor.j("durationMinutes", false);
        pluginGeneratedSerialDescriptor.j("technicalStops", true);
        pluginGeneratedSerialDescriptor.j("departure", false);
        pluginGeneratedSerialDescriptor.j("arrival", false);
        pluginGeneratedSerialDescriptor.j("layoverDurationMinutes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r.f268686j;
        d dVar = d.f268670a;
        KSerializer kSerializerC = nlm.a.c(dVar);
        n0 n0Var = n0.f247680a;
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC3 = nlm.a.c(n0Var);
        v1 v1Var = v1.f247718a;
        g gVar = g.f268674a;
        return new KSerializer[]{v1Var, dVar, kSerializerC, v1Var, n0Var, kSerializerC2, gVar, gVar, kSerializerC3};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f268686j;
        dVarBeginStructure.getClass();
        Integer num = null;
        String strDecodeStringElement = null;
        f fVar = null;
        f fVar2 = null;
        String strDecodeStringElement2 = null;
        List list = null;
        i iVar = null;
        i iVar2 = null;
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
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d.f268670a, fVar);
                    i |= 2;
                    break;
                case 2:
                    fVar2 = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, d.f268670a, fVar2);
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    iVar = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, g.f268674a, iVar);
                    i |= 64;
                    break;
                case 7:
                    iVar2 = (i) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, g.f268674a, iVar2);
                    i |= 128;
                    break;
                case 8:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n0.f247680a, num);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, strDecodeStringElement, fVar, fVar2, strDecodeStringElement2, iDecodeIntElement, list, iVar, iVar2, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f268686j;
        String str = value.f268687a;
        Integer num = value.i;
        List list = value.f;
        f fVar = value.f268689c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        d dVar = d.f268670a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, dVar, value.f268688b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || fVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, dVar, fVar);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        g gVar = g.f268674a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, gVar, value.f268690g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, gVar, value.f268691h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, n0.f247680a, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
