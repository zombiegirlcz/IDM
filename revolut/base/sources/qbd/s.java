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
public final /* synthetic */ class s implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f244205a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        f244205a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.core.account.data.dto.SavingsAccountDto.TransferConfigDto", sVar, 2);
        pluginGeneratedSerialDescriptor.j("acceptsTopups", false);
        pluginGeneratedSerialDescriptor.j("acceptsWithdrawals", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.h hVar = qlm.h.f247648a;
        return new KSerializer[]{hVar, hVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        boolean zDecodeBooleanElement2 = false;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                zDecodeBooleanElement2 = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u(i, zDecodeBooleanElement, zDecodeBooleanElement2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u value = (u) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f244206a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f244207b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
