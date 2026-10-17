package j29;

import java.util.List;
import jo3.a;
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

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f170760a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f170760a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.lifestyle.core.impl.data.model.dto.savings.LifestyleSavingsDetailsDto", mVar, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("totalSaved", false);
        pluginGeneratedSerialDescriptor.j("usedProducts", false);
        pluginGeneratedSerialDescriptor.j("unusedProducts", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = o.e;
        return new KSerializer[]{v1.f247718a, a.C1001a.f176860a, lazyArr[2].getValue(), lazyArr[3].getValue()};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.e;
        dVarBeginStructure.getClass();
        int i = 0;
        String strDecodeStringElement = null;
        jo3.a aVar = null;
        List list = null;
        List list2 = null;
        boolean z = true;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                i |= 1;
            } else if (iD == 1) {
                aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                i |= 2;
            } else if (iD == 2) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                i |= 4;
            } else {
                if (iD != 3) {
                    throw new UnknownFieldException(iD);
                }
                list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list2);
                i |= 8;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, strDecodeStringElement, aVar, list, list2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        o value = (o) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.e;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f170761a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, value.f170762b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f170763c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
