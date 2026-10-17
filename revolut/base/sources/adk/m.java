package adk;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f3411a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f3411a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_rewards.impl.data.model.MonthlyDrawHubDto", mVar, 16);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("revealDate", false);
        pluginGeneratedSerialDescriptor.j("totalTokens", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("promotedRewards", false);
        pluginGeneratedSerialDescriptor.j("everydayRewards", false);
        pluginGeneratedSerialDescriptor.j("exceptionalRewards", false);
        pluginGeneratedSerialDescriptor.j("ultraRewards", false);
        pluginGeneratedSerialDescriptor.j("maximiseRewards", false);
        pluginGeneratedSerialDescriptor.j("storiesDeeplink", false);
        pluginGeneratedSerialDescriptor.j("earnedRewardsDeeplink", false);
        pluginGeneratedSerialDescriptor.j("optOutTermsAndConditionsUrl", false);
        pluginGeneratedSerialDescriptor.j("headerBadge", false);
        pluginGeneratedSerialDescriptor.j("actionFooter", false);
        pluginGeneratedSerialDescriptor.j("footerInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = v0.f3441q;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(qlm.n0.f247680a), v1Var, lazyArr[5].getValue(), a0.f3363a, d0.f3374a, nlm.a.c(p0.f3424a), nlm.a.c((KSerializer) lazyArr[9].getValue()), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(q.f3425a), nlm.a.c(n.f3414a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Integer num;
        s sVar;
        Integer num2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v0.f3441q;
        dVarBeginStructure.getClass();
        r0 r0Var = null;
        s sVar2 = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        p pVar = null;
        String str4 = null;
        Integer num3 = null;
        String str5 = null;
        List list2 = null;
        c0 c0Var = null;
        f0 f0Var = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str6 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str7 = str4;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    num = num3;
                    z = false;
                    str4 = str7;
                    num3 = num;
                    break;
                case 0:
                    sVar = sVar2;
                    num2 = num3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    str4 = str7;
                    num3 = num2;
                    sVar2 = sVar;
                    break;
                case 1:
                    sVar = sVar2;
                    num2 = num3;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str6);
                    i |= 2;
                    str4 = str7;
                    num3 = num2;
                    sVar2 = sVar;
                    break;
                case 2:
                    sVar = sVar2;
                    num2 = num3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str7);
                    i |= 4;
                    num3 = num2;
                    sVar2 = sVar;
                    break;
                case 3:
                    sVar = sVar2;
                    num3 = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.n0.f247680a, num3);
                    i |= 8;
                    str4 = str7;
                    sVar2 = sVar;
                    break;
                case 4:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    str4 = str7;
                    break;
                case 5:
                    num = num3;
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list2);
                    i |= 32;
                    str4 = str7;
                    num3 = num;
                    break;
                case 6:
                    num = num3;
                    c0Var = (c0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, a0.f3363a, c0Var);
                    i |= 64;
                    str4 = str7;
                    num3 = num;
                    break;
                case 7:
                    num = num3;
                    f0Var = (f0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, d0.f3374a, f0Var);
                    i |= 128;
                    str4 = str7;
                    num3 = num;
                    break;
                case 8:
                    num = num3;
                    r0Var = (r0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, p0.f3424a, r0Var);
                    i |= 256;
                    str4 = str7;
                    num3 = num;
                    break;
                case 9:
                    num = num3;
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                    i |= 512;
                    str4 = str7;
                    num3 = num;
                    break;
                case 10:
                    num = num3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str3);
                    i |= 1024;
                    str4 = str7;
                    num3 = num;
                    break;
                case 11:
                    num = num3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, v1.f247718a, str2);
                    i |= 2048;
                    str4 = str7;
                    num3 = num;
                    break;
                case 12:
                    num = num3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, v1.f247718a, str);
                    i |= 4096;
                    str4 = str7;
                    num3 = num;
                    break;
                case 13:
                    num = num3;
                    sVar2 = (s) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, q.f3425a, sVar2);
                    i |= 8192;
                    str4 = str7;
                    num3 = num;
                    break;
                case 14:
                    num = num3;
                    pVar = (p) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, n.f3414a, pVar);
                    i |= 16384;
                    str4 = str7;
                    num3 = num;
                    break;
                case 15:
                    num = num3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, v1.f247718a, str5);
                    i |= 32768;
                    str4 = str7;
                    num3 = num;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        Integer num4 = num3;
        String str8 = str6;
        dVarBeginStructure.endStructure(serialDescriptor);
        p pVar2 = pVar;
        return new v0(i, strDecodeStringElement, str8, str4, num4, strDecodeStringElement2, list2, c0Var, f0Var, r0Var, list, str3, str2, str, sVar2, pVar2, str5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v0 value = (v0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = v0.f3441q;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f3442a);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f3443b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f3444c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.n0.f247680a, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, a0.f3363a, value.f3445g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, d0.f3374a, value.f3446h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, p0.f3424a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.f3447j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, value.f3448l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, v1Var, value.f3449m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, q.f3425a, value.f3450n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, n.f3414a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, v1Var, value.f3451p);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
