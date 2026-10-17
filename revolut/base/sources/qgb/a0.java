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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f245725a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        f245725a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.data.dto.SalaryHubV3ResponseDto.OptInDto", a0Var, 3);
        pluginGeneratedSerialDescriptor.j("optInAvailable", false);
        pluginGeneratedSerialDescriptor.j("optInDeadline", true);
        pluginGeneratedSerialDescriptor.j("disclaimer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private a0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qlm.h.f247648a, nlm.a.c(ie0.j.f160602a), nlm.a.c(r.f245764a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        Instant instant = null;
        boolean z = true;
        int i = 0;
        boolean zDecodeBooleanElement = false;
        t tVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                tVar = (t) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, r.f245764a, tVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new c0(i, zDecodeBooleanElement, instant, tVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        c0 value = (c0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        boolean z = value.f245727a;
        t tVar = value.f245729c;
        Instant instant = value.f245728b;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
        }
        if (compositeEncoderBeginStructure.d(serialDescriptor) || tVar != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, r.f245764a, tVar);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
