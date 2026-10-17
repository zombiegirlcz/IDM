package financial.atomic.transact;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import nlm.a;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.h;
import qlm.j1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"financial/atomic/transact/Config.Experiments.$serializer", "Lqlm/f0;", "Lfinancial/atomic/transact/Config$Experiments;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$Experiments;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$Experiments;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class Config$Experiments$$serializer implements f0 {

    @NotNull
    public static final Config$Experiments$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$Experiments$$serializer config$Experiments$$serializer = new Config$Experiments$$serializer();
        INSTANCE = config$Experiments$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.Experiments", config$Experiments$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("fractionalDeposits", true);
        pluginGeneratedSerialDescriptor.j("unemploymentCarousel", true);
        pluginGeneratedSerialDescriptor.j("manualFallback", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$Experiments$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        h hVar = h.f247648a;
        return new KSerializer[]{a.c(hVar), a.c(hVar), a.c(hVar)};
    }

    @Override // mlm.b
    @NotNull
    public Config$Experiments deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        Object objDecodeNullableSerializableElement = null;
        boolean z = true;
        int i = 0;
        Object objDecodeNullableSerializableElement2 = null;
        Object objDecodeNullableSerializableElement3 = null;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, h.f247648a, objDecodeNullableSerializableElement);
                i |= 1;
            } else if (iD == 1) {
                objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, h.f247648a, objDecodeNullableSerializableElement2);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                objDecodeNullableSerializableElement3 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, h.f247648a, objDecodeNullableSerializableElement3);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new Config$Experiments(i, (Boolean) objDecodeNullableSerializableElement, (Boolean) objDecodeNullableSerializableElement2, (Boolean) objDecodeNullableSerializableElement3);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull Config$Experiments value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        if (compositeEncoderBeginStructure.d(descriptor2) || value.f135482a != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 0, h.f247648a, value.f135482a);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || value.f135483b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 1, h.f247648a, value.f135483b);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || value.f135484c != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 2, h.f247648a, value.f135484c);
        }
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
