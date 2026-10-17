package qo5;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f248019a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f248019a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.database.CryptoAddressCounterpartyEntity", aVar, 11);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("hostingType", false);
        pluginGeneratedSerialDescriptor.j("hostingVerification", false);
        pluginGeneratedSerialDescriptor.j("hostingPlatform", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.j("ownershipState", false);
        pluginGeneratedSerialDescriptor.j("ownershipMethod", false);
        pluginGeneratedSerialDescriptor.j("ownershipPayload", false);
        pluginGeneratedSerialDescriptor.j("updatedDate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(h.f248037a), nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(e.f248035a), nlm.a.c(t0.f247706a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        g gVar = null;
        Long l2 = null;
        String strDecodeStringElement = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        j jVar = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z3 = true;
        while (z3) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            switch (iD) {
                case -1:
                    z3 = false;
                    continue;
                case 0:
                    z = z3;
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z = z3;
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                    break;
                case 2:
                    z = z3;
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                    i |= 4;
                    break;
                case 3:
                    z = z3;
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str3);
                    i |= 8;
                    break;
                case 4:
                    z = z3;
                    str4 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str4);
                    i |= 16;
                    break;
                case 5:
                    z = z3;
                    str5 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, v1.f247718a, str5);
                    i |= 32;
                    break;
                case 6:
                    z = z3;
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, h.f248037a, jVar);
                    i |= 64;
                    break;
                case 7:
                    z = z3;
                    str6 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, v1.f247718a, str6);
                    i |= 128;
                    break;
                case 8:
                    z = z3;
                    str7 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, v1.f247718a, str7);
                    i |= 256;
                    break;
                case 9:
                    z = z3;
                    gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, e.f248035a, gVar);
                    i |= 512;
                    break;
                case 10:
                    z = z3;
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, l2);
                    i |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
            z3 = z;
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c(i, strDecodeStringElement, str, str2, str3, str4, str5, jVar, str6, str7, gVar, l2);
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
        String str = value.f248020a;
        Long l2 = value.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, value.f248021b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f248022c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, v1Var, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, h.f248037a, value.f248023g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, v1Var, value.f248024h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, v1Var, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, e.f248035a, value.f248025j);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || l2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, t0.f247706a, l2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
