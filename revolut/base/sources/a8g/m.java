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
import qlm.n0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f2233a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f2233a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.travel.flights.models.dto.search.FlightSearchContextPassengersDto", mVar, 2);
        pluginGeneratedSerialDescriptor.j("adults", false);
        pluginGeneratedSerialDescriptor.j("children", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.f247680a;
        return new KSerializer[]{n0Var, n0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        int iDecodeIntElement2 = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, iDecodeIntElement, iDecodeIntElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f2234a);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.f2235b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
