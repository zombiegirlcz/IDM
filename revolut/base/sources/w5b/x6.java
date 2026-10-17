package w5b;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x6 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x6 f295074a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x6 x6Var = new x6();
        f295074a = x6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsValueReminderDto", x6Var, 10);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("cardTerminationInfo", false);
        pluginGeneratedSerialDescriptor.j("nextRewardProgress", false);
        pluginGeneratedSerialDescriptor.j("lostBenefits", false);
        pluginGeneratedSerialDescriptor.j("confirmAction", false);
        pluginGeneratedSerialDescriptor.j("secondaryAction", false);
        pluginGeneratedSerialDescriptor.j("successMessage", false);
        pluginGeneratedSerialDescriptor.j("planSwitchBanner", false);
        pluginGeneratedSerialDescriptor.j("points", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x6() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(r6.f294999a);
        KSerializer kSerializerC3 = nlm.a.c(a7.f294782a);
        KSerializer kSerializerC4 = nlm.a.c(i6.f294877a);
        f6 f6Var = f6.f294836a;
        return new KSerializer[]{v1Var, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(f6Var), nlm.a.c(f6Var), nlm.a.c(v1Var), nlm.a.c(d7.f294817a), nlm.a.c(m7.f294930a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        o7 o7Var = null;
        String strDecodeStringElement = null;
        String str = null;
        t6 t6Var = null;
        c7 c7Var = null;
        k6 k6Var = null;
        h6 h6Var = null;
        h6 h6Var2 = null;
        String str2 = null;
        f7 f7Var = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    t6Var = (t6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r6.f294999a, t6Var);
                    i |= 4;
                    break;
                case 3:
                    c7Var = (c7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a7.f294782a, c7Var);
                    i |= 8;
                    break;
                case 4:
                    k6Var = (k6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, i6.f294877a, k6Var);
                    i |= 16;
                    break;
                case 5:
                    h6Var = (h6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, f6.f294836a, h6Var);
                    i |= 32;
                    break;
                case 6:
                    h6Var2 = (h6) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, f6.f294836a, h6Var2);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str2);
                    i |= 128;
                    break;
                case 8:
                    f7Var = (f7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, d7.f294817a, f7Var);
                    i |= 256;
                    break;
                case 9:
                    o7Var = (o7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, m7.f294930a, o7Var);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z6(i, strDecodeStringElement, str, t6Var, c7Var, k6Var, h6Var, h6Var2, str2, f7Var, o7Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z6 value = (z6) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f295093a);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f295094b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, r6.f294999a, value.f295095c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, a7.f294782a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, i6.f294877a, value.e);
        f6 f6Var = f6.f294836a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, f6Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, f6Var, value.f295096g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f295097h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, d7.f294817a, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, m7.f294930a, value.f295098j);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
