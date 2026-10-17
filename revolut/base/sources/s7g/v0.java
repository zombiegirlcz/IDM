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
public final /* synthetic */ class v0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f260804a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v0 v0Var = new v0();
        f260804a = v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.booking.BookingDetailsTravellerDto", v0Var, 4);
        pluginGeneratedSerialDescriptor.j("fullName", false);
        pluginGeneratedSerialDescriptor.j("partnerReference", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("baggage", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = x0.e;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), v1Var, lazyArr[3].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x0.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String str = null;
        String strDecodeStringElement2 = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x0(i, strDecodeStringElement, str, strDecodeStringElement2, list);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x0 value = (x0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x0.e;
        String str = value.f260813a;
        String str2 = value.f260814b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f260815c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
