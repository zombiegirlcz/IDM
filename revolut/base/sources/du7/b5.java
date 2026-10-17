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
public final /* synthetic */ class b5 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b5 f117612a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b5 b5Var = new b5();
        f117612a = b5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.HeaderDto.SubtitleDto", b5Var, 3);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("imageForGlobalAccountOverride", false);
        pluginGeneratedSerialDescriptor.j("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b5() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(qlm.v1.f247718a);
        e5 e5Var = e5.f117664a;
        return new KSerializer[]{kSerializerC, nlm.a.c(e5Var), nlm.a.c(e5Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str = null;
        boolean z = true;
        int i = 0;
        g5 g5Var = null;
        g5 g5Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                g5Var = (g5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e5.f117664a, g5Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                g5Var2 = (g5) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, e5.f117664a, g5Var2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d5(i, str, g5Var, g5Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d5 value = (d5) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f117643a);
        e5 e5Var = e5.f117664a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, e5Var, value.f117644b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, e5Var, value.f117645c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
