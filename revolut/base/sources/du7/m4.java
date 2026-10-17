package du7;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m4 f117773a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m4 m4Var = new m4();
        f117773a = m4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.GenericBannerDto", m4Var, 6);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        pluginGeneratedSerialDescriptor.j("secondaryButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(p4.d);
        q4 q4Var = q4.f117821a;
        KSerializer kSerializerC2 = nlm.a.c(q4Var);
        KSerializer kSerializerC3 = nlm.a.c(q4Var);
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, kSerializerC2, kSerializerC3};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        o4 o4Var = null;
        s4 s4Var = null;
        s4 s4Var2 = null;
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
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    o4Var = (o4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, p4.d, o4Var);
                    i |= 8;
                    break;
                case 4:
                    s4Var = (s4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, q4.f117821a, s4Var);
                    i |= 16;
                    break;
                case 5:
                    s4Var2 = (s4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, q4.f117821a, s4Var2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new t4(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, o4Var, s4Var, s4Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        t4 value = (t4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117854a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f117855b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f117856c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, p4.d, value.d);
        q4 q4Var = q4.f117821a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, q4Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, q4Var, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
