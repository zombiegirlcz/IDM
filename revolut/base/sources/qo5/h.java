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
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f248037a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h hVar = new h();
        f248037a = hVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.crypto.withdraw.impl.database.CryptoAddressRecipientDetailsEmbeddedEntity", hVar, 5);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("surname", false);
        pluginGeneratedSerialDescriptor.j("address", false);
        pluginGeneratedSerialDescriptor.j("businessRegistrationNumber", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private h() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{nlm.a.c(v1Var), v1Var, nlm.a.c(v1Var), nlm.a.c(k.f248041a), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        String str = null;
        String strDecodeStringElement = null;
        String str2 = null;
        m mVar = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
                i |= 4;
            } else if (iD == 3) {
                mVar = (m) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, k.f248041a, mVar);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str3);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new j(i, str, strDecodeStringElement, str2, mVar, str3);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        j value = (j) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        v1 v1Var = v1.f247718a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1Var, value.f248038a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f248039b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1Var, value.f248040c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, k.f248041a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1Var, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
