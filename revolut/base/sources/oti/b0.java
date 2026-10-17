package oti;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f229601a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        f229601a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftConfigDto", b0Var, 5);
        pluginGeneratedSerialDescriptor.j("planName", false);
        pluginGeneratedSerialDescriptor.j("unlimited", false);
        pluginGeneratedSerialDescriptor.j("termsAndConditions", false);
        pluginGeneratedSerialDescriptor.j("companionPasses", false);
        pluginGeneratedSerialDescriptor.j("helpTopic", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        return new KSerializer[]{v1Var, qlm.h.f247648a, d2.f229629a, nlm.a.c(qlm.n0.f247680a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        f2 f2Var = null;
        Integer num = null;
        String str = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                f2Var = (f2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d2.f229629a, f2Var);
                i |= 4;
            } else if (iD == 3) {
                num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.n0.f247680a, num);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d0(i, strDecodeStringElement, zDecodeBooleanElement, f2Var, num, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d0 value = (d0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f229626a;
        String str2 = value.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, value.f229627b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, d2.f229629a, value.f229628c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, qlm.n0.f247680a, value.d);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, qlm.v1.f247718a, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
