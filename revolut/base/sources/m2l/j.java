package m2l;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class j implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f202211a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f202211a = jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.wealth.data.core.insights.ExpectedAnnualReturnInsightDto", jVar, 8);
        pluginGeneratedSerialDescriptor.j("actual", false);
        pluginGeneratedSerialDescriptor.j("reference", false);
        pluginGeneratedSerialDescriptor.j("earningsPerShareGrowthContribution", true);
        pluginGeneratedSerialDescriptor.j("priceEarningsContribution", true);
        pluginGeneratedSerialDescriptor.j("dividendsContribution", true);
        pluginGeneratedSerialDescriptor.j("volatility", true);
        pluginGeneratedSerialDescriptor.j("riskFreeRate", true);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.a aVar = ie0.a.f160587a;
        KSerializer kSerializerC = nlm.a.c(aVar);
        KSerializer kSerializerC2 = nlm.a.c(aVar);
        KSerializer kSerializerC3 = nlm.a.c(aVar);
        KSerializer kSerializerC4 = nlm.a.c(aVar);
        KSerializer kSerializerC5 = nlm.a.c(aVar);
        s sVar = s.f202227a;
        return new KSerializer[]{sVar, sVar, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, m.f202217a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        u uVar = null;
        u uVar2 = null;
        BigDecimal bigDecimal = null;
        BigDecimal bigDecimal2 = null;
        BigDecimal bigDecimal3 = null;
        BigDecimal bigDecimal4 = null;
        BigDecimal bigDecimal5 = null;
        o oVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    uVar = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, s.f202227a, uVar);
                    i |= 1;
                    break;
                case 1:
                    uVar2 = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, s.f202227a, uVar2);
                    i |= 2;
                    break;
                case 2:
                    bigDecimal = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal);
                    i |= 4;
                    break;
                case 3:
                    bigDecimal2 = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ie0.a.f160587a, bigDecimal2);
                    i |= 8;
                    break;
                case 4:
                    bigDecimal3 = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ie0.a.f160587a, bigDecimal3);
                    i |= 16;
                    break;
                case 5:
                    bigDecimal4 = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.a.f160587a, bigDecimal4);
                    i |= 32;
                    break;
                case 6:
                    bigDecimal5 = (BigDecimal) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ie0.a.f160587a, bigDecimal5);
                    i |= 64;
                    break;
                case 7:
                    oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, m.f202217a, oVar);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l(i, uVar, uVar2, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, oVar);
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
        s sVar = s.f202227a;
        u uVar = value.f202212a;
        BigDecimal bigDecimal = value.f202215g;
        BigDecimal bigDecimal2 = value.f;
        BigDecimal bigDecimal3 = value.e;
        BigDecimal bigDecimal4 = value.d;
        BigDecimal bigDecimal5 = value.f202214c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uVar);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, sVar, value.f202213b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bigDecimal5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bigDecimal4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, ie0.a.f160587a, bigDecimal4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bigDecimal3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ie0.a.f160587a, bigDecimal3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bigDecimal2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ie0.a.f160587a, bigDecimal2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bigDecimal != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, ie0.a.f160587a, bigDecimal);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, m.f202217a, value.f202216h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
