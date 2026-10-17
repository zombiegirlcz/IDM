package jr;

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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class t implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f177843a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        t tVar = new t();
        f177843a = tVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.instructions.BiometricVerificationPhotoRequirementsDto", tVar, 5);
        pluginGeneratedSerialDescriptor.j("timing", false);
        pluginGeneratedSerialDescriptor.j("maximumResolution", true);
        pluginGeneratedSerialDescriptor.j("compressionQuality", true);
        pluginGeneratedSerialDescriptor.j("secret", true);
        pluginGeneratedSerialDescriptor.j("compressionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private t() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = v.f;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(qlm.n0.f247680a), nlm.a.c(qlm.e0.f247634a), nlm.a.c(v1Var), lazyArr[4].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v.f;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        Integer num = null;
        Float f = null;
        String str = null;
        yw.j jVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.n0.f247680a, num);
                i |= 2;
            } else if (iD == 2) {
                f = (Float) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.e0.f247634a, f);
                i |= 4;
            } else if (iD == 3) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                jVar = (yw.j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), jVar);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v(i, strDecodeStringElement, num, f, str, jVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v value = (v) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v.f;
        String str = value.f177851a;
        yw.j jVar = value.e;
        String str2 = value.d;
        Float f = value.f177853c;
        Integer num = value.f177852b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.n0.f247680a, num);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || f != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.e0.f247634a, f);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != yw.j.LOSSY) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), jVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
