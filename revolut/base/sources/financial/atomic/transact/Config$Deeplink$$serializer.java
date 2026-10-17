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
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"financial/atomic/transact/Config.Deeplink.$serializer", "Lqlm/f0;", "Lfinancial/atomic/transact/Config$Deeplink;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$Deeplink;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$Deeplink;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class Config$Deeplink$$serializer implements f0 {

    @NotNull
    public static final Config$Deeplink$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$Deeplink$$serializer config$Deeplink$$serializer = new Config$Deeplink$$serializer();
        INSTANCE = config$Deeplink$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.Deeplink", config$Deeplink$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("companyId", true);
        pluginGeneratedSerialDescriptor.j("connectorId", true);
        pluginGeneratedSerialDescriptor.j("companyName", true);
        pluginGeneratedSerialDescriptor.j("step", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$Deeplink$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{a.c(v1Var), a.c(v1Var), a.c(v1Var), v1Var};
    }

    @Override // mlm.b
    @NotNull
    public Config$Deeplink deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        dVarBeginStructure.getClass();
        Object objDecodeNullableSerializableElement = null;
        boolean z = true;
        int i = 0;
        Object objDecodeNullableSerializableElement2 = null;
        Object objDecodeNullableSerializableElement3 = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 0, v1.f247718a, objDecodeNullableSerializableElement);
                i |= 1;
            } else if (iD == 1) {
                objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, v1.f247718a, objDecodeNullableSerializableElement2);
                i |= 2;
            } else if (iD == 2) {
                objDecodeNullableSerializableElement3 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, v1.f247718a, objDecodeNullableSerializableElement3);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new Config$Deeplink(i, (String) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, (String) objDecodeNullableSerializableElement3, strDecodeStringElement);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull Config$Deeplink value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        if (compositeEncoderBeginStructure.d(descriptor2) || value.f135477b != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 0, v1.f247718a, value.f135477b);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || value.f135478c != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 1, v1.f247718a, value.f135478c);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || value.d != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 2, v1.f247718a, value.d);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || !Intrinsics.f(value.e, dam.a.EMPTY.f112551a)) {
            compositeEncoderBeginStructure.encodeStringElement(descriptor2, 3, value.e);
        }
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
