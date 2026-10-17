package financial.atomic.transact;

import dam.g;
import java.util.List;
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
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"financial/atomic/transact/Config.Task.$serializer", "Lqlm/f0;", "Lfinancial/atomic/transact/Config$Task;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$Task;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$Task;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class Config$Task$$serializer implements f0 {

    @NotNull
    public static final Config$Task$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$Task$$serializer config$Task$$serializer = new Config$Task$$serializer();
        INSTANCE = config$Task$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.Task", config$Task$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("distribution", true);
        pluginGeneratedSerialDescriptor.j("operation", true);
        pluginGeneratedSerialDescriptor.j("forms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$Task$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = Config$Task.e;
        return new KSerializer[]{kSerializerArr[0], a.c(Config$Distribution$$serializer.INSTANCE), a.c(kSerializerArr[2]), a.c(kSerializerArr[3])};
    }

    @Override // mlm.b
    @NotNull
    public Config$Task deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Config$Task.e;
        dVarBeginStructure.getClass();
        Object objDecodeSerializableElement = null;
        boolean z = true;
        int i = 0;
        Object objDecodeNullableSerializableElement = null;
        Object objDecodeNullableSerializableElement2 = null;
        Object objDecodeNullableSerializableElement3 = null;
        while (z) {
            int iD = dVarBeginStructure.d(descriptor2);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(descriptor2, 0, kSerializerArr[0], objDecodeSerializableElement);
                i |= 1;
            } else if (iD == 1) {
                objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, Config$Distribution$$serializer.INSTANCE, objDecodeNullableSerializableElement);
                i |= 2;
            } else if (iD == 2) {
                objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], objDecodeNullableSerializableElement2);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                objDecodeNullableSerializableElement3 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], objDecodeNullableSerializableElement3);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(descriptor2);
        return new Config$Task(i, (g) objDecodeSerializableElement, (Config$Distribution) objDecodeNullableSerializableElement, (g) objDecodeNullableSerializableElement2, (List) objDecodeNullableSerializableElement3);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull Config$Task value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Config$Task.e;
        KSerializer kSerializer = kSerializerArr[0];
        g gVar = value.f135491a;
        List list = value.d;
        g gVar2 = value.f135493c;
        Config$Distribution config$Distribution = value.f135492b;
        compositeEncoderBeginStructure.encodeSerializableElement(descriptor2, 0, kSerializer, gVar);
        if (compositeEncoderBeginStructure.d(descriptor2) || config$Distribution != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 1, Config$Distribution$$serializer.INSTANCE, config$Distribution);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || gVar2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 2, kSerializerArr[2], gVar2);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 3, kSerializerArr[3], list);
        }
        compositeEncoderBeginStructure.endStructure(descriptor2);
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] typeParametersSerializers() {
        return j1.f247666a;
    }
}
