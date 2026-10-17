package y48;

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
import qlm.n0;
import z38.h;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f310822a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f310822a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.joint.impl.ui.invitation_mcy.error.JointMcyControllerExtensionGuardian.JointMcyErrorDto", bVar, 2);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n0.f247680a, nlm.a.c(h.a.f319203a)};
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
        int iDecodeIntElement = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                hVar = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, h.a.f319203a, hVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d(i, iDecodeIntElement, hVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d value = (d) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f310823a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, h.a.f319203a, value.f310824b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
