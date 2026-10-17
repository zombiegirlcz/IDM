package du7;

import du7.h1;
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
public final /* synthetic */ class v0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f117869a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        v0 v0Var = new v0();
        f117869a = v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.ContactsLayoutDto", v0Var, 4);
        pluginGeneratedSerialDescriptor.j("policyNumber", false);
        pluginGeneratedSerialDescriptor.j("contacts", false);
        pluginGeneratedSerialDescriptor.j("claimUrl", false);
        pluginGeneratedSerialDescriptor.j("footer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private v0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(qlm.v1.f247718a), nlm.a.c(h1.a.f117692a), nlm.a.c(x0.d), nlm.a.c(e1.f117661a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        h1 h1Var = null;
        w0 w0Var = null;
        g1 g1Var = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                h1Var = (h1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, h1.a.f117692a, h1Var);
                i |= 2;
            } else if (iD == 2) {
                w0Var = (w0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, x0.d, w0Var);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                g1Var = (g1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, e1.f117661a, g1Var);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new i1(i, str, h1Var, w0Var, g1Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        i1 value = (i1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f117712a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, h1.a.f117692a, value.f117713b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, x0.d, value.f117714c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, e1.f117661a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
