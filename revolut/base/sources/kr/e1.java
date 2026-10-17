package kr;

import java.util.List;
import java.util.Map;
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
public final /* synthetic */ class e1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f188482a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e1 e1Var = new e1();
        f188482a = e1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationPictureExtraMetadataDto", e1Var, 9);
        pluginGeneratedSerialDescriptor.j("mask", false);
        pluginGeneratedSerialDescriptor.j("photoCompressionQuality", false);
        pluginGeneratedSerialDescriptor.j("photoMaximumResolution", false);
        pluginGeneratedSerialDescriptor.j("experiment", false);
        pluginGeneratedSerialDescriptor.j("extras", false);
        pluginGeneratedSerialDescriptor.j("nfcAdapterPresent", true);
        pluginGeneratedSerialDescriptor.j("stepId", true);
        pluginGeneratedSerialDescriptor.j("attemptIndex", true);
        pluginGeneratedSerialDescriptor.j("validationResults", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g1.f188500j;
        KSerializer kSerializerC = nlm.a.c((KSerializer) lazyArr[0].getValue());
        qlm.n0 n0Var = qlm.n0.f247680a;
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{kSerializerC, qlm.e0.f247634a, n0Var, v1Var, nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var), nlm.a.c(n0Var), nlm.a.c(t1.f188583a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g1.f188500j;
        dVarBeginStructure.getClass();
        Integer num = null;
        List list = null;
        String strDecodeStringElement = null;
        Map map = null;
        Boolean bool = null;
        String str = null;
        float fDecodeFloatElement = 0.0f;
        boolean z = true;
        int i = 0;
        int iDecodeIntElement = 0;
        v1 v1Var = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), map);
                    i |= 16;
                    break;
                case 5:
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, num);
                    i |= 128;
                    break;
                case 8:
                    v1Var = (v1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, t1.f188583a, v1Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g1(i, list, fDecodeFloatElement, iDecodeIntElement, strDecodeStringElement, map, bool, str, num, v1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g1 value = (g1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g1.f188500j;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f188501a);
        compositeEncoderBeginStructure.encodeFloatElement(serialDescriptor, 1, value.f188502b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.f188503c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        Boolean bool = value.f;
        if (bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.h.f247648a, bool);
        }
        String str = value.f188504g;
        if (str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
        }
        Integer num = value.f188505h;
        if (num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, qlm.n0.f247680a, num);
        }
        v1 v1Var = value.i;
        if (v1Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, t1.f188583a, v1Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
