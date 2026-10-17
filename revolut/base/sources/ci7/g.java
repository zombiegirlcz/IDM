package ci7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.e0;
import qlm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class g implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f24407a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f24407a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.instruments.trend.collections.impl.network.InstrumentsTrendCollectionDto.InstrumentDto.CustomAttributes.CfdsPnlDrivers", gVar, 3);
        pluginGeneratedSerialDescriptor.j("basePrice", false);
        pluginGeneratedSerialDescriptor.j("leverage", false);
        pluginGeneratedSerialDescriptor.j("performance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private g() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        e0 e0Var = e0.f247634a;
        return new KSerializer[]{ie0.e.f160595a, e0Var, e0Var};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        ej0.b bVar = null;
        float fDecodeFloatElement = BitmapDescriptorFactory.HUE_RED;
        boolean z = true;
        int i = 0;
        float fDecodeFloatElement2 = 0.0f;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                bVar = (ej0.b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.e.f160595a, bVar);
                i |= 1;
            } else if (iD == 1) {
                fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                fDecodeFloatElement2 = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, bVar, fDecodeFloatElement, fDecodeFloatElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i value = (i) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.e.f160595a, value.f24408a);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 1, value.f24409b);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 2, value.f24410c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
