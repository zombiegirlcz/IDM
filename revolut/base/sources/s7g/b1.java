package s7g;

import java.util.List;
import jo3.a;
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
public final /* synthetic */ class b1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f260686a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b1 b1Var = new b1();
        f260686a = b1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingPreviewPaymentDto", b1Var, 9);
        pluginGeneratedSerialDescriptor.j("total", false);
        pluginGeneratedSerialDescriptor.j("priceWithPoints", false);
        pluginGeneratedSerialDescriptor.j("rewardPoints", false);
        pluginGeneratedSerialDescriptor.j("bookingCostFee", true);
        pluginGeneratedSerialDescriptor.j("tax", false);
        pluginGeneratedSerialDescriptor.j("pointsRedeemOptions", false);
        pluginGeneratedSerialDescriptor.j("carrierPriceBreakdowns", true);
        pluginGeneratedSerialDescriptor.j("airProductPriceBreakdown", true);
        pluginGeneratedSerialDescriptor.j("extraProductsPriceBreakdown", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = d1.f260697j;
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{c1001a, z7g.j.f319983a, z7g.d.f319973a, nlm.a.c(c1001a), c1001a, lazyArr[5].getValue(), nlm.a.c((KSerializer) lazyArr[6].getValue()), nlm.a.c(z7g.m.f319986a), nlm.a.c(z7g.b0.f319967a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d1.f260697j;
        dVarBeginStructure.getClass();
        z7g.d0 d0Var = null;
        jo3.a aVar = null;
        z7g.l lVar = null;
        z7g.f fVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        List list = null;
        List list2 = null;
        z7g.o oVar = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                    break;
                case 1:
                    lVar = (z7g.l) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, z7g.j.f319983a, lVar);
                    i |= 2;
                    break;
                case 2:
                    fVar = (z7g.f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, z7g.d.f319973a, fVar);
                    i |= 4;
                    break;
                case 3:
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar2);
                    i |= 8;
                    break;
                case 4:
                    aVar3 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar3);
                    i |= 16;
                    break;
                case 5:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    oVar = (z7g.o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, z7g.m.f319986a, oVar);
                    i |= 128;
                    break;
                case 8:
                    d0Var = (z7g.d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, z7g.b0.f319967a, d0Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d1(i, aVar, lVar, fVar, aVar2, aVar3, list, list2, oVar, d0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d1 value = (d1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = d1.f260697j;
        a.C1001a c1001a = a.C1001a.f176860a;
        jo3.a aVar = value.f260698a;
        z7g.d0 d0Var = value.i;
        z7g.o oVar = value.f260702h;
        List list = value.f260701g;
        jo3.a aVar2 = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, aVar);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, z7g.j.f319983a, value.f260699b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, z7g.d.f319973a, value.f260700c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, aVar2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, c1001a, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, z7g.m.f319986a, oVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, z7g.b0.f319967a, d0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
