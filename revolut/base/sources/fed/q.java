package fed;

import java.math.BigDecimal;
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

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f134565a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        q qVar = new q();
        f134565a = qVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.shared.wealth.data.corporate_events.RestructuringDetailDto", qVar, 3);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("asset", false);
        pluginGeneratedSerialDescriptor.j("amount", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private q() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{s.d[0].getValue(), v1.f247718a, ie0.a.f160587a};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = s.d;
        dVarBeginStructure.getClass();
        iel.u uVar = null;
        boolean z = true;
        int i = 0;
        String strDecodeStringElement = null;
        BigDecimal bigDecimal = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                uVar = (iel.u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), uVar);
                i |= 1;
            } else if (iD == 1) {
                strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iD != 2) {
                    throw new UnknownFieldException(iD);
                }
                bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal);
                i |= 4;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new s(i, uVar, strDecodeStringElement, bigDecimal);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        s value = (s) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) s.d[0].getValue(), value.f134566a);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f134567b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, value.f134568c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
