package n36;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f211876a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f211876a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.exchange.impl.data.network.dto.CeFiToDeFiAssetDto", aVar, 3);
        pluginGeneratedSerialDescriptor.j("cefiAsset", false);
        pluginGeneratedSerialDescriptor.j("cefiBalance", false);
        pluginGeneratedSerialDescriptor.j("defiAsset", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b.f211880a, nlm.a.c(e.f211883a), d26.d.f110724a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        d dVar = null;
        boolean z = true;
        int i = 0;
        g gVar = null;
        d26.f fVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b.f211880a, dVar);
                i |= 1;
            } else if (iD == 1) {
                gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e.f211883a, gVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                fVar = (d26.f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d26.d.f110724a, fVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, dVar, gVar, fVar);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, b.f211880a, value.f211887a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, e.f211883a, value.f211888b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, d26.d.f110724a, value.f211889c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
