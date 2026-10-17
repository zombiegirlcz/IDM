package du7;

import du7.o2;
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
public final /* synthetic */ class u1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1 f117863a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        u1 u1Var = new u1();
        f117863a = u1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.insurance_embedded.impl.data.dto.CoverageDetailsLayoutDto", u1Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("subtitle", false);
        pluginGeneratedSerialDescriptor.j("restrictions", false);
        pluginGeneratedSerialDescriptor.j("exclusions", false);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        pluginGeneratedSerialDescriptor.j("legalNotice", false);
        pluginGeneratedSerialDescriptor.j("primaryButton", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private u1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, nlm.a.c(v1Var), nlm.a.c(o2.a.f117793a), nlm.a.c(z1.f117923a), nlm.a.c(w1.f117889a), nlm.a.c(z6.f117931a), nlm.a.c(c2.f117621a)};
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
        String str = null;
        o2 o2Var = null;
        b2 b2Var = null;
        y1 y1Var = null;
        b7 b7Var = null;
        h2 h2Var = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    o2Var = (o2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, o2.a.f117793a, o2Var);
                    i |= 8;
                    break;
                case 4:
                    b2Var = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, z1.f117923a, b2Var);
                    i |= 16;
                    break;
                case 5:
                    y1Var = (y1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, w1.f117889a, y1Var);
                    i |= 32;
                    break;
                case 6:
                    b7Var = (b7) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, z6.f117931a, b7Var);
                    i |= 64;
                    break;
                case 7:
                    h2Var = (h2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, c2.f117621a, h2Var);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new p2(i, strDecodeStringElement, strDecodeStringElement2, str, o2Var, b2Var, y1Var, b7Var, h2Var);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        p2 value = (p2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f117805a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f117806b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f117807c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, o2.a.f117793a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, z1.f117923a, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, w1.f117889a, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, z6.f117931a, value.f117808g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, c2.f117621a, value.f117809h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
