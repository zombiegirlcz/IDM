package qgb;

import java.time.Instant;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f245772a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        x xVar = new x();
        f245772a = xVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.data.dto.SalaryHubV3ResponseDto.MetadataDto", xVar, 2);
        pluginGeneratedSerialDescriptor.j("prizeAmount", false);
        pluginGeneratedSerialDescriptor.j("nextDrawStartsAt", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private x() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{a.C1001a.f176860a, nlm.a.c(ie0.j.f160602a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        jo3.a aVar = null;
        boolean z = true;
        int i = 0;
        Instant instant = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                instant = (Instant) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new z(i, aVar, instant);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        z value = (z) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        a.C1001a c1001a = a.C1001a.f176860a;
        jo3.a aVar = value.f245773a;
        Instant instant = value.f245774b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, c1001a, aVar);
        if (compositeEncoderBeginStructure.d(serialDescriptor) || instant != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, ie0.j.f160602a, instant);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
