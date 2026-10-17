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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v5 f295049a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v5 v5Var = new v5();
        f295049a = v5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsValueReminderActionConfirmationDto", v5Var, 6);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("sections", true);
        pluginGeneratedSerialDescriptor.j("confirmAction", true);
        pluginGeneratedSerialDescriptor.j("cancelAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = x5.f295070g;
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[2].getValue());
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[3].getValue());
        s5 s5Var = s5.f295009a;
        return new KSerializer[]{v1Var, kSerializerC, kSerializerC2, kSerializerC3, nlm.a.c(s5Var), nlm.a.c(s5Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.f295070g;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String str = null;
        List list = null;
        List list2 = null;
        u5 u5Var = null;
        u5 u5Var2 = null;
        boolean z = true;
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
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    u5Var = (u5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, s5.f295009a, u5Var);
                    i |= 16;
                    break;
                case 5:
                    u5Var2 = (u5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, s5.f295009a, u5Var2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new x5(i, strDecodeStringElement, str, list, list2, u5Var, u5Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        x5 value = (x5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = x5.f295070g;
        String str = value.f295071a;
        u5 u5Var = value.f;
        u5 u5Var2 = value.e;
        List list = value.d;
        List list2 = value.f295073c;
        String str2 = value.f295072b;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), list);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || u5Var2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, s5.f295009a, u5Var2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || u5Var != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, s5.f295009a, u5Var);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
