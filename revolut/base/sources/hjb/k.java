package hjb;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f152687a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        f152687a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("instant_access_savings", kVar, 5);
        pluginGeneratedSerialDescriptor.j("dailyPayment", false);
        pluginGeneratedSerialDescriptor.j("primaryRateInfo", false);
        pluginGeneratedSerialDescriptor.j("secondaryRateInfo", true);
        pluginGeneratedSerialDescriptor.j("kind", true);
        pluginGeneratedSerialDescriptor.j("countryCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private k() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        u uVar = u.f152697a;
        KSerializer kSerializerC = nlm.a.c(uVar);
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{qlm.h.f247648a, uVar, kSerializerC, nlm.a.c(v1Var), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        w wVar = null;
        w wVar2 = null;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                wVar = (w) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, u.f152697a, wVar);
                i |= 2;
            } else if (iD == 2) {
                wVar2 = (w) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, u.f152697a, wVar2);
                i |= 4;
            } else if (iD == 3) {
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str2);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new m(i, zDecodeBooleanElement, wVar, wVar2, str, str2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        m value = (m) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.f152688a;
        String str = value.e;
        String str2 = value.d;
        w wVar = value.f152690c;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        u uVar = u.f152697a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, uVar, value.f152689b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || wVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, uVar, wVar);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
