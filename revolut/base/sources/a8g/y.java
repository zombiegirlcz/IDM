package a8g;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class y implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f2246a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        f2246a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.search.FlightSearchQueryDto", yVar, 6);
        pluginGeneratedSerialDescriptor.j("origin", false);
        pluginGeneratedSerialDescriptor.j("destination", false);
        pluginGeneratedSerialDescriptor.j("departureDate", false);
        pluginGeneratedSerialDescriptor.j("returnDate", true);
        pluginGeneratedSerialDescriptor.j("passengers", false);
        pluginGeneratedSerialDescriptor.j("cabinClass", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        g0 g0Var = g0.f2221a;
        return new KSerializer[]{g0Var, g0Var, v1Var, kSerializerC, j0.f2226a, v1Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        i0 i0Var = null;
        i0 i0Var2 = null;
        String strDecodeStringElement = null;
        String str = null;
        l0 l0Var = null;
        String strDecodeStringElement2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i0Var = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, g0.f2221a, i0Var);
                    i |= 1;
                    break;
                case 1:
                    i0Var2 = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, g0.f2221a, i0Var2);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, j0.f2226a, l0Var);
                    i |= 16;
                    break;
                case 5:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, i0Var, i0Var2, strDecodeStringElement, str, l0Var, strDecodeStringElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        g0 g0Var = g0.f2221a;
        i0 i0Var = value.f2197a;
        String str = value.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, g0Var, i0Var);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, g0Var, value.f2198b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f2199c);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, j0.f2226a, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
