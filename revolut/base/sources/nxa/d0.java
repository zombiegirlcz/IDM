package nxa;

import java.time.Instant;
import java.util.List;
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
import qlm.v1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f220492a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        f220492a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.referrals.impl.personalized_tracking.PersonalizedTrackingDetails", d0Var, 15);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("imageUrl", false);
        pluginGeneratedSerialDescriptor.j("termsUrl", false);
        pluginGeneratedSerialDescriptor.j("riskDisclosureUrl", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("deadline", false);
        pluginGeneratedSerialDescriptor.j("inviteeChallengePeriod", false);
        pluginGeneratedSerialDescriptor.j("steps", false);
        pluginGeneratedSerialDescriptor.j("campaignType", false);
        pluginGeneratedSerialDescriptor.j("referrer", false);
        pluginGeneratedSerialDescriptor.j("potentialReward", false);
        pluginGeneratedSerialDescriptor.j("rewardEarned", false);
        pluginGeneratedSerialDescriptor.j("confettiSeen", true);
        pluginGeneratedSerialDescriptor.j("disclaimer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = t0.f220525p;
        v1 v1Var = v1.f247718a;
        j0 j0Var = j0.f220500a;
        return new KSerializer[]{v1Var, lazyArr[1].getValue(), v1Var, v1Var, v1Var, nlm.a.c(e0.f220494a), nlm.a.c(ie0.j.f160602a), qlm.n0.f247680a, lazyArr[8].getValue(), nlm.a.c(u0.f220535a), nlm.a.c(m0.f220508a), nlm.a.c(j0Var), nlm.a.c(j0Var), nlm.a.c(qlm.h.f247648a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t0.f220525p;
        dVarBeginStructure.getClass();
        List list = null;
        String str2 = null;
        Boolean bool = null;
        l0 l0Var = null;
        pwa.n nVar = null;
        o0 o0Var = null;
        i0 i0Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        g0 g0Var = null;
        Instant instant = null;
        l0 l0Var2 = null;
        String strDecodeStringElement4 = null;
        int i = 0;
        boolean z = true;
        int iDecodeIntElement = 0;
        while (true) {
            String str3 = strDecodeStringElement;
            if (!z) {
                dVarBeginStructure.endStructure(serialDescriptor);
                o0 o0Var2 = o0Var;
                return new t0(i, strDecodeStringElement4, i0Var, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, g0Var, instant, iDecodeIntElement, list, nVar, o0Var2, l0Var2, l0Var, bool, str2);
            }
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    strDecodeStringElement = str3;
                    break;
                case 0:
                    str = strDecodeStringElement2;
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 1:
                    str = strDecodeStringElement2;
                    i0Var = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), i0Var);
                    i |= 2;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 2:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    strDecodeStringElement = str3;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    strDecodeStringElement = str3;
                    break;
                case 5:
                    str = strDecodeStringElement2;
                    g0Var = (g0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, e0.f220494a, g0Var);
                    i |= 32;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 6:
                    str = strDecodeStringElement2;
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ie0.j.f160602a, instant);
                    i |= 64;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 7:
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 7);
                    i |= 128;
                    strDecodeStringElement = str3;
                    break;
                case 8:
                    str = strDecodeStringElement2;
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), list);
                    i |= 256;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 9:
                    str = strDecodeStringElement2;
                    nVar = (pwa.n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, u0.f220535a, nVar);
                    i |= 512;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 10:
                    str = strDecodeStringElement2;
                    o0Var = (o0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, m0.f220508a, o0Var);
                    i |= 1024;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 11:
                    str = strDecodeStringElement2;
                    l0Var2 = (l0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, j0.f220500a, l0Var2);
                    i |= 2048;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 12:
                    str = strDecodeStringElement2;
                    l0Var = (l0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, j0.f220500a, l0Var);
                    i |= 4096;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 13:
                    str = strDecodeStringElement2;
                    bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, bool);
                    i |= 8192;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                case 14:
                    str = strDecodeStringElement2;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str2);
                    i |= 16384;
                    strDecodeStringElement = str3;
                    strDecodeStringElement2 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t0 value = (t0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = t0.f220525p;
        String str = value.f220526a;
        String str2 = value.o;
        Boolean bool = value.f220534n;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f220527b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f220528c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, e0.f220494a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, ie0.j.f160602a, value.f220529g);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 7, value.f220530h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, u0.f220535a, value.f220531j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, m0.f220508a, value.k);
        j0 j0Var = j0.f220500a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, j0Var, value.f220532l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, j0Var, value.f220533m);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, qlm.h.f247648a, bool);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
