package okc;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f225982a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f225982a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rfi_tool.impl.data.dto.ScreenConfigurationDto", pVar, 3);
        pluginGeneratedSerialDescriptor.j("contents", false);
        pluginGeneratedSerialDescriptor.j("requestFeedback", false);
        pluginGeneratedSerialDescriptor.j("endDialog", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private p() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r.d[0].getValue(), nlm.a.c(qlm.h.f247648a), nlm.a.c(j.f225974a)};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = r.d;
        dVarBeginStructure.getClass();
        List list = null;
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        l lVar = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                i |= 1;
            } else if (iD == 1) {
                bool = (Boolean) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, bool);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                lVar = (l) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, j.f225974a, lVar);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new r(i, list, bool, lVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        r value = (r) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) r.d[0].getValue(), value.f225983a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.h.f247648a, value.f225984b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, j.f225974a, value.f225985c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
