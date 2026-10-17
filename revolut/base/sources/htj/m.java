package htj;

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
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class m implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f155430a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        f155430a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.income_sorter.network.dto.IncomeSorterExecutionDestinationDto", mVar, 3);
        pluginGeneratedSerialDescriptor.j("destination", false);
        pluginGeneratedSerialDescriptor.j("transactions", false);
        pluginGeneratedSerialDescriptor.j("state", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d.f155402a, o.d[1].getValue(), v1.f247718a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = o.d;
        dVarBeginStructure.getClass();
        f fVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String strDecodeStringElement = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                fVar = (f) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, d.f155402a, fVar);
                i |= 1;
            } else if (iD == 1) {
                list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new o(i, fVar, list, strDecodeStringElement);
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
        Lazy[] lazyArr = o.d;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, d.f155402a, value.f155431a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f155432b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f155433c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
