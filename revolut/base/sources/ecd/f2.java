package ecd;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f2 f124545a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f2 f2Var = new f2();
        f124545a = f2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.ProductGroupDto.UpsellConfigDto", f2Var, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        z1 z1Var = z1.f124721a;
        return new KSerializer[]{nlm.a.c(z1Var), nlm.a.c(z1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        b2 b2Var = null;
        boolean z = true;
        int i = 0;
        b2 b2Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b2Var = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, z1.f124721a, b2Var);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                b2Var2 = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, z1.f124721a, b2Var2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h2(i, b2Var, b2Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h2 value = (h2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        z1 z1Var = z1.f124721a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, z1Var, value.f124560a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, z1Var, value.f124561b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
