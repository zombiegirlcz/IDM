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
public final /* synthetic */ class c2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c2 f188470a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c2 c2Var = new c2();
        f188470a = c2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.biometric_verification.impl.data.models.media.BiometricVerificationVideoExtraMetadataDto", c2Var, 14);
        pluginGeneratedSerialDescriptor.j("secret", true);
        pluginGeneratedSerialDescriptor.j("mask", false);
        pluginGeneratedSerialDescriptor.j("videoDuration", false);
        pluginGeneratedSerialDescriptor.j("videoSignature", false);
        pluginGeneratedSerialDescriptor.j("videoBitrate", false);
        pluginGeneratedSerialDescriptor.j("videoVerticalResolution", false);
        pluginGeneratedSerialDescriptor.j("activeLivenessCodeNonce", false);
        pluginGeneratedSerialDescriptor.j("speechlessMode", true);
        pluginGeneratedSerialDescriptor.j("locale", false);
        pluginGeneratedSerialDescriptor.j("experiment", false);
        pluginGeneratedSerialDescriptor.j("extras", false);
        pluginGeneratedSerialDescriptor.j("encodedByteCount", true);
        pluginGeneratedSerialDescriptor.j("stepId", true);
        pluginGeneratedSerialDescriptor.j("attemptIndex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = e2.o;
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[1].getValue());
        qlm.n0 n0Var = qlm.n0.f247680a;
        KSerializer kSerializerC3 = nlm.a.c(n0Var);
        KSerializer kSerializerC4 = nlm.a.c(v1Var);
        KSerializer kSerializerC5 = nlm.a.c(v1Var);
        KSerializer kSerializerC6 = nlm.a.c((KSerializer) lazyArr[10].getValue());
        KSerializer kSerializerC7 = nlm.a.c(v1Var);
        KSerializer kSerializerC8 = nlm.a.c(n0Var);
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{kSerializerC, kSerializerC2, t0Var, v1Var, kSerializerC3, n0Var, kSerializerC4, qlm.h.f247648a, kSerializerC5, v1Var, kSerializerC6, t0Var, kSerializerC7, kSerializerC8};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Lazy[] lazyArr;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr2 = e2.o;
        dVarBeginStructure.getClass();
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        List list = null;
        String strDecodeStringElement = null;
        Integer num2 = null;
        String strDecodeStringElement2 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        boolean zDecodeBooleanElement = false;
        String str4 = null;
        Map map = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    lazyArr = lazyArr2;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str3);
                    i |= 1;
                    break;
                case 1:
                    lazyArr = lazyArr2;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    lazyArr = lazyArr2;
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    lazyArr = lazyArr2;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    lazyArr = lazyArr2;
                    num2 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num2);
                    i |= 16;
                    break;
                case 5:
                    lazyArr = lazyArr2;
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    lazyArr = lazyArr2;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    lazyArr = lazyArr2;
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    lazyArr = lazyArr2;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str4);
                    i |= 256;
                    break;
                case 9:
                    lazyArr = lazyArr2;
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    lazyArr = lazyArr2;
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr[10].getValue(), map);
                    i |= 1024;
                    break;
                case 11:
                    lazyArr = lazyArr2;
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case 12:
                    lazyArr = lazyArr2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.v1.f247718a, str2);
                    i |= 4096;
                    break;
                case 13:
                    lazyArr = lazyArr2;
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.n0.f247680a, num);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            lazyArr2 = lazyArr;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e2(i, str3, list, jDecodeLongElement, strDecodeStringElement, num2, iDecodeIntElement, str, zDecodeBooleanElement, str4, strDecodeStringElement2, map, jDecodeLongElement2, str2, num);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e2 value = (e2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = e2.o;
        if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f188483a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f188483a);
        }
        mlm.h hVar = (mlm.h) lazyArr[1].getValue();
        List list = value.f188484b;
        long j2 = value.f188489l;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, hVar, list);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.f188485c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        qlm.n0 n0Var = qlm.n0.f247680a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, n0Var, value.e);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 5, value.f);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f188486g);
        boolean z = value.f188487h;
        if (z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.f188488j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.k);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || j2 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 11, j2);
        }
        String str = value.f188490m;
        if (str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, str);
        }
        Integer num = value.f188491n;
        if (num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, n0Var, num);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
