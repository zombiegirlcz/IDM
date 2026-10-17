package sdl;

import java.util.UUID;
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
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class f0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f261966a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f0 f0Var = new f0();
        f261966a = f0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.TradingProduct", f0Var, 5);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("onboardedDate", false);
        pluginGeneratedSerialDescriptor.j("offboardedDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private f0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = j0.f;
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{ie0.s.f160620a, v1.f247718a, lazyArr[2].getValue(), nlm.a.c(t0Var), nlm.a.c(t0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j0.f;
        dVarBeginStructure.getClass();
        int i = 0;
        UUID uuid = null;
        String strDecodeStringElement = null;
        i0 i0Var = null;
        Long l2 = null;
        Long l3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                i0Var = (i0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), i0Var);
                i |= 4;
            } else if (iD == 3) {
                l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l2);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l3);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j0(i, uuid, strDecodeStringElement, i0Var, l2, l3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j0 value = (j0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = j0.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, value.f261974a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f261975b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f261976c);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
