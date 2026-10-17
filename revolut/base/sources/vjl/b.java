package vjl;

import java.util.List;
import kotlin.Lazy;
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

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f289803a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        f289803a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.sso.impl.data.db.models.ConsentedClientEntity.Consent", bVar, 5);
        pluginGeneratedSerialDescriptor.j("display", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("displayName", false);
        pluginGeneratedSerialDescriptor.j("claims", false);
        pluginGeneratedSerialDescriptor.j("description", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = h.f;
        v1 v1Var = v1.f247718a;
        return new KSerializer[]{qlm.h.f247648a, v1Var, v1Var, lazyArr[3].getValue(), nlm.a.c(v1Var)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = h.f;
        dVarBeginStructure.getClass();
        int i = 0;
        boolean zDecodeBooleanElement = false;
        String strDecodeStringElement = null;
        String strDecodeStringElement2 = null;
        String str = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else if (iD == 2) {
                strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            } else if (iD == 3) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                i |= 8;
            } else {
                if (iD != 4) {
                    throw new UnknownFieldException(iD);
                }
                str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, str);
                i |= 16;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new h(i, strDecodeStringElement, strDecodeStringElement2, str, list, zDecodeBooleanElement);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        h value = (h) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = h.f;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, value.f289808a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f289809b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f289810c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, v1.f247718a, value.e);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
