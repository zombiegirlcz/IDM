package qbd;

import jo3.a;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f244187a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f244187a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.savings.impl.core.account.data.dto.SavingsAccountDto", hVar, 20);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("pocketId", false);
        pluginGeneratedSerialDescriptor.j("moneyBoxId", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("stateReason", false);
        pluginGeneratedSerialDescriptor.j("productId", false);
        pluginGeneratedSerialDescriptor.j("createdDate", false);
        pluginGeneratedSerialDescriptor.j("goal", false);
        pluginGeneratedSerialDescriptor.j("deadline", false);
        pluginGeneratedSerialDescriptor.j("balance", false);
        pluginGeneratedSerialDescriptor.j("ownerId", false);
        pluginGeneratedSerialDescriptor.j("ownerAccountType", false);
        pluginGeneratedSerialDescriptor.j("pendingActivationReason", false);
        pluginGeneratedSerialDescriptor.j("displayRate", false);
        pluginGeneratedSerialDescriptor.j("workflowId", false);
        pluginGeneratedSerialDescriptor.j("challengeAccountId", false);
        pluginGeneratedSerialDescriptor.j("interestBalance", true);
        pluginGeneratedSerialDescriptor.j("term", true);
        pluginGeneratedSerialDescriptor.j("transferConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        KSerializer kSerializerC3 = nlm.a.c(j.f244192a);
        t0 t0Var = t0.f247706a;
        KSerializer kSerializerC4 = nlm.a.c(t0Var);
        KSerializer kSerializerC5 = nlm.a.c(t0Var);
        a.C1001a c1001a = a.C1001a.f176860a;
        return new KSerializer[]{v1Var, kSerializerC, kSerializerC2, v1Var, v1Var, kSerializerC3, v1Var, t0Var, kSerializerC4, kSerializerC5, c1001a, v1Var, v1Var, nlm.a.c(v1Var), z.f244226a, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(c1001a), nlm.a.c(m.f244198a), nlm.a.c(s.f244205a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        e0 e0Var = null;
        jo3.a aVar = null;
        String str7 = null;
        String str8 = null;
        r rVar = null;
        u uVar = null;
        l lVar = null;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String strDecodeStringElement3 = null;
        String strDecodeStringElement4 = null;
        String strDecodeStringElement5 = null;
        String strDecodeStringElement6 = null;
        long jDecodeLongElement = 0;
        int i2 = 0;
        boolean z = true;
        Long l3 = null;
        jo3.a aVar2 = null;
        while (z) {
            String str9 = str7;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    str = str8;
                    z = false;
                    str7 = str9;
                    str8 = str;
                    break;
                case 0:
                    str2 = str4;
                    str3 = str8;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                    str7 = str9;
                    str8 = str3;
                    str4 = str2;
                    break;
                case 1:
                    str2 = str4;
                    str3 = str8;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str9);
                    i2 |= 2;
                    str8 = str3;
                    str4 = str2;
                    break;
                case 2:
                    str2 = str4;
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str8);
                    i2 |= 4;
                    str7 = str9;
                    str4 = str2;
                    break;
                case 3:
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i2 |= 8;
                    str7 = str9;
                    break;
                case 4:
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i2 |= 16;
                    str7 = str9;
                    break;
                case 5:
                    str = str8;
                    lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, j.f244192a, lVar);
                    i2 |= 32;
                    str7 = str9;
                    str8 = str;
                    break;
                case 6:
                    strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 6);
                    i2 |= 64;
                    str7 = str9;
                    break;
                case 7:
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 7);
                    i2 |= 128;
                    str7 = str9;
                    break;
                case 8:
                    str = str8;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, t0.f247706a, l2);
                    i2 |= 256;
                    str7 = str9;
                    str8 = str;
                    break;
                case 9:
                    str = str8;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, t0.f247706a, l3);
                    i2 |= 512;
                    str7 = str9;
                    str8 = str;
                    break;
                case 10:
                    str = str8;
                    aVar2 = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, a.C1001a.f176860a, aVar2);
                    i2 |= 1024;
                    str7 = str9;
                    str8 = str;
                    break;
                case 11:
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                    i2 |= 2048;
                    str7 = str9;
                    break;
                case 12:
                    strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
                    i2 |= 4096;
                    str7 = str9;
                    break;
                case 13:
                    str = str8;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, v1.f247718a, str6);
                    i2 |= 8192;
                    str7 = str9;
                    str8 = str;
                    break;
                case 14:
                    str = str8;
                    e0Var = (e0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 14, z.f244226a, e0Var);
                    i2 |= 16384;
                    str7 = str9;
                    str8 = str;
                    break;
                case 15:
                    str = str8;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, v1.f247718a, str5);
                    i = 32768;
                    i2 |= i;
                    str7 = str9;
                    str8 = str;
                    break;
                case 16:
                    str = str8;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, v1.f247718a, str4);
                    i = 65536;
                    i2 |= i;
                    str7 = str9;
                    str8 = str;
                    break;
                case 17:
                    str = str8;
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, a.C1001a.f176860a, aVar);
                    i = 131072;
                    i2 |= i;
                    str7 = str9;
                    str8 = str;
                    break;
                case 18:
                    str = str8;
                    rVar = (r) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, m.f244198a, rVar);
                    i = 262144;
                    i2 |= i;
                    str7 = str9;
                    str8 = str;
                    break;
                case 19:
                    str = str8;
                    uVar = (u) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, s.f244205a, uVar);
                    i = 524288;
                    i2 |= i;
                    str7 = str9;
                    str8 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        String str10 = str8;
        dVarBeginStructure.endStructure(serialDescriptor);
        return new v(i2, strDecodeStringElement, str7, str10, strDecodeStringElement2, strDecodeStringElement3, lVar, strDecodeStringElement6, jDecodeLongElement, l2, l3, aVar2, strDecodeStringElement4, strDecodeStringElement5, str6, e0Var, str5, str4, aVar, rVar, uVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        v value = (v) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f244208a;
        u uVar = value.f244221t;
        r rVar = value.f244220s;
        jo3.a aVar = value.f244219r;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f244209b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f244210c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, j.f244192a, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.f244211g);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, value.f244212h);
        t0 t0Var = t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, t0Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, t0Var, value.f244213j);
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, c1001a, value.k);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.f244214l);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.f244215m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, v1Var, value.f244216n);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 14, z.f244226a, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, v1Var, value.f244217p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, v1Var, value.f244218q);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || aVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, c1001a, aVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || rVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, m.f244198a, rVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || uVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, s.f244205a, uVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
