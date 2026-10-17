package as7;

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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f8876a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        f8876a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_credit.impl.data.dto.action.ShowConfirmationActionDto.ConfirmationScreenContentDto", yVar, 6);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("infoItems", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        pluginGeneratedSerialDescriptor.j("secondaryButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private y() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = a0.f8821g;
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c((KSerializer) lazyArr[2].getValue());
        KSerializer kSerializerC4 = nlm.a.c(e0.f8833a);
        a aVar = a.f8820a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(aVar), nlm.a.c(aVar)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f8821g;
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        List list = null;
        g0 g0Var = null;
        c cVar = null;
        c cVar2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                    i |= 2;
                    break;
                case 2:
                    list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    g0Var = (g0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, e0.f8833a, g0Var);
                    i |= 8;
                    break;
                case 4:
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a.f8820a, cVar);
                    i |= 16;
                    break;
                case 5:
                    cVar2 = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a.f8820a, cVar2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new a0(i, str, str2, list, g0Var, cVar, cVar2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        a0 value = (a0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = a0.f8821g;
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f8822a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f8823b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f8824c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, e0.f8833a, value.d);
        a aVar = a.f8820a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, aVar, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, aVar, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
