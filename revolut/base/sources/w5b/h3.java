package w5b;

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
import w5b.n5;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h3 f294863a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h3 h3Var = new h3();
        f294863a = h3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsPlanHubInfoOverviewDto", h3Var, 9);
        pluginGeneratedSerialDescriptor.j("banner", false);
        pluginGeneratedSerialDescriptor.j("nextReward", false);
        pluginGeneratedSerialDescriptor.j("cardBenefits", false);
        pluginGeneratedSerialDescriptor.j("manageCardOptions", false);
        pluginGeneratedSerialDescriptor.j("planBenefits", false);
        pluginGeneratedSerialDescriptor.j("revolutPlanBenefits", false);
        pluginGeneratedSerialDescriptor.j("helpTopic", false);
        pluginGeneratedSerialDescriptor.j("footerText", false);
        pluginGeneratedSerialDescriptor.j("upsellBanner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j3.f294885j;
        KSerializer kSerializerC = nlm.a.c(f4.f294835a);
        KSerializer kSerializerC2 = nlm.a.c(k3.f294898a);
        KSerializer kSerializerC3 = nlm.a.c(v2.f295046a);
        KSerializer kSerializerC4 = nlm.a.c((KSerializer) lazyArr[3].getValue());
        m2 m2Var = m2.f294921a;
        KSerializer kSerializerC5 = nlm.a.c(m2Var);
        KSerializer kSerializerC6 = nlm.a.c(m2Var);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(n5.a.f294940a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j3.f294885j;
        dVarBeginStructure.getClass();
        n5 n5Var = null;
        h4 h4Var = null;
        m3 m3Var = null;
        x2 x2Var = null;
        List list = null;
        o2 o2Var = null;
        o2 o2Var2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    h4Var = (h4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, f4.f294835a, h4Var);
                    i |= 1;
                    break;
                case 1:
                    m3Var = (m3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, k3.f294898a, m3Var);
                    i |= 2;
                    break;
                case 2:
                    x2Var = (x2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v2.f295046a, x2Var);
                    i |= 4;
                    break;
                case 3:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    o2Var = (o2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, m2.f294921a, o2Var);
                    i |= 16;
                    break;
                case 5:
                    o2Var2 = (o2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, m2.f294921a, o2Var2);
                    i |= 32;
                    break;
                case 6:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    break;
                case 8:
                    n5Var = (n5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, n5.a.f294940a, n5Var);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j3(i, h4Var, m3Var, x2Var, list, o2Var, o2Var2, str, str2, n5Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j3 value = (j3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j3.f294885j;
        f4 f4Var = f4.f294835a;
        h4 h4Var = value.f294886a;
        n5 n5Var = value.i;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, f4Var, h4Var);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, k3.f294898a, value.f294887b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v2.f295046a, value.f294888c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        m2 m2Var = m2.f294921a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, m2Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, m2Var, value.f);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f294889g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f294890h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || n5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, n5.a.f294940a, n5Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
