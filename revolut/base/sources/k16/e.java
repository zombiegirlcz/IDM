package k16;

import java.time.Instant;
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
import qlm.f0;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f180108a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f180108a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.accounts.impl.data.network.dto.DeFiAccountResponse", eVar, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("wallets", false);
        pluginGeneratedSerialDescriptor.j("balances", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = g.f180109h;
        v1 v1Var = v1.f247718a;
        ie0.j jVar = ie0.j.f160602a;
        return new KSerializer[]{v1Var, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), jVar, jVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g.f180109h;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        List list = null;
        List list2 = null;
        Instant instant = null;
        Instant instant2 = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, ie0.j.f160602a, instant);
                    i |= 32;
                    break;
                case 6:
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, ie0.j.f160602a, instant2);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new g(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, list, list2, instant, instant2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        g value = (g) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = g.f180109h;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180110a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180111b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f180112c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        ie0.j jVar = ie0.j.f160602a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, jVar, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, jVar, value.f180113g);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
