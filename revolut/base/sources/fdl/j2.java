package fdl;

import java.time.Instant;
import jed.g;
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
public final /* synthetic */ class j2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j2 f134167a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j2 j2Var = new j2();
        f134167a = j2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.model.IpoInstrumentSummaryDto", j2Var, 6);
        pluginGeneratedSerialDescriptor.j("priceRange", false);
        pluginGeneratedSerialDescriptor.j("launchDate", false);
        pluginGeneratedSerialDescriptor.j("acknowledgementWorkflowId", true);
        pluginGeneratedSerialDescriptor.j("cancellationDeadline", true);
        pluginGeneratedSerialDescriptor.j("disclaimerWorkflowId", true);
        pluginGeneratedSerialDescriptor.j("finalPriceDate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private j2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.k kVar = ie0.k.f160604a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{g.a.f173356a, kVar, nlm.a.c(v1Var), nlm.a.c(kVar), nlm.a.c(v1Var), nlm.a.c(kVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        jed.g gVar = null;
        Instant instant = null;
        String str = null;
        Instant instant2 = null;
        String str2 = null;
        Instant instant3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    gVar = (jed.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, g.a.f173356a, gVar);
                    i |= 1;
                    break;
                case 1:
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.k.f160604a, instant);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    instant2 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, ie0.k.f160604a, instant2);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
                    i |= 16;
                    break;
                case 5:
                    instant3 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.k.f160604a, instant3);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new l2(i, gVar, instant, str, instant2, str2, instant3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        l2 value = (l2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        g.a aVar = g.a.f173356a;
        jed.g gVar = value.f134184a;
        Instant instant = value.f;
        String str = value.e;
        Instant instant2 = value.d;
        String str2 = value.f134186c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, aVar, gVar);
        ie0.k kVar = ie0.k.f160604a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, kVar, value.f134185b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, kVar, instant2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, kVar, instant);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
