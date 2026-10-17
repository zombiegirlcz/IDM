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
public final /* synthetic */ class q1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f260786a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q1 q1Var = new q1();
        f260786a = q1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.OfferDetailsDto", q1Var, 3);
        pluginGeneratedSerialDescriptor.j("fareRules", false);
        pluginGeneratedSerialDescriptor.j("travellers", true);
        pluginGeneratedSerialDescriptor.j("itineraryDetails", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.v1.f247718a, s1.d[1].getValue(), nlm.a.c(y0.f260816a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = s1.d;
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        List list = null;
        a1 a1Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                a1Var = (a1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, y0.f260816a, a1Var);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s1(i, strDecodeStringElement, list, a1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s1 value = (s1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = s1.d;
        String str = value.f260795a;
        a1 a1Var = value.f260797c;
        List list = value.f260796b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || a1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, y0.f260816a, a1Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
