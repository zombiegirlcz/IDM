package usj;

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

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c0 implements qlm.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f282939a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c0 c0Var = new c0();
        f282939a = c0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.impl.custom_assets.network.UpdateHistoricValueRequestDto", c0Var, 2);
        pluginGeneratedSerialDescriptor.j("date", false);
        pluginGeneratedSerialDescriptor.j("value", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private c0() {
    }

    @Override // qlm.f0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ie0.m.f160609a, nlm.a.c(v.f282974a)};
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
        x xVar = null;
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
                xVar = (x) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v.f282974a, xVar);
                i |= 2;
            }
        }
        dVarBeginStructure.endStructure(serialDescriptor);
        return new e0(i, localDate, xVar);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        e0 value = (e0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.m.f160609a, value.f282941a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v.f282974a, value.f282942b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
