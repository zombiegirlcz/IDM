package qh0;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f246409a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f246409a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey.PublicKeyCredentialParam", pVar, 2);
        pluginGeneratedSerialDescriptor.j("alg", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.n0.f247680a, r.f246413c[1].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f246413c;
        dVarBeginStructure.getClass();
        j0 j0Var = null;
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
                j0Var = (j0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), j0Var);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, iDecodeIntElement, j0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f246413c;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, value.f246414a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f246415b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
