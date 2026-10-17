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
public final /* synthetic */ class d2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f229629a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d2 d2Var = new d2();
        f229629a = d2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.airport.security_fast_track.impl.network.dto.AsftTermsAndConditionsDto", d2Var, 5);
        pluginGeneratedSerialDescriptor.j("content", false);
        pluginGeneratedSerialDescriptor.j("cryptoContent", true);
        pluginGeneratedSerialDescriptor.j("commodityContent", true);
        pluginGeneratedSerialDescriptor.j("savingsContent", true);
        pluginGeneratedSerialDescriptor.j("creditContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        a2 a2Var = a2.f229600a;
        return new KSerializer[]{a2Var, nlm.a.c(a2Var), nlm.a.c(a2Var), nlm.a.c(a2Var), nlm.a.c(a2Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        c2 c2Var = null;
        c2 c2Var2 = null;
        c2 c2Var3 = null;
        c2 c2Var4 = null;
        c2 c2Var5 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                c2Var = (c2) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a2.f229600a, c2Var);
                i |= 1;
            } else if (iD == 1) {
                c2Var2 = (c2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a2.f229600a, c2Var2);
                i |= 2;
            } else if (iD == 2) {
                c2Var3 = (c2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a2.f229600a, c2Var3);
                i |= 4;
            } else if (iD == 3) {
                c2Var4 = (c2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a2.f229600a, c2Var4);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                c2Var5 = (c2) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a2.f229600a, c2Var5);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f2(i, c2Var, c2Var2, c2Var3, c2Var4, c2Var5);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f2 value = (f2) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a2 a2Var = a2.f229600a;
        c2 c2Var = value.f229635a;
        c2 c2Var2 = value.e;
        c2 c2Var3 = value.d;
        c2 c2Var4 = value.f229637c;
        c2 c2Var5 = value.f229636b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, a2Var, c2Var);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c2Var5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, a2Var, c2Var5);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c2Var4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, a2Var, c2Var4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c2Var3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, a2Var, c2Var3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || c2Var2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, a2Var, c2Var2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
