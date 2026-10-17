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
public final /* synthetic */ class a implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f124480a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f124480a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.product.data.dto.OnboardingConfigDto", aVar, 4);
        pluginGeneratedSerialDescriptor.j("disclaimer", false);
        pluginGeneratedSerialDescriptor.j("rateSuffixRequired", false);
        pluginGeneratedSerialDescriptor.j("discoverItems", false);
        pluginGeneratedSerialDescriptor.j("reviewDetailsScreenConfig", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{nlm.a.c(z1.f124721a), nlm.a.c(qlm.h.f247648a), nlm.a.c(c.f124502a), nlm.a.c(i.f124568a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        b2 b2Var = null;
        Boolean bool = null;
        h hVar = null;
        n nVar = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                b2Var = (b2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, z1.f124721a, b2Var);
                i |= 1;
            } else if (iD == 1) {
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, bool);
                i |= 2;
            } else if (iD == 2) {
                hVar = (h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c.f124502a, hVar);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                nVar = (n) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, i.f124568a, nVar);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, b2Var, bool, hVar, nVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, z1.f124721a, value.f124629a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, value.f124630b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, c.f124502a, value.f124631c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, i.f124568a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
