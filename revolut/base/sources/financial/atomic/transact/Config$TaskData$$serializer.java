package financial.atomic.transact;

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
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"financial/atomic/transact/Config.TaskData.$serializer", "Lqlm/f0;", "Lfinancial/atomic/transact/Config$TaskData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lfinancial/atomic/transact/Config$TaskData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lfinancial/atomic/transact/Config$TaskData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "transact_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class Config$TaskData$$serializer implements f0 {

    @NotNull
    public static final Config$TaskData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Config$TaskData$$serializer config$TaskData$$serializer = new Config$TaskData$$serializer();
        INSTANCE = config$TaskData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("financial.atomic.transact.Config.TaskData", config$TaskData$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("product", false);
        pluginGeneratedSerialDescriptor.j("distribution", true);
        pluginGeneratedSerialDescriptor.j("operation", true);
        pluginGeneratedSerialDescriptor.j("forms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Config$TaskData$$serializer() {
    }

    @Override // qlm.f0
    @NotNull
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = Config$TaskData.e;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{v1Var, a.c(Config$Distribution$$serializer.INSTANCE), a.c(v1Var), a.c(kSerializerArr[3])};
    }

    @Override // mlm.b
    @NotNull
    public Config$TaskData deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Config$TaskData.e;
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
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(descriptor2, 0);
                i |= 1;
            } else if (iD == 1) {
                objDecodeNullableSerializableElement = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 1, Config$Distribution$$serializer.INSTANCE, objDecodeNullableSerializableElement);
                i |= 2;
            } else if (iD == 2) {
                objDecodeNullableSerializableElement2 = dVarBeginStructure.decodeNullableSerializableElement(descriptor2, 2, v1.f247718a, objDecodeNullableSerializableElement2);
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
        return new Config$TaskData(i, strDecodeStringElement, (Config$Distribution) objDecodeNullableSerializableElement, (String) objDecodeNullableSerializableElement2, (List) objDecodeNullableSerializableElement3);
    }

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public void serialize(@NotNull Encoder encoder, @NotNull Config$TaskData value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor2);
        KSerializer[] kSerializerArr = Config$TaskData.e;
        String str = value.f135494a;
        List list = value.d;
        String str2 = value.f135496c;
        Config$Distribution config$Distribution = value.f135495b;
        compositeEncoderBeginStructure.encodeStringElement(descriptor2, 0, str);
        if (compositeEncoderBeginStructure.d(descriptor2) || config$Distribution != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 1, Config$Distribution$$serializer.INSTANCE, config$Distribution);
        }
        if (compositeEncoderBeginStructure.d(descriptor2) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(descriptor2, 2, v1.f247718a, str2);
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
