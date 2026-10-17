package ecd;

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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c4 f124506a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c4 c4Var = new c4();
        f124506a = c4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.SavingsProductDto.InterestRateDto", c4Var, 6);
        pluginGeneratedSerialDescriptor.j("rates", false);
        pluginGeneratedSerialDescriptor.j("primary", false);
        pluginGeneratedSerialDescriptor.j("secondary", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        pluginGeneratedSerialDescriptor.j("explanation", false);
        pluginGeneratedSerialDescriptor.j("deeplink", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c4() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        t3 t3Var = t3.f124679a;
        return new KSerializer[]{k4.f124600g[0].getValue(), t3Var, nlm.a.c(t3Var), nlm.a.c(p3.f124646a), z3.f124722a, nlm.a.c(qlm.v1.f247718a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = k4.f124600g;
        dVarBeginStructure.getClass();
        int i = 0;
        List list = null;
        v3 v3Var = null;
        v3 v3Var2 = null;
        r3 r3Var = null;
        b4 b4Var = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    v3Var = (v3) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, t3.f124679a, v3Var);
                    i |= 2;
                    break;
                case 2:
                    v3Var2 = (v3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t3.f124679a, v3Var2);
                    i |= 4;
                    break;
                case 3:
                    r3Var = (r3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, p3.f124646a, r3Var);
                    i |= 8;
                    break;
                case 4:
                    b4Var = (b4) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, z3.f124722a, b4Var);
                    i |= 16;
                    break;
                case 5:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new k4(i, list, v3Var, v3Var2, r3Var, b4Var, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        k4 value = (k4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) k4.f124600g[0].getValue(), value.f124601a);
        t3 t3Var = t3.f124679a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, t3Var, value.f124602b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t3Var, value.f124603c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, p3.f124646a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, z3.f124722a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
