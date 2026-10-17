package gu7;

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
public final /* synthetic */ class s3 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s3 f146830a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s3 s3Var = new s3();
        f146830a = s3Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.model.Header.Subtitle", s3Var, 3);
        pluginGeneratedSerialDescriptor.j("text", false);
        pluginGeneratedSerialDescriptor.j("imageForGlobalAccountOverride", false);
        pluginGeneratedSerialDescriptor.j("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s3() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = nlm.a.c(qlm.v1.f247718a);
        v3 v3Var = v3.f146849a;
        return new KSerializer[]{kSerializerC, nlm.a.c(v3Var), nlm.a.c(v3Var)};
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
        x3 x3Var = null;
        x3 x3Var2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                x3Var = (x3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v3.f146849a, x3Var);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                x3Var2 = (x3) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v3.f146849a, x3Var2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u3(i, str, x3Var, x3Var2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u3 value = (u3) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f146840a);
        v3 v3Var = v3.f146849a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v3Var, value.f146841b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v3Var, value.f146842c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
