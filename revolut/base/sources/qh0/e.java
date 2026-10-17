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
public final /* synthetic */ class e implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f246393a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f246393a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.core.mobile_services.impl.auth.models.GmsCreateCredentialRequest.PublicKey.AuthenticatorSelection", eVar, 4);
        pluginGeneratedSerialDescriptor.j("authenticatorAttachment", false);
        pluginGeneratedSerialDescriptor.j("requireResidentKey", false);
        pluginGeneratedSerialDescriptor.j("residentKey", false);
        pluginGeneratedSerialDescriptor.j("userVerification", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = k.e;
        return new KSerializer[]{lazyArr[0].getValue(), qlm.h.f247648a, lazyArr[2].getValue(), lazyArr[3].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.e;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        g gVar = null;
        j jVar = null;
        n0 n0Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), gVar);
                i |= 1;
            } else if (iD == 1) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), jVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                n0Var = (n0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), n0Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k(i, gVar, zDecodeBooleanElement, jVar, n0Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k value = (k) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f246398a);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f246399b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f246400c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
