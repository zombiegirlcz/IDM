package gr;

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
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class d implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f145777a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f145777a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.BiometricVerificationSubmitCheckRequestDto", dVar, 2);
        pluginGeneratedSerialDescriptor.j("documentType", false);
        pluginGeneratedSerialDescriptor.j("documentCountry", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f.f145778c[0].getValue(), v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = f.f145778c;
        dVarBeginStructure.getClass();
        j jVar = null;
        boolean z = true;
        int i = 0;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                jVar = (j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), jVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f(i, jVar, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f value = (f) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) f.f145778c[0].getValue(), value.f145779a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f145780b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
