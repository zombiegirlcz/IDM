package qgb;

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
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f245730a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d0 d0Var = new d0();
        f245730a = d0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.data.dto.SalaryHubV3ResponseDto.RewardDto", d0Var, 9);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        pluginGeneratedSerialDescriptor.j("deeplink", true);
        pluginGeneratedSerialDescriptor.j("salaryPaymentsToUnlock", true);
        pluginGeneratedSerialDescriptor.j("availableFrom", true);
        pluginGeneratedSerialDescriptor.j("claimDeadline", true);
        pluginGeneratedSerialDescriptor.j("expiresAt", true);
        pluginGeneratedSerialDescriptor.j("activeUntil", true);
        pluginGeneratedSerialDescriptor.j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private d0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        KSerializer kSerializerC = nlm.a.c(v1Var);
        KSerializer kSerializerC2 = nlm.a.c(n0.f247680a);
        ie0.j jVar = ie0.j.f160602a;
        return new KSerializer[]{v1Var, v1Var, kSerializerC, kSerializerC2, nlm.a.c(jVar), nlm.a.c(jVar), nlm.a.c(jVar), nlm.a.c(jVar), nlm.a.c(x.f245772a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        Integer num = null;
        Instant instant = null;
        Instant instant2 = null;
        Instant instant3 = null;
        Instant instant4 = null;
        z zVar = null;
        int i = 0;
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
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, n0.f247680a, num);
                    i |= 8;
                    break;
                case 4:
                    instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant);
                    i |= 16;
                    break;
                case 5:
                    instant2 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ie0.j.f160602a, instant2);
                    i |= 32;
                    break;
                case 6:
                    instant3 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, ie0.j.f160602a, instant3);
                    i |= 64;
                    break;
                case 7:
                    instant4 = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant4);
                    i |= 128;
                    break;
                case 8:
                    zVar = (z) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, x.f245772a, zVar);
                    i |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iD);
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new f0(i, strDecodeStringElement, strDecodeStringElement2, str, num, instant, instant2, instant3, instant4, zVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        f0 value = (f0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f245733a;
        z zVar = value.i;
        Instant instant = value.f245737h;
        Instant instant2 = value.f245736g;
        Instant instant3 = value.f;
        Instant instant4 = value.e;
        Integer num = value.d;
        String str2 = value.f245735c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f245734b);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || num != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, n0.f247680a, num);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, ie0.j.f160602a, instant4);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, ie0.j.f160602a, instant3);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, ie0.j.f160602a, instant2);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, ie0.j.f160602a, instant);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || zVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, x.f245772a, zVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
