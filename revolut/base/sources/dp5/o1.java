package dp5;

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
public final /* synthetic */ class o1 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f116790a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o1 o1Var = new o1();
        f116790a = o1Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.models.dto.ExecuteCryptoWithdrawRequestDto", o1Var, 12);
        pluginGeneratedSerialDescriptor.j("cryptoAddressId", false);
        pluginGeneratedSerialDescriptor.j("blockchain", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("requestId", false);
        pluginGeneratedSerialDescriptor.j("fee", false);
        pluginGeneratedSerialDescriptor.j("serviceFee", false);
        pluginGeneratedSerialDescriptor.j("networkFee", false);
        pluginGeneratedSerialDescriptor.j("exchangeFee", false);
        pluginGeneratedSerialDescriptor.j("withdrawAvailableBalance", false);
        pluginGeneratedSerialDescriptor.j("senderPocketId", false);
        pluginGeneratedSerialDescriptor.j("counterpartyId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private o1() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{v1Var, v1Var, v1Var, t0Var, v1Var, t0Var, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), qlm.h.f247648a, nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Long l2 = null;
        String str2 = null;
        String str3 = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        long jDecodeLongElement = 0;
        long jDecodeLongElement2 = 0;
        int i = 0;
        boolean z = true;
        boolean zDecodeBooleanElement = false;
        Long l3 = null;
        Long l4 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = strDecodeStringElement;
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    continue;
                case 1:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                    continue;
                case 2:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                    continue;
                case 3:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 3);
                    i |= 8;
                    continue;
                case 4:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                    continue;
                case 5:
                    jDecodeLongElement2 = dVarBeginStructure.decodeLongElement(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str = strDecodeStringElement;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.t0.f247706a, l2);
                    i |= 64;
                    break;
                case 7:
                    str = strDecodeStringElement;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.t0.f247706a, l3);
                    i |= 128;
                    break;
                case 8:
                    str = strDecodeStringElement;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.t0.f247706a, l4);
                    i |= 256;
                    break;
                case 9:
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                    i |= 512;
                    continue;
                case 10:
                    str = strDecodeStringElement;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, v1.f247718a, str2);
                    i |= 1024;
                    break;
                case 11:
                    str = strDecodeStringElement;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, v1.f247718a, str3);
                    i |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            strDecodeStringElement = str;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new q1(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, jDecodeLongElement, strDecodeStringElement4, jDecodeLongElement2, l2, l3, l4, zDecodeBooleanElement, str2, str3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q1 value = (q1) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f116795a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f116796b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f116797c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 5, value.f);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, t0Var, value.f116798g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, t0Var, value.f116799h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, t0Var, value.i);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, value.f116800j);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, value.f116801l);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
