package ysj;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f316467a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f316467a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.income_sorter.database.entity.IncomeSorterDestinationEntity", aVar, 10);
        pluginGeneratedSerialDescriptor.j("amount", false);
        pluginGeneratedSerialDescriptor.j("pocketId", false);
        pluginGeneratedSerialDescriptor.j("moneyBoxId", false);
        pluginGeneratedSerialDescriptor.j("portfolioId", false);
        pluginGeneratedSerialDescriptor.j("targetCurrency", false);
        pluginGeneratedSerialDescriptor.j("beneficiaryId", false);
        pluginGeneratedSerialDescriptor.j("code", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("chargeBearer", true);
        pluginGeneratedSerialDescriptor.j("reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{l.f316491a, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(r.f316498a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        t tVar = null;
        n nVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z = false;
                    break;
                case 0:
                    nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, l.f316491a, nVar);
                    i |= 1;
                    break;
                case 1:
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, v1.f247718a, str6);
                    i |= 64;
                    break;
                case 7:
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str7);
                    i |= 128;
                    break;
                case 8:
                    str8 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str8);
                    i |= 256;
                    break;
                case 9:
                    tVar = (t) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, r.f316498a, tVar);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, nVar, str, str2, str3, str4, str5, str6, str7, str8, tVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c value = (c) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        l lVar = l.f316491a;
        n nVar = value.f316468a;
        t tVar = value.f316473j;
        String str = value.i;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, lVar, nVar);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f316469b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f316470c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, v1Var, value.f316471g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f316472h);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, str);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || tVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, r.f316498a, tVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
