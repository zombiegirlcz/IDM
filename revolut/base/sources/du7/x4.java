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
public final /* synthetic */ class x4 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x4 f117900a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x4 x4Var = new x4();
        f117900a = x4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.HeaderDto.BarButtonDto", x4Var, 4);
        pluginGeneratedSerialDescriptor.j("icon", false);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("accessibilityLabel", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x4() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(w4.d)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        v4 v4Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
                i |= 2;
            } else if (iD == 2) {
                str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                v4Var = (v4) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, w4.d, v4Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z4(i, str, str2, str3, v4Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z4 value = (z4) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f117928a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f117929b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f117930c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, w4.d, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
