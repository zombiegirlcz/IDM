package z7g;

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
import qlm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f319962a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f319962a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.payment.PaymentDto", aVar, 8);
        pluginGeneratedSerialDescriptor.j("total", false);
        pluginGeneratedSerialDescriptor.j("priceWithPoints", true);
        pluginGeneratedSerialDescriptor.j("rewardPoints", false);
        pluginGeneratedSerialDescriptor.j("bookingCostFee", true);
        pluginGeneratedSerialDescriptor.j("tax", false);
        pluginGeneratedSerialDescriptor.j("carrierPriceBreakdowns", true);
        pluginGeneratedSerialDescriptor.j("airProductPriceBreakdown", true);
        pluginGeneratedSerialDescriptor.j("extraProductsPriceBreakdown", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = c.i;
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{c1001a, nlm.a.c(j.f319983a), d.f319973a, nlm.a.c(c1001a), c1001a, nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c(m.f319986a), nlm.a.c(b0.f319967a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.i;
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        l lVar = null;
        f fVar = null;
        jo3.a aVar2 = null;
        jo3.a aVar3 = null;
        List list = null;
        o oVar = null;
        d0 d0Var = null;
        int i = 0;
        boolean z = true;
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
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, j.f319983a, lVar);
                    i |= 2;
                    break;
                case 2:
                    fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d.f319973a, fVar);
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    oVar = (o) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, m.f319986a, oVar);
                    i |= 64;
                    break;
                case 7:
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b0.f319967a, d0Var);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, aVar, lVar, fVar, aVar2, aVar3, list, oVar, d0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = c.i;
        a.C1001a c1001a = a.C1001a.f176860a;
        jo3.a aVar = value.f319968a;
        d0 d0Var = value.f319972h;
        o oVar = value.f319971g;
        List list = value.f;
        jo3.a aVar2 = value.d;
        l lVar = value.f319969b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, aVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || lVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, j.f319983a, lVar);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, d.f319973a, value.f319970c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, c1001a, aVar2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, c1001a, value.e);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, m.f319986a, oVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || d0Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, b0.f319967a, d0Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
