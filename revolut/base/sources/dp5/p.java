package dp5;

import bl5.b;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f116791a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f116791a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.dto.CryptoWalletDto", pVar, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("addressType", false);
        pluginGeneratedSerialDescriptor.j("recipientDetails", false);
        pluginGeneratedSerialDescriptor.j("linkedBeneficiaries", false);
        pluginGeneratedSerialDescriptor.j("isHidden", false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("limits", false);
        pluginGeneratedSerialDescriptor.j("label", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = r.f116802j;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, v1Var, v1Var, nlm.a.c(b.a.f16474a), lazyArr[4].getValue(), qlm.h.f247648a, v1Var, nlm.a.c(b0.f116727a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f116802j;
        dVarBeginStructure.getClass();
        String str = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        bl5.b bVar = null;
        List list = null;
        String strDecodeStringElement4 = null;
        d0 d0Var = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
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
                    bVar = (bl5.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, b.a.f16474a, bVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    d0Var = (d0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, b0.f116727a, d0Var);
                    i |= 128;
                    break;
                case 8:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, bVar, list, zDecodeBooleanElement, strDecodeStringElement4, d0Var, str);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.f116802j;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f116803a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f116804b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f116805c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, b.a.f16474a, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f116806g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, b0.f116727a, value.f116807h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
