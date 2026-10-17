package qbd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f244226a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        f244226a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.core.account.data.dto.SavingsInterestRateDto", zVar, 2);
        pluginGeneratedSerialDescriptor.j("primary", false);
        pluginGeneratedSerialDescriptor.j("secondary", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private z() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        b0 b0Var = b0.f244174a;
        return new KSerializer[]{b0Var, nlm.a.c(b0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        d0 d0Var = null;
        boolean z = true;
        int i = 0;
        d0 d0Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                d0Var = (d0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b0.f244174a, d0Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                d0Var2 = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b0.f244174a, d0Var2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e0(i, d0Var, d0Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e0 value = (e0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        b0 b0Var = b0.f244174a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, b0Var, value.f244182a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, b0Var, value.f244183b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
