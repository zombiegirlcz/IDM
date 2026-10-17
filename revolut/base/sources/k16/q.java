package k16;

import java.time.Instant;
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
public final /* synthetic */ class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f180125a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f180125a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.defi.accounts.impl.data.network.dto.DeFiWalletDto", qVar, 6);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("chainType", false);
        pluginGeneratedSerialDescriptor.j("publicAddress", false);
        pluginGeneratedSerialDescriptor.j("remittancesBeneficiaryId", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        ie0.j jVar = ie0.j.f160602a;
        return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, jVar, jVar};
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
        String strDecodeStringElement3 = null;
        String str = null;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                    i |= 8;
                    break;
                case 4:
                    instant = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant);
                    i |= 16;
                    break;
                case 5:
                    instant2 = (Instant) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, ie0.j.f160602a, instant2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, str, instant, instant2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f180126a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f180127b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f180128c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, value.d);
        ie0.j jVar = ie0.j.f160602a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, jVar, value.e);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, jVar, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
