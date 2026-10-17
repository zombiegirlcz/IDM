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
public final /* synthetic */ class h1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f260733a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h1 h1Var = new h1();
        f260733a = h1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingPreviewResponseDto", h1Var, 6);
        pluginGeneratedSerialDescriptor.j("bookingToken", false);
        pluginGeneratedSerialDescriptor.j("payment", false);
        pluginGeneratedSerialDescriptor.j("offerDetails", false);
        pluginGeneratedSerialDescriptor.j("legalAcceptance", false);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        pluginGeneratedSerialDescriptor.j("carrierCodes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j1.f260746g;
        return new KSerializer[]{qlm.v1.f247718a, b1.f260686a, q1.f260786a, l2.f260760a, lazyArr[4].getValue(), lazyArr[5].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j1.f260746g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        d1 d1Var = null;
        s1 s1Var = null;
        n2 n2Var = null;
        List list = null;
        List list2 = null;
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
                    d1Var = (d1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, b1.f260686a, d1Var);
                    i |= 2;
                    break;
                case 2:
                    s1Var = (s1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, q1.f260786a, s1Var);
                    i |= 4;
                    break;
                case 3:
                    n2Var = (n2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, l2.f260760a, n2Var);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j1(i, strDecodeStringElement, d1Var, s1Var, n2Var, list, list2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j1 value = (j1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j1.f260746g;
        String str = value.f260747a;
        List list = value.f;
        List list2 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, b1.f260686a, value.f260748b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, q1.f260786a, value.f260749c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, l2.f260760a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list2, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
