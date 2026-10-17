package gu7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f146754a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f146754a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CLAIMS_CFAC", hVar, 1);
        pluginGeneratedSerialDescriptor.j("coverageSelectionLayout", false);
        pluginGeneratedSerialDescriptor.l(new bka.b(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{com.revolut.feature.insurance_embedded.impl.data.model.b.f75976a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        com.revolut.feature.insurance_embedded.impl.data.model.g gVar = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else {
                if (iD != 0) {
                    throw new UnknownFieldException(iD);
                }
                gVar = (com.revolut.feature.insurance_embedded.impl.data.model.g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, com.revolut.feature.insurance_embedded.impl.data.model.b.f75976a, gVar);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new com.revolut.feature.insurance_embedded.impl.data.model.h(i, gVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        com.revolut.feature.insurance_embedded.impl.data.model.h value = (com.revolut.feature.insurance_embedded.impl.data.model.h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        i iVar = com.revolut.feature.insurance_embedded.impl.data.model.h.Companion;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, com.revolut.feature.insurance_embedded.impl.data.model.b.f75976a, value.f75993b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
