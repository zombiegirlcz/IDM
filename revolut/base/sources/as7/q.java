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
public final /* synthetic */ class q implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f8863a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f8863a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.action.PromptDto", qVar, 4);
        pluginGeneratedSerialDescriptor.j("screenContent", false);
        pluginGeneratedSerialDescriptor.j("showCoverageDetailsAction", false);
        pluginGeneratedSerialDescriptor.j("cancelAction", false);
        pluginGeneratedSerialDescriptor.j("showConfirmationAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{t.f8869a, nlm.a.c(l0.f8852a), nlm.a.c(d.f8829a), nlm.a.c(w.f8875a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        v vVar = null;
        q0 q0Var = null;
        f fVar = null;
        k0 k0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                vVar = (v) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, t.f8869a, vVar);
                i |= 1;
            } else if (iD == 1) {
                q0Var = (q0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, l0.f8852a, q0Var);
                i |= 2;
            } else if (iD == 2) {
                fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, d.f8829a, fVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                k0Var = (k0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w.f8875a, k0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, vVar, q0Var, fVar, k0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, t.f8869a, value.f8866a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, l0.f8852a, value.f8867b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, d.f8829a, value.f8868c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, w.f8875a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
