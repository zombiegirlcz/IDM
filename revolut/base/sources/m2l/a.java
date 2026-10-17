package m2l;

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
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f202187a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f202187a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.wealth.data.core.insights.AnalystRatingsInsightDto", aVar, 3);
        pluginGeneratedSerialDescriptor.j("ratingsDistribution", false);
        pluginGeneratedSerialDescriptor.j("priceTarget", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f.f202196a, c.f202189a, m.f202217a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        h hVar = null;
        boolean z = true;
        int i = 0;
        e eVar = null;
        o oVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                hVar = (h) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, f.f202196a, hVar);
                i |= 1;
            } else if (iD == 1) {
                eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c.f202189a, eVar);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, m.f202217a, oVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i(i, hVar, eVar, oVar);
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
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, f.f202196a, value.f202205a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, c.f202189a, value.f202206b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, m.f202217a, value.f202207c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
