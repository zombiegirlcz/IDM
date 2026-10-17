package as7;

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
public final /* synthetic */ class w implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f8875a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        f8875a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.action.ShowConfirmationActionDto", wVar, 2);
        pluginGeneratedSerialDescriptor.j("screenContent", false);
        pluginGeneratedSerialDescriptor.j("cancelAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private w() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{y.f8876a, nlm.a.c(d.f8829a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        a0 a0Var = null;
        boolean z = true;
        int i = 0;
        f fVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, y.f8876a, a0Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, d.f8829a, fVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k0(i, a0Var, fVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k0 value = (k0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, y.f8876a, value.f8850a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, d.f8829a, value.f8851b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
