package sdl;

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
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class s0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f262058a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s0 s0Var = new s0();
        f262058a = s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountsAvailableDto", s0Var, 8);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("accountHolderId", false);
        pluginGeneratedSerialDescriptor.j("globalAccountId", false);
        pluginGeneratedSerialDescriptor.j("accountType", false);
        pluginGeneratedSerialDescriptor.j("accountHolderType", false);
        pluginGeneratedSerialDescriptor.j("tradingProducts", false);
        pluginGeneratedSerialDescriptor.j("permittedActions", true);
        pluginGeneratedSerialDescriptor.j("beneficiary", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private s0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = u0.i;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), v1Var, v1Var, v1Var, lazyArr[4].getValue(), lazyArr[5].getValue(), tdl.b.f270005a, a.f261937a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u0.i;
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        l0 l0Var = null;
        List list = null;
        List list2 = null;
        c cVar = null;
        int i = 0;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                    i |= 1;
                    break;
                case 1:
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), l0Var);
                    i |= 16;
                    break;
                case 5:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, tdl.b.f270005a, list2);
                    i |= 64;
                    break;
                case 7:
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, a.f261937a, cVar);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new u0(i, str, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, l0Var, list, list2, cVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        u0 value = (u0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = u0.i;
        v1 v1Var = v1.f247718a;
        String str = value.f262061a;
        List list = value.f262064g;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262062b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f262063c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, tdl.b.f270005a, list);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, a.f261937a, value.f262065h);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
