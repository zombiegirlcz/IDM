package du7;

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
public final /* synthetic */ class x2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x2 f117898a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x2 x2Var = new x2();
        f117898a = x2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.CoveragesSectionDto.CoverageDto.Action.Details", x2Var, 1);
        pluginGeneratedSerialDescriptor.j("details", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{u1.f117863a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        p2 p2Var = null;
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
                p2Var = (p2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, u1.f117863a, p2Var);
                i = 1;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z2(i, p2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z2 value = (z2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, u1.f117863a, value.f117924a);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
