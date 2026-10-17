package iyd;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f169652a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        f169652a = b0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.statements.impl.documents_hub.entity.DocumentTaxPeriodEntity", b0Var, 2);
        pluginGeneratedSerialDescriptor.j("from", false);
        pluginGeneratedSerialDescriptor.j("to", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private b0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        ie0.m mVar = ie0.m.f160609a;
        return new KSerializer[]{mVar, mVar};
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
        dVarBeginStructure.getClass();
        LocalDate localDate = null;
        boolean z = true;
        int i = 0;
        LocalDate localDate2 = null;
        while (z) {
            int iD = dVarBeginStructure.d(serialDescriptor);
            if (iD == -1) {
                z = false;
            } else if (iD == 0) {
                localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.m.f160609a, localDate);
                i |= 1;
            } else {
                if (iD != 1) {
                    throw new UnknownFieldException(iD);
                }
                localDate2 = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.m.f160609a, localDate2);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new d0(i, localDate, localDate2);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        d0 value = (d0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ie0.m mVar = ie0.m.f160609a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, mVar, value.f169657a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, mVar, value.f169658b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
