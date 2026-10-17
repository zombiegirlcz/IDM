package nif;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d2 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d2 f215755a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d2 d2Var = new d2();
        f215755a = d2Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.impl.data.new_arch.database.entity.RelatedTransactionCacheEntity", d2Var, 13);
        pluginGeneratedSerialDescriptor.j("groupId", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("amountWithFee", false);
        pluginGeneratedSerialDescriptor.j("amountWithCharges", false);
        pluginGeneratedSerialDescriptor.j("currency", false);
        pluginGeneratedSerialDescriptor.j("pocketId", false);
        pluginGeneratedSerialDescriptor.j("vaultId", false);
        pluginGeneratedSerialDescriptor.j("cashbackPocketId", false);
        pluginGeneratedSerialDescriptor.j("autoInvestTargetPocketId", false);
        pluginGeneratedSerialDescriptor.j("autoInvestTargetType", false);
        pluginGeneratedSerialDescriptor.j("autoInvestStrategy", false);
        pluginGeneratedSerialDescriptor.j("calculatedBalance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d2() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        qlm.v1 v1Var = qlm.v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(v1Var);
        qlm.t0 t0Var = qlm.t0.f247706a;
        return new KSerializer[]{kSerializerC, kSerializerC2, nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(t0Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        String str;
        Long l2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String str2 = null;
        Long l3 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Long l4 = null;
        Long l5 = null;
        Long l22 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            String str11 = str5;
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    l2 = l3;
                    str5 = str11;
                    z = false;
                    i = i;
                    l3 = l2;
                    break;
                case 0:
                    l2 = l3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str11);
                    i |= 1;
                    l3 = l2;
                    break;
                case 1:
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str6);
                    i |= 2;
                    str5 = str11;
                    break;
                case 2:
                    str = str6;
                    l4 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l4);
                    i |= 4;
                    str5 = str11;
                    str6 = str;
                    break;
                case 3:
                    str = str6;
                    l5 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l5);
                    i |= 8;
                    str5 = str11;
                    str6 = str;
                    break;
                case 4:
                    str = str6;
                    l22 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.t0.f247706a, l22);
                    i |= 16;
                    str5 = str11;
                    str6 = str;
                    break;
                case 5:
                    str = str6;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.v1.f247718a, str7);
                    i |= 32;
                    str5 = str11;
                    str6 = str;
                    break;
                case 6:
                    str = str6;
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, qlm.v1.f247718a, str8);
                    i |= 64;
                    str5 = str11;
                    str6 = str;
                    break;
                case 7:
                    str = str6;
                    str9 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, qlm.v1.f247718a, str9);
                    i |= 128;
                    str5 = str11;
                    str6 = str;
                    break;
                case 8:
                    str = str6;
                    str10 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, qlm.v1.f247718a, str10);
                    i |= 256;
                    str5 = str11;
                    str6 = str;
                    break;
                case 9:
                    str = str6;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, qlm.v1.f247718a, str2);
                    i |= 512;
                    str5 = str11;
                    str6 = str;
                    break;
                case 10:
                    str = str6;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, qlm.v1.f247718a, str3);
                    i |= 1024;
                    str5 = str11;
                    str6 = str;
                    break;
                case 11:
                    str = str6;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, qlm.v1.f247718a, str4);
                    i |= 2048;
                    str5 = str11;
                    str6 = str;
                    break;
                case 12:
                    str = str6;
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, qlm.t0.f247706a, l3);
                    i |= 4096;
                    str5 = str11;
                    str6 = str;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f2(i, str5, str6, l4, l5, l22, str7, str8, str9, str10, str2, str3, str4, l3);
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
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f215790a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f215791b);
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, value.f215792c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f215793g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f215794h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, v1Var, value.f215795j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, v1Var, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, v1Var, value.f215796l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, t0Var, value.f215797m);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
