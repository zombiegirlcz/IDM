package ro3;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f255843a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        f255843a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.core.model.network.wallet.PocketUpdateDto", fVar, 3);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("balanceUpdatedDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        t0 t0Var = t0.f247706a;
        return new KSerializer[]{v1.f247718a, nlm.a.c(t0Var), nlm.a.c(t0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        boolean z = true;
        int i = 0;
        Long l2 = null;
        Long l3 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, t0.f247706a, l2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, t0.f247706a, l3);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h(strDecodeStringElement, i, l2, l3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h value = (h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f255844a);
        t0 t0Var = t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, t0Var, value.f255845b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, value.f255846c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
